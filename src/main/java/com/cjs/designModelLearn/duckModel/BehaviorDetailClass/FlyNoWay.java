package com.cjs.designModelLearn.duckModel.BehaviorDetailClass;

import com.cjs.designModelLearn.duckModel.interfaceDemo.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是FlyNoWay");
    }
}
