	
Feature: Title of your feature
  I want to use this template for my feature file
  
  @SmokeTest
 Scenario Outline: Buscar en google
    Given arthur esta en el sitio google
    When el busca la palabra "<palabra>" compuesta "<palabrados>"
    Then el verifica que la palabra "<resultadoesperado>" este en los resultados

    Examples: 
      | palabra        | palabrados| resultados |
      | switch         |uno				|switch  |
      | shopos         |dos				|shopos |
      | liungjknsihfwe |tres			|liungjknsihfwe |
