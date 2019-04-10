package co.com.google.qa.miprimerproyectoserenity.steps;

import co.com.google.qa.miprimerproyectoserenity.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class EndUserStep {
	
	GoogleHomePage googleHomePage;
	
	
	//Abrir la paginas
    @Step
    public void is_the_home_page() {
    	googleHomePage.open();
    }

    @Step
    public void enters(String keyword) {
    	googleHomePage.enter_keywords(keyword);
    }

    @Step
    public void startsSearch() {
    	googleHomePage.lookup_terms();
    
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    
    }

}
