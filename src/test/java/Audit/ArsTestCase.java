package audit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import arsProduct.ArsMethod;

public class ArsTestCase {
	
	public static WebDriver driver = null;		//WebDriver instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	public static List<WebElement> elementsList1 = null;
	public static List<WebElement> elementsList2 = null;
	public static List<WebElement> elementsList3 = null;
	public static List<WebElement> elementsList4 = null;
	public static List<WebElement> menus = null;
	public int count = 0;
	public int interest = 0;					//Variable created for reading Interest
	public int penalty = 0;						//Variable created for reading Penalty
	
	public static String link = "richa";  
	
	public static XSSFSheet ReadExcel() throws IOException
	{
		//String workingDir = System.getProperty("webdriver.chrome.driver","C:/March2022/PerformerPom/Driver/chromedriver.exe");
		fis = new FileInputStream("D:\\Auditproductnew\\AuditProject\\TestData\\ComplianceSheet.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(20);					//Retrieving third sheet of Workbook
		return sheet;
	}
	
	@BeforeTest
	void setBrowser() throws InterruptedException, IOException
	{
	//	String workingDir = System.getProperty("webdriver.chrome.driver","C:/March2022/PerformerPom/Driver/chromedriver.exe");
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\Auditproductnew\\AuditProject\\Report\\Audit.html",true);
		test = extent.startTest("Verify OpenBrowser");
		test.log(LogStatus.PASS, "Browser test is initiated");
		
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 1)
	void Login() throws InterruptedException, IOException
	{
		test = extent.startTest("Loging In - ARS ");
		test.log(LogStatus.PASS, "Logging into system");
		
		XSSFSheet sheet = ReadExcel();
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c1.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c2 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c2.getStringCellValue();		//Got the URL stored at position 2,1
		
		
		driver = login.Login.UserLogin(uname,password,link);		//Method of Login class to login user.
		
			
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}

	
	public static void progress1(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,(30));
		try
		{
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id='imgcaldate']"))));
		}
		catch(Exception e)
		{
			
		}
	}
	
	/*@Test(priority = 2)
	void AuditHead() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Audit Head -Add New");
		
		ArsMethod.AuditHead(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 3)
	void Management() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Management-Add New");
		
		ArsMethod.Management(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 4)
	void DepartmentHead() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Department Head-Add New");
		
		ArsMethod.DepartmentHead(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 5)
	void AuditHeadEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Edit Unit Assignment-Audit Head");
		
		ArsMethod.AuditHeadEdit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 6)
	void ManagementEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Edit Unit Assignment-Management");
		
		ArsMethod.ManagementEdit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 7)
	void DepartmentHeadEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Edit Unit Assignment-Department Head");
		
		ArsMethod.DepartmentHeadEdit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 8)
	void ReAssign() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Re-Assign");
		
		ArsMethod.ReAssign(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 9)
	void DeleteProcess() throws InterruptedException, IOException
	{
		test = extent.startTest("Masters -Unit Assignment -Delete Process");
		
		ArsMethod.DeleteProcess(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority = 10)
	void RiskControlMatrix() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Risk Control Matrix");
		
		ArsMethod.RiskControlMatrix(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 11)
	void SubProcess() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Sub Process");
		
		ArsMethod.SubProcess(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 12)
	void UpdateRiskControlMatrix() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Update Risk Control Matrix");
		
		ArsMethod.UpdateRiskControlMatrix(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 13)
	void ExportUtility() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Import / Export Utility -Export Utility");
		
		ArsMethod.ExportUtility(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 14)
	void AuditScheduling() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Add New");
		
		ArsMethod.AuditScheduling(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 15)
	void DisplayScheduleInformation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Display Schedule Information");
		
		ArsMethod.DisplayScheduleInformation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 16)
	void EditScheduleInformation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Edit Schedule Information");
		
		ArsMethod.EditScheduleInformation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 17)
	void DeleteSchedulingDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Scheduling-Delete Scheduling Details");
		
		ArsMethod.DeleteSchedulingDetails(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 18)
	void ReAssignAK() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting -Audit Kickoff -Re-Assign -Audit");
		
		ArsMethod.ReAssignAK(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
@Test(priority = 19)
	void Implementation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting -Audit Kickoff -Re-Assign -Implementation");
		
		ArsMethod.Implementation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 20)
	void ViewProcessWiseDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Kickoff -View  ProcessWise Details");
		
		ArsMethod.ViewProcessWiseDetails(driver,test);
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 21)
	void AdditionalRiskCreation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New");
		
		ArsMethod.AdditionalRiskCreation(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}      // change this Script
	
	@Test(priority = 22)
	void ExportToExcel() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation-Export To Excel");
		
		ArsMethod.ExportToExcel(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 23)
	void FilterAdditionalRiskCreation() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Fliter ");
		
		ArsMethod.FilterAdditionalRiskCreation(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 24)
	void AddNewRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Add New Risk Details ");
		
		ArsMethod.AddNewRiskDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 25)
	void EditRiskDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- Edit Risk Details ");
		
		ArsMethod.EditRiskDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 26)
	void DeActivate() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Additional Risk Creation- De-Activate ");
		
		ArsMethod.DeActivate(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 27)
	void SpecialAuditScheduling() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Special Audit Scheduling-Add New ");
		
		ArsMethod.SpecialAuditScheduling(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 28)
	void SpecialAuditSchedulingUpload() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Special Audit Scheduling-File Upload ");
		
		ArsMethod.SpecialAuditSchedulingUpload(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 29)
	void AuditDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Documents-Add New ");
		
		ArsMethod.AuditDocuments(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 30)
	void View() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Reporting - Audit Documents-View and Download ");
		
		ArsMethod.View(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 31)
	void ReportGeneration() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Filter ,Export to Excel  and View Audit Status ");
		
		ArsMethod.ReportGeneration(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 32)
	void ViewAuditDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - View Audit Details ");
		
		ArsMethod.ViewAuditDetails(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 33)
	void DraftObservationListing() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - View Audit Details - Draft Observation Listing ");
		
		ArsMethod.DraftObservationListing(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 34)
	void HistoricalObservation() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Past Observations - Historical Observation ");
		
		ArsMethod.HistoricalObservation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 35)
	void ViewHistoricalObservations() throws InterruptedException, IOException
	{
		test = extent.startTest("Report Generation - Past Observations - View Historical Observations ");
		
		ArsMethod.ViewHistoricalObservations(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	/*@Test(priority = 36)
	void HighOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- High - Open");
		
		ArsMethod.HighRisk(driver,test,"High - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 37)
	void HighClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- High - Close");
		
		ArsMethod.HighRisk(driver,test,"High - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 38)
	void MediumOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Medium - Open");
		
		ArsMethod.MediumRisk(driver,test,"Medium - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 39)
	void MediumClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Medium - Close");
		
		ArsMethod.MediumRisk(driver,test,"Medium - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	
		@Test(priority = 40)
	void LowOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Low - Open");
		
		ArsMethod.LowRisk(driver,test,"Low - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
		@Test(priority = 41)
	void LowClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Low - Close");
		
		ArsMethod.LowRisk(driver,test,"Low - Close","close");
		
		extent.endTest(test);
		extent.flush();
	} 

	
		//@Test(priority = 42)
	void CategoryOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Category Wise - Open");
		
		ArsMethod.CategoryOpen(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 43)
	void CategoryClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Category Wise - Close");
		
		ArsMethod.CategoryClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 44)
	void ProcessHigh() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Process  Wise - High");
		
		ArsMethod.ProcessHigh(driver,test);
		
		extent.endTest(test);
		extent.flush();
		}

	
	
	@Test(priority = 45)
	void ProcessMedium() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Process  Wise - Medium");
		
		ArsMethod.ProcessMedium(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 46)
	void ProcessLow() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Process  Wise - Low");
		
		ArsMethod.ProcessLow(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 47)
	void AgingGreater90() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Aging - Process Wise - >90 days");
		
		ArsMethod.AgingGreater90(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 48)
	void AgingNotDue() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Aging - Process Wise - Not Due");
		
		ArsMethod.AgingNotDue(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 49)
	void AuditCommitteeOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Audit Committee - Open");
		
		ArsMethod.AuditCommitteeOpen(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 50)
	void AuditCommitteeClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Audit Committee - Close");
		
		ArsMethod.AuditCommitteeClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}*/
	
	@Test(priority = 51)
	void AuditTrackerPlanned() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Audit Tracker - Planned");
		
		ArsMethod.AuditTrackerPlanned(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	/*@Test(priority = 52)
	void AuditTrackerActual() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Audit Tracker - Actual");
		
		ArsMethod.AuditTrackerActual(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 53)
	void AuditStatus() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Audit Status ");
		
		ArsMethod.AuditStatus(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 54)
	void AuditHeadSummaryOpenAudits() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Head Summary - Open Audits - Audit ");
		
		ArsMethod.AuditHeadSummaryOpenAudits(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 55)
	void AuditHeadSummaryClosedAudits() throws InterruptedException, IOException
	{
		test = extent.startTest("Audit Head Summary - Closed Audits - Audit ");
		
		ArsMethod.AuditHeadSummaryClosedAudits(driver,test);
		
		extent.endTest(test);
		extent.flush();
	
}*/
	}
	


