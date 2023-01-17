package com.axis.service;

import java.util.List;

import com.axis.model.Booking;

public interface BookingService {
	
	public Booking addBooking(Booking booking);
	public List<Booking> getAllBookings();
	public Booking getBookingById(int id);
	public Booking updateBooking(int id,Booking booking);
	public String deleteBooking(int id);

}