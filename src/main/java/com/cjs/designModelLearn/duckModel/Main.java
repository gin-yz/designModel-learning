package com.cjs.designModelLearn.duckModel;

import com.cjs.designModelLearn.duckModel.BehaviorDetailClass.FlyWithWings;
import com.cjs.designModelLearn.duckModel.BehaviorDetailClass.MuteQuack;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new MuteQuack());
        duck.performFly();
        duck.performQuack();
    }
}
