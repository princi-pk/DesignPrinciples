package com.cognizant.designPrinciples.observerPattern;

public class State {
	
	private int stateDetail;

	public State(int stateDetail) {
		super();
		this.stateDetail = stateDetail;
	}

	public int getState() {
		return stateDetail;
	}

	public void setState(int stateDetail) {
		this.stateDetail = stateDetail;
	}	
	
}
