package com.amdocs.input;

import java.sql.SQLException;
import java.util.Scanner;
import com.amdocs.dao.AppointmentDao;
import com.amdocs.dao.impl.AppointmentDaoImpl;

public class DeleteAppointment 
{
	private static Scanner sc=new Scanner(System.in);
	static AppointmentDao dao=new AppointmentDaoImpl();
	public void removeAppointment()throws SQLException
	{
		try
		{
			System.out.println("Enter the ID to be deleted");
			int id=Integer.parseInt(sc.nextLine());
			boolean flag=dao.deleteAppointment(id);
			if(flag)
			{
				System.out.println("Appointment Deleted");
			}
			else
			{
				System.out.println("Appointment ID does not exist");
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
