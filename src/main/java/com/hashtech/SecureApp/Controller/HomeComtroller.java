package com.hashtech.SecureApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeComtroller {

	
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}
}
