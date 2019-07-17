package com.andre.isidoro.sofware_engeeniring.design_patterns.prototype;

public class Movie implements PrototypeCapable{

	private String name = null;
	
	
	@Override
	public Movie clone() throws CloneNotSupportedException{
		return (Movie) super.clone();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + "]";
	}
	
	
}
