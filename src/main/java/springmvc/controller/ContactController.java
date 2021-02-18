package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Learn Code with Dhruba");
		m.addAttribute("desc","Home for Pragrammer!");
	}
	 
	@RequestMapping("/contact")
	public String showform() {
		return "contact";
	}
	
	// Servlet technique:
	/*
	 * @RequestMapping(path="/processForm", method=RequestMethod.POST)
	 *  public String handleForm(HttpServletRequest request) { 
	 * String email=request.getParameter("email");
	 * System.out.println("User email:"+email); 
	 * return ""; }
	 */
	
	
	 //Spring Mvc technique: @RequestParam
	 /*
	 * @RequestMapping(path="/processForm", method=RequestMethod.POST) 
	 * public String handleForm(
	 * @RequestParam("email") String userEmail,
	 * @RequestParam("password") String userPassword, 
	 * Model model) {
	 * System.out.println("Email: " + userEmail); 
	 * System.out.println("Password: " + userPassword); 
	 //process
	 * model.addAttribute("email",userEmail);
	 * model.addAttribute("password",userPassword);
	 * 
	 * return "success"; }
	 */
	
	//Spring Mvc technique: @ModelAttribute
	  @RequestMapping(path="/processForm", method=RequestMethod.POST) 
	  public String handleForm(@ModelAttribute User user,
			  					Model model){
		  
		
	System.out.println(user);
	int createdUser = this.userService.createUser(user);
	model.addAttribute("msg","user created with Id: "+createdUser);
 
	  return "success"; }
	
	 
}
