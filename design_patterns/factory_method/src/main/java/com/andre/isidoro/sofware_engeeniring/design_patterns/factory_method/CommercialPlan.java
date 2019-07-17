package com.andre.isidoro.sofware_engeeniring.design_patterns.factory_method;

public class CommercialPlan extends Plan{

	@Override
	protected void getRate() {
		this.rate = 7.50;
	}

}
