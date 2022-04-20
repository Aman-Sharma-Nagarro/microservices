package com.nagarroNAGP.serviceconsumerservice.service;

import com.nagarroNAGP.serviceconsumerservice.entity.ServiceConsumer;
import com.nagarroNAGP.serviceconsumerservice.repository.ServiceConsumerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceConsumerService {

    @Autowired
    private ServiceConsumerRepository serviceConsumerRepository;

    public ServiceConsumer saveServiceConsumer(ServiceConsumer serviceConsumer) {
        log.info("Inside saveServiceConsumer method in ServiceConsumerService");
        return serviceConsumerRepository.save(serviceConsumer);
    }

    public ServiceConsumer findByServiceConsumerId(Long serviceConsumerId) {
        log.info("Inside getServiceConsumerById method in ServiceConsumerService");
        return serviceConsumerRepository.findByServiceConsumerId(serviceConsumerId);}
}
