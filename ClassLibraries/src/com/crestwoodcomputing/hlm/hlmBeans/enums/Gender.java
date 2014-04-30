package com.crestwoodcomputing.hlm.hlmBeans.enums;

public enum Gender {
	
	UNSPECIFIED("U", "Unspecified"),
	MALE("M", "Male"),
	FEMALE("F", "Female");
	
	private String genderCode;
	private String gender;
	
	private Gender(String genderCode, String gender) {
		this.genderCode = genderCode;
		this.gender = gender;
	}
	
	public String getGenderCode() {
		return this.genderCode;
	}
	
	public String getGender() {
		return this.gender;
	}
}
