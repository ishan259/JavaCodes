import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Jdbc {

	public static void main(String[] args) {
			
		Connection con=null;
		try{      ArrayList<Employeeadd> list=new ArrayList<Employeeadd>();
			Class.forName("com.mysql.jdbc.Driver").newInstance();
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedatabase","root","root");
	Employeeadd obj1=new Employeeadd();
	String sql = "INSERT INTO Employee VALUES('Sukrit',75000,21)";
	
			PreparedStatement sc=con.prepareStatement(sql);
			sc.executeUpdate();
			
			String sql1 = "SELECT employee_name,employee_salary,employee_age from Employee";
			ResultSet rs =  sc.executeQuery(sql1);
			while(rs.next()){
				int salary=rs.getInt("employee_salary");
				int age=rs.getInt("employee_age");
				String name=rs.getString("employee_name");
				/*
				System.out.print("Salary:" +salary);
				System.out.print(" Age:" +age);
				System.out.println(" Name:" +name);
				*/
			}
			
			           String sql2="SELECT employee_name,employee_salary,employee_age from Employee ORDER BY employee_salary DESC limit 5";
				ResultSet rs1=sc.executeQuery(sql2);
				while(rs1.next()){
					int salary=rs1.getInt("employee_salary");
					int age=rs1.getInt("employee_age");
					String name=rs1.getString("employee_name");
					
					System.out.print("Salary:" +salary);
					System.out.print(" Age:" +age);
					System.out.println(" Name:" +name);
				}
					
			

//						
			if(!con.isClosed())
		System.out.println("Successfully connected to MySQL server...");
		}catch(Exception e){
			System.err.println("Exception:"+e.getMessage());
		}finally{
			try{
				if(con !=null)
					con.close();
			}catch(SQLException e){}
			}
			}
			}
			
