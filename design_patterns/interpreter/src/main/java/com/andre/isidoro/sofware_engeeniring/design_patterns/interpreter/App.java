package com.andre.isidoro.sofware_engeeniring.design_patterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String roman = "MMCDXXVIIVI";
		Context context = new Context(roman);

		// Build the 'parse tree'
		List<Expression> tree = new ArrayList<>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		// Interpret
		for (Expression exp : tree) {
			exp.Interpret(context);
		}
		System.out.println(roman + " = " + context.getOutput());
	}
}
