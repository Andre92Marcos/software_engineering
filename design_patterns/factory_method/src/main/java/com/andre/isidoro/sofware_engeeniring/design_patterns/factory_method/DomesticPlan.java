package com.andre.isidoro.sofware_engeeniring.design_patterns.factory_method;

public class DomesticPlan extends Plan{

	@Override
	protected void getRate() {
		this.rate = 3.50;
		
	}
}
