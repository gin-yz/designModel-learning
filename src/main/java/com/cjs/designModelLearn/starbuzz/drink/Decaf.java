package com.cjs.designModelLearn.starbuzz.drink;

import com.cjs.designModelLearn.starbuzz.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

