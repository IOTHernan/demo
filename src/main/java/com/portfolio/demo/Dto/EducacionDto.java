package com.portfolio.demo.Dto;

import com.portfolio.demo.Entity.Educacion;

public class EducacionDto {

	private String institucion;
	private String titulo;
	private String periodo;
	private String estado;
	private String detalles;


	public EducacionDto() {}

	public EducacionDto(String institucion, String titulo, String periodo, String estado, String detalles) {
		this.institucion = institucion;
		this.titulo = titulo;
		this.periodo = periodo;
		this.estado = estado;
		this.detalles = detalles;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
}
