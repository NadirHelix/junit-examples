package de.mgm.junit.coffee.data;

/**
 * Ingredient for Coffee.
 * 
 * @author pmueller
 */
public class Water implements CoffeeProperty {
	
	private int amountInMilliliter;

	public Water(int amountInMilliliter) {
		setAmountInMilliliters(amountInMilliliter);
	}

	public int getAmountInMilliliters() {
		return amountInMilliliter;
	}

	public void setAmountInMilliliters(int amountInMilliliter) {
		this.amountInMilliliter = amountInMilliliter;
	}

}
