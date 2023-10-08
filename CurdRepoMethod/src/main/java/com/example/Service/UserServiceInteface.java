package com.example.Service;

import java.util.List;

import com.example.Model.User;

public interface UserServiceInteface {
	
	//public User saveUser(User user);
	
	//or
	public boolean saveUser(User user);
	
	public List<User> GetAllUser();
	
	public User getUserIdbyqueryparam(int  uid);
	
	public User getUserIdbyPathparam(int  uid);
	
	public User updateUserData(User user);
	
	public boolean deleteRecordById(int uid);
	
	public boolean deleteAllData(User user);
	
	
	

}
