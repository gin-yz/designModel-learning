package com.cjs.designModelLearn.commandModel;

import com.cjs.designModelLearn.commandModel.selfSimpleRemote.Command;
import com.cjs.designModelLearn.commandModel.selfSimpleRemote.Light;
import com.cjs.designModelLearn.commandModel.selfSimpleRemote.OperateLightOpen;
import com.cjs.designModelLearn.commandModel.selfSimpleRemote.RemoteMainDosome;

public class SelfCommandTest {
    public static void main(String[] args) {
        Light light = new Light();

        Command command1 = new OperateLightOpen(light);

        RemoteMainDosome remoteMainDosome = new RemoteMainDosome();

        remoteMainDosome.setCommand(command1);

        remoteMainDosome.pressBth();

    }
}
