package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WElcomeController {
	
	// query parameter example 
	         //   URL
	@GetMapping("/wel")  // to read    key   value
	public String welmsg(@RequestParam String name , Model model) {
	
		String msg= "Hii " + name + " welcome to BikkadIT";
	    model.addAttribute("MSG", msg);
		
		return "welcome";
		//       jsp file name which is provided in src pages folder
	}
// @RequestParam use this annotation to read the key and value
// Model is use to transfer the data controller to UI front end
}
