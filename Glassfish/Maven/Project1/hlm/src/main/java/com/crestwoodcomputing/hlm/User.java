
package com.crestwoodcomputing.hlm;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "user", eager = true)
public class User {

	public User() {
		System.out.println("User started!");
	}
	
	public String getFirstName() {
		return "David";
	}

}
