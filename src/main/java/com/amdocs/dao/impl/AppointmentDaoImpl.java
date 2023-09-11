package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.appointment.Appointment;
import com.amdocs.dao.AppointmentDao;
import com.amdocs.util.DbUtil;

public class AppointmentDaoImpl implements AppointmentDao
{

	private final static String REGISTER = "INSERT INTO appointment (advt_id, cust_id, case_type) values(?,?,?)";
	private final static String UPDATELAWYER = "UPDATE appointment SET advt_id = ? where appt_id = ?";
	private final static String UPDATECUSTOMER = "UPDATE appointment SET cust_id = ? where appt_id = ?";
	private final static String UPDATECASETYPE = "UPDATE appointment SET case_type = ? where appt_id = ?";
	private final static String DELETEAPPOINTMENT = "DELETE FROM appointment WHERE appt_id= ?";
	private final static String SELECTALL = "SELECT appointment.appt_id, appointment.advt_id, advocate.first_name,  advocate.last_name, appointment.cust_id, customer.first_name, customer.last_name, appointment.case_type, advocate.check_in, advocate.check_out from appointment inner join advocate on appointment.advt_id=advocate.advt_id inner join customer on appointment.cust_id=customer.cust_id";
	private final static String SELECTBYID = "SELECT appointment.appt_id, appointment.advt_id, advocate.first_name,  advocate.last_name, appointment.cust_id, customer.first_name, customer.last_name, appointment.case_type, advocate.check_in, advocate.check_out from appointment inner join advocate on appointment.advt_id=advocate.advt_id inner join customer on appointment.cust_id=customer.cust_id where appointment.appt_id=?";
	
	private Connection connection = DbUtil.getConnection();
	
	@Override
	public boolean bookAppointment(int advtId, int custId, String caseType) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(REGISTER);
		pstmt.setInt(1, advtId);
		pstmt.setInt(2, custId);
		pstmt.setString(3, caseType);
		int rowsUpdated=pstmt.executeUpdate();
		pstmt.close();	
		if(rowsUpdated>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyLawyer(int id, int value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATELAWYER);
		pstmt.setInt(1, value);
		pstmt.setInt(2, id);
		int rowsUpdated=pstmt.executeUpdate();
		pstmt.close();	
		if(rowsUpdated>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyCustomer(int id, int value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATECUSTOMER);
		pstmt.setInt(1, value);
		pstmt.setInt(2, id);
		int rowsUpdated=pstmt.executeUpdate();
		pstmt.close();	
		if(rowsUpdated>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyCaseType(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATECASETYPE);
		pstmt.setString(1, value);
		pstmt.setInt(2, id);
		int rowsUpdated=pstmt.executeUpdate();
		pstmt.close();	
		if(rowsUpdated>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAppointment(int id) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(DELETEAPPOINTMENT);
		pstmt.setInt(1, id);
		int rowsUpdated=pstmt.executeUpdate();
		pstmt.close();
		if(rowsUpdated>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public Appointment findAppointmentById(int id) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(SELECTBYID);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(!rs.next())
		{
			System.out.println("Appointment Not found");
			return null;
		}
		Appointment appointment=new Appointment();
		appointment.setId(rs.getInt(1));
		appointment.setAdvtId(rs.getInt(2));
		appointment.setAdvocateName(rs.getString(3)+" "+rs.getString(4));
		appointment.setCustId(rs.getInt(5));
		appointment.setCustomerName(rs.getString(6)+" "+rs.getString(7));
		appointment.setCaseType(rs.getString(8));
		appointment.setCheckIn(rs.getString(9));
		appointment.setCheckOut(rs.getString(10));
		rs.close();
		pstmt.close();
		return appointment;
	}

	@Override
	public List<Appointment> displayAllAppointment() throws SQLException 
	{
		List<Appointment> appointments =new ArrayList<>();
		PreparedStatement pstmt = connection.prepareStatement(SELECTALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())
		{
			Appointment appointment=new Appointment();
			appointment.setId(rs.getInt(1));
			appointment.setAdvtId(rs.getInt(2));
			appointment.setAdvocateName(rs.getString(3)+" "+rs.getString(4));
			appointment.setCustId(rs.getInt(5));
			appointment.setCustomerName(rs.getString(6)+" "+rs.getString(7));
			appointment.setCaseType(rs.getString(8));
			appointment.setCheckIn(rs.getString(9));
			appointment.setCheckOut(rs.getString(10));
			appointments.add(appointment);
		}
		rs.close();
		pstmt.close();
		return appointments;
	}

}
