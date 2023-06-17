package springMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("Name", "Aditya");
		model.addAttribute("id", 7732);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Aditya");friends.add("Rahate");friends.add("Gaurav");
		friends.add("Sharma");
		
		model.addAttribute("f",friends);
		
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/service")
	public String service() {
		return "service";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("help");

		modelAndView.addObject("name", "durgesh");
		modelAndView.addObject("rollNumber", 32);
		
		LocalDateTime dateTime = LocalDateTime.now();
		modelAndView.addObject("now", dateTime);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(35);
		list.add(45);
		list.add(65);
		list.add(95);
		modelAndView.addObject("marks", list);
		
		return modelAndView;
	}
}
