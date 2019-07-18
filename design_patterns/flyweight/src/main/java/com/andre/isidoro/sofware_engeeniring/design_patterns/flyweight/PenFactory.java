package com.andre.isidoro.sofware_engeeniring.design_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PenFactory {
	private static final Map<String, Pen> pensMap = new HashMap<>();

	public static Pen getThickPen(String color) {
		String key = color + "-THICK";

		Pen pen = pensMap.get(key);

		if (pen != null) {
			return pen;
		} else {
			pen = new ThickPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}

		return pen;
	}

	public static Pen getThinPen(String color) {
		String key = color + "-THIN";

		Pen pen = pensMap.get(key);

		if (pen != null) {
			return pen;
		} else {
			pen = new ThinPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}

		return pen;
	}

	public static Pen getMediumPen(String color) {
		String key = color + "-MEDIUM";

		Pen pen = pensMap.get(key);

		if (pen != null) {
			return pen;
		} else {
			pen = new MediumPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}

		return pen;
	}
}
