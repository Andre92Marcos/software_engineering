package com.andre.isidoro.sofware_engeeniring.design_patterns.state;

/**
 * State design pattern example
 *
 */
public class App {
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();
	}
}
