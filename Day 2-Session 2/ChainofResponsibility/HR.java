package com.cognizant.designPrinciples.ChainofResponsibility;

public class HR implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest leaverequest) {
		if(leaverequest.getDays()>=5) {
			System.out.println("Leave accepted by HR");
			System.out.println("Emplyee name:"+leaverequest.getEmployeeName()+"\nTotal days:"+leaverequest.getDays());
		}
	}

}
