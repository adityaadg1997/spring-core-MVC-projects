package springMVC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;
import springMVC.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Learn Code with Aditya");
		model.addAttribute("Desc", "We are in Learning Proccess, Congratulations!!");
	}
	
	@RequestMapping("/contact")
	public String showform() {
		return "contact";
	}
	
	@RequestMapping(path = "/proccessForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		if(user.getName().isBlank()) {
			return "redirect: contact";
		}
		
		System.out.println(user);
		Integer createdUser = this.userService.createUser(user);
		
		model.addAttribute("message", "User created with id : " + createdUser);
		return "success";
	}
}





/*
@RequestMapping("/contact")
public String showform() {
	return "contact";
}
//@RequestMapping(path = "/proccessForm", method = RequestMethod.POST)
//public String handleForm(HttpServletRequest request) {
//	String email = request.getParameter("email");
//	
//	System.out.println("My email is "  + email);
//	
//	return "";
//}

@RequestMapping(path = "/proccessForm", method = RequestMethod.POST)
public String handleForm(@RequestParam("email") String email,
						@RequestParam("name") String name,
						@RequestParam("password") String password,
						Model model) {
	
	
	System.out.println("My name is "  + name);
	System.out.println("My email is "  + email);
	System.out.println("My password is "  + password + " plz try to keed it secret");
	
	//proccess
	
	model.addAttribute("name", name);
	model.addAttribute("email", email);
	model.addAttribute("password", password);
	
	return "success";
} */
