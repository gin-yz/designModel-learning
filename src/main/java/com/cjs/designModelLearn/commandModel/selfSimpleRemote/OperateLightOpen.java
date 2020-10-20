package com.cjs.designModelLearn.commandModel.selfSimpleRemote;

public class OperateLightOpen implements Command{

    private Light light;

    public OperateLightOpen(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
