package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage extends BaseClass {


    JavascriptExecutor js;
    By headHome = By.xpath("//h1[@class = 'uagb-ifb-title']");
    By actHead = By.xpath("(//h3[contains(@class,'uagb-ifb-title')])[1]");
    By headEmailMkt = By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 '][2]//h3");
    By txtDisplayName = By.xpath("//a[@aria-haspopup='true']//span[@class='display-name']");
    By tagCourses = By.xpath("//div[contains(@class,'ld_course_grid col-sm-8 col-md-4')]");
    By lnkCourse1 = By.xpath("(//div[contains(@class,'ld_course_grid col-sm-8 col-md-4')])[1]");
    By lnkAllCourses = By.linkText("All Courses");
    By lnkContact = By.linkText("Contact");
    By txtConfirmationMsg = By.xpath("//div[contains(@class,'wpforms-confirmation-container wpforms-confirmation-scroll')]");
    By inputFullName = By.xpath("//label[contains(text(),'Full Name ')]/..//input");
    By inputEmail = By.xpath("//label[contains(text(),'Email ')]/..//input");
    By inputSubject = By.xpath("//label[contains(text(),'Subject')]/..//input");
    By inputComment = By.xpath("//label[contains(text(),'Comment or Message ')]/../textarea");
    By btnSubmit = By.xpath("//button[@type='submit']");
    By lnkNestedCourse1 = By.xpath("(//div[contains(@class,'ld-item-title')])[1]");
    By lnkSubCourse1 = By.xpath("(//div[contains(@class,'ld-topic-title')])[1]");


    //BaseClass bc = new BaseClass();
    public HomePage() {
        super();
    }

    public String getPageTitle() throws InterruptedException {
        Thread.sleep(6000);
        return driver.getTitle();
    }

    protected String getHomeHeading() {
        return driver.findElement(headHome).getText();
    }

    protected String getActHeading() throws InterruptedException {
        System.out.println("in test3");
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(4000);
        WebElement Element = driver.findElement(actHead);

        //
        Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(4000);
        System.out.println("after scroll");
        return Element.getText();
    }

    protected String getEmailMktHeading() throws InterruptedException {
        System.out.println("in test3");
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(4000);
        WebElement Element = driver.findElement(headEmailMkt);
        System.out.println("after scroll");
        return Element.getText();
    }

    protected String getDisplayName() {
        return getElementText(txtDisplayName);
    }

    protected void clickAllCourses() {
        driver.findElement(lnkAllCourses).click();
    }

    protected int countCourses() {
        List<WebElement> courses = driver.findElements(tagCourses);
        return courses.size();
    }

    protected void clickContact() {
        driver.findElement(lnkContact).click();
    }

    protected String getConfirmationMSg() {
        return driver.findElement(txtConfirmationMsg).getText();
    }

    protected void clickSubmit() {
        driver.findElement(btnSubmit).click();
    }

    protected void enterFormDetails() throws InterruptedException {
        sendText(inputFullName, "Riya Sen");
        sendText(inputEmail, "riya@hmail.com");
        sendText(inputSubject, "selenium test");
        Thread.sleep(6000);
        sendText(inputComment, "input automated comment");
        Thread.sleep(6000);
    }

    protected void clickCourse(By course) {
        driver.findElement(course).click();
    }

}
