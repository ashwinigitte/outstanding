package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class FlyDrivePage extends BaseClass {

	@FindBy(xpath="//*[@aria-label='Click here to view the FlyDrive search panel']")
	WebElement titleFlyDrive;
	
	@FindBy(xpath="(//select[@name='location'])[2]")
	WebElement destination;
	
	@FindBy(xpath="//*[@value='barbados']")                                             //needs to modify for every city
	WebElement destinationn;
	
	@FindBy(xpath="(//*[@type='button'and@class='flyout-action'and contains(text(),'London Heathrow')])[2]")
	WebElement source;
	
	@FindBy(xpath="//*[@for='flydrive-gateways-radio-4']")
    WebElement sourceRadio;
	
	@FindBy(xpath="//*[@for='sp-FLYDRIVE-booking-direct-flight']")
	WebElement directflightsChkBox;
	
	@FindBy(xpath="(//*[@type='button' and @class='flyout-button'])[6]")
	WebElement done;
	
	@FindBy(xpath="//button[(text()='Sun 14 Jan - Sun 21 Jan')]")
	WebElement date;
	
	@FindBy(css=".flatpickr-current-month")
	WebElement augustMonth;
	
	@FindBy(xpath=("(//*[@viewBox='0 0 17 17'])[5]"))
	WebElement prevButton;
	
	
public FlyDrivePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void clickFlyDrive() {
	titleFlyDrive.click();
	
}
public String getFlyDrivePageTitle() {
	return titleFlyDrive.getText();
}

public String verifyCurrentUrlOfFlyDrivePage() {
	return driver.getCurrentUrl();
}

public void destinationDropDown() {
	destination.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	destinationn.click();
	
}


public void selectSource() {
	source.click();
	sourceRadio.click();


	
}
public void clickDone(){
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	directflightsChkBox.click();
	
	done.click();
}

public void dateClick() {
	date.click();
	String yearValue=augustMonth.getText();
	int i=0;
	while(i==0) {
	if(!(yearValue.equals("November 2023"))){
		prevButton.click();	
	}else {
		break;
	}

	
	
	}}

public void prevButtonClick() {
	
}
}