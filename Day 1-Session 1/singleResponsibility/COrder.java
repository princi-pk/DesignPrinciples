package com.cognizant.designPrinciples.singleResponsibility;

public class COrder implements IOrder {

	@Override
	public void processOrder(String modelName) {
		System.out.println(String.format("%s order accepted!",modelName));
	}

}
