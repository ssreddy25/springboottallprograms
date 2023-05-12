package smapleprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



class Employe {
	public int Eid;
	public String Ename;
	public String Edept;
	public int Esal;
	public String Eaddress;
	public int age;
	public long Ephoneno;
	public int Eexperience;
	public Employe(int eid, String ename, String edept, int esal, String eaddress, int age, long ephoneno,
			int eexperience) {
		super();
		Eid = eid;
		Ename = ename;
		Edept = edept;
		Esal = esal;
		Eaddress = eaddress;
		this.age = age;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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
		return "Employe [Eid=" + Eid + ", Ename=" + Ename + ", Edept=" + Edept + ", Esal=" + Esal + ", Eaddress="
				+ Eaddress + ", age=" + age + ", Ephoneno=" + Ephoneno + ", Eexperience=" + Eexperience + "]";
	}
	
	

}
public class EmployeeData {

	public static void main(String[] args) {
		
		List<Employe> employess=new ArrayList<Employe>();
		
		employess.add(new Employe(1,"sivarama","java",45000,"hyderabad",23,9542884379l,3));
		employess.add(new Employe(2,"sivakrishna",".net",55000,"delhi",32,9542884379l,5));
		employess.add(new Employe(3,"siva","java",45000,"hyderabad",37,9542884379l,3));
		employess.add(new Employe(4,"siva","testin",45000,"hyderabad",45,9542884379l,3));
		employess.add(new Employe(5,"siva","java",45000,"delhi",30,9542884379l,3));
		employess.add(new Employe(6,"siva","paython",65000,"vijayada",25,9542884379l,3));
		
		
		System.out.println("all data ");
		employess.stream().forEach(emp ->System.out.println(emp));
		
		List<Employe> employe =employess.stream().filter(data ->data.getAge()<30).collect(Collectors.toList());
		
		System.out.println("*********************** ");
		System.out.println("*********************** ");
		System.out.println("*********************** ");
		System.out.println("Display employees whose age is less than 30.");
		employess.stream().filter(data ->data.getAge()<30).forEach(emp ->System.out.println(emp));
		
		
		employess.stream().filter(data ->data.getAge()<30).forEach(emp ->System.out.println(emp));
		
		
		Integer minnum = employess.stream().min(Employe::compareT).get();  
        Integer maxnum = elements.stream().max(Integer::compareTo).get();  
		
		
		
		
		

	}

}
