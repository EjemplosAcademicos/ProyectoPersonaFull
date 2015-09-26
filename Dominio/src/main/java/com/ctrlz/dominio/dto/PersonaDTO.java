package com.ctrlz.dominio.dto;

public class PersonaDTO implements java.io.Serializable {

	private long idn;
	private String vrNombre;
	private String vrApellido;

	public PersonaDTO() {
	}

	public PersonaDTO(String vrNombre, String vrApellido) {
		this.idn = idn;
		this.vrNombre = vrNombre;
		this.vrApellido = vrApellido;
	}

	public long getIdn() {
		return this.idn;
	}

	public void setIdn(long idn) {
		this.idn = idn;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public String getVrApellido() {
		return this.vrApellido;
	}

	public void setVrApellido(String vrApellido) {
		this.vrApellido = vrApellido;
	}
}
