package com.anita.LookIt.dao;

import com.anita.LookIt.Entity.UserDetails;

public interface DataAccessDAO {
	
  public abstract void save(UserDetails details);
  
  public UserDetails getByEmailId(String email);
  
 
}
