package br.com.roma.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table
public class Tecnico extends AbstractEntity<Long>{
	
	private static final long serialVersionUID = 1L;


	private String nome;
	
	
	@ManyToOne
	@JoinColumn(name="Fk_clube")
	private Clube clube;
	
	
	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub}
	}
	public Tecnico(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}
	
	

}
