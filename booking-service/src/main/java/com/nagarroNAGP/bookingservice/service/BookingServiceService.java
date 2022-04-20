package com.nagarroNAGP.bookingservice.service;

import com.nagarroNAGP.bookingservice.entity.BookingService;
import com.nagarroNAGP.bookingservice.repository.BookingServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceService {

    @Autowired
    private BookingServiceRepository bookingServiceRepository;

    public BookingService saveBookingService(BookingService bookingService) {
        return bookingServiceRepository.save(bookingService);
    }

    public BookingService findByBookingServiceId(Long bookingServiceId) {
        return bookingServiceRepository.findByBookingServiceId(bookingServiceId);
    }
}
