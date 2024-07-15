package com.payment.core;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Payment;

public interface IPaymentRepository extends JpaRepository<Payment, Integer> {

}
