package com.andre.isidoro.sofware_engeeniring.design_patterns.singleton.innerStatic;

public class InnerStaticSingleton {

	private InnerStaticSingleton() {}
	private static class Impl{
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}
	
	public InnerStaticSingleton getInstance() {
		return Impl.INSTANCE;
	}
}
