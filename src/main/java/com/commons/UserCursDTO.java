package com.commons;

import java.util.HashSet;
import java.util.Set;

public class UserCursDTO {
	private String username;
	private Set<String> courses = new HashSet<String>();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "UserCursDTO [username=" + username + ", courses=" + courses + "]";
	}
	
	
}
