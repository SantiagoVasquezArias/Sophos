package com.vans.qa.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import com.vans.qa.exceptions.ExceptionDetalleProducto;
import com.vans.qa.models.Producto;
import com.vans.qa.questions.ResultadoDetalleProducto;
import com.vans.qa.tasks.AgregaProducto;
import com.vans.qa.tasks.DetalleProducto;
import com.vans.qa.tasks.SeleccionarProducto;
import com.vans.qa.userinterfaces.VansSeleccionProducto;
import com.vans.qa.utils.Highlight;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class SeleccionarProductoStepsDefinition {
	
	public  static final int posicionDeLista = 0;
	Highlight hl ;
	VansSeleccionProducto Vans;
	
	@Managed(driver = "chrome")
    private WebDriver suNavegador;
    private Actor batman = Actor.named("Batman");
    
    @Before
	 public void actorCanBrowseTheWeb() {
   	batman.can(BrowseTheWeb.with(suNavegador));
    hl = new Highlight(suNavegador);
	   }
	
	@Given("^el usuario realizo la busqueda del producto$")
	public void el_usuario_realizo_la_busqueda_del_producto() throws Exception {
		
		batman.wasAbleTo(Open.browserOn().the(Vans));
		hl.highlightElement(suNavegador.findElement(By.xpath("//body[@id='catalog']/div[@id='master-container']/section[@id='body-container']/article[@class='page-contents']/div[@id='product-list']/section[@id='catalog-container']/div[@id='product-listing']/div[@id='catalog-results']/div[2]")));
	 
	}

	@When("^el usuario seleciona el producto$")
	public void el_usuario_seleciona_el_producto() throws Exception {
				
		batman.attemptsTo(SeleccionarProducto.conElProductoSeleccionado());
		
	}

	@When("^el usuario complenta los detalles del producto$")
	public void el_usuario_complenta_los_detalles_del_producto(List<Producto> producto) throws Exception {
	Thread.sleep(6000);
	batman.attemptsTo(DetalleProducto.conElDetalleSeleccionado(producto.get(posicionDeLista)));
	
	}
	
	@When("^el usuario agrega producto al carrito de compras$")
	public void el_usuario_agrega_producto_al_carrito_de_compras() throws Exception {
	    batman.attemptsTo(AgregaProducto.conElProductoAgregado());
	}
	
	@Then("^el usuario verifica que el podructo seleccionado \"([^\"]*)\" este en los resultados$")
	public void el_usuario_verifica_que_el_podructo_seleccionado_este_en_los_resultados(String resultadoEsperado) throws Exception {
		hl.highlightElement(suNavegador.findElement(By.xpath("//div[@class='item-detail-info item-detail-info-js']")));
		batman.should(seeThat(ResultadoDetalleProducto.resultadoDetalleProducto(), is(resultadoEsperado.toUpperCase())).orComplainWith(ExceptionDetalleProducto.class, ExceptionDetalleProducto.detalleProducto));
	  
	}


}
