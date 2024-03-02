package com.portfolio.demo.Dto;

public class ExperienciaDto {
	private String empresa;
	private String ubicacion;
	private String puesto;
	private String periodo;
	private String actividades;


	public ExperienciaDto(){

	}

	public ExperienciaDto(String empresa, String ubicacion, String puesto, String periodo, String actividades) {
		this.empresa = empresa;
		this.ubicacion = ubicacion;
		this.puesto = puesto;
		this.periodo = periodo;
		this.actividades = actividades;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getActividades() {
		return actividades;
	}

	public void setActividades(String actividades) {
		this.actividades = actividades;
	}
}
