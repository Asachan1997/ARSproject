package newauditproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class critical {
	public static ExtentReports extent;
	public static ExtentTest test;
	
		public static WebDriver driver =null;

		@BeforeTest
		
		void Login1() throws InterruptedException, IOException {
			extent=new com.relevantcodes.extentreports.ExtentReports("D:\\Gitdata\\ARSproject-main\\Report\\Auditproduct.html",true);
			test=extent.startTest("login succesfully");
			
			auditmetod.Login();
			test.log(LogStatus.PASS, "Login Successfully");
			extent.endTest(test);
			extent.flush();
			
		}
		@Test(priority=1)
				void Masteruser() throws InterruptedException {
				test=extent.startTest("Master-User created successfully");
				auditmetod.Masteruser(test);
					extent.endTest(test);
					extent.flush();
				}
		@Test(priority=2)
		void unitMaster11() throws InterruptedException
		{
		test=extent.startTest("Master-Unit created successfully");
			auditmetod.unitMaster11(test);
			//test.log(LogStatus.PASS, "Master-Unit created successfully");
			extent.endTest(test);
			extent.flush();
			    
	}
		@Test(priority=3)
		void businessprocess() throws InterruptedException {
			test=extent.startTest("Master-Process created successfully");
			auditmetod.businessprocess(test);
			//test.log(LogStatus.PASS, "Process created Successfully");
			extent.endTest(test);
			extent.flush();
		
		}
		@Test(priority=4) 
		void department11() throws InterruptedException {
		test=extent.startTest("Master-department");
			auditmetod.department11(test);
			//test.log(LogStatus.PASS, "Master-department");
			extent.endTest(test);
			extent.flush();
			}
		 @Test(priority=5)
			void observationrating() throws InterruptedException {
			test=extent.startTest("Master-observation category");
				auditmetod.observationrating(test);
				//test.log(LogStatus.PASS, "Master-observation category");
				extent.endTest(test);
				extent.flush();
			
			}	
		 @Test(priority=6)
			void riskcategory11() throws InterruptedException {
				test=extent.startTest("Master-risk category");
				auditmetod.riskcategory11(test);
					//test.log(LogStatus.PASS, "Master-risk category");
				extent.endTest(test);
				extent.flush();
			
	}
		 @Test(priority=7)
			void verticalmaster11() throws InterruptedException {
				test=extent.startTest("Master-Vertical Master");
				auditmetod.verticalmaster11(test);
				//test.log(LogStatus.PASS, "Master-Vertical Master");
				extent.endTest(test);
				extent.flush();

	}
		 @Test(priority=8)
			void statemaster11() throws InterruptedException {
				test=extent.startTest("Master-State Master");
				auditmetod.statemaster11(test);
				//test.log(LogStatus.PASS, "Master-State Master");
				extent.endTest(test);
				extent.flush();
	}
		 @Test(priority=9)

		    void citymaster11() throws InterruptedException {
			test=extent.startTest("Master-City Master");
			auditmetod.citymaster11(test);
			//test.log(LogStatus.PASS, "Master-City Master");
			extent.endTest(test);
			extent.flush();
		}
}
