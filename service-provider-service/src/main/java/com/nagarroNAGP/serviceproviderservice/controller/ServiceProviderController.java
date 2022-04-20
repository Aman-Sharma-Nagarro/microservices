package com.nagarroNAGP.serviceproviderservice.controller;

import com.nagarroNAGP.serviceproviderservice.entity.ServiceProvider;
import com.nagarroNAGP.serviceproviderservice.service.ServiceProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service-provider")
@Slf4j
public class ServiceProviderController {

    @Autowired
    private ServiceProviderService serviceProviderService;

    @PostMapping("/")
    public ServiceProvider saveServiceProvider(@RequestBody ServiceProvider serviceProvider){
        log.info("Inside saveServiceProvider method of ServiceProviderController");
        return serviceProviderService.saveServiceProvider(serviceProvider);
    }

    @GetMapping("/{id}")
    public ServiceProvider findServiceProviderById(@PathVariable("id") Long serviceProviderId){
        log.info("Inside findServiceProviderById method of ServiceProviderController");
        return serviceProviderService.findServiceProviderById(serviceProviderId);
    }
}
