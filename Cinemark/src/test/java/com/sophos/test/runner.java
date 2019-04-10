package com.sophos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sophos.src.AbrirApp;
import com.sophos.src.Buscar;

public class runner {


	public WebDriver driver;
	public AbrirApp abrirApp;
	public Buscar buscar;
	
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		abrirApp = new AbrirApp(driver);
		abrirApp.AbrirUrl();
		//abrirApp.cerrarCiudad();
		abrirApp.buscarProducto();
		abrirApp.seleccionarProducto();
		abrirApp.seleccionarColor();
		abrirApp.cantidad();
		abrirApp.comprar();
		
		
		
	}

}
