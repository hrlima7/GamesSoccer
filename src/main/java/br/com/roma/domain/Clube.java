package br.com.roma.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;





@Entity
@Table
public class Clube extends AbstractEntity<Long>{
	
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name="name_clube")
	private String nome;	
	
	@OneToMany(mappedBy="clube")
	private List<Tecnico> tecnicos;
	
	@Lob @Column(name="escudo")
	private Byte[] escudo;
	
	@OneToMany(mappedBy="clube")
	private List<Player> players;
	
	
	
	public Clube(String nome, List<Tecnico> tecnicos, List<Player> player) {
		super();
		this.nome = nome;
		this.tecnicos = tecnicos;
		this.players = player;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Clube(String nome) {
		super();
		this.nome = nome;
	}


	public Clube() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<Tecnico> getTecnico() {
		return tecnicos;
	}


	public void setTecnico(List<Tecnico>tecnico) {
		this.tecnicos = tecnico;
	}


	public List<Player> getPlayer() {
		return players;
	}


	public void setPlayer(List<Player> player) {
		this.players = player;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}


	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}


	public Byte[] getEscudo() {
		return escudo;
	}


	public void setEscudo(Byte[] escudo) {
		this.escudo = escudo;
	}


	public List<Player> getPlayers() {
		return players;
	}


	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	

	
	

}
