package com.commons;

import java.util.Date;

public class PrezentaDTO {
	private String username;
	private String denumire;
	private Boolean Present;
	private Date date;
	
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
	public Boolean getPresent() {
		return Present;
	}
	public void setPresent(Boolean present) {
		Present = present;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "PrezentaDTO [username=" + username + ", denumire=" + denumire + ", Present=" + Present + ", date="
				+ date + "]";
	}
	
	
	
}
