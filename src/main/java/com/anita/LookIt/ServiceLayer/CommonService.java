package com.anita.LookIt.ServiceLayer;


import com.anita.LookIt.Entity.CustomerDetails;
import com.anita.LookIt.dto.Customerdetails;
import com.anita.LookIt.dto.ForgetPasswordDTO;
import com.anita.LookIt.dto.LogInDTO;
import com.anita.LookIt.dto.Register;




public interface CommonService {
	public String validateandSave(Register register);
	
	public String validateandLogin(LogInDTO login);
	
	public String validateandsendotp(String email);
	
	public String validateandupdatepassword(ForgetPasswordDTO dto);
	
	public String validateandsavecustomerdetails(Customerdetails customer);
	
	public CustomerDetails getmyprofile(String email);
	
	

}