package com.nagarroNAGP.serviceproviderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceProviderId;

    private String serviceProviderName;
    private String getServiceProviderAddress;
    private String services;
}
