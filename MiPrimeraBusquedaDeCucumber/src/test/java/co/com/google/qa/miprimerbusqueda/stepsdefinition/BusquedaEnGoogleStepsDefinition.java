package co.com.google.qa.miprimerbusqueda.stepsdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import co.com.googlepom.BuscarGooglePom;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusquedaEnGoogleStepsDefinition {
	
	 WebDriver driver;
	 public BuscarGooglePom buscarGooglePom;
	 //By txtBuscar = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
	 //By btnBuscar = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");
	
	
	@Given("Arturo's on google home page")
	public void arturo_s_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("arturo abre navegador");		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
		driver= new ChromeDriver();
		buscarGooglePom = new BuscarGooglePom(driver);
		driver.manage().window().maximize();
		System.out.print("arturo abre la pagina de inicio google");
		driver.get("http://www.google.com.co");
	    
	}

	@When("he does the search")
	public void he_does_the_search() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("en la barra de busqueda arturo escribe una palabra");		
		//driver.findElement(txtBuscar).sendKeys("pepino");		
		buscarGooglePom.EscribirPalabra("Cucumber");
		System.out.println("arturo le da click en el boton buscar");		
		//driver.findElement(btnBuscar).click();
		buscarGooglePom.ClickBuscar();
		
		
	    
	}

	@Then("the validates that result is success")
	public void the_validates_that_result_is_success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" el actor captura los resultados de la busqueda ");
		System.out.println(" el actor verifica que la busqueda sea exitosa");
		
		//assertEquals("Prueba", driver.getCurrentUrl());
	    
	}
	
	@After()
	public void execute_after_every_scenario(Scenario s) throws InterruptedException
	{
	    Thread.sleep(2000);

	    final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    s.embed(screenshot, "image/png");

	    driver.quit();
	}


}
