package com.amdocs.dao;

import java.sql.SQLException;
import java.util.List;

import com.amdocs.customer.Customer;

public interface CustomerDao 
{
	public boolean registerCustomer(String firstName, String lastName, String phone, String gender, String address, String city, String state, String pincode)throws SQLException;
	public boolean modifyCustomerFirstName(int id, String value) throws SQLException;
	public boolean modifyCustomerLastName(int id, String value) throws SQLException;
	public boolean modifyCustomerPhone(int id, String value) throws SQLException;
	public boolean modifyCustomerGender(int id, String value) throws SQLException;
	public boolean modifyCustomerAddress(int id, String value) throws SQLException;
	public boolean modifyCustomerCity(int id, String value) throws SQLException;
	public boolean modifyCustomerState(int id, String value) throws SQLException;
	public boolean modifyCustomerPincode(int id, String value) throws SQLException;
	public boolean deleteCustomer(int id)throws SQLException;
	Customer findCustomerById(int id)throws SQLException;
	List<Customer>  displayAllCustomer() throws SQLException;
}
