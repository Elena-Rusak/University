package model;

public class Address {

	public String city;
	public String street;
	public String house;
	public String apartment;
	
	
	
	public Address (String city, String street, String house, String apartment) {
	this.city = city;
	this.street = street; 
	this.house = house;
	this.apartment = apartment;
	}
	
	public String toString () {
		return this.city + " " + this.street + " " + this.house + " " + this.apartment;
	}

}
