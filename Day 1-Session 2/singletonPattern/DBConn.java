package com.cognizant.designPrinciples.singletonPattern;

public class DBConn {
	
	private static DBConn instance=new DBConn();
	
	private DBConn() {		
	}
	
	static DBConn getInstance() {
		return instance;
	}
	
	public void caller() {
		System.out.println(DBConn.getInstance());
	}
	
	public static void main(String[] args) {
		DBConn object=DBConn.getInstance();
		object.caller();
	}
}
