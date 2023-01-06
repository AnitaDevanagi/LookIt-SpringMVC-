package com.anita.LookIt.dto;

public class Customerdetails {
	private String email;
	private String model;
	private String issue;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "Customerdetails [email=" + email + ", model=" + model + ", issue=" + issue + "]";
	}
	
	
	
	
	
}
