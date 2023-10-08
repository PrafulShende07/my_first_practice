package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.User;
import com.example.Service.UserServiceInteface;

import jakarta.websocket.server.PathParam;

@Controller
public class UserController {
	
	// method for load the user form
	@Autowired
	private UserServiceInteface userServiceInterface;
	
	@GetMapping("/form")
	public String Loadform() {
		
		return "RegForm";	
	}
	
	// method for save the data of user
	
//	@GetMapping("/saveUser")
//	public ModelAndView saveUser(User user) {
//		
//		User saveUser = userServiceInterface.saveUser(user);
//		
//		ModelAndView mav=new ModelAndView();
//		
//		mav.addObject("SAVE", saveUser.getFname());
//		mav.setViewName("Registration");
//		
//		return mav;
//		
//	}
	
	// OR    method for save the data of user
	
	@GetMapping("/saveUser")
	public ModelAndView saveUser(User user) {
		
		boolean saveUser = userServiceInterface.saveUser(user);
		
		if(saveUser) {
			ModelAndView mav=new ModelAndView();
			
			String msg="user saved successfully";
			mav.addObject("SaveMSG", msg); 
			mav.setViewName("SaveSuccess");
			return mav;		
	    }else {
	    	ModelAndView mav=new ModelAndView();
			
			String msg="user not saved successfully";
			mav.addObject("FailMSG", msg); 
			mav.setViewName("SaveFail");
			return mav;
	    }
			
	}
	
	   // User update data form
	
		@GetMapping("/Updateform")
		public String Updateform() {
			
			return "UpdateForm";	
		}
	
		// user update data in the database
		
		@GetMapping("/updateUserData")
		public String updateUserData(User user , Model model) {
			User updateUser = userServiceInterface.updateUserData(user);
			
			model.addAttribute("UPDATE", updateUser.getFname());
			return "UpdatedUSER";
		}	
	//to fetch all user data in the database
	
	@GetMapping("/GetAllUSER")
	public ModelAndView GetAllUSER() {
		 List<User> findAll = userServiceInterface.GetAllUser();
		 ModelAndView mav=new ModelAndView();
		 mav.addObject("UserALLDATA", findAll);
		 mav.setViewName("UserAllData");
		 
		return mav;
	}
	
	// to fetch single user data in the database by query parameter
	
	@GetMapping("/getUserIdbyqueryparam")
	public String getUserIdbyqueryparam(@RequestParam int uid , Model model) {
		
		User findById = userServiceInterface.getUserIdbyqueryparam(uid);
		
		model.addAttribute("SingleUserData", findById);
		return "SingleUData";
	}
	
	// to fetch single user data in the database by Path Parameter
	
	@GetMapping("/getUserIdbyPathparam/{uid}")
	public String getUserIdbyPathparam( @PathVariable int uid, Model model ) {
		
		User user = userServiceInterface.getUserIdbyPathparam(uid);
		model.addAttribute("ByPath", user);
		return "BYPath";
	}
	
	// delete user by path parameter
	
	@GetMapping("/deleteRecordById/{uid}")
	public ModelAndView deleteRecordById(@PathVariable int uid) {
		boolean deleteRecordById = userServiceInterface.deleteRecordById(uid);
		
		if(deleteRecordById) {
			ModelAndView mav=new ModelAndView();
		String msg="user delete successfully";
		mav.addObject("DELETE", msg);
		mav.setViewName("DeleteUser");
		return mav;
		
		} else {
			ModelAndView mav=new ModelAndView();
			String msg="user not delete successfully";
			mav.addObject("NotDelete", msg);
			mav.setViewName("NotDeleteUser");
			return mav; 
		}
	}
	
	// Delete all the data 
	
	@GetMapping("/deleteAllData")
	public ModelAndView deleteAllData(User user) {
		
		boolean deleteAllData = userServiceInterface.deleteAllData(user);
		
		if(deleteAllData) {
			String msg= "All data delete successfully";
			ModelAndView mav=new ModelAndView();
			mav.addObject("deleteAll", msg);
			mav.setViewName("DeleteAllSucc");
			return mav;
		}else {
			String msg= "All data not delete successfully";
			ModelAndView mav=new ModelAndView();
			mav.addObject("deleteAlls", msg);
			mav.setViewName("DeleteAllFail");
			return mav;
			
		}
		
	}
}
