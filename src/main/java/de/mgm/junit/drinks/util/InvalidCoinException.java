package de.mgm.junit.drinks.util;

public class InvalidCoinException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final transient Coin coin;

	public InvalidCoinException(Coin coin) {
		this.coin = coin;
	}

	public Coin getCoin() {
		return coin;
	}

}
