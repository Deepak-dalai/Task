package com.telecom.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.data.entity.Subscription;
import com.telecom.data.services.SubscriptionService;

@RestController
public class SubscriptionController {

	
	@Autowired
	private SubscriptionService subscriptionService;
		
		@PostMapping("/addsubscription")
		public Subscription postDetails(@RequestBody Subscription subscription)
		{
			return subscriptionService.saveDetails(subscription);
		}
		
		@GetMapping("/getsubscriptionId/{id}")
		public Subscription fetchDetailsById(@PathVariable int id)
		{
			return subscriptionService.getSubscriptionDetailsById(id);
		}
		
		@GetMapping("/getsubscription")
		public List<Subscription> getDetails()
		{
			return subscriptionService.getAllDetails();
		}
		
		@DeleteMapping("/deleteSubscriptionId/{id}")
		public String deleteDetails(@PathVariable int id)
		{
			return subscriptionService.getDeleteById(id);
		}
}