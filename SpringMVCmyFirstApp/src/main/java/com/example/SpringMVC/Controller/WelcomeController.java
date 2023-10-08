package com.example.SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	           //  url
	@GetMapping("/massage")
	public ModelAndView welcomemsg() {
		
		String msg="Welcome to BikkadIT ";
		
		ModelAndView mav=new ModelAndView();       // predefined class
		            // key   value
		mav.addObject("MSG", msg); 
		mav.setViewName("Welcome");
		return mav ;
		
		
	}

}
