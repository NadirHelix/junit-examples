package de.mgm.junit.coffee.data;

import java.util.Collections;
import java.util.List;

/**
 * Not good
 * 
 * @author pmueller
 */
public class EmptyCup extends Coffee {

	@Override
	public List<CoffeeProperty> getProperties() {

		return Collections.emptyList();
	}
	
}
