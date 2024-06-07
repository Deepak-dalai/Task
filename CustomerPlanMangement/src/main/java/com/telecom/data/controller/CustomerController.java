package com.telecom.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.telecom.data.entity.Customer;
import com.telecom.data.services.CustomerService;

@RestController
public class CustomerController {

@Autowired
private CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public Customer postDetails(@RequestBody Customer customer)
	{
		return customerService.saveDetails(customer);
	}
	
	@GetMapping("/getById/{id}")
	public Customer fetchDetailsById(@PathVariable int id)
	{
		return customerService.getCustomerDetailsById(id);
	}
	
	@GetMapping("/getCustomer")
	public List<Customer> getDetails()
	{
		return customerService.getAllDetails();
	}
	
	@DeleteMapping("/deletecustomerId/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		return customerService.getDeleteById(id);
	}
}