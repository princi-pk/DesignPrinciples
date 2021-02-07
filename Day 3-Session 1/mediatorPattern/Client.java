package com.cognizant.designPrinciples.mediatorPattern;

public class Client {

	public static void main(String[] args) {
		IUser user1=new BasicUser("Princi");
		IUser user2=new PremiumUser("Putul");
		
		ChatMediator chatmed=new ChatMediator();
		chatmed.addUser(user1);
		chatmed.addUser(user2);
		
		chatmed.sendMessage("Hello all");
	}

}
