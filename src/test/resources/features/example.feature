#Create for Edison Vasquez
#Date: 03/03/2021

Feature: Validar carrito de compras
  Como un nuevo usuario
  Quiero agregar items al carro de compras
  Para realizar la compra de artículos

  @ScenarioExample1 @smoke
  Scenario: Validar items en carro de compras
    Given que el usuario Edison accede hasta la página principal
    When el agrega item playstation 5 disco al carrito
    Then el puede realizar la compra de los artículos por un valor de $ 4.688.497

  @ScenarioExample2 @smoke
  Scenario Outline: Validar items en carro de compras
    Given que el usuario <nombre> accede hasta la página principal
    When el agrega item al carrito con los datos
      | <articulo> | <valor> | <descripción> |
    Then el puede realizar la compra de los artículos

    Examples:
      | nombre | articulo                          | valor       | descripción    |
      | Edison | Freidora de aire oster bioceramic | $ 269.900   | Freidora oster |
      | Edison | playstation 5 disco               | $ 4.688.496 | Consola PS5    |

  @ScenarioExample3 @smoke @Stable
  Scenario Outline: Validar items en carro de compras
    Given que el usuario <nombre> accede hasta la página principal
    When el agrega el item <articulo> al carrito
    Then el puede realizar la compra de los artículos

    Examples:
      | nombre | articulo |
      | Edison | 1        |
      | Edison | 2        |
