package com.andre.isidoro.sofware_engeeniring.design_patterns.chain.responsibility;

public class Dolla10Dispenser implements DispenseChain{
	
	private DispenseChain dispenseChain;

	public void setNextChain(DispenseChain nextChain) {
		this.dispenseChain = nextChain;
		
	}

	public void dispence(Currency currency) {
		if(currency.getAmount() >= 10) {
			int num = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			
			if(remainder != 0) {
				this.dispenseChain.dispence(new Currency(remainder));
			}
		}else {
			this.dispenseChain.dispence(currency);
		}
		
	}

}
