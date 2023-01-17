package com.axis.service;

import java.util.List;

import com.axis.model.Flight;

public interface FlightService {
	
	public Flight addFlight(Flight flight);
	public List<Flight> getAllFlights();
	public Flight getFlightById(int id);
	public Flight updateFlight(int id,Flight flight);
	public String deleteFlight(int id);

}