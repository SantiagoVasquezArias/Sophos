package com.linio.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.linio.src.AbrirApp;
import com.linio.src.BuscarProducto;
import com.linio.src.SeleccionarProducto;


public class Tests {
	public WebDriver driver;
	public AbrirApp abrirApp;
	public BuscarProducto buscarProducto;
	public SeleccionarProducto seleccionarProducto;

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
		
		buscarProducto = new BuscarProducto(driver);
		buscarProducto.buscarProducto();
		
		seleccionarProducto = new SeleccionarProducto(driver);
		seleccionarProducto.seleccionarProducto();
						
	}
	
}
