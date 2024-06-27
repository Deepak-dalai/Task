package com.example.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}