package com.cjs.designModelLearn.starbuzz.addsome;

import com.cjs.designModelLearn.starbuzz.Beverage;
import com.cjs.designModelLearn.starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
