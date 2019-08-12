package com.andre.isidoro.sofware_engeeniring.design_patterns.chain.responsibility;

public class Dolla50Dispenser implements DispenseChain{
	
	private DispenseChain dispenseChain;

	public void setNextChain(DispenseChain nextChain) {
		this.dispenseChain = nextChain;
		
	}

	public void dispence(Currency currency) {
		if(currency.getAmount() >= 50) {
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
			
			if(remainder != 0) {
				this.dispenseChain.dispence(new Currency(remainder));
			}
		}else {
			this.dispenseChain.dispence(currency);
		}
		
	}

}
