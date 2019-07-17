package com.andre.isidoro.sofware_engeeniring.design_patterns.singleton.doubleLock;

public class LazySingletonDoubleLock {

	private static LazySingletonDoubleLock instance;
	
	private LazySingletonDoubleLock() {}
	
	public static LazySingletonDoubleLock getInstance() {
		if(instance == null) {
			synchronized (LazySingletonDoubleLock.class) {
				if (instance == null){
					instance = new LazySingletonDoubleLock();
				}
			}
		}
		return instance;
	}
}
