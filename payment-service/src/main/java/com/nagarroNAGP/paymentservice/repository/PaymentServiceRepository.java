package com.nagarroNAGP.paymentservice.repository;

import com.nagarroNAGP.paymentservice.entity.PaymentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentServiceRepository extends JpaRepository<PaymentService, Long> {
    PaymentService findByPaymentServiceId(Long paymentServiceId);
}
