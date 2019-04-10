package MiPrimerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;
import java.io.IOException;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;



public class HolaMundo {
	
	public static void main(String[] args) {
		//conjunto de propiedades 
		System.setProperty("webdriver.ie.driver", "C:\\SELENIUM\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http:\\www.microsoft.com");
		//driver.findElement(By.name("q")).sendKeys("Selenium get screenshot java");;
		//driver.findElement(By.name("btnK")).submit();
		
		TakesScreenshot ts = (TakesScreenshot)driver;	
		 
	    try {
	    //manejador de archivos 
	    FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\SELENIUM\\Screenshot.png"));
	    } catch (WebDriverException e) {
	 
	    } catch (IOException e) {
	 
	    }
	    
	    //driver.quit();
	}

}
