package com.portfolio.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@JsonIgnoreProperties({ "hibernateLazyInitializer","handler"})
@Entity
public class Educacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GenericGenerator(name = "native")
	private Long id;
	private String institucion;
	private String titulo;
	private String periodo;
	private String estado;
	private String detalles;


	public Educacion() {}

	public Educacion(String institucion, String titulo, String periodo, String estado, String detalles) {
		this.institucion = institucion;
		this.titulo = titulo;
		this.periodo = periodo;
		this.estado = estado;
		this.detalles = detalles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
