package com.amdocs.advocate;

public class Advocate 
{
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String gender;
	private String cabinNumber;
	private String checkIn;
	private String checkOut;
	private String fees;
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
	public String getCabinNumber() 
	{
		return cabinNumber;
	}
	public String getCheckIn() 
	{
		return checkIn;
	}
	public String getCheckOut() 
	{
		return checkOut;
	}
	public String getFees() 
	{
		return fees;
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
	public void setCabinNumber(String cabinNumber) 
	{
		this.cabinNumber = cabinNumber;
	}
	public void setCheckIn(String checkIn) 
	{
		this.checkIn = checkIn;
	}
	public void setCheckOut(String checkOut) 
	{
		this.checkOut = checkOut;
	}
	public void setFees(String fees) 
	{
		this.fees = fees;
	}
	@Override
	public String toString() 
	{
		return "Id: " + id + " | Name: " + firstName + " " + lastName + " | Phone Number: "
				+ phoneNumber + " | Gender: " + gender + " | Cabin number: " + cabinNumber + " | Timings: " + checkIn
				+ " to " + checkOut + " | Fees: " + fees;
	}
	
}
