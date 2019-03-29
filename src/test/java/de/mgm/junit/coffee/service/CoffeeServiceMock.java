package de.mgm.junit.coffee.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.mgm.junit.coffee.data.CoffeeProperty;
import de.mgm.junit.coffee.data.Employee;

/**
 * Mock for the CoffeeService
 * 
 * @author pmueller
 */
public class CoffeeServiceMock implements CoffeeService {

	private Map<Employee, List<CoffeeProperty>> employeeFavors = new HashMap<>();
	
	@Override
	public List<CoffeeProperty> getDefaultCoffeePropertiesForEmployee(Employee employee) {
		
		return employeeFavors.get(employee);
	}
	
	public void setDefaultCoffeePropertiesForEmployee(Employee employee, List<CoffeeProperty> properties) {
		
		employeeFavors.put(employee, properties);
	}
	
}
