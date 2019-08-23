package com.andre.isidoro.sofware_engeeniring.design_patterns.state;

public class TVStopState implements State {
	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}
}
