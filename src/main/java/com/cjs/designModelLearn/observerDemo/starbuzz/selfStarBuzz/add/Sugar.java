package com.cjs.designModelLearn.observerDemo.starbuzz.selfStarBuzz.add;

import com.cjs.designModelLearn.observerDemo.starbuzz.selfStarBuzz.BaseDecorator;
import com.cjs.designModelLearn.observerDemo.starbuzz.selfStarBuzz.BaseModel;

public class Sugar extends BaseDecorator {
    public Sugar(BaseModel baseModel) {
        this.addCost = 5;
        this.description = " plus Sugar";
        this.baseModel = baseModel;
    }

    @Override
    public double costDrink() {
        return baseModel.costDrink()+this.addCost;
    }

    @Override
    public String getDescription() {
        return baseModel.getDescription()+this.description;
    }

}
