package com.sophos.test;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sophos.test.Rutas;




public class ExcelJunitTest {

	
	Rutas rutas;
	public boolean inicio;
	@Before
	public void setUp() throws Exception {
		rutas = new Rutas();
		inicio = rutas.inicializarDriver();
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test
	public void testInicio( ) {
		assertTrue("DRIVER",inicio);
		String excel = rutas.abrirExcel();
		assertEquals("Error", excel, "Archivo encontrado");
		
		rutas.busqueda();
		
	}


}
