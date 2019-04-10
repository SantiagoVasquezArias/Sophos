
Feature: El usuario quiere hacer una busqueda con datos 
en Google



 @SmokeTest
  Scenario Outline: buscar en google
    Given el usurio esta en el sitio de google
    When el usuario busca la frase "<palabra>" compuesta "<palabrados>"
    Then el usuario verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra          | palabrados | resultadoEsperado    |
      | switch           | uno        | switch uno           |
      | sophos				   | dos        | sophos dos           |
      | hola             | tres       | kjadshkjashdkjhaskjd |
