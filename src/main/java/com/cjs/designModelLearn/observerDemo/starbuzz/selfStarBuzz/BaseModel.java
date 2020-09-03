package com.cjs.designModelLearn.observerDemo.starbuzz.selfStarBuzz;

public abstract class BaseModel {

    protected String description = "null dirink";

    public String getDescription() {
        return this.description;
    }

    public abstract double costDrink();


}
