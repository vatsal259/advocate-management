package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.customer.Customer;
import com.amdocs.dao.CustomerDao;
import com.amdocs.util.DbUtil;

public class CustomerDaoImpl implements CustomerDao 
{

	private final static String REGISTER = "INSERT INTO customer (first_name, last_name, phone_number, gender, address, city, state, pincode) values(?,?,?,?,?,?,?,?)";
	private final static String UPDATEFIRSTNAME = "UPDATE customer SET first_name = ? where cust_id= ?";
	private final static String UPDATELASTNAME = "UPDATE customer SET last_name = ? where cust_id= ?";
	private final static String UPDATEPHONENUMBER = "UPDATE customer SET phone_number = ? where cust_id= ?";
	private final static String UPDATEGENDER = "UPDATE customer SET gender = ? where cust_id= ?";
	private final static String UPDATEADDRESS = "UPDATE customer SET address = ? where cust_id= ?";
	private final static String UPDATECITY = "UPDATE customer SET city = ? where cust_id= ?";
	private final static String UPDATESTATE = "UPDATE customer SET state = ? where cust_id= ?";
	private final static String UPDATEPINCODE = "UPDATE customer SET pincode = ? where cust_id= ?";
	private final static String DELETECUSTOMER ="DELETE FROM customer WHERE cust_id=?";
	private final static String SELECTBYID ="SELECT * FROM customer WHERE cust_id=?";
	private final static String SELECTALL ="SELECT * FROM customer";
	
	private Connection connection = DbUtil.getConnection();
	
	@Override
	public boolean registerCustomer(String firstName, String lastName, String phone, String gender, String address, String city, String state, String pincode) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(REGISTER);
		pstmt.setString(1, firstName);
		pstmt.setString(2, lastName);
		pstmt.setString(3, phone);
		pstmt.setString(4, gender);
		pstmt.setString(5, address);
		pstmt.setString(6, city);
		pstmt.setString(7, state);
		pstmt.setString(8, pincode);
		int rowsUpdated=pstmt.executeUpdate();
		pstmt.close();	
		if(rowsUpdated>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyCustomerFirstName(int id, String value) throws SQLException 
	{	
		PreparedStatement pstmt = connection.prepareStatement(UPDATEFIRSTNAME);
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
	public boolean modifyCustomerLastName(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATELASTNAME);
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
	public boolean modifyCustomerPhone(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATEPHONENUMBER);
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
	public boolean modifyCustomerGender(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATEGENDER);
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
	public boolean modifyCustomerAddress(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATEADDRESS);
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
	public boolean modifyCustomerCity(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATECITY);
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
	public boolean modifyCustomerState(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATESTATE);
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
	public boolean modifyCustomerPincode(int id, String value) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(UPDATEPINCODE);
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
	public boolean deleteCustomer(int id) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(DELETECUSTOMER);
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
	public Customer findCustomerById(int id) throws SQLException 
	{
		PreparedStatement pstmt = connection.prepareStatement(SELECTBYID);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(!rs.next())
		{
			System.out.println("Customer Not found");
			return null;
		}
		Customer customer =new Customer();
		customer.setId(rs.getInt("cust_id"));
		customer.setFirstName(rs.getString("first_name"));
		customer.setLastName(rs.getString("last_name"));
		customer.setPhoneNumber(rs.getString("phone_number"));
		customer.setGender(rs.getString("gender"));
		customer.setAddress(rs.getString("address"));
		customer.setCity(rs.getString("city"));
		customer.setState(rs.getString("state"));
		customer.setPincode(rs.getString("pincode"));
		rs.close();
		pstmt.close();
		return customer;
	}

	@Override
	public List<Customer> displayAllCustomer() throws SQLException 
	{
		List<Customer> customers = new ArrayList<>();
		PreparedStatement pstmt = connection.prepareStatement(SELECTALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())
		{
			Customer customer =new Customer();
			customer.setId(rs.getInt("cust_id"));
			customer.setFirstName(rs.getString("first_name"));
			customer.setLastName(rs.getString("last_name"));
			customer.setPhoneNumber(rs.getString("phone_number"));
			customer.setGender(rs.getString("gender"));
			customer.setAddress(rs.getString("address"));
			customer.setCity(rs.getString("city"));
			customer.setState(rs.getString("state"));
			customer.setPincode(rs.getString("pincode"));
			customers.add(customer);
		}
		rs.close();
		pstmt.close();
		return customers;
	}

	

}
