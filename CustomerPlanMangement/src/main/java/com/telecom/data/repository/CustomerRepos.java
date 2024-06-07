package com.telecom.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecom.data.entity.Customer;







public interface CustomerRepos extends JpaRepository<Customer, Integer> {

}