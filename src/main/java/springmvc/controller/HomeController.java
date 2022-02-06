package springmvc.controller;

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
        System.out.println("this our home page");
        model.addAttribute("name", "Anita Kapari");
        model.addAttribute("id", 1222);
        List<String> frnds = new ArrayList<String>();
        frnds.add("Anita");
        frnds.add("Annu");
        frnds.add("Avi");
        frnds.add("Aniket");
        frnds.add("Ankita");
        frnds.add("Anita Kapari");

        model.addAttribute("f", frnds);
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about() {
        System.out.println("this our about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
        System.out.println("this our help page");
        ModelAndView modelAndView = new ModelAndView();//create model and view object
        modelAndView.addObject("name", "Devarsh"); //add date in model view
        modelAndView.addObject("rollNo", 122);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);
        modelAndView.setViewName("help");//setting the view name
		return modelAndView;
	}
	
}
