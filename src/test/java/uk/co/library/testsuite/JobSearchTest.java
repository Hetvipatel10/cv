package uk.co.library.testsuite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.tastbase.TestBase;
import uk.co.library.utility.Utility;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt(){
        homePage =new HomePage();
        resultPage =new ResultPage();

    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet(){
        HomePage homePage=new HomePage();
        homePage.acceptcookies();
        homePage.EnterJobTitle("Tester");
        homePage.EnterLocation("Harrow on the Hill, Greater London");
        homePage.selectDistance("up to 7 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.EnterMinSalary("30000");
        homePage.EnterMaxSalary("50000");
        homePage.selectSalaryType("Per annum");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();

    }
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet1(){
        HomePage homePage=new HomePage();
        homePage.acceptcookies();
        homePage.EnterJobTitle("Bank Manager");
        homePage.EnterLocation("West London");
        homePage.selectDistance("up to 7 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.EnterMinSalary("10000");
        homePage.EnterMaxSalary("50000");
        homePage.selectSalaryType("Per week");
        homePage.selectJobType("Contract");
        homePage.clickOnFindJobsButton();

    }
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet2(){
        HomePage homePage=new HomePage();
        homePage.acceptcookies();
        homePage.EnterJobTitle("Bookkeeper");
        homePage.EnterLocation("Hampshire");
        homePage.selectDistance("up to 10 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.EnterMinSalary("20000");
        homePage.EnterMaxSalary("70000");
        homePage.selectSalaryType("Per week");
        homePage.selectJobType("Temporary");
        homePage.clickOnFindJobsButton();
    }






}
