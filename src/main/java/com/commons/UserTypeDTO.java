package com.commons;

public class UserTypeDTO {
	private String tip;

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "UserTypeDTO [tip=" + tip + "]";
	}
}
