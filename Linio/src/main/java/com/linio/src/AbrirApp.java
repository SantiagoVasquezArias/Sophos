package com.linio.src;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


public class AbrirApp {
	
	public WebDriver driver;
	public Actions actions ;
	
	String url = "https://www.linio.com.co";
	
public AbrirApp(WebDriver driver) {
		
		this.driver = driver;
				
	}

public void AbrirUrl() {
	
	driver.get(url);		
	actions = new Actions(driver);


	}
}
