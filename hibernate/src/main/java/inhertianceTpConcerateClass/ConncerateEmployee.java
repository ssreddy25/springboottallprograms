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
public class ConncerateEmployee extends EmployeeConcreate {
	
	
	private int pay_per_hours;
	private String duration;
	public int getPay_per_hours() {
		return pay_per_hours;
	}
	public void setPay_per_hours(int pay_per_hours) {
		this.pay_per_hours = pay_per_hours;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
