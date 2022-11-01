package com.Registration.DTO;

public class ScreenDetails {

	private String ScreenName;
	private String ScreenNumber;
	
	
	
	public ScreenDetails() {
		super();
	}
	
	public ScreenDetails(String screenName, String screenNumber) {
		super();
		ScreenName = screenName;
		ScreenNumber = screenNumber;
	}
	public String getScreenName() {
		return ScreenName;
	}
	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}
	public String getScreenNumber() {
		return ScreenNumber;
	}
	public void setScreenNumber(String screenNumber) {
		ScreenNumber = screenNumber;
	}
	
	
	
	
	
}
