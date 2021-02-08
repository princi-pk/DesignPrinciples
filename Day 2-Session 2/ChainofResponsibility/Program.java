package com.cognizant.designPrinciples.ChainofResponsibility;

public class Program {
	
	public static void main(String[] args) {
		
		LeaveRequest lr1=new LeaveRequest("Princi", 2);
		LeaveRequest lr2=new LeaveRequest("Pulkit", 4);
		LeaveRequest lr3=new LeaveRequest("Adarsh", 5);
		LeaveRequest lr4=new LeaveRequest("Karan", 7);

		ILeaveRequestHandler ilrh=new Supervisor();
		
		ilrh.handleRequest(lr1);
		ilrh.handleRequest(lr2);
		ilrh.handleRequest(lr3);
		ilrh.handleRequest(lr4);
		
	}
}
