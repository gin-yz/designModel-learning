package com.cjs.designModelLearn.DuckModelTest;

import com.cjs.designModelLearn.duckModel.BehaviorDetailClass.FlyWithWings;
import com.cjs.designModelLearn.duckModel.BehaviorDetailClass.MuteQuack;
import com.cjs.designModelLearn.duckModel.Duck;
import com.cjs.designModelLearn.duckModel.ModelDuck;


public class Main {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new MuteQuack());
        duck.performFly();
        duck.performQuack();

    }
}
