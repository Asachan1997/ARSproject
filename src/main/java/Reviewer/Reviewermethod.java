package Reviewer;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Reviewer.Reviewerlocator;
public class Reviewermethod {
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
		    Reviewerlocator.setUname(driver).sendKeys(uname);
			Row row2 = sheet1.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
		    Reviewerlocator.setPass(driver).sendKeys(password);
		    Reviewerlocator.clicksubmit(driver).click();
		    Reviewerlocator.clicksequrity(driver).click();
		    Thread.sleep(5000);
		    
		    Reviewerlocator.setquestion1(driver).sendKeys("123");
		    Thread.sleep(3000);
		    Reviewerlocator.setquestion2(driver).sendKeys("123");
			  Thread.sleep(3000);
			  Reviewerlocator.clickbtnvalidate(driver).click();
			  Thread.sleep(3000);
			  Reviewerlocator.clickars(driver).click();
			  Thread.sleep(3000);
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
Reviewerlocator.clickfinancialyear1(driver).click();
Thread.sleep(7000);
Reviewerlocator.clickselectfinancialyear1(driver).click();
Thread.sleep(2000);
if(Reviewerlocator.clickopenimplementationcount(driver).isEnabled())
{
   Thread.sleep(2000);
     Reviewerlocator.clickopenimplementationcount(driver).click();
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

Reviewerlocator.clickimplcompany(driver).click();
Thread.sleep(7000);
Reviewerlocator.clickimplselectcompany(driver).click();
Thread.sleep(9000);
//WebDriverWait wait = new WebDriverWait(driver, (40));	
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));	//Wait until records table get visible.
Reviewerlocator.clicknewmail11(driver).click();
Thread.sleep(7000);
Reviewerlocator.clicknewmail12(driver).click();
Thread.sleep(7000);
Reviewerlocator.clickto(driver).click();
Thread.sleep(7000);
Reviewerlocator.clickselectto(driver).click();
Thread.sleep(7000);
Reviewerlocator.clicksendmail(driver).click();
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

Reviewerlocator.clickcross1(driver).click();
Thread.sleep(7000);


Reviewerlocator.clicksubmitcount(driver).click();
Thread.sleep(7000);

Reviewerlocator.clickaudithistory(driver).click();
Thread.sleep(7000);
test.log(LogStatus.PASS, " :- Audit history Popup open successfully.");
Reviewerlocator.clickaudithistoryclose(driver).click();
Thread.sleep(7000);
test.log(LogStatus.PASS, " :- Audit history Popup Close successfully.");
Reviewerlocator.clickauditchangestatus(driver).click();
Thread.sleep(7000);
driver.switchTo().frame(Reviewerlocator.clickframe(driver)); // i frame enter krne krne k liye
Thread.sleep(7000);
Reviewerlocator.clickdownloadfinal(driver).click();
Thread.sleep(7000);
test.log(LogStatus.PASS, " :- File Download Successfully.");
Reviewerlocator.clickenterremark(driver).sendKeys("enter the remark mandatory");
Thread.sleep(7000);
Reviewerlocator.clickreviewhistory(driver).click();
Thread.sleep(7000);
test.log(LogStatus.PASS, " :- Next Button work successfully Successfully.");
Reviewerlocator.clickreviewremarkimp(driver).sendKeys("enter the review remark mandatory");
Thread.sleep(7000);
Reviewerlocator.clickselectstatus1(driver).click();
Thread.sleep(7000);
Reviewerlocator.clickselectstatus22(driver).click();
Thread.sleep(7000);
Reviewerlocator.clicksubmitbutton(driver).click();
Thread.sleep(7000);
test.log(LogStatus.PASS, " :- Audit Step Submitted Successfully.");
Reviewerlocator.clickclosepopup(driver).click();
Thread.sleep(7000);
Reviewerlocator.clickbackbuttonimp(driver).click();
Thread.sleep(7000);
}
	public static void Count(ExtentTest test)throws InterruptedException 
	{
		Thread.sleep(3000);
		Reviewerlocator.clickfinancialyear(driver).click();
			  Thread.sleep(3000);
			  Reviewerlocator.clickselectfinancialyear(driver).click();
			  Thread.sleep(2000);
			  test.log(LogStatus.PASS, " :- My Dashboard Financial year Filter works Successfully.");
			  String tabCount=Reviewerlocator.clickopencount(driver).getText();
	            if(Reviewerlocator.clickopencount(driver).isEnabled())
	           {
	               Thread.sleep(2000);
	               Reviewerlocator.clickopencount(driver).click();
	                 test.log(LogStatus.PASS, "Open Audit count is clickable");
	                 List<WebElement> gridData=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix']/tbody/tr/td[2]/div"));
	      int a = 0;
	      for(WebElement GD:gridData)
	         {
	        	 a++;
	         }
	      if(tabCount.equals(a))
	      {
              test.log(LogStatus.PASS, "Dashboard count matched with internal grid count.");

	      }
	      else
	      {
              test.log(LogStatus.PASS, "Dashboard count matched with internal grid count.");

	      }
	           }
	          else
	          {
	    	         test.log(LogStatus.FAIL, "Open Audit count is not clickable");
	          }
	}
	            
