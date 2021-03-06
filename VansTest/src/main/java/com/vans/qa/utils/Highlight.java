package com.vans.qa.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {
	
	WebDriver driver;
	
	public Highlight(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public void highlightElement( WebElement element) {
		if(driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
		}
	}

	public void transparentHighlight(WebDriver driver, WebElement element) {
		if(driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
		}
	}
	

}
