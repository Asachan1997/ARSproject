package Auditee;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Auditee.Auditeelocator;
import Reviewer.Reviewerlocator;


public class Auditeemethod {
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet1 = null;
	public static WebDriver driver;
	public static Row row=null;
	public static Cell cell=null;
	public static void Login() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambuj\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		  driver=new ChromeDriver();       //Created new Chrome driver instance.
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  fis = new FileInputStream("C://Users//ambuj//Desktop//automation//auditexcelsheet.xlsx");       
			workbook = new XSSFWorkbook(fis);
			sheet1=workbook.getSheetAt(0);
			Row row0 = sheet1.getRow(0);				//Selected 0th index row (First row)  
			Cell c1 = row0.getCell(1);					//Selected cell (0 row,1 column)
			String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
			 driver.get(URL);
			 Row row1 = sheet1.getRow(1);		        //Selected 1st index row (Second row)
				c1 = row1.getCell(1);					//Selected cell (1 row,1 column)
		    String uname = c1.getStringCellValue();	
		    Auditeelocator.setUname(driver).sendKeys(uname);
			Row row2 = sheet1.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
		    Auditeelocator.setPass(driver).sendKeys(password);
		    Auditeelocator.clicksubmit(driver).click();
		    Auditeelocator.clicksequrity(driver).click();
		    Thread.sleep(5000);

