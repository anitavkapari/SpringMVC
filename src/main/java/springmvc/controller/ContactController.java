package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {
        System.out.println("this our contact page");
		return "contact";
	}
	
	@RequestMapping(path = "/registerUser", method = RequestMethod.POST)
	public String registerHandler(
			@RequestParam(name="email" , required=false) String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("password") String userPassword, Model model)
	{	
		System.out.println("User email: " + userEmail);
		System.out.println("User name: " + userName);
		System.out.println("User password: " + userPassword);
		
		model.addAttribute("email", userEmail );
		model.addAttribute("name", userName );
		model.addAttribute("password", userPassword );

		//String name = request.getParameter("name");
        //System.out.println("User name: " + name);
		return "succes";
	}
}
