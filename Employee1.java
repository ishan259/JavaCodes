import java.util.*;
public class Employee1
{
	ArrayList<Employee> list=new ArrayList<Employee>();

	public void setting(String name,double salary,int age)
	{
		Employee e1=new Employee();
		e1.setName(name);
		e1.setSalary(salary);
		e1.setAge(age);
		list.add(e1);
			
	}
	public ArrayList<Employee> getEmployeeList()
	{
		return list;
	}
	
}
