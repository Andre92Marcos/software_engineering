package com.andre.isidoro.sofware_engeeniring.design_patterns.adapter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Captain captain = new Captain(new FishingBoatAdapter(new FishingBoat()));
		captain.move();
	}
}
