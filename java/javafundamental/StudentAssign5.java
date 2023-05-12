package javafundamental;

import java.util.Arrays;

/**
 * 
 * @author su22034
 *
 *         5. Create class Student (roll number, name, number of subjects, marks
 *         of eachsubject).No. of subjects varies for each student. Write a
 *         parameterizedconstructor which initializes roll number, name, number
 *         of subjects and createthe array of marks dynamically. Display details
 *         of all students with percentageand class obtained. Use inner class
 *         too.
 *
 *
 *
 */
class Subject{
	public String subject1;
	public String subject2;
	public String subject3;
	public String subject4;
	public String subject5;
	public String subject6;
	public Subject(String subject1, String subject2, String subject3, String subject4, String subject5,
			String subject6) {
		
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.subject6 = subject6;
	}
	@Override
	public String toString() {
		return "Subject [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + ", subject4="
				+ subject4 + ", subject5=" + subject5 + ", subject6=" + subject6 + "]";
	}
	
	
}
class Student{
	public int studentRollNumbr;
	public String StudentName;
	public Subject subject;
	public int[] marks;
	public Student(int studentRollNumbr, String studentName, Subject subject, int[] marks) {
	
		this.studentRollNumbr = studentRollNumbr;
		StudentName = studentName;
		this.subject = subject;
		this.marks = marks;
	}
	
	public double percentageStudent(){
		double perce=0;
		int sum=0;
		for(int i=0;i<marks.length;++i){
		      sum=sum+marks[i];
		}
		perce=sum/marks.length+1;
		return perce;
	}

	@Override
	public String toString() {
		return "Student [studentRollNumbr=" + studentRollNumbr + ", StudentName=" + StudentName + ", subject=" + subject
				+ ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
	
}
public class StudentAssign5  {

	public static void main(String[] args) {
		Subject subject=new Subject("telugu","hindi","english","math","physics","chemestry");
		 int[] marks={89,79,80,90,67,87};
		Student student1=new Student(101,"siva",subject,marks);
		double result=student1.percentageStudent();
		System.out.println(student1+"\n"+"percentage of the student is "+"\n"+result);
		
		int[] marks1={80,79,87,90,57,90};
		Student student2=new Student(101,"siva",subject,marks1);
		double result1=student2.percentageStudent();
		System.out.println(student2+"\n"+"percentage of the student is "+"\n"+result1);
		
		int[] marks2={69,99,85,60,97,77};
		Student student3=new Student(101,"siva",subject,marks);
		double result3=student2.percentageStudent();
		System.out.println(student3+"\n"+"percentage of the student is "+"\n"+result3);

	}

}
