package co.com.googlepom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class BuscarGooglePom {
	
	private WebDriver driver;
	private By txtBuscar = By.xpath("//input[@title='Buscar']");
	private By btnBuscar = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");
	


	//Costructor
	public BuscarGooglePom(WebDriver driver)
	{this.driver = driver;}
	
	public void EscribirPalabra(String escribrirPalabra) {
		
		driver.findElement(txtBuscar).sendKeys(escribrirPalabra);
						
	}
	
	public void ClickBuscar() {
		
		driver.findElement(btnBuscar).submit();
	
		
	}
	
	

}
