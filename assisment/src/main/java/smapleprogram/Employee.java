package smapleprogram;

import java.util.List;


public class Employee {
	public int Eid;
	public String Ename;
	public String Edept;
	public int Esal;
	public String Eaddress;
	public long Ephoneno;
	public int Eexperience;
	
	public Employee(){}
	public Employee(int  eid, String ename, String edept, int esal, String eaddress, long ephoneno, int eexperience) {
		super();
		Eid = eid;
		Ename = ename;
		Edept = edept;
		Esal = esal;
		Eaddress = eaddress;
		Ephoneno = ephoneno;
		Eexperience = eexperience;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEdept() {
		return Edept;
	}
	public void setEdept(String edept) {
		Edept = edept;
	}
	public int getEsal() {
		return Esal;
	}
	public void setEsal(int esal) {
		Esal = esal;
	}
	public String getEaddress() {
		return Eaddress;
	}
	public void setEaddress(String eaddress) {
		Eaddress = eaddress;
	}
	public long getEphoneno() {
		return Ephoneno;
	}
	public void setEphoneno(long ephoneno) {
		Ephoneno = ephoneno;
	}
	public int getEexperience() {
		return Eexperience;
	}
	public void setEexperience(int eexperience) {
		Eexperience = eexperience;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Edept=" + Edept + ", Esal=" + Esal + ", Eaddress="
				+ Eaddress + ", Ephoneno=" + Ephoneno + ", Eexperience=" + Eexperience + "]";
	}
	
	
	public void displayEmployess(List<Employee> emp){
		
		System.out.println("ALL  DATA  DISPLAY");
		System.out.println("*****************************");
		
		emp.stream().forEach(emp1 ->System.out.println(emp1));
		
		System.out.println("ONLY MATCHING NAME DATA ONLY DISPLAY");
		emp.stream().filter(data ->data.getEname().equals("siva")).forEach(data1 ->System.out.println(data1));;
		
		 System.out.println("ONLY MATCHING SALARY DATA ONLY DISPLAY");
		emp.stream().filter(data ->data.getEsal()==45000).forEach(data1 ->System.out.println(data1));
		
		int minimumSalary=emp.stream().min(Employee::compare).get();
	
	}
	

}


