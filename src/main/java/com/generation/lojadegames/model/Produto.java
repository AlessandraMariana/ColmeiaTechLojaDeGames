package com.generation.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 5, max = 100,message="Este atributo tem que ter no mínimo 5 caracteres e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 10, max = 1000,message="Este atributo tem que ter no mínimo 10 caracteres e no máximo 1000 caracteres")
	private String descricao ;
	
	@Positive(message = "Campo de valor positivo.")
	private float preco; 
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 10, max = 100,message="Este atributo tem que ter no mínimo 10 caracteres e no máximo 100 caracteres")
	private String plataforma;
	

	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public Float getPreco() {
		return preco;
	}


	public void setPreco(Float preco) {
		this.preco = preco;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
}
