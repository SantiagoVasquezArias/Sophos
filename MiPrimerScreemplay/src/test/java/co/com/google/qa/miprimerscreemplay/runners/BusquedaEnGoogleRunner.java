package co.com.google.qa.miprimerscreemplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "co.com.google.qa.miprimerscreemplay.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class BusquedaEnGoogleRunner {

}
