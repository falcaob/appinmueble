package com.corecursos.appinmuebles.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.corecursos.appinmuebles.models.IInmuebleService;
import com.corecursos.appinmuebles.models.Inmueble;

@Service("inmuebleService2")
public class InmuebleService2 implements IInmuebleService{

	private List<Inmueble> listaInmuebles;
	
	public InmuebleService2() {
		
		this.listaInmuebles = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			String referencia = UUID.randomUUID().toString();
			String dniPropietario = "Propietario " + i;
			String tipo = "tipo " + i;
			int precioEuros = (i + 1) * 1000;
			
			Inmueble inmueble = new Inmueble(referencia, dniPropietario, tipo, precioEuros);
			listaInmuebles.add(inmueble);
		}
		
	}
	
	@Override
	public List<Inmueble> getByPropietario(String dniPropietario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inmueble> getByTipo(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inmueble> getByReferencia(String referencia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inmueble> listarInmuebles() {
		
		return listaInmuebles;
	}

}
