$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BuscarGoogle.feature");
formatter.feature({
  "name": "Google search",
  "description": "  I want to search a word in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "successful search on google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Arturo\u0027s on google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BusquedaEnGoogleStepsDefinition.arturo_s_on_google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BusquedaEnGoogleStepsDefinition.he_does_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the validates that result is success",
  "keyword": "Then "
});
formatter.match({
  "location": "BusquedaEnGoogleStepsDefinition.the_validates_that_result_is_success()"
});
formatter.result({
  "status": "passed"
});
});