package com.amdocs.input;

//import java.sql.SQLException;
import java.util.Scanner;
import com.amdocs.dao.AppointmentDao;
import com.amdocs.dao.impl.AppointmentDaoImpl;

public class SearchAppointmentById 
{
	private static Scanner sc=new Scanner(System.in);
	private static AppointmentDao dao=new AppointmentDaoImpl();
	public void displayAppointmentById()
	{
		int id = 0;
		System.out.println("Enter the ID to be shown");
		try
		{
			id=Integer.parseInt(sc.nextLine());
			if(dao.findAppointmentById(id)!=null)
			{
				System.out.println(dao.findAppointmentById(id));
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered character/characters is not a number ID");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
