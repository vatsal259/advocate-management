package com.amdocs.dao;

import java.sql.SQLException;
import java.util.List;

import com.amdocs.advocate.Advocate;

public interface AdvocateDao
{
	List<Advocate> displayAllAdvocates() throws SQLException;
	void findById(int id) throws  SQLException; 
}
