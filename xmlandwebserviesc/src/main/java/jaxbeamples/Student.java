package jaxbeamples;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	
	private int studentId;
	private String studentName;
	private String studentMarks;
	
	public Student(){}
	
	

	public Student(int studentId, String studentName, String studentMarks) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}



	@XmlAttribute
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	@XmlElement
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@XmlElement
	public String getStudentMarks() {
		return studentMarks;
	}
	
	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	

}
