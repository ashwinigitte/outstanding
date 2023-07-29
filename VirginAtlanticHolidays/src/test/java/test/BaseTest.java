package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import package1.BaseClass;
import package1.FlyDrivePage;

public class BaseTest extends BaseClass{
	
	@BeforeClass
		public static void initBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("https://www.virginholidays.co.uk/");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);	
		//	driver.findElement(By.xpath("//*[@aria-label='Click here to view the FlyDrive search panel']")).click();
			
		}
		
		@BeforeClass
		
		public void pageObjects() {
			 fd = new FlyDrivePage(driver);
		}
		
		
//		public void tearDownEnvironment() {
//			driver.quit();
//		}
	

}
