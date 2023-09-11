package com.amdocs.input;

import java.sql.SQLException;
import java.util.List;

import com.amdocs.customer.Customer;
import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.impl.CustomerDaoImpl;

public class DisplayAllCustomers 
{
	static CustomerDao dao=new CustomerDaoImpl();
	public void showingAllCustomers()throws SQLException
	{
		try {
			List<Customer> displayAllCustomer = dao.displayAllCustomer();
			for (Customer customer : displayAllCustomer) {
				System.out.println(customer);
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
