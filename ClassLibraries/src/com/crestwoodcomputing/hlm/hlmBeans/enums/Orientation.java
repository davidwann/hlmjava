package com.crestwoodcomputing.hlm.hlmBeans.enums;

public enum Orientation {
	
	UNSPECIFIED("U", "Unspecified"),
	STRAIGHT("S", "Straight"),
	GAY("G", "Gay"),
	BISEXUAL("B", "Bisexual");
	
	private String orientationCode;
	private String orientation;
	
	private Orientation(String orientationCode, String orientation) {
		this.orientationCode = orientationCode;
		this.orientation = orientation;
	}
	
	public String getOrientationCode() {
		return this.orientationCode;
	}
	
	public String getOrientation() {
		return this.orientation;
	}
}
