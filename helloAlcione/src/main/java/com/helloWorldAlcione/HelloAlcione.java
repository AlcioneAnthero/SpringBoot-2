package com.helloWorldAlcione;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloAlcione {

	//IMPRIMIR OS OBJETIVOS DA SEMANA - HELLO WORLD
	@GetMapping
	public String Hello () {
		return "Foco e correr atrás das atividades perdidas";
}
}