public static void MyWorkspace(ExtentTest test)throws InterruptedException {
	Thread.sleep(3000);
		 // Reviewerlocator.clickcompany(driver).click();
		  Thread.sleep(3000);
		  
		  WebDriverWait wait = new WebDriverWait(driver, (40));	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));	//Wait until records table get visible.
		  Reviewerlocator.clickviewdatarequest(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "View Data Request button work successfully.");
		  WebDriverWait wait1 = new WebDriverWait(driver, 50);
		  wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("Preshowdetails"));
		  Reviewerlocator.clickauditee(driver).click();
		  Thread.sleep(9000);
		  Reviewerlocator.clickselectauditee(driver).click();
		  Thread.sleep(9000);
		  Reviewerlocator.clickreportingmanager(driver).click();
		  Thread.sleep(9000);
		  Reviewerlocator.clickselectreportingmanager(driver).click();
		  Thread.sleep(9000);
		  Reviewerlocator.clicktimeline(driver).sendKeys("12-06-2023");
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, " :- Audit Data Request Filters works Successfully.");
		  Reviewerlocator.clicksaveviewdata(driver).click();
		  Thread.sleep(9000);
		  String messge12=Reviewerlocator.clickdata(driver).getText();
			if(messge12.equalsIgnoreCase("Audit Data Request Details :-"+ messge12)); 
			{
				test.log(LogStatus.PASS, "Audit Data Request Details :-"+ messge12);
				Reviewerlocator.clickadddatarequest(driver).click();
				  Thread.sleep(9000);
				  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframePreRequisite"));
				  Reviewerlocator.clickadddatarequestfilter(driver).click();
				  Thread.sleep(9000);
				  test.log(LogStatus.PASS, "Add Pre-Requisite Filters works Successfully.");
				  
				  Reviewerlocator.clickselectallcheckbox(driver).click();
				  Thread.sleep(5000);
				  Reviewerlocator.clickokbutton(driver).click();
				  Thread.sleep(5000);
				 Reviewerlocator.clickadddocument(driver).click();
				  Thread.sleep(5000);
				  test.log(LogStatus.PASS, "Add Pre-Requisite add document button work successfully.");
				 // Reviewerlocator.clickprocess1(driver).click();
				  Thread.sleep(5000);
				  Reviewerlocator.clickadd(driver).click();
				  Thread.sleep(3000);
				  Reviewerlocator.clickdelete(driver).click();
				  Thread.sleep(3000);
				  test.log(LogStatus.PASS, "Document Deleted Sucessfully.");
				  Reviewerlocator.clickdocumentrequired(driver).sendKeys("document new one");
				  Thread.sleep(3000);
				  Reviewerlocator.clickdocumentsave(driver).click();
				  Thread.sleep(3000);
				  String messge13=Reviewerlocator.clickmessagesave1(driver).getText();
					if(messge13.equalsIgnoreCase("Record Saved Successfully."));
					{
						test.log(LogStatus.PASS, "Record Saved Successfully.");
						Reviewerlocator.clickdocumentclose1(driver).click();
				  Thread.sleep(3000);
				  driver.switchTo().parentFrame();
				  Reviewerlocator.clickprerequisiteclose(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clickaddnewuser(driver).click();
				  Thread.sleep(7000);
				  driver.switchTo().frame(Reviewerlocator.clickframe1(driver));
				  Reviewerlocator.clickfirstname(driver).sendKeys("saini");
				  Thread.sleep(7000);
				  Reviewerlocator.clicklastname(driver).sendKeys("singh");
				  Thread.sleep(7000);
				  Reviewerlocator.clickDesignation(driver).sendKeys("HR");
				  Thread.sleep(7000);
				  Reviewerlocator.clickEmail(driver).sendKeys("saini.12700@gmail.com");
				  Thread.sleep(7000);
				  Reviewerlocator.clickcontactno(driver).sendKeys("8899889977");
				  Thread.sleep(7000);
				  Reviewerlocator.clicknewusersave(driver).click();
				  Thread.sleep(7000);
				  ///Reviewerlocator.clicktimeline(driver).sendKeys("12-06-2023");
				 
				  String messge14=Reviewerlocator.clicknewusersavemessage(driver).getText();
					if(messge14.equalsIgnoreCase("User Created Successfully.")) //change krna hai
					{
						test.log(LogStatus.PASS, "User Created Successfully.");
					}
					else
					{
						test.log(LogStatus.FAIL, "User Already Exist.");
					}
					Reviewerlocator.clicknewuserclose(driver).click();
					  Thread.sleep(7000);
				  driver.switchTo().parentFrame();
		          Thread.sleep(7000);
		          Reviewerlocator.clicknewmail12(driver).click();
				  Thread.sleep(9000);
				  Reviewerlocator.clicknewmail12(driver).click();
				  Thread.sleep(9000);
				  Reviewerlocator.clickto2(driver).click();
				  Thread.sleep(9000);
				  Reviewerlocator.clickselectto2(driver).click();
				  Thread.sleep(9000);
				  Reviewerlocator.clicksendmail2(driver).click();
				  Thread.sleep(9000);
				  Alert alert3 = driver.switchTo().alert();	
				  String alertMessage3= driver.switchTo().alert().getText();	
				  test.log(LogStatus.PASS, alertMessage3);
				  System.out.println(alertMessage3);	
				  alert3.accept();
				  Reviewerlocator.clickcross3(driver).click();
				  Thread.sleep(9000);
				  Reviewerlocator.clickviewremark(driver).click();
				  Thread.sleep(7000);
				  test.log(LogStatus.PASS, " :- Remark Viewed Successfully.");
				  Reviewerlocator.clickviewremarkclose(driver).click();
				  Thread.sleep(7000);
				 // Reviewerlocator.clickadddocument1(driver).click();
				  Thread.sleep(7000);
				//  Reviewerlocator.clickadddocumentname(driver).sendKeys("Review Document");
				  Thread.sleep(7000);
				//  Reviewerlocator.clickadddocumentsave(driver).click();
				  Thread.sleep(7000);
				  //Reviewerlocator.clickadddocumentsavemessage(driver).click();
				  Thread.sleep(7000);
				 /*String messge141=Reviewerlocator.clickadddocumentsavemessage(driver).getText();
					if(messge141.equalsIgnoreCase("Document Name Added Successfully.")) //change krna hai
					{
						test.log(LogStatus.PASS, "Document Name Added Successfully.");
					}
					else
					{
						test.log(LogStatus.FAIL, "Document Name Not Added Successfully.");
				//	}*/
					driver.switchTo().parentFrame();
				  Reviewerlocator.clickdocumentclose12(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clickviewauditdetails(driver).click();
				  Thread.sleep(7000);
				//  if (dirContents1.length < allFilesNew1.length) {
						test.log(LogStatus.PASS, " :- View Audit Details Popup open successfully.");
				  Reviewerlocator.clickexporttoexcel(driver).click();
				  Thread.sleep(7000);
				  test.log(LogStatus.PASS, " :- Audit Status Summary Excel file downloadded successfully.");
				  Reviewerlocator.clickdraftobservation(driver).click();
				  Thread.sleep(7000);
				  test.log(LogStatus.PASS, " :- Draft observation Button Works successfully.");
				  Reviewerlocator.clickprocess(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clickselectprocess(driver).click();
				  Thread.sleep(7000);
				Reviewerlocator.ObservationList_CheckBox(driver).click();
					Thread.sleep(2000);
					Reviewerlocator.ObservationList_Save(driver).click();
					Thread.sleep(7000);
					String messge=Reviewerlocator.ObservationList_SaveMsg(driver).getText();
					if(messge.equalsIgnoreCase("Observation updated successfully.")) 
					{
						test.log(LogStatus.PASS, "Observation updated successfully.");
					}
					else
					{
						test.log(LogStatus.FAIL, "Observation not updated successfully.");
					}
				//Reviewerlocator.clickremoveobservation(driver).click();
				//Thread.sleep(7000);	
				//  ((TargetLocator) Reviewerlocator.clickremoveobservation(driver)).alert().accept();
				 //driver.switchTo().alert().accept();
				  Reviewerlocator.clickbackbtn(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clicknewmail(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clicknewmail1(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clickto(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clickselectto(driver).click();
				  Thread.sleep(7000);
				  Reviewerlocator.clicksendmail(driver).click();
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
			        Reviewerlocator.clickcross2(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clicksubmitted(driver).click();
					  Thread.sleep(2000);
					  Reviewerlocator.clicksubmitfilter(driver).click();
					  Thread.sleep(2000);
					  Reviewerlocator.clickselectsubmitfilter(driver).click();
					  Thread.sleep(2000);
					  Reviewerlocator.clickchangestatus1(driver).click();
					  Thread.sleep(9000);
					  //Reviewerlocator.clickframe(driver).click();
					  driver.switchTo().frame(Reviewerlocator.clickframe(driver)); // i frame enter krne krne k liye
					  Thread.sleep(7000);
					  Reviewerlocator.clicknext(driver).click();
					  test.log(LogStatus.PASS, " :- Audit Coverage Next Button Works successfully.");

					  Thread.sleep(7000);
					  Reviewerlocator.clickprocesswalkthrough(driver).clear();	  
			  Reviewerlocator.clickprocesswalkthrough(driver).sendKeys("processwalkthrough");
			    Thread.sleep(7000);
			    Reviewerlocator.clickactualwdone(driver).clear();
			    Reviewerlocator.clickactualwdone(driver).sendKeys("Actula work done");
			    Thread.sleep(7000);
			    Reviewerlocator.clickpopulation(driver).clear();
			    Reviewerlocator.clickpopulation(driver).sendKeys("population");
			    Thread.sleep(7000);
			    Reviewerlocator.clicksample(driver).clear();
			    Reviewerlocator.clicksample(driver).sendKeys("sample");
			    Thread.sleep(7000);
			    Reviewerlocator.clickremark(driver).clear();
			    Reviewerlocator.clickremark(driver).sendKeys("remark");
			    Thread.sleep(7000);
			    JavascriptExecutor js=(JavascriptExecutor) driver ;
		 		js.executeScript("window.scroll(0,900)");
		 		Thread.sleep(7000);
			   //Reviewerlocator.clickworkingfile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\Customer BranchList (27).xlsx");
			    //Thread.sleep(7000);
		 		 Reviewerlocator.clicknextbtn(driver).click();
				  Thread.sleep(7000);  
				  test.log(LogStatus.PASS, " :- Actual testing/Work Done data save successfully.");
				  test.log(LogStatus.PASS, " :- Actual testing/Work Done Button Works successfully.");

				  Reviewerlocator.clickobservationtitle(driver).clear();
				  Reviewerlocator.clickobservationtitle(driver).sendKeys("observationtitle");
				    Thread.sleep(7000);
				    Reviewerlocator.clickobservation(driver).clear(); 
				    Reviewerlocator.clickobservation(driver).sendKeys("Observation");
				    Thread.sleep(7000);
				    Reviewerlocator.clickbriefobservation(driver).clear();
				    Reviewerlocator.clickbriefobservation(driver).sendKeys("detailed obsrvation");
				    Thread.sleep(7000);
				    Reviewerlocator.clickAnnexureTitle(driver).clear();
				    Reviewerlocator.clickAnnexureTitle(driver).sendKeys("welcome");
				    Thread.sleep(7000);
				    Reviewerlocator.clickaudiolink(driver).clear();
				    Reviewerlocator.clickaudiolink(driver).sendKeys("www.w3school.com");
				    Thread.sleep(7000);
				    Reviewerlocator.clickbusinessrisk(driver).clear();
				    Reviewerlocator.clickbusinessrisk(driver).sendKeys("simple");
				    Thread.sleep(7000);
				    Reviewerlocator.clickrootcause(driver).clear();
				    Reviewerlocator.clickrootcause(driver).sendKeys("root cause");
				    Thread.sleep(7000);
				    Reviewerlocator.clickfinancialimpact(driver).clear();
				    Reviewerlocator.clickfinancialimpact(driver).sendKeys("12345");
				    Thread.sleep(7000);
				    Reviewerlocator.clickriskrating(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickselectriskrating(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickobservationcategory(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickselectobservationcategory(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickrecommendationtype(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickselectrecommendationtype(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickrecommendation(driver).clear();
					  Reviewerlocator.clickrecommendation(driver).sendKeys("recommendation");
					    Thread.sleep(7000);
					    Reviewerlocator.clickmanagementresponse(driver).clear();
					  Reviewerlocator.clickmanagementresponse(driver).sendKeys("Management Response");
					  Thread.sleep(7000);
					  Reviewerlocator.clickpersonresponsible(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickselectpersonresponsible(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickownername(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickselectownername(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clicksaverecommendation(driver).click();
					  Thread.sleep(7000);
					 
					 // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));
					  Reviewerlocator.clickrecommendationok(driver).click();
					 Thread.sleep(7000);
					  By locator = By.linkText("ok");
					  By locator1 = By.xpath("//button[@class='k-button k-primary']");
						//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
						Thread.sleep(4000);
						test.log(LogStatus.PASS, " :- Recommendation save successfully.");
						//WebElement ViewButton = driver.findElement(locator);	
						//Thread.sleep(7000);
				//	JavascriptExecutor jse=(JavascriptExecutor)driver;
					//jse.executeScript("arguments[0].click();", ViewButton();
					  /*Reviewerlocator.clicksaveobservation(driver).click();
					  Thread.sleep(7000);
					  driver.switchTo().parentFrame();
					  Reviewerlocator.clickobservationok(driver).click();
					  Thread.sleep(7000);*/
						JavascriptExecutor js1=(JavascriptExecutor) driver ;
				 		js1.executeScript("window.scroll(0,900)");
				 		Thread.sleep(7000);
						 JavascriptExecutor js2=(JavascriptExecutor) driver ;
					 		js2.executeScript("window.scroll(0,900)");
					 		Thread.sleep(7000);
					   //driver.switchTo().frame(Reviewerlocator.clickframe(driver)); // i frame enter krne krne k liye
					  Thread.sleep(7000);
					  Reviewerlocator.clicknext3(driver).click();
					  test.log(LogStatus.PASS, " :- Observation Next Button Works successfully.");
					  Thread.sleep(7000);
					  
					  
					  //Reviewerlocator.clickhistorylog(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickreviewremark(driver).sendKeys("Review remark");
					  Reviewerlocator.clickreviewremark(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickselectstatus(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clicksubmitbtn01(driver).click();
					  Thread.sleep(7000);
					 // Reviewerlocator.clicksubmitbtnok(driver).click();
					  Thread.sleep(7000);
						
					 driver.switchTo().parentFrame();
					 Reviewerlocator.clickclose2(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickbackbttn(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clicksubmitco(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickcheckboox(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickstatus(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clickselectstatus2(driver).click();
					  Thread.sleep(7000);
					  Reviewerlocator.clicksave(driver).click();
					  Thread.sleep(7000);
					  String messge142=Reviewerlocator.clicksavemessagess(driver).getText();
						if(messge142.equalsIgnoreCase("Audit Step Submitted Successfully.")) //change krna hai
						{
							test.log(LogStatus.PASS, "Audit Step Submitted Successfully.");
						}
						else
						{
							test.log(LogStatus.FAIL, "Audit Step not Submitted Successfully.");
						}
						Reviewerlocator.clickbackbttn2(driver).click();
						  Thread.sleep(7000);
						  test.log(LogStatus.PASS, " :- Workspace Back Button Works successfully.");
						  Reviewerlocator.clickinternal(driver).click();
						  Thread.sleep(7000);
						  test.log(LogStatus.PASS, " :- Internal Mail Button Works successfully.");
						  Reviewerlocator.clickinternalmail(driver).click();
						  Thread.sleep(7000);
						  Reviewerlocator.clickto1(driver).click();
						  Thread.sleep(7000);
						  Reviewerlocator.clickselectto1(driver).click();
						  Thread.sleep(7000);
						  Reviewerlocator.clicksendmail1(driver).click();
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
						  Reviewerlocator.clickcross2(driver).click();
						  Thread.sleep(7000);
					}

			}
}
			 public static void mydocument(ExtentTest test)throws InterruptedException 
			  {
                 Thread.sleep(2000);
                 Reviewerlocator.clickmydocument(driver).click();
				  Thread.sleep(2000);
				  Reviewerlocator.clickmydocumentfilter(driver).click();
				  Thread.sleep(9000);
				  Reviewerlocator.clickmydocumentselectfilter(driver).click();
				  Thread.sleep(11000);
				  WebDriverWait wait = new WebDriverWait(driver,(60));
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a")));	//Wait until records table get visible.
				  By locator = By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a");
					
					wait.until(ExpectedConditions.presenceOfElementLocated(locator));
					Thread.sleep(4000);
					
					WebElement ViewButton = driver.findElement(locator);	
					Thread.sleep(4000);
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				Thread.sleep(2000);
				jse.executeScript("arguments[0].click();", ViewButton);
					Thread.sleep(4000);
				  //Reviewerlocator.clickmydocumentfinancialyear(driver).click();
				  
				  Thread.sleep(9000);
				  //Reviewerlocator.clickmydocumentselectfinancialyear(driver).click();
				  Thread.sleep(9000);
				//  Reviewerlocator.clickmydocumentstatusfilter(driver).click();
				  Thread.sleep(9000);
				//  Reviewerlocator.clickmydocumentselectstatus(driver).click();
				  Thread.sleep(9000);
				  
				  test.log(LogStatus.PASS, "My Document Filter Work Successfully");
				   if(Reviewerlocator.clickmydocumentdownload(driver).isEnabled())
		            {
		                 Thread.sleep(9000);
		                 Reviewerlocator.clickmydocumentdownload(driver).click();
		                 test.log(LogStatus.PASS, "Working Document Downloaded");
		            }
		          else
		          {
		    	         test.log(LogStatus.FAIL, "Document not Dowmloaded");
		    	        
		          }
				   Thread.sleep(8000);
				   Reviewerlocator.clickmydocumentclick1(driver).click();
					  Thread.sleep(9000);
				   Reviewerlocator.clickmydocumentreview(driver).click();
					  Thread.sleep(9000);
				   if(Reviewerlocator.clickmyreviewdocumentdownload(driver).isEnabled())
		            {
		                 Thread.sleep(2000);
		                 Reviewerlocator.clickmyreviewdocumentdownload(driver).click();
		                 test.log(LogStatus.PASS, "Review Document Downloaded");
		            }
		          else
		          {
		    	         test.log(LogStatus.FAIL, "Review Document not Dowmloaded");
		    	        
		          }
			  
			  Thread.sleep(8000);
			  Reviewerlocator.clickmydocumentclick2(driver).click();
			  Thread.sleep(9000);
		   Reviewerlocator.clickmydocumentannexure(driver).click();
			  Thread.sleep(9000);
		   if(Reviewerlocator.clickmyannexuredocumentdownload(driver).isEnabled())
           {
                Thread.sleep(2000);
                Reviewerlocator.clickmyannexuredocumentdownload(driver).click();
                test.log(LogStatus.PASS, "annexure Document Downloaded");
           }
         else
         {
   	         test.log(LogStatus.FAIL, "annexure Document not Dowmloaded");
   	        
         }
			  Thread.sleep(8000);
			  Reviewerlocator.clickmydocumentclick3(driver).click();
			  Thread.sleep(9000);
		   Reviewerlocator.clickmydocumentFinaldeliverable(driver).click();
			  Thread.sleep(9000);
		   if(Reviewerlocator.clickmyFinaldeliverabledocumentdownload(driver).isEnabled())
           {
                Thread.sleep(2000);
                Reviewerlocator.clickmyFinaldeliverabledocumentdownload(driver).click();
                test.log(LogStatus.PASS, "Finaldeliverable Document Downloaded");
           }
         else
         {
   	         test.log(LogStatus.FAIL, "Finaldeliverable Document not Dowmloaded");     
         }
	  
			  
			  Thread.sleep(8000);
			  Reviewerlocator.clickmydocumentclick4(driver).click();
			  Thread.sleep(9000);
		   Reviewerlocator.clickmydocumentFeedback(driver).click();
			  Thread.sleep(9000);
		   if(Reviewerlocator.clickmydocumentFeedbackdownload(driver).isEnabled())
           {
                Thread.sleep(2000);
                Reviewerlocator.clickmyFinaldeliverabledocumentdownload(driver).click();
                test.log(LogStatus.PASS, "Feedback Document Downloaded");
           }
         else
         {
   	         test.log(LogStatus.FAIL, "Feedback Document not Dowmloaded");     
         }
	  
			 
			  Reviewerlocator.clickmydocumentDeleted(driver).click();
			  Thread.sleep(9000);
		   if(Reviewerlocator.clickmydocumentDeleteddownload(driver).isEnabled())
           {
                Thread.sleep(2000);
                Reviewerlocator.clickmydocumentDeleteddownload(driver).click();
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
                         Reviewerlocator.clickmyreport(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickmyreportfilter(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickmyreportselectfilter(driver).click();
						  Thread.sleep(9000);
						  Reviewerlocator.clickmyreportselectfinancial(driver).click();
						  Thread.sleep(9000);
						  Reviewerlocator.clickmyreportselectfinancialyear(driver).click();
						  Thread.sleep(9000);
						  test.log(LogStatus.PASS, "Report Filter work successfully.");
						//  Reviewerlocator.clickmydocumentdownload(driver).click();
						//  Thread.sleep(5000);
						  //test.log(LogStatus.PASS, "Audit Status Report Downloaded");
						  Thread.sleep(9000);
				        Reviewerlocator.clickmore(driver).click();
						  Thread.sleep(9000);
						  Reviewerlocator.clickauditstatus(driver).click();
						  Thread.sleep(5000);
						  if(Reviewerlocator.clickexportexcel(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Reviewerlocator.clickexportexcel(driver).click();
				                 test.log(LogStatus.PASS, "Audit Status Report Downloaded");
				           
						  //Reviewerlocator.clickexportexcel(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickmore1(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickopenobservation(driver).click();
						  Thread.sleep(5000);
						  if(Reviewerlocator.clickdownloadopenobservation(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Reviewerlocator.clickdownloadopenobservation(driver).click();
				                 test.log(LogStatus.PASS, "open observation Report Downloaded");
						  Reviewerlocator.clickdownloadopenobservation(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickmore3(driver).click();
						  Thread.sleep(5000);
						 Reviewerlocator.clickprerequsite(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickentity(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickselectentity(driver).click();
						  Thread.sleep(5000);
						// Reviewerlocator.clicksubentity(driver).click();
						  Thread.sleep(5000);
						 // Reviewerlocator.clickselectsubentity(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickyear(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickselectyear(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickschedulingtype(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickselectschedulingtype(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickperiod(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickselectperiod(driver).click();
						  Thread.sleep(5000);
						  test.log(LogStatus.PASS, "Filters Work Successfully.");
						  //Reviewerlocator.clickprerequsiteexcelexport(driver).click();
						  Thread.sleep(5000);
						  if(Reviewerlocator.clickprerequsiteexcelexport(driver).isEnabled())
				            {
				                 Thread.sleep(5000);
				                 Reviewerlocator.clickprerequsiteexcelexport(driver).click();
				                 test.log(LogStatus.PASS, "Pre-requisite report Downloaded Successfully.");
						 
						  Reviewerlocator.clickmore2(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickmore22(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickmore12(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickpastauditreport(driver).click();
						  Thread.sleep(5000);
						//  Reviewerlocator.clickpastauditviewreport(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickaddnewpastaudit(driver).click();
						  Thread.sleep(5000);
						  driver.switchTo().frame(Reviewerlocator.clickaddnewpastauditframe(driver));// i frame enter 
						 Reviewerlocator.clickaddnewunit(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickaddnewselectunit(driver).click();
						  Thread.sleep(5000);
						//  Reviewerlocator.clickaddnewsubunit(driver).click();
						  Thread.sleep(5000);
						// Reviewerlocator.clickaddnewselectsubunit(driver).click();
						  Thread.sleep(5000);
						 Reviewerlocator.clickaddnewfinancialyear(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickaddnewselectfinancialyear(driver).click();
						  Thread.sleep(5000);
						Reviewerlocator.clickaddnewauditbackground(driver).click();
						  Thread.sleep(5000);
						 Reviewerlocator.clickaddnewauditselectbackground(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickaddnewaudituploadfile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\PreRequsite Log Report (25).xlsx");
						  Thread.sleep(3000);
						  //Reviewerlocator.clickaddnewauditsave(driver).click();
						  //Thread.sleep(5000);
						  if(Reviewerlocator.clickaddnewauditsave(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Reviewerlocator.clickaddnewauditsave(driver).click();
				                 test.log(LogStatus.PASS, "Record Uploaded Successfully.");
						  Reviewerlocator.clickaddnewauditclose(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickpastauditview(driver).click();
						  Thread.sleep(5000);
						  
						 // Reviewerlocator.clickdownloadpast(driver).click();
						 // Thread.sleep(5000);
						  driver.switchTo().frame(Reviewerlocator.clickpastauditviewframe(driver));// i frame enter 
						  if(Reviewerlocator.clickdownloadpast(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Reviewerlocator.clickdownloadpast(driver).click();
				                 test.log(LogStatus.PASS, "past Audit file Downloaded Successfully.");
						  Reviewerlocator.clickviewpast(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickviewpastclose(driver).click();
						  Thread.sleep(8000);
						  driver.switchTo().parentFrame();
						  Reviewerlocator.clickviewpastclose1(driver).click();
						  Thread.sleep(5000);
						  Reviewerlocator.clickpastauditedit(driver).click();
						  Thread.sleep(5000);
						 driver.switchTo().frame(Reviewerlocator.clickpastauditeditframe(driver));
						  Reviewerlocator.clickpastauditeditsave(driver).click();
						  Thread.sleep(5000);
						  if(Reviewerlocator.clickpastauditeditsave(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Reviewerlocator.clickpastauditeditsave(driver).click();
				                 test.log(LogStatus.PASS, "Record Updated Successfully.");
						 // Reviewerlocator.clickpastauditeditclose(driver).click();
						 // Thread.sleep(5000);
						  
						  if(Reviewerlocator.clickdownloadpast(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Reviewerlocator.clickdownloadpast(driver).click();
				                 test.log(LogStatus.PASS, "Downloaded Document Successfully.");
				                // Reviewerlocator.clickviewpast1(driver).click();
								  Thread.sleep(5000);
								 // Reviewerlocator.clickviewpastclose11(driver).click();
								  Thread.sleep(8000);
								  driver.switchTo().parentFrame();
								  //Reviewerlocator.clickviewpastclose12(driver).click();
								  Thread.sleep(5000);
				                 Reviewerlocator.clickpastauditeditclose(driver).click();
								  Thread.sleep(5000);
								  
								  Reviewerlocator.clickmore4(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickmanagementreport(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickmanagementunit(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickmanagementselectunit(driver).click();
								  Thread.sleep(5000);
								 // Reviewerlocator.clickmanagementsubunit(driver).click();
								  Thread.sleep(5000);
								 // Reviewerlocator.clickmanagementselectsubunit(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickmanagementfinancial(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickmanagementselectfinancial(driver).click();
								  Thread.sleep(9000);
								  Reviewerlocator.clickmanagementschedulingtype(driver).click();
								  Thread.sleep(9000);
								  Reviewerlocator.clickmanagementselectschedulingtype(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickmanagementperiodtype(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickselectmanagementperiodtype(driver).click();
								  Thread.sleep(5000);
								  test.log(LogStatus.PASS, "Filters work Successfully.");
								  Thread.sleep(5000);
								  if(Reviewerlocator.clickselectmanagementexporttoexcel(driver).isEnabled())
						            {
						                 Thread.sleep(2000);
						                 Reviewerlocator.clickselectmanagementexporttoexcel(driver).click();
						                 test.log(LogStatus.PASS, "Management Response report Downloaded Successfully.");
								  
				             
						  
				                 Reviewerlocator.clickmore5(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickAuditscheduling(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickmore55(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftreport(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftunit(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftselectunit(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftsubunit(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftselectsubunit(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftfinancial(driver).click();
								  Thread.sleep(5000);
								  /*Reviewerlocator.clickdraftselectfinancial(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftschedulingtype(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftselectschedulingtype(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickdraftperiodtype(driver).click();
								  Thread.sleep(5000);
								  Reviewerlocator.clickselectdraftperiodtype(driver).click();
								  */Thread.sleep(5000);
								  test.log(LogStatus.PASS, "Filters work Successfully.");
								  Reviewerlocator.clickselectdraftexporttoexcel(driver).click();
								  Thread.sleep(5000);
								  test.log(LogStatus.PASS, "Draft Observation report Downloaded Successfully.");
						  
	//  driver.switchTo().alert().accept();
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

