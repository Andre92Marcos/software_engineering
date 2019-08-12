package com.andre.isidoro.sofware_engeeniring.design_patterns.chain.responsibility;

/**
 * Chain Responsibility pattern example
 *
 */
public class App {
	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		int amount = 80;
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
			return;
		}

		atmDispenser.dispense(amount);

	}
}
