package com.cognizant.designPrinciples.observerPattern;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

	@Override
	public void updateState(State s) {
		System.out.println("StateSubscriberOne :: " + s.getState());		
	}

}
