package com.cognizant.designPrinciples.ChainofResponsibility;

public class Supervisor implements ILeaveRequestHandler {
	
	ILeaveRequestHandler nextHandler;
	
	@Override
	public void handleRequest(LeaveRequest leaverequest) {
		if(leaverequest.getDays()>=1 && leaverequest.getDays()<3) {
			System.out.println("Leave accepted by Supervisor");
			System.out.println("Emplyee name:"+leaverequest.getEmployeeName()+"\nTotal days:"+leaverequest.getDays());
		}
		else if(leaverequest.getDays()>=3 && leaverequest.getDays()<5){
			nextHandler=new ProjectManager();
			nextHandler.handleRequest(leaverequest);
		}
		else {
			nextHandler=new HR();
			nextHandler.handleRequest(leaverequest);			
		}
	}

}
