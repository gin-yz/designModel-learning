package com.cjs.designModelLearn.selfStarBuzz;

public abstract class BaseModel {

    protected String description = "null dirink";

    public String getDescription() {
        return this.description;
    }

    public abstract double costDrink();


}
