package com.vans.qa.stepsdefinitions;



import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vans.qa.exceptions.ExcepcionDeBusqueda;
import com.vans.qa.questions.ResultadoBusqueda;
import com.vans.qa.tasks.BuscarProducto;
import com.vans.qa.userinterfaces.VansHomePageBusqueda;
import com.vans.qa.utils.ConexionRed;
import com.vans.qa.utils.Highlight;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class BuscarProductoSetepsDefinition {
	
	public  static final int posicionDeLista = 0;
	VansHomePageBusqueda Vans;
	Highlight hl ;
	
	
	@Managed(driver = "chrome", uniqueSession = true)
    private WebDriver suNavegador;	 
    private Actor batman = Actor.named("Batman");
    
	
    @Before
	 public void actorCanBrowseTheWeb() {
    	batman.can(BrowseTheWeb.with(suNavegador));
    	 hl = new Highlight(suNavegador);

    	
	   }
	
	@Given("^el usuario esta en la pagina de vans$")
	public void el_usuario_esta_en_la_pagina_de_vans() throws Exception {
			
		batman.wasAbleTo(Open.browserOn().the(Vans));
		
		
	}

	@When("^el usuario busca un producto \"([^\"]*)\"$")
	public void elUsuarioBuscaUnProducto(String producto) throws Exception {
		
		hl.highlightElement(suNavegador.findElement(By.xpath("//div[@class='search-input-container']")));		
		batman.attemptsTo(BuscarProducto.conElNombre(producto));
		   
	  
	}

	@Then("^el usuario verifica que el podructo \"([^\"]*)\" este en los resultados$")
	public void el_usuario_verifica_que_el_podructo_este_en_los_resultados(String resultadoEsperado) throws Exception {
		batman.should(seeThat(ResultadoBusqueda.resultadoBusqueda(), is(resultadoEsperado.toUpperCase())).orComplainWith(ExcepcionDeBusqueda.class, ExcepcionDeBusqueda.fraseNoFunciona));
	  
	}

}
