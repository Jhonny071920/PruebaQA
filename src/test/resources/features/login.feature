#Author: Jonnathan Agudelo
#Date: 22/05/2024
#Lag: ESP

Feature: Login en demoblaze

  Scenario: Validacion de Login exitoso
    Given "Jonnathan" como usuario quiere ingresar a la plataforma "https://www.demoblaze.com/index.html"
    When Se Loguea con las credenciales
      | prueba_104| admin123* |
    Then verifica que el mensaje sea "Welcome prueba_104"