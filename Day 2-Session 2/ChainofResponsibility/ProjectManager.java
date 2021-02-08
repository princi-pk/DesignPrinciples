package com.cognizant.designPrinciples.ChainofResponsibility;

public class ProjectManager implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest leaverequest) {
		if(leaverequest.getDays()>=3 && leaverequest.getDays()<5) {
			System.out.println("Leave accepted by Project Manager");
			System.out.println("Emplyee name:"+leaverequest.getEmployeeName()+"\nTotal days:"+leaverequest.getDays());
		}
				
	}

}
