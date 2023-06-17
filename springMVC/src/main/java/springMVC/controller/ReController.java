package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		System.out.println("one handler called");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String enjoy() {
		System.out.println("second handler called [enjoy]");
		return "";
	}

}
