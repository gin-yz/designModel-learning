package com.cjs.designModelLearn.observerDemo.starbuzz.drink;

import com.cjs.designModelLearn.observerDemo.starbuzz.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

