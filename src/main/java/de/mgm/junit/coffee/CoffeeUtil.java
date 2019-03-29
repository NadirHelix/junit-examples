package de.mgm.junit.coffee;

import java.util.List;

import de.mgm.junit.coffee.data.Coffee;
import de.mgm.junit.coffee.data.CoffeeProperty;
import de.mgm.junit.coffee.data.Milk;

/**
 * The utility class for the Coffee.
 * 
 * @author pmueller
 */
public class CoffeeUtil {
	
	private CoffeeUtil() {}
	
	/**
	 * Evaluates if the coffee contains Milk.
	 * 
	 * @param coffee 
	 * 			the coffee to be checked
	 * @return true if coffee contains Mill.
	 */
	public static boolean doesCoffeeContainMilk(Coffee coffee) {
		
		List<CoffeeProperty> coffeeProperties = coffee.getProperties();
		
		for (CoffeeProperty property : coffeeProperties) {
			if (property instanceof Milk) {
				return true;
			}
		}
		
		return false;
	}

}
