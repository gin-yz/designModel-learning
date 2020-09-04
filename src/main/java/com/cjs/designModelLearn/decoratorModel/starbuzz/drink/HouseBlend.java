package com.cjs.designModelLearn.decoratorModel.starbuzz.drink;

import com.cjs.designModelLearn.decoratorModel.starbuzz.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

