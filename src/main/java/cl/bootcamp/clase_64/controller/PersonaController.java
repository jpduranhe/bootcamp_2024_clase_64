package cl.bootcamp.clase_64.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.clase_64.model.Persona;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	@GetMapping("/form")
	public ModelAndView formGet() {
		
		return new ModelAndView("persona-formulario.jsp");
	}
	@PostMapping("/form")
	public ModelAndView formPost(@ModelAttribute Persona persona) {
		
		Map<String,Object> model= new HashMap<>();
		model.put("papo", persona);
		
		return new ModelAndView("persona.jsp",model);
	}
}
