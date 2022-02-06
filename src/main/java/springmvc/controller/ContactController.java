package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {
        System.out.println("this our contact page");
		return "contact";
	}
	
	@RequestMapping(path = "/registerUser", method = RequestMethod.POST)
	public String registerHandler(HttpServletRequest request) {
		
		String name = request.getParameter("name");
        System.out.println("User name: " + name);
		return "registerUser";
	}
}
