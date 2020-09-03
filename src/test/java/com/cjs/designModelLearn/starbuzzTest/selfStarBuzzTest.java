package com.cjs.designModelLearn.starbuzzTest;

import com.cjs.designModelLearn.selfStarBuzz.BaseDecorator;
import com.cjs.designModelLearn.selfStarBuzz.BaseModel;
import com.cjs.designModelLearn.selfStarBuzz.add.Honey;
import com.cjs.designModelLearn.selfStarBuzz.add.Sugar;
import com.cjs.designModelLearn.selfStarBuzz.drink.Coffee;

public class selfStarBuzzTest {
    public static void main(String[] args) {
        BaseModel coffee = new Coffee();
        System.out.printf("drink:%s,cost:%s%n",coffee.getDescription(),coffee.costDrink());

        BaseDecorator coffee_add = new Honey(coffee);
        System.out.printf("drink:%s,Allcost:%s,addCost:%s%n",coffee_add.getDescription(),coffee_add.costDrink(),coffee_add.getAddCost());

        coffee_add= new Sugar(coffee_add);
        System.out.printf("drink:%s,Allcost:%s,addCost:%s%n",coffee_add.getDescription(),coffee_add.costDrink(),coffee_add.getAddCost());


    }
}
