#Create for Edison Vasquez
#Date: 03/03/2021

Feature: Validar carrito de compras
  Como un nuevo usuario
  Quiero agregar items al carro de compras
  Para realizar la compra de artículos

  Background: Acceso hasta la aplicación Web
    Given que el usuario Edison accede hasta la página principal


  @ScenarioExample1 @Rregresion
  Scenario: Validar items en carro de compras sencillo
    When el agrega item playstation 5 disco al carrito
    Then el puede realizar la compra de los artículos por un valor de $ 4.688.497

  @ScenarioExample2 @smoke
  Scenario Outline: Validar items en carro de compras desde tabla
    When el agrega item al carrito con los datos
      | <articulo> | <valor> | <descripción> |
    Then el puede realizar la compra de los artículos

    Examples:
      | articulo                          | valor       | descripción    |
      | Freidora de aire oster bioceramic | $ 269.900   | Freidora oster |
      | playstation 5 disco               | $ 4.688.496 | Consola PS5    |

  @ScenarioExample3 @smoke
  Scenario Outline: Validar items en carro de compras desde JSON
    When el agrega el item <articulo> al carrito
    Then el puede realizar la compra de los artículos

    Examples:
      | articulo |
      | 1        |
      | 2        |

  @ScenarioExample4 @smoke @this
  Scenario Outline: Nueva estructura de json
    When el agrega un item electrónico con código <articulo> al carrito
    Then el puede realizar la compra de los artículos

    Examples:
      | articulo |
      | 1        |
      | 2        |
