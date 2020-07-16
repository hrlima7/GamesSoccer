package br.com.roma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.roma.domain.Clube;
import br.com.roma.repository.RepositoryClube;

@Transactional
@Service
public class ServiceClube {
	
	@Autowired
	RepositoryClube repository;
	
		
	public Clube salvar(Clube clube) {
	    return  repository.save(clube);
	}
	
	public Clube buscarPorId(Long id ) {
		 Optional < Clube > optional = repository.findById(id);
	        Clube clube = null;
	        if (optional.isPresent()) {
	            clube = optional.get();
	        } 	else {
	            throw new RuntimeException(" Clube nao encontrado :: " + id);
	        	}
	 return clube;
	}
	
	public List<Clube>listar(){		
		
		return repository.findAll();
	}
	
	
}
