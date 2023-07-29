package test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FlyDriveTest extends BaseTest{
	
@Test(priority=3)
public void verifyFlyDriveTitle() {
	fd.clickFlyDrive();
	String verifyTitle = fd.getFlyDrivePageTitle();
	System.out.println(verifyTitle);
	Assert.assertEquals(verifyTitle,"Flydrive");
	
	
	
	
}
@Test(priority=4)
public void verifyDestinationClick() {
	fd.destinationDropDown();
	
	
	
}
@Test(priority=5)
public void verifySource() {
	fd.selectSource();
}

@Test(priority=6)
public void verifyDoneOperation() {
	fd.clickDone();
}

@Test(priority=7)
public void verifyDateClick() {
	fd.dateClick();
}


@Test(priority=1)
public void verifyUrl() {
	String url=fd.verifyCurrentUrlOfFlyDrivePage();
	System.out.println(url);
	Assert.assertEquals(url,"https://www.virginholidays.co.uk/");
	
}
}
