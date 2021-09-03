package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="tipo_material")
public class Material {
	@Id
	private Integer idtipo_material;
	@Column
	private String titulo_material;
	@OneToMany(fetch = FetchType.EAGER, mappedBy="material")
	private List<Publicacao> publicacoes;
	
	


	public Material() {
		
	}
	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}	
	public Integer getIdtipo_material() {
		return idtipo_material;
	}
	public void setIdtipo_material(Integer idtipo_material) {
		this.idtipo_material = idtipo_material;
	}
	public String getTitulo_material() {
		return titulo_material;
	}
	public void setTitulo_material(String titulo_material) {
		this.titulo_material = titulo_material;
	}
}
