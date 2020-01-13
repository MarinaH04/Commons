package com.commons;

import java.util.ArrayList;
import java.util.List;

public class CursUserDTO {
	private String denumire;
	private List<String> users = new ArrayList<String>();
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "CursUserDTO [denumire=" + denumire + ", users=" + users + "]";
	}

}
