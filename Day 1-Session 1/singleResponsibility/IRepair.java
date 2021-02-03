package com.cognizant.designPrinciples.singleResponsibility;

public interface IRepair {
	
	void processPhoneRepair(String modelName);
	
	void processAccessoryRepair(String accessoryType);

}
