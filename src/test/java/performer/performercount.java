package performer;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import newauditproject.auditmetod;

public class performercount {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver =null;
	@BeforeTest
	
	void Login1() throws InterruptedException, IOException {
		extent=new com.relevantcodes.extentreports.ExtentReports("C://Users//ambuj//eclipse-workspace//Arsproduct//Report//Auditresult.html",true);
		test=extent.startTest("login succesfully");
		
		performermethod.Login();
		test.log(LogStatus.PASS, "Login Successfully");
		extent.endTest(test);
		extent.flush();
		
	}	
	@Test
	void count() throws InterruptedException {
	test=extent.startTest("Count of open audit");
	performermethod.count(test);
		extent.endTest(test);
		extent.flush();
	}

	
	
	}
