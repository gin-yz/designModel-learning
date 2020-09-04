package com.cjs.designModelLearn.decoratorModel.starbuzz.drink;

import com.cjs.designModelLearn.decoratorModel.starbuzz.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

