package com.example.SpringMVC.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringMVC.Model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/getstu")
	public ModelAndView getStudent() {
		
		Student stu=new Student();
		stu.setSid(11);
		stu.setSname("Pratik");
		stu.setSaddress("chandrapur");
		
		ModelAndView ma =new ModelAndView();
		ma.addObject("STD", stu);
		ma.setViewName("student");
		
		return ma;
		
	}
	
	
		@GetMapping("/getstudent")
		public ModelAndView getStudents() {
		Student stu1=new Student();
		stu1.setSid(12);
		stu1.setSname("Santosh");
		stu1.setSaddress("Pune");
		
		Student stu2=new Student();
		stu2.setSid(13);
		stu2.setSname("Ganesh");
		stu2.setSaddress("Beed");
		
		Student stu3=new Student();
		stu3.setSid(14);
		stu3.setSname("sandip");
		stu3.setSaddress("Nagpur");
		
		ArrayList<Student> arr=new ArrayList();
		arr.add(stu1);
		arr.add(stu2);
		arr.add(stu3);
		
		ModelAndView mav =new ModelAndView();
		mav.addObject("STUDENTS", arr);
		mav.setViewName("students");
		
		return mav;
		
	}

}
