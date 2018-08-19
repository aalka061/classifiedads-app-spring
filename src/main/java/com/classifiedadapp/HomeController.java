package com.classifiedadapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	 @GetMapping("/")
	  public String greeting() {
	        return "index";
	  }
	 
	 @GetMapping("/dashboard") 
	 public String dashboard() {
		 return "dashboard";
	 }
	 
	 @GetMapping("/category") 
	 public String category() {
		 return "category";
	 }

}
