package com.cjs.designModelLearn.observerDemo.starbuzz.selfStarBuzz.drink;

import com.cjs.designModelLearn.observerDemo.starbuzz.selfStarBuzz.BaseModel;

public class Milk extends BaseModel {

    public Milk(){
        this.description = "I am Milk";
    }


    @Override
    public double costDrink() {
        return 10;
    }
}
