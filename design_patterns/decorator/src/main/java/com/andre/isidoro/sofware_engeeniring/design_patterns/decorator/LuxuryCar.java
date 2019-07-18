package com.andre.isidoro.sofware_engeeniring.design_patterns.decorator;

public class LuxuryCar extends CarDecorator{
	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}
