package de.mgm.junit.coffee.data;

/**
 * Ingredient for Coffee.
 * 
 * @author pmueller
 */
public class Sugar implements CoffeeProperty {
	
	/**
	 * Sugar classification 
	 * 
	 * @author pmueller
	 */
	public enum SugarType {
		WHITE, BROWN, PIECES, CANDIS, POWDER;
	}
	
	private SugarType type;
	
	private double amount;
	
	public Sugar(SugarType type, double amount) {
		setType(type);
		setAmount(amount);
	}

	public SugarType getType() {
		return type;
	}

	public void setType(SugarType type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
