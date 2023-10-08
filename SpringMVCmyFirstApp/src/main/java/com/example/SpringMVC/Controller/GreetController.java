package com.example.SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	
	@GetMapping("/nightwishes")
	public ModelAndView greetmethod() {
		
		String msg="Good Night all	";
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("GRT", msg);
		mav.setViewName("greet");
		
		return mav;
				
	}

}
