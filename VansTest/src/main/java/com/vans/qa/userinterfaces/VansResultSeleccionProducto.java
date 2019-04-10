package com.vans.qa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VansResultSeleccionProducto extends PageObject {
	
	private static final String validar = "//p[contains(text(),'$120.00')]";
	
	public static final Target validarDetalleProducto = Target.the("Vlaidar el producto")    		
            .locatedBy(validar);

}
