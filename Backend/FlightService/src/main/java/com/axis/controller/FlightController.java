package com.axis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.axis.model.Flight;
import com.axis.service.FlightService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/flight")
public class FlightController {
	

	@Autowired
	FlightService flightService;
	
	@PostMapping("/addFlight")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight flight){
		Flight flight2 = flightService.addFlight(flight);
		return new ResponseEntity<Flight>(flight, HttpStatus.OK);
	}
	
	@GetMapping("/getAllFlights")
	public ResponseEntity<List<Flight>> getAllFlights(){
		List<Flight> flights = flightService.getAllFlights();
		return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK);
	}
	
	@GetMapping("/flight/{id}")
	public ResponseEntity<Flight> getFlightsById(@PathVariable int id){
		Flight flights = flightService.getFlightById(id);
		return new ResponseEntity<Flight>(flights, HttpStatus.OK);
	}
	
	@GetMapping("/get_flight/{id}")
	public  ResponseEntity<List<Flight>> getFlightById(@PathVariable int id) {
		Flight flight = flightService.getFlightById(id);
				//.orElseThrow(() -> new ResourceNotFoundException("Book not found with id :" + id));
		List<Flight> flights = new ArrayList<>();
		flights.add(flight);
		return ResponseEntity.ok(flights);
	}
	@PutMapping("/flightupdate/{id}")
	public ResponseEntity<Flight> updateFlight(@PathVariable int id,@RequestBody Flight flight){
		return new ResponseEntity<Flight>(flightService.updateFlight(id, flight),HttpStatus.OK);
	}
	
	@DeleteMapping("/flight/{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable int id){
		return new ResponseEntity<String>(flightService.deleteFlight(id),HttpStatus.OK);
	}


}