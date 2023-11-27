package newauditproject;


	import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class mastercount 
 {
		
		public static WebDriver driver = null;		//WebDriver instance created
		public static WebElement upload = null;		//WebElement to get upload button
		public static ExtentReports extent;			//Instance created for report file
		public static ExtentTest test;				//Instance created for tests
		public static FileInputStream fis = null;	//File input stream variable
		public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
		public static XSSFSheet sheet = null;		//Sheet variable
		public static List<WebElement> elementsList = null;
		public static List<String> lines = null;
		
		
		public static XSSFSheet ReadExcel() throws IOException
		{
			
			fis = new FileInputStream("C://Users//ambuj//Desktop//automation//auditexcelsheet.xlsx");
			
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
			return sheet;
		}
		
		@BeforeTest

		void setBrowser() throws Exception
		{
			
			extent = new com.relevantcodes.extentreports.ExtentReports("C://Users//ambuj//eclipse-workspace//Arsproduct//Report//Auditresult.html",true);
			test = extent.startTest("Verify OpenBrowser");
			
			test.log(LogStatus.PASS, "Test Passed - Audit ARS");
			extent.endTest(test);
			extent.flush();
		}
		
		@BeforeMethod
		void Login() throws InterruptedException, IOException
		//void masterlogin() throws InterruptedException, IOException
		{
		
			XSSFSheet sheet = ReadExcel();
			Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
			Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
			String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
			
			//login.masterlogin.BrowserSetup(URL);	

			login.Login.BrowserSetup(URL);	
			Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
			Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
			String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
			
			Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
			Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
			String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
			
			driver = login.Login.UserLogin(uname,password,"compayAdmin");		//mastermethod of Login class to login user.
			
		}
		
		
		
		
		
		/*@Test(priority = 1) 
		void Master1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Unit Master Verification ");
			
			mastermethod.Master(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 2) 
		void MasterUnitWithoutEnterData1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without enter data Add Unit Master Verification ");
			
			mastermethod.MasterUnitWithoutEnterData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 3) 
		void MasterWithoutEnterParticularField1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without enter Particular Field Add Unit Master Verification ");
			
			mastermethod.MasterWithoutEnterParticularField(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		

		
		@Test(priority = 4) 
		void MasterUnitFilter1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Unit Master - Search Filter Verification ");
			
			mastermethod.MasterUnitFilter(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 5) 
		void MasterSubUnit1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Unit - Sub-Unit Master Verification ");
			
			mastermethod.MasterSubUnit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 6) 
		void MasterSubUnitUpdate1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Unit - Sub-Unit Update Verification ");
			
			mastermethod.MasterSubUnitUpdate(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 7) 
		void MasterSubUnitExport1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Unit - Sub-Unit - Export to Excel Button Verification ");
			
			mastermethod.MasterSubUnitExport(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 8) 
		void MasterSubUnitFilter1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Unit - Sub-Unit Search Filter Verification ");
			
			mastermethod.MasterSubUnitFilter(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 9) 
		void DepartmentMaster1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Department Master Verification ");
			
			mastermethod.DepartmentMaster(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 10) 
		void DepartmentMasterWithoutEnterData1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Enter Data Add Department Master Verification ");
			
			mastermethod.DepartmentMasterWithoutEnterData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 11) 
		void VerticalMaster1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Vertical Master Verification ");
			
			mastermethod.VerticalMaster(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 12) 
		void VerticalMasterWithoutEnterData1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Enter Data Add Vertical Master Verification ");
			
			mastermethod.VerticalMasterWithoutEnterData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
		
		@Test(priority = 13) 
		void BusinessProcess1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Business Process Verification ");
			
			mastermethod.BusinessProcess(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		*/
     	@Test(priority = 14) 
		void BusinessProcessBackButton1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Business Process - Back Button Verification ");
			
			mastermethod.BusinessProcessBackButton(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 15) 
		void BusinessProcessAddActivity1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Business Process - Activity Verification ");
			
			mastermethod.BusinessProcessAddActivity(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 16) 
		void BusinessProcessActivityCloseButton1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Business Process - Activity - Close Button  Verification ");
			
			mastermethod.BusinessProcessActivityCloseButton(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 17) 
		void BusinessProcessActivityBackButton1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Business Process - Activity - Back Button Verification ");
			
			mastermethod.BusinessProcessActivityBackButton(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		
		@Test(priority = 18) 
		void BusinessProcessWithoutEnterData1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Enter Data Add Business Process Verification ");
			
			mastermethod.BusinessProcessWithoutEnterData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
	   @Test(priority = 19) 
		void ObservationCatogaries1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Observation Category Verification ");
			
			mastermethod.ObservationCatogaries(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 20) 
		void ObservationCatogariesWithoutEnterData1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Enter Data Add Observation Category Verification ");
			
			mastermethod.ObservationCatogariesWithoutEnterData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
	   @Test(priority = 21) 
		void RiskCategory1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Risk Category Verification ");
			
			mastermethod.RiskCategory(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		  @Test(priority = 22) 
			void RiskSearchFilter1() throws InterruptedException, IOException
			{
				test = extent.startTest("Master - Risk Category - Search Filter Verification ");
				
				mastermethod.RiskSearchFilter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		
		
		
		
	   
	   
		
		  @Test(priority = 23) 
			void RiskCategoryWithoutEnterData1() throws InterruptedException, IOException
			{
				test = extent.startTest("Master - Without Enter Data Add Risk Category Verification ");
				
				mastermethod.RiskCategoryWithoutEnterData(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		
		@Test(priority = 24) 
		void Users1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - User Verification ");
			
			mastermethod.Users(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 25) 
		void UsersSearchFilter1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - User Master - Search Filter Verification ");
			
			mastermethod.UsersSearchFilter(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		
		
		@Test(priority = 26) 
		void UsersWithoutEnterData1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Enter Data Add User Verification ");
			
			mastermethod.UsersWithoutEnterData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 27) 
		void UsersWitoutEnterParticularField1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Enter Particular Field Add User Verification ");
			
			mastermethod.UsersWitoutEnterParticularField(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
	
		@Test(priority = 28) 
		void UnitAssignment1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Add Unit Assignment Verification ");
			
			//mastermethod.UnitAssignment(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 29) 
		void UnitAssignmentWithoutEnterAnyFilter1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Apply Any Filter Add Unit Assignment Verification ");
			
			mastermethod.UnitAssignmentWithoutEnterAnyFilter(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		

		@Test(priority = 30) 
		void UnitAssignmentWithoutEnterParticularFilter1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Without Apply Particular Filter Add Unit Assignment Verification ");
			
			mastermethod.UnitAssignmentWithoutEnterParticularFilter(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 31) 
		void UnitAssignmentEdit1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Update Unit Assignment Verification ");
			
			mastermethod.UnitAssignmentEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 32) 
		void UnitAssignmentReasign1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Re-assign Unit Assignment Verification ");
			
			mastermethod.UnitAssignmentReasign(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 33) 
		void AuditorMaster1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Auditor Master Verification ");
			
			mastermethod.AuditorMaster(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 34) 
		void AuditorsTeamMaster1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Auditors Team Master Verification ");
			
			mastermethod.AuditorsTeamMaster(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		@Test(priority = 35) 
		void StateMaster1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - State Master Verification ");
			
			mastermethod.StateMaster(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 36) 
		void StateMasterSearchFilterVerification1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - State Master - search Filter Verification ");
			
			mastermethod.StateMasterSearchFilterVerification(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 37) 
		void CityMaster1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - City Master Verification ");
			
			mastermethod.CityMaster(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 38) 
		void CityMasterSearchFilter1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - City Master - Search Filter Verification ");
			
			mastermethod.CityMasterSearchFilter(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
		@Test(priority = 39) 
		void ProcessRatingMaster1() throws InterruptedException, IOException
		{
			test = extent.startTest("Master - Process Rating Master Verification ");
			
			mastermethod.ProcessRatingMaster(driver,test,workbook);
			//*[@id="CMPMenuBar"]/ul/li[5]/a
			extent.endTest(test);
			extent.flush();
		}
	
	
 }
