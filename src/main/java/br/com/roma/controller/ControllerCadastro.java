package br.com.roma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.roma.domain.Player;
import br.com.roma.service.ServicePlayer;

@Controller
@RequestMapping("/player")
public class ControllerCadastro {

	@Autowired
	ServicePlayer service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Player player){
	return ("jogador/cadastro");	
	}
	
	@PostMapping("/salvar")
	public String cadastro(Player player,RedirectAttributes attr) {
		service.cadastrar(player);
		attr.addFlashAttribute("success","jogador cadastrado com sucesso");
		return "redirect:/player/cadastrar";
	}
	
	@GetMapping("/listar")
	public String listar(Player player, ModelMap map) {
		map.addAttribute("player", service.listar());
		return "jogador/lista";
	}
	
	@GetMapping("/listaNome/nome")
	public String listaNome(@RequestParam("nome") String nome, ModelMap map) {
		map.addAttribute("player", service.consuNome(nome));
		return "/jogador/lista";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id,ModelMap model) {	
		model.addAttribute("player", service.buscarPorId(id));	
		return "jogador/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Player player, RedirectAttributes attr) {
		service.editar(player);
		attr.addFlashAttribute("success","Registro Atualizado com sucesso !");	
		return "redirect:/player/cadastrar";
	}
	
	@GetMapping("/deletar/{id}")
	public String deletarJogador (@PathVariable("id") Long id, RedirectAttributes attr) {
		
		service.deletar(id);
		attr.addFlashAttribute("success","Jogador Excluido");
		return "redirect:/player/listar";
		
		
	}
	
	
}
