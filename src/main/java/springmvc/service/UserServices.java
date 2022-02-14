package springmvc.service;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.modelview.User;
  
  @Service 
  public class UserServices {
 
  @Autowired
  private UserDao userdao;
  
  
  public int createUser(User user) {
	  return this.userdao.saveUser(user);
	  }
 
  }
 

