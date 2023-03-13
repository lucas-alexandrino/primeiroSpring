package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	@GetMapping("/generation")
	public String generation () {
		return "<h1> Lista de BSM's da Generation Brasil: </h1>" +
				"<ul>"
				+"<li>Comunicação"
				+ "<li> Mentalidade de Crescimento"
				+ "	<li> Orientação ao detalhe"
				+ "	<li> Orientação ao futuro"
				+ "	<li> Responsabilidade pessoal"
				+ "	<li> Persistência"
				+ "	<li> Proatividade"
				+ "	<li> Trabalho em Equipe"
				+"</ul>";
				
	}
	@GetMapping("/semana")
	public String objetivosWeek() {
		return " <h1> Objetivos de aprendizagem da semana: </h1>" +
				" <ul> "
				+ "<li> Aprender Spring BOOT"
				+ "	<li>  Desenvolver um Blog Pessoal"
				+ "	<li> Teste Unitario"
				+ "	<li> Introdução a JPA"
				+"</ul>";
	}

}
