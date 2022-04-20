package com.nagarroNAGP.serviceconsumerservice.repository;

import com.nagarroNAGP.serviceconsumerservice.entity.ServiceConsumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceConsumerRepository extends JpaRepository<ServiceConsumer, Long> {
    ServiceConsumer findByServiceConsumerId(Long serviceConsumerId);
}
