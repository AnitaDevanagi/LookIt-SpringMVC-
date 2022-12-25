package com.anita.LookIt.dto;

public class ForgetPasswordDTO {

	private String email;
	private int otp;
	private String newpassword;
	private String confirmNewpassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmNewpassword() {
		return confirmNewpassword;
	}
	public void setConfirmNewpassword(String confirmNewpassword) {
		this.confirmNewpassword = confirmNewpassword;
	}
	@Override
	public String toString() {
		return "ForgetPassword [email=" + email + ", otp=" + otp + ", newpassword=" + newpassword
				+ ", confirmNewpassword=" + confirmNewpassword + "]";
	}
	
	
}
