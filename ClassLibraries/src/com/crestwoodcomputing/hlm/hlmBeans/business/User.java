package com.crestwoodcomputing.hlm.hlmBeans.business;

import java.io.Serializable;
import java.util.GregorianCalendar;

import com.crestwoodcomputing.hlm.hlmBeans.enums.*;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private GregorianCalendar dateOfBirth;
	private Gender gender;
	private Orientation orientation;
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	public User() {
		
		this.firstName = "";
		this.lastName = "";
		this.dateOfBirth = new GregorianCalendar();
		this.gender = Gender.UNSPECIFIED;
		this.orientation = Orientation.UNSPECIFIED;
	}
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	// private Gender gender;
	// private Orientation orientation;
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public Orientation getOrientation() {
		return this.orientation;
	}
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	
	
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	
	
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	
	
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	
	
	

}
