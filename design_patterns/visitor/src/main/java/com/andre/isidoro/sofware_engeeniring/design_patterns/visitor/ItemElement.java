package com.andre.isidoro.sofware_engeeniring.design_patterns.visitor;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}
