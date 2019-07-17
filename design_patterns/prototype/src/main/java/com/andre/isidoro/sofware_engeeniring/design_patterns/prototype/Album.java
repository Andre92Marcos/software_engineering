package com.andre.isidoro.sofware_engeeniring.design_patterns.prototype;

public class Album implements PrototypeCapable{

	private String name = null;
	
	
	@Override
	public Album clone() throws CloneNotSupportedException{
		return (Album) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Album [name=" + name + "]";
	}

}
