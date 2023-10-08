package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	
	// query parameter with multiple name
	
	@GetMapping("/courses")
	public String courseCon(@RequestParam String cname,@RequestParam String tname, Model model) {
		
		String msg= cname + " new batch start from 01 september by "+ tname;
		model.addAttribute("Massage", msg);
		
		return "course";
		
	}

}
