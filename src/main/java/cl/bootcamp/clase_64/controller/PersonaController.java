package cl.bootcamp.clase_64.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.clase_64.model.Persona;
import cl.bootcamp.clase_64.service.PersonaService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaController {
	
	
	private final PersonaService personaService;
	
	/** esta no necesario por que estamos utilizando la notacion de lombok 
	 * @RequiredArgsConstructor
	public PersonaController(PersonaService personaService) {
		this.personaService=personaService;
	}
	
	 */
	@GetMapping("/form")
	public ModelAndView formGet() {
		
		return new ModelAndView("persona-formulario.jsp");
	}
	@PostMapping("/form")
	public ModelAndView formPost(@ModelAttribute Persona persona) {
		
		Map<String,Object> model= new HashMap<>();
		model.put("papo", persona);
		
		if(!personaService.validaPersona(persona)) {
			return  new ModelAndView("persona-error.jsp");
		}
		
		return new ModelAndView("persona.jsp",model);
	}
}
