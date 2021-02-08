package com.cognizant.designPrinciples.observerPattern;

public class MessageSubscriberThree implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}

	@Override
	public void updateState(State s) {
		System.out.println("StateSubscriberThree :: " + s.getState());		
	}

}
