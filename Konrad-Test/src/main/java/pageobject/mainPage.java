package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage extends basePage{

    private By nameInput = By.id("g15-name");
    private By emailInput = By.id("g15-email");
    private By phoneInput = By.id("g15-phone");
    private By dateCalendarSelector = By.id("g15-date");
    private By selectDate = By.xpath("//*[@class=\" ui-datepicker-week-end \"]//a[contains(text(), \"14\")]");
    private By timeDropDown = By.id("g15-time");
    private By selectTime = By.xpath("//*[@id=\"g15-time\"]//*[@value=\"11:30 am\"]");
    private By partySizeDropDown = By.id("g15-partysize");
    private By selectPartySize = By.xpath("//*[@id=\"g15-partysize\"]//*[@value=\"3 people\"]");
    private By specialRequestInput = By.id("contact-form-comment-g15-specialrequests");
    private By submitButton = By.xpath("//*[@class=\"pushbutton-wide\"]");
    private By succesfullMessage = By.id("//*[@id=\"contact-form-15\"]");

    public mainPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    public WebElement setSuccesfullMessage(){

        return driver.findElement(this.succesfullMessage);
    }

    public WebElement setNameInput(){

        return driver.findElement(this.nameInput);
    }

    public WebElement setEmailInput(){

        return driver.findElement(this.emailInput);
    }

    public WebElement setPhoneInput(){

        return driver.findElement(this.phoneInput);
    }

    public WebElement setDateCalendarSelector(){

        return driver.findElement(this.dateCalendarSelector);
    }

    public WebElement setSelectDate(){

        return driver.findElement(this.selectDate);
    }

    public WebElement setTimeDropDown(){

        return driver.findElement(this.timeDropDown);
    }

    public WebElement setSelectTime(){

        return driver.findElement(this.selectTime);
    }

    public WebElement setPartySizeDropdown(){

        return driver.findElement(this.partySizeDropDown);
    }

    public WebElement setSelectPartySize(){

        return driver.findElement(this.selectPartySize);
    }

    public WebElement setSpecialRequestInput(){

        return driver.findElement(this.specialRequestInput);
    }

    public WebElement setSubmitButton(){

        return driver.findElement(this.submitButton);
    }

    public void insertName(String name){

        setNameInput().sendKeys(name);
    }

    public void insertEmail(String email){

        setEmailInput().sendKeys(email);
    }

    public void insertPhone(String phone){

        setPhoneInput().sendKeys(phone);
    }

    public void clickOnDateCalendar(){

        driver.findElement(this.dateCalendarSelector).click();
    }

    public void clickOnSelectedDate(){

        driver.findElement(this.selectDate).click();
    }

    public void clickOnTimeDropDown(){

        driver.findElement(this.timeDropDown).click();
    }

    public void clickOnSelectedTime(){

        driver.findElement(this.selectTime).click();
    }

    public void clickOnPartySizeDropdown(){

        driver.findElement(this.partySizeDropDown).click();
    }

    public void clickOnSelectedPartySize(){

        driver.findElement(this.selectPartySize).click();
    }

    public void insertSpecialRequest(String request){

        setSpecialRequestInput().sendKeys(request);
    }

    public void clickOnSubmitButton(){

        driver.findElement(this.submitButton).click();
    }

    public void makeReservation(String name, String email, String phone, String request) throws InterruptedException {

        insertName(name);
        insertEmail(email);
        insertPhone(phone);
        driver.manage().timeouts().wait(10);
        clickOnDateCalendar();
        clickOnSelectedDate();
        clickOnTimeDropDown();
        driver.manage().timeouts().wait(3);
        clickOnSelectedTime();
        clickOnPartySizeDropdown();
        driver.manage().timeouts().wait(3);
        clickOnSelectedPartySize();
        insertSpecialRequest(request);
        clickOnSubmitButton();
    }

}
