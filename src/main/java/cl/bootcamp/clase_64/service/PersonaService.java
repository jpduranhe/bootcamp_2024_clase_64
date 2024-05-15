package cl.bootcamp.clase_64.service;

import cl.bootcamp.clase_64.model.Persona;

public interface PersonaService {

	boolean validaPersona(Persona persona);
	
	Persona obtenerPersona(int id);
	
	boolean guardarPersona(Persona persona);
}
