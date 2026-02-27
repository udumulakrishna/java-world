package com.uk.fileupladdemo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.uk.fileupladdemo.model.User;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	private final JdbcTemplate jdbcTemplate;

    public UserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void batchInsert(MultipartFile file) {
    	System.out.println("UserService.batchInsert():: Entered... ");
    	List<User> users = null;
    	
		try {
			users = parseCsvFile(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        String sql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE name = VALUES(name), email = VALUES(email)";

        jdbcTemplate.batchUpdate(sql, users, 50, (ps, user) -> {
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getEmail());
        });
    }
    
    public List<User> parseCsvFile(MultipartFile file) throws Exception {
    	System.out.println("UserService.parseCsvFile():: Entered... ");
    	
        try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            
            // Use CsvToBeanBuilder to map CSV rows to User objects
            CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withIgnoreEmptyLine(true)
                    .build();

            return csvToBean.parse();
        } catch (Exception e) {
            throw new Exception("Error parsing CSV file: " + e.getMessage());
        }
    }
	
	
	
/*	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void processAndSaveUsers(MultipartFile file) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            
            // 1. Parse CSV into List
            CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<User> allUsers = csvToBean.parse();
            
            // 2. Business Validation (Example: Filter invalid emails)
            List<User> validUsers = allUsers.stream()
                    .filter(u -> u.getEmail() != null && u.getEmail().contains("@"))
                    .toList();

            // 3. Batch Insert
            // saveAll uses the batch_size defined in properties
            if (!validUsers.isEmpty()) {log.info("Successfully batched {} users", validUsers.size());
                userRepository.saveAll(validUsers);
                log.info("Successfully batched {} users", validUsers.size());
            }
        }
    } */

}
