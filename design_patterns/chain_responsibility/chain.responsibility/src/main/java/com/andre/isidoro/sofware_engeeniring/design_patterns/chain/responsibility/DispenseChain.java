package com.andre.isidoro.sofware_engeeniring.design_patterns.chain.responsibility;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	
	void dispence(Currency currency);
}
