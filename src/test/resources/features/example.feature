#Create for Edison Vasquez
#Date: 03/03/2021

Feature: Validar carrito de compras
  Como un nuevo usuario
  Quiero agregar items al carro de compras
  Para realizar la compra de artículos

  @ScenarioExample @smoke
  Scenario: Validar items en carro de compras
    Given que el usuario Edison accede hasta la página principal
    When el agrega item playstation 5 disco al carrito
    Then el puede realizar la compra de los artículos por un valor de $ 4.688.500

  @ScenarioExample @smoke @Stable
  Scenario Outline: Validar items en carro de compras
    Given que el usuario <nombre> accede hasta la página principal
    When el agrega item <articulo> al carrito
    Then el puede realizar la compra de los artículos por un valor de <valor>

    Examples:
      | nombre | articulo                          | valor       |
      | Edison | Freidora de aire oster bioceramic | $ 269.900   |
      | Edison | playstation 5 disco               | $ 4.688.500 |
