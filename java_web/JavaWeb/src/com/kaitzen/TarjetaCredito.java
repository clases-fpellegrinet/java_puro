package com.kaitzen;

import java.util.Date;

public class TarjetaCredito {
	private Integer idTarjetaCredito;
	private String bancoEmisor;
	private Date fechaVencimiento;
	private String numero;
	private String descripcion;
	public Integer getIdTarjetaCredito() {
		return idTarjetaCredito;
	}
	public void setIdTarjetaCredito(Integer idTarjetaCredito) {
		this.idTarjetaCredito = idTarjetaCredito;
	}
	public String getBancoEmisor() {
		return bancoEmisor;
	}
	public void setBancoEmisor(String bancoEmisor) {
		this.bancoEmisor = bancoEmisor;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
