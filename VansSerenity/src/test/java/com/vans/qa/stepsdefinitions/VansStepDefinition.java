package com.vans.qa.stepsdefinitions;

import com.vans.qa.steps.PasoFinalUsuario;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class VansStepDefinition {
	
	@Steps
	 PasoFinalUsuario usuario;
	
	@Given("^El usuario esta en la paginas Vans$")
	public void el_usuario_esta_en_la_paginas_Vans() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		usuario.homePage();
	    
	}


	@When("^El usuario busca \"([^\"]*)\"$")
	public void el_usuario_busca(String producto) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		usuario.looksFor(producto);
	    
	}

	@Then("^El usuario verifica \"([^\"]*)\" este en los resultados$")
	public void el_usuario_verifica_este_en_los_resultados(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
