package com.cjs.designModelLearn.observerDemo.starbuzz.addsome;

import com.cjs.designModelLearn.observerDemo.starbuzz.Beverage;
import com.cjs.designModelLearn.observerDemo.starbuzz.CondimentDecorator;

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
