package br.com.lucas.farmacia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaController {
	
	@RequestMapping("/ola")
	public String mostrarMsg( ) {
		return "Olá mundo";
	}
}
