package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}