Feature: seleccion del producto

  @SeleccionarProducto
  Scenario Outline: Seleccionar producto
    Given el usuario realizo la busqueda del producto
    When el usuario seleciona el producto
    When el usuario complenta los detalles del producto
      | size   | quantity   |
      | <size> | <quantity> |
    When el usuario agrega producto al carrito de compras
    Then el usuario verifica que el podructo seleccionado "<resultadoEsperado>" este en los resultados

    Examples: 
      | size                 | quantity | resultadoEsperado |
      | 5.0 Boys = 6.5 Women |        2 | $120.00           |
