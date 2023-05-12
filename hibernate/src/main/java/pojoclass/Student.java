package pojoclass;

public class Student {
	
	public int sid;
	public String studentName;
	public String studentMarks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
	}
	
	

}
