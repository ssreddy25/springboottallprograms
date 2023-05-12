package com.ojas.entity;

public class Spesilist {
	
	private int spId;
	private String speName;
	
	public Spesilist(){}

	public Spesilist(int spId, String speName) {
		
		this.spId = spId;
		this.speName = speName;
	}

	public int getSpId() {
		return spId;
	}

	public void setSpId(int spId) {
		this.spId = spId;
	}

	public String getSpeName() {
		return speName;
	}

	public void setSpeName(String speName) {
		this.speName = speName;
	}

	@Override
	public String toString() {
		return "Spesilist [spId=" + spId + ", speName=" + speName + "]";
	}
	
	
	
	

}
