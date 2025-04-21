package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "userPanel")
    private WebElement userPanel;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String usuario) {
        usernameField.sendKeys(usuario);
    }

    public void ingresarContraseña(String contraseña) {
        passwordField.sendKeys(contraseña);
    }

    public void clickBotonLogin() {
        loginButton.click();
    }

    public boolean isUsuarioAutenticado() {
        return userPanel.isDisplayed();
    }
}