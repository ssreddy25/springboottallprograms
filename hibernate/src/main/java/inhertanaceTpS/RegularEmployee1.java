package inhertanaceTpS;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id1")

public class RegularEmployee1 extends Employee1 {
	
	public  float salary;
	public float bouns;
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBouns() {
		return bouns;
	}
	public void setBouns(float bouns) {
		this.bouns = bouns;
	}
	
	
	
	

}
