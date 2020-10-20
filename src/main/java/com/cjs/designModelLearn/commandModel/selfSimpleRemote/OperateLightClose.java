package com.cjs.designModelLearn.commandModel.selfSimpleRemote;

public class OperateLightClose implements Command{
    private Light light;

    public OperateLightClose(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
