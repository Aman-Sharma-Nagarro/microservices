package com.nagarroNAGP.paymentservice.service;

import com.nagarroNAGP.paymentservice.entity.PaymentService;
import com.nagarroNAGP.paymentservice.repository.PaymentServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceService {

    @Autowired
    private PaymentServiceRepository paymentServiceRepository;

    public PaymentService savePaymentService(PaymentService paymentService) {
        return paymentServiceRepository.save(paymentService);
    }

    public PaymentService findByPaymentServiceId(Long paymentServiceId) {
        return paymentServiceRepository.findByPaymentServiceId(paymentServiceId);
    }
}
