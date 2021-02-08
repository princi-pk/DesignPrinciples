package com.cognizant.designPrinciples.observerPattern;

public interface Observer {
	
	public void update(Message m);
	public void updateState(State s);

}
