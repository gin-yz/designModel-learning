package com.cjs.designModelLearn.decoratorModel.starbuzz.drink;

import com.cjs.designModelLearn.decoratorModel.starbuzz.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

