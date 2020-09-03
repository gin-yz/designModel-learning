package com.cjs.designModelLearn.selfStarBuzz.drink;

import com.cjs.designModelLearn.selfStarBuzz.BaseModel;

public class Milk extends BaseModel {

    public Milk(){
        this.description = "I am Milk";
    }


    @Override
    public double costDrink() {
        return 10;
    }
}
