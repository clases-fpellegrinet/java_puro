package com.kaitzen;

import java.util.List;

public class Cliente extends Persona {
	private String riesgoCrediticio;
	private Domicilio domicilio;
	private SituacionLaboral situacionLaboral;
	private List<TarjetaCredito> tarjetaCredito;
	private List<TipoProducto> productosInteresado;

	public String getRiesgoCrediticio() {
		return riesgoCrediticio;
	}

	public void setRiesgoCrediticio(String riesgoCrediticio) {
		this.riesgoCrediticio = riesgoCrediticio;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public SituacionLaboral getSituacionLaboral() {
		return situacionLaboral;
	}

	public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
		this.situacionLaboral = situacionLaboral;
	}

	public List<TarjetaCredito> getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(List<TarjetaCredito> tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public List<TipoProducto> getProductosInteresado() {
		return productosInteresado;
	}

	public void setProductosInteresado(List<TipoProducto> productosInteresado) {
		this.productosInteresado = productosInteresado;
	}
	
	@Override
	public String toString() {
		return "Datos del cliente:"+ this.nombre + " "+ this.apellido +  " "+ this.tipoDocumento + ":" +this.nroDocumento;
	}
	
}
