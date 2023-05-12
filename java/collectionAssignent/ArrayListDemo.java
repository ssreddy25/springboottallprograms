package collectionAssignent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	public String name;
	public int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
class Name implements Comparator<Student>{

	@Override
	public int  compare(Student s1, Student s2) {
		
		return s1.name.compareTo(s2.name) ;
	}
	
}
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("siva");
		ar.add("ranjith");
		ar.add("shank");
		ar.add("prasad");
		ar.add("mannu");
		ar.add("chandhu");
		ar.add("ajerya");
		//using sort method sorting the arraylist
    	ar.sort(null);
		System.out.println(ar);
		System.out.println("using compartor");
		ArrayList<Student> student=new ArrayList<Student>();
		student.add(new Student("siva",101));
		student.add(new Student("ranjith",102));
		student.add(new Student("shank",103));
		student.add(new Student("prasad",104));
		student.add(new Student("mannu",105));
		student.add(new Student("chandhu",106));
		student.add(new Student("ajerya",107));
		student.add(new Student("reddy",108));
		
		//befor sorting
		System.out.println(student);
		Collections.sort(student, new Name());//sorting name based
		System.out.println("sorting based name");
		for(Student s:student){
			System.out.println(s);
		}

	}

}
