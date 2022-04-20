package com.nagarroNAGP.bookingservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingServiceId;

    private Long serviceProviderId;
    private Long serviceConsumerId;
    private Long adminId;

    private LocalDateTime bookingTime;

}
