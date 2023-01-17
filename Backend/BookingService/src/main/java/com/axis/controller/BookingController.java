package com.axis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.axis.model.Booking;
import com.axis.service.BookingService;

@RestController
@RequestMapping("api/booking")
public class BookingController {
	

	@Autowired
	BookingService bookingService;
	
	@PostMapping("/addBooking")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
		Booking booking2 = bookingService.addBooking(booking);
		return new ResponseEntity<Booking>(booking, HttpStatus.OK);
	}
	
	@GetMapping("/getAllBookings")
	public ResponseEntity<List<Booking>> getAllBookings(){
		List<Booking> bookings = bookingService.getAllBookings();
		return new ResponseEntity<List<Booking>>(bookings, HttpStatus.OK);
	}
	
	@GetMapping("/booking/{id}")
	public ResponseEntity<Booking> getBookingsById(@PathVariable int id){
		Booking bookings = bookingService.getBookingById(id);
		return new ResponseEntity<Booking>(bookings, HttpStatus.OK);
	}
	@PutMapping("/booking/{id}")
	public ResponseEntity<Booking> updateBooking(@PathVariable int id,@RequestBody Booking booking){
		return new ResponseEntity<Booking>(bookingService.updateBooking(id, booking),HttpStatus.OK);
	}
	
	@DeleteMapping("/booking/{id}")
	public ResponseEntity<String> deleteBooking(@PathVariable int id){
		return new ResponseEntity<String>(bookingService.deleteBooking(id),HttpStatus.OK);
	}


}