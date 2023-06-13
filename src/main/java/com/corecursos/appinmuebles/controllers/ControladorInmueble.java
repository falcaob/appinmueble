package com.corecursos.appinmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corecursos.appinmuebles.models.IInmuebleService;

@Controller
@RequestMapping("inmueble/")
public class ControladorInmueble {
	
	@Autowired
	@Qualifier("inmuebleService1")
	private IInmuebleService servicioInmueble;
	
	@Value("Datos inmuebles")
	public String titulo;
	
	public String m1(Model model) {
		
		model.addAttribute("titulo", titulo);
		model.addAttribute("inmueble", servicioInmueble.listarInmuebles());
		
		return "inmueble";
	}
}
