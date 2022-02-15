package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    WebDriver driver;

    By linkMyAcc = By.linkText("My Account");
    By linkLogin = By.xpath("//a[@href='#login']");
    By txtUser = By.cssSelector("input#user_login");
    By txtPass = By.cssSelector("input#user_pass");
    By btnLogIn = By.cssSelector("input#wp-submit");

    @BeforeMethod(alwaysRun = true)
    void openBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        System.out.println("Opening browser");
    }

    void enterCred(String username, String password) {
        driver.findElement(txtUser).sendKeys(username);
        driver.findElement(txtPass).sendKeys(password);
        driver.findElement(btnLogIn).click();
    }

    void clickMyAccount() {
        driver.findElement(linkMyAcc).click();
    }

    void clickLogin() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(linkLogin).click();
    }

    public void login() throws InterruptedException {

        clickMyAccount();
        clickLogin();
        enterCred("root", "pa$$w0rd");
    }

    public String getElementText(By element) {
        return driver.findElement(element).getText();
    }

    public void sendText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }


    @AfterMethod
    void closeBrowser() {
        driver.close();

    }

}
