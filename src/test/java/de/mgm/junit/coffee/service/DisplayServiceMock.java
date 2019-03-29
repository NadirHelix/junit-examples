package de.mgm.junit.coffee.service;

public class DisplayServiceMock implements DisplayService {
	
	private String displayMessage;

	@Override
	public void notifyUser(String message) {
		displayMessage = message;
	}
	
	public String getDisplayMessage() {
		return displayMessage;
	}

}
