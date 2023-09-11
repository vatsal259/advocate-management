package com.amdocs;

import java.sql.SQLException;
import java.util.Scanner;

import com.amdocs.advocate.AdvocateOption;
import com.amdocs.customer.CustomerOption;

public class App 
{
	
	private static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )throws SQLException
    {
    	System.out.println("--------------Welcome--------------");
    	System.out.println("-----------------------------------");
    	System.out.println("Advocate Appointment Booking portal");
    	System.out.println("-----------------------------------");
    	while(true)
    	{
        	try 
        	{
    			System.out.println("Enter your choice:");
    			System.out.println("1. Customer");
    			System.out.println("2. Advocate");
    			System.out.println("0. Exit");
    			int ch = Integer.parseInt(sc.nextLine());
    			switch (ch) 
    			{
    				case 1:
    					CustomerOption.customerService();
    					break;
    				case 2:
    					AdvocateOption.advocateService();
    					break;
    				case 0:
    					System.out.println("------------------------------------------------------");
    					System.out.println("Thank you for using the portal! Hope to see you again.");
    					System.out.println("------------------------------------------------------");
    					System.exit(0);
    				default:
    					System.out.println("O Oo Wrong choice!! Enter again");
    					break;
    			}
    		}
        	catch(NumberFormatException e)
        	{
        		System.err.println(e);
        	}
    	}
    	
    }
}
