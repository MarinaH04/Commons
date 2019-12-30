package com.commons;

public class UserTypeDTO {
	private String username;
	private String tip;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "UserTypeDTO [username=" + username + ", tip=" + tip + "]";
	}

	
}
