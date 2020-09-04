package com.cjs.designModelLearn.decoratorModel.starbuzz.selfStarBuzz.drink;

import com.cjs.designModelLearn.decoratorModel.starbuzz.selfStarBuzz.BaseModel;

public class Milk extends BaseModel {

    public Milk(){
        this.description = "I am Milk";
    }


    @Override
    public double costDrink() {
        return 10;
    }
}
