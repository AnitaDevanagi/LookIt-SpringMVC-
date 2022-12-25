package com.anita.LookIt.dto;

public class LogInDTO {
	private String email;
	private String password;
	
	LogInDTO(){
		System.out.println("LogIndto class constructor");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LogInDTO [email=" + email + ", password=" + password + "]";
	}
	
	

}
