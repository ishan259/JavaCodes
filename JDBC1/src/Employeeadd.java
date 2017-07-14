
	import java.util.ArrayList;

	public class Employeeadd {
	ArrayList<Employee> list=new ArrayList<Employee>();
	public void add(int salary,int age,String name) {
		Employee obj=new Employee();
		
		obj.setAge(age);
		obj.setName(name);
		obj.setSalary(salary);
		list.add(obj);
	}
	public ArrayList<Employee> getEmployee(){
		return list;
	}
	}
