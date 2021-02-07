package com.cognizant.designPrinciples.mediatorPattern;

public interface IUser {
	
	public void receiveMessage(String rmsg);
	public void sendMessage(String smsg);
	
}
