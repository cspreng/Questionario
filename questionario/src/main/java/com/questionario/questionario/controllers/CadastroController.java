package com.questionario.questionario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.questionario.questionario.models.Cadastro;
import com.questionario.questionario.repository.QuestionarioRepository;

@Controller
public class CadastroController {
	
	@Autowired
	private QuestionarioRepository qr;
	
	@RequestMapping(value= "/cadastrarColaborador", method=RequestMethod.GET)
	public String form() {
		return "cadastro/formCadastro";
		
	}
	
	@RequestMapping(value= "/cadastrarColaborador", method=RequestMethod.POST)
	public String form(Cadastro cadastro) {
		
		qr.save(cadastro);
		
		
		return "redirect:/cadastrarColaborador";
		
	}
	
	@RequestMapping("/colaboradores")
	public ModelAndView colaboradores() {
		ModelAndView mv = new ModelAndView("/colaboradores");
		Iterable<Cadastro> cadastros = qr.findAll();
		mv.addObject("cadastros", cadastros);
		return mv;
		
		
	}

}
