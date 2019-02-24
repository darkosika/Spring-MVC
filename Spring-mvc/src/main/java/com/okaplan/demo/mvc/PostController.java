package com.okaplan.demo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

	@RequestMapping("/showPage")
	public String showPage(){
		return "post-form";	
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "process-form";	
	}
	
	//new controller method to read data and add data model
	
	@RequestMapping("/processFormTwo")
	public String AddModel(HttpServletRequest request,Model model){
		String theName=request.getParameter("name");
		theName=theName.toUpperCase();
		String result="New Model from" +theName;
		model.addAttribute("message", result);
		return "process-form";	
	}
	
	@RequestMapping("/processFormThree")
	public String AddModel(@RequestParam("name") String theName,Model model){
		theName=theName.toUpperCase();
		String result="New Model from Three " +theName;
		model.addAttribute("message", result);
		return "process-form";	
	}
}
