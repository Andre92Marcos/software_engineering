package com.andre.isidoro.sofware_engeeniring.design_patterns.chain.responsibility;

public class ATMDispenseChain {
	private DispenseChain c1;

	public ATMDispenseChain() {
		this.c1 = new Dolla50Dispenser();
		DispenseChain c2 = new Dolla20Dispenser();
		DispenseChain c3 = new Dolla10Dispenser();

		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	public void dispense(int amount) {
		this.c1.dispence(new Currency(amount));
	}
}
