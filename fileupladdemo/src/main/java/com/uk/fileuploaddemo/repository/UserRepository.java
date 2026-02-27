package com.uk.fileuploaddemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uk.fileuploaddemo.model.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// Custom logic to check for existing users by email to avoid duplicates
    Optional<User> findByEmail(String email);
    
    // Check if an ID already exists before attempting batch insert
    boolean existsById(Long id);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO users (id, name, email) VALUES (:id, :name, :email) " +
                   "ON DUPLICATE KEY UPDATE name = :name, email = :email", nativeQuery = true)
    void upsertUser(@Param("id") Long id, @Param("name") String name, @Param("email") String email);

}
