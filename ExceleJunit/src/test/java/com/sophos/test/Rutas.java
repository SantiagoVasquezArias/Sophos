package com.sophos.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rutas {
	
	private static Workbook myWorkbook;
	private static FileInputStream inputStream;
	private static FileOutputStream outputStream;
	public File file;
	WebDriver driver;
	
	public void busqueda() {
		
	    
	    try {
			inputStream.close();
			Sheet mySheet = myWorkbook.getSheet("Hoja1");
			String xpath = "//div[@id='topstuff']//*";
			
			int rowCount = mySheet.getLastRowNum()-mySheet.getFirstRowNum();
		    System.out.print(rowCount);
		    WebDriverWait wait = new WebDriverWait(driver, 20);
		    for (int i = 1; i < rowCount+1; i++) {
		    	Row row = mySheet.getRow(i);
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		    	driver.findElement(By.name("q")).clear();
		    	driver.findElement(By.name("q")).sendKeys(row.getCell(0).getStringCellValue());
		    	driver.findElement(By.name("q")).submit();
		    	waitForLoad(driver);
		    	List <WebElement> childs = driver.findElements(By.xpath(xpath));
		    	int numofChildren = childs.size();
		    	Boolean isPresent = numofChildren==0;
		    	System.out.println(numofChildren);
		    	row.createCell(1).setCellValue(isPresent);
		    	
		   }
		    outputStream = new FileOutputStream(file);
	    	myWorkbook.write(outputStream);
	    	outputStream.close();
		    driver.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	private static void  waitForLoad(WebDriver driver) {
	    new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
	    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
		
	}
	
	public boolean inicializarDriver() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://www.google.com.co");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
		
		
	}
	
	public String abrirExcel() {
		try {
			
			file = new File("C:\\SELENIUM\\libro1.xlsx");
			inputStream = new FileInputStream(file);
			myWorkbook = new XSSFWorkbook(inputStream);
			
			return "Archivo encontrado";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Archivo no encontrado";
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
	
		
		
		
	}
	
	
	

}
