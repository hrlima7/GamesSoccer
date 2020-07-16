package br.com.roma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.roma.domain.Tecnico;
import br.com.roma.repository.RepositoryTecnico;

@Transactional
@Service
public class ServiceTecnico {
	
	@Autowired
	RepositoryTecnico repo;
	
	@Transactional(readOnly = false)
	public Tecnico salvar(Tecnico tecnico) {
	
		return repo.saveAndFlush(tecnico);

	}
	
	
	
	
}
