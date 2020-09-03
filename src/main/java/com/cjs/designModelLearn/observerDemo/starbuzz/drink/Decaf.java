package com.cjs.designModelLearn.observerDemo.starbuzz.drink;

import com.cjs.designModelLearn.observerDemo.starbuzz.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

