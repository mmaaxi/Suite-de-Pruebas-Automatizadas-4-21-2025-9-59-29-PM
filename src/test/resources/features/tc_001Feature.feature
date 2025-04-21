Feature: Inicio de sesión

  Scenario: El usuario inicia sesión correctamente
    Given El usuario está en la página de inicio de sesión
    When Ingresa el usuario "usuario_prueba" y contraseña "contraseña_segura"
    And Hace clic en el botón de login
    Then El usuario es autenticado correctamente y se muestra el panel de usuario