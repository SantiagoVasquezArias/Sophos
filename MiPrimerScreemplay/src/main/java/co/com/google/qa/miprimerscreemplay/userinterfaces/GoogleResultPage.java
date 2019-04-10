package co.com.google.qa.miprimerscreemplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

	public class GoogleResultPage extends PageObject {
		   public static final Target barraDeBusqueda = Target.the("la barra de busqueda")    		
		            .located(By.name("q"));
		   public static final Target resultadoEsperado = Target.the("lista de resultados")    		
		            .located(By.id("resultStats"));

}
