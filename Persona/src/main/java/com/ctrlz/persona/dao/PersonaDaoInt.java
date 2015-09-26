package com.ctrlz.persona.dao;

import java.util.List;

import com.ctrlz.dominio.dto.PersonaDTO;
import com.ctrlz.util.excepcion.ExcepcionDao;

public interface PersonaDaoInt {
	
	public void crearPersonaSession(PersonaDTO personaDTO) throws ExcepcionDao;
	public void crearPersona(PersonaDTO personaDTO)throws ExcepcionDao;
	public List<PersonaDTO> listarPersona()throws ExcepcionDao;

}
