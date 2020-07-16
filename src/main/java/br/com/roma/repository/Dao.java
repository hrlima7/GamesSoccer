package br.com.roma.repository;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.roma.domain.Player;

public class Dao {

	EntityManager em ;
	
	@SuppressWarnings("unchecked")
	public List<Player> Novaconsulta(String nome ) {
		
		return em.createQuery(
			    "SELECT c FROM player c WHERE c.nome LIKE :nome")
			    .setParameter("nome", nome)
			    .setMaxResults(10)
			    .getResultList();
	}
	
}
