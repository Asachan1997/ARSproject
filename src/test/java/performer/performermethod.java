package Performer;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Reviewer.Reviewerlocator;



public class Performermethod {
	//private static final org.openqa.selenium.chrome.ChromeOptions new = null;
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet1 = null;
	public static WebDriver driver;
	public static Row row=null;
	public static Cell cell=null;
	public static void Login() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambuj\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		  driver=new ChromeDriver();       //Created new Chrome driver instance.
		  Thread.sleep(7000);
		  driver.manage().window().maximize();
		  fis = new FileInputStream("C:\\Audit\\AuditProject\\TestData//performer.xlsx");
		  
			workbook = new XSSFWorkbook(fis);
			sheet1=workbook.getSheetAt(0);
			Row row0 = sheet1.getRow(0);				//Selected 0th index row (First row)  
			Cell c1 = row0.getCell(1);					//Selected cell (0 row,1 column)
			String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
			 driver.get(URL);
			 Row row1 = sheet1.getRow(1);		        //Selected 1st index row (Second row)
				c1 = row1.getCell(1);					//Selected cell (1 row,1 column)
		    String uname = c1.getStringCellValue();	
		    Performerlocator.setUname(driver).sendKeys(uname);
			Row row2 = sheet1.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
		    Performerlocator.setPass(driver).sendKeys(password);
		    Performerlocator.clicksubmit(driver).click();
		    Performerlocator.clicksequrity(driver).click();
		    Thread.sleep(7000);
		    
		    Performerlocator.setquestion1(driver).sendKeys("123");
		    Thread.sleep(7000);
		    Performerlocator.setquestion2(driver).sendKeys("123");
			  Thread.sleep(7000);
			  Performerlocator.clickbtnvalidate(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickars(driver).click();
			  Thread.sleep(7000);
	}
	/////////////////////IMPLEMENTATION//////////////////////////////////////////
	/*WebElement table = driver.findElement(By.xpath("//table[@id='grdSummaryDetailsAuditCoverage']"));
    List<WebElement> rows = table.findElements(By.tagName("tr"));

    int Row_Count = rows.size();
    		
    int length_Row = Row_Count-1;
    
    System.out.println(open + "  " + length_Row );*/
	
