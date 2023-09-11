package com.amdocs.input;

import java.sql.SQLException;
import java.util.Scanner;

import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.impl.CustomerDaoImpl;
import com.amdocs.exception.IPNException;
import com.amdocs.exception.InvalidPincodeException;
import com.amdocs.util.Validation;

public class ModifyCustomer 
{
	private static Scanner sc=new Scanner(System.in);
	private static CustomerDao dao=new CustomerDaoImpl();
	private static Validation val=new Validation();
	public void updateCustomer()throws SQLException, IPNException, InvalidPincodeException
	{
		System.out.println("Enter the id of the customer you want to change");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the corresponding number");
		System.out.println("Enter 1 to modify first name");
		System.out.println("Enter 2 to modify last name");
		System.out.println("Enter 3 to modify phone number");
		System.out.println("Enter 4 to modify gender");
		System.out.println("Enter 5 to modify address");
		System.out.println("Enter 6 to modify city");
		System.out.println("Enter 7 to modify state");
		System.out.println("Enter 8 to modify pincode");
		int ch=Integer.parseInt(sc.nextLine());;
		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter new first name:");
				String value=sc.nextLine();
				boolean flag=dao.modifyCustomerFirstName(id, value);
				if(flag)
				{
					System.out.println("First Name Updated");
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter new last name:");
				String value=sc.nextLine();
				boolean flag=dao.modifyCustomerLastName(id, value);
				if(flag)
				{
					System.out.println("First Name Updated");
				}
				break;
			}
			case 3:
			{
				System.out.println("Enter new phone number:");
				String value=sc.nextLine();
				if (!val.isValidPhoneNumber(value)) 
				{
				    throw new IPNException("Invalid phone number: " + value);
				}
				boolean flag=dao.modifyCustomerPhone(id, value);
				if(flag)
				{
					System.out.println("Phone Number Updated");
				}
				break;
			}
			case 4:
			{
				System.out.println("Enter new gender:");
				String value=sc.nextLine();
				boolean flag=dao.modifyCustomerGender(id, value);
				if(flag)
				{
					System.out.println("Gender Updated");
				}
				break;
			}
			case 5:
			{
				System.out.println("Enter new address");
				String value=sc.nextLine();
				boolean flag=dao.modifyCustomerAddress(id, value);
				if(flag)
				{
					System.out.println("Address Updated");
				}
				break;
			}
			case 6:
			{
				System.out.println("Enter new city");
				String value=sc.nextLine();
				boolean flag=dao.modifyCustomerCity(id, value);
				if(flag)
				{
					System.out.println("City Updated");
				}
				break;
			}
			case 7:
			{
				System.out.println("Enter new state");
				String value=sc.nextLine();
				boolean flag=dao.modifyCustomerState(id, value);
				if(flag)
				{
					System.out.println("State Updated");
				}
				break;
			}
			case 8:
			{
				System.out.println("Enter new pincode");
				String value=sc.nextLine();
				if(!val.validatePincode(value))
				{
					throw new InvalidPincodeException("Invalid pincode: " + value);
				}
				boolean flag=dao.modifyCustomerPincode(id, value);
				if(flag)
				{
					System.out.println("Pincode Updated");
				}
				break;
			}
			default:
			{
				System.out.println("O Oo Wrong choice!! Enter again");
				break;
			}
		}
	}
}
