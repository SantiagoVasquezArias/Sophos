package com.vans.qa.exceptions;

public class ExcepcionDeBusqueda extends AssertionError {
	
	public static final String fraseNoFunciona ="el producto no corresponde a la busqueda";
	
	public ExcepcionDeBusqueda (String mensaje, Throwable cause) {
		super(mensaje,cause);
		
	}

}
