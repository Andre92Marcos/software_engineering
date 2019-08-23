package com.andre.isidoro.sofware_engeeniring.design_patterns.template_method;

public class GlassHouse extends HouseTemplate{
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}
}
