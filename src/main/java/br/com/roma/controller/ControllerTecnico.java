package br.com.roma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.roma.domain.Clube;
import br.com.roma.domain.Tecnico;
import br.com.roma.repository.RepositoryClube;
import br.com.roma.service.ServiceTecnico;

@Controller
@RequestMapping("/tecnicos")
public class ControllerTecnico {
		
	
		
	
		@Autowired
		private ServiceTecnico service ;
		
		@Autowired
		private RepositoryClube repo;
		
	
		@ModelAttribute("clubes")
		public List<Clube> listar(Clube clube){
			
			return repo.findAll();
		}
		
		
		@RequestMapping("cadastro")
		public String abrirCad(Tecnico tecnico) {
			
			return "tecnico/cadastro";
			
		}
	
		
		@PostMapping("/salvar")
		public String salvar(Tecnico tecnico, RedirectAttributes attr ) {
		
			service.salvar(tecnico);
			attr.addFlashAttribute("success","Técnico cadastrado com sucesso");
		
			return "redirect:cadastro";
			
		}
		
		
		
		
}
