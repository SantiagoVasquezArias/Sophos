package com.sophos.test;

import static org.junit.Assert.*;

import org.openqa.selenium.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Conexion {
	
	//conexion base datos
	private Connection connect = null;
	//sentencia que hereda PreparedStatement
    private Statement query = null;   
    //Sentencia sql libreria
    private PreparedStatement preparedStatement = null;
    //Recupera datos get libreria
    private ResultSet resultSet = null;
    private WebDriver driver;



	@Before
	public void setUp() throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
			driver = new ChromeDriver();
			// Esto cargara la base datos
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        // cofiguramos la conexion de la base datos
	        connect = DriverManager
	                .getConnection("jdbc:mysql://localhost/excel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
	                        ,"root", "1234");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
            e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws SQLException{
		//en esta parte falla aun no implementado
		query = connect.createStatement();
        // get
        resultSet = query.executeQuery("select Nombre from excel.Datos");
        while (resultSet.next()) {
        	String textoaBuscar = resultSet.getString("Nombre");
        	System.out.println("Texto:: " + textoaBuscar);
        	driver.get("http:\\www.google.com.uy");
    		driver.findElement(By.name("q")).sendKeys(textoaBuscar);;
    		driver.findElement(By.name("btnK")).submit();
    		
    		WebElement element = (new WebDriverWait(driver, 10))
     				  .until(ExpectedConditions.presenceOfElementLocated((By.id("search"))));
        		 		
			//Tamaño resultados 
			Dimension sizeContenedorResultado =  element.getSize();
			
			//xpath tamaño de nivel 
			Boolean sinResultado = driver.findElements(By.xpath("//p[@aria-level='3']")).size() > 0 ;
			System.out.println(sinResultado && (sizeContenedorResultado.getHeight() == 0));
			
			//Update
			preparedStatement = connect
	                .prepareStatement("update Datos set Estado=? where Nombre LIKE ?;");
	        
	     // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
	        // Parameters start with 1
	        preparedStatement.setBoolean(1, !(sinResultado && (sizeContenedorResultado.getHeight() == 0)));
	        preparedStatement.setString(2, textoaBuscar);
	        preparedStatement.executeUpdate();

        }

        // PreparedStatements can use variables and are more efficient
  
	}

}


