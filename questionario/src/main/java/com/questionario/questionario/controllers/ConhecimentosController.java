package com.questionario.questionario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConhecimentosController {
	@RequestMapping("/conhecimentos")
	public String form() {
		return "cadastro/conhecimentos";
		
	}

}
