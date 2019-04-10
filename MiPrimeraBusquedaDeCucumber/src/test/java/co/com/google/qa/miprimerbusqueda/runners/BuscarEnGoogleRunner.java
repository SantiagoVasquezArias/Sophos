package co.com.google.qa.miprimerbusqueda.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/test/resources/features",
					glue={"co.com.google.qa.miprimerbusqueda.stepsdefinition"},
					snippets = SnippetType.CAMELCASE,
					plugin ={"pretty" , "html:target/cucumber", "json:target/cucumber.json"})

public class BuscarEnGoogleRunner {
	
	


}
