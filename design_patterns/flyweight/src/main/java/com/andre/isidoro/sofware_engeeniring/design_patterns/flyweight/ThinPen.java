package com.andre.isidoro.sofware_engeeniring.design_patterns.flyweight;

public class ThinPen implements Pen {
	private final BrushSize brushSize = BrushSize.THIN;
	private String color = null;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing THIN content in color : " + color);
	}
}
