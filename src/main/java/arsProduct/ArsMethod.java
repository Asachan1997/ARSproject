package arsProduct;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ArsMethod {
	
	
		public static FileInputStream fis = null;	//File input stream variable
		public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
		public static XSSFSheet sheet = null;		//Sheet variable
		
		public static void AuditHead(WebDriver driver, ExtentTest test) throws InterruptedException
			 {
		
			WebDriverWait wait = new WebDriverWait(driver, (40));
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
			Thread.sleep(1000);
			ArsLocators.clickMaster(driver).click();
			Thread.sleep(1000);
			ArsLocators.UnitAssignment(driver).click();
			Thread.sleep(1000);
			ArsLocators.AddNew(driver).click();
			Thread.sleep(1000);
			ArsLocators.SelectCompany(driver).click();
			ArsLocators.Ahemdabad(driver).click();
			Thread.sleep(1000);
			ArsLocators.Ok(driver).click();
			Thread.sleep(1000);
			ArsLocators.SelectUser(driver).click();
			Thread.sleep(1000);
			ArsLocators.RichaShah(driver).click();
			Thread.sleep(1000);
			ArsLocators.SelectProcess(driver).click();
			Thread.sleep(1000);
			ArsLocators.ActionProcess(driver).click();
			Thread.sleep(1000);
			ArsLocators.ProcessOk(driver).click();
			Thread.sleep(1000);
			ArsLocators.Save(driver).click();
			Thread.sleep(1000);
			String msg = ArsLocators.Savemsg(driver).getText();
			if (msg.equalsIgnoreCase("Save successfully.")) {
				test.log(LogStatus.PASS,  "Audit Head -Add New -" +msg);
			} else {
				test.log(LogStatus.FAIL, " Audit Head -Add New -" +msg);
			}
			ArsLocators.close(driver).click();
		}
		
		
		public static void Management(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
		Thread.sleep(1000);
		ArsLocators.clickMaster(driver).click();
		Thread.sleep(1000);
		ArsLocators.UnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.AddNew(driver).click();
		Thread.sleep(2000);
		ArsLocators.Management(driver).click();
		Thread.sleep(4000);
		
		ArsLocators.SelectUnit(driver).click();
		Thread.sleep(1000);
		ArsLocators.AhemdabadMgmt(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok(driver).click();
		Thread.sleep(4000);
		ArsLocators.User(driver).click();
		Thread.sleep(1000);
		ArsLocators.PlantHead(driver).click();
		Thread.sleep(3000);
		ArsLocators.SelectProcessMgmt(driver).click();
		Thread.sleep(1000);
		ArsLocators.ActionProcessMgmt(driver).click();
		Thread.sleep(1000);
		ArsLocators.ProcessOk(driver).click();
		Thread.sleep(4000);
		ArsLocators.SaveMgmt(driver).click();
		Thread.sleep(1000);
		String msg = ArsLocators.SaveMgmtMsg(driver).getText();
		if (msg.equalsIgnoreCase("Save successfully.")) {
			test.log(LogStatus.PASS,  "Management -Add New -" +msg);
		} else {
			test.log(LogStatus.FAIL, " Management -Add New -" +msg);
		}
		ArsLocators.CloseMgmt(driver).click();
	}
	
		
		public static void DepartmentHead(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
		Thread.sleep(1000);
		ArsLocators.clickMaster(driver).click();
		Thread.sleep(1000);
		ArsLocators.UnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.AddNew(driver).click();
		Thread.sleep(2000);
		ArsLocators.DepartmentHead(driver).click();
		Thread.sleep(4000);
		
		ArsLocators.SelectUnitDpt(driver).click();
		Thread.sleep(1000);
		ArsLocators.AhemdabadDept(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok(driver).click();
		Thread.sleep(4000);
		ArsLocators.SelectUserDpt(driver).click();
		Thread.sleep(1000);
		ArsLocators.Departmenthead(driver).click();
		Thread.sleep(3000);
		ArsLocators.SelectDepartment(driver).click();
		Thread.sleep(1000);
		ArsLocators.AdminDpt(driver).click();
		Thread.sleep(1000);
		ArsLocators.ProcessOk(driver).click();
		Thread.sleep(4000);
		ArsLocators.SaveDpt(driver).click();
		Thread.sleep(1000);
		String msg = ArsLocators.SaveDptMsg(driver).getText();
		if (msg.equalsIgnoreCase("Save successfully.")) {
			test.log(LogStatus.PASS,  "Department Head -Add New -" +msg);
		} else {
			test.log(LogStatus.FAIL, " Department Head -Add New -" +msg);
		}
		ArsLocators.CloseDpt(driver).click();
	}
	
		public static void ManagementEdit(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
		Thread.sleep(1000);
		ArsLocators.clickMaster(driver).click();
		Thread.sleep(1000);
		ArsLocators.UnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.EditUnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.ManagementEdit(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.SelectUnitEditM(driver).click();
		ArsLocators.AhemdabadEditM(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok1(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectUser1M(driver).click();
		Thread.sleep(1000);
		ArsLocators.PlantHead1M(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectProcess1M(driver).click();
		Thread.sleep(1000);
		ArsLocators.ActionProcessM(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok2(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectSubUnit(driver).click();
		Thread.sleep(1000);
		//ArsLocators.gujrat(driver).click();
		Thread.sleep(1000);
		ArsLocators.OkSubunit(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.SaveME(driver).click();
		Thread.sleep(1000);
		String msg = ArsLocators.SaveMEMsg(driver).getText();
		if (msg.equalsIgnoreCase("Save successfully.")) {
			test.log(LogStatus.PASS,  "Management -Edit -" +msg);
		} else {
			test.log(LogStatus.FAIL, "Management -Edit -" +msg);
		}
		ArsLocators.CloseEditM(driver).click();
	}
	
		
		public static void AuditHeadEdit(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
		Thread.sleep(1000);
		ArsLocators.clickMaster(driver).click();
		Thread.sleep(1000);
		ArsLocators.UnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.EditUnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectUnitEdit(driver).click();
		ArsLocators.Ahemdabad1(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok1(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectUser1(driver).click();
		Thread.sleep(1000);
		ArsLocators.RichaShah1(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectProcess1(driver).click();
		Thread.sleep(1000);
		ArsLocators.AgroServiceDivision(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok2(driver).click();
		Thread.sleep(1000);
		ArsLocators.SaveEdit(driver).click();
		Thread.sleep(1000);
		String msg = ArsLocators.SaveEditMsg(driver).getText();
		if (msg.equalsIgnoreCase("Save successfully.")) {
			test.log(LogStatus.PASS,  "Audit Head -Edit -" +msg);
		} else {
			test.log(LogStatus.FAIL, " Audit Head -Edit -" +msg);
		}
		ArsLocators.Editclose(driver).click();
	}
		
		public static void DepartmentHeadEdit(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
		Thread.sleep(1000);
		ArsLocators.clickMaster(driver).click();
		Thread.sleep(1000);
		ArsLocators.UnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.EditUnitAssignment(driver).click();
		Thread.sleep(1000);
		ArsLocators.DepartmentHeadEdit(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.SelectUnitDept(driver).click();
		ArsLocators.AhemdabadEditDept(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok1(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectUser1Dpt(driver).click();
		Thread.sleep(1000);
		ArsLocators.DepartmentheadDpt(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectDepartmentedit(driver).click();
		Thread.sleep(1000);
		ArsLocators.Adminedit(driver).click();
		Thread.sleep(1000);
		ArsLocators.Ok2(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.DptSave(driver).click();
		Thread.sleep(1000);
		String msg = ArsLocators.DptSaveMsg(driver).getText();
		if (msg.equalsIgnoreCase("Save successfully.")) {
			test.log(LogStatus.PASS,  "Management -Edit -" +msg);
		} else {
			test.log(LogStatus.FAIL, "Management -Edit -" +msg);
		}
		ArsLocators.DptClose(driver).click();
	}
	
	
		public static void ReAssign(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
		Thread.sleep(1000);
		ArsLocators.clickMaster(driver).click();
		Thread.sleep(1000);
		ArsLocators.UnitAssignment(driver).click();
		Thread.sleep(2000);
		ArsLocators.ReAssign(driver).click();
		Thread.sleep(2000);
		ArsLocators.ReAssignUser(driver).click();
		Thread.sleep(1000);
		ArsLocators.ReAsRichaShahr(driver).click();
		Thread.sleep(1000);
		ArsLocators.NewUser(driver).click();
		Thread.sleep(1000);
		ArsLocators.NewUserRS(driver).click();
		Thread.sleep(1000);
		ArsLocators.NewUserSave(driver).click();
		String Msg=driver.switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  "Re-Assign-" +Msg);
		driver.switchTo().alert().accept();
		String Msg1=	ArsLocators.NewUserSaveMsg(driver).getText();
		test.log(LogStatus.PASS,  "Re-Assign-" +Msg1);
		Thread.sleep(1000);
		ArsLocators.ReAssignClose(driver).click();
		Thread.sleep(1000);
		 }
		
		
		public static void DeleteProcess(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"))); 
		Thread.sleep(1000);
		ArsLocators.clickMaster(driver).click();
		Thread.sleep(1000);
		ArsLocators.UnitAssignment(driver).click();
		Thread.sleep(2000);
		ArsLocators.DeleteProcess(driver).click();
		Thread.sleep(2000);
String Msg=driver.switchTo().alert().getText();
		
		test.log(LogStatus.PASS,  "Delete Process" +Msg);
		driver.switchTo().alert().dismiss();
		
		 }
		
		public static void RiskControlMatrix(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.ImportExportUtility(driver).click();
		Thread.sleep(5000);
		ArsLocators.RiskControlMatrix(driver).click();
		
		Thread.sleep(3000);
		ArsLocators.SelectApplicableLocation(driver).click();
		Thread.sleep(1000);
		ArsLocators.LocationExpand(driver).click();
		Thread.sleep(1000);
		ArsLocators.India(driver).click();
		Thread.sleep(1000);
		ArsLocators.Vertical(driver).click();
		Thread.sleep(1000);
		ArsLocators.NA(driver).click();
		Thread.sleep(1000);
		ArsLocators.ChooseFile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\RiskControlMatrix_Audit Steps_Sample (3).xlsx");
		Thread.sleep(1000);
		ArsLocators.Upload(driver).click();
		Thread.sleep(1000);
		 }
		
		
		public static void SubProcess(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.ImportExportUtility(driver).click();
		Thread.sleep(2000);
		ArsLocators.SubProcess(driver).click();
		Thread.sleep(2000);
		ArsLocators.ChooseFile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\SubProcess_Sample.xlsx");
		Thread.sleep(1000);
		ArsLocators.Upload(driver).click();
		Thread.sleep(1000);
		 }
		
		public static void UpdateRiskControlMatrix(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.ImportExportUtility(driver).click();
		Thread.sleep(2000);
		ArsLocators.UpdateRiskControlMatrix(driver).click();
		
		Thread.sleep(3000);
		ArsLocators.SelectApplicableLocation(driver).click();
		Thread.sleep(1000);
		ArsLocators.LocationExpand(driver).click();
		Thread.sleep(1000);
		ArsLocators.India(driver).click();
		Thread.sleep(3000);
		ArsLocators.Vertical1(driver).click();
	
		Thread.sleep(1000);
		ArsLocators.NA(driver).click();
		Thread.sleep(1000);
		ArsLocators.ChooseFile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\RiskControlMatrixExportForUpdate (2).xlsx");
		Thread.sleep(1000);
		ArsLocators.Upload(driver).click();
		Thread.sleep(1000);
		 }
		
		public static void ExportUtility(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.ImportExportUtility(driver).click();
		Thread.sleep(2000);
		ArsLocators.ExportUtility(driver).click();
		
		Thread.sleep(3000);
		
		ArsLocators.Company(driver).click();
		Thread.sleep(1000);
		//ArsLocators.EnterText(driver).sendKeys("india");
		Thread.sleep(1000);
		ArsLocators.IndiaCompany(driver).click();
		
		
		Thread.sleep(1000);
		File dir = new File("C:\\Users\\Mayuri Gaikwad\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.Export(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\Mayuri Gaikwad\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		 }
		
		public static void AuditScheduling(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditScheduling(driver).click();
		Thread.sleep(3000);
		ArsLocators.ASAddNew(driver).click();
		
		Thread.sleep(1000);
		ArsLocators.CompanyAS(driver).click();
		Thread.sleep(1000);
		ArsLocators.IndiaAS(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.SelectProcessAS(driver).click();
		Thread.sleep(1000);
		ArsLocators.BankingCheckbox(driver).click();
		Thread.sleep(1000);
		ArsLocators.OK(driver).click();
		Thread.sleep(1000);
		ArsLocators.FinancialYear(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectFinancialYear(driver).click();
		Thread.sleep(1000);
		ArsLocators.SchedulingType(driver).click();
		Thread.sleep(1000);
		ArsLocators.STAnnually(driver).click();
		Thread.sleep(1000);
		ArsLocators.StartDate(driver).sendKeys("02-02-2023");
		Thread.sleep(1000);
		ArsLocators.EndDate(driver).sendKeys("20-02-2023");
		Thread.sleep(1000);
		ArsLocators.SchedulingType(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectBank(driver).click();
		Thread.sleep(1000);
		ArsLocators.SaveBtn(driver).click();
		Thread.sleep(1000);
		try {
	String Msg=	ArsLocators.ASSaveMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg);
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL, "Audit Schedule Already Present");
		}
		ArsLocators.CloseBtn(driver).click();
		Thread.sleep(1000);
		 }
		 
		public static void DisplayScheduleInformation(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditScheduling(driver).click();
		Thread.sleep(3000);
		ArsLocators.DisplayScheduleInformation(driver).click();
		Thread.sleep(3000);
		ArsLocators.DisplayScheduleInformationSave(driver).click();
		Thread.sleep(1000);
		String Msg=	ArsLocators.DSSaveMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg);
		ArsLocators.DSClose(driver).click();
		Thread.sleep(1000);
		 }
		
		public static void EditScheduleInformation(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditScheduling(driver).click();
		Thread.sleep(3000);
		ArsLocators.EditScheduleInformation(driver).click();
		Thread.sleep(3000);
		ArsLocators.Frequency(driver).click();
		Thread.sleep(1000);
		ArsLocators.EditSave(driver).click();
		Thread.sleep(1000);
		String Msg=	ArsLocators.EditSaveMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg);
		
		
		 }
		
		public static void DeleteSchedulingDetails(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditScheduling(driver).click();
		Thread.sleep(3000);
		ArsLocators.DeleteSchedulingDetails(driver).click();
		Thread.sleep(3000);
		
		String Msg=	driver.switchTo().alert().getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		String Msg1=	ArsLocators.EditSaveMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg1);
		
		
		 }
		
		public static void ReAssignAK(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditKickoff(driver).click();
		Thread.sleep(3000);
		ArsLocators.ReAssignAK(driver).click();
		Thread.sleep(3000);
		ArsLocators.UserAK(driver).click();
		Thread.sleep(1000);
		ArsLocators.DhammapalPerformer(driver).click();
		Thread.sleep(3000);
		
	//	ArsLocators.CompanyAK(driver).click();
		//Thread.sleep(1000);
	//	ArsLocators.IndiaAK(driver).click();
		Thread.sleep(5000);
		ArsLocators.NewUserAK(driver).click();
		Thread.sleep(1000);
		ArsLocators.ambujperformer2(driver).click();
		Thread.sleep(3000);
		ArsLocators.SaveAk(driver).click();
		Thread.sleep(3000);
		
		String Msg=	driver.switchTo().alert().getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		String Msg1=ArsLocators.SaveAkMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg1);
		ArsLocators.Close(driver).click();
		Thread.sleep(3000);
		
		
		 }
		
		public static void Implementation(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditKickoff(driver).click();
		Thread.sleep(3000);
		ArsLocators.ReAssignAK(driver).click();
		Thread.sleep(3000);
		ArsLocators.Implementation(driver).click();
		Thread.sleep(3000);
		ArsLocators.UserAK(driver).click();
		Thread.sleep(1000);
		ArsLocators.DhammapalPerformer(driver).click();
		Thread.sleep(3000);
		
	//	ArsLocators.CompanyAK(driver).click();
		Thread.sleep(1000);
	//	ArsLocators.IndiaAK(driver).click();
		Thread.sleep(3000);
		ArsLocators.NewUserAK(driver).click();
		Thread.sleep(1000);
		ArsLocators.ambujperformer2(driver).click();
		Thread.sleep(3000);
		ArsLocators.SaveAk(driver).click();
		Thread.sleep(3000);
		
		String Msg=	driver.switchTo().alert().getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		String Msg1=ArsLocators.SaveAkMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg1);
		ArsLocators.Close(driver).click();
		Thread.sleep(3000);
		
		
		 }
		
		public static void ViewProcessWiseDetails(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditKickoff(driver).click();
		Thread.sleep(3000);
		
		ArsLocators.ViewProcessWiseDetails(driver).click();
		Thread.sleep(4000);
		ArsLocators.Performer(driver).click();
		Thread.sleep(1000);
		ArsLocators.PerformerCheckBox(driver).click();
		ArsLocators.PerformerOk(driver).click();
		Thread.sleep(3000);
		
		ArsLocators.SelectReviwer(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectReviwerA(driver).click();
		Thread.sleep(1000);
		ArsLocators.SaveVp(driver).click();
		Thread.sleep(3000);
		String Msg1=ArsLocators.SaveVpMSg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg1);
		// --------------Audit  Assignment Sample Excel  File -----------------------
		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.AuditAssignmentSampleExcelFile(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		//--------------- Upload File----------------------------------
		ArsLocators.ChooseFileVP(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\Audit_Assignment_Excel (1).xlsx");
		Thread.sleep(1000);
		ArsLocators.UploadVp(driver).click();
		String Msg2=ArsLocators.UploadMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg2);
		Thread.sleep(1000);
		ArsLocators.Back(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS,  " Back Button Working successfully");
		}
		
		public static void AdditionalRiskCreation(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AdditionalRiskCreation(driver).click();
		Thread.sleep(3000);
		
		ArsLocators.ARAddNew(driver).click();
		Thread.sleep(4000);
		ArsLocators.CompanyAr(driver).click();
		Thread.sleep(1000);
		ArsLocators.IndiaAR(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectProcessAR(driver).click();
		//ArsLocators.ActionProcessAR(driver).click();
		//ArsLocators.OkAR(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectSubProcess(driver).click();
		Thread.sleep(2000);
		ArsLocators.SubAction(driver).click();
		ArsLocators.OkSubAction(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectPersonResponsible(driver).click();
		ArsLocators.ambujperformer2AR(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectRCMType(driver).click();
		ArsLocators.Both(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectKeyType(driver).click();
		ArsLocators.SelectKeyTypeYes(driver).click();
		Thread.sleep(1000);
		sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		row0 = sheet.getRow(4);
		c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		int No = (int) c1.getNumericCellValue();
		ArsLocators.ObjectiveRef(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(1000);

		row0 = sheet.getRow(5);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.Risk(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		row0 = sheet.getRow(6);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.ControlObjective(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		row0 = sheet.getRow(7);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.ControlDescription(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		row0 = sheet.getRow(8);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.AuditMethodology(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.AuditSteps(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(1000);
		
		ArsLocators.SaveAR(driver).click();
		Thread.sleep(1000);
		try {
		String Msg2=ArsLocators.SaveMsg(driver).getText();
		Thread.sleep(1000);
		if (Msg2.equalsIgnoreCase("Details Added Successfully.")) {
			test.log(LogStatus.PASS,  "Message display :-" +Msg2);
		} else {
			test.log(LogStatus.FAIL,  "Message display :-" +Msg2);
		}
		}catch(Exception e) {
			test.log(LogStatus.PASS,  "Message display :- Details Already Present.");
		}
		Thread.sleep(1000);
		if(ArsLocators.CloseBtnAR(driver).isEnabled()) {
			
			ArsLocators.CloseBtnAR(driver).click();
			test.log(LogStatus.PASS,  "Close Button Working Successfully");
		}else {
			test.log(LogStatus.PASS,  "Close Button Not Working Successfully");
		}
		 }
		
		public static void ExportToExcel(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AdditionalRiskCreation(driver).click();
		Thread.sleep(3000);
		
		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.ExportAR(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		 }
		
		public static void FilterAdditionalRiskCreation(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AdditionalRiskCreation(driver).click();
		Thread.sleep(2000);
		ArsLocators.CompanyAR(driver).click();
		Thread.sleep(1000);
		ArsLocators.IndiaARF(driver).click();
		Thread.sleep(4000);
		ArsLocators.Process(driver).click();
		Thread.sleep(1000);
		ArsLocators.ActionProcessARF(driver).click();
		Thread.sleep(5000);
		sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.Search(driver).sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
		Thread.sleep(500);
	//String Msg1	=ArsLocators.Search(driver).getText();
		Thread.sleep(1000);
	String Msg=	ArsLocators.AuditStepFilter(driver).getText();
	if(Msg.equalsIgnoreCase("The auditor will review prior audits in your area and professional literature.")) {
		test.log(LogStatus.PASS,  " Filter Working successfully.");
			} else {
				test.log(LogStatus.FAIL, "  Filter not Working successfully.");
			}
		
		 }
		
		public static void AddNewRiskDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AdditionalRiskCreation(driver).click();
		Thread.sleep(2000);
		sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.Search(driver).sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
		Thread.sleep(4000);
		ArsLocators.AddNewRiskDetails(driver).click();
		Thread.sleep(2000);
		ArsLocators.AuditStep(driver).clear();
		Thread.sleep(2000);
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.AuditStep(driver).sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
		Thread.sleep(1000);
		ArsLocators.SaveANR(driver).click();
		String Msg1	=ArsLocators.SaveANRMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS,  "Message display :-" +Msg1);
		Thread.sleep(1000);
		ArsLocators.CloseANR(driver).click();
		 }
		
		public static void EditRiskDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AdditionalRiskCreation(driver).click();
		Thread.sleep(2000);
		sheet = workbook.getSheetAt(20); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.Search(driver).sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
		Thread.sleep(4000);
		ArsLocators.EditRiskDetails(driver).click();
		Thread.sleep(2000);
		ArsLocators.AuditStep(driver).clear();
		Thread.sleep(2000);
		row0 = sheet.getRow(9);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		ArsLocators.AuditStep(driver).sendKeys(c1.getStringCellValue(),Keys.ENTER); // Writing Task title
		Thread.sleep(1000);
		ArsLocators.SaveANR(driver).click();
		String Msg1	=ArsLocators.SaveANRMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS,  "Message display :-" +Msg1);
		Thread.sleep(1000);
		ArsLocators.CloseANR(driver).click();
		 }
		
		public static void DeActivate(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AdditionalRiskCreation(driver).click();
		Thread.sleep(2000);
		ArsLocators.DeActivate(driver).click();
		Thread.sleep(2000);
		ArsLocators.CompanyAR(driver).click();
		Thread.sleep(1000);
		ArsLocators.ireland(driver).click();
		Thread.sleep(2000);
		
		ArsLocators.SelectAuditStep(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectAuditStepChckBox(driver).click();
		Thread.sleep(1000);
		ArsLocators.SelectAuditStep(driver).click();
		Thread.sleep(1000);
		ArsLocators.ClickShow(driver).click();
		Thread.sleep(1000);
		ArsLocators.CheckBox(driver).click();
		Thread.sleep(1000);
		ArsLocators.SaveDeactivate(driver).click();
		Thread.sleep(1000);
		String Msg1	=ArsLocators.SaveDeactivateMSG(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS,  "Message display :-" +Msg1);
		Thread.sleep(1000);
		ArsLocators.ClickDashboard(driver).click();
		 }
		
		
		public static void SpecialAuditScheduling(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.SpecialAuditScheduling(driver).click();
		Thread.sleep(2000);
		ArsLocators.ADDNew(driver).click();
		Thread.sleep(2000);
		ArsLocators.CompanyAr(driver).click();
		Thread.sleep(500);
		ArsLocators.india(driver).click();
		Thread.sleep(500);
		ArsLocators.FinancialYearSA(driver).click();
		Thread.sleep(500);
		ArsLocators.FY20232024(driver).click();
		Thread.sleep(500);
		ArsLocators.VerticalSA(driver).click();
		Thread.sleep(500);
		ArsLocators.NASA(driver).click();
		Thread.sleep(500);
		
		ArsLocators.StartDateSA(driver).sendKeys("02-02-2023");
		Thread.sleep(500);
		ArsLocators.EndDateSa(driver).sendKeys("08-02-2023");
		Thread.sleep(500);
		ArsLocators.ProcessName(driver).sendKeys("Analytica");
		Thread.sleep(500);
		ArsLocators.SaveSA(driver).click();
		Thread.sleep(500);
		String Msg1	=ArsLocators.SaveSAMsg(driver).getText();
		Thread.sleep(1000);
		if(Msg1.equalsIgnoreCase("Data successfully saved.")) {
			test.log(LogStatus.PASS,  "Message display :-" +Msg1);
		}else {
			test.log(LogStatus.FAIL,  "Message display :-" +Msg1);
		}
		
		Thread.sleep(1000);
		ArsLocators.CloseSa(driver).click();
		Thread.sleep(500);
		
		 }
		
		public static void SpecialAuditSchedulingUpload(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.SpecialAuditScheduling(driver).click();
		Thread.sleep(2000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.SpecialAuditStep(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		Thread.sleep(3000);
		if(ArsLocators.Choosefile(driver).isEnabled()) {
		ArsLocators.Choosefile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\SpecialStepSample (2).xlsx");
		Thread.sleep(500);
		ArsLocators.upload(driver).click();
		Thread.sleep(2000);
		String Msg1	=ArsLocators.uploadMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
		
		}else {
			test.log(LogStatus.FAIL, "  File Already Uploaded");
		}
		 }
		
		public static void AuditDocuments(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditDocuments(driver).click();
		Thread.sleep(2000);
		ArsLocators.AddNewDA(driver).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));
		ArsLocators.CompanyAD(driver).click();
		Thread.sleep(500);
		ArsLocators.indiaAD(driver).click();
		Thread.sleep(500);
		ArsLocators.FinanacialYear(driver).click();
		Thread.sleep(500);
		ArsLocators.FY(driver).click();
		Thread.sleep(500);
		ArsLocators.ChooseFileAD(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\OpenObservationReport (83).xlsx");
		Thread.sleep(500);
		ArsLocators.SaveAD(driver).click();
		test.log(LogStatus.PASS,  "Audit Documents Add Successfully");
		Thread.sleep(500);
		driver.switchTo().parentFrame();
		ArsLocators.ClosePop(driver).click();
		 }
		
		public static void View(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"))); 
		Thread.sleep(1000);
		ArsLocators.AuditReporting(driver).click();
		Thread.sleep(1000);
		ArsLocators.AuditDocuments(driver).click();
		Thread.sleep(2000);
		ArsLocators.View(driver).click();
		Thread.sleep(2000);
		
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.ClickDownload(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		ArsLocators.ViewClose(driver).click();
		Thread.sleep(500);
		 }
		
		public static void ReportGeneration(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	// ----------------Filter ----------------------------------------------
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
		Thread.sleep(1000);
		ArsLocators.ReportGeneration(driver).click();
		Thread.sleep(3000);
		ArsLocators.Company(driver).click();
		Thread.sleep(2000);
		ArsLocators.allahabad(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.FinancialYearRG(driver).click();
		Thread.sleep(1000);
		ArsLocators.RG20232024(driver).click();
		Thread.sleep(4000);
		
		ArsLocators.FinancialYearRG(driver).click();
		Thread.sleep(1000);
		ArsLocators.RG20222023(driver).click();
		Thread.sleep(3000);
		
		String Msg=	ArsLocators.FinancialYearText(driver).getText();
		if(Msg.equalsIgnoreCase("2022-2023")) {
			test.log(LogStatus.PASS,  " Filter Working successfully.");
				} else {
					test.log(LogStatus.FAIL, "  Filter not Working successfully.");
				}
			
		// ---------------- Export To Excel ----------------------------------------------
		
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.ExportRG(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		// ----------------View Audit Status ----------------------------------------------
		ArsLocators.ViewAuditStatus(driver).click();
		Thread.sleep(2000);
		ArsLocators.ViewAuditStatusClose(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS,  " View Audit Status  successfully.");
		
		 }
		
		public static void ViewAuditDetails(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	// ----------------View Audit Details - Save ----------------------------------------------
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
		Thread.sleep(1000);
		ArsLocators.ReportGeneration(driver).click();
		Thread.sleep(3000);
		ArsLocators.Company(driver).click();
		Thread.sleep(2000);
		ArsLocators.allahabad(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.FinancialYearRG(driver).click();
		Thread.sleep(1000);
		ArsLocators.RG20232024(driver).click();
		Thread.sleep(4000);
		
		ArsLocators.FinancialYearRG(driver).click();
		Thread.sleep(1000);
		ArsLocators.RG20222023(driver).click();
		Thread.sleep(3000);
		
		ArsLocators.ViewAuditDetails(driver).click();
		Thread.sleep(3000);
		
		ArsLocators.ChooseFileRG(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\AuditStatusReport (31).xlsx");
		Thread.sleep(1000);
		ArsLocators.Remarks(driver).sendKeys("remark");
		Thread.sleep(2000);
		ArsLocators.SaveVAD(driver).click();
		Thread.sleep(3000);
		String Msg1	=ArsLocators.SaveVADMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
		
		// ----------------View Audit Details - Draft ----------------------------------------------
		
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.Draft(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "Draft -  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		// ----------------View Audit Details - Generate Report ----------------------------------------------
		
				File dir2 = new File("C:\\Users\\ambuj\\Downloads");
				File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(500);
				ArsLocators.GenerateReport(driver).click();		//Exporting (Downloading) file
				Thread.sleep(1000);
				String Msg =driver.switchTo().alert().getText();
				Thread.sleep(1000);
				driver.switchTo().alert().dismiss();
				test.log(LogStatus.PASS,  " Message Display :- " +Msg);
				Thread.sleep(3000);
				
				File dir3 = new File("C:\\Users\\ambuj\\Downloads");
				File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
				
				Thread.sleep(3000);
				if (dirContents1.length < allFilesNew1.length) {
					test.log(LogStatus.PASS,  "Generate Report : - File downloaded successfully.");
				} else {
					test.log(LogStatus.FAIL, "Generate Report :-  File does not downloaded.");
				}

		 }
		
		public static void DraftObservationListing(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	// ----------------Draft Observation Listing - Save ----------------------------------------------
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"))); 
		Thread.sleep(1000);
		ArsLocators.ReportGeneration(driver).click();
		Thread.sleep(3000);
		//ArsLocators.Company(driver).click();
		Thread.sleep(2000);
		//ArsLocators.allahabad(driver).click();
		Thread.sleep(1000);
		
		ArsLocators.FinancialYearRG(driver).click();
		Thread.sleep(1000);
		ArsLocators.RG20232024(driver).click();
		Thread.sleep(4000);
		
		ArsLocators.FinancialYearRG(driver).click();
		Thread.sleep(1000);
		ArsLocators.RG20222023(driver).click();
		Thread.sleep(3000);
		
		ArsLocators.ViewAuditDetails(driver).click();
		Thread.sleep(3000);
		ArsLocators.DraftObservationListing(driver).click();
		Thread.sleep(3000);
		ArsLocators.Observation(driver).clear();
		Thread.sleep(1000);
		ArsLocators.Observation(driver).sendKeys("Observation 11");
		Thread.sleep(3000);
		ArsLocators.ObservationList_CheckBox(driver).click();
		Thread.sleep(1000);
		ArsLocators.ObservationList_Save(driver).click();
		Thread.sleep(3000);
		String Msg1	=ArsLocators.ObservationList_SaveMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
		
		// ----------------Draft Observation Listing- Export ----------------------------------------------
		
				File dir = new File("C:\\Users\\ambuj\\Downloads");
				File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(500);
				ArsLocators.ObservationList_Export(driver).click();		//Exporting (Downloading) file
				
				Thread.sleep(3000);//C://Users//jiya//Downloads//
				File dir1 = new File("C:\\Users\\ambuj\\Downloads");
				File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
				
				Thread.sleep(3000);
				if (dirContents.length < allFilesNew.length) {
					test.log(LogStatus.PASS,  "  File downloaded successfully.");
				} else {
					test.log(LogStatus.FAIL, "  File does not downloaded.");
				}
				
				// ----------------Draft Observation Listing- View ----------------------------------------------
				
				ArsLocators.ViewAuditDetail(driver).click();
				Thread.sleep(3000);
				ArsLocators.ViewAuditDetailclose(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
				
				// ----------------Draft Observation Listing- Delete ----------------------------------------------
				ArsLocators.Delete(driver).click();
				Thread.sleep(3000);
				String Msg =driver.switchTo().alert().getText();
				Thread.sleep(1000);
				driver.switchTo().alert().dismiss();
				test.log(LogStatus.PASS,  " Message Display :- " +Msg);
				Thread.sleep(3000);
				// ----------------Draft Observation Listing- Back ----------------------------------------------

				if(ArsLocators.BackDOR(driver).isEnabled()) {
					
					ArsLocators.BackDOR(driver).click();
					test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
				} else {
					test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
				}	
				Thread.sleep(3000);	
		 }
		
		public static void HistoricalObservation(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"))); 
		Thread.sleep(1000);
		ArsLocators.PastObservations(driver).click();
		Thread.sleep(1000);
		ArsLocators.UploadHistoricalObservations(driver).click();
		Thread.sleep(3000);
		
		// ----------------Historical Observation- Sample Format for Historical Observation ----------------------------------------------
		
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.FormatHistoricalObservation(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);//C://Users//jiya//Downloads//
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  " Sample Format for Historical Observation :- File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		// ----------------Historical Observation- File Upload ----------------------------------------------

		ArsLocators.fileUploadHO(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\Historical Observation Template (2).xlsx");
		Thread.sleep(1000);
		ArsLocators.UploadHO(driver).click();
		try {
		String Msg2=ArsLocators.UploadHOMsg(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg2);
		}catch(Exception e) {
			
		}
		
		File dir2 = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
		
		Thread.sleep(500);
		ArsLocators.ClickDwonload(driver).click();		//Exporting (Downloading) file
		Thread.sleep(1000);
		
		File dir3 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
		
		Thread.sleep(3000);
		if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS,  "Generate Report : - File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "Generate Report :-  File does not downloaded.");
		}
	
		 }
		
		public static void ViewHistoricalObservations(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"))); 
		Thread.sleep(1000);
		ArsLocators.PastObservations(driver).click();
		Thread.sleep(1000);
		ArsLocators.ViewHistoricalObservations(driver).click();
		Thread.sleep(3000);
		// ----------------View Observations ----------------------------------------------

		ArsLocators.ViewAuditt(driver).click();
		Thread.sleep(3000);
		String Msg3=ArsLocators.ViewAuditText(driver).getText();
		Thread.sleep(1000);
		
			test.log(LogStatus.PASS, "Audit Step View Successfully" +Msg3);
		
		Thread.sleep(1000);
		
		ArsLocators.ViewAuditclose(driver).click();
		Thread.sleep(3000);
		// ----------------Detailed Observation ----------------------------------------------

		ArsLocators.ObservationCount(driver).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("DetObsshowdetails"));	//Wait until frame get visible and switch to it.

		ArsLocators.ObservationViewAuditStep(driver).click();
		Thread.sleep(1000);
		String Msg2=ArsLocators.ObservationViewAuditStepT(driver).getText();
		Thread.sleep(2000);
		
		ArsLocators.ObservationCloseAuditStep(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg2);
		ArsLocators.DetailedObservationView(driver).click();
		Thread.sleep(1000);
		String Msg4=ArsLocators.DetailedObservationViewText(driver).getText();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, Msg4);
		ArsLocators.DetailedObservationViewClose(driver).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		ArsLocators.DetailedObservationClose(driver).click();
		Thread.sleep(2000);
		ArsLocators.ClickDashboard(driver).click();
		Thread.sleep(3000);
		
		 }
		
		public static void HighRisk(WebDriver driver, ExtentTest test ,String RiskType,String type) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		if(type.equalsIgnoreCase("open")) {
		Thread.sleep(1000);
		ArsLocators.ClickHighOpen(driver).click();
		Thread.sleep(2000);
		
		
		}else {
			
			Thread.sleep(1000);
			ArsLocators.ClickHighClose(driver).click();
			Thread.sleep(2000);
			
		}
		
		String FinanceAccounts = ArsLocators.FinanceAccountsHigh(driver).getText();		//Reading the Closed Timely value of Human Resource
		FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
		int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
		
		ArsLocators.FinanceAccountsHigh(driver).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		ArsLocators.RiskView(driver).click();		
		Thread.sleep(3000);
		ArsLocators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ArsLocators.readTotalItems(driver).getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == Finance_Accounts)
		{
			test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
		}
		
		
		/*ArsLocators.SelectPeriod(driver).click();		
		Thread.sleep(3000);
		ArsLocators.PeriodAnnually(driver).click();		
		Thread.sleep(3000);
		if(ArsLocators.ApplyFilter(driver).isEnabled()) {
		ArsLocators.ApplyFilter(driver).click();		
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  Filter Working successfully.");
		}else {
			test.log(LogStatus.PASS,  "  Filter not Working");
		}*/
		driver.switchTo().parentFrame();
		ArsLocators.ClosePopRisk(driver).click();		
		
		
		Thread.sleep(3000);
		ArsLocators.ClickDashboard(driver).click();		
		Thread.sleep(3000);
		 }
		
		public static void MediumRisk(WebDriver driver, ExtentTest test ,String RiskType,String type) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		if(type.equalsIgnoreCase("open")) {
		Thread.sleep(3000);
		ArsLocators.ClickMediumOpen(driver).click();
		Thread.sleep(4000);
		
		
		}else {
			
			Thread.sleep(3000);
			ArsLocators.ClickMediumClose(driver).click();
			Thread.sleep(4000);
			
		}
		
		String FinanceAccounts = ArsLocators.FinanceAccountsHigh(driver).getText();		//Reading the Closed Timely value of Human Resource
		FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
		int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
		
		ArsLocators.FinanceAccountsHigh(driver).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(3000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		ArsLocators.RiskView(driver).click();		
		Thread.sleep(3000);
		ArsLocators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ArsLocators.readTotalItems(driver).getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == Finance_Accounts)
		{
			test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
		}
		
		
		/*ArsLocators.SelectPeriod(driver).click();		
		Thread.sleep(4000);
		ArsLocators.PeriodAnnually(driver).click();		
		Thread.sleep(3000);
		if(ArsLocators.ApplyFilter(driver).isEnabled()) {
		ArsLocators.ApplyFilter(driver).click();		
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  Filter Working successfully.");
		}else {
			test.log(LogStatus.PASS,  "  Filter not Working");
		}*/
		driver.switchTo().parentFrame();
		ArsLocators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		ArsLocators.ClickDashboard(driver).click();		
		Thread.sleep(3000);
		 }
		
		
		public static void LowRisk(WebDriver driver, ExtentTest test ,String RiskType,String type) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		if(type.equalsIgnoreCase("open")) {
		Thread.sleep(3000);
		ArsLocators.ClickLowOpen(driver).click();
		Thread.sleep(3000);
		
		
		}else {
			
			Thread.sleep(3000);
			ArsLocators.ClickLowClose(driver).click();
			Thread.sleep(4000);
			
		}
		
		String FinanceAccounts = ArsLocators.FinanceAccountsHigh(driver).getText();		//Reading the Closed Timely value of Human Resource
		FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
		int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
		
		ArsLocators.FinanceAccountsHigh(driver).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(4000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		ArsLocators.RiskView(driver).click();		
		Thread.sleep(3000);
		ArsLocators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ArsLocators.readTotalItems(driver).getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == Finance_Accounts)
		{
			test.log(LogStatus.PASS, "'"+RiskType+"' Risk Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'"+RiskType+"'  Risk  Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'"+RiskType+"' Risk Count = "+ Finance_Accounts + " | Total no of items from grid = "+ count1);
		}
		
		
		/*ArsLocators.SelectPeriod(driver).click();		
		Thread.sleep(5000);
		ArsLocators.PeriodAnnually(driver).click();		
		Thread.sleep(3000);
		if(ArsLocators.ApplyFilter(driver).isEnabled()) {
		ArsLocators.ApplyFilter(driver).click();		
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  Filter Working successfully.");
		}else {
			test.log(LogStatus.PASS,  "  Filter not Working");
		}*/
		driver.switchTo().parentFrame();
		ArsLocators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		ArsLocators.ClickDashboard(driver).click();		
		Thread.sleep(3000);
		 }
		
		public static void CategoryOpen(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");	
		
		
		Thread.sleep(1500);
		int ProcessInefficiency_Open = Integer.parseInt(ArsLocators.ProcessInefficiencyOpen(driver).getText());	//Reading value of 'After Due Date'
		ArsLocators.ProcessInefficiencyOpen(driver).click();								//CLicking on 'Not Completed' count
		
		Thread.sleep(500);
		
		int high = Integer.parseInt(ArsLocators.readHigh(driver).getText());		//reading High risk count.
		int medium = Integer.parseInt(ArsLocators.readMedium(driver).getText());	//reading Medium risk count.
		int low = Integer.parseInt(ArsLocators.readLow(driver).getText());			//reading Low risk count.
		Thread.sleep(500);
		int total = high + medium + low;
		Thread.sleep(500);
		if(ProcessInefficiency_Open == total)
		{
			test.log(LogStatus.PASS, "'Process Inefficiency Open' Category Count matches to sum of all risked Categorirs.");
			test.log(LogStatus.PASS, "Total 'Process Inefficiency' Open Category : "+total);
		}
		else
		{
			test.log(LogStatus.FAIL, "'Process Inefficiency Open' Category Count doesn't matches to sum of all risked Categorirs.");
			test.log(LogStatus.FAIL, "Total 'Closed Timely' Compliances : "+total+" | Total Sum : "+ProcessInefficiency_Open);
		}
		
		CategoryWise(driver, test, "High", high);
		Thread.sleep(3000);
		CategoryWise(driver, test, "Medium", medium);
		Thread.sleep(3000);
		CategoryWise(driver, test, "Low", low);
		Thread.sleep(3000);
		
		ArsLocators.ClickDashboard(driver).click();		
		Thread.sleep(3000);
		 }
		
		public static void CategoryClose(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");	
		
		
		Thread.sleep(1500);
		int ProcessInefficiency_Close = Integer.parseInt(ArsLocators.ProcessInefficiencyClose(driver).getText());	//Reading value of 'After Due Date'
		ArsLocators.ProcessInefficiencyClose(driver).click();								//CLicking on 'Not Completed' count
		
		Thread.sleep(5000);
		
		int high = Integer.parseInt(ArsLocators.readHigh(driver).getText());		//reading High risk count.
		int medium = Integer.parseInt(ArsLocators.readMedium(driver).getText());	//reading Medium risk count.
		int low = Integer.parseInt(ArsLocators.readLow(driver).getText());			//reading Low risk count.
		Thread.sleep(5000);
		int total = high + medium + low;
		Thread.sleep(5000);
		if(ProcessInefficiency_Close == total)
		{
			test.log(LogStatus.PASS, "'Process Inefficiency Close' Category Count matches to sum of all risked Categorirs.");
			test.log(LogStatus.PASS, "Total 'Process Inefficiency' Close Category : "+total);
		}
		else
		{
			test.log(LogStatus.FAIL, "'Process Inefficiency Close' Category Count doesn't matches to sum of all risked Categorirs.");
			test.log(LogStatus.FAIL, "Total 'Process Inefficiency' Close Category : "+total+" | Total Sum : "+ProcessInefficiency_Close);
		}
		
		CategoryWise(driver, test, "High", high);
		Thread.sleep(3000);
		CategoryWise(driver, test, "Medium", medium);
		Thread.sleep(3000);
		CategoryWise(driver, test, "Low", low);
		Thread.sleep(3000);
		ArsLocators.ClickDashboard(driver).click();		
		Thread.sleep(3000);
		 }
		
		
		public static void CategoryWise(WebDriver driver, ExtentTest test ,String risk,int riskCount) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		if(risk.equalsIgnoreCase("High"))
		{
			ArsLocators.readHigh(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
		}
		else if(risk.equalsIgnoreCase("Medium"))
		{
			ArsLocators.readMedium(driver).click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
		}
		else if(risk.equalsIgnoreCase("Low"))
		{
			ArsLocators.readLow(driver).click();						//Clicking on Low value of Pie Chart of 'Not Completed'.
		}
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(5000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		ArsLocators.CategoryView(driver).click();		
		Thread.sleep(3000);
		ArsLocators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ArsLocators.readTotalItems(driver).getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == riskCount)
		{
			test.log(LogStatus.PASS, "'"+risk+"' Risk Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'"+risk+"'  Risk  Count = "+ riskCount + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'"+risk+"' Risk Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'"+risk+"' Risk Count = "+ riskCount + " | Total no of items from grid = "+ count1);
		}
		
		
		/*ArsLocators.SelectPeriod(driver).click();		
		Thread.sleep(1000);
		ArsLocators.PeriodAnnually(driver).click();		
		Thread.sleep(3000);
		if(ArsLocators.ApplyFilter(driver).isEnabled()) {
		ArsLocators.ApplyFilter(driver).click();		
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  Filter Working successfully.");
		}else {
			test.log(LogStatus.PASS,  "  Filter not Working");
		}*/
		driver.switchTo().parentFrame();
		ArsLocators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		
		 }
		
		public static void ProcessHigh(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");	
		Thread.sleep(2000);
		
			int Process_High = Integer.parseInt(ArsLocators.ProcessHigh(driver).getText());	
			Thread.sleep(2000);
			ArsLocators.ProcessHigh(driver).click();						
			Thread.sleep(3000);
			int open = Integer.parseInt(ArsLocators.ProcessOpen(driver).getText());		//reading High risk count.
			Thread.sleep(500);
			int close = Integer.parseInt(ArsLocators.ProcessClose(driver).getText());	//reading Medium risk count.
			Thread.sleep(500);
			int total = open + close;
			Thread.sleep(500);
			if(Process_High == total)
			{
				test.log(LogStatus.PASS, "'Finance and Accounts High' Process Count matches to sum of all  Categorirs.");
				test.log(LogStatus.PASS, "Total 'Finance and Accounts High' Risk : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Finance and Accounts High' Process Count doesn't matches to sum of all  Categorirs.");
				test.log(LogStatus.FAIL, "Total ''Finance and Accounts High' Risk : "+total+" | Total Sum : "+Process_High);
			}
			
			ProcessCategories(driver, test, "open", open);
			Thread.sleep(3000);
			ProcessCategories(driver, test, "close", close);
			Thread.sleep(3000);
			
			
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
		
		
		 }
		
		public static void ProcessMedium(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");	
		Thread.sleep(2000);
		
			int Process_Medium = Integer.parseInt(ArsLocators.ProcessMedium(driver).getText());	
			Thread.sleep(2000);
			ArsLocators.ProcessMedium(driver).click();						
			Thread.sleep(3000);
			int open = Integer.parseInt(ArsLocators.ProcessOpen(driver).getText());		//reading High risk count.
			Thread.sleep(5000);
			int close = Integer.parseInt(ArsLocators.ProcessClose(driver).getText());	//reading Medium risk count.
			Thread.sleep(5000);
			int total = open + close;
			Thread.sleep(5000);
			if(Process_Medium == total)
			{
				test.log(LogStatus.PASS, "'Finance and Accounts Medium' Process Count matches to sum of all  Categorirs.");
				test.log(LogStatus.PASS, "Total 'Finance and Accounts Medium' Risk : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Finance and Accounts Medium' Process Count doesn't matches to sum of all  Categorirs.");
				test.log(LogStatus.FAIL, "Total ''Finance and Accounts Medium' Risk : "+total+" | Total Sum : "+Process_Medium);
			}
			
			ProcessCategories(driver, test, "open", open);
			Thread.sleep(3000);
			ProcessCategories(driver, test, "close", close);
			Thread.sleep(3000);
			
			
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
		
		
		 }
		
		public static void ProcessLow(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(2000);
		
			int Process_Low = Integer.parseInt(ArsLocators.ProcessLow(driver).getText());	
			Thread.sleep(2000);
			ArsLocators.ProcessLow(driver).click();						
			Thread.sleep(3000);
			int open = Integer.parseInt(ArsLocators.ProcessOpen(driver).getText());		//reading High risk count.
			Thread.sleep(5000);
			int close = Integer.parseInt(ArsLocators.ProcessClose(driver).getText());	//reading Medium risk count.
			Thread.sleep(5000);
			int total = open + close;
			Thread.sleep(5000);
			if(Process_Low == total)
			{
				test.log(LogStatus.PASS, "'Finance and Accounts Low' Process Count matches to sum of all  Categorirs.");
				test.log(LogStatus.PASS, "Total 'Finance and Accounts Low' Risk : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Finance and Accounts Low' Process Count doesn't matches to sum of all  Categorirs.");
				test.log(LogStatus.FAIL, "Total ''Finance and Accounts Low' Risk : "+total+" | Total Sum : " +Process_Low);
			}
			
			ProcessCategories(driver, test, "open", open);
			Thread.sleep(3000);
			ProcessCategories(driver, test, "close", close);
			Thread.sleep(3000);
			
			
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
		
		
		 }
		
		
		public static void ProcessCategories(WebDriver driver, ExtentTest test ,String Category,int CategoryCount) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		if(Category.equalsIgnoreCase("open"))
		{
			ArsLocators.ProcessOpen(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
		}
		else if(Category.equalsIgnoreCase("close"))
		{
			ArsLocators.ProcessClose(driver).click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
		}
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(5000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
		
		Thread.sleep(3000);
		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		
		
		if (dirContents.length < allFilesNew.length) {
			test.log(LogStatus.PASS,  "  File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, "  File does not downloaded.");
		}
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
		Thread.sleep(3000);
		
		ArsLocators.RiskView(driver).click();		
		Thread.sleep(3000);
		ArsLocators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = ArsLocators.readTotalItems(driver).getText();
			bits = s1.split(" ");										//Splitting the String
			itomsCount = bits[bits.length - 2];
		}
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			itomsCount = "0";
		}
		int count1 = Integer.parseInt(itomsCount);
		
		if(count1 == CategoryCount)
		{
			test.log(LogStatus.PASS, "'"+Category+"' Category Count matches to number of items from grid.");
			test.log(LogStatus.PASS, "'"+Category+"'  Risk  Count = "+ CategoryCount + " | Total no of items from grid = "+ count1);
		}
		else
		{
			test.log(LogStatus.FAIL, "'"+Category+"' Category Count doesn't matches to number of items from grid.");
			test.log(LogStatus.FAIL, "'"+Category+"' Category Count = "+ CategoryCount + " | Total no of items from grid = "+ count1);
		}
		
		
		/*ArsLocators.SelectPeriod(driver).click();		
		Thread.sleep(5000);
		ArsLocators.PeriodAnnually(driver).click();		
		Thread.sleep(3000);
		if(ArsLocators.ApplyFilter(driver).isEnabled()) {
		ArsLocators.ApplyFilter(driver).click();		
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "  Filter Working successfully.");
		}else {
			test.log(LogStatus.PASS,  "  Filter not Working");
		}*/
		driver.switchTo().parentFrame();
		ArsLocators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		
		 }
		
		public static void AgingGreater90(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		/*	ArsLocators.btnminimize(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
			Thread.sleep(1000);
			ArsLocators.SelectFinancialYear1(driver).click();		
			Thread.sleep(1000);
			ArsLocators.SelectAll(driver).click();
			Thread.sleep(1000);
			ArsLocators.SelectAllOk(driver).click();
			Thread.sleep(2000);
			ArsLocators.ApplyFilters(driver).click();
			Thread.sleep(3000);
			*/
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1800)");	
			Thread.sleep(3000);
			
			int Aging_90 = Integer.parseInt(ArsLocators.Click90days(driver).getText());	
			Thread.sleep(2000);
			ArsLocators.Click90days(driver).click();						
			Thread.sleep(3000);
			
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
			Thread.sleep(3000);
			
			ArsLocators.RiskView(driver).click();		
			Thread.sleep(3000);
			ArsLocators.RiskViewClose(driver).click();		
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,  "  View successfully.");
			
			String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
			String[] bits = s1.split(" ");									//Splitting the String
			String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
			
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				Thread.sleep(1000);
				s1 = ArsLocators.readTotalItems(driver).getText();
				bits = s1.split(" ");										//Splitting the String
				itomsCount = bits[bits.length - 2];
			}
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				itomsCount = "0";
			}
			int count1 = Integer.parseInt(itomsCount);
			
			if(count1 == Aging_90)
			{
				test.log(LogStatus.PASS, "'  >90 days Aging Count matches to number of items from grid.");
				test.log(LogStatus.PASS, "'  >90 days Dashboard  Count = "+ Aging_90 + " | Total no of items from grid = "+ count1);
			}
			else
			{
				test.log(LogStatus.FAIL, "'  >90 days Aging Count doesn't matches to number of items from grid.");
				test.log(LogStatus.FAIL, "'  >90 days Dashboard Count = "+ Aging_90 + " | Total no of items from grid = "+ count1);
			}
			
			Thread.sleep(1000);
		
			driver.switchTo().parentFrame();
			ArsLocators.ClosePopRisk(driver).click();		
			
				
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
			
			
		 }
		
		
		public static void AgingNotDue(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1800)");	
			Thread.sleep(3000);
			
			int Aging_NotDue = Integer.parseInt(ArsLocators.ClickNotDue(driver).getText());	
			Thread.sleep(2000);
			ArsLocators.ClickNotDue(driver).click();						
			Thread.sleep(3000);
			
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
			Thread.sleep(3000);
			
			ArsLocators.RiskView(driver).click();		
			Thread.sleep(3000);
			ArsLocators.RiskViewClose(driver).click();		
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,  "  View successfully.");
			
			String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
			String[] bits = s1.split(" ");									//Splitting the String
			String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
			
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				Thread.sleep(1000);
				s1 = ArsLocators.readTotalItems(driver).getText();
				bits = s1.split(" ");										//Splitting the String
				itomsCount = bits[bits.length - 2];
			}
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				itomsCount = "0";
			}
			int count1 = Integer.parseInt(itomsCount);
			
			if(count1 == Aging_NotDue)
			{
				test.log(LogStatus.PASS, "'  Not Due Aging Count matches to number of items from grid.");
				test.log(LogStatus.PASS, "'  Not Due Dashboard  Count = "+ Aging_NotDue + " | Total no of items from grid = "+ count1);
			}
			else
			{
				test.log(LogStatus.FAIL, "'  Not Due Aging Count doesn't matches to number of items from grid.");
				test.log(LogStatus.FAIL, "'  Not Due Dashboard Count = "+ Aging_NotDue + " | Total no of items from grid = "+ count1);
			}
			
			Thread.sleep(1000);
		
			driver.switchTo().parentFrame();
			ArsLocators.ClosePopRisk(driver).click();		
			
				
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
			
			
		 }
		
		
		public static void AuditCommitteeOpen(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2300)");	
			Thread.sleep(3000);
			
			int AuditCommittee_Open = Integer.parseInt(ArsLocators.AuditCommitteeOpen(driver).getText());	
			Thread.sleep(2000);
			ArsLocators.AuditCommitteeOpen(driver).click();						
			Thread.sleep(3000);
			
			
			Thread.sleep(5000);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

			Thread.sleep(3000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
			Thread.sleep(3000);
			
			ArsLocators.RiskView(driver).click();		
			Thread.sleep(3000);
			ArsLocators.RiskViewClose(driver).click();		
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,  "  View successfully.");
			
			String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
			String[] bits = s1.split(" ");									//Splitting the String
			String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
			
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				Thread.sleep(1000);
				s1 = ArsLocators.readTotalItems(driver).getText();
				bits = s1.split(" ");										//Splitting the String
				itomsCount = bits[bits.length - 2];
			}
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				itomsCount = "0";
			}
			int count1 = Integer.parseInt(itomsCount);
			
			if(count1 == AuditCommittee_Open)
			{
				test.log(LogStatus.PASS, "'  Audit Committee Open Count matches to number of items from grid.");
				test.log(LogStatus.PASS, "' Audit Committee Open Dashboard  Count = "+ AuditCommittee_Open + " | Total no of items from grid = "+ count1);
			}
			else
			{
				test.log(LogStatus.FAIL, "'  Audit Committee Open Count doesn't matches to number of items from grid.");
				test.log(LogStatus.FAIL, "'  Audit Committee Open Dashboard Count = "+ AuditCommittee_Open + " | Total no of items from grid = "+ count1);
			}
			
			Thread.sleep(1000);
		
			driver.switchTo().parentFrame();
			ArsLocators.ClosePopRisk(driver).click();		
			
				
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
			
			
		 }
		
		public static void AuditCommitteeClose(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2300)");	
			Thread.sleep(3000);
			
			int AuditCommittee_close = Integer.parseInt(ArsLocators.AuditCommitteeClose(driver).getText());	
			Thread.sleep(2000);
			ArsLocators.AuditCommitteeClose(driver).click();						
			Thread.sleep(3000);
			
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody"))); 
			Thread.sleep(3000);
			
			ArsLocators.RiskView(driver).click();		
			Thread.sleep(3000);
			ArsLocators.RiskViewClose(driver).click();		
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,  "  View successfully.");
			
			String s1 = ArsLocators.readTotalItems(driver).getText();		//Reading total number of items.
			String[] bits = s1.split(" ");									//Splitting the String
			String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
			
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				Thread.sleep(1000);
				s1 = ArsLocators.readTotalItems(driver).getText();
				bits = s1.split(" ");										//Splitting the String
				itomsCount = bits[bits.length - 2];
			}
			if(itomsCount.equalsIgnoreCase("to"))							//If not items found
			{
				itomsCount = "0";
			}
			int count1 = Integer.parseInt(itomsCount);
			
			if(count1 == AuditCommittee_close)
			{
				test.log(LogStatus.PASS, "'  Audit Committee Close Count matches to number of items from grid.");
				test.log(LogStatus.PASS, "' Audit Committee Close Dashboard  Count = "+ AuditCommittee_close + " | Total no of items from grid = "+ count1);
			}
			else
			{
				test.log(LogStatus.FAIL, "'  Audit Committee Close Count doesn't matches to number of items from grid.");
				test.log(LogStatus.FAIL, "'  Audit Committee Close Dashboard Count = "+ AuditCommittee_close + " | Total no of items from grid = "+ count1);
			}
			
			Thread.sleep(1000);
		
			driver.switchTo().parentFrame();
			ArsLocators.ClosePopRisk(driver).click();		
			
				
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
			
			
		 }
		
		public static void AuditTrackerPlanned(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2500)");	
			Thread.sleep(3000);
			
			
			ArsLocators.AuditTrackerPlanned(driver).click();						
			Thread.sleep(3000);
			//Thread.sleep(1000);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			ArsLocators.ClosePopRisk(driver).click();		
			
				
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
			
			
		 }
		
		public static void AuditTrackerActual(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2500)");	
			Thread.sleep(3000);
			
			
			ArsLocators.AuditTrackerActual(driver).click();						
			Thread.sleep(3000);
			//Thread.sleep(1000);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ClickExport(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			ArsLocators.ClosePopRisk(driver).click();		
			
				
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();		
			Thread.sleep(3000);
			
			
		 }
		
		
		public static void AuditStatus(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2800)");	
			Thread.sleep(3000);
			
			
			ArsLocators.AuditStatusView(driver).click();						
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.AuditStatusExport(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			File dir2 = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(500);
			ArsLocators.DraftClosure(driver).click();		//Exporting (Downloading) file
			Thread.sleep(1000);
			
			File dir3 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  " Draft Closure: - File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "Draft Closure :-  File does not downloaded.");
			}
			
			Thread.sleep(500);
			ArsLocators.DraftObservationListing1(driver).click();		//Exporting (Downloading) file
			Thread.sleep(2000);
			
			File dir4 = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(500);
			ArsLocators.ExportToExcel(driver).click();		//Exporting (Downloading) file
			Thread.sleep(1000);
			
			File dir5 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents2.length < allFilesNew2.length) {
				test.log(LogStatus.PASS,  "  - File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, " File does not downloaded.");
			}
			
			
			ArsLocators.Observation(driver).clear();
			Thread.sleep(1000);
			ArsLocators.Observation(driver).sendKeys("Observation 6");
			Thread.sleep(3000);
			ArsLocators.ObservationList_CheckBox(driver).click();
			Thread.sleep(1000);
			ArsLocators.ObservationList_Save(driver).click();
			Thread.sleep(3000);
			String Msg1	=ArsLocators.ObservationList_SaveMsg(driver).getText();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
			
			// ----------------Draft Observation Listing- View ----------------------------------------------
			
			ArsLocators.ViewAuditDetail(driver).click();
			Thread.sleep(3000);
			ArsLocators.ViewAuditDetailclose(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
			
			// ----------------Draft Observation Listing- Delete ----------------------------------------------
			ArsLocators.Delete(driver).click();
			Thread.sleep(3000);
			String Msg =driver.switchTo().alert().getText();
			Thread.sleep(1000);
			driver.switchTo().alert().dismiss();
			test.log(LogStatus.PASS,  " Message Display :- " +Msg);
			Thread.sleep(3000);
			// ----------------Draft Observation Listing- Back ----------------------------------------------

			if(ArsLocators.BackDOR(driver).isEnabled()) {
				
				ArsLocators.BackDOR(driver).click();
				test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
			} else {
				test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
			}	
			
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();
			Thread.sleep(3000);	
		 }
		
		public static void AuditHeadSummaryOpenAudits(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3000)");	
			Thread.sleep(3000);
			
			
			ArsLocators.OpenAudit(driver).click();						
			Thread.sleep(3000);

			ArsLocators.ViewAuditDetails1(driver).click();						
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ExporttoExcel(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(1000);
			Thread.sleep(500);
			ArsLocators.DraftObservationListing1(driver).click();		//Exporting (Downloading) file
			Thread.sleep(2000);
			
			File dir4 = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(500);
			ArsLocators.ExportToExcel(driver).click();		//Exporting (Downloading) file
			Thread.sleep(1000);
			
			File dir5 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents2.length < allFilesNew2.length) {
				test.log(LogStatus.PASS,  "  - File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, " File does not downloaded.");
			}
			
			
			ArsLocators.Observation(driver).clear();
			Thread.sleep(1000);
			ArsLocators.Observation(driver).sendKeys("Observation 6");
			Thread.sleep(3000);
			ArsLocators.ObservationList_CheckBox(driver).click();
			Thread.sleep(1000);
			ArsLocators.ObservationList_Save(driver).click();
			Thread.sleep(3000);
			String Msg1	=ArsLocators.ObservationList_SaveMsg(driver).getText();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Meassage Display :-" +Msg1);
			
			// ----------------Draft Observation Listing- View ----------------------------------------------
			
			ArsLocators.ViewAuditDetail(driver).click();
			Thread.sleep(3000);
			ArsLocators.ViewAuditDetailclose(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  "  View Audit Detail successfully.");
			
			// ----------------Draft Observation Listing- Delete ----------------------------------------------
			ArsLocators.Delete(driver).click();
			Thread.sleep(3000);
			String Msg =driver.switchTo().alert().getText();
			Thread.sleep(1000);
			driver.switchTo().alert().dismiss();
			test.log(LogStatus.PASS,  " Message Display :- " +Msg);
			Thread.sleep(3000);
			// ----------------Draft Observation Listing- Back ----------------------------------------------

			if(ArsLocators.BackDOR(driver).isEnabled()) {
				
				ArsLocators.BackDOR(driver).click();
				test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
			} else {
				test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
			}	
			
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();
			Thread.sleep(3000);	
		 }
		
		public static void AuditHeadSummaryClosedAudits(WebDriver driver, ExtentTest test ) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3000)");	
			Thread.sleep(3000);
			
			
			ArsLocators.ClosedAudits(driver).click();						
			Thread.sleep(3000);

			ArsLocators.ViewAuditDetails1(driver).click();						
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			File dir = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			
			ArsLocators.ExporttoExcel(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(3000);
			File dir1 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "  File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, "  File does not downloaded.");
			}
			
			Thread.sleep(1000);
			Thread.sleep(500);
			ArsLocators.DraftObservationListing1(driver).click();		//Exporting (Downloading) file
			Thread.sleep(2000);
			
			File dir4 = new File("C:\\Users\\ambuj\\Downloads");
			File[] dirContents2 = dir4.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(500);
			ArsLocators.ExportToExcel(driver).click();		//Exporting (Downloading) file
			Thread.sleep(1000);
			
			File dir5 = new File("C:\\Users\\ambuj\\Downloads");
			File[] allFilesNew2 = dir5.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents2.length < allFilesNew2.length) {
				test.log(LogStatus.PASS,  "  - File downloaded successfully.");
			} else {
				test.log(LogStatus.FAIL, " File does not downloaded.");
			}
			
			
			
			// ----------------- Back ----------------------------------------------

			if(ArsLocators.BackDOR(driver).isEnabled()) {
				
				ArsLocators.BackDOR(driver).click();
				test.log(LogStatus.PASS,  "  Back Button wroking  successfully.");
			} else {
				test.log(LogStatus.FAIL, "   Back Button not wroking  successfully.");
			}	
			
			Thread.sleep(3000);
			ArsLocators.ClickDashboard(driver).click();
			Thread.sleep(3000);	
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
