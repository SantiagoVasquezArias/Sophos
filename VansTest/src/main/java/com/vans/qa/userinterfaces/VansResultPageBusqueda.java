package com.vans.qa.userinterfaces;



import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VansResultPageBusqueda extends PageObject {
	
	private static final String barraBuscar = "//input[@id='search']" ;
	private static final String resultado  = "//h1[@class='search-results-summary-header']";
	
	public static final Target barraDeBusqueda = Target.the("la barra de busqueda")    		
            .locatedBy(barraBuscar);
   public static final Target resultadoDeBusqueda = Target.the("lista de resultados")    		
            .locatedBy(resultado);

}
