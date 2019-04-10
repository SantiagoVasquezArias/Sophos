

Feature: Vans

  @SmokeTest
  Scenario Outline: Buscar un producto en la pagina vans 
    Given El usuario esta en la paginas Vans
    When El usuario busca "<oldSkool>"
    Then El usuario verifica "<resultadoesperado>" este en los resultados

    Examples: 
      | Producto  | Resulado |
      | OldSkool |  OldSkool |
        
