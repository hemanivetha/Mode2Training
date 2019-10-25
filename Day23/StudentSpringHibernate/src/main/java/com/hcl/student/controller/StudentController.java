package com.hcl.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping(value="/getStudent",method=RequestMethod.GET)
	public String getStudent(Model mode1){
		return "getStudent";
	}
	@RequestMapping(value="/addStudent",method=RequestMethod.GET)
	public String addStudent(Model mode1){
		return "addStudent";
	}
	@RequestMapping(value="/updateStudent",method=RequestMethod.GET)
	public String updateStudent(Model mode1){
		return "updateStudent";
	}
}
