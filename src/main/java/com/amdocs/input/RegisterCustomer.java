package com.amdocs.input;

import java.sql.SQLException;
import java.util.Scanner;
import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.impl.CustomerDaoImpl;
import com.amdocs.exception.IPNException;
import com.amdocs.exception.InvalidPincodeException;
import com.amdocs.util.Validation;

public class RegisterCustomer 
{
	private static Scanner sc=new Scanner(System.in);
	private static CustomerDao dao=new CustomerDaoImpl();
	private static Validation val=new Validation();
	public void inputNewCustomer() throws SQLException, IPNException, InvalidPincodeException
	{	
		String firstName, lastName, phoneNumber, gender, address, city, state, pincode;
		System.out.println("-----Enter your details-----");
		System.out.println("Enter first name:");
		firstName=sc.nextLine();
		System.out.println("Enter last name:");
		lastName=sc.nextLine();
		System.out.println("Enter your phone number:");
		phoneNumber=sc.nextLine();
		if (!val.isValidPhoneNumber(phoneNumber)) 
		{
		    throw new IPNException("Invalid phone number: " + phoneNumber);
		}
		
		System.out.println("Enter gender:");
		gender=sc.nextLine();
		System.out.println("Enter address:");
		address=sc.nextLine();
		System.out.println("Enter city:");
		city=sc.nextLine();
		System.out.println("Enter state:");
		state=sc.nextLine();
		System.out.println("Enter pincode:");
		pincode=sc.nextLine();
		if(!val.validatePincode(pincode))
		{
			throw new InvalidPincodeException("Invalid pincode: " + pincode);
		}
		
		boolean flag=dao.registerCustomer(firstName, lastName, phoneNumber, gender, address, city, state, pincode);
		if(flag)
		{
			System.out.println("New customer added Updated");
		}
	}
}
