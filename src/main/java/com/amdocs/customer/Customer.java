package com.amdocs.customer;


public class Customer 
{
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String pincode;
	public int getId() 
	{
		return id;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public String getGender() 
	{
		return gender;
	}
	public String getAddress() 
	{
		return address;
	}
	public String getCity() 
	{
		return city;
	}
	public String getState() 
	{
		return state;
	}
	public String getPincode() 
	{
		return pincode;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public void setPincode(String pincode) 
	{
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Id: " + id + " | Name: " + firstName + " " + lastName + " | Number: "
				+ phoneNumber + " | Gender: " + gender + " | Address: " + address + ", " + city + ", " + state
				+ " - " + pincode;
	}
	
}
