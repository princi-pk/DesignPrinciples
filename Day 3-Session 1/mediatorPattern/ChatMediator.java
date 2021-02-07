package com.cognizant.designPrinciples.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
	
	public List<IUser> users;

	public ChatMediator() {
		super();
		users=new ArrayList<IUser>();
	}

	@Override
	public void addUser(IUser newuser) {
		users.add(newuser);
	}

	@Override
	public void sendMessage(String msg) {
		for(IUser iuser:users) {
			iuser.receiveMessage(msg);
		}
	}

}
