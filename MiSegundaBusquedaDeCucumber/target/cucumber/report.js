$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feauteres/BuscarGoogle2.feature");
formatter.feature({
  "name": "Buscar en google con datos desde el feature",
  "description": "  Arthur quiere hacer una busqueda en google con datos",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio google",
  "keyword": "Given "
});
formatter.step({
  "name": "el busca la palabra \"\u003cpalabra\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "el verifica que la \"\u003cpalabra\u003e\" este en los resultados",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra"
      ]
    },
    {
      "cells": [
        "switch"
      ]
    },
    {
      "cells": [
        "shopos"
      ]
    },
    {
      "cells": [
        "liungjknsihfwe"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.arthur_esta_en_el_sitio_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"switch\"",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.el_busca_la_palabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la \"switch\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.el_verifica_que_la_este_en_los_resultados(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.arthur_esta_en_el_sitio_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"shopos\"",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.el_busca_la_palabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la \"shopos\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.el_verifica_que_la_este_en_los_resultados(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.arthur_esta_en_el_sitio_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"liungjknsihfwe\"",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.el_busca_la_palabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la \"liungjknsihfwe\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarDatosGoogleSteps.el_verifica_que_la_este_en_los_resultados(String)"
});
formatter.result({
  "status": "passed"
});
});