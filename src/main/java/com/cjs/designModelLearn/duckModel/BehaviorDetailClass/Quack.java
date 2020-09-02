package com.cjs.designModelLearn.duckModel.BehaviorDetailClass;

import com.cjs.designModelLearn.duckModel.interfaceDemo.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是ｑｕａｃｋ");
    }
}
