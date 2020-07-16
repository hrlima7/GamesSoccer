package br.com.roma.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name="player")
public class Player extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;
	private String nome;
	private Integer idade;
	
	@NumberFormat(style = Style.CURRENCY)
	@Column(name="salario", columnDefinition ="DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@NumberFormat(style = Style.CURRENCY)
	@Column(name = "valor_do_passe", columnDefinition ="DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal valorDoPasse;
	
	@DateTimeFormat(iso =ISO.DATE)
	@Column(name="data_contratacao", columnDefinition="DATE")
	private LocalDate dataDaContratacao ;
	
	@ManyToOne
	private Clube clube;

	public Player() {
		super();
		
	}
	public Player(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public BigDecimal getValorDoPasse() {
		return valorDoPasse;
	}
	public void setValorDoPasse(BigDecimal valorDoPasse) {
		this.valorDoPasse = valorDoPasse;
	}
	public LocalDate getDataDaContratacao() {
		return dataDaContratacao;
	}
	public void setDataDaContratacao(LocalDate dataDaContratacao) {
		this.dataDaContratacao = dataDaContratacao;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	
	
	
	

}
