package co.com.google.qa.miprimerscreemplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")
public class GoogleHomePage  extends PageObject {
	
	static By barradeBusqueda = By.xpath("//input[@title='Buscar']") ;
	
	public static final Target barraDeBusqueda = Target.the("la barra de busqueda")    		
            .located(barradeBusqueda);
    
    public static final Target botonBusqueda = Target.the("boton busqueda")
            .located(By.name("btnK"));
    
    
			
	
}