	public static void implementationCount(ExtentTest test)throws InterruptedException 
	{
		Thread.sleep(7000);
		 Performerlocator.clickfinancialyear1(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickselectfinancialyear1(driver).click();
			  Thread.sleep(2000);
	            if(Performerlocator.clickopenimplementationcount(driver).isEnabled())
	           {
	               Thread.sleep(2000);
	                 Performerlocator.clickopenimplementationcount(driver).click();
	                 test.log(LogStatus.PASS, "Open Implementation count is clickable");
	            }
	          else
	          {
	    	         test.log(LogStatus.FAIL, "Open Implementation count is not clickable");
	          }
	           
	            Thread.sleep(7000);
	}
	public static void MyImplementationWorkspace(ExtentTest test)throws InterruptedException {
		Thread.sleep(5000);
		      
			  Performerlocator.clickimplcompany(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickimplselectcompany(driver).click();
			  Thread.sleep(9000);
			  //WebDriverWait wait = new WebDriverWait(driver, (40));	
			 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));	//Wait until records table get visible.
			  Performerlocator.clicknewmail11(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clicknewmail1(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickto(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickselectto(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clicksendmail(driver).click();
			  Thread.sleep(7000);
			    // Switching to Alert        
		        Alert alert1 = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage1= driver.switchTo().alert().getText();	
		        
		        
		        test.log(LogStatus.PASS, alertMessage1);
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage1);
		        
		     // Accepting alert		
		        alert1.accept();
				
			  Performerlocator.clickcross1(driver).click();
			  Thread.sleep(7000);

			  
			  Performerlocator.clicksubmitcount(driver).click();
			 Thread.sleep(7000);
			 
			 Performerlocator.clickaudithistory(driver).click();
			 Thread.sleep(7000);
			 test.log(LogStatus.PASS, " :- Audit history Popup open successfully.");
			 Performerlocator.clickaudithistoryclose(driver).click();
			 Thread.sleep(7000);
			 test.log(LogStatus.PASS, " :- Audit history Popup Close successfully.");
			 Performerlocator.clickauditchangestatus(driver).click();
			 Thread.sleep(7000);
			 driver.switchTo().frame(Performerlocator.clickframe(driver)); // i frame enter krne krne k liye
			  Thread.sleep(7000);
			 Performerlocator.clickdownloadfinal(driver).click();
			 Thread.sleep(7000);
			 test.log(LogStatus.PASS, " :- File Download Successfully.");
			 Performerlocator.clickenterremark(driver).sendKeys("enter the remark mandatory");
			 Thread.sleep(7000);
			 Performerlocator.clickreviewhistory(driver).click();
			  Thread.sleep(7000);
			  test.log(LogStatus.PASS, " :- Next Button work successfully Successfully.");
			  Performerlocator.clickreviewremarkimp(driver).sendKeys("enter the review remark mandatory");
			  Thread.sleep(7000);
			  Performerlocator.clickselectstatus(driver).click();
			Thread.sleep(7000);
			 Performerlocator.clickselectstatus2(driver).click();
			Thread.sleep(7000);
			Performerlocator.clicksubmitbutton(driver).click();
			Thread.sleep(7000);
			test.log(LogStatus.PASS, " :- Audit Step Submitted Successfully.");
			Performerlocator.clickclosepopup(driver).click();
			Thread.sleep(7000);
			Performerlocator.clickbackbuttonimp(driver).click();
			Thread.sleep(7000);
	}
	

	/////////////////////////AUDIT//////////////////////////////////////////////
	public static void Count(ExtentTest test)throws InterruptedException 
	{
		Thread.sleep(7000);
		 Performerlocator.clickfinancialyear(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickselectfinancialyear(driver).click();
			  Thread.sleep(2000);
	            if(Performerlocator.clickopencount(driver).isEnabled())
	           {
	               Thread.sleep(2000);
	                 Performerlocator.clickopencount(driver).click();
	                 test.log(LogStatus.PASS, "Open Audit count is clickable");
	            }
	          else
	          {
	    	         test.log(LogStatus.FAIL, "Open Audit count is not clickable");
	          }
	           
	            Thread.sleep(7000);
			//	  Performerlocator.clickDashboard(driver).click();
				  
	}
	public static void MyWorkspace(ExtentTest test)throws InterruptedException {
		Thread.sleep(5000);
			  Performerlocator.clickcompany(driver).click();
			  Thread.sleep(7000);
			  //Performerlocator.clickselectcompany(driver).click();
			  //Thread.sleep(9000);
			  WebDriverWait wait = new WebDriverWait(driver, (40));	
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));	//Wait until records table get visible.
			 // Performerlocator.clicksubunit(driver).click();
			 // Thread.sleep(7000);
			 // Performerlocator.clickselectsubunit(driver).click();
			  //Thread.sleep(7000);
			  Performerlocator.clickviewauditdetails(driver).click();
			  Thread.sleep(7000);
			//  if (dirContents1.length < allFilesNew1.length) {
					test.log(LogStatus.PASS, " :- View Popup open successfully.");
			  Performerlocator.clickexporttoexcel(driver).click();
			  Thread.sleep(7000);
			  test.log(LogStatus.PASS, " :- Excel file downloadded successfully.");
			  Performerlocator.clickdraftobservation(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickprocess(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickselectprocess(driver).click();
			  Thread.sleep(7000);
			Performerlocator.ObservationList_CheckBox(driver).click();
				Thread.sleep(2000);
				Performerlocator.ObservationList_Save(driver).click();
				Thread.sleep(7000);
				String messge=Performerlocator.ObservationList_SaveMsg(driver).getText();
				if(messge.equalsIgnoreCase("Observation updated successfully.")) 
				{
					test.log(LogStatus.PASS, "Draft Observation update :-"+messge);
				}
				else
				{
					test.log(LogStatus.FAIL, "Observation not updated successfully.");
				}
			//Performerlocator.clickremoveobservation(driver).click();
			//Thread.sleep(7000);	
			//  ((TargetLocator) Performerlocator.clickremoveobservation(driver)).alert().accept();
			 //driver.switchTo().alert().accept();
			  Performerlocator.clickbackbtn(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clicknotdone(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickaddnew(driver).click();
			  Thread.sleep(7000);
			  driver.switchTo().frame(Performerlocator.clickauditstepframe(driver));
		      Performerlocator.clickauditstep(driver).sendKeys("Audit Step successfull1 ");
			  Thread.sleep(7000);
			  Performerlocator.clickauditmethodology(driver).sendKeys("Audit Methodology importnt iqqn");
			  Thread.sleep(7000);
			  Performerlocator.clicksaveaddnew(driver).click();
			  Thread.sleep(7000);
			  String messge11=Performerlocator.clickmessageaddnew(driver).getText();
				if(messge11.equalsIgnoreCase("Audit Step Save Sucessfully.")) 
				{
					test.log(LogStatus.PASS, "Audit Step Save Sucessfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Audit Step Save not Sucessfully..");
				}
				driver.switchTo().parentFrame();            // i frame out
			  Performerlocator.clickcross2(driver).click();
			  Thread.sleep(7000);
			 Performerlocator.clickcheckbox(driver).click();
			 Thread.sleep(7000);
			  Performerlocator.clickchecksave(driver).click();
			  Thread.sleep(7000);
			  String messge12=Performerlocator.clickmessagesave1(driver).getText();
				if(messge12.equalsIgnoreCase("Audit Step Save Sucessfully.")) //change krna hai
				{
					test.log(LogStatus.PASS, "Audit Step Save Sucessfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Audit Step Save not Sucessfully..");
				}
				driver.switchTo().parentFrame();
			 // Performerlocator.clickclose2(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickbackbutton(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clicknewmail11(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clicknewmail1(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickto(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickselectto(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clicksendmail(driver).click();
			  Thread.sleep(7000);
			    // Switching to Alert        
		        Alert alert1 = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage1= driver.switchTo().alert().getText();	
		        
		        
		        test.log(LogStatus.PASS, alertMessage1);
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage1);
		        
		     // Accepting alert		
		        alert1.accept();
				
			  Performerlocator.clickcross1(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickbckbtn(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickinternal(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickinternalmail(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickto1(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clickselectto1(driver).click();
			  Thread.sleep(7000);
			  Performerlocator.clicksendmail1(driver).click();
			  Thread.sleep(7000);
			// Switching to Alert        
		        Alert alert2 = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage2= driver.switchTo().alert().getText();	
		        
		        
		        test.log(LogStatus.PASS, alertMessage1);
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage1);
		        
		     // Accepting alert		
		        alert1.accept();
			  Performerlocator.clickcross2(driver).click();
			  Thread.sleep(7000);
	}
				  public static void MyWorkspace1(ExtentTest test)throws InterruptedException {
					  Performerlocator.clickcompany(driver).click();
					  Thread.sleep(3000);
					  WebDriverWait wait = new WebDriverWait(driver, (40));	
					  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));
					  Performerlocator.clickselectcompany(driver).click();
					  Thread.sleep(9000);
					  test.log(LogStatus.PASS, " :- Filters works Successfully.");
					  Performerlocator.clickviewdatarequest(driver).click();
					  Thread.sleep(9000);
					  WebDriverWait wait1 = new WebDriverWait(driver, 50);
					  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("Preshowdetails"));
					  Performerlocator.clickauditee(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clickselectauditee(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clickreportingmanager(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clickselectreportingmanager(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clicktimeline(driver).sendKeys("12-06-2023");
					  Thread.sleep(7000);
					  test.log(LogStatus.PASS, " :- View data Request Filters works Successfully.");
					  Performerlocator.clicksaveviewdata(driver).click();
					  Thread.sleep(9000);
					  String messge12=Performerlocator.clickdata(driver).getText();
						if(messge12.equalsIgnoreCase("Save Sucessfully.")); 
						{
							test.log(LogStatus.PASS, "Save Sucessfully.");
					  Performerlocator.clickadddatarequest(driver).click();
					  Thread.sleep(9000);
					  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframePreRequisite"));
					  Performerlocator.clickadddatarequestfilter(driver).click();
					  Thread.sleep(9000);
					  test.log(LogStatus.PASS, " :- Add Data Request Filters works Successfully.");
					  Performerlocator.clickselectallcheckbox(driver).click();
					  Thread.sleep(7000);
					  test.log(LogStatus.PASS, "Checkbox work Sucessfully.");
					  Performerlocator.clickokbutton(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickadddocument(driver).click();
					  Thread.sleep(5000);
					  
					 // Performerlocator.clickprocess1(driver).click();
					  //Thread.sleep(7000);
					  Performerlocator.clickadd(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickdelete(driver).click();
					  Thread.sleep(7000);
					  test.log(LogStatus.PASS, "Pre Requisite Document deleted Sucessfully.");
					  Performerlocator.clickdocumentrequired(driver).sendKeys("new document");
					  Thread.sleep(7000);
					  Performerlocator.clickdocumentsave(driver).click();
					  Thread.sleep(7000);
					  String messge13=Performerlocator.clickmessagesave1(driver).getText();
						if(messge13.equalsIgnoreCase("Record Saved Successfully."));
						{
							test.log(LogStatus.PASS, "Record Saved Successfully.");
					  Performerlocator.clickdocumentclose(driver).click();
					  Thread.sleep(7000);
					  driver.switchTo().parentFrame();
					  Performerlocator.clickprerequisiteclose(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickaddnewuser(driver).click();
					  Thread.sleep(7000);
					  driver.switchTo().frame(Performerlocator.clickframe1(driver));
					  Performerlocator.clickfirstname(driver).sendKeys("sahini");
					  Thread.sleep(7000);
					  Performerlocator.clicklastname(driver).sendKeys("singh");
					  Thread.sleep(7000);
					  Performerlocator.clickDesignation(driver).sendKeys("HR");
					  Thread.sleep(7000);
					  Performerlocator.clickEmail(driver).sendKeys("shanii.871@gmail.com");
					  Thread.sleep(7000);
					  Performerlocator.clickcontactno(driver).sendKeys("8899889977");
					  Thread.sleep(7000);
					  Performerlocator.clicknewusersave(driver).click();
					  Thread.sleep(7000);
					  ///Performerlocator.clicktimeline(driver).sendKeys("12-06-2023");
					 
					  String messge14=Performerlocator.clicknewusersavemessage(driver).getText();
						if(messge14.equalsIgnoreCase("User Created Successfully.")) //change krna hai
						{
							test.log(LogStatus.PASS, "User Created Successfully.");
						}
						else
						{
							test.log(LogStatus.FAIL, "User Already Exist.");
						}
						Performerlocator.clicknewuserclose(driver).click();
						  Thread.sleep(7000);
					  driver.switchTo().parentFrame();
			          Thread.sleep(7000);
			          Performerlocator.clickforcemail2(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clicknewmail2(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clickto2(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clickselectto2(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clicksendmail2(driver).click();
					  Thread.sleep(9000);
					  Alert alert3 = driver.switchTo().alert();	
					  String alertMessage3= driver.switchTo().alert().getText();	
					  test.log(LogStatus.PASS, alertMessage3);
					  System.out.println(alertMessage3);	
					  alert3.accept();
					  Performerlocator.clickcross3(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clickviewremark(driver).click();
					  Thread.sleep(7000);
					  test.log(LogStatus.PASS, " :- Remark Viewed Successfully.");
					  Performerlocator.clickviewremarkclose(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickadddocument1(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickadddocumentname(driver).sendKeys("Review Document new1");
					  Thread.sleep(7000);
					  Performerlocator.clickadddocumentsave(driver).click();
					  Thread.sleep(7000);
					  //Performerlocator.clickadddocumentsavemessage(driver).click();
					  Thread.sleep(7000);
					  String messge141=Performerlocator.clickadddocumentsavemessage(driver).getText();
						if(messge141.equalsIgnoreCase("Document Name Added Successfully.")) //change krna hai
						{
							test.log(LogStatus.PASS, "Document Name Added Successfully.");
						}
						else
						{
							test.log(LogStatus.FAIL, "Document Name Not Added Successfully.");
						}
					  Performerlocator.clickadddocumentlose1(driver).click();
					  Thread.sleep(7000);
					  driver.switchTo().parentFrame();
					  Performerlocator.clickadddocumentlose2(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickviewauditdetails1(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clicknotdone1(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clickchangestatus1(driver).click();
					  Thread.sleep(9000);
					  //Performerlocator.clickframe(driver).click();
					  driver.switchTo().frame(Performerlocator.clickframe(driver)); // i frame enter krne krne k liye
					  Thread.sleep(7000);
					  Performerlocator.clicknext(driver).click();
					  
					  Thread.sleep(7000);
					  Performerlocator.clickprocesswalkthrough(driver).clear();	  
			  Performerlocator.clickprocesswalkthrough(driver).sendKeys("processwalkthrough");
			    Thread.sleep(7000);
			    Performerlocator.clickactualwdone(driver).clear();
			    Performerlocator.clickactualwdone(driver).sendKeys("Actula work done");
			    Thread.sleep(7000);
			    Performerlocator.clickpopulation(driver).clear();
			    Performerlocator.clickpopulation(driver).sendKeys("population");
			    Thread.sleep(7000);
			    Performerlocator.clicksample(driver).clear();
			    Performerlocator.clicksample(driver).sendKeys("sample");
			    Thread.sleep(7000);
			    Performerlocator.clickremark(driver).clear();
			    Performerlocator.clickremark(driver).sendKeys("remark");
			    Thread.sleep(7000);
			    JavascriptExecutor js=(JavascriptExecutor) driver ;
		 		js.executeScript("window.scroll(0,900)");
		 		Thread.sleep(7000);
			   //Performerlocator.clickworkingfile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\Customer BranchList (27).xlsx");
			    //Thread.sleep(7000);
		 		 Performerlocator.clicknextbtn(driver).click();
				  Thread.sleep(7000);  
				  Performerlocator.clickobservationtitle(driver).clear();
				  Performerlocator.clickobservationtitle(driver).sendKeys("observationtitle");
				    Thread.sleep(7000);
				    Performerlocator.clickobservation(driver).clear(); 
				    Performerlocator.clickobservation(driver).sendKeys("Observation");
				    Thread.sleep(7000);
				    Performerlocator.clickbriefobservation(driver).clear();
				    Performerlocator.clickbriefobservation(driver).sendKeys("detailed obsrvation");
				    Thread.sleep(7000);
				    Performerlocator.clickAnnexureTitle(driver).clear();
				    Performerlocator.clickAnnexureTitle(driver).sendKeys("welcome");
				    Thread.sleep(7000);
				    Performerlocator.clickaudiolink(driver).clear();
				    Performerlocator.clickaudiolink(driver).sendKeys("www.w3school.com");
				    Thread.sleep(7000);
				    Performerlocator.clickbusinessrisk(driver).clear();
				    Performerlocator.clickbusinessrisk(driver).sendKeys("simple");
				    Thread.sleep(7000);
				    Performerlocator.clickrootcause(driver).clear();
				    Performerlocator.clickrootcause(driver).sendKeys("root cause");
				    Thread.sleep(7000);
				    Performerlocator.clickfinancialimpact(driver).clear();
				    Performerlocator.clickfinancialimpact(driver).sendKeys("123");
				    Thread.sleep(7000);
				    Performerlocator.clickriskrating(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickselectriskrating(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickobservationcategory(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickselectobservationcategory(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickrecommendationtype(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickselectrecommendationtype(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickrecommendation(driver).clear();
					  Performerlocator.clickrecommendation(driver).sendKeys("recommendation");
					    Thread.sleep(7000);
					    Performerlocator.clickmanagementresponse(driver).clear();
					  Performerlocator.clickmanagementresponse(driver).sendKeys("Management Response");
					  Thread.sleep(7000);
					  Performerlocator.clickpersonresponsible(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickselectpersonresponsible(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickownername(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clickselectownername(driver).click();
					  Thread.sleep(7000);
					  Performerlocator.clicksaverecommendation(driver).click();
					  Thread.sleep(7000);
					 
					 // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));
					  Performerlocator.clickrecommendationok(driver).click();
					 Thread.sleep(7000);
					  By locator = By.linkText("ok");
					  By locator1 = By.xpath("//button[@class='k-button k-primary']");
						//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
						Thread.sleep(4000);
						
						//WebElement ViewButton = driver.findElement(locator);	
						//Thread.sleep(7000);
				//	JavascriptExecutor jse=(JavascriptExecutor)driver;
					//jse.executeScript("arguments[0].click();", ViewButton();
					  /*Performerlocator.clicksaveobservation(driver).click();
					  Thread.sleep(7000);
					  driver.switchTo().parentFrame();
					  Performerlocator.clickobservationok(driver).click();
					  Thread.sleep(7000);
					  
					  Performerlocator.clickhistorylog(driver).click();
					  Thread.sleep(7000);
					 // Performerlocator.clickreviewremark(driver).click();
					  //Thread.sleep(7000);
					  Performerlocator.clicksubmitbtn(driver).click();
					  Thread.sleep(7000);*/
						
					  driver.switchTo().parentFrame();
					  Performerlocator.clickclose2(driver).click();
					  Thread.sleep(7000);
					  
				  }}}
				  
					  
					  public static void mydocument(ExtentTest test)throws InterruptedException 
					  {
                          Thread.sleep(2000);
						  Performerlocator.clickmydocument(driver).click();
						  Thread.sleep(2000);
						  Performerlocator.clickmydocumentfilter(driver).click();
						  Thread.sleep(9000);
						  Performerlocator.clickmydocumentselectfilter(driver).click();
						  Thread.sleep(9000);
						  Performerlocator.clickmydocumentfinancialyear(driver).click();
						  Thread.sleep(9000);
						  Performerlocator.clickmydocumentselectfinancialyear(driver).click();
						  Thread.sleep(9000);
						  test.log(LogStatus.PASS, "Document Filter Work Successfully");
						   //if(Performerlocator.clickmydocumentdownload(driver).isEnabled())
				           // {
				               //  Thread.sleep(9000);
				                // Performerlocator.clickmydocumentdownload(driver).click();
				                 test.log(LogStatus.PASS, "Working Document Downloaded");
				            //}
				         // else
				         // {
				    	 //        test.log(LogStatus.FAIL, "Document not Dowmloaded");
				    	        
				         // }
						   Thread.sleep(8000);
						   Performerlocator.clickmydocumentclick1(driver).click();
							  Thread.sleep(9000);
						   Performerlocator.clickmydocumentreview(driver).click();
							  Thread.sleep(9000);
						   if(Performerlocator.clickmyreviewdocumentdownload(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Performerlocator.clickmyreviewdocumentdownload(driver).click();
				                 test.log(LogStatus.PASS, "Review Document Downloaded");
				            }
				          else
				          {
				    	         test.log(LogStatus.FAIL, "Review Document not Dowmloaded");
				    	        
				          }
					  
					  Thread.sleep(8000);
					  Performerlocator.clickmydocumentclick2(driver).click();
					  Thread.sleep(9000);
				   Performerlocator.clickmydocumentannexure(driver).click();
					  Thread.sleep(9000);
				   if(Performerlocator.clickmyannexuredocumentdownload(driver).isEnabled())
		            {
		                 Thread.sleep(2000);
		                 Performerlocator.clickmyannexuredocumentdownload(driver).click();
		                 test.log(LogStatus.PASS, "annexure Document Downloaded");
		            }
		          else
		          {
		    	         test.log(LogStatus.FAIL, "annexure Document not Dowmloaded");
		    	        
		          }
					  Thread.sleep(8000);
					  Performerlocator.clickmydocumentclick3(driver).click();
					  Thread.sleep(9000);
				   Performerlocator.clickmydocumentFinaldeliverable(driver).click();
					  Thread.sleep(9000);
				   if(Performerlocator.clickmyFinaldeliverabledocumentdownload(driver).isEnabled())
		            {
		                 Thread.sleep(2000);
		                 Performerlocator.clickmyFinaldeliverabledocumentdownload(driver).click();
		                 test.log(LogStatus.PASS, "Finaldeliverable Document Downloaded");
		            }
		          else
		          {
		    	         test.log(LogStatus.FAIL, "Finaldeliverable Document not Dowmloaded");     
		          }
			  
					  
					  Thread.sleep(8000);
					  Performerlocator.clickmydocumentclick4(driver).click();
					  Thread.sleep(9000);
				   Performerlocator.clickmydocumentFeedback(driver).click();
					  Thread.sleep(9000);
				   if(Performerlocator.clickmydocumentFeedbackdownload(driver).isEnabled())
		            {
		                 Thread.sleep(2000);
		                 Performerlocator.clickmyFinaldeliverabledocumentdownload(driver).click();
		                 test.log(LogStatus.PASS, "Feedback Document Downloaded");
		            }
		          else
		          {
		    	         test.log(LogStatus.FAIL, "Feedback Document not Dowmloaded");     
		          }
			  
					 
					  Performerlocator.clickmydocumentDeleted(driver).click();
					  Thread.sleep(9000);
				   if(Performerlocator.clickmydocumentDeleteddownload(driver).isEnabled())
		            {
		                 Thread.sleep(2000);
		                 Performerlocator.clickmydocumentDeleteddownload(driver).click();
		                 test.log(LogStatus.PASS, "Deleted Document Downloaded");
		            }
		          else
		          {
		    	         test.log(LogStatus.FAIL, "Deleted Document not Dowmloaded");     
		          }
					  }		  
				            public static void myreport(ExtentTest test)throws InterruptedException 
							  {
		                          Thread.sleep(2000);
		                          Performerlocator.clickmyreport(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickmyreportfilter(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickmyreportselectfilter(driver).click();
								  Thread.sleep(9000);
								  test.log(LogStatus.PASS, "Report Filter work successfully.");
								//  Performerlocator.clickmydocumentdownload(driver).click();
								//  Thread.sleep(7000);
								  //test.log(LogStatus.PASS, "Audit Status Report Downloaded");
						 Performerlocator.clickmore(driver).click();
								  Thread.sleep(9000);
								  Performerlocator.clickauditstatus(driver).click();
								  Thread.sleep(7000);
								  if(Performerlocator.clickexportexcel(driver).isEnabled())
						            {
						                 Thread.sleep(2000);
						                 Performerlocator.clickexportexcel(driver).click();
						                 test.log(LogStatus.PASS, "Audit Status Report Downloaded");
						           
								  //Performerlocator.clickexportexcel(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickmore1(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickopenobservation(driver).click();
								  Thread.sleep(7000);
								  if(Performerlocator.clickdownloadopenobservation(driver).isEnabled())
						            {
						                 Thread.sleep(2000);
						                 Performerlocator.clickdownloadopenobservation(driver).click();
						                 test.log(LogStatus.PASS, "open observation Report Downloaded");
								  Performerlocator.clickdownloadopenobservation(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickmore3(driver).click();
								  Thread.sleep(7000);
								 Performerlocator.clickprerequsite(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickentity(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickselectentity(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clicksubentity(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickselectsubentity(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickyear(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickselectyear(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickschedulingtype(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickselectschedulingtype(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickperiod(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickselectperiod(driver).click();
								  Thread.sleep(7000);
								  test.log(LogStatus.PASS, "Filters Work Successfully.");
								  //Performerlocator.clickprerequsiteexcelexport(driver).click();
								  Thread.sleep(7000);
								  if(Performerlocator.clickprerequsiteexcelexport(driver).isEnabled())
						            {
						                 Thread.sleep(7000);
						                 Performerlocator.clickprerequsiteexcelexport(driver).click();
						                 test.log(LogStatus.PASS, "Pre-requisite report Downloaded Successfully.");
								 
								  Performerlocator.clickmore2(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickmore22(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickmore12(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickpastauditreport(driver).click();
								  Thread.sleep(7000);
								//  Performerlocator.clickpastauditviewreport(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickaddnewpastaudit(driver).click();
								  Thread.sleep(7000);
								  driver.switchTo().frame(Performerlocator.clickaddnewpastauditframe(driver));// i frame enter 
								 Performerlocator.clickaddnewunit(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickaddnewselectunit(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickaddnewsubunit(driver).click();
								  Thread.sleep(7000);
								 Performerlocator.clickaddnewselectsubunit(driver).click();
								  Thread.sleep(7000);
								 Performerlocator.clickaddnewfinancialyear(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickaddnewselectfinancialyear(driver).click();
								  Thread.sleep(7000);
								Performerlocator.clickaddnewauditbackground(driver).click();
								  Thread.sleep(7000);
								 Performerlocator.clickaddnewauditselectbackground(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickaddnewaudituploadfile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\AuditStatusSummary (1).xlsx");
								  Thread.sleep(7000);
								  //Performerlocator.clickaddnewauditsave(driver).click();
								  //Thread.sleep(7000);
								  if(Performerlocator.clickaddnewauditsave(driver).isEnabled())
						            {
						                 Thread.sleep(2000);
						                 Performerlocator.clickaddnewauditsave(driver).click();
						                 test.log(LogStatus.PASS, "Record Uploaded Successfully.");
								  Performerlocator.clickaddnewauditclose(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickpastauditview(driver).click();
								  Thread.sleep(7000);
								  
								 // Performerlocator.clickdownloadpast(driver).click();
								 // Thread.sleep(7000);
								  driver.switchTo().frame(Performerlocator.clickpastauditviewframe(driver));// i frame enter 
								  if(Performerlocator.clickdownloadpast(driver).isEnabled())
						            {
						                 Thread.sleep(2000);
						                 Performerlocator.clickdownloadpast(driver).click();
						                 test.log(LogStatus.PASS, "past Audit file Downloaded Successfully.");
								  Performerlocator.clickviewpast(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickviewpastclose(driver).click();
								  Thread.sleep(8000);
								  driver.switchTo().parentFrame();
								  Performerlocator.clickviewpastclose1(driver).click();
								  Thread.sleep(7000);
								  Performerlocator.clickpastauditedit(driver).click();
								  Thread.sleep(7000);
								 driver.switchTo().frame(Performerlocator.clickpastauditeditframe(driver));
								  Performerlocator.clickpastauditeditsave(driver).click();
								  Thread.sleep(7000);
								  if(Performerlocator.clickpastauditeditsave(driver).isEnabled())
						            {
						                 Thread.sleep(2000);
						                 Performerlocator.clickpastauditeditsave(driver).click();
						                 test.log(LogStatus.PASS, "Record Updated Successfully.");
								 // Performerlocator.clickpastauditeditclose(driver).click();
								 // Thread.sleep(7000);
								  
								  if(Performerlocator.clickdownloadpast(driver).isEnabled())
						            {
						                 Thread.sleep(2000);
						                 Performerlocator.clickdownloadpast(driver).click();
						                 test.log(LogStatus.PASS, "Downloaded Document Successfully.");
						                // Performerlocator.clickviewpast1(driver).click();
										  Thread.sleep(7000);
										 // Performerlocator.clickviewpastclose11(driver).click();
										  Thread.sleep(8000);
										  driver.switchTo().parentFrame();
										  //Performerlocator.clickviewpastclose12(driver).click();
										  Thread.sleep(7000);
						                 Performerlocator.clickpastauditeditclose(driver).click();
										  Thread.sleep(7000);
										  
										  Performerlocator.clickmore4(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementreport(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementselectunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementsubunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementselectsubunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementfinancial(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementselectfinancial(driver).click();
										  Thread.sleep(9000);
										  Performerlocator.clickmanagementschedulingtype(driver).click();
										  Thread.sleep(9000);
										  Performerlocator.clickmanagementselectschedulingtype(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmanagementperiodtype(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickselectmanagementperiodtype(driver).click();
										  Thread.sleep(7000);
										  test.log(LogStatus.PASS, "Filters work Successfully.");
										  Thread.sleep(7000);
										  if(Performerlocator.clickselectmanagementexporttoexcel(driver).isEnabled())
								            {
								                 Thread.sleep(2000);
								                 Performerlocator.clickselectmanagementexporttoexcel(driver).click();
								                 test.log(LogStatus.PASS, "Management Response report Downloaded Successfully.");
										  
						             
								  
						                 Performerlocator.clickmore5(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickAuditscheduling(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickmore55(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftreport(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftselectunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftsubunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftselectsubunit(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftfinancial(driver).click();
										  Thread.sleep(7000);
										  /*Performerlocator.clickdraftselectfinancial(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftschedulingtype(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftselectschedulingtype(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickdraftperiodtype(driver).click();
										  Thread.sleep(7000);
										  Performerlocator.clickselectdraftperiodtype(driver).click();
										  */Thread.sleep(7000);
										  test.log(LogStatus.PASS, "Filters work Successfully.");
										  Performerlocator.clickselectdraftexporttoexcel(driver).click();
										  Thread.sleep(7000);
										  test.log(LogStatus.PASS, "Draft Observation report Downloaded Successfully.");
								  
					//  driver.switchTo().alert().accept();
						// Thread.sleep(7000);
			 // driver.switchTo().parentFrame();
							}
							  }
}
						            }
								  
						            }
							        }
						            }
								  
						            }
							     }
				            }
		 
             
						
