package com.anita.LookIt.dao;

import java.util.List;

import com.anita.LookIt.Entity.CustomerDetails;
import com.anita.LookIt.Entity.UserDetails;
import com.anita.LookIt.dto.Customerdetails;

public interface DataAccessDAO {
	
  public abstract void save(UserDetails details);
  
  public UserDetails getByEmailId(String email);
  
 public void savedetails(CustomerDetails customer);
 
 public CustomerDetails getByEmail(String email);
 
 public List<CustomerDetails> getByOpenStatus(String status);
 
 public List<CustomerDetails> getBytickets(String asignee);


}
