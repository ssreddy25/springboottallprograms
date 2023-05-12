package comarble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int empid;
	String ename;
	double esal;
	String email;

	public Employee(int empid, String ename, double esal, String email) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", esal=" + esal + ", email=" + email + "]";
	}
}
class Name implements Comparator<Employee>{

	@Override
	public int compare(Employee p1, Employee p2) {
		
		return p1.ename.compareTo(p2.ename);
	}
	
}
class Salarysorting implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.esal>e2.esal){
			return 1;
		}else if(e1.esal<e2.esal){
			return  -1;
		}else{
		return 0;
		}
	}
	
}
public class Comparable {

	public static void main(String[] args) {
		
		ArrayList<Employee>employee=new ArrayList();
		employee.add(new Employee(101,"rakesh", 10000,"rakesh@gmail.com"));
		employee.add(new Employee(103,"lakshmi", 15000,"ramesh@gmail.com"));
		employee.add(new Employee(104,"chandhu", 13000,"rajesh@gmail.com"));
		employee.add(new Employee(102,"reddy", 18000,"radesh@gmail.com"));
		employee.add(new Employee(106,"ssreddy", 12000,"ritesh@gmail.com"));
		employee.add(new Employee(105,"rakumsr", 11000,"ravesh@gmail.com"));
		  
		  System.out.println("befor sorting");
		  for(Employee e:employee){
			  System.out.println(e);
		  }
//		  Iterator emp=al.iterator();
//		  while(emp.hasNext()){
//			  System.out.println(emp.next());
//		  }
		 
		Collections.sort(employee, new Name());//it using a sorting name based 
		  System.out.println("after  name sorting");
		  for(Employee e:employee){
			  System.out.println(e);
		  }
		  System.out.println("salar sorting");
		  
		  Collections.sort(employee, new Salarysorting());
		  for(Employee e:employee){
			  System.out.println(e);
		  }

		

	}

}
