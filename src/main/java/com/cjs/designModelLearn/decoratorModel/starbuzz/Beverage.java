package com.cjs.designModelLearn.decoratorModel.starbuzz;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
