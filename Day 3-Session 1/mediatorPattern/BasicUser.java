package com.cognizant.designPrinciples.mediatorPattern;

public class BasicUser implements IUser {
	
	public ChatMediator chatMediator;
	public String name;

	public BasicUser(String name) {
		super();
		this.name=name;
		chatMediator=new ChatMediator();
	}

	@Override
	public void receiveMessage(String rmsg) {
		System.out.println("User name: "+name);
		System.out.println("Message: "+rmsg);
	}

	@Override
	public void sendMessage(String smsg) {
		chatMediator.sendMessage(smsg);
	}

}
