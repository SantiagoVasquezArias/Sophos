package co.com.google.qa.buscardatos.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/test/resources/feauteres",
					glue={"co.com.google.qa.buscardatos.stepsdefinitions"},
					snippets = SnippetType.CAMELCASE,
					plugin ={"pretty" , "html:target/cucumber", "json:target/cucumber.json"})

public class BuscarDatosGoogleRunner {

}
