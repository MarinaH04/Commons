package com.commons;

public class CursDTO {
	private String denumire;

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	@Override
	public String toString() {
		return "CursDTO [denumire=" + denumire + "]";
	}
	
}
