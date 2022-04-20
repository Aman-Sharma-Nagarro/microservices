package com.nagarroNAGP.notificationservice.service;

import com.nagarroNAGP.notificationservice.entity.NotificationService;
import com.nagarroNAGP.notificationservice.repository.NotificationServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceService {

    @Autowired
    private NotificationServiceRepository notificationServiceRepository;


    public NotificationService saveNotification(NotificationService notificationService) {
        return notificationServiceRepository.save(notificationService);
    }

    public NotificationService findByNotificationServiceId(Long notificationServiceId) {
        return notificationServiceRepository.findByNotificationServiceId(notificationServiceId);
    }
}
