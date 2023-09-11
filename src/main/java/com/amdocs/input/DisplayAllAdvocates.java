package com.amdocs.input;

import java.sql.SQLException;
import java.util.List;
import com.amdocs.advocate.Advocate;
import com.amdocs.dao.AdvocateDao;
import com.amdocs.dao.impl.AdvocateDaoImpl;

public class DisplayAllAdvocates 
{
	static AdvocateDao dao=new AdvocateDaoImpl();
	public void showingAllAdvocates()throws SQLException
	{
		try 
		{
			List<Advocate> displayAllAdvocate = dao.displayAllAdvocates();
			for (Advocate advocate : displayAllAdvocate) {
				System.out.println(advocate);
			}
		}
		catch(SQLException e) 
		{
			System.err.println(e);
			
		}
	}
}
