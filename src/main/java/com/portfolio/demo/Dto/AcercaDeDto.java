package com.portfolio.demo.Dto;

public class AcercaDeDto {
	private String fullname;
	private String posicion;
	private String descripcion;

	public AcercaDeDto(String fullname, String posicion, String descripcion) {
		this.fullname = fullname;
		this.posicion = posicion;
		this.descripcion = descripcion;
	}

	public AcercaDeDto() {}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
