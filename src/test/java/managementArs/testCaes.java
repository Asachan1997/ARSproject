package managementArs;

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

public class testCaes {
	
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
		fis = new FileInputStream("C:\\Users\\ambuj\\Desktop\\automation\\auditexcelsheet.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving third sheet of Workbook
		return sheet;
	}
	
	@BeforeTest
	void setBrowser() throws InterruptedException, IOException
	{
	//	String workingDir = System.getProperty("webdriver.chrome.driver","C:/March2022/PerformerPom/Driver/chromedriver.exe");
		extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\ambuj\\eclipse-workspace\\Arsproduct\\Report\\Auditproduct.html",true);
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

	
	//@Test(priority = 2)
	void Riskgraph() throws InterruptedException, IOException
	{
		test = extent.startTest("high risk");
		
		//method.RiskHigh(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority = 3)
	void HighOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- High - Open");
		
		method.HighRisk(driver,test,"High - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority = 4)
	void HighClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- High - Close");
		
		method.HighRisk(driver,test,"High - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority = 5)
	void MediumOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Medium - Open");
		
		method.MediumRisk(driver,test,"Medium - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority = 6)
	void MediumClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Medium - Close");
		
		method.MediumRisk(driver,test,"Medium - Close","close");
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority = 7)
	void LowOpen() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Low - Open");
		
		method.LowRisk(driver,test,"Low - Open","open");
		
		extent.endTest(test);
		extent.flush();
	}
	
		//@Test(priority = 8)
	void LowClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Observations - Risk- Low - Close");
		
		method.LowRisk(driver,test,"Low - Close","close");
		
		extent.endTest(test);
		extent.flush();
	} 	
		//@Test(priority = 9)
		void CategoryOpen() throws InterruptedException, IOException
		{
			String category=locators.Categoryname(driver).getText();
			test = extent.startTest("Observations -"+category+"- Category Wise - Open"); // run time
			
		method.CategoryOpen(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 10)
		void CategoryClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Category Wise - Close");
			
			method.CategoryClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority = 11)
		void ProcessHigh() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - High");
			
			method.ProcessHigh(driver,test);
			
			extent.endTest(test);
			extent.flush();
			}
		//@Test(priority = 12)
		void ProcessMedium() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - Medium");
			
			method.ProcessMedium(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 13)
		void ProcessLow() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Process  Wise - Low");
			
			method.ProcessLow(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority = 14)
		void AgingGreater90() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - >90 days");
			
			method.AgingGreater90(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 15)
		void AgingNotDue() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Aging - Process Wise - Not Due");
			
			method.AgingNotDue(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority = 16)
		void AuditCommitteeOpen() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Audit Committee - Open");
			
			method.AuditCommitteeOpen(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority = 17)
		void AuditCommitteeClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Observations - Audit Committee - Close");
			
			method.AuditCommitteeClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}	
		@Test(priority = 18)
		void observationlist() throws InterruptedException, IOException
		{
			test = extent.startTest("Observationlist");
			method.observationlist(driver,test);
			extent.endTest(test);
			extent.flush();
		}	
}
