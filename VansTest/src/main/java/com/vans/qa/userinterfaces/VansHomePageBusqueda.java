package com.vans.qa.userinterfaces;



import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.vans.com")
public class VansHomePageBusqueda extends PageObject {
	
	private static final String barraBuscar = "//input[@id='search']" ;
	private static final String botonDeBusqueda ="//span[@class='icon-search']" ;
	
	public static final Target barraDeBusqueda = Target.the("la barra de busqueda")    		
            .locatedBy(barraBuscar);
    
    public static final Target botonBusqueda = Target.the("boton busqueda")
            .locatedBy(botonDeBusqueda);
}
	
	
