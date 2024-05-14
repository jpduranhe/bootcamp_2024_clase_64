package cl.bootcamp.clase_64.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/saludo")
public class SaludoController {
	
	@GetMapping("/hola")
	public ModelAndView hola() {
		
		Map<String,Object> model= new HashMap<>();
		model.put("name", "Sandy");
		
		return new ModelAndView("hello.jsp",model);
	}
	@GetMapping("/hola/{nombre1}/{nombre2}")
	public ModelAndView hola2Nombre(@PathVariable String nombre1,@PathVariable String nombre2) {
		
		Map<String,Object> model= new HashMap<>();
		model.put("nombre1", nombre1);
		model.put("nombre2", nombre2);
		return new ModelAndView("hello.jsp",model);
	}
	@GetMapping("/hello")
	public ModelAndView hola2NombreParemtros(@RequestParam("nom") String nombre) {
		
		Map<String,Object> model= new HashMap<>();
		model.put("nombre1", nombre);
		model.put("nombre2", "Jaime");
		return new ModelAndView("hello.jsp",model);
	}

}
