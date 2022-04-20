package com.nagarroNAGP.notificationservice.controller;

import com.nagarroNAGP.notificationservice.entity.NotificationService;
import com.nagarroNAGP.notificationservice.service.NotificationServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/notification-service")
public class NotificationServiceController {

    @Autowired
    private NotificationServiceService notificationServiceService;

    @PostMapping
    @RequestMapping("/")
    public NotificationService saveNotification(@RequestBody NotificationService notificationService){
        return notificationServiceService.saveNotification(notificationService);
    }

    @GetMapping
    @RequestMapping("/{id}")
    public NotificationService findByNotificationServiceId(@PathVariable("id") Long notificationServiceId){
        return notificationServiceService.findByNotificationServiceId(notificationServiceId);
    }
}
