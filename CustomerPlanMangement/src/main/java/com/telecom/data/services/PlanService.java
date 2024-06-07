package com.telecom.data.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.data.entity.Plan;
import com.telecom.data.repository.PlanRepos;
@Service
public class PlanService {

@Autowired
private PlanRepos planRepos;
	
	public Plan saveDetails(Plan plan)
	{
		return planRepos.save(plan);
	}
	
	public Plan getPlanDetailsById(int id) 
	{
		return  planRepos.findById(id).orElse(null);
	}
	
	public String getDeleteById(int id) 
	{
	 planRepos.deleteById(id);
	 return "deleted Sucessfully=" + id;
	}
	
	public List<Plan> getAllDetails() 
	{
		return planRepos.findAll();
	}
}