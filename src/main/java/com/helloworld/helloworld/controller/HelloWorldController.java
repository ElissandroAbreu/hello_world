package com.helloworld.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/BSM")
	public List<String> Bsm() {
		
		ArrayList<String> bsm = new ArrayList<String>();
		
		bsm.add("Comunicação");
		bsm.add("Proatividade");
		bsm.add("Trabalho em Equipe");
		bsm.add("Orientação ao Futuro");
		bsm.add("Orientação ao Detalhe");
		bsm.add("Persistência");
		bsm.add("Responsabilidade Pessoal");
		bsm.add("Mentalidade de Crescimento");
		
		return bsm;
	}
	
	@GetMapping("/AprendizaGEN")
	public ArrayList<String> Aprendizagem()  {
		
		ArrayList<String> aprender = new ArrayList<String>();
		
		aprender.add("Avançar nos conceitos de Spring");
		aprender.add("Revisar conteúdos passados");
		aprender.add("Estudar conteúdos da faculdade");
		
		return aprender;
	}
	
}



