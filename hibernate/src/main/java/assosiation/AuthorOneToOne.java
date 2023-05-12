package assosiation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthorOneToOne {
	@Id
	private int authorID;
	private String authourName;
	
	
	public AuthorOneToOne(){}


	public AuthorOneToOne(int authorID, String authourName) {
		
		this.authorID = authorID;
		this.authourName = authourName;
	}


	public int getAuthorID() {
		return authorID;
	}


	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}


	public String getAuthourName() {
		return authourName;
	}


	public void setAuthourName(String authourName) {
		this.authourName = authourName;
	}
	
	
	
	

}
