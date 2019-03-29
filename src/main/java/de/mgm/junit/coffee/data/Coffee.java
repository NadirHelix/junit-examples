package de.mgm.junit.coffee.data;

import java.util.ArrayList;
import java.util.List;

/**
 * The most important nutrition for software developers.
 * 
 * @author pmueller
 */
public class Coffee {

	private List<CoffeeProperty> properties = new ArrayList<>();
	
	public Coffee() {}
	
	public Coffee(List<CoffeeProperty> properties) {
		this.properties = properties;
	}

	public void addProperty(CoffeeProperty property) {
		properties.add(property);
	}

	public List<CoffeeProperty> getProperties() {
		return properties ;
	}

}
