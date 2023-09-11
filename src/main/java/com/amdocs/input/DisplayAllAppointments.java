package com.amdocs.input;

import java.sql.SQLException;
import java.util.List;

import com.amdocs.appointment.Appointment;
import com.amdocs.dao.AppointmentDao;
import com.amdocs.dao.impl.AppointmentDaoImpl;

public class DisplayAllAppointments 
{
	static AppointmentDao dao=new AppointmentDaoImpl();
	public void showingAllAdvocates()throws SQLException
	{
		try 
		{
			List<Appointment> displayAllAppointment = dao.displayAllAppointment();
			for (Appointment appointment : displayAllAppointment) 
			{
				System.out.println(appointment);
			}
		}
		catch(SQLException e) 
		{
			System.err.println(e);
		
		}
	}
}
