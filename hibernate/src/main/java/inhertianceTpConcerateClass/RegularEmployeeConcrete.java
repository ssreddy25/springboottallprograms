package inhertianceTpConcerateClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity

@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name")) 
	
})
public class RegularEmployeeConcrete extends EmployeeConcreate {
	
private float salary;
private String bouns;
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getBouns() {
	return bouns;
}
public void setBouns(String bouns) {
	this.bouns = bouns;
}



}
