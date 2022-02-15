package org.example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomeTest extends HomePage {

    //HomePage homepage = new HomePage();

    @Test(description = "get webpage title", enabled = false)
    public void Test1() throws InterruptedException {

        String title = getPageTitle();
        System.out.println(title);
        Reporter.log("title of the page is : " + title);
        Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
    }

    @Test(description = "get heading title", enabled = false)
    public void Test2() throws InterruptedException {

        String heading = getHomeHeading();
        System.out.println(heading);
        Reporter.log("heading of the page is : " + heading);
        Assert.assertEquals(heading, "Learn from Industry Experts");

    }

    @Test(description = "get actionable training", enabled = false)
    public void Test3() throws InterruptedException {

        String heading = getActHeading();
        System.out.println(heading);
        Reporter.log("heading of the page is : " + heading);
        Assert.assertEquals(heading, "Actionable Training");

    }

    @Test(description = "get actionable training", enabled = false)
    public void Test4() throws InterruptedException {

        String heading = getEmailMktHeading();
        System.out.println(heading);
        Reporter.log("heading of the page is : " + heading);
        Assert.assertEquals(heading, "Email Marketing Strategies");
    }

    @Test(description = "get actionable training", enabled = false)
    public void Test5() throws InterruptedException {

        clickMyAccount();
        String heading = getPageTitle();
        System.out.println(heading);
        Reporter.log("heading of the page is : " + heading);
        Assert.assertEquals(heading, "My Account – Alchemy LMS");

    }

    @Test(description = "get actionable training", enabled = false)
    public void Test6() throws InterruptedException {

        login();
        String displayName = getDisplayName();
        System.out.println(displayName);
        Reporter.log("Display Name of the page is : " + displayName);
        Assert.assertEquals(displayName, "root");

    }

    @Test(description = "get actionable training", enabled = false)
    public void Test7() {
        clickAllCourses();
        int count = countCourses();
        System.out.println("total available courses are: " + count);

    }

    @Test(description = "get actionable training", enabled = false)
    public void Test8() throws InterruptedException {
        String text = "Thanks for contacting us! We will be in touch with you shortly..";
        clickContact();
        enterFormDetails();
        //Thread.sleep(6000);
        clickSubmit();
        String actualMsg = getConfirmationMSg();
        System.out.println(actualMsg);
        Assert.assertEquals(actualMsg, text);

    }

    @Test(description = "get actionable training", enabled = true)
    public void Test9() throws InterruptedException {
        login();
        clickAllCourses();
        int count = countCourses();
        clickCourse(lnkCourse1);
        Thread.sleep(6000);
        String title = getPageTitle();
        System.out.println(title);
        Reporter.log("title of the page is : " + title);
        Assert.assertEquals(title, "Social Media Marketing – Alchemy LMS");
        Thread.sleep(3000);
        clickCourse(lnkNestedCourse1);
        title = getPageTitle();
        System.out.println(title);
        Reporter.log("title of the page is : " + title);
        Assert.assertEquals(title, "Developing Strategy – Alchemy LMS");
      //  clickCourse(lnkSubCourse1);
        boolean mcAvailability = driver.findElements(btnSubmit).size()!=0;
        if(mcAvailability)
            clickSubmit();
        else
            System.out.println("No 'Mark complete' button available.");
    }

}
