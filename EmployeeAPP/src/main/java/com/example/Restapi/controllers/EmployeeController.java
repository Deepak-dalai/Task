package com.example.Restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Restapi.models.Employee;
import com.example.Restapi.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addemployee")
	public Employee postDetails(@RequestBody Employee employee)
	{
		return employeeService.saveDetails(employee);
	}
	
	@GetMapping("/getById/{id}")
	public Employee fetchDetailsById(@PathVariable int id)
	{
		return employeeService.getEmployeeDetailsById(id);
	}
	
	@GetMapping("/getemployee")
	public List<Employee> getDetails()
	{
		return employeeService.getAllDetails();
	}
	
	@DeleteMapping("/deleteemployeeId/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		return employeeService.getDeleteById(id);
	}


}
