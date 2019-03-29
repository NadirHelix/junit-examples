package de.mgm.junit.coffee.data;

/**
 * Ingredient for Coffee.
 * 
 * @author pmueller
 */
public class Milk implements CoffeeProperty {
	
	private double fat;
	
	private int amountInMilliliter;
	
	private boolean isFoamedUp;
	
	
	public Milk(double fat, int amountInMilliliter, boolean isFoamedUp) {
		setFat(fat);
		setAmountInMilliliter(amountInMilliliter);
		this.setFoamedUp(isFoamedUp);
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public int getAmountInMilliliter() {
		return amountInMilliliter;
	}

	public void setAmountInMilliliter(int amountInMilliliter) {
		this.amountInMilliliter = amountInMilliliter;
	}

	public boolean isFoamedUp() {
		return isFoamedUp;
	}

	public void setFoamedUp(boolean isFoamedUp) {
		this.isFoamedUp = isFoamedUp;
	}
	
	
	
	
}
