package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class StudentImplementaion {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		List<Student> stu=new ArrayList<Student>();
		
		stu.add(new Student(1,"siva",34) );
		stu.add(new Student(2,"reddy",89) );
		stu.add(new Student(3,"sankar",74) );
		stu.add(new Student(4,"reddysiva",74) );
		stu.add(new Student(5,"sivasankarreddy",84) );
		
		stu.stream().min(Comparator.comparing(Student::getMarks)).ifPresent(s ->System.out.print(s.getMarks()));
		
		stu.stream().max(Comparator.comparing(Student::getMarks)).ifPresent(s ->System.out.print(s.getMarks()));
	}

}
