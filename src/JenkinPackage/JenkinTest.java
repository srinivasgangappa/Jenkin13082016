package JenkinPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JenkinTest 
{
	ExtentReports e = new ExtentReports("./ExtentReport/extentreport.html");
	
	@Test
	public void testA() throws MalformedURLException
	{
	ExtentTest et = e.startTest("hello");
	et.log(LogStatus.PASS, "pass");
	e.endTest(et);
	}
	
	@Test
	public void testB()
	{
		
		 ExtentTest et=e.startTest("testB()");
		
		
		  et.log(LogStatus.PASS, "pass");
		  et.log(LogStatus.FAIL, "fail");
		e.endTest(et);
		
		e.flush();
	}
}
