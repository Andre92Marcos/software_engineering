package com.andre.isidoro.sofware_engeeniring.design_patterns.proxy;

public class RealObjectProxy implements RealObject{

	private RealObject realObjectImpl = new RealObjectImpl();
	

	public void doSomething() {
		System.out.println("Delegating work on real object");
		realObjectImpl.doSomething();
	}
}
