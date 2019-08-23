package com.andre.isidoro.sofware_engeeniring.design_patterns.visitor;

public interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);
}
