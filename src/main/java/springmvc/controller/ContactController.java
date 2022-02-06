package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {
        System.out.println("this our contact page");
		return "contact";
	}
	
	@RequestMapping(path = "/registerUser", method = RequestMethod.POST)
	public String registerHandler(
			@RequestParam(name="userEmail" , required=false) String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword,
			Model model){	
		User user= new User();
		user.setUserEmail(userEmail);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		
		System.out.println("User details: " + user);
//		System.out.println("User email: " + userEmail);
//		System.out.println("User name: " + userName);
//		System.out.println("User password: " + userPassword);
		
		model.addAttribute("user", user );
//		model.addAttribute("userEmail", userEmail );
//		model.addAttribute("userName", userName );
//		model.addAttribute("userPassword", userPassword );

		//String name = request.getParameter("name");
        //System.out.println("User name: " + name);
		return "succes";
	}
}
