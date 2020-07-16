package br.com.roma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.roma.domain.Clube;
import br.com.roma.domain.Tecnico;
import br.com.roma.repository.RepositoryTecnico;
import br.com.roma.service.ServiceClube;

@Controller
@RequestMapping("clubes")
public class ControllerClube {
	
	@Autowired
	ServiceClube service;
	
	@Autowired
	RepositoryTecnico repo;
	
	@ModelAttribute("tecnico")
	public List<Tecnico> getTecnico(Tecnico tecnico){	
		return repo.findAll();
	}	
	
	@GetMapping("/cadastro")
	public String AbrirCadastro(Clube clube) {
		return "clube/cadastro";
	}
	
	@PostMapping("salvar")
	public String salvar(Clube clube, RedirectAttributes attr ){	
		service.salvar(clube);
		attr.addFlashAttribute("success","Clube Cadastrado com sucesso");
		return "redirect:/clubes/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(Clube clube, ModelMap map){
		map.addAttribute("clube", service.listar());
		
		
		return "clube/lista";
	}

	

}
