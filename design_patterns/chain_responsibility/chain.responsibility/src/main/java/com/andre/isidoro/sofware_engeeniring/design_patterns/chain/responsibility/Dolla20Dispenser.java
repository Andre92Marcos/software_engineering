package com.andre.isidoro.sofware_engeeniring.design_patterns.chain.responsibility;

public class Dolla20Dispenser implements DispenseChain{
	
	private DispenseChain dispenseChain;

	public void setNextChain(DispenseChain nextChain) {
		this.dispenseChain = nextChain;
		
	}

	public void dispence(Currency currency) {
		if(currency.getAmount() >= 20) {
			int num = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");
			
			if(remainder != 0) {
				this.dispenseChain.dispence(new Currency(remainder));
			}
		}else {
			this.dispenseChain.dispence(currency);
		}
		
	}

}
