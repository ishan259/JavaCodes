import java.util.*;
public class Employee2
{	
	ArrayList<Double> sal=new ArrayList<Double>();
	ArrayList<Employee> list=new ArrayList<Employee>();
	public void addEmployee()
	{
		
		Employee1 ob1=new Employee1();
		ob1.setting("Kuldeep",12000.0,21);
		ob1.setting("Aman",5000.0,23);
		ob1.setting("Dheerendra",7000.0,22);
		ob1.setting("Shivam",4000.0,25);
		list=ob1.getEmployeeList();
	}
	public void printEmpNames()
	{
		for(Employee e: list)
			System.out.println(e.getName());
	}
	public void printEmpAge()
	{
		for(Employee e: list)
			System.out.println(e.getAge());
	}
	public void printEmpSalary()
	{
		for(Employee e: list)
			System.out.println(e.getSalary());
	}
	public void sort()
	{
		for(Employee e: list)
			sal.add(e.getSalary());
		Collections.sort(sal);
		for(double s:sal)
		{
			for(Employee e:list)
				if(s==e.getSalary())
					System.out.println("Name: "+e.getName()+" Salary: "+e.getSalary());
		}
	}	
	public static void main(String args[])
	{
		Employee2 obj=new Employee2();
		obj.addEmployee();
		System.out.println("Employee names are:");
		obj.printEmpNames();
		System.out.println("Employee age are:");
		obj.printEmpAge();
		System.out.println("Employee salary are:");
		obj.printEmpSalary();
		System.out.println("Employee after sorting are:");
		obj.sort();
	}
}