package constrouterinjection;

public class Student {
	
	private String studentName;
	private String studentMarks;
	
	
	public Student(String studentName, String studentMarks) {
		
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
	}
	
	

}
