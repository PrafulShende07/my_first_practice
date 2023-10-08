package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/loadForm")
	public String loadForm() {
		
		
		return "welcome1";
		
	}
	
	@GetMapping("/saveStudent")
	public ModelAndView saveStudent(Student stu) {
		
		ModelAndView mav=new ModelAndView();
		System.out.println(stu);
		mav.addObject("STU", stu.getFname());
		mav.setViewName("Registration");
		return mav;
		
	}

}
