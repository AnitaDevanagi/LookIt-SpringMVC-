package com.anita.LookIt.dto;

public class Register {
	private String firstname;
	private String surname;
	private String email;
	private String password;
	private String confirmpassword;
	private String dob;
	private String contact;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private String profile;
	
	Register(){
		System.out.println("Register Class Consructor");
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int  getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Register [firstname=" + firstname + ", surname=" + surname + ", email=" + email + ", password="
				+ password + ", confirmpassword=" + confirmpassword + ", dob=" + dob + ", contact=" + contact
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + ", profile="
				+ profile + "]";
	}
	
	 

}
