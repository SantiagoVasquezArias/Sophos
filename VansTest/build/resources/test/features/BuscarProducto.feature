Feature: Buscar Producto

  @BuscarProducto
  Scenario Outline: el usuario busca producto
    Given el usuario esta en la pagina de vans
    When el usuario busca un producto "<producto>"
    Then el usuario verifica que el podructo "<resultadoEsperado>" este en los resultados

    Examples: 
      | producto | resultadoEsperado |
      | OldSkool | OldSkool          |
