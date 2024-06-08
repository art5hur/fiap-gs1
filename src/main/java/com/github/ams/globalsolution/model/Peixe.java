package com.github.ams.globalsolution.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "peixes")
public class Peixe extends AbstractEntity<Long> {

	@Column(name = "nome_peixe", nullable = false, length = 60)
	private String nome;

	@Column(nullable = false, length = 60)
	private String descricao;
	
	@Column(nullable = true, columnDefinition = "NUMERIC(15,2)")
	private BigDecimal pesoMax;
	
	@Column(nullable = true, columnDefinition = "DATE")
	private LocalDate dataCatalogacao;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(BigDecimal pesoMax) {
		this.pesoMax = pesoMax;
	}

	public LocalDate getDataCatalogacao() {
		return dataCatalogacao;
	}

	public void setDataCatalogacao(LocalDate dataCatalogacao) {
		this.dataCatalogacao = dataCatalogacao;
	}


	

	

}
