package com.ctrlz.util.excepcion;

public class ExcepcionNgc extends ExcepcionGenerica{
	
	public ExcepcionNgc(ExcepcionGenerica expGen){
		excepcionOrigen = expGen;
		mensajeUsuario = expGen.mensajeUsuario;
		mensajeTecnico = expGen.mensajeTecnico;
	}
	
	public ExcepcionNgc(Exception expGen){
		excepcionOrigen = expGen;		
	}
	public ExcepcionNgc(){
	}
}
