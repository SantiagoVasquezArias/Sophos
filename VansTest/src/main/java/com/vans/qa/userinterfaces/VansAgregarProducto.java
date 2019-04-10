package com.vans.qa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VansAgregarProducto extends PageObject  {
	
	private static final String agregarProducto = "//a[@class='product-content-form-add-to-bag button primary add-to-bag-js']";
	private static final String carrito ="//span[@class='shoppingbag-label']"; 
	
	public static final Target agregarProductoCompra = Target.the("Agregar producto")    		
            .locatedBy(agregarProducto);
	
	public static final Target ProductoCompra = Target.the("Compra")    		
            .locatedBy(carrito);
	
	
}
