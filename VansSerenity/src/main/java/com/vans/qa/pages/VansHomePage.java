package com.vans.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.vans.com")
public class VansHomePage extends PageObject  {
	
	@FindBy(xpath="//input[@placeholder='Search Vans']")
    private WebElementFacade searchTerms;

    @FindBy(xpath="//span[@class='icon-search']")
    private WebElementFacade lookupButton;
    
  
    public void enterKeywords(String keyword) {
        searchTerms.typeAndEnter(keyword);
    }

    public void lookup_terms() {
       // lookupButton.waitUntilClickable().click();
    }
	
	

}
