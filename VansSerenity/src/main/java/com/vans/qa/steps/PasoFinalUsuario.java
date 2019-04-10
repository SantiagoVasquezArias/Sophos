package com.vans.qa.steps;

import com.vans.qa.pages.SeleccionarProducto;
import com.vans.qa.pages.VansHomePage;

import net.thucydides.core.annotations.Step;

public class PasoFinalUsuario {
	
	VansHomePage vansHomePage;
	SeleccionarProducto producto;
	
    @Step ("Pagina Principal")
    public void homePage() {
    	vansHomePage.open();
    }

    @Step
    public void enters(String keyword) {
    	vansHomePage.enterKeywords(keyword);
    }

    @Step
    public void startsSearch() {
    	vansHomePage.lookup_terms();
    	producto.lookup_terms();
    
    }

    @Step
    public void looksFor(String term) {
        enters(term);
        startsSearch();
    
    }

}
