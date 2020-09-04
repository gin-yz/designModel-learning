package com.cjs.designModelLearn.factoryTest;

import com.cjs.designModelLearn.factoryModel.SimpFactoryModel.PizzaStore;
import com.cjs.designModelLearn.factoryModel.SimpFactoryModel.WuhanPizzaFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new WuhanPizzaFactory());
        pizzaStore.orderPizza("veggie");
    }
}
