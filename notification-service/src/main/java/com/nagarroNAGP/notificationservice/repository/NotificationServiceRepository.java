package com.nagarroNAGP.notificationservice.repository;

import com.nagarroNAGP.notificationservice.entity.NotificationService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationServiceRepository extends JpaRepository<NotificationService, Long> {
    NotificationService findByNotificationServiceId(Long notificationServiceId);
}
