package com.vans.qa.exceptions;

public class ExceptionDetalleProducto extends AssertionError {
	
public static final String detalleProducto ="el valor del producto no corresponde con el esperado";
	
	public ExceptionDetalleProducto (String mensaje, Throwable cause) {
		super(mensaje,cause);
		
	}

}
