package smapleprogram;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainProgram {

	public static void main(String[] args) {
		
		List<Employee> employess=new ArrayList<Employee>();
		
		Employee emp1=new Employee();
		employess.add(new Employee(1,"sivarama","java",45000,"hyderabad",9542884379l,3));
		employess.add(new Employee(2,"sivakrishna",".net",55000,"delhi",9542884379l,5));
		employess.add(new Employee(3,"siva","java",45000,"hyderabad",9542884379l,3));
		employess.add(new Employee(4,"siva","testin",45000,"hyderabad",9542884379l,3));
		employess.add(new Employee(5,"siva","java",45000,"delhi",9542884379l,3));
		employess.add(new Employee(6,"siva","paython",65000,"vijayada",9542884379l,3));
		employess.add(new Employee(7,"uppalursiva","java",45000,"hyderabad",9542884379l,3));
		employess.add(new Employee(8,"sivauppaluru","java",75000,"delhi",9542884379l,3));
		employess.add(new Employee(9,"sivareddy","paython",85000,"hyderabad",9542884379l,6));
		employess.add(new Employee(10,"siva sankar",".net",45000,"hyderabad",9542884379l,2));
		
		emp1.displayEmployess(employess);
		
		
		
		
		
		

	}

}
