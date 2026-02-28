package aom.controller;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ukrishna.controller.EmployeeController;
import org.ukrishna.model.Employee;
import org.ukrishna.repository.EmployeeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {
	
	public EmployeeRepository repo;
	
	@Test
	public void whenEmptyResp_thenAccept_getAll() {
		EmployeeController obj = new EmployeeController();
		List<Employee> resp = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setEmpNo(0);
		emp.setName("");
		emp.setJob("");
		resp.add(emp);
		Assert.assertNotNull(emp.getEmpNo());
		Assert.assertNotNull(emp.getName());
		Assert.assertNotNull(emp.getJob());
		Assert.assertNotNull(resp);

	}

}
