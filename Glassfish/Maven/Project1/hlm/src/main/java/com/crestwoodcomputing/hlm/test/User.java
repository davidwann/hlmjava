
package com.crestwoodcomputing.hlm.test;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "user", eager = true)
public class User {

	public User() {
		System.out.println("User from test package started!");
	}
	
	public String getFirstName() {
		return "Teddy Test";
	}

}
