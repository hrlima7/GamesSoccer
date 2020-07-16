package br.com.roma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



import br.com.roma.domain.Clube;

public interface RepositoryClube extends JpaRepository <Clube,Long> {

	
	
}
