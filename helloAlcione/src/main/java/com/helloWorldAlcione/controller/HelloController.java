package com.helloWorldAlcione.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	// IMPRIMIR HELLO WORLD ALCIONE 
	@GetMapping
	public String hello() {
		return "Hello Alcione!!!";
	}
	// IMPRIMIR AS MENTALIDADES E RESPONSABILIDADES
	@GetMapping
	public String Hello () {
		return "Mentalidade ao Futuro e Responsabilidade";
	}


}
