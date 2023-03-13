package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosAprendizagemController {
	
	@GetMapping
	public String objetivos() {
		return "Objetvos da Semana:\nAvançar nos conceitos gerais de Spring Boot;"
				+ "\nEstudar os conceitos gerais de Raciocínio Lógico;"
				+ "\nEstudar os conceitos gerais de Organização de Compuradores;"
				+ "\nRevisar conteúdos Bloco I";
	}

}
