package de.mgm.junit.coffee.service;

import java.util.List;

import de.mgm.junit.coffee.data.CoffeeProperty;
import de.mgm.junit.coffee.data.Employee;

/**
 * The Service to offer Coffee.
 * 
 * @author pmueller
 */
public interface CoffeeService {

	public List<CoffeeProperty> getDefaultCoffeePropertiesForEmployee(Employee employee);

}
