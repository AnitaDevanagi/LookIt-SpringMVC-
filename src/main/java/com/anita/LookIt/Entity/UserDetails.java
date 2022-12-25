package com.anita.LookIt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
    @Id
	@Column(name="id")
	private int id;
    @Column(name="firstname")
	private String firstname;
    @Column(name="surname")
	private String surname;
    @Column(name="email")
	private String email;
    @Column(name="password")
	private String password;
   @Column(name="date_of_birth")
	private String date_of_birth;
    @Column(name="contact")
	private String contact;
    @Column(name="city")
	private String city;
    @Column(name="state")
	private String state;
    @Column(name="country")
	private String country;
    @Column(name="pincode")
	private int pincode;
    @Column(name="otp")
    private int otp;
    @Column(name="profile")
    private String profile;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
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
	public void setPincode(int  pincode) {
		this.pincode = pincode;
	}
	
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", email=" + email
				+ ", password=" + password + ", date_of_birth=" + date_of_birth + ", contact=" + contact + ", city="
				+ city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + ", otp=" + otp
				+ ", profile=" + profile + "]";
	}
	
	
    
    
	
}
