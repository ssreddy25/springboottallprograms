package manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answers {
	
	@Id
	@GeneratedValue
	private int answersId;
	private String answer;
	private String postedBy;
	
	
	public Answers(){}


	public int getAnswersId() {
		return answersId;
	}


	public void setAnswersId(int answersId) {
		this.answersId = answersId;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getPostedBy() {
		return postedBy;
	}


	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	
	
	
	

}
