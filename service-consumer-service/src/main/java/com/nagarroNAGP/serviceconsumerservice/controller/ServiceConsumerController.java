package com.nagarroNAGP.serviceconsumerservice.controller;

import com.nagarroNAGP.serviceconsumerservice.entity.ServiceConsumer;
import com.nagarroNAGP.serviceconsumerservice.service.ServiceConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service-consumer")
@Slf4j
public class ServiceConsumerController {

    @Autowired
    private ServiceConsumerService serviceConsumerService;

    @PostMapping("/")
    public ServiceConsumer saveServiceConsumer(@RequestBody ServiceConsumer serviceConsumer){
        log.info("Inside saveServiceConsumer method in ServiceConsumerController");
        return serviceConsumerService.saveServiceConsumer(serviceConsumer);
    }

    @GetMapping("/{id}")
    public ServiceConsumer findServiceConsumerById(@PathVariable("id") Long serviceConsumerId){
        log.info("Inside getServiceConsumerById method in ServiceConsumerController");
        return serviceConsumerService.findByServiceConsumerId(serviceConsumerId);
    }
}
