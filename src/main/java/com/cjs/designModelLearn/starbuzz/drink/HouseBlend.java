package com.cjs.designModelLearn.starbuzz.drink;

import com.cjs.designModelLearn.starbuzz.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

