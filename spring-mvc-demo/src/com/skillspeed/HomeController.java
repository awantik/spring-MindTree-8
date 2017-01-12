package com.skillspeed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/home")
public class HomeController {
	

	
	//Form Submission
	@RequestMapping("/info")
	public ModelAndView getnewPage(@RequestParam("name") String name, @RequestParam("loc") String location){
		String message ="<h1>Hello " + name + " " + location +"</h1>";
		//Student s = new 
		
		return new ModelAndView("home","message",message);
	}
	
	@RequestMapping("/static")
	public String getstaticPage(){
 
		return "redirect:html/home.html";
		//return "/resources/html/home.html";
		
	}
	
	
	@RequestMapping("/contactus")
	public ModelAndView getContactUSPage(){
		String message ="<h1>Contact Us</h1>";
		
		return new ModelAndView("home","message",message);
	}
	
	@RequestMapping("/upload")
	public String getFileUploadPage(){
		String message ="<h1>Single Upload</h1>";	
		return "upload";
	}

	@RequestMapping("/multiupload")
	public String getMultiFileUploadPage(){
		String message ="<h1>Multiple Upload</h1>";	
		return "multipleupload";
	}
	
	@RequestMapping("/{name}/{location}")
	public ModelAndView getPage(@PathVariable String name, @PathVariable String location){
		String message ="<h1>Hello " + name + " " + location +"</h1>";
		//Student s = new 
		
		//ModelAndView takes 3 params - template name, key, value
		return new ModelAndView("home","message",message);
	}


}
