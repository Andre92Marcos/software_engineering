package com.andre.isidoro.sofware_engeeniring.design_patterns.interpreter;

public class Context {
	private String input;
	private int output;
	
	public Context(String input) {
		super();
		this.input = input;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}}
