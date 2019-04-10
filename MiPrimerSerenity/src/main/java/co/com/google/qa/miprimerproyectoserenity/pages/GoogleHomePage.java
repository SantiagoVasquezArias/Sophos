package co.com.google.qa.miprimerproyectoserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject  {
	
	@FindBy(name="q")
    private WebElementFacade searchTerms;

    @FindBy(name="btnk")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        searchTerms.typeAndEnter(keyword);
    }

    public void lookup_terms() {
       // lookupButton.waitUntilClickable().click();
    }


}
