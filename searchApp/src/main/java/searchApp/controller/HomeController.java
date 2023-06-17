package searchApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("searchQuerry") String querry) {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com/search?q=" + querry);
		
		
		return redirectView;
	}

}
