package com.questionario.questionario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColaboradoresController {
	@RequestMapping("/colaboradores")
	public String form() {
		return "cadastro/colaboradores";
	}

}
