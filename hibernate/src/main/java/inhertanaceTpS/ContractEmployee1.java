package inhertanaceTpS;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id2")
public class ContractEmployee1 extends Employee1 {
	
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
