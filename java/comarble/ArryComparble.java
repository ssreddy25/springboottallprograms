package comarble;

import java.util.Arrays;

class Student implements Comparable<Student> {
	public int studentId;
	public String studentName;
	public String studentpercentage;
	public String studentAddress;

	public Student(int studentId, String studentName, String studentpercentage, String studentAddress) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.studentpercentage = studentpercentage;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		
		return  studentId + "\t" + studentName + "\t"+ studentpercentage+ "\t" + studentAddress ;
	}

	@Override
	public int compareTo(Student s) {

		return studentName.compareTo(s.studentName);
	}

}

public class ArryComparble {

	public static void main(String[] args) {
		// normal array sorting
		int[] a = { 1, 2, 3, 0, 5, 9, 0 };
		System.out.println("befor sorting");
		for (int arr : a) {
			System.out.println(arr);
		}
		System.out.println("after sorting");
		Arrays.sort(a);
		for (int arr : a) {
			System.out.println(arr);
		}
      //comparable array sorting
		Student[] stud = new Student[5];
		stud[0] = new Student(101, "siva", "90", "ts");
		stud[1] = new Student(102, "reddy", "70", "tn");
		stud[2] = new Student(103, "sankar", "80", "ap");
		stud[3] = new Student(104, "uma", "50", "ka");
		stud[4] = new Student(105, "mahi", "70", "mh");
		System.out.println("before sorting");
		
		for (Student std : stud) {
			System.out.println(std);
		}

		System.out.println("after sorting");
		
		System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
		System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
		System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
		Arrays.sort(stud);
		for (Student std : stud) {
			System.out.println(std);
		}

	}

}
