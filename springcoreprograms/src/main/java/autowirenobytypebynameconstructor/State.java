package autowirenobytypebynameconstructor;

public class State {
	
	private String stateName;

	

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + "]";
	}
	
	
	
	

}
