package com.telecom.data.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.data.entity.Customer;
import com.telecom.data.repository.CustomerRepos;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepos customerRepos;
	
	public Customer saveDetails(Customer customer)
	{
		return customerRepos.save(customer);
	}
	
	public Customer getCustomerDetailsById(int id) 
	{
		return  customerRepos.findById(id).orElse(null);
	}
	
	public String getDeleteById(int id) 
	{
	 customerRepos.deleteById(id);
	 return "deleted Sucessfully=" + id;
	}
	
	public List<Customer> getAllDetails() 
	{
		return customerRepos.findAll();
	}
}