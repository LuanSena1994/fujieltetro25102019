package com.example.Fujieletro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Fujieletro.model.Usuario;
import com.example.Fujieletro.repository.UsuarioRepository;

@Controller
public class ControllerIndex {
	
	@Autowired
	private UsuarioRepository ur;

	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String form(){
		return "about";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.POST)
	public String form(Usuario usuario){
		
		ur.save(usuario);
		
		return "redirect:/about";
	}
	
	
}
