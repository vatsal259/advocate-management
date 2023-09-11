package com.amdocs.input;

import java.sql.SQLException;
import java.util.Scanner;
import com.amdocs.dao.AppointmentDao;
import com.amdocs.dao.impl.AppointmentDaoImpl;


public class BookAppointment 
{
	private static Scanner sc=new Scanner(System.in);
	private static AppointmentDao dao=new AppointmentDaoImpl();
	private static DisplayAllAdvocates disall=new DisplayAllAdvocates();
	public void inputNewAppointment()throws SQLException
	{
		try
		{
			System.out.println("Enter your Customer ID");
			int custId=Integer.parseInt(sc.nextLine());
			System.out.println("Here's the list of advocates and enter the Advocate ID your preference for the appointment");
			disall.showingAllAdvocates();
			int advtId=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the type of Case");
			String caseType=sc.nextLine();
			boolean flag=dao.bookAppointment(advtId, custId, caseType);
			if(flag) 
			{
				System.out.println("Appointment Booked");
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	
}
