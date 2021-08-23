package com.atividadeDois.atividadedois.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ObjetivosSemana")
public class AtividadeDoisController {
	@GetMapping
	public String Objetivos() {
		return "Objetivos de Aprendizagem para essa semana: \nAprender SpringBoot; \nPersistência; \nFoco; \nPra cima!!";
	}
	
}
