package com.corecursos.appinmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corecursos.appinmuebles.models.IInmuebleService;

@Controller
@RequestMapping({ "/index", "/", "" })
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
	@GetMapping("/listado-inmuebles")
	public String m2(Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("listaInmuebles", servicioInmueble.listarInmuebles());

		return "inmuebles";
	}

	// Enlace búsqueda por dni
	@GetMapping("/dni/{dni}")
	public String m3(@RequestParam(required = false) String dni, Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("propietario", dni);
		// model.addAttribute("dni", servicioInmueble.getByPropietario(dni));

		if (dni == null) {
			model.addAttribute("dni", servicioInmueble.getByPropietario(dni));
		} else {
			model.addAttribute("dni", servicioInmueble.getByPropietario(dni));
		}

		return "dni";
	}

	// Enlace búsqueda por dni
	@GetMapping("/referencia/{referencia}")
	public String m4(@RequestParam(required = false) String referencia, Model model) {

		model.addAttribute("titulo", titulo);
		model.addAttribute("ref", referencia);

		if (referencia == null) {
			model.addAttribute("referencia", servicioInmueble.getByReferencia(referencia));
		} else {
			model.addAttribute("referencia", servicioInmueble.getByReferencia(referencia));
		}

		return "referencia";
	}

}
