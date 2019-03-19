package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping("/query.do")
	public String findAll(Model model) {
		model.addAttribute("users",service.findAll());
		return "show";
	}
}
