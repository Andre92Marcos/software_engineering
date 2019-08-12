package com.andre.isidoro.sofware_engeeniring.design_patterns.proxy;

/**
 * Proxy pattern example
 *
 */
public class App {
	public static void main(String[] args) {
		RealObject proxy = new RealObjectProxy();
		proxy.doSomething();
	}
}
