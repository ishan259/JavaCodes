package com.niit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException
    {
    	res.setContentType("text/html");
    	 String s= req.getParameter("emp_name");
    	   String s1= req.getParameter("emp_id");
    	   String s2= req.getParameter("emp_age");
    	   System.out.println(s);
    	   System.out.println(s1);
    	   System.out.println(s2);
    	PrintWriter pw=res.getWriter();
    	pw.println("Welcome to the first Servlet home.....");
    pw.println("<h1>Hurray!! Servlet is working awesome!! " + s+" "+s1+" "+s2 + "</h1>");
  
   
       
    pw.close();
    }
    
    
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}

}
