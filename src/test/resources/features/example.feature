#Create for Edison Vasquez
#Date: 03/03/2021

Feature: Validar carrito de compras
  Como un nuevo usuario
  Quiero agregar items al carro de compras
  Para realizar la compra de artículos

  @ScenarioExample @smoke
  Scenario: Validar items en carro de compras
    Given que el usuario Edison accede hasta la página principal
    When el agrega item Play Station 5 al carrito
    Then el puede realizar la compra de los artículos