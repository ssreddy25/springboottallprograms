package com.corefundamentalspring;

public class UserServices {
	
	private UserRepostirory userRepostiory;
	
public void save(User user) {
	
	userRepostiory.save(user);
		
	}
    
  public User updateUser(User user) {
	  
	  return userRepostiory.updateUser(user);
		
	}
  
   public void findUser(long userID) {
	   
	   userRepostiory.findUser(userID);
	   
   }
   
   public void deleteUser(long userId) {
	   
	   userRepostiory.deleteUser(userId);
	   
   }

}
