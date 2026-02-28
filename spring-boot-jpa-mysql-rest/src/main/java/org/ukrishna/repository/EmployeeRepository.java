package org.ukrishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ukrishna.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
