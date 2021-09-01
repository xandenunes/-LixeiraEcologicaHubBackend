package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="material_publicado")
public class Publicacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idmaterial_publicado;
	@Column
	private String titulo;
	@Column
	private Integer idusuario;
	@Column
	private String imgURL;
	@Column	
	private String descricao;
	@Column
	private String telefone;
	@Column
	private Integer status;
	@Column
	private Integer tipo_material;
	@Column
	private Date data;
	
	public Publicacao() {
		
	}
	public Integer getIdmaterial_publicado() {
		return idmaterial_publicado;
	}
	public void setIdmaterial_publicado(Integer idmaterial_publicado) {
		this.idmaterial_publicado = idmaterial_publicado;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	public Integer getTipo_material() {
		return tipo_material;
	}
	public void setTipo_material(Integer tipo_material) {
		this.tipo_material = tipo_material;
	}
}
