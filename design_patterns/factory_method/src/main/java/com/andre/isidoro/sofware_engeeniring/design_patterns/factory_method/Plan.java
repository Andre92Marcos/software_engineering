package com.andre.isidoro.sofware_engeeniring.design_patterns.factory_method;

public abstract class Plan {

	protected double rate;
	
	protected abstract void getRate();
	
	public void calculalte(int units) {
		System.out.println(units * rate);
	}
}
