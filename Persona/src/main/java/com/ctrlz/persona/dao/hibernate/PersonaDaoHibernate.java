package com.ctrlz.persona.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ctrlz.dominio.dto.PersonaDTO;
import com.ctrlz.persona.dao.PersonaDaoInt;
import com.ctrlz.util.excepcion.ExcepcionDao;

public class PersonaDaoHibernate extends HibernateDaoSupport implements PersonaDaoInt   {

	public void crearPersonaSession(PersonaDTO personaDTO) throws ExcepcionDao {
		Session session = null;
		try{
			session = getSession();
			session.save(personaDTO);
			session.flush(); 
		}catch(Exception e){
			//Rollback
			ExcepcionDao expDao = new ExcepcionDao();
			expDao.setExcepcionOrigen(e);
			expDao.setMensajeUsuario("Error almacenando persona");
			throw expDao;
		}
		finally{
			session.close();
		}
	}

	public void crearPersona(PersonaDTO personaDTO)throws ExcepcionDao{
		try{
			this.getHibernateTemplate().save(personaDTO);
		}catch(Exception e){
			ExcepcionDao expDao = new ExcepcionDao();
			expDao.setExcepcionOrigen(e);
			expDao.setMensajeUsuario("Error almacenando persona");
			throw expDao;
		}
		 
	}

	public List<PersonaDTO> listarPersona() throws ExcepcionDao {
		// TODO Auto-generated method stub
		return null;
	}



}
