package com.cjs.designModelLearn.decoratorModel.starbuzz.addsome;

import com.cjs.designModelLearn.decoratorModel.starbuzz.Beverage;
import com.cjs.designModelLearn.decoratorModel.starbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
