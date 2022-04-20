package com.nagarroNAGP.bookingservice.repository;

import com.nagarroNAGP.bookingservice.entity.BookingService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingServiceRepository extends JpaRepository<BookingService, Long> {
    BookingService findByBookingServiceId(Long bookingServiceId);
}
