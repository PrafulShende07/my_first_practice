package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {

	@GetMapping("additon/{a}")
	public ModelAndView addition(@PathVariable int a) {
		
		int c=a+a;
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("ADD", c);
		mav.setViewName("addtion");
		
		return mav;
		
		
	}
	// we can use and in url also like this "addition/{a}/and/{b}/and/{c}"    
	@GetMapping("additons/{a}/{b}/{c}")
	public ModelAndView Multipleaddition(@PathVariable int a,@PathVariable int b, @PathVariable int c) {
		
		int d=b+a+c;
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("ADDITION", d);
		mav.setViewName("addtions");
		
		return mav;
		
		
	}
	
}
