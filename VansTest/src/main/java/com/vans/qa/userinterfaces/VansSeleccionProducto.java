package com.vans.qa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.vans.com/webapp/wcs/stores/servlet/VFSearchDisplay?storeId=10153&catalogId=10703&langId=-1&beginIndex=0&searchSource=Q&sType=SimpleSearch&searchTerm=oldSkool")
public class VansSeleccionProducto extends PageObject  {
	
	
		
		private static final String productoSeleccionado = "//div[2]//div[2]//div[3]//a[1]//span[1]" ;
		//private static final String botonProductoSeleccioado ="//div[2]//div[2]//div[3]//a[1]//span[1]" ;
		private static final String seleccionarTalla ="//select[@id='attr-size']";
		private static final String seleccionarCantidad ="//select[@id='quantity-item']";
		
		public static final Target seleccionProducto = Target.the("Seleccion producto")    		
	            .locatedBy(productoSeleccionado);
	    
	    //public static final Target ProductoBoton = Target.the("Entrar al producto")
	           // .locatedBy(botonProductoSeleccioado);
		
		public static final Target seleccionTalla = Target.the("Seleccion talla")    		
	            .locatedBy(seleccionarTalla);
		
		public static final Target seleccionCantidad = Target.the("Seleccion cantidad")    		
	            .locatedBy(seleccionarCantidad);
		
		
		
	}

