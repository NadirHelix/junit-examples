package de.mgm.junit.drinks;

import de.mgm.junit.drinks.util.Coin;
import de.mgm.junit.drinks.util.Euro;
import de.mgm.junit.drinks.util.InvalidCoinException;

public class SodaMachine {
	
	private static final int THRESHOLD = 258;
	
	private boolean buttonsActive = false;
	
	private int totalAmount = 0;
	
	/**
	 * Validates that an inserted Coin is instanceof Euro add the amount to the 
	 * totalAmount.
	 *  
	 * @param coin the given Coin
	 * @throws InvalidCoinException when Coin is not instance of Euro
	 */
	public void insertCoin(Coin coin) throws InvalidCoinException {
		
		if (isCoinInvalid(coin)) {
			reject(coin); // throws InvalidCoinException
		} else {
			increaseTotalAmount(coin.getAmount());
			if (isThresholdExceeded()) {
				activateButtons();
			}
		}
	}

	private void activateButtons() {
		buttonsActive = true;
	}

	private boolean isThresholdExceeded() {
		return totalAmount > THRESHOLD;
	}

	private void increaseTotalAmount(int amount) {
		totalAmount += amount;		
	}

	private void reject(Coin coin) throws InvalidCoinException {
		throw new InvalidCoinException(coin);
	}

	private boolean isCoinInvalid(Coin coin) {
		return !(coin instanceof Euro);
	}
	
	public boolean isButtonsActive() {
		return buttonsActive;
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
	
}