		    Auditeelocator.setquestion1(driver).sendKeys("123");
		    Thread.sleep(3000);
		    Auditeelocator.setquestion2(driver).sendKeys("123");
			  Thread.sleep(3000);
			  Auditeelocator.clickbtnvalidate(driver).click();
			  Thread.sleep(3000);
			  Auditeelocator.clickars(driver).click();
			  Thread.sleep(3000);
	}
	///////////////////////////////////////IMPLIMENTATION///////////////////////////////////////////////////
	public static void impCount(ExtentTest test)throws InterruptedException 
	{
		Thread.sleep(9000);
		Auditeelocator.clickfinancialyear(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickselectfinancialyear(driver).click();
		  Thread.sleep(2000);
		  test.log(LogStatus.PASS, " :-Financial year Filter works Successfully.");
          if(Auditeelocator.clickopenimpcount(driver).isEnabled())
         {
             Thread.sleep(2000);
             Auditeelocator.clickopenimpcount(driver).click();
               test.log(LogStatus.PASS, "Open overdue implimentation count is clickable");
          }
        else
        {
  	         test.log(LogStatus.FAIL, "Open overdue implimentation count is not clickable");
        }
		
	}
	 public static void impMyWorkspace(ExtentTest test)throws InterruptedException {
	      Thread.sleep(3000);
	      Auditeelocator.clickcompany(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickselectcompany(driver).click();
		  Thread.sleep(9000);
		  test.log(LogStatus.PASS, " :-Implimentation Observation Filters Work Successfully.");
	      Auditeelocator.clickopenimpobser(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickaudithis(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickaudithisclose(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickauditchangestatus(driver).click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(Auditeelocator.clickimpframe(driver)); // i frame enter krne krne k liye
		  Thread.sleep(7000);
		  Auditeelocator.clickimpmanagere(driver).sendKeys("management response done");
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus1(driver).click();    
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus2(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus3(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus4(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus5(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clicktimelineimp(driver).sendKeys("15-11-2023");
		  Thread.sleep(3000);
		  Auditeelocator.clicksubmitimp(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickclosepopup(driver).click();
		  Thread.sleep(3000);
		  
	 }
	 public static void openupcomingCount(ExtentTest test)throws InterruptedException 
		{
		 Thread.sleep(9000);
		 if(Auditeelocator.openupcomingCount(driver).isEnabled())
         {
             Thread.sleep(2000);
             Auditeelocator.openupcomingCount(driver).click();
               test.log(LogStatus.PASS, "Open upcoming implimentation count is clickable");
          }
        else
        {
  	         test.log(LogStatus.FAIL, "Open upcoming implimentation count is not clickable");
        }
		 //Auditeelocator.clickcompany(driver).click();
		  Thread.sleep(3000);
		 // Auditeelocator.clickselectcompany(driver).click();
		  //Thread.sleep(9000);
		  test.log(LogStatus.PASS, " :-Implimentation Observation Filters Work Successfully.");
	      Auditeelocator.clickopenimpobser(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickaudithis(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickaudithisclose(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickauditchangestatus(driver).click();
		  Thread.sleep(3000);
		  driver.switchTo().frame(Auditeelocator.clickimpframe(driver)); // i frame enter krne krne k liye
		  Thread.sleep(7000);
		  Auditeelocator.clickimpmanagere(driver).sendKeys("management response done");
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus1(driver).click();    
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus2(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus3(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus4(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clickimpstatus5(driver).click();
		  Thread.sleep(3000);
		  Auditeelocator.clicktimelineimp(driver).sendKeys("15-11-2023");
		  Thread.sleep(3000);
		  Auditeelocator.clicksubmitimp(driver).click();
		  Thread.sleep(3000);
		  //driver.switchTo().alert().accept();
		  driver.switchTo().parentFrame();
		  Auditeelocator.clickclosepopup(driver).click();
		  Thread.sleep(3000);
		}
	 
	///////////////////////////////////////AUDIT////////////////////////////////////////////////////////////
	public static void Count(ExtentTest test)throws InterruptedException 
	{
		Thread.sleep(9000);
		Auditeelocator.clickfinancialyear(driver).click();
			  Thread.sleep(3000);
			  Auditeelocator.clickselectfinancialyear(driver).click();
			  Thread.sleep(2000);
			  test.log(LogStatus.PASS, " :-Financial year Filter works Successfully.");
	            if(Auditeelocator.clickopencount(driver).isEnabled())
	           {
	               Thread.sleep(2000);
	               Auditeelocator.clickopencount(driver).click();
	                 test.log(LogStatus.PASS, "Open Audit count is clickable");
	            }
	          else
	          {
	    	         test.log(LogStatus.FAIL, "Open Audit count is not clickable");
	          }
	}
	          public static void MyWorkspace(ExtentTest test)throws InterruptedException {
		      Thread.sleep(3000);
		      Auditeelocator.clickcompany(driver).click();
			  Thread.sleep(3000);
			  Auditeelocator.clickselectcompany(driver).click();
			  Thread.sleep(9000);
			  test.log(LogStatus.PASS, " :-Audit Observation Filters Work Successfully.");
			  //WebDriverWait wait = new WebDriverWait(driver, (40));	
			  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));
			  Auditeelocator.clickcheckbox(driver).click();
			  Thread.sleep(3000);
			  Auditeelocator.clicksave(driver).click();
			  Thread.sleep(5000);
			  test.log(LogStatus.PASS, " :-Audit Steps Submitted Successfully.");
			  Auditeelocator.clickactionbutton(driver).click();
			  Thread.sleep(3000);
			  test.log(LogStatus.PASS, " :-Change Status button works Successfully.");
			  Thread.sleep(3000);
			  Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();   //Scroll code in page
	            Thread.sleep(5000);
		 		Auditeelocator.clickAuditlogview(driver).click();
			  Thread.sleep(3000);
			  test.log(LogStatus.PASS, " :-Uploaded Document Viewed Successfully.");
		      Auditeelocator.clickAuditlogdownload(driver).click();
				  Thread.sleep(3000);
				  test.log(LogStatus.PASS, " :-Uploaded Document Downloaded Successfully.");
			  Auditeelocator.clickmanagement(driver).sendKeys("management update");
			  Thread.sleep(3000);
			  Auditeelocator.clicktimeline(driver).sendKeys("15/07/2023");
			  Thread.sleep(3000);
			  test.log(LogStatus.PASS, " :-Management Response and Timeline updated Successfully.");
			  Auditeelocator.clickreviewremark(driver).sendKeys("remark updated");
			  Thread.sleep(3000);
			  Auditeelocator.clicksaveobservation(driver).click();
			  Thread.sleep(3000);
			  Auditeelocator.clicksubmitbtnn(driver).click();
			  Thread.sleep(3000);
}
	          public static void Prerequsite(ExtentTest test)throws InterruptedException {
			      Thread.sleep(5000);
					Auditeelocator.clickfinancialyear2(driver).click();
						  Thread.sleep(5000);
						  Auditeelocator.clickselectfinancialyear2(driver).click();
						  Thread.sleep(5000);
			      JavascriptExecutor js=(JavascriptExecutor) driver ;
			 		js.executeScript("window.scroll(0,600)");
			 		Thread.sleep(3000);
			 		Auditeelocator.clickopenpre(driver).click();
					  Thread.sleep(5000);
					  test.log(LogStatus.PASS, " :-Open Pre-Requisite Count is Clicable.");
					  Thread.sleep(5000);
					Auditeelocator.clickAuditname(driver).click();
					  Thread.sleep(5000);
					  Auditeelocator.clickselectAuditname(driver).click();
					  Thread.sleep(3000);
					  Auditeelocator.clickprocess(driver).click();
					  Thread.sleep(3000);
					  Auditeelocator.clickselectprocess(driver).click();
					  Thread.sleep(3000);
					  test.log(LogStatus.PASS, " :-Pre-Requisite filter works Successfully.");
					  Auditeelocator.clickviewauditdetails2(driver).click();
					  Thread.sleep(3000);
					  test.log(LogStatus.PASS, " :-Open View Audit Details is Clicable.");
					  Auditeelocator.clickprereqremark(driver).sendKeys("Remarks enter");
					  Thread.sleep(3000);
					  Auditeelocator.clickpresave(driver).click();
					  Thread.sleep(3000);
					  test.log(LogStatus.PASS, " :-Pre-Requisite Save is Clicable.");
					 // Auditeelocator.clickpreclose(driver).click();
					  Thread.sleep(3000);
	          }
					  public static void PrerequsiteSubmitted(ExtentTest test)throws InterruptedException {
					  Thread.sleep(3000);
					  //Auditeelocator.clickmydashboard(driver).click();
					  Thread.sleep(5000);
					  Auditeelocator.clickfinancialyear2(driver).click();
					  Thread.sleep(5000);
					  Auditeelocator.clickselectfinancialyear2(driver).click();
					  Thread.sleep(6000);
		              JavascriptExecutor js1=(JavascriptExecutor) driver ;
		 		      js1.executeScript("window.scroll(0,600)");
		 		      Thread.sleep(5000);
		 		     Auditeelocator.clicksubmittedcount(driver).click();
					  Thread.sleep(5000);
					  test.log(LogStatus.PASS, " :-Submitted Pre-Requisite Count is Clicable.");
					  Thread.sleep(5000);
					  Auditeelocator.clickAuditname1(driver).click();
					  Thread.sleep(5000);
					  Auditeelocator.clickselectAuditname1(driver).click();
					  Thread.sleep(3000);
					  Auditeelocator.clickprocess1(driver).click();
					  Thread.sleep(3000);
					  Auditeelocator.clickselectprocess1(driver).click();
					  Thread.sleep(3000);
					  test.log(LogStatus.PASS, " :-Pre-Requisite Submitted filter works Successfully.");
					  Auditeelocator.clickdownloaddocument(driver).click();
					  Thread.sleep(3000);
					  test.log(LogStatus.PASS, " :-Pre-Requisite Submitted Document Download Successfully.");
}
					  public static void PrerequsiteRejected(ExtentTest test)throws InterruptedException {
						  Thread.sleep(3000);
						  Auditeelocator.clickmydashboard(driver).click();
						  Thread.sleep(5000);
						  Auditeelocator.clickfinancialyear2(driver).click();
						  Thread.sleep(5000);
						  Auditeelocator.clickselectfinancialyear2(driver).click();
						  Thread.sleep(6000);
			              JavascriptExecutor js1=(JavascriptExecutor) driver ;
			 		      js1.executeScript("window.scroll(0,600)");
			 		      Thread.sleep(5000);
			 		     Auditeelocator.clickrejectedcount(driver).click();
						  Thread.sleep(5000);
						  test.log(LogStatus.PASS, " :-Rejected Pre-Requisite Count is Clicable.");
						  Thread.sleep(5000);
						  Auditeelocator.clickAuditname2(driver).click();
						  Thread.sleep(5000);
						  Auditeelocator.clickselectAuditname2(driver).click();
						  Thread.sleep(3000);
						  Auditeelocator.clickprocess2(driver).click();
						  Thread.sleep(3000);
						  Auditeelocator.clickselectprocess2(driver).click();
						  Thread.sleep(3000);
						  test.log(LogStatus.PASS, " :-Pre-Requisite Rejected filter works Successfully.");
						  Auditeelocator.clickdocumentdownload2(driver).click();
						  Thread.sleep(3000);
						  test.log(LogStatus.PASS, " :-Pre-Requisite Rejected Document Download Successfully.");
						  Auditeelocator.clickviewauditdetailspre(driver).click();
						  Thread.sleep(3000);
						  test.log(LogStatus.PASS, " :-Pre-Requisite Rejected view audit details button work Successfully.");
						  Auditeelocator.clickenterremarks(driver).sendKeys("remarks");
						  Thread.sleep(3000);
						  //Auditeelocator.clickselctfile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\Customer BranchList (50).xlsx");
						  Thread.sleep(3000);
						  Auditeelocator.clicksaveaudit(driver).click();
						  Thread.sleep(3000);
						  
					  }
}