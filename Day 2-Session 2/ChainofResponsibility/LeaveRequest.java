package com.cognizant.designPrinciples.ChainofResponsibility;

public class LeaveRequest {
	
	private String employeeName;
	private int days;
	
	public LeaveRequest(String employeeName, int days) {
		super();
		this.employeeName = employeeName;
		this.days = days;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
}
