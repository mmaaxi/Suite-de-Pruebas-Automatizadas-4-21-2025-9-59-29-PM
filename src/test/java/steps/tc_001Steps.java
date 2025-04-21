package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    private WebDriver driver;
    private tc_001Page loginPage;

    public tc_001Steps() {
        this.driver = Hooks.getDriver();
        loginPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("El usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_página_de_inicio_de_sesión() {
        driver.get("http://ejemplo.com/login");
    }

    @When("Ingresa el usuario {string} y contraseña {string}")
    public void ingresa_el_usuario_y_contraseña(String usuario, String contraseña) {
        loginPage.ingresarUsuario(usuario);
        loginPage.ingresarContraseña(contraseña);
    }

    @When("Hace clic en el botón de login")
    public void hace_clic_en_el_botón_de_login() {
        loginPage.clickBotonLogin();
    }

    @Then("El usuario es autenticado correctamente y se muestra el panel de usuario")
    public void el_usuario_es_autenticado_correctamente_y_se_muestra_el_panel_de_usuario() {
        Assert.assertTrue(loginPage.isUsuarioAutenticado());
    }
}