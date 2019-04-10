package com.vans.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = {"com.vans.qa.stepsdefinitions"},
        snippets =  SnippetType.CAMELCASE
        ) 
public class VansRunner {

}
