package com.corecursos.appinmuebles.models;

import java.util.List;

public interface IInmuebleService {
	
	List<Inmueble> getByPropietario(String dniPropietario);
	List<Inmueble> getByTipo(String tipo);
	Inmueble getByReferencia(String referencia);
	List<Inmueble> listarInmuebles();
}

