package com.commons;

import java.util.ArrayList;
import java.util.List;

public class UserCursDTO {
	private String username;
	private List<String> courses = new ArrayList<String>();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "UserCursDTO [username=" + username + ", courses=" + courses + "]";
	}
	
	
}
