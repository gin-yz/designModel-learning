package com.cjs.designModelLearn.decoratorModel.starbuzz.selfStarBuzz.drink;

import com.cjs.designModelLearn.decoratorModel.starbuzz.selfStarBuzz.BaseModel;

public class Coffee extends BaseModel {

    public Coffee(){
        this.description = "I am Coffee";
    }


    @Override
    public double costDrink() {
        return 15;
    }
}
