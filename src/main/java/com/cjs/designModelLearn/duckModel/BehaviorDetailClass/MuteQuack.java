package com.cjs.designModelLearn.duckModel.BehaviorDetailClass;

import com.cjs.designModelLearn.duckModel.interfaceDemo.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是ＭｕｔｅＱｕａｃｋ");
    }
}
