package co.com.google.qa.miprimerproyectoserenity.stepsdefinitions;

import co.com.google.qa.miprimerproyectoserenity.steps.EndUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaGoogleStepDefinition {
	
	@Steps
	 EndUserStep diana;

	
	
	@Given("^arthur esta en el sitio google$")
	public void arthur_esta_en_el_sitio_google() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		diana.is_the_home_page();
	   
	}


	@When("^el busca la palabra \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void el_busca_la_palabra_compuesta(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		diana.looks_for(arg1+ " " + arg2);
	   
	}

	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void el_verifica_que_la_palabra_este_en_los_resultados(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
