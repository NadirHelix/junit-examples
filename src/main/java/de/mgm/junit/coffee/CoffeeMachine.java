package de.mgm.junit.coffee;

import de.mgm.junit.coffee.data.Coffee;
import de.mgm.junit.coffee.data.Employee;

/**
 * The CoffeeMachine interface.
 * 
 * @author pmueller
 */
public interface CoffeeMachine {

	/**
	 * Returns a coffee that matches the taste of the given employee 
	 * Or an EmptyCup in case no properties are available.
	 * 
	 * @param employee
	 * 				the tired employee who needs coffee
	 * @return the favored coffee of the employee
	 */
	Coffee getDefaultCoffee(Employee employee);
	
	

}
