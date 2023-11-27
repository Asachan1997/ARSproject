package Reviewer;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import Reviewer.Reviewermethod;


public class Reviewercount {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	@BeforeTest
	void Login1() throws InterruptedException, IOException {
		extent=new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\ambuj\\eclipse-workspace\\AuditProject\\Report\\Auditproduct.html",true);
		test=extent.startTest("Reviewer login ");
		
		Reviewermethod.Login();
		test.log(LogStatus.PASS, "Reviewer Login Successfully");
	
		extent.endTest(test);
		extent.flush();
	}	
	
////////////////////////IMPLEMENTATION/////////////////////////////////
@Test(priority=1)

void implementationCount() throws InterruptedException
{
test = extent.startTest("Count of Open Implementation");

Reviewermethod.implementationCount(test);

extent.endTest(test);
extent.flush();

}
@Test(priority=2)
void MyImplementationWorkspace() throws InterruptedException {
test=extent.startTest("Workspace");
Reviewermethod.MyImplementationWorkspace(test);
//test.log(LogStatus.PASS, "Workspace");
extent.endTest(test);
extent.flush();

}
	

@Test(priority=1)

void Count() throws InterruptedException
{
	test = extent.startTest("Count of Open Audit");
	
	Reviewermethod.Count(test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=2)
void Prerequsite() throws InterruptedException {
	test=extent.startTest("Prerequsite");
	//Reviewermethod.Prerequsite(test);
	//test.log(LogStatus.PASS, "Workspace");
	extent.endTest(test);
	extent.flush();

}
@Test(priority=3)
void Workspace() throws InterruptedException {
	test=extent.startTest("Workspace");
	Reviewermethod.MyWorkspace(test);
	extent.endTest(test);
	extent.flush();

}
// @Test(priority=4)

void mydocument() throws InterruptedException {
	test=extent.startTest("Document Download");
	Reviewermethod.mydocument(test);
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=5)

void myreport() throws InterruptedException {
test=extent.startTest("Report Download");
Reviewermethod.myreport(test);
extent.endTest(test);
extent.flush();
}
}
