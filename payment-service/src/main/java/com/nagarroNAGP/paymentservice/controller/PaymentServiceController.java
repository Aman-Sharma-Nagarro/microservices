package com.nagarroNAGP.paymentservice.controller;

import com.nagarroNAGP.paymentservice.entity.PaymentService;
import com.nagarroNAGP.paymentservice.service.PaymentServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentServiceController {

    @Autowired
    private PaymentServiceService paymentServiceService;

    @PostMapping
    @RequestMapping("/")
    public PaymentService savePaymentService(@RequestBody PaymentService paymentService){
        return paymentServiceService.savePaymentService(paymentService);
    }

    @GetMapping
    @RequestMapping("/{id}")
    public PaymentService findByPaymentServiceId(@PathVariable("id") Long paymentServiceId){
        return paymentServiceService.findByPaymentServiceId(paymentServiceId);
    }
}
