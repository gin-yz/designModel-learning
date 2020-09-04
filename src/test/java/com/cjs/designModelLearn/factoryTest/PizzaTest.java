package com.cjs.designModelLearn.factoryTest;

import com.cjs.designModelLearn.factoryModel.stdFactoryModel.NYPizzaStore;
import com.cjs.designModelLearn.factoryModel.stdFactoryModel.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore pizza = new NYPizzaStore();
        pizza.orderPizza("veggie");

    }
}
