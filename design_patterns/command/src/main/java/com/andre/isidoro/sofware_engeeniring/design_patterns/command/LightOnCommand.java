package com.andre.isidoro.sofware_engeeniring.design_patterns.command;

public class LightOnCommand implements Command {

	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.switchOn();
	}
}
