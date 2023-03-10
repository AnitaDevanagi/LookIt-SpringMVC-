package com.anita.LookIt.dao;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anita.LookIt.Entity.CustomerDetails;
import com.anita.LookIt.Entity.UserDetails;



@Component
public class  DataAccessDAOImp implements DataAccessDAO {
	@Autowired
   private SessionFactory sessionFactory;
   
 

public void save(UserDetails  details) {
	  Session session= sessionFactory.openSession();
	  Transaction transaction= session.beginTransaction();
	  session.saveOrUpdate(details);
	  transaction.commit();
	  session.close();
	  
	}

public UserDetails getByEmailId(String email) {
	 Session session= sessionFactory.openSession();
	 String que = "from UserDetails where email = '"+email+"'";
	 Query query = session.createQuery(que);
	 UserDetails entity =  (UserDetails) query.uniqueResult();
    System.out.println(entity);
    session.close();
	return  entity;
	
}

  public void  savedetails(CustomerDetails details) {
	Session session= sessionFactory.openSession();
	Transaction transaction =session.beginTransaction();
	session.save(details);
	transaction.commit();
	session.close();
  }
  
  


public CustomerDetails  getByEmail(String email) {
	 Session session= sessionFactory.openSession();
	 String que = "from CustomerDetails where email = '"+email+"'";
	 Query query = session.createQuery(que);
	 CustomerDetails entity = (CustomerDetails) query.uniqueResult();
     System.out.println(entity);
     session.close();
	 return entity;
}

   public List<CustomerDetails> getByOpenStatus(String status) {
      Session session  = sessionFactory.openSession();
      String response = "from CustomerDetails where status = '"+status+"'";
      System.out.println(response);
      Query query =session.createQuery(response);
      List<CustomerDetails> entity =query.list();
       System.out.println(entity);
      session.close();
	   return entity;
      
      
}

@Override
public List<CustomerDetails> getBytickets(String asignee) {
	 Session session=sessionFactory.openSession();
	 String response = "from CustomerDetails where asignee = '"+asignee+"'";
     System.out.println(response);
     Query query =session.createQuery(response);
     List<CustomerDetails> entity =query.list();
      System.out.println(entity);
     session.close();
	 return entity;
}

}
       

