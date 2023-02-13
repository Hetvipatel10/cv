package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;



public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
@CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;
    //By jobTitle= By.id("keywords");

    @FindBy(id = "location")
    WebElement location;

    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    public void HomePage(){
    PageFactory.initElements(driver,this);
}
    public void EnterJobTitle(String job) {
        this.sendTextToElement(this.jobTitle, job);
    }

    public void EnterLocation(String location){
       this.sendTextToElement(this.location,location);
    }
    public void selectDistance(String distance){
        sendTextToElement(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void EnterMinSalary(String min){
        sendTextToElement(salaryMin,min);
    }
    public void EnterMaxSalary(String max){
     sendTextToElement(salaryMax,max);
    }
    public void selectSalaryType(String salary){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,salary);
    }
    public void selectJobType(String job){
        selectByVisibleTextFromDropDown(jobTypeDropDown,job);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
    }
  By cookiesButton= By.xpath("//button[@id='save']//span[contains(text(),'Accept All')]");

    public void acceptcookies() {
        //switch to frame
        driver.switchTo().frame("gdpr-consent-notice");
        // find the element inside the frame and send keys
        clickOnElement(cookiesButton);
        // switch back to default content
        driver.switchTo().defaultContent();

    }




}
