package com.ctrlz.persona.ngc;

import com.ctrlz.dominio.dto.PersonaDTO;
import com.ctrlz.util.excepcion.ExcepcionNgc;

public interface PersonaNgcInt {
	
	public void crearPersona(PersonaDTO personaDTO) throws ExcepcionNgc;

}
