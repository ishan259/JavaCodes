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

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet2() {
         }

    public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException
    {
    	res.setContentType("text/html");
    	 String s= req.getParameter("employee_name");
    	   int s1 = Integer.parseInt (req.getParameter("employee_salary"));
    	   int s2 = Integer.parseInt (req.getParameter("employee_age"));
    	
    	PrintWriter pw=res.getWriter();
        	Connection1 bs=new Connection1();
    	bs.update(s, s1,s2);
    	pw.println("<form name= 'fetch' action= 'FetchServlet'><input type = 'submit'></form>");
        	pw.close();
    }
}
