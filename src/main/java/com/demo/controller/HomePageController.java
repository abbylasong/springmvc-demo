package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {
	
	
	@RequestMapping( value = "/")	
	public String doIndex (){
	    return "index";
	}
	
	
	/*@RequestMapping( value = "/")	
	@ResponseBody
	public String doIndex (){
	    return "Hello springMVC";
	}*/

}
