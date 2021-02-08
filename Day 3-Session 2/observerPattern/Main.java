package com.cognizant.designPrinciples.observerPattern;

public class Main {
	public static void main(String[] args)
	{
		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();

		MessagePublisher p = new MessagePublisher();
		p.attach(s1);
		p.attach(s2);
		p.attach(s3);
		
		Message m=new Message("First Message");
		p.notifyUpdate(m); // s1 and s2 will receive the update

		State st=new State(3);
		p.changeState(st);

		p.detach(s1);
		p.notifyUpdate(new Message("Second Message")); // s2 and s3 will receive the update
		State st2=new State(5);
		p.changeState(st2);


	}
}
