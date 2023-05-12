package collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		
		List<StudentComparble> student=new ArrayList();
		
		student.add(new StudentComparble("siva",121,98));
		student.add(new StudentComparble("sankar",122,80));
		student.add(new StudentComparble("reddy",123,76));
		student.add(new StudentComparble("uppu",124,90));
		student.add(new StudentComparble("sivasankar",125,80));
		
		Collections.sort(student);
		for(StudentComparble stu :student){
			System.out.println(stu);
		}

	}

}
