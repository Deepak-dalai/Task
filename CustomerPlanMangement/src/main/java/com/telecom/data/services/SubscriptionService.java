package com.telecom.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.data.entity.Subscription;
import com.telecom.data.repository.SubscriptionRepos;

@Service
public class SubscriptionService {
 
@Autowired	
private SubscriptionRepos subscriptionRepos;
	
	public Subscription saveDetails(Subscription subscription)
	{
		return subscriptionRepos.save(subscription);
	}
	
	public Subscription getSubscriptionDetailsById(int id) 
	{
		return  subscriptionRepos.findById(id).orElse(null);
	}
	
	public String getDeleteById(int id) 
	{
	 subscriptionRepos.deleteById(id);
	 return "deleted Sucessfully=" + id;
	}
	
	public List<Subscription> getAllDetails() 
	{
		return subscriptionRepos.findAll();
	}
}