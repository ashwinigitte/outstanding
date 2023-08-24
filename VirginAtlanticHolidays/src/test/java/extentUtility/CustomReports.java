package extentUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReports {
	public static ExtentReports extent;
public static ExtentReports extentReporterGenerator() {
	String path = System.getProperty("user.dir")+"\\Reports\\VAHolidaysReport.html";
   ExtentHtmlReporter extentHtmlReporter = new  ExtentHtmlReporter(path);
   extentHtmlReporter.config().setReportName("Regression test report");
   extentHtmlReporter.config().setDocumentTitle("VAHolidays Build Report");
   extentHtmlReporter.config().setTheme(Theme.DARK);
   extentHtmlReporter.config().setTimeStampFormat("yyyy-MM-dd'T'HH:mm:ss");
   
   extent =new ExtentReports();
   extent.setSystemInfo("OS", "Windows");
   extent.setSystemInfo("Browser","Chrome");
   extent.setSystemInfo("organization", "Clarivate");
   extent.attachReporter( extentHtmlReporter);
   
   return extent;
	
}
}
