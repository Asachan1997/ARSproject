package newauditproject;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class audittestcount {
	public static ExtentReports extent;
	public static ExtentTest test;
	
		public static WebDriver driver =null;

		@BeforeTest
		
		void Login1() throws InterruptedException, IOException {
			extent=new com.relevantcodes.extentreports.ExtentReports("C://Users//ambuj//eclipse-workspace//Arsproduct//Report//Auditresult.html",true);
			test=extent.startTest("login succesfully");
			
			auditmetod.Login();
			test.log(LogStatus.PASS, "Login Successfully");
			extent.endTest(test);
			extent.flush();
			
		}
		
		
		@Test(priority=1)
		void Master() throws InterruptedException {
		test=extent.startTest("Master-User created successfully");
		auditmetod.Master(test);
			extent.endTest(test);
			extent.flush();
		}
		
		/*@Test(priority=2)
	void unitMaster() throws InterruptedException {
	test=extent.startTest("Master-Unit created successfully");
		auditmetod.unitMaster(test);
		test.log(LogStatus.PASS, "Master-Unit created successfully");
		extent.endTest(test);
		extent.flush();
		}*/


		//@Test(priority=3)
	void business() throws InterruptedException {
		test=extent.startTest("Master-Process created successfully");
		auditmetod.business(test);
		test.log(LogStatus.PASS, "Process created Successfully");
		extent.endTest(test);
		extent.flush();
	
	}
	
		//@Test(priority=4) 
	void department() throws InterruptedException {
	test=extent.startTest("Master-department");
		auditmetod.department(test);
		test.log(LogStatus.PASS, "Master-department");
		extent.endTest(test);
		extent.flush();
		}
	

		//@Test(priority=5)
		void observation() throws InterruptedException {
		test=extent.startTest("Master-observation category");
			auditmetod.observation(test);
			test.log(LogStatus.PASS, "Master-observation category");
			extent.endTest(test);
			extent.flush();
		
		}	
	
		//@Test(priority=6)
		void riskcategory() throws InterruptedException {
			test=extent.startTest("Master-risk category");
			auditmetod.riskcategory(test);
				test.log(LogStatus.PASS, "Master-risk category");
			extent.endTest(test);
			extent.flush();
		}


		@Test(priority=7)
		void auditormaster() throws InterruptedException {
			test=extent.startTest("Master-Auditor Master");
			auditmetod.auditormaster(test);
			test.log(LogStatus.PASS, "Master-Auditor Master");
			extent.endTest(test);
			extent.flush();
		
}
		@Test(priority=8)
		void auditorteammaster() throws InterruptedException {
			test=extent.startTest("Master-Auditor Team Master");
			auditmetod.auditorteammaster(test);
			test.log(LogStatus.PASS, "Master-Auditor Team Master");
			extent.endTest(test); 
			extent.flush();

}
		@Test(priority=9)
		void verticalmaster() throws InterruptedException {
			test=extent.startTest("Master-Vertical Master");
			auditmetod.verticalmaster(test);
			test.log(LogStatus.PASS, "Master-Vertical Master");
			extent.endTest(test);
			extent.flush();

}
		@Test(priority=10)
		void statemaster() throws InterruptedException {
			test=extent.startTest("Master-State Master");
			auditmetod.statemaster(test);
			test.log(LogStatus.PASS, "Master-State Master");
			extent.endTest(test);
			extent.flush();


}

		@Test(priority=11)
void citymaster() throws InterruptedException {
	test=extent.startTest("Master-City Master");
	auditmetod.citymaster(test);
	test.log(LogStatus.PASS, "Master-City Master");
	extent.endTest(test);
	extent.flush();
}
		@Test(priority=12)
void processingratingmaster() throws InterruptedException {
	test=extent.startTest("Master-Process Rating Master");
	auditmetod.procesratingmaster(test);
		test.log(LogStatus.PASS, "Master-Process Rating Master");
	extent.endTest(test);
	extent.flush();
}
		@Test(priority=13)
		void auditassignment() throws InterruptedException {
			test=extent.startTest("Audit Reporting-Audit Assignment");
			auditmetod.Auditassignment(test);
			test.log(LogStatus.PASS, "Audit Reporting-Audit Assignment");
			extent.endTest(test);
			extent.flush();
}
		@Test(priority=14)
		void mydocument() throws InterruptedException {
			test=extent.startTest("MY Document");
			auditmetod.mydocument(test);
			test.log(LogStatus.PASS, "MY Document");
			extent.endTest(test);
			extent.flush();
		}

		@Test(priority=15)
		void myreport() throws InterruptedException {
			test=extent.startTest("MY Report");
			auditmetod.myreport(test);
			test.log(LogStatus.PASS, "MY Report");
			extent.endTest(test);
			extent.flush();
}
		@Test(priority=16)
		void configuration() throws InterruptedException {
			test=extent.startTest("configuration");
			auditmetod.configuration(test);
			extent.endTest(test);
			test.log(LogStatus.PASS, "configuration");
			extent.flush();
}
}

