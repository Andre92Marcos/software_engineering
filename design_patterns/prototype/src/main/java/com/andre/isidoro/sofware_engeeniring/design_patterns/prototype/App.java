package com.andre.isidoro.sofware_engeeniring.design_patterns.prototype;

import com.andre.isidoro.sofware_engeeniring.design_patterns.prototype.PrototypeFactory.ModelType;

public class App {
	public static void main(String[] args) {
		try {
			String moviePrototype = PrototypeFactory.getPrototype(ModelType.MOVIE).toString();
			System.out.println(moviePrototype);

			String albumPrototype = PrototypeFactory.getPrototype(ModelType.ALBUM).toString();
			System.out.println(albumPrototype);

			String showPrototype = PrototypeFactory.getPrototype(ModelType.SHOW).toString();
			System.out.println(showPrototype);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
