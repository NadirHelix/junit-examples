package de.mgm.junit.coffee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import de.mgm.junit.coffee.data.Coffee;
import de.mgm.junit.coffee.data.CoffeeBean;
import de.mgm.junit.coffee.data.CoffeeProperty;
import de.mgm.junit.coffee.data.Employee;
import de.mgm.junit.coffee.data.EmptyCup;
import de.mgm.junit.coffee.data.Milk;
import de.mgm.junit.coffee.data.SoftwareEngineer;
import de.mgm.junit.coffee.data.Sugar;
import de.mgm.junit.coffee.data.Sugar.SugarType;
import de.mgm.junit.coffee.service.DisplayServiceMock;
import de.mgm.junit.coffee.data.Water;
import de.mgm.junit.coffee.service.CoffeeService;
import de.mgm.junit.coffee.service.DisplayService;

/**
 * The test for the default Coffee machine.
 * 
 * @author pmueller
 */
public class DefaultCoffeeMachineTest {
	
	@InjectMocks
	private DefaultCoffeeMachine coffeeMachine = new DefaultCoffeeMachine();
	
	@Mock
	private CoffeeService coffeeService;
	
	private DisplayService displayService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		prepareMocks();
	}

	
	
	@Test
	public void testGetDefaultCoffee() {
		
		Employee employee = createEmployee();
		Coffee coffee = prepareCoffeeForEmployee(employee);
		
		Coffee result = coffeeMachine.getDefaultCoffee(employee);
		
		assertProperties(coffee.getProperties(), result.getProperties());
	}
	
	
	
	@Test
	public void testGetDefaultCoffeeNoPropertiesAvailable() {
		
		Employee employee = createEmployee();
		prepareEmptyCupForEmployee(employee);
		
		Coffee result = coffeeMachine.getDefaultCoffee(employee);
		
		assertTrue(result instanceof EmptyCup);
	}

	
	private void assertProperties(List<CoffeeProperty> coffeeProperties, List<CoffeeProperty> resultProperties) {
		
		assertTrue(resultProperties.containsAll(coffeeProperties));
		assertEquals(coffeeProperties.size(), resultProperties.size());
	}

	
	/* preparation methods */
	
	private Employee createEmployee() {
		
		return new SoftwareEngineer();
	}

	private Coffee prepareCoffeeForEmployee(Employee employee) {
		
		List<CoffeeProperty> properties = new ArrayList<>();
		
		properties.add(new Water(250));
		properties.add(new CoffeeBean(50));
		properties.add(new Milk(1.5, 50, true));
		properties.add(new Sugar(SugarType.WHITE, 10.5));
		
		Mockito.doReturn(properties).when(coffeeService).getDefaultCoffeePropertiesForEmployee(employee);
		coffeeMachine.setCoffeeService(coffeeService);
		
		return new Coffee(properties);
	}

	private void prepareEmptyCupForEmployee(Employee employee) {

	}
	
	private void prepareMocks() {		
		displayService = new DisplayServiceMock();
		coffeeMachine.setDisplayService(displayService);
	}

}
