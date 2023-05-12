package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Qusation {
	
	@Id
	@GeneratedValue
	private int quesationId;
	private String quesationName;
	
//	@ManyToMany(mappedBy="qusation")
	@ManyToMany(targetEntity = Answers.class, cascade = { CascadeType.ALL })  
	@JoinTable(name = "q_ans",   
	            joinColumns = { @JoinColumn(name = "q_id") },   
	            inverseJoinColumns = { @JoinColumn(name = "ans_id") }) 
	private List<Answers> answers=new ArrayList<Answers>();
	
	public Qusation(){}

	public int getQuesationId() {
		return quesationId;
	}

	public void setQuesationId(int quesationId) {
		this.quesationId = quesationId;
	}

	public String getQuesationName() {
		return quesationName;
	}

	public void setQuesationName(String quesationName) {
		this.quesationName = quesationName;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
	

}
