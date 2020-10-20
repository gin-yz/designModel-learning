package com.cjs.designModelLearn.commandModel.simpleremote;

import com.cjs.designModelLearn.commandModel.selfSimpleRemote.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
