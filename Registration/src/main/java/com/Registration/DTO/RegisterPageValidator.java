package com.Registration.DTO;

public class RegisterPageValidator {
	
	private boolean firstName;
	private boolean middleName;
	private boolean lastName;
	private boolean gender;
	private boolean emailId;
	private boolean phoneNumber;
	private boolean nationality;
	
	
	
	
	
	
	public RegisterPageValidator() {
		super();
	}
	public RegisterPageValidator(boolean firstName, boolean middleName, boolean lastName, boolean gender,
			boolean emailId, boolean phoneNumber, boolean nationality) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
	}
	public boolean isFirstName() {
		return firstName;
	}
	public void setFirstName(boolean firstName) {
		this.firstName = firstName;
	}
	public boolean isMiddleName() {
		return middleName;
	}
	public void setMiddleName(boolean middleName) {
		this.middleName = middleName;
	}
	public boolean isLastName() {
		return lastName;
	}
	public void setLastName(boolean lastName) {
		this.lastName = lastName;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public boolean isEmailId() {
		return emailId;
	}
	public void setEmailId(boolean emailId) {
		this.emailId = emailId;
	}
	public boolean isPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(boolean phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isNationality() {
		return nationality;
	}
	public void setNationality(boolean nationality) {
		this.nationality = nationality;
	}
	
	

	
	
}
