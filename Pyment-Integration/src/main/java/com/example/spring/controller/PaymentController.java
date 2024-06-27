package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring.model.Payment;
import com.example.spring.repo.PaymentRepository;

@Controller
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/payment")
    public String paymentForm(Model model) {
        model.addAttribute("payment", new Payment());
        return "payment";
    }

    @PostMapping("/payment")
    public String paymentSubmit(@ModelAttribute Payment payment) {
        paymentRepository.save(payment);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String successPage() {
        return "success";
    }
}