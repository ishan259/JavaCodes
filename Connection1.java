package com.niit.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Connection1 {

	int row=0;
	public void update(String employee_name,int employee_salary, int employee_age){
		Connection con=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedatabase","root","root");
PreparedStatement sc=con.prepareStatement("INSERT INTO EMPLOYEE VALUES("+"'"+employee_name+"'"+","+employee_salary+" "+"," +employee_age+")");
	row=sc.executeUpdate();
		System.out.println("Updated");			
		}
	catch(Exception e){
		System.err.println("Exception:"+e.getMessage());
	}
	}

	
	
	
	public ResultSet GetDatabase() {

		Connection conn = null;
		ResultSet rs=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedatabase", "root", "root");
		PreparedStatement stmt = conn.prepareStatement("Select * from employee");
		rs = stmt.executeQuery();
	} catch (Exception e) {

		System.out.println(e.getMessage());
	}
		return rs;

		}
		}
