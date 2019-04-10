package com.sophos.src;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbrirApp {
	
	public WebDriver driver;
	public Actions actions ;
	
	
	public AbrirApp(WebDriver driver) {
		
		this.driver = driver;
				
	}
	
	public void AbrirUrl() {
		
		driver.get("http://www.vans.com.co");		
		actions = new Actions(driver);
		
		//WebElement continuar = driver.findElement(By.xpath("//h3[contains(text(),'Compra tus entradas online')]"));
		//actions.click(continuar).perform();
		
		try {
			
			//PopUP				
			WebElement element = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//a[@title='Close']"))));
			actions.click(element).perform();
						
		} catch (Exception e) {
			System.out.println("No hay publicidad");
		}
				
			evidencia("AbrirApp");
		
		//driver.navigate().refresh()		
	}
	
	public void buscarProducto() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search']//div//input[@type='text']")));
	  	//driver.findElement(By.name("q")).clear();
	  	driver.findElement(By.xpath("//div[@class='search']//div//input[@type='text']")).sendKeys("Old Skool");
	  	WebElement textbox = driver.findElement(By.xpath("//div[@class='search']//div//input[@type='text']"));
	  	textbox.sendKeys(Keys.ENTER);
	  	waitForLoad(driver);
		  	  
	  	evidencia("Buscar");
	  }
	
	  
	  private static void  waitForLoad(WebDriver driver) {
		    new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
		    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
	  }
	
	
	public void seleccionarProducto() 
	{

		driver.findElement(By.xpath("//*[@id=\"product-1248\"]/div[2]/a")).click();
		evidencia("Producto");
		
	}
	
	public void seleccionarColor(){
		
		//Color
		driver.findElement(By.xpath("//a[@title='OLD SKOOL VERY BERRY']")).click();
		evidencia("Color");
		//driver.findElement(By.xpath("//input[@id='94_Talla_4']']")).click();
		
		
	}
	
	public void seleccionarTalla(){
		
		
		//driver.findElement(By.xpath("//input[@id='94_Talla_4']']")).click();
		
		
	}
	
	public void cantidad(){
	
	driver.findElement(By.xpath("//input[@value='1']")).clear();	
	driver.findElement(By.xpath("//input[@value='1']")).sendKeys("2");
	evidencia("Cantidad");
	
		
	}

	
	public void comprar() {
		
		driver.findElement(By.xpath("//a[@class='buy-in-page-button']")).click();
		WebElement finalizar = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//div[@class='fancybox-skin']"))));
		finalizar.click();
		//actions.click(finalizar).perform();
		//driver.findElement(By.linkText("//a[contains(text(),'Finalizar compra')]")).submit();
		evidencia("Comprar");
	}
	
	 public void evidencia(String evidencia) {
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;	
			 
		    try {
		        FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\SELENIUM\\Evidencia\\"+evidencia+".png"));
		    } catch (WebDriverException e) {
		 
		    } catch (IOException e) {
		 
		    }
		  
	  }
	
	
	
	

}
