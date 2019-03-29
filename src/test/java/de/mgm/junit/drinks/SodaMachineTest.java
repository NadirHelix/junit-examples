package de.mgm.junit.drinks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.mgm.junit.drinks.util.Coin;
import de.mgm.junit.drinks.util.Dollar;
import de.mgm.junit.drinks.util.Euro;
import de.mgm.junit.drinks.util.InvalidCoinException;

public class SodaMachineTest {

	private SodaMachine sodaMachine = new SodaMachine();
	
//	@Test(expected=InvalidCoinException.class)
//	public void testInsertCoinInvalidCoin() throws InvalidCoinException {
//		Coin coin = new Dollar();
//		
//		sodaMachine.insertCoin(coin);
//	}
	
	@Test
	public void testInsertCoinBelowThreshold() throws InvalidCoinException {
		Coin coin = new Euro(100);
		
		sodaMachine.insertCoin(coin);
		
		assertFalse(sodaMachine.isButtonsActive());
		assertEquals(coin.getAmount(), sodaMachine.getTotalAmount());
	}
	
	@Test
	public void testInsertCoinMeetingThreshold() throws InvalidCoinException {
		Coin firstCoin = new Euro(100);
		Coin secondCoin = new Euro(159);
		
		sodaMachine.insertCoin(firstCoin);
		sodaMachine.insertCoin(secondCoin);
		
		assertTrue(sodaMachine.isButtonsActive());
		assertEquals(firstCoin.getAmount() + secondCoin.getAmount(), 
				sodaMachine.getTotalAmount());
	}
	
}
