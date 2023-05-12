package autowirenobytypebynameconstructor;

public class Country {
	
	private State state;
	
	

	public Country(State state) {
		
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void display(){
		System.out.println(this.state);
	}
   
}
