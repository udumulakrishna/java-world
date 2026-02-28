package org.ukrishna.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ukrishna.model.Employee;
import org.ukrishna.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;

	@GetMapping(value = "/all")
	public List<Employee> getAll() {
		return empRepo.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Employee> getOne(@PathVariable("id") Integer id) {
		return empRepo.findById(id);
	}

}
