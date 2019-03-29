package de.mgm.junit.coffee;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

import de.mgm.junit.coffee.data.Coffee;
import de.mgm.junit.coffee.data.CoffeeProperty;
import de.mgm.junit.coffee.data.Employee;
import de.mgm.junit.coffee.data.EmptyCup;
import de.mgm.junit.coffee.service.CoffeeService;
import de.mgm.junit.coffee.service.DisplayService;

/**
 * The default implementation of a CoffeeMachine.
 * 
 * @author pmueller
 */
public class DefaultCoffeeMachine implements CoffeeMachine {
	
	private CoffeeService coffeeService;

	private DisplayService displayService;
	
	/**
	 * Returns a coffee that matches the taste of the given employee.
	 * Or an EmptyCup in case not properties are available.
	 * 
	 * @param employee
	 * 				the tired employee who needs coffee
	 * @return the favored coffee of the employee
	 */
	@Override
	public Coffee getDefaultCoffee(Employee employee) {
		
		List<CoffeeProperty> coffeeProperties = 
				coffeeService.getDefaultCoffeePropertiesForEmployee(employee);
		
		Coffee result;
		
		if (CollectionUtils.isNotEmpty(coffeeProperties)) {
		
			result = createCoffee(coffeeProperties);
		
		} else {
		
			result =  new EmptyCup();
		
		}
		
		return result;
	}

	private Coffee createCoffee(List<CoffeeProperty> coffeeProperties) {

		Coffee result = new Coffee();
		
		for (CoffeeProperty property : coffeeProperties) {
			result.addProperty(property);
		}
		
		return result;
	}

	protected void displayNoDefaultCoffeeMessage(Employee employee) {
		displayService.notifyUser(
				"Could not create default coffee for " +
				employee.getName() +
				" due to missing properties.");
	}

	
	/* Getters and Setters */
	
	public CoffeeService getCoffeeService() {
		return coffeeService;
	}

	public void setCoffeeService(CoffeeService coffeeService) {
		this.coffeeService = coffeeService;
	}

	public DisplayService getDisplayService() {
		return displayService;
	}

	public void setDisplayService(DisplayService displayService) {
		this.displayService = displayService;
	}
}
