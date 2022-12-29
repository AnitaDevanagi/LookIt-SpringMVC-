package com.anita.LookIt.ServiceLayer;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anita.LookIt.DateAndTime.DateAndTimeapi;
import com.anita.LookIt.Entity.CustomerDetails;
import com.anita.LookIt.Entity.UserDetails;
import com.anita.LookIt.Util.LookItUtil;

import com.anita.LookIt.dao.DataAccessDAO;
import com.anita.LookIt.dto.Customerdetails;
import com.anita.LookIt.dto.ForgetPasswordDTO;
import com.anita.LookIt.dto.LogInDTO;
import com.anita.LookIt.dto.Register;

@Service
public class CommonServiceImpl implements CommonService{
    @Autowired
	private  DataAccessDAO dao;
    @Autowired
    private LookItUtil util;
    
    @Autowired
    private DateAndTimeapi datetime;
    
	public String validateandSave(Register register) {

		if(register.getFirstname()!=null && !register.getFirstname().isEmpty()) {
			if(register.getSurname()!=null&& !register.getSurname().isEmpty()) {
				if(register.getEmail()!=null && !register.getEmail().isEmpty()) {
					
					if(register.getPassword()!=null && !register.getPassword().isEmpty()) {
						if(register.getConfirmpassword()!=null && !register.getConfirmpassword().isEmpty() && register.getPassword().equals(register.getConfirmpassword())) {
							if(register.getContact()!=null && !register.getContact().isEmpty()) {
								if(register.getDob()!=null && !register.getDob().isEmpty()) {
									if(register.getCity()!=null && !register.getCity().isEmpty()) {
										if(register.getState()!=null && !register.getState().isEmpty()) {
											if(register.getCountry()!=null && !register.getCountry().isEmpty()) {
												if(register.getProfile()!=null && !register.getProfile().isEmpty()) {
												
													 UserDetails detaills =dao.getByEmailId(register.getEmail());
													   if(detaills!=null) {
														   return "Email is alraedy registered you can login directly";
													   }else {
                                
												       UserDetails details=new  UserDetails();
												       details.setFirstname(register.getFirstname());
												       details.setSurname(register.getSurname());
												       details.setEmail(register.getEmail());
												       details.setPassword(register.getPassword());
												       details.setContact(register.getContact());
												       details.setDate_of_birth(register.getDob());
												       details.setCity(register.getCity());
												       details.setState(register.getState());
												       details.setCountry(register.getCountry());
												       details.setPincode(register.getPincode());
												       details.setProfile(register.getProfile());
													   dao.save(details);
														
										               return "data saved";
													   } 
													
												}else {
													return "Choose profile name";
												}
													
											}else {
												return "country field is empty";
											}
										}else {
											return "state field is empty";
										}
									}else {
										return "City field is empty";
									}
								}else {
									return "DOB field is empty";
								}
								
							}else {
								return "conatct field is empty";
							}
							
						}else {
							return"Invalid Confirm Password";
						}
					}else {
						return "Invalid password";
					}
					
				}else {
					return "Invalid Email";
				}
				
			}else {
				return "surname field is empty";
			}
			
		}else {
			return "Firstname field is empty";
		}
	
	
	}

	@Override
	public String validateandLogin(LogInDTO login) {
		if(login.getEmail()!=null && !login.getEmail().isEmpty()) {
			if(login.getPassword()!=null && !login.getPassword().isEmpty()) {
				UserDetails details=  dao.getByEmailId(login.getEmail());
				if(login.getEmail().equals(details.getEmail())&& login.getPassword().equals(details.getPassword())) {
					    return login.getEmail(); 
				}else {
					return "Invalid Email and password";
				}
				
			}else {
				return "Invalid password";
			}
			
		}else {
			return "Invalid Email";
		}
		
	}

	@Override
	public String validateandsendotp(String email) {
		if(email!=null && !email.isEmpty()) {
		UserDetails details = dao.getByEmailId(email);
		  if( details!=null) {
		    int	otp=util.generateotp();
		    util.sendmail(email, otp);
		    details.setOtp(otp);
		dao.save(details);
		}else {
			return "Email not Registered";
		}
		}else {
			return" Invalid Email";
		}
		return "sent otp";
	}

	@Override
	public String validateandupdatepassword(ForgetPasswordDTO dto) {
		if(dto.getEmail()!=null && !dto.getEmail().isEmpty()) {
		UserDetails details=dao.getByEmailId(dto.getEmail());
		  if(dto.getOtp()==details.getOtp()) {
			  if(dto.getNewpassword()!=null && !dto.getNewpassword().isEmpty()) {
				  if(dto.getConfirmNewpassword()!=null && !dto.getConfirmNewpassword().isEmpty() && dto.getConfirmNewpassword().equals(dto.getNewpassword())) {
					  details.setPassword(dto.getNewpassword());
					  details.setOtp(0);
					  dao.save(details);
				  }else {
					  return "Invalid Confirm Password";
				  }
				  
			  }else {
				  return "Invalid password";
			  }
			  
		  }else {
			  return "Invalid otp";
		  }
			
		}else {
			return "Invalid Email";
		}
		return "password Updated";
	    
	    			
	}

	@Override
	public String validateandsavecustomerdetails(Customerdetails customer) {
		if(customer.getEmail()!=null && !customer.getEmail().isEmpty()) {
			if(customer.getModel()!=null && !customer.getModel().isEmpty()) {
				if(customer.getIssue()!=null && !customer.getIssue().isEmpty()) {
					String datetime1= datetime.calldate(); 
					CustomerDetails details= new CustomerDetails();
					details.setEmail(customer.getEmail());
					details.setModel(customer.getModel());
					details.setIssue(customer.getIssue());
					details.setCreatedate(datetime1);
					details.setStatus("open");
					dao.savedetails(details);
				}else {
					return "please Enter your issue";
				}
					
			}else {
				return "Enter model";
			}
	}else {
		return "Invalid Email";
	}
		return "data saved";		
	
	}

	@Override
	public CustomerDetails getmyprofile(String email) {
		CustomerDetails result=null;
		if(email!=null && !email.isEmpty()) {
	    result = dao.getByEmail(email);
	    }
		return result;
	}
	}
	
		
	


