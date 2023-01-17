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
@Table(name="booking")
public class Booking {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String gender;
	private int noofpassengers;
	private int phoneno;
	private int price;
	
		public Booking(int id, String name, int age, String gender, int noofpassengers, int phoneno, int price) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.noofpassengers = noofpassengers;
		this.phoneno = phoneno;
		this.price = price;
	}
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getNoofpassengers() {
		return noofpassengers;
	}
	public void setNoofpassengers(int noofpassengers) {
		this.noofpassengers = noofpassengers;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
	
	