package com.nagarroNAGP.serviceproviderservice.service;

import com.nagarroNAGP.serviceproviderservice.entity.ServiceProvider;
import com.nagarroNAGP.serviceproviderservice.repository.ServiceProviderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceProviderService {

    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    public ServiceProvider saveServiceProvider(ServiceProvider serviceProvider) {
        log.info("Inside saveServiceProvider method in ServiceProviderService");
        return serviceProviderRepository.save(serviceProvider);
    }

    public ServiceProvider findServiceProviderById(Long serviceProviderId) {
        log.info("Inside findServiceProviderById method in ServiceProviderService");
        return serviceProviderRepository.findByServiceProviderId(serviceProviderId);
    }
}
