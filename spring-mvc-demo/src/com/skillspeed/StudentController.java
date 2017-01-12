package com.skillspeed;

import com.pojo.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/")
	public ModelAndView getPage(){
		String message ="<h1>Hello Student</h1>";
		
		return new ModelAndView("home","message",message);
	}	
	
   @RequestMapping(value = "/studentform", method = RequestMethod.GET)
   public ModelAndView student() {
      //return new ModelAndView("student", "command", new Student());
	   //Student object is created by controller & passed to view
      return new ModelAndView("student", "s", new Student());
   }
   
   
//   @RequestMapping(value = "/studentform", method = RequestMethod.GET)
//   public String newstudent() {
//      return "student";
//   }
//   
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("s") Student student,ModelMap model) {
      //model.addAttribute("name", student.getName());
      //model.addAttribute("age", student.getAge());
      //model.addAttribute("id", student.getId());
      model.addAttribute("student", student);
      
      return "result"; 
      // In case of string return value, this will be subjected to RequestToViewNameTranslator
   }
}