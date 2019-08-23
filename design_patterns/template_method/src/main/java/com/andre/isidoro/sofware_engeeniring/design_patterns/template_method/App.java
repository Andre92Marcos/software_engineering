package com.andre.isidoro.sofware_engeeniring.design_patterns.template_method;

/**
 * Template Method Example
 *
 */
public class App {
	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();

		// using template method
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}
}
