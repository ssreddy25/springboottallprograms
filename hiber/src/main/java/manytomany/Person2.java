package manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "person_project" ,joinColumns =@JoinColumn(name="peerson_id") ,inverseJoinColumns =@JoinColumn(name="project_id"))
	private List<Project> project;
	
	
	
	
	

}
