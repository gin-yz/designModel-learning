package com.cjs.designModelLearn.selfStarBuzz.drink;

import com.cjs.designModelLearn.selfStarBuzz.BaseModel;

public class Coffee extends BaseModel {

    public Coffee(){
        this.description = "I am Coffee";
    }


    @Override
    public double costDrink() {
        return 15;
    }
}
