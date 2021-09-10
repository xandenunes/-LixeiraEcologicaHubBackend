package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="interessados_publicacao_log")
public class Interessado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;


	@Column
	private Integer idmaterial_publicado;
	
	@OneToOne
	@JoinColumn(name="id_usuario_interessado")
	@JsonIgnoreProperties({"publicacoes", "interessado","data_nascimento","senha"})
	private Usuario usuario;
	
	@Column 
	private Integer id_usuario_contemplado;

	public Interessado() {
		
	}

	public Integer getIdmaterial_publicado() {
		return idmaterial_publicado;
	}

	public void setIdmaterial_publicado(Integer idmaterial_publicado) {
		this.idmaterial_publicado = idmaterial_publicado;
	}




	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId_usuario_contemplado() {
		return id_usuario_contemplado;
	}

	public void setId_usuario_contemplado(Integer id_usuario_contemplado) {
		this.id_usuario_contemplado = id_usuario_contemplado;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
