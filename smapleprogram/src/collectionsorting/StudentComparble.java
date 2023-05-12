package collectionsorting;

public class StudentComparble  implements Comparable<StudentComparble>{

	String name;
	int id;
	int marks;
	public StudentComparble(String name, int id, int marks) {
		
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentComparble [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(StudentComparble stu) {
		if(this.getMarks()<stu.getMarks()){
			return 1;
		}
		else{
			return -1;
		}
	}
	
	
	
}
