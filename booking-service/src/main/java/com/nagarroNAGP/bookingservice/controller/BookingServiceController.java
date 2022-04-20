package com.nagarroNAGP.bookingservice.controller;

import com.nagarroNAGP.bookingservice.entity.BookingService;
import com.nagarroNAGP.bookingservice.service.BookingServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking-service")
public class BookingServiceController {

    @Autowired
    private BookingServiceService bookingServiceService;

    @RequestMapping("/")
    @PostMapping
    public BookingService saveBookingService(@RequestBody BookingService bookingService){
        return bookingServiceService.saveBookingService(bookingService);
    }

    @RequestMapping("/{id}")
    @GetMapping
    public BookingService findByBookingServiceId(@PathVariable("id") Long bookingServiceId){
        return bookingServiceService.findByBookingServiceId(bookingServiceId);
    }

}
