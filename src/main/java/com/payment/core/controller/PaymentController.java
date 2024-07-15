package com.payment.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.core.IPaymentRepository;
import com.spring.entity.Payment;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
	@Autowired
	private IPaymentRepository paymentRepository;
	

	@GetMapping("/message")
	public String message() {
		return "Hello World!";
	}
	
	@PostMapping("/save")
	@Transactional
	public String save(@RequestBody Payment payment) {
		paymentRepository.save(payment);
		return "Hello World!";
	}

}
