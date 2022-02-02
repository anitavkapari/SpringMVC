package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
		
	@RequestMapping("/home")
	public String home() {
        System.out.println("this our home page");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
        System.out.println("this our about page");
		return "about";
	}
}
