package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By logoutButton = By.id("logoutButton");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLogoutButton() {
        driver.findElement(logoutButton).click();
    }
}