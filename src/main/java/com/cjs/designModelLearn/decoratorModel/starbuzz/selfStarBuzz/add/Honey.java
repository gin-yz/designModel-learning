package com.cjs.designModelLearn.decoratorModel.starbuzz.selfStarBuzz.add;

import com.cjs.designModelLearn.decoratorModel.starbuzz.selfStarBuzz.BaseDecorator;
import com.cjs.designModelLearn.decoratorModel.starbuzz.selfStarBuzz.BaseModel;

public class Honey extends BaseDecorator {

    public Honey(BaseModel baseModel){
        this.addCost = 2;
        this.description = " plus Honey";
        this.baseModel = baseModel;
    }

    @Override
    public double costDrink() {
        return this.baseModel.costDrink()+this.addCost;
    }

    @Override
    public String getDescription() {
        return baseModel.getDescription()+this.description;
    }

}
