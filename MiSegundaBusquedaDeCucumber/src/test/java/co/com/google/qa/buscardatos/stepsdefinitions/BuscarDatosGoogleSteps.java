package co.com.google.qa.buscardatos.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.googlepom.BuscarGooglePom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarDatosGoogleSteps {
	
	WebDriver driver;
	 public BuscarGooglePom buscarGooglePom;
	
	@Given("arthur esta en el sitio google")
	public void arthur_esta_en_el_sitio_google() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
		driver= new ChromeDriver();
		buscarGooglePom = new BuscarGooglePom(driver);
		driver.manage().window().maximize();
		driver.get("http://www.google.com.co");
		
	  
	}

	@When("el busca la palabra {string}")
	public void el_busca_la_palabra(String palabra) {
	    // Write code here that turns the phrase above into concrete actions
		buscarGooglePom.EscribirPalabra(palabra);
		buscarGooglePom.ClickBuscar();
		
	  
	}

	@Then("el verifica que la {string} este en los resultados")
	public void el_verifica_que_la_este_en_los_resultados(String palabra) {
	    // Write code here that turns the phrase above into concrete actions
	  	
		
		driver.close();
		
		
	}
	
	
	
	

}
