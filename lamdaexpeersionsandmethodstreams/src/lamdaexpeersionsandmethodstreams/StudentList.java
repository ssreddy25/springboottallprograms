package lamdaexpeersionsandmethodstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentList {

	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<>();
		
		student.add(new Student(101,"ranjith",89,"cse"));
		student.add(new Student(102,"siva",99,"ece"));
		student.add(new Student(103,"rames",69,"cse"));
		student.add(new Student(104,"manu",99,"it"));
		student.add(new Student(105,"reddy",89,"ese"));
		student.add(new Student(106,"ranji",79,"cse"));
		student.add(new Student(107,"ranjith",59,"ca"));

		Function<Student, Integer> function= s->s.getMarks()+1; 
		
		student.stream().map(s->s.getMarks()+1).forEach(System.out::println);
		
	}

}
