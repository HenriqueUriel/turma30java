package com.atividadeUm.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade1Controller {
	@GetMapping ("/Mentalidades")
	public String sayMentalidades () {
		return "Foram utilizadas as mentalidade de:\n Foco;\n Atenção aos Detalhes;\n Atenção;";
	}
}
