package com.corecursos.appinmuebles.services;

import java.util.ArrayList;
import java.util.List;
//import java.util.UUID;

import org.springframework.stereotype.Service;

import com.corecursos.appinmuebles.models.IInmuebleService;
import com.corecursos.appinmuebles.models.Inmueble;

@Service("inmuebleService1")
public class InmuebleService1 implements IInmuebleService{

	private List<Inmueble> listaInmuebles;
	
	public InmuebleService1() {
		
		this.listaInmuebles = new ArrayList<>();
		
		
		/*
		for(int i = 0; i < 100; i++) {
			String referencia = UUID.randomUUID().toString();
			String dniPropietario = "Propietario " + i;
			String tipo = "tipo " + i;
			int precioEuros = (i + 1) * 1000;
			
			Inmueble inmueble = new Inmueble(referencia, dniPropietario, tipo, precioEuros);
			listaInmuebles.add(inmueble);
		}
		*/
		
	    listaInmuebles.add(new Inmueble("25614", "29504498Y", "Casa", 20_000));
	    listaInmuebles.add(new Inmueble("12345", "12345678Z", "Apartamento", 30_000));
	    listaInmuebles.add(new Inmueble("67890", "98765432A", "Piso", 25_000));
	    listaInmuebles.add(new Inmueble("54321", "54321098B", "Chalet", 50_000));
	    listaInmuebles.add(new Inmueble("98765", "01234567C", "Casa", 40_000));
	    listaInmuebles.add(new Inmueble("13579", "98765012D", "Apartamento", 35_000));
	    listaInmuebles.add(new Inmueble("24680", "45678901E", "Piso", 30_000));
	    listaInmuebles.add(new Inmueble("86420", "10987654F", "Chalet", 60_000));
	    listaInmuebles.add(new Inmueble("97531", "76543210G", "Casa", 45_000));
	    listaInmuebles.add(new Inmueble("01234", "21098765H", "Apartamento", 40_000));
	    listaInmuebles.add(new Inmueble("56789", "54321098I", "Piso", 35_000));
	    listaInmuebles.add(new Inmueble("98765", "87654321J", "Chalet", 70_000));
	    listaInmuebles.add(new Inmueble("54321", "21098765K", "Casa", 55_000));
	    listaInmuebles.add(new Inmueble("35791", "65432109L", "Apartamento", 50_000));
	    listaInmuebles.add(new Inmueble("95173", "09876543M", "Piso", 40_000));
	    listaInmuebles.add(new Inmueble("15937", "43210987N", "Chalet", 80_000));
	    listaInmuebles.add(new Inmueble("75319", "87654321O", "Casa", 60_000));
	    listaInmuebles.add(new Inmueble("79135", "21098765P", "Apartamento", 55_000));
	    listaInmuebles.add(new Inmueble("24680", "65432109Q", "Piso", 45_000));
	    listaInmuebles.add(new Inmueble("86420", "09876543R", "Chalet", 90_000));
	    listaInmuebles.add(new Inmueble("13579", "43210987S", "Casa", 70_000));
	    listaInmuebles.add(new Inmueble("95173", "87654321T", "Apartamento", 65_000));
	    listaInmuebles.add(new Inmueble("56789", "21098765U", "Piso", 50_000));
	    listaInmuebles.add(new Inmueble("01234", "65432109V", "Chalet", 100_000));
	    listaInmuebles.add(new Inmueble("98765", "09876543W", "Casa", 80_000));
	    listaInmuebles.add(new Inmueble("54321", "43210987X", "Apartamento", 75_000));
	    listaInmuebles.add(new Inmueble("35791", "87654321Y", "Piso", 60_000));
	    listaInmuebles.add(new Inmueble("97531", "21098765Z", "Chalet", 120_000));
	    listaInmuebles.add(new Inmueble("25614", "29504498Y", "Casa", 20_000));
	    listaInmuebles.add(new Inmueble("12345", "12345678Z", "Apartamento", 30_000));
	    listaInmuebles.add(new Inmueble("67890", "98765432A", "Piso", 25_000));
	    listaInmuebles.add(new Inmueble("54321", "54321098B", "Chalet", 50_000));
	    listaInmuebles.add(new Inmueble("98765", "01234567C", "Casa", 40_000));
	    listaInmuebles.add(new Inmueble("13579", "98765012D", "Apartamento", 35_000));
	    listaInmuebles.add(new Inmueble("24680", "45678901E", "Piso", 30_000));
	    listaInmuebles.add(new Inmueble("86420", "10987654F", "Chalet", 60_000));
	    listaInmuebles.add(new Inmueble("97531", "76543210G", "Casa", 45_000));
	    listaInmuebles.add(new Inmueble("01234", "21098765H", "Apartamento", 40_000));
	    listaInmuebles.add(new Inmueble("56789", "54321098I", "Piso", 35_000));
	    listaInmuebles.add(new Inmueble("98765", "87654321J", "Chalet", 70_000));
	    listaInmuebles.add(new Inmueble("54321", "21098765K", "Casa", 55_000));
	    listaInmuebles.add(new Inmueble("35791", "65432109L", "Apartamento", 50_000));
	    listaInmuebles.add(new Inmueble("95173", "09876543M", "Piso", 40_000));
	    listaInmuebles.add(new Inmueble("15937", "43210987N", "Chalet", 80_000));
	    listaInmuebles.add(new Inmueble("75319", "87654321O", "Casa", 60_000));
	    listaInmuebles.add(new Inmueble("79135", "21098765P", "Apartamento", 55_000));
	    listaInmuebles.add(new Inmueble("24680", "65432109Q", "Piso", 45_000));
	    listaInmuebles.add(new Inmueble("86420", "09876543R", "Chalet", 90_000));
	    listaInmuebles.add(new Inmueble("13579", "43210987S", "Casa", 70_000));
	    listaInmuebles.add(new Inmueble("95173", "87654321T", "Apartamento", 65_000));
	    listaInmuebles.add(new Inmueble("56789", "21098765U", "Piso", 50_000));
	    listaInmuebles.add(new Inmueble("01234", "65432109V", "Chalet", 100_000));
	    listaInmuebles.add(new Inmueble("98765", "09876543W", "Casa", 80_000));
	    listaInmuebles.add(new Inmueble("54321", "43210987X", "Apartamento", 75_000));
	    listaInmuebles.add(new Inmueble("35791", "87654321Y", "Piso", 60_000));
	    listaInmuebles.add(new Inmueble("97531", "21098765Z", "Chalet", 120_000));
	    listaInmuebles.add(new Inmueble("25614", "29504498Y", "Casa", 20_000));
	    listaInmuebles.add(new Inmueble("12345", "12345678Z", "Apartamento", 30_000));
	    listaInmuebles.add(new Inmueble("67890", "98765432A", "Piso", 25_000));
	    listaInmuebles.add(new Inmueble("54321", "54321098B", "Chalet", 50_000));
	    listaInmuebles.add(new Inmueble("98765", "01234567C", "Casa", 40_000));
	    listaInmuebles.add(new Inmueble("13579", "98765012D", "Apartamento", 35_000));
	    listaInmuebles.add(new Inmueble("24680", "45678901E", "Piso", 30_000));
	    listaInmuebles.add(new Inmueble("86420", "10987654F", "Chalet", 60_000));
	    listaInmuebles.add(new Inmueble("97531", "76543210G", "Casa", 45_000));
	    listaInmuebles.add(new Inmueble("01234", "21098765H", "Apartamento", 40_000));
	    listaInmuebles.add(new Inmueble("56789", "54321098I", "Piso", 35_000));
	    listaInmuebles.add(new Inmueble("98765", "87654321J", "Chalet", 70_000));
	    listaInmuebles.add(new Inmueble("54321", "21098765K", "Casa", 55_000));
	    listaInmuebles.add(new Inmueble("35791", "65432109L", "Apartamento", 50_000));
	    listaInmuebles.add(new Inmueble("95173", "09876543M", "Piso", 40_000));
	    listaInmuebles.add(new Inmueble("15937", "43210987N", "Chalet", 80_000));
	    listaInmuebles.add(new Inmueble("75319", "87654321O", "Casa", 60_000));
	    listaInmuebles.add(new Inmueble("79135", "21098765P", "Apartamento", 55_000));
	    listaInmuebles.add(new Inmueble("24680", "65432109Q", "Piso", 45_000));
	    listaInmuebles.add(new Inmueble("86420", "09876543R", "Chalet", 90_000));
	    listaInmuebles.add(new Inmueble("13579", "43210987S", "Casa", 70_000));
	    listaInmuebles.add(new Inmueble("95173", "87654321T", "Apartamento", 65_000));
	    listaInmuebles.add(new Inmueble("56789", "21098765U", "Piso", 50_000));
	    listaInmuebles.add(new Inmueble("01234", "65432109V", "Chalet", 100_000));
	    listaInmuebles.add(new Inmueble("98765", "09876543W", "Casa", 80_000));
	    listaInmuebles.add(new Inmueble("54321", "43210987X", "Apartamento", 75_000));
	    listaInmuebles.add(new Inmueble("35791", "87654321Y", "Piso", 60_000));
	    listaInmuebles.add(new Inmueble("97531", "21098765Z", "Chalet", 120_000));
	    listaInmuebles.add(new Inmueble("25614", "29504498Y", "Casa", 20_000));
	    listaInmuebles.add(new Inmueble("12345", "12345678Z", "Apartamento", 30_000));
	    listaInmuebles.add(new Inmueble("67890", "98765432A", "Piso", 25_000));
	    listaInmuebles.add(new Inmueble("54321", "54321098B", "Chalet", 50_000));
	    listaInmuebles.add(new Inmueble("98765", "01234567C", "Casa", 40_000));
	    listaInmuebles.add(new Inmueble("13579", "98765012D", "Apartamento", 35_000));
	    listaInmuebles.add(new Inmueble("24680", "45678901E", "Piso", 30_000));
	    listaInmuebles.add(new Inmueble("86420", "10987654F", "Chalet", 60_000));
	    listaInmuebles.add(new Inmueble("97531", "76543210G", "Casa", 45_000));
	    listaInmuebles.add(new Inmueble("01234", "21098765H", "Apartamento", 40_000));
	    listaInmuebles.add(new Inmueble("56789", "54321098I", "Piso", 35_000));
	    listaInmuebles.add(new Inmueble("98765", "87654321J", "Chalet", 70_000));
	    listaInmuebles.add(new Inmueble("54321", "21098765K", "Casa", 55_000));
	    listaInmuebles.add(new Inmueble("35791", "65432109L", "Apartamento", 50_000));
	    listaInmuebles.add(new Inmueble("95173", "09876543M", "Piso", 40_000));
		
	}
	
	@Override
	public List<Inmueble> getByPropietario(String dniPropietario) {
		List<Inmueble> inmuebles = new ArrayList<>();
		if(dniPropietario == null) return null;
		for(Inmueble inmueble : listaInmuebles) {
			if(dniPropietario.equals(inmueble.getDniPropietario())){
				inmuebles.add(inmueble);
			}
		}
		
		return inmuebles;
	}

	@Override
	public List<Inmueble> getByTipo(String tipo) {
		List<Inmueble> inmuebles = new ArrayList<>();
		if(tipo == null) return null;
		for(Inmueble inmueble: listaInmuebles) {
			if(tipo.equalsIgnoreCase(inmueble.getTipo())) {
				inmuebles.add(inmueble);
			}
		}
		return inmuebles;
	}

	@Override
	public List<Inmueble> getByReferencia(String referencia) {
		List<Inmueble> inmuebles = new ArrayList<>();
		
		for(Inmueble inmueble : listaInmuebles) {
			if(referencia.equals(inmueble.getReferencia())){
				inmuebles.add(inmueble);
			}
		}
		return inmuebles;
	}

	@Override
	public List<Inmueble> listarInmuebles() {
		
		return listaInmuebles;
	}

}
