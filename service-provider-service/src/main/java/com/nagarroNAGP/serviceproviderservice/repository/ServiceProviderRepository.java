package com.nagarroNAGP.serviceproviderservice.repository;

import com.nagarroNAGP.serviceproviderservice.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long> {

    ServiceProvider findByServiceProviderId(Long serviceProviderId);
}
