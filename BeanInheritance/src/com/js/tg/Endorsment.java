package com.js.tg;

public class Endorsment {

	private String updatedName;
	@Override
	public String toString() {
		return "Endorsment [updatedName=" + updatedName + ", updatedAge=" + updatedAge + ", updatedGender="
				+ updatedGender + ", updatedAddress=" + updatedAddress + "]";
	}
	private int updatedAge;
	private String updatedGender;
	private String updatedAddress;
	public void setUpdatedName(String updatedName) {
		this.updatedName = updatedName;
	}
	public void setUpdatedAge(int updatedAge) {
		this.updatedAge = updatedAge;
	}
	public void setUpdatedGender(String updatedGender) {
		this.updatedGender = updatedGender;
	}
	public void setUpdatedAddress(String updatedAddress) {
		this.updatedAddress = updatedAddress;
	}
	
	
	
	
	
	
}
