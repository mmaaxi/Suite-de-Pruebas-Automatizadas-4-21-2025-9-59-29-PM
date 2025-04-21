package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page logoutPage;

    @Given("El usuario está en la aplicación autenticado")
    public void el_usuario_esta_en_la_aplicacion_autenticado() {
        // Código para iniciar sesión y asegurarse de que el usuario esté autenticado
    }

    @When("El usuario hace clic en el botón de cerrar sesión")
    public void el_usuario_hace_clic_en_el_boton_de_cerrar_sesion() {
        logoutPage = new tc_002Page(driver);
        logoutPage.clickOnLogoutButton();
    }

    @Then("El usuario es redirigido a la página de inicio")
    public void el_usuario_es_redirigido_a_la_pagina_de_inicio() {
        String expectedUrl = "https://www.ejemplo.com/inicio";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }
}