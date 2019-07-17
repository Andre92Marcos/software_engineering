package com.andre.isidoro.sofware_engeeniring.design_patterns.adapter;

public class Captain {
	private RowingBoat rowingboat;

	public Captain(RowingBoat rowingboat) {
		super();
		this.rowingboat = rowingboat;
	}



	public void move() {
		rowingboat.row();
	}
	
	

}
