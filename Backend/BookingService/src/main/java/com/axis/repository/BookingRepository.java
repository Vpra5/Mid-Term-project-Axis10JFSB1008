package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}