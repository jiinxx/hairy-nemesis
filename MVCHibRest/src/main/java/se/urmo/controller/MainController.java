package se.urmo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class MainController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getEmployees(Model model){
		return null;
	}

}
