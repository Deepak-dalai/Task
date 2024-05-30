package com.example.Restapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Restapi.models.Employee;

public interface EmployeeRepos extends JpaRepository<Employee, Integer> {

}
