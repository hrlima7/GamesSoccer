package br.com.roma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.roma.domain.Tecnico;

public interface RepositoryTecnico extends JpaRepository<Tecnico,Long> {

}
