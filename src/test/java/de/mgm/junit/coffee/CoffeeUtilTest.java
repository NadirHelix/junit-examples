package de.mgm.junit.coffee;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.mgm.junit.coffee.data.Coffee;
import de.mgm.junit.coffee.data.CoffeeProperty;
import de.mgm.junit.coffee.data.Milk;
import de.mgm.junit.coffee.data.Sugar;
import de.mgm.junit.coffee.data.Sugar.SugarType;

/**
 * Test for the CoffeeUtil.
 * 
 * @author pmueller
 */
public class CoffeeUtilTest {
	
	@Test
	public void testDoesCoffeeContainMilk() {
		
		Coffee coffee = prepareCoffee(true);
		
		boolean result = CoffeeUtil.doesCoffeeContainMilk(coffee);
		
		assertTrue("No Milk insde", result);		
	}
	
	@Test
	public void testDoesCoffeeContainMilkOnlySugar() {
		
		Coffee coffee = prepareCoffee(false);
		
		boolean result = CoffeeUtil.doesCoffeeContainMilk(coffee);
		
		assertFalse(result);
	}

	
	
	
	private Coffee prepareCoffee(boolean withMilk) {
		
		CoffeeProperty coffeeProperty;
		if (withMilk) {
			coffeeProperty = new Milk(3.5, 100, false);
		} else {
			coffeeProperty = new Sugar(SugarType.PIECES, 2.0);
		}
		
		Coffee coffee = new Coffee();
		coffee.addProperty(coffeeProperty);
		
		return coffee;
	}

}
