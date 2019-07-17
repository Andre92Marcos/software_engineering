package com.andre.isidoro.sofware_engeeniring.design_patterns.factory_method;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        GetPlanFactory planFactory = new GetPlanFactory();
        
        Plan p = planFactory.getPlan("domesticplan");
        p.getRate();
        p.calculalte(1);
    }
}
