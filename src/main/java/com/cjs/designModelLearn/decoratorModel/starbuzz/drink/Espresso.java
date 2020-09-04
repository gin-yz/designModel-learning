package com.cjs.designModelLearn.decoratorModel.starbuzz.drink;

import com.cjs.designModelLearn.decoratorModel.starbuzz.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

