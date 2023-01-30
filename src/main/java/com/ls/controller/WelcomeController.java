package com.ls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping(value="/welcome")
	public String getDisp(){
		return "Welcome to Rest API...";
		
	}
	//Query parameter
	//http://localhost:8082/welcome1?uname=sailaja&loc=california
	@GetMapping(value="/welcome1")
	public String getDisp(@RequestParam("uname")String userName ,@RequestParam("loc") String location) {
		return "Welcome to "+userName+" from "+location;
	}
	
//	@GetMapping(value="/welcome1")
//	public String getDispPath(@RequestParam("uname")String userName ,@RequestParam("loc") String location) {
//		return "Welcome to "+userName+" from "+location;
//	}
	//path parameter
	//http://localhost:8082/welcome/saran/USA
	
	@GetMapping(value="/welcome1/{uname}/{loc}")
	public String getDispPathParam(@PathVariable("uname") String userName,@PathVariable("loc") String location) {
		return "welcome to "+userName+" from "+location;
	}
	
	
}


