package co.com.google.qa.miprimerscreemplay.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.WebDriver;
import co.com.google.qa.miprimerscreemplay.questions.PalabraEsperada;
import co.com.google.qa.miprimerscreemplay.tasks.BuscarPalabra;
import co.com.google.qa.miprimerscreemplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class BusquedaEnGoogoleStepDefinition {
	
	GoogleHomePage googleHomePage;
	
	//llamamos el navegador y creamos un nombre de actor 
	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor batman = Actor.named("Batman");
    
    @Before
	 public void actorCanBrowseTheWeb() {
    	batman.can(BrowseTheWeb.with(hisBrowser));
	   }
	
	@Given("^el usurio esta en el sitio de google$")
	public void el_usurio_esta_en_el_sitio_de_google() throws Exception {
		
		batman.wasAbleTo(Open.browserOn().the(googleHomePage));
	    
	    
	}

	@When("^el usuario busca la frase \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void el_usuario_busca_la_frase_compuesta(String palabraUno, String palabraDos) throws Exception {
		
		batman.attemptsTo(BuscarPalabra.composedOfTheWords(palabraUno, palabraDos));
	  
	    
	}

	@Then("^el usuario verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void el_usuario_verifica_que_la_palabra_este_en_los_resultados(String resultadoEsperado) throws Exception {
		
		batman.should(seeThat(PalabraEsperada.searched(), is(resultadoEsperado)));
	    
	}

}
