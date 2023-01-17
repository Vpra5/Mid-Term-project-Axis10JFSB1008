package com.axis.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name="flight")
public class Flight {
	@Id
	private int id;
	private String flightnumber;
	private String operatingairlines;
	private String departurecity;
	private String arrivalcity;
	private int seats;
	private int flightprice;

	
	public Flight(int id, String flightnumber, String operatingairlines, String departurecity, String arrivalcity,
			int seats, int flightprice) {
		super();
		this.id = id;
		this.flightnumber = flightnumber;
		this.operatingairlines = operatingairlines;
		this.departurecity = departurecity;
		this.arrivalcity = arrivalcity;
		this.seats = seats;
		this.flightprice = flightprice;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getOperatingairlines() {
		return operatingairlines;
	}
	public void setOperatingairlines(String operatingairlines) {
		this.operatingairlines = operatingairlines;
	}
	public String getDeparturecity() {
		return departurecity;
	}
	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}
	public String getArrivalcity() {
		return arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getFlightprice() {
		return flightprice;
	}
	public void setFlightprice(int flightprice) {
		this.flightprice = flightprice;
	}
}
	
	
	