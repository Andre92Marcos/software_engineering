package com.andre.isidoro.sofware_engeeniring.design_patterns.decorator;

public class CarDecorator implements Car{

	protected Car car;
	
	public CarDecorator(Car c) {
		this.car = c;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}
}
