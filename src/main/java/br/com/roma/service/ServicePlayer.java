package br.com.roma.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.roma.domain.Player;
import br.com.roma.repository.RepositoryPlayer;

@Transactional
@Service
public class ServicePlayer {
	
	@Autowired
	EntityManager em;

	
	@Autowired
	RepositoryPlayer repo;
	
	public Player cadastrar(Player player) {
		player.setId(null);
		return repo.save(player);
	}
	
	public List<Player> listar() {	
		return repo.findAll();
	}

	@SuppressWarnings("unchecked")
	public List<Player> consuNome(String nome ) {
		return em.createQuery(
			    "SELECT c FROM Player c WHERE c.nome LIKE :nome",Player.class)
			    .setParameter("nome", nome+"%")
			    .getResultList();
	}
	public Player buscarPorId(Long id) {		
		Optional<Player> obj = repo.findById(id);	
		return obj.orElse(null);
	}
	
	public Player editar(Player player) {
		return repo.save(player);
	}
	
	public void deletar(Long id) {
		
		repo.deleteById(id);
	}
	

}
