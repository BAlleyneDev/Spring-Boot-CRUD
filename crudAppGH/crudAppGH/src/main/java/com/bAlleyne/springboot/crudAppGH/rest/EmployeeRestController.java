package com.bAlleyne.springboot.crudAppGH.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bAlleyne.springboot.crudAppGH.dao.EmployeeDAO;
import com.bAlleyne.springboot.crudAppGH.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
    //testing dao connection
	@Autowired
	private EmployeeDAO employeeDAO;
	
	//expose employees end
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
}
