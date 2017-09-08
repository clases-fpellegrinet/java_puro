package com.kaitzen;

public abstract class Persona {
	protected Integer idPersona;
	protected String nombre;
	protected String apellido;
	protected Long nroDocumento;
	protected TipoDocumento tipoDocumento;
	protected String correoElectronico;
	protected SituacionFiscal sitFiscal;
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(Long nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public SituacionFiscal getSitFiscal() {
		return sitFiscal;
	}
	public void setSitFiscal(SituacionFiscal sitFiscal) {
		this.sitFiscal = sitFiscal;
	}
	
}
