package com.cjs.designModelLearn.commandModel.selfSimpleRemote;

public class RemoteMainDosome {

    private Command command;

    public RemoteMainDosome() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressBth(){
        command.execute();
    }
}
