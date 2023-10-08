package com.example.SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelocomeEmployee {
	
	@GetMapping("/welcomeEmployee")
	public String welcomeEmp(Model model) {
		
		String sms="welcome to bikkadIT";
//		String[] sms=   {"wqbwqw", "dsdad","hgjfghfh"};
		
		model.addAttribute("welmassage", sms);
		return "Welcomeemp";
	}

}
