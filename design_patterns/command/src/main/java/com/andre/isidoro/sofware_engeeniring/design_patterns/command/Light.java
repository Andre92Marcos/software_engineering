package com.andre.isidoro.sofware_engeeniring.design_patterns.command;

//Receiver
public class Light {
	private boolean on;
	public void switchOn() {
		on = true;
		System.out.println("Switched On");
	}

	public void switchOff() {
		on = false;
		System.out.println("Switched Off");
	}
}
