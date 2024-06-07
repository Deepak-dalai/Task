package com.telecom.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecom.data.entity.Subscription;






public interface SubscriptionRepos extends JpaRepository<Subscription, Integer> {

}