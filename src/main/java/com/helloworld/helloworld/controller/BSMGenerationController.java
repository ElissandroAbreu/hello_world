package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-gen")
public class BSMGenerationController {
	
	@GetMapping
	public String bsmGen() {
		return "BSM'S Gen:\nComunicação, Orientação ao Futuro e aos Detalhes, Persistência, "
				+ "Trabalho em Equipe e Proatividade";
	}

}
