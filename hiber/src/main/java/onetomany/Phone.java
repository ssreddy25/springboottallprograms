package onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Long number;
	
	@ManyToOne()
	@JoinColumn(name = "person_id")
	private Persons persons;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Persons getPerson() {
		return persons;
	}

	public void setPerson(Persons persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", number=" + number + ", person=" + persons + "]";
	}
	
	
	
	

}
