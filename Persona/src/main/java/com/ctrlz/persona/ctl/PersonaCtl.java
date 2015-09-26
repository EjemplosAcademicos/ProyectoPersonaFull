package com.ctrlz.persona.ctl;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.South;
import org.zkoss.zul.Textbox;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ctrlz.dominio.dto.PersonaDTO;
import com.ctrlz.persona.ngc.PersonaNgcInt;
import com.ctrlz.persona.ngc.PersonaNgc;
import com.ctrlz.util.excepcion.ExcepcionNgc;

public class PersonaCtl extends GenericForwardComposer{
	
	private Textbox txtNombre;
	private Textbox txtApellido;
    private PersonaNgcInt personaNgc;
	
	public PersonaCtl(){
		//ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/applicationContext.xml");
		//personaNgc = (PersonaNgc) context.getBean("beanPersonaNgc");
		
		//****Prueba SCOPE bean Singleton vs Prototype****///
//		ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/applicationContext.xml");
//		PersonaNgc personaNgc = (PersonaNgc) context.getBean("beanPersonaNgc");
//		personaNgc.setMensaje("Hola soy personaNgc");
//		System.out.println(personaNgc.getMensaje());
//		
//		PersonaNgc personaNgc2 = (PersonaNgc) context.getBean("beanPersonaNgc");
//		System.out.println(personaNgc2.getMensaje());
	}
	
	public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);        
    }
	
	public void setPersonaNgc(PersonaNgcInt personaNgc) {
		this.personaNgc = personaNgc;
	}

	public void onClick$btnCrear(Event e){

		String nombre = txtNombre.getText();
		String apellido = txtApellido.getText();
		
		if(!nombre.equals("") && !apellido.equals("")){
			PersonaDTO personaDTO = new PersonaDTO(nombre, apellido);
			boolean bandera = false;
			try {
				personaNgc.crearPersona(personaDTO);
				Messagebox.show("Persona Creada" , "Informacion", Messagebox.OK, Messagebox.INFORMATION);
			} catch (ExcepcionNgc except) {
				except.imprimirMensajeTecnicoConsola();
				Messagebox.show(except.getMensajeUsuario(), "Error", Messagebox.OK, Messagebox.ERROR);
			}
	
		}else{
			Messagebox.show("Ingrese nombre", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
		}
	}

}
