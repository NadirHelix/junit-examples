package de.mgm.junit.coffee.data;

/**
 * Ingredient for Coffee.
 * 
 * @author pmueller
 */
public class CoffeeBean implements CoffeeProperty {
	
	private int amountInGram;

	public CoffeeBean(int amountInGram) {
		setAmountInGram(amountInGram);
	}

	public int getAmountInGram() {
		return amountInGram;
	}

	public void setAmountInGram(int amountInGram) {
		this.amountInGram = amountInGram;
	}

}
