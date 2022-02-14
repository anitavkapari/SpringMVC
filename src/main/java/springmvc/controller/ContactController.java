package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.modelview.User;
import springmvc.service.UserServices;

@Controller
public class ContactController {
	
	@Autowired
	private UserServices userServices;
	
	@ModelAttribute
	public void comman(Model m) {
		m.addAttribute("title", "Spring MVC");
		m.addAttribute("title1", "Spring MVC details");

	}

	@RequestMapping("/contact")
	public String contact() {
        System.out.println("this our contact page");
		return "contact";
	}
	
	@RequestMapping(path = "/registerUser", method = RequestMethod.POST)
	public String registerHandler(@ModelAttribute User user , Model model)//use @ModelAttribute annotation 

	{		
		System.out.println("User details: " + user);
		if(user.getUserName().isEmpty())
		{
			System.out.println("Not..." );

			return "redirect:/contact";

		}
	/*@RequestParam(name="userEmail" , required=false) String userEmail,
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
*/	
		
		int createUser = this.userServices.createUser(user);
		model.addAttribute("msg","user created with id" +  createUser);
		return "succes";
	}
}
