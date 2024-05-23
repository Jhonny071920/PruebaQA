#Author: Jonnathan Agudelo
#Date: 22/05/2024
#Lag: ESP

Feature: Validación de agregar una nueva cuenta en demoblaze

    Scenario: Crear cuenta exitosamente
    Given "Jonnathan" como usuario quiere ingresar a la plataforma "https://www.demoblaze.com/index.html"
    When Se registra con las credenciales
      | prueba_104| admin123* |