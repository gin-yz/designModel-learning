package com.cjs.designModelLearn.observerDemo.starbuzz.drink;

import com.cjs.designModelLearn.observerDemo.starbuzz.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

