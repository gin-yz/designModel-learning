package com.cjs.designModelLearn.stateModel.gumballstate;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
