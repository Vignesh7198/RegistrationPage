package com.Registration.GeneralUsers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Registration.DAO.ClientService;
import com.Registration.DTO.Registration;

@RestController
public class GeneralRegistration {

	@Autowired
	ClientService client;
	
	@GetMapping("/")
	public ModelAndView homePage() {
		
		ModelAndView mv = new ModelAndView("index");
		
		return mv;
	}
	
	@PostMapping("/register/{id}")
	public ModelAndView register(@PathVariable("id") int id ) {
		
		client.templateId(id);
		
		ModelAndView mv = client.templateId(id);
		
		mv.addObject("model",new Registration());
		return mv;
		
	}
	
	@PostMapping("/submit")
	public void submit(@ModelAttribute("model") Registration registration ) {
		
		boolean createdorNot = client.register(registration);
		
		
	}
	
}
