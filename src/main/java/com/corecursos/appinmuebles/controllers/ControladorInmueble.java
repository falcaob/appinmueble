package com.corecursos.appinmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corecursos.appinmuebles.models.IInmuebleService;

@Controller
@RequestMapping("inmuebles")
public class ControladorInmueble {

	@Autowired
	@Qualifier("inmuebleService1")
	private IInmuebleService servicioInmueble;

	@Value("¡Encuentra aqui tú inmueble!")
	public String titulo;

	// Menú principal
	@GetMapping("/menu-principal")
	public String m1(Model model) {

		model.addAttribute("titulo", "Inicio");

		return "index";
	}

	// Enlace lista completa de inmuebles
	@GetMapping("/listado")
	public String m2(Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("listaInmuebles", servicioInmueble.listarInmuebles());

		return "inmuebles";
	}

	// Enlace búsqueda por dni
	@GetMapping("/dni/{dni}")
	public String m3(@PathVariable String dni, Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("titulo1", "Listado por DNI del Propietario");
		model.addAttribute("dni", servicioInmueble.getByPropietario(dni));

		return "dni";
	}

	// Enlace búsqueda por referencia
	@GetMapping("/referencia/{referencia}")
	public String m4(@PathVariable String referencia, Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("titulo1", "Listado por referencia");
		model.addAttribute("referencia", servicioInmueble.getByReferencia(referencia));

		return "referencia";
	}

	// Index búsqueda por tipos
	@GetMapping("/listado-tipos")
	public String m5(Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("titulo1", "Búqueda por tipo: pincha en la foto del inmueble");
		

		return "tipos";
	}

	// Index búsqueda por tipos
	@GetMapping("/tipo/{tipo}")
	public String m6(@PathVariable String tipo, Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("tipo", servicioInmueble.getByTipo(tipo));

		return "tipo";
	}

}
