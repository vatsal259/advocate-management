package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.advocate.Advocate;
import com.amdocs.util.DbUtil;
import com.amdocs.dao.AdvocateDao;

public class AdvocateDaoImpl implements AdvocateDao
{
	private final static String SELECT_ALL = "SELECT * FROM advocate";
	private final static String SELECT_BY_ID = "SELECT * FROM advocate WHERE advt_id = ?";
	private Connection connection = DbUtil.getConnection();
	
	@Override
	public List<Advocate> displayAllAdvocates() throws SQLException
	{
		List<Advocate> advocates = new ArrayList<>();
		PreparedStatement pstmt = connection.prepareStatement(SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) 
		{
			Advocate advocate =new Advocate();
			advocate.setId(rs.getInt("advt_id"));
			advocate.setFirstName(rs.getString("first_name"));
			advocate.setLastName(rs.getString("last_name"));
			advocate.setPhoneNumber(rs.getString("phone_number"));
			advocate.setGender(rs.getString("gender"));
			advocate.setCabinNumber(rs.getString("cabin_number"));
			advocate.setCheckIn(rs.getString("check_in"));
			advocate.setCheckOut(rs.getString("check_out"));
			advocate.setFees(rs.getString("fees"));
			advocates.add(advocate);
		}
		rs.close();
		pstmt.close();
		return advocates;
	}
	
	@Override
	public void findById(int id) throws  SQLException
	{
		Advocate advocate=new Advocate();
		PreparedStatement pstmt = connection.prepareStatement(SELECT_BY_ID);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		advocate.setId(rs.getInt("advt_id"));
		advocate.setFirstName(rs.getString("first_name"));
		advocate.setLastName(rs.getString("last_name"));
		advocate.setPhoneNumber(rs.getString("phone_number"));
		advocate.setGender(rs.getString("gender"));
		advocate.setCabinNumber(rs.getString("cabin_number"));
		advocate.setCheckIn(rs.getString("check_in"));
		advocate.setCheckOut(rs.getString("check_out"));
		advocate.setFees(rs.getString("fees"));
		rs.close();
		pstmt.close();
		System.out.println(advocate);	
	}
	
}
