package com.andre.isidoro.sofware_engeeniring.design_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	public static class ModelType{
		public static final String MOVIE = "movie";
		public static final String ALBUM = "album";
		public static final String SHOW = "show";
	}
	
	private static Map<String, PrototypeCapable> prototypes = new HashMap<>();
	
	static {
		prototypes.put(ModelType.MOVIE, new Movie());
		prototypes.put(ModelType.ALBUM, new Album());
		prototypes.put(ModelType.SHOW, new Show());
		
	}
	
	public static PrototypeCapable getPrototype(final String s)throws CloneNotSupportedException{
		return (PrototypeCapable) prototypes.get(s).clone();
	}
}
