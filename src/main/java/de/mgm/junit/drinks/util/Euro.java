package de.mgm.junit.drinks.util;

public class Euro implements Coin {

	private int amount;

	public Euro(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int getAmount() {
		return amount;
	}

}
