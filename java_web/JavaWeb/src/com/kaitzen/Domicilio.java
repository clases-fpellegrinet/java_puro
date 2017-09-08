package com.kaitzen;

public class Domicilio {
	private Integer idDomcicilio;
	private String calle;
	private String nro;
	private String departamento;
	private String piso;
	private Localidad localidad;
	
	public Integer getIdDomcicilio() {
		return idDomcicilio;
	}
	public void setIdDomcicilio(Integer idDomcicilio) {
		this.idDomcicilio = idDomcicilio;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
}
