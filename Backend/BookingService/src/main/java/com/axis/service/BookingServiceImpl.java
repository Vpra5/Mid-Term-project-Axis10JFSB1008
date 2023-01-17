package com.axis.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.exception.IDNotFoundException;
import com.axis.model.Booking;
import com.axis.repository.BookingRepository;
import com.axis.utils.AppConstants;

@Service
public class BookingServiceImpl implements BookingService{
	
	
	@Autowired
	BookingRepository bookingRepository;
	
	/*
	 * @Description: This method is used  to add a product
	 * @Param: It takes peoduct parameter
	 * @Returns:It returns products
	 * @Author:Deepti Mhatre
	 * @Created Date: 9 Dec 2022
	 * 
	 */
	
	
	@Override
	public Booking addBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	
	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

	
	@Override
	public Booking getBookingById(int id) {
		return bookingRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.BOOKING_ID_NOT_FOUND_MESSAGE));
	}

	
	@Override
	public Booking updateBooking(int id, Booking booking) {
		Booking book=bookingRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.BOOKING_ID_NOT_FOUND_MESSAGE));
	    book.setName(booking.getName());
		book.setAge(booking.getAge());
		book.setGender(booking.getGender());
		book.setNoofpassengers(booking.getNoofpassengers());	
		book.setPhoneno(booking.getPhoneno());
		book.setPrice(booking.getPrice());
		
		
		
		return bookingRepository.save(book);
	}

	
	@Override
	public String deleteBooking(int id) {
		Booking book=bookingRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.BOOKING_ID_NOT_FOUND_MESSAGE));
		bookingRepository.delete(book);
		return AppConstants.BOOKING_DELETE_MESSAGE;
	}
	
	

}