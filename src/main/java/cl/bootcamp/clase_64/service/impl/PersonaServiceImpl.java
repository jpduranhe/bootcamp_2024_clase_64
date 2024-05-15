package cl.bootcamp.clase_64.service.impl;

import org.springframework.stereotype.Service;

import cl.bootcamp.clase_64.model.Persona;
import cl.bootcamp.clase_64.service.PersonaService;


@Service
public class PersonaServiceImpl implements PersonaService{
	// @Autowired
	// PersonaDAO personaDao;

	@Override
	public boolean validaPersona(Persona persona) {
		
		return !persona.getNombre().isBlank() &&
			   !persona.getApellido().isBlank();
	}

	@Override
	public Persona obtenerPersona(int id) {
		
		return new Persona();
	}

	@Override
	public boolean guardarPersona(Persona persona) {
		
		return false;
	}

}
