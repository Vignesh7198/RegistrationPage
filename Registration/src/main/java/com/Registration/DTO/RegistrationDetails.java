package com.Registration.DTO;

import java.util.List;

public class RegistrationDetails {
	
	private ScreenDetails screenanme;

	
	private List<Registration> ScreenUiDetails;
	
	
	private RegisterPageValidator validator;
	
	
	


	public RegistrationDetails(ScreenDetails screenanme, List<Registration> screenUiDetails,
			RegisterPageValidator validator) {
		super();
		this.screenanme = screenanme;
		ScreenUiDetails = screenUiDetails;
		this.validator = validator;
	}

	
	

	public RegistrationDetails() {
		super();
	}




	public ScreenDetails getScreenanme() {
		return screenanme;
	}


	public void setScreenanme(ScreenDetails screenanme) {
		this.screenanme = screenanme;
	}


	public List<Registration> getScreenUiDetails() {
		return ScreenUiDetails;
	}


	public void setScreenUiDetails(List<Registration> screenUiDetails) {
		ScreenUiDetails = screenUiDetails;
	}


	public RegisterPageValidator getValidator() {
		return validator;
	}


	public void setValidator(RegisterPageValidator validator) {
		this.validator = validator;
	}
	
	
	
	
	

}
