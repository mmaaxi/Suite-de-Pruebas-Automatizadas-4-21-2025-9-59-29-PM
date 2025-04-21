Feature: Cierre de sesión

  Scenario: El usuario cierra sesión exitosamente
    Given El usuario está en la aplicación autenticado
    When El usuario hace clic en el botón de cerrar sesión
    Then El usuario es redirigido a la página de inicio