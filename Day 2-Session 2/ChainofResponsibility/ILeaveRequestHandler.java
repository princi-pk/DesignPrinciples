package com.cognizant.designPrinciples.ChainofResponsibility;

public interface ILeaveRequestHandler {
	
	public ILeaveRequestHandler nextHandler=null;
	
	public void handleRequest(LeaveRequest leaverequest);
}
