package com.ctrlz.persona.ngc;

import com.ctrlz.dominio.dto.PersonaDTO;
import com.ctrlz.persona.dao.PersonaDaoInt;
import com.ctrlz.util.excepcion.ExcepcionDao;
import com.ctrlz.util.excepcion.ExcepcionNgc;

public class PersonaNgc implements PersonaNgcInt {
	
	private PersonaDaoInt personaDao;
	
	public void setPersonaDao(PersonaDaoInt personaDao) {
		this.personaDao = personaDao;
	}

	public void crearPersona(PersonaDTO personaDTO) throws ExcepcionNgc{
		try {
			personaDao.crearPersona(personaDTO);
			personaDao.crearPersonaSession(personaDTO);
		} catch (ExcepcionDao e) {
			ExcepcionNgc expNgc = new ExcepcionNgc(e);			
			throw expNgc;
		} catch (Exception e) {
			ExcepcionNgc expNgc = new ExcepcionNgc(e);			
			expNgc.setMensajeUsuario("Error validando información");
			throw expNgc;
		}
	}
	
	
//	private String mensaje;
//
//	public String getMensaje() {
//		return mensaje;
//	}
//
//	public void setMensaje(String mensaje) {
//		this.mensaje = mensaje;
//	}

}
