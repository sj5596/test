package co.micol.prj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home(Model model) {
		
		return "home/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home/home";
	}
	
	@RequestMapping("/ho")
	public String ho() {
		return "home/home";
	}
}
