package com.cjs.designModelLearn.combiningLearn.observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
