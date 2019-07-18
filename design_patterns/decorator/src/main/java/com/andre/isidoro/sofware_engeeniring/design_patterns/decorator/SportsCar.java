package com.andre.isidoro.sofware_engeeniring.design_patterns.decorator;

public class SportsCar extends CarDecorator{
	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports Car");
	}
}
