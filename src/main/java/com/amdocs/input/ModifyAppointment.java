package com.amdocs.input;

import java.sql.SQLException;
import java.util.Scanner;

import com.amdocs.dao.AppointmentDao;
import com.amdocs.dao.impl.AppointmentDaoImpl;

public class ModifyAppointment 
{
	private static Scanner sc=new Scanner(System.in);
	private static AppointmentDao dao=new AppointmentDaoImpl();
	public void updateAppointment()throws SQLException
	{
		try
		{
			System.out.println("Enter the id of the appointment you want to change");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the corresponding number");
			System.out.println("Enter 1 to modify Advocate");
			System.out.println("Enter 2 to modify Customer");
			System.out.println("Enter 3 to modify Case Type");
			int ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter new Advocate ID:");
					int value=Integer.parseInt(sc.nextLine());
					boolean flag=dao.modifyLawyer(id, value);
					if(flag)
					{
						System.out.println("Advocate ID updated");
					}
					else
					{
						System.out.println("Not Found");
					}
					break;
				}
				case 2:
				{
					System.out.println("Enter new Customer ID:");
					int value=Integer.parseInt(sc.nextLine());
					boolean flag=dao.modifyCustomer(id, value);
					if(flag)
					{
						System.out.println("Customer ID updated");
					}
					else
					{
						System.out.println("Not Found");
					}
					break;
				}
				case 3:
				{
					System.out.println("Enter new Case Type:");
					String value=sc.nextLine();
					boolean flag=dao.modifyCaseType(id, value);
					if(flag)
					{
						System.out.println("Case Type updated");
					}
					else
					{
						System.out.println("Not Found");
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
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
