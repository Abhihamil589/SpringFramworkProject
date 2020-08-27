package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "welcome-form";
	}
	
	//need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	//need a controller method to process the html form data and add it to the model
		@RequestMapping("/processFormVersionTwo")
		public String processFormVersionTwo(@RequestParam("studentName") String name,Model model) {
			// read data from html form data
			// covert it to upper case
			
			name=name.toUpperCase();
			// create the message
			name="YO!"+name;
			
			// add it to the model
			
			model.addAttribute("message", name);
			// return the view page
			
			return "main-menu";
		}
}
