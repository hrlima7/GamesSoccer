package br.com.roma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.roma.domain.Player;


public interface RepositoryPlayer extends JpaRepository<Player,Long> {

	
	
}
