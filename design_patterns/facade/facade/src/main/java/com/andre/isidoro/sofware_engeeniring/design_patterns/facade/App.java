package com.andre.isidoro.sofware_engeeniring.design_patterns.facade;

/**
 * facade
 *
 */
public class App {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
