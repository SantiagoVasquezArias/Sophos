package com.linio.src;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscarProducto {
	
	public WebDriver driver;
	private By buscarProducto = By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//input[@placeholder='Busca productos']");
	
	
public BuscarProducto(WebDriver driver) {
		
		this.driver = driver;
				
	}

public void buscarProducto() {
	
	try {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(buscarProducto));  	
	  	driver.findElement(buscarProducto).sendKeys("Televisor");
	  	WebElement textbox = driver.findElement(buscarProducto);
	  	textbox.sendKeys(Keys.ENTER);
		
	} catch (Exception e) {
		
		System.out.println("Error al buscar el Producto");
		
	}
	
	
  	  	
  }

}
