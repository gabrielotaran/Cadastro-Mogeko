package br.com.carlosgabriel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import br.com.carlosgabriel.Service.PersonagemService;
import br.com.carlosgabriel.model.Personagem;



@Controller
@RequestMapping("/personagens")
public class PersonagemController {
	@Autowired
	private PersonagemService personagemService;
	
	@GetMapping("/forminsert")
	public String insert(Model model) {
		Personagem personagem = new Personagem();
		model.addAttribute("personagem", personagem);
		return "personagens/insert";
		
	}
	@GetMapping("/list")
	public String list(Model model) {
		List<Personagem> personagens = personagemService.findAll();
		model.addAttribute("personagens", personagens);
		return "personagens/list";
	}
	@PostMapping("/insert")
    public String insert(@ModelAttribute("personagem") Personagem personagem) {
        Personagem resultPersonagem = personagemService.insert(personagem);
        if (resultPersonagem != null) {
            return "/home";
        }
        return "personagens/error";
	}
}

