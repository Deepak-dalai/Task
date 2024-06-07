package com.telecom.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.data.entity.Plan;

import com.telecom.data.services.PlanService;
@RestController
public class PlanController {
	
@Autowired
private PlanService planService;
	
	@PostMapping("/addplan")
	public Plan postDetails(@RequestBody Plan plan)
	{
		return planService.saveDetails(plan);
	}
	
	@GetMapping("/getplanId/{id}")
	public Plan fetchDetailsById(@PathVariable int id)
	{
		return planService.getPlanDetailsById(id);
	}
	
	@GetMapping("/getPlan")
	public List<Plan> getDetails()
	{
		return planService.getAllDetails();
	}
	
	@DeleteMapping("/deletePlanId/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		return planService.getDeleteById(id);
	}
}