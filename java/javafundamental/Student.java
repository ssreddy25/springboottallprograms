package javafundamental;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student1{
	String sName;
	int sRllNo;
	String sAdress;
	public Student1(String sName, int sRllNo, String sAdress) {
		
		this.sName = sName;
		this.sRllNo = sRllNo;
		this.sAdress = sAdress;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sAdress == null) ? 0 : sAdress.hashCode());
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		result = prime * result + sRllNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (sAdress == null) {
			if (other.sAdress != null)
				return false;
		} else if (!sAdress.equals(other.sAdress))
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		if (sRllNo != other.sRllNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student1 [sName=" + sName + ", sRllNo=" + sRllNo + ", sAdress=" + sAdress + "]";
	}
	
	
}
public class Student {

	public static void main(String[] args) {
		
		Student1  student1=new Student1("rangith",202,"hyd");
		Student1  student2=new Student1("rangith",202,"pro");
		Student1  student3=new Student1("rangith",202,"hyd");
		
		Student1  student4=new Student1("prethi",202,"ndyal");
		
		List<Student1> arr=new ArrayList<Student1>();
		arr.add(student1);
		arr.add(student2);
		arr.add(student3);
		arr.add(student3);
		for(Student1 std:arr){
			System.out.println(std);
		}
		
		List<Student1> data=arr.stream().filter(x->x.sAdress=="hyd").collect(Collectors.toList());
		System.out.println("filter ");
		for(Student1 da:data){
			System.out.println(da);
		}
		
		
		
//		System.out.println(student1);
//		
//		System.out.println(student1.hashCode());
//		System.out.println(student2.hashCode());
//		System.out.println(student3.hashCode());
//		System.out.println(student1.equals(student3));
//		System.out.println(student1.getClass());
		
		
		
	
		
		
		
		
	}

}
