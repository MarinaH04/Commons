package com.commons;

import java.util.HashSet;
import java.util.Set;

public class CursUserDTO {
	private String denumire;
	private Set<String> users = new HashSet<String>();
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public Set<String> getUsers() {
		return users;
	}
	public void setUsers(Set<String> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "CursUserDTO [denumire=" + denumire + ", users=" + users + "]";
	}

}
