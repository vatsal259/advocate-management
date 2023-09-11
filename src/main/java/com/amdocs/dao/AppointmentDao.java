package com.amdocs.dao;

import java.sql.SQLException;
import java.util.List;

import com.amdocs.appointment.Appointment;

public interface AppointmentDao 
{
	boolean bookAppointment(int advtId, int custId, String caseType)throws SQLException;
	boolean modifyLawyer(int id, int value)throws SQLException;
	boolean modifyCustomer(int id, int value)throws SQLException;
	boolean modifyCaseType(int id, String value)throws SQLException;
	boolean deleteAppointment(int id)throws SQLException;
	Appointment findAppointmentById(int id)throws SQLException;
	List<Appointment> displayAllAppointment()throws SQLException;
}
