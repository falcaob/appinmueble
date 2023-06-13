package com.corecursos.appinmuebles.models;

public class Inmueble {
	
	private String referencia;
	private String dniPropietario;
	private String tipo;
	private int precioEuros;
	
	public Inmueble() {}

	public Inmueble(String referencia, String dniPropietario, String tipo, int precioEuros) {
		super();
		this.referencia = referencia;
		this.dniPropietario = dniPropietario;
		this.tipo = tipo;
		this.precioEuros = precioEuros;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecioEuros() {
		return precioEuros;
	}

	public void setPrecioEuros(int precioEuros) {
		this.precioEuros = precioEuros;
	}
	
	
}
