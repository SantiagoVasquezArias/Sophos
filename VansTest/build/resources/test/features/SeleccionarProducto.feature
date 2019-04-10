Feature: seleccion del producto

  @SeleccionarProducto
  Scenario Outline: Seleccionar producto
    Given el usuario realizo la busqueda del producto
    When el usuario seleciona el producto 
    And complenta los detalles del producto
      | talla  | cantidad   |
      | <size> | <quantity> |
    Then el usuario verifica que el podructo "<resultadoEsperado>" este en los resultados

    Examples: 
      | size | quantity | resultadoEsperado |
      | 10.0 |        2 |            120.00 |
