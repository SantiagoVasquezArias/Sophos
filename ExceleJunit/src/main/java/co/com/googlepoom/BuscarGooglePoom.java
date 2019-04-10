package co.com.googlepoom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscarGooglePoom {
	
	private WebDriver driver;
	private By txtBuscar = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
	private By btnBuscar = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");
	

	//Costructor
	public BuscarGooglePoom(WebDriver driver)
	{this.driver = driver;}
	
	public void EscribirPalabra(String escribrirPalabra) {
		
		driver.findElement(txtBuscar).sendKeys(escribrirPalabra);
						
	}
	
	public void ClickBuscar() {
		
		driver.findElement(btnBuscar).click();
	
		
	}
	
	

}
