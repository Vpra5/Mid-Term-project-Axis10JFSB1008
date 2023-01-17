package com.axis.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.exception.IDNotFoundException;
import com.axis.model.Flight;
import com.axis.repository.FlightRepository;
import com.axis.utils.AppConstants;

@Service
public class FlightServiceImpl implements FlightService{
	
	
	@Autowired
	FlightRepository flightRepository;
	
	/*
	 * @Description: This method is used  to add a product
	 * @Param: It takes peoduct parameter
	 * @Returns:It returns products
	 * @Author:Deepti Mhatre
	 * @Created Date: 9 Dec 2022
	 * 
	 */
	
	
	@Override
	public Flight addFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	
	@Override
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

	
	@Override
	public Flight getFlightById(int id) {
		return flightRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.FLIGHT_ID_NOT_FOUND_MESSAGE));
	}

	
	@Override
	public Flight updateFlight(int id, Flight flight) {
		Flight flht=flightRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.FLIGHT_ID_NOT_FOUND_MESSAGE));
		flht.setFlightnumber(flight.getFlightnumber());
		flht.setOperatingairlines(flight.getOperatingairlines());
		flht.setDeparturecity(flight.getDeparturecity());
		flht.setArrivalcity(flight.getArrivalcity());
		flht.setSeats(flight.getSeats());
		flht.setFlightprice(flight.getFlightprice());
				
		
		
		return flightRepository.save(flht);
	}

	
	@Override
	public String deleteFlight(int id) {
		Flight flht=flightRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.FLIGHT_ID_NOT_FOUND_MESSAGE));
		flightRepository.delete(flht);
		return AppConstants.FLIGHT_DELETE_MESSAGE;
	}
	
	

}