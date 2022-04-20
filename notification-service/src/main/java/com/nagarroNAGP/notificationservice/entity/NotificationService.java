package com.nagarroNAGP.notificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class NotificationService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationServiceId;

    private Long sender;
    private Long receiver;
    private String message;
}
