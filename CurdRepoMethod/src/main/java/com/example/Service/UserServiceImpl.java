package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.User;
import com.example.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInteface{

	@Autowired
	private UserRepository userRepository;

//	@Override
//	public User saveUser(User user) {
//		
//		User user2 = userRepository.save(user);
//		return user2;
		
//	}
//  OR 
			@Override
			public boolean saveUser(User user) {
				User save = userRepository.save(user);
				
				if (save !=null) {
				return true;
			    }else 
			        {
				return false;
			    }
	
	}

			@Override
			public List<User> GetAllUser() {
				List<User> findAll = (List<User>) userRepository.findAll();
				
				return findAll;
			}

			@Override
			public User getUserIdbyqueryparam(int uid) {
				User findById = userRepository.findById(uid).get();
				return findById;
			}

			@Override
			public User getUserIdbyPathparam(int uid) {
				User user = userRepository.findById(uid).get();
				return user;
			}

			@Override
			public User updateUserData(User user) {
				User updateUser = userRepository.save(user);
				return updateUser;
			}

			@Override
			public boolean deleteRecordById(int uid) {
				boolean id = userRepository.existsById(uid);
				
				if (id) {
					userRepository.deleteById(uid);
					return true;
				}else
				{
					return false;
				}
				
			}

			@Override
			public boolean deleteAllData(User user) {
				  List<User> findAll = (List<User>) userRepository.findAll();
				 if(findAll.isEmpty()) {
					 
					 return false;
				 }else {
					 userRepository.deleteAll();
					 return true;
				 }
				
				
			}
}
