package Auditee;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Auditee.Auditeemethod;
import Reviewer.Reviewermethod;

public class Auditeecount {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	@BeforeTest
	void Login1() throws InterruptedException, IOException {
		extent=new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\ambuj\\eclipse-workspace\\AuditProject\\Report\\Auditproduct.html",true);
		test=extent.startTest("Auditee login ");
		
		Auditeemethod.Login();
		test.log(LogStatus.PASS, "Login Successfully");
	     
		extent.endTest(test);
		extent.flush();

}
	
	////////////////IMPLIMENTATION/////////////////////////////////////////////
	
	//@Test(priority=1)

	void impCount() throws InterruptedException
	{
	test = extent.startTest("Count of Open Implementation");

	Auditeemethod.impCount(test);

	extent.endTest(test);
	extent.flush();

	}

	//@Test(priority=2)
	void impMyWorkspace () throws InterruptedException {
		test=extent.startTest("Workspace");
		Auditeemethod.impMyWorkspace(test);
		extent.endTest(test);
		extent.flush();
	}	
	//@Test(priority=3)
	void openupcomingCount () throws InterruptedException {
		test=extent.startTest("Workspace");
		Auditeemethod.openupcomingCount(test);
		extent.endTest(test);
		extent.flush();
	}	

	
////////////////////AUDIT////////////////////////////////////////////////////////
	@Test(priority=1)

	void Count() throws InterruptedException
	{
		test = extent.startTest("Count of Open Audit");
		
		Auditeemethod.Count(test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=2)
	void Workspace () throws InterruptedException {
		test=extent.startTest("Workspace");
		Auditeemethod.MyWorkspace(test);
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=3)
	void Prerequsiteopencount () throws InterruptedException {
		test=extent.startTest("Prerequsite- Open count");
		Auditeemethod.Prerequsite(test);
		extent.endTest(test);
		extent.flush();
}
	//@Test(priority=4)
	void PrerequsiteSubmitted () throws InterruptedException {
		test=extent.startTest("Prerequsite- Submitted count");
		Auditeemethod.PrerequsiteSubmitted(test);
		extent.endTest(test);
		extent.flush();
}
	//@Test(priority=5)
	void PrerequsiteRejected () throws InterruptedException {
		test=extent.startTest("Prerequsite- Rejected count");
		Auditeemethod.PrerequsiteRejected(test);
		extent.endTest(test);
		extent.flush();
}
}