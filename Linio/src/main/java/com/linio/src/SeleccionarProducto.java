package com.linio.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleccionarProducto {
	
	public WebDriver driver;
	
	private By seleccionarProducto = By.xpath("//img[@src='//i.linio.com/p/e4387dc4e6f3cb9b1031f888a1e79a01-catalog.jpg']");
		
	public  SeleccionarProducto(WebDriver driver) {
			
			this.driver = driver;
					
		}
	
	public void seleccionarProducto() 
	{
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(seleccionarProducto)); 
			WebElement seleccionar = driver.findElement(seleccionarProducto);
			seleccionar.click();
			
		//driver.findElement(seleccionarProducto).click();
			
		} catch (Exception e) {
			
			System.out.println("Error al seleccionar el Producto");
			
		}

		
		
		
	}
	
	

	
	
	
	

}
