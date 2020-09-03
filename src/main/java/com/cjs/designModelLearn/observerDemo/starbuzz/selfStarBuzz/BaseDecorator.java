package com.cjs.designModelLearn.observerDemo.starbuzz.selfStarBuzz;

public abstract class BaseDecorator extends BaseModel {
    protected double addCost;
    public BaseModel baseModel;


    @Override
    public abstract String getDescription();

    public double getAddCost() {
        if (baseModel instanceof BaseDecorator) {
            BaseDecorator baseDecoratorModel = (BaseDecorator) baseModel;
            return baseDecoratorModel.getAddCost() + this.addCost;
        } else {
            return this.addCost;
        }
    }
}

