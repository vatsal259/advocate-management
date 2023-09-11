package com.amdocs.advocate;

import java.sql.SQLException;
import java.util.Scanner;

import com.amdocs.input.BookAppointment;
import com.amdocs.input.DeleteAppointment;
import com.amdocs.input.ModifyAppointment;
import com.amdocs.input.SearchAppointmentById;
import com.amdocs.input.DisplayAllAppointments;

public class AdvocateOption 
{
	private static BookAppointment ba=new BookAppointment();
	private static DeleteAppointment del=new DeleteAppointment();
	private static ModifyAppointment mod=new ModifyAppointment();
	private static SearchAppointmentById sea=new SearchAppointmentById();
	private static DisplayAllAppointments disall=new DisplayAllAppointments();
	private static Scanner sc=new Scanner(System.in);
	public static void advocateService() throws SQLException
	{
		System.out.println("----Welcome to Advocate portal----");
		boolean flag=true;
		while(flag)
    	{
			try
			{
				System.out.println("Enter your choice:");
				System.out.println("1. Book an appointment");
				System.out.println("2. Modify appointment details");
				System.out.println("3. Delete an appointment");
				System.out.println("4. View single record");
				System.out.println("5. View all records");
				System.out.println("0. Back to Main Menu");
				int ch = Integer.parseInt(sc.nextLine());
				switch (ch) 
				{
					case 1:
						System.out.println("Book an appointment");
						ba.inputNewAppointment();
						break;
					case 2:
						System.out.println("Modify appointment detail");
						mod.updateAppointment();
						break;
					case 3:
						System.out.println("Delete an appointment");
						del.removeAppointment();
						break;
					case 4:
						System.out.println("View single record");
						sea.displayAppointmentById();
						break;
					case 5:
						System.out.println("View all records");
						disall.showingAllAdvocates();
						break;
					case 0:
						flag=false;
						break;
					default:
						System.out.println("O Oo Wrong choice!! Enter again");
						break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("O Oo Wrong choice!! Enter again");
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
    	}
	}
}
