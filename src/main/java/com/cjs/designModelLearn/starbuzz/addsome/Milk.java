package com.cjs.designModelLearn.starbuzz.addsome;

import com.cjs.designModelLearn.starbuzz.Beverage;
import com.cjs.designModelLearn.starbuzz.CondimentDecorator;

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
