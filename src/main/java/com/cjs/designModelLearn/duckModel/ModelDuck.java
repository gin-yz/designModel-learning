package com.cjs.designModelLearn.duckModel;

import com.cjs.designModelLearn.duckModel.BehaviorDetailClass.FlyNoWay;
import com.cjs.designModelLearn.duckModel.BehaviorDetailClass.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }
}
