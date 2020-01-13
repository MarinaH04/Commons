package com.commons;

public class StudProfDTO {
	private String username;
	private String denumire;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	@Override
	public String toString() {
		return "StudProfDTO [username=" + username + ", denumire=" + denumire + "]";
	}
	
}
