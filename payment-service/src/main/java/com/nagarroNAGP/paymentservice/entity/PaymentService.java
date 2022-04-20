package com.nagarroNAGP.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PaymentService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentServiceId;

    private Long bookingId;
    private Long amount;
    private Boolean valid;
}
