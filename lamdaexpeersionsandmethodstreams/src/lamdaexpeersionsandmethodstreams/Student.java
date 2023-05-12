package lamdaexpeersionsandmethodstreams;

 class Student {
	
	
	private int id;
	private String name;
	
	private int marks;
	private String coures;
	public Student(int id, String name, int marks, String coures) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.coures = coures;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCoures() {
		return coures;
	}
	public void setCoures(String coures) {
		this.coures = coures;
	}
	
	
	
	
	
	

}
