package newauditproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.test.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Audit.AuditProject.AppTest;

//import Audit.Arsproduct.AppTest;

public class auditmetod {

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;
	public static WebDriver driver=null;
	public static Row row=null;
	public static Cell cell=null;
	public static void Login() throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ambuj\\Downloads\\chromedriver_win32 (3)//chromedriver.exe"); 
		  
		  driver=new ChromeDriver();       //Created new Chrome driver instance.
		  Thread.sleep(3000);
		
		  driver.manage().window().maximize();
		  fis = new FileInputStream("C://Users//ambuj//Desktop//automation//auditexcelsheet.xlsx");
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			Row row0 = sheet.getRow(0);				//Selected 0th index row (First row)
			Cell c1 = row0.getCell(1);					//Selected cell (0 row,1 column)
			String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
			 driver.get(URL);
			 Row row1 = sheet.getRow(1);		        //Selected 1st index row (Second row)
				c1 = row1.getCell(1);					//Selected cell (1 row,1 column)
		    String uname = c1.getStringCellValue();	
			auditlocators.setUname(driver).sendKeys(uname);
			Row row2 = sheet.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
		    auditlocators.setPass(driver).sendKeys(password);
		    auditlocators.clicksumit(driver).click();
		    auditlocators.clicksequrity(driver).click();
		    Thread.sleep(5000);
		    
		   // auditlocators.setquestion1(driver).sendKeys("123");
		    auditlocators.setquestion1(driver).sendKeys("123");
		    Thread.sleep(3000);
		    auditlocators.setquestion2(driver).sendKeys("123");
			  Thread.sleep(3000);
			  auditlocators.clickbtnvalidate(driver).click();
			  Thread.sleep(3000);
			  auditlocators.clickars(driver).click();
			  
	}
	
	
	public static void Master(ExtentTest test)throws InterruptedException {
		
		auditlocators.clickMaster(driver).click();
		 Thread.sleep(3000);
		 
			auditlocators.clickUserMaster(driver).click();
			 Thread.sleep(3000);
			 
			 auditlocators.clickaddnew(driver).click();
			 Thread.sleep(5000);
			 
			 
			 Row row4=sheet.getRow(4);
			 Cell c1=row4.getCell(1);
			  String firstName = c1.getStringCellValue();	
				auditlocators.setfirstname(driver).sendKeys(firstName);
				 Thread.sleep(2000);
				 
				 Row row5=sheet.getRow(5);
				 c1=row5.getCell(1);
				 String lastName = c1.getStringCellValue();	
				 auditlocators.setlastname(driver).sendKeys(lastName);
				 
				 Row row6=sheet.getRow(6);
				 c1=row6.getCell(1);
				 String desigNation = c1.getStringCellValue();	
				 auditlocators.setdesignation(driver).sendKeys(desigNation);
				 
				 Row row7 = sheet.getRow(7);		               
			     c1 = row7.getCell(1);	
			     String emailId = c1.getStringCellValue();	
			     auditlocators.setemail(driver).sendKeys(emailId);
				 
				 
				 Row row8 = sheet.getRow(8);		               
			     c1 = row8.getCell(1);
			     int contactNo= (int)c1.getNumericCellValue();
			     auditlocators.setcontactno(driver).sendKeys( contactNo+"");
			     Thread.sleep(3000);
			     
			     auditlocators.clickdepartment(driver).click();
				 Thread.sleep(3000);
				 
				 auditlocators.clickchoosedepartment(driver).click();
				 Thread.sleep(3000);
				
				 
				 auditlocators.clickrole(driver).click();
				 Thread.sleep(3000);
				 
				 auditlocators.clickchooserole(driver).click();
				 Thread.sleep(3000);
				 
				 JavascriptExecutor js=(JavascriptExecutor) driver ;
					js.executeScript("window.scroll(0,500)");
					Thread.sleep(3000);
					
					 auditlocators.clicksavebtn(driver).click();
					 Thread.sleep(5000);
					 String messg=auditlocators.clickusermessage(driver).getText();
						if(messg.equalsIgnoreCase("User Created Successfully.")) 
						{
							test.log(LogStatus.PASS, "User Created Successfully.");
						}
						else
						{
							test.log(LogStatus.FAIL, "User with Same Email Already Exists.");
						}
						
					 auditlocators.clickcancelbtn(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clicksearch(driver).sendKeys("Manshi",Keys.ENTER);
					
					 //auditlocators.setfilter(driver).sendKeys("nancy",Keys.ENTER);
					    Thread.sleep(3000);
					    
					    //auditlocators.setfirstname1(driver).sendKeys("samar");
					   // Thread.sleep(3000);
					    
					    
					    auditlocators.clickeditbtn(driver).click();
						 Thread.sleep(3000);
						 //firstname.clear();
						 
						 auditlocators.clickbtnsave(driver).click();
						 Thread.sleep(3000);
						 String messge=auditlocators.clickusereditmessage(driver).getText();
							if(messge.equalsIgnoreCase("User Updated Successfully.")) 
							{
								test.log(LogStatus.PASS, "User Updated Successfully.");
							}
							else
							{
								test.log(LogStatus.FAIL, "User already exist");
							}
						 auditlocators.clickbtncancel(driver).click();
						 Thread.sleep(3000);
						 
						  //auditlocators.clickremovebtn(driver).click();
						  //Thread.sleep(3000);
							// auditlocators.clickremovebtn(driver).alert().accept();
							// driver.switchTo().alert().accept();

							 Thread.sleep(3000);

							 auditlocators.clickpasswordbtn(driver).click();
							 Thread.sleep(3000);
							 driver.switchTo().alert().accept();
							 Thread.sleep(3000);
	}

							
	
public static void unitMaster(ExtentTest test)throws InterruptedException {
	
	auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 
		auditlocators.clickunitmaster(driver).click();
		 Thread.sleep(3000);
		 
		 auditlocators.clickaddnewbtn(driver).click();
		 Thread.sleep(5000);
		 
		 Row row10=sheet.getRow(10);
		 Cell c1=row10.getCell(1);
		  String Name = c1.getStringCellValue();	
			auditlocators.setname(driver).sendKeys(Name);
			 Thread.sleep(2000);
			 
			  auditlocators.clickunittype(driver).click();
				 Thread.sleep(3000);
				 
				 auditlocators.clickchooseunittype(driver).click();
				 Thread.sleep(3000);
				 
				 Row row11=sheet.getRow(11);
				 c1=row11.getCell(1);
				  String Address = c1.getStringCellValue();	
					auditlocators.setnaddress(driver).sendKeys(Address);
					 Thread.sleep(2000);
					 
					 auditlocators.clickstate(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clickchoosestate(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clickcity(driver).click();
					 Thread.sleep(3000);
					 
					 auditlocators.clickchoosecity(driver).click();
					 Thread.sleep(3000);
					 
					 Row row12=sheet.getRow(12);
					 c1=row12.getCell(1);
					  String contactperson = c1.getStringCellValue();	
						auditlocators.setcontact(driver).sendKeys(contactperson);
						 Thread.sleep(2000);
						 
						 Row row13=sheet.getRow(13);
						 c1=row13.getCell(1);
						  String emailid = c1.getStringCellValue();	
							auditlocators.setemailid(driver).sendKeys(emailid);
							 Thread.sleep(2000);
						 
						 auditlocators.clickstatus(driver).click();
						 Thread.sleep(3000);
						 auditlocators.clickchoosestatus(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clicksavebuttn(driver).click();
						 Thread.sleep(3000);
						 String messg=auditlocators.clickunitmessage(driver).getText();
							if(messg.equalsIgnoreCase("Branch Added Successfully.")) 
							{
								test.log(LogStatus.PASS, "Branch Added Successfully.");
							}
							else
							{
								test.log(LogStatus.FAIL, "Branch already exist");
							}
						 
							 JavascriptExecutor js=(JavascriptExecutor) driver ;
						 		js.executeScript("window.scroll(0,500)");
						 		Thread.sleep(3000);
						 		
						 
						 auditlocators.clickcancelbuttn(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickcupdateunit(driver).click();
						 Thread.sleep(3000);
						 //auditlocators.clickfirstnameedit(driver).click();
						
						 auditlocators.clickfirstnameedit(driver).clear();
						 Thread.sleep(3000);
						 Row row14=sheet.getRow(14);
						  c1=row14.getCell(1);
						  String firstNameenter = c1.getStringCellValue();	
							auditlocators.clickfirstnameenter(driver).sendKeys(firstNameenter);
							 Thread.sleep(2000);
						 //JavascriptExecutor js=(JavascriptExecutor) driver ;
					 		js.executeScript("window.scroll(0,500)");
					 		Thread.sleep(3000);
					 		
						 
						 auditlocators.clicksavebutton(driver).click();
						 Thread.sleep(3000);
						 String messgaa=auditlocators.clicksubunitmessage(driver).getText();
							if(messgaa.equalsIgnoreCase("Branch Updated Successfully.")) 
							{
								test.log(LogStatus.PASS, "Branch Updated Successfully.");
							}
							else
							{
								test.log(LogStatus.FAIL, "Branch already exist");
							}
						 
						 auditlocators.clickcancelbutton(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickexporttoexcelbtn(driver).click();
						 Thread.sleep(3000);
						 auditlocators.clicksearch(driver).sendKeys("B-MIL",Keys.ENTER);
						 auditlocators.clicksubunit(driver).click();
						 Thread.sleep(3000);
						 auditlocators.clickaddnewunit(driver).click();
						 Thread.sleep(3000);
						 Row row16=sheet.getRow(16);
						 c1=row16.getCell(1);
						  String name1 = c1.getStringCellValue();	
							auditlocators.setname(driver).sendKeys(name1);
							 Thread.sleep(2000);
						 
						 auditlocators.clickunit1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickselect1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickaddress1(driver).click();
						 Thread.sleep(3000);
						 Row row17=sheet.getRow(17);
						 c1=row17.getCell(1);
						  String address1 = c1.getStringCellValue();	
							auditlocators.clickaddress1(driver).sendKeys(address1);
							 Thread.sleep(2000);
						 
						 auditlocators.clickstate1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickselectstate1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickcity1(driver).click();
						 Thread.sleep(3000);
						 
						 auditlocators.clickselectcity1(driver).click();
						 Thread.sleep(3000);
						 	 
							auditlocators.clickcontactno1(driver).click();
							 Thread.sleep(3000);
							 Row row18=sheet.getRow(18);
							 c1=row18.getCell(1);
							  String contactno = c1.getStringCellValue();	
								auditlocators.clickcontactno1(driver).sendKeys(contactno);
								 Thread.sleep(2000);
							 
								 auditlocators.clickemail1(driver).click();
								 Thread.sleep(3000);
								 Row row19=sheet.getRow(19);
								 c1=row19.getCell(1);
								  String email1 = c1.getStringCellValue();	
									auditlocators.clickemail1(driver).sendKeys(email1);
									 Thread.sleep(2000);
									 
									 auditlocators.clickstatus1(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickselectstatus1(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickbtnsave1(driver).click();
									 Thread.sleep(3000);
									 String messga=auditlocators.clicksubunitmessage(driver).getText();
										if(messga.equalsIgnoreCase("Branch Added Successfully.")) 
										{
											test.log(LogStatus.PASS, "Branch Added Successfully.");
										}
										else
										{
											test.log(LogStatus.FAIL, "Branch already exist");
										}
									 auditlocators.clickbtncancel1(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickfilter(driver).click();
									 Thread.sleep(3000);
									 auditlocators.clickfilter(driver).clear();
									 Thread.sleep(3000);
									
									
}
public static void business(ExtentTest test)throws InterruptedException {
	auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickprocess(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickprocessadd(driver).click();
	 Thread.sleep(3000);
	 
	 auditlocators.clickproname(driver).click();
	 Thread.sleep(3000);
	 Row row21=sheet.getRow(21);
	 Cell c1=row21.getCell(1);
	  String proname = c1.getStringCellValue();	
		auditlocators.clickproname(driver).sendKeys(proname);
		 Thread.sleep(2000);
		 auditlocators.clickprosave(driver).click();
		 Thread.sleep(3000);
		 String messga=auditlocators.clickprocessmessage(driver).getText();
			if(messga.equalsIgnoreCase("Process Save Successfully.")) 
			{
				test.log(LogStatus.PASS, "Process Save Successfully.");
			}
			else
			{
				test.log(LogStatus.FAIL, "Process already exist");
			}
		 auditlocators.clickprocancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickproedit(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickpronamedit(driver).clear();
		 Thread.sleep(3000);
		 Row row22=sheet.getRow(22);
		  c1=row22.getCell(1);
		  String pronamedit = c1.getStringCellValue();	
			auditlocators.clickpronamedit(driver).sendKeys(pronamedit);
			 Thread.sleep(2000);
			 auditlocators.clickprocsave(driver).click();
			 Thread.sleep(3000);
			 
			 String messga1=auditlocators.clickprocmess(driver).getText();
				if(messga1.equalsIgnoreCase("Process Updated Successfully.")) 
				{
					test.log(LogStatus.PASS, "Process Updated Successfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Process already exist.");
			 auditlocators.clickprocclose(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubproce(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubproceadd(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubprocename(driver).click();
			 Thread.sleep(3000);
			 Row row23=sheet.getRow(23);
			  c1=row23.getCell(1);
			  String subprocename = c1.getStringCellValue();	
				auditlocators.clicksubprocename(driver).sendKeys(subprocename);
				 Thread.sleep(2000);
			 auditlocators.clicksubprocesave(driver).click();
			 Thread.sleep(3000);
			 
			String messga2=auditlocators.clicksubunitmessage(driver).getText();
				if(messga2.equalsIgnoreCase("Sub Process Add successfully.")) 
				{
					test.log(LogStatus.PASS, "Sub Process Add successfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Process already exist");
				}
				
				
			 auditlocators.clicksubprocecancel(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubprocedit(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubprocecname(driver).clear();
			 Thread.sleep(3000);
			 Row row24=sheet.getRow(24);
			  c1=row24.getCell(1);
			  String subprocecname = c1.getStringCellValue();	
				auditlocators.clicksubprocecname(driver).sendKeys(subprocecname);
				 Thread.sleep(2000);
			 auditlocators.clickprocecnamsave(driver).click();
			 Thread.sleep(3000);
			 
			 String messga4=auditlocators.clickprupdateme(driver).getText();
				if(messga4.equalsIgnoreCase("Sub Process Update successfully.")) 
				{
					test.log(LogStatus.PASS, "Sub Process Update successfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Sub-process already exist");
				}
				
			 auditlocators.clickprocecnamcancel(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clickaddactivity(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clickaddnewactivity(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicknameactivity(driver).click();
			 Thread.sleep(3000);
			 Row row25=sheet.getRow(25);
			  c1=row25.getCell(1);
			  String nameactivity = c1.getStringCellValue();	
				auditlocators.clicknameactivity(driver).sendKeys(nameactivity);
				 Thread.sleep(2000);
				 auditlocators.clicksaveactivitybtn(driver).click();
				 Thread.sleep(3000);
				 
				 String messga3=auditlocators.clickactivityeme(driver).getText();
					if(messga3.equalsIgnoreCase("Activity Add successfully.")) 
					{
						test.log(LogStatus.PASS, "Activity Add successfully.");
					}
					else
					{
						test.log(LogStatus.FAIL, "Activity already exist");
					}
					
					
				 auditlocators.clickcancelactivitybtn(driver).click();
				 Thread.sleep(3000);
				 auditlocators.clickeditactivity(driver).click();
				 Thread.sleep(3000);
				 auditlocators.clickeditactivityname(driver).clear();
				 Thread.sleep(3000);
				 Row row26=sheet.getRow(26);
				  c1=row26.getCell(1);
				  String editactivityname = c1.getStringCellValue();	
					auditlocators.clickeditactivityname(driver).sendKeys(editactivityname);
					 Thread.sleep(2000);
					 auditlocators.clickeditsaveactivity(driver).click();
					 Thread.sleep(3000);
					 
					String messga5=auditlocators.clickactivityupdateme(driver).getText();
						if(messga5.equalsIgnoreCase("Activity Update successfully.")) 
						{
							test.log(LogStatus.PASS, "Activity Update successfully.");
						}
						else
						{
							test.log(LogStatus.FAIL, "Activity already exist");
						}
						
						
					 auditlocators.clickeditcancelactivity(driver).click();
					 Thread.sleep(3000);
}}
public static void department(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickdeparmentmaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickdeparmentadd(driver).click();
	 Thread.sleep(3000);
	 	auditlocators.clickdeparmentname(driver).click();
		 Thread.sleep(2000);
		 Row row27=sheet.getRow(27);
		  Cell c1=row27.getCell(1);
		  String deparmentname = c1.getStringCellValue();
		  auditlocators.clickdeparmentname(driver).sendKeys(deparmentname);
			 Thread.sleep(2000);
		 auditlocators.clickdeparmentsave(driver).click();
		 Thread.sleep(3000);
		 
		 String messga5=auditlocators.clickdeparmenteditmessage(driver).getText();
			if(messga5.equalsIgnoreCase("Department saved successfully")) 
			{
				test.log(LogStatus.PASS, "Department saved successfully");
			}
			else
			{
				test.log(LogStatus.FAIL, "Department already exist");
			}
		 auditlocators.clickdeparmentcancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickdeparmentedit(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickdeparmenteditname(driver).clear();
		 Thread.sleep(3000);
		 Row row28=sheet.getRow(28);
		  c1=row28.getCell(1);
		  String deparmenteditname = c1.getStringCellValue();	
			auditlocators.clickdeparmenteditname(driver).sendKeys(deparmenteditname);
			 Thread.sleep(2000);
			 auditlocators.clickdeparmenteditsave(driver).click();
			 Thread.sleep(3000);
			 String messga6=auditlocators.clickdeparmenteditmessage(driver).getText();
				if(messga6.equalsIgnoreCase("Department updated successfully")) 
				{
					test.log(LogStatus.PASS, "Department updated successfully");
				}
				else
				{
					test.log(LogStatus.FAIL, "Department already exist");
				}
							
			 auditlocators.clickdeparmenteditcancel(driver).click();
			 Thread.sleep(3000);
}
public static void observation(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	// auditlocators.clickobservation(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickobservation(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickobservationadd(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickobservationname(driver).click();
	 Thread.sleep(2000);
	 Row row30=sheet.getRow(30)				;
	 Cell c1=row30.getCell(1);
	  String observationname = c1.getStringCellValue();	
	  auditlocators.clickobservationname(driver).sendKeys(observationname);
		 Thread.sleep(2000);
		 auditlocators.clickobservationsave(driver).click();
		 Thread.sleep(3000);
		 String messg=auditlocators.clickobservationsubcategorymessage(driver).getText();
			if(messg.equalsIgnoreCase("Observation Category Save Successfully.")) 
			{
				test.log(LogStatus.PASS, "Observation Category Save Successfully.");
			}
			else
			{
				test.log(LogStatus.FAIL, "Observation category already exist");
			}
		 auditlocators.clickobservationcancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickobservationedit(driver).click();
		 Thread.sleep(5000);
		 auditlocators.clickobservationeditname(driver).clear();
		 Thread.sleep(4000);
		 Row row31=sheet.getRow(31);
		  c1=row31.getCell(1);
		  String observationeditname = c1.getStringCellValue();	
			auditlocators.clickobservationeditname(driver).sendKeys(observationeditname);
			 Thread.sleep(5000);
			 auditlocators.clickobservationeditsave(driver).click();
			 Thread.sleep(3000);
			 String msg=	 auditlocators.clickobservationsubcategoryeditmessage(driver).getText();
			if(msg.equalsIgnoreCase("Observation Category Updated Successfully.")) 
			{
				test.log(LogStatus.PASS, "Observation Category Updated Successfully.");
			}
			else
			{
				test.log(LogStatus.FAIL, "Observation category already exist");
			}
			 Thread.sleep(3000);
			 auditlocators.clickobservationeditcancel(driver).click();
			 Thread.sleep(5000);
			 
			auditlocators.clicksubobservation1(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubobservationadd(driver).click();
			 Thread.sleep(3000);
			 auditlocators.clicksubobservationname(driver).click();
			 Thread.sleep(2000);
			 Row row32=sheet.getRow(32);
			  c1=row32.getCell(1);
			  String subobservationname = c1.getStringCellValue();	
			  auditlocators.clicksubobservationname(driver).sendKeys(subobservationname);
				 Thread.sleep(2000);
				 auditlocators.clicksubobservationsave(driver).click();
				 Thread.sleep(3000);
				 auditlocators.clickobservationcancel(driver).click();
				 Thread.sleep(3000); 
				 auditlocators.clicksubobservationedit(driver).click();
				 Thread.sleep(5000);
				 auditlocators.clicksubobservationeditname(driver).clear();
				 Thread.sleep(3000);
				 Row row33=sheet.getRow(33);
				  c1=row33.getCell(1);
				  String subobservationeditname = c1.getStringCellValue();	
					auditlocators.clicksubobservationeditname(driver).sendKeys(subobservationeditname);
					 Thread.sleep(2000);
					 auditlocators.clicksubobservationeditsave(driver).click();
					 Thread.sleep(3000);
				String mesg=auditlocators.clickobservationmessagedisplay(driver).getText();
					if(mesg.equalsIgnoreCase("Observation Sub-Category Updated Successfully.")) 
					{
						test.log(LogStatus.PASS, "Observation Sub-Category Updated Successfully.");
					}
					else
					{
						test.log(LogStatus.FAIL, "Observation category already exist");
					}
					 Thread.sleep(3000);
					 auditlocators.clicksubobservationeditcancel(driver).click();
					 Thread.sleep(3000);
					 auditlocators.clicksubobservationbackbutton(driver).click();
					 Thread.sleep(3000);
					 
}

public static void riskcategory(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickriskcategory(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickriskcategoryadd(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickriskcategoryname(driver).click();
	 Thread.sleep(3000);
	 Row row35=sheet.getRow(35);
	 Cell c1=row35.getCell(1);
	  String riskcategoryname = c1.getStringCellValue();	
	  auditlocators.clickriskcategoryname(driver).sendKeys(riskcategoryname);
		 Thread.sleep(2000);
		 auditlocators.clickriskcategorysave(driver).click();
		 Thread.sleep(3000);
		 String msg=	 auditlocators.clickriskcategorymessage(driver).getText();
			if(msg.equalsIgnoreCase("Risk Category Successfully Add")) 
			{
				test.log(LogStatus.PASS, "Risk Category Successfully Add");
			}
			else
			{
				test.log(LogStatus.FAIL, "Category name already exists.");
			}
			 Thread.sleep(3000);
		 auditlocators.clickriskcategorycancel(driver).click();
		 Thread.sleep(3000); 
		 auditlocators.clickriskcategorysearchbox(driver).sendKeys("highest",Keys.ENTER);
		 Thread.sleep(3000); 
		 auditlocators.clickriskcategoryedit(driver).click();
		 Thread.sleep(3000); 
		 auditlocators.clickriskcategoryeditname(driver).clear();
		 Thread.sleep(3000);
		 Row row36=sheet.getRow(36);
		  c1=row36.getCell(1);
		  String riskcategoryeditname = c1.getStringCellValue();	
			auditlocators.clickriskcategoryeditname(driver).sendKeys(riskcategoryeditname);
			 Thread.sleep(2000);
			 auditlocators.clickriskcategoryeditsave(driver).click();
			 Thread.sleep(3000);
			 String mesge=	 auditlocators.clickriskcategorymessage(driver).getText();
				if(msg.equalsIgnoreCase("Risk Category Update Successfully")) 
				{
					test.log(LogStatus.PASS, "Risk Category Update Successfully");
				}
				else
				{
					test.log(LogStatus.FAIL, "Category name already exists.");
				}
				 Thread.sleep(3000);
			// test.log(LogStatus.PASS, "Risk category created Succesfully");
			 auditlocators.clickriskcategoryeditcancel(driver).click();
			 Thread.sleep(3000); 
			 auditlocators.clickriskcategoryfilter(driver).clear();
			 Thread.sleep(3000);
}
public static void auditormaster(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditormaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditormasteradd(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditormasterfirmname(driver).click();
	 Thread.sleep(3000);
	 Row row38=sheet.getRow(38);
	  Cell c1=row38.getCell(1);
	  String subauditormasterfirmname = c1.getStringCellValue();	
	  auditlocators.clickauditormasterfirmname(driver).sendKeys(subauditormasterfirmname);
		 Thread.sleep(2000);
	 auditlocators.clickauditormasterpartnername(driver).click();
	 Thread.sleep(3000);
	 Row row39=sheet.getRow(39);
	   c1=row39.getCell(1);
	  String auditormasterpartnername = c1.getStringCellValue();	
	  auditlocators.clickauditormasterpartnername(driver).sendKeys(auditormasterpartnername);
		 Thread.sleep(2000);
	 auditlocators.clickauditormastercontno(driver).click();
	 Thread.sleep(3000);
	 Row row40=sheet.getRow(40);
	  c1=row40.getCell(1);
	  int auditormastercontno = (int)c1.getNumericCellValue();	
	  auditlocators.clickauditormastercontno(driver).sendKeys(auditormastercontno+"");
		 Thread.sleep(2000);
		 
	 auditlocators.clickauditormastername(driver).click();
	 Thread.sleep(3000);
	 Row row41=sheet.getRow(41);
	  c1=row41.getCell(1);
	  String auditormastername = c1.getStringCellValue();	
	  auditlocators.clickauditormastername(driver).sendKeys(auditormastername);
		 Thread.sleep(2000);
	 auditlocators.clickauditormastercontact(driver).click();
	 Thread.sleep(3000);
	 Row row42=sheet.getRow(42);
	  c1=row42.getCell(1);
	 int auditormastercontact = (int)c1.getNumericCellValue();	
	  auditlocators.clickauditormastercontact(driver).sendKeys(auditormastercontact+"");
		 Thread.sleep(2000);
		 auditlocators.clickauditormastersave(driver).click();
		 Thread.sleep(3000);
		 String msg1=	 auditlocators.clickauditormastermessage(driver).getText();
			if(msg1.equalsIgnoreCase("Auditor details save successfully")) 
			{
				test.log(LogStatus.PASS, "Auditor details save successfully");
			}
			else
			{
				test.log(LogStatus.FAIL, "Auditor details already exists.");
			}
			 Thread.sleep(3000);
		 auditlocators.clickauditormastermessage(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickauditormastercancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickauditormasteredit(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clickauditormastereditname(driver).clear();
		 Thread.sleep(3000);
		 Row row43=sheet.getRow(43);
		  c1=row43.getCell(1);
		  String auditormastereditname= c1.getStringCellValue();	
			auditlocators.clickauditormastereditname(driver).sendKeys(auditormastereditname);
			 Thread.sleep(2000);
			 auditlocators.clickauditormasterupsave(driver).click();
			 Thread.sleep(3000);
			 String mesg1=	 auditlocators.clickauditormasterupmessage(driver).getText();
				if(mesg1.equalsIgnoreCase("Auditor details update successfully"))
				{
					test.log(LogStatus.PASS, "Auditor details update successfully");
				}
				else
				{
					test.log(LogStatus.FAIL, "Auditor details update successfully for this record.");
				}
				 Thread.sleep(3000);
			
			 auditlocators.clickauditormasterupcancel(driver).click();
			 Thread.sleep(3000);
}
public static void auditorteammaster(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditorteammaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditorteammasteradd(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditor(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickchooseauditor(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditorfirname(driver).click();
	 Thread.sleep(3000);
	 Row row45=sheet.getRow(45);
	 Cell c1=row45.getCell(1);
	  String auditorfirname = c1.getStringCellValue();	
	  auditlocators.clickauditorfirname(driver).sendKeys(auditorfirname);
		 Thread.sleep(2000);
	 auditlocators.clickauditorlasname(driver).click();
	 Thread.sleep(3000);
	 Row row46=sheet.getRow(46);
	 c1=row46.getCell(1);
	  String auditorlasname = c1.getStringCellValue();	
	  auditlocators.clickauditorlasname(driver).sendKeys(auditorlasname);
		 Thread.sleep(2000);
	 auditlocators.clickauditoremail(driver).click();
	 Thread.sleep(3000);
	 Row row47=sheet.getRow(47);
	  c1=row47.getCell(1);
	  String auditoremail = c1.getStringCellValue();	
	  auditlocators.clickauditoremail(driver).sendKeys(auditoremail);
		 Thread.sleep(2000);
	 auditlocators.clickauditorcont(driver).click();
	 Thread.sleep(3000);
	 Row row48=sheet.getRow(48);
	   c1=row48.getCell(1);
	 int auditorcont = (int)c1.getNumericCellValue();	
	  auditlocators.clickauditorcont(driver).sendKeys(auditorcont+"");
		 Thread.sleep(2000);
	 auditlocators.clickauditorsave(driver).click();
	 Thread.sleep(3000);
	 String mesg2=auditlocators.clickauditormessage(driver).getText();
		if(mesg2.equalsIgnoreCase("User save successfully"))
		{
			test.log(LogStatus.PASS, "User save successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "User already exist for this record.");
		}
		 Thread.sleep(3000);
	
	 auditlocators.clickauditorcancel(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickselectauditor(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditorname(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditoredit(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickauditoreditname(driver).clear();
	 Thread.sleep(3000);
	 Row row49=sheet.getRow(49);
	  c1=row49.getCell(1);
	  String auditoreditname = c1.getStringCellValue();	
	  auditlocators.clickauditoreditname(driver).sendKeys(auditoreditname);
		 Thread.sleep(2000);
	 auditlocators.clickauditoreditsave(driver).click();
	 Thread.sleep(3000);
	 String mesg3=	 auditlocators.clickauditoreditmess(driver).getText();
		if(mesg3.equalsIgnoreCase("User save successfully"))
		{
			test.log(LogStatus.PASS, "User save successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "User already exist for this record.");
		}
		 Thread.sleep(3000);
	 auditlocators.clickauditoreditcancel(driver).click();
	 Thread.sleep(3000); 
}
public static void verticalmaster(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickverticalmaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickverticalmasteradd(driver).click();
	 Thread.sleep(3000);
     auditlocators.clickverticalmastername(driver).click();
	 Thread.sleep(3000);
	 Row row51=sheet.getRow(51);
	 Cell c1=row51.getCell(1);
	  String verticalmastername = c1.getStringCellValue();	
    auditlocators.clickverticalmastername(driver).sendKeys(verticalmastername);
	Thread.sleep(2000);
	auditlocators.clickverticalmastersave(driver).click();
	Thread.sleep(3000);
	 String mesg4=	 auditlocators.clickverticalmastermessage(driver).getText();
		if(mesg4.equalsIgnoreCase("Vertical Name Save Successfully."))
		{
			test.log(LogStatus.PASS, "Vertical Name Save Successfully.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Vertical with same name already exists.");
		}
		 Thread.sleep(3000);
	 auditlocators.clickverticalmastercancel(driver).click();
	 Thread.sleep(3000);
	 
	 auditlocators.clickverticalmasteredit(driver).click();
	 Thread.sleep(3000); 
	 auditlocators.clickverticalmastereditname(driver).clear();
	 Thread.sleep(3000);
	 Row row52=sheet.getRow(52);
	  c1=row52.getCell(1);
	  String verticalmastereditname = c1.getStringCellValue();	
		auditlocators.clickverticalmastereditname(driver).sendKeys(verticalmastereditname);
		 Thread.sleep(2000);
		 auditlocators.clickverticalmastereditsave(driver).click();
		 Thread.sleep(3000);
	 
	 String mesg5=	 auditlocators.clickverticalmastermessage(driver).getText();
		if(mesg5.equalsIgnoreCase("Vertical Name Updated Successfully."))
		{
			test.log(LogStatus.PASS, "Vertical Name Updated Successfully.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Vertical name already exist in the system.");
		}
		 Thread.sleep(3000);
		 auditlocators.clickverticalmastereditcancel(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clicklocationverticalmapping(driver).click();
		 Thread.sleep(5000);
		driver.switchTo().frame(auditlocators.clicklocationverticalmappingframe(driver));
		 auditlocators.clicklocationverticalmappingselect(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clicklocationverticalmappingchoose(driver).click();
		 Thread.sleep(3000);
		 auditlocators.clicklocationverticalmappingsave(driver).click();
		 Thread.sleep(3000);
		 String mesg6=	 auditlocators.clicklocationverticalmappingmessage(driver).getText();
			if(mesg6.equalsIgnoreCase("Location-Vertical Mapping Save Successfully."))
			{
				test.log(LogStatus.PASS, "Location-Vertical Mapping Save Successfully.");
			}
			else
			{
				test.log(LogStatus.FAIL, "Location-Vertical already mapped.");
			}
			 Thread.sleep(3000);
		 //auditlocators.clicklocationverticalmappingmessage(driver).click();
		 //Thread.sleep(3000);
		 auditlocators.clicklocationverticalmappingdownload(driver).click();
		 Thread.sleep(3000);
		 driver.switchTo().parentFrame();
		 auditlocators.clicklocationverticalmappingclose(driver).click();
		 Thread.sleep(3000);
}
public static void statemaster(ExtentTest test)throws InterruptedException {
	 auditlocators.clickMaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickstatemaster(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickstatemasteradd(driver).click();
	 Thread.sleep(3000);
    auditlocators.clickstatename(driver).click();
	 Thread.sleep(3000);
	 Row row54=sheet.getRow(54);
	  Cell c1=row54.getCell(1);
	  String statename = c1.getStringCellValue();	
		auditlocators.clickstatename(driver).sendKeys(statename);
		 Thread.sleep(2000);
	 
	 auditlocators.clickcountry(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickcountrychoose(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickstatesave(driver).click();
	 Thread.sleep(3000);
	 String mesg6=	 auditlocators.clickmessagestate(driver).getText();
		if(mesg6.equalsIgnoreCase("State Saved Successfully"))
		{
			test.log(LogStatus.PASS, "State Saved Successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "State Already Exists");
		}
		 Thread.sleep(3000);
	 auditlocators.clickstatecancel(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickchoosecountry(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickstatesearch(driver).click();
	 Thread.sleep(3000);
	 auditlocators.clickstateedit(driver).click();
	 Thread.sleep(3000); 
	 auditlocators.clickstateeditname(driver).clear();
	 Thread.sleep(3000);
	 Row row55=sheet.getRow(55);
	  c1=row55.getCell(1);
	  String stateeditname = c1.getStringCellValue();	
		auditlocators.clickstateeditname(driver).sendKeys(stateeditname);
		 Thread.sleep(2000);
		 auditlocators.clickstateeditsave(driver).click();
		 Thread.sleep(3000);
	 
	 String mesg7=	 auditlocators.clickstateeditmessage(driver).getText();
		if(mesg7.equalsIgnoreCase("State Updated Successfully"))
		{
			test.log(LogStatus.PASS, "State Updated Successfully");
		}
		else
		{
			test.log(LogStatus.FAIL, "State Updated Successfully");
		}
		 Thread.sleep(3000);
		 auditlocators.clickverticalmastereditcancel(driver).click();
         Thread.sleep(3000);
}
         
         public static void citymaster(ExtentTest test)throws InterruptedException {
        	 auditlocators.clickMaster(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcitymaster(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcitymasteradd(driver).click();
        	 Thread.sleep(3000);
            auditlocators.clickcityname(driver).click();
        	 Thread.sleep(3000);
        	 Row row57=sheet.getRow(57);
        	  Cell c1=row57.getCell(1);
        	  String cityname = c1.getStringCellValue();	
        		auditlocators.clickcityname(driver).sendKeys(cityname);
        		 Thread.sleep(2000);
        	 
        	 auditlocators.clickcountry(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcountrychoose(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcitysave(driver).click();
        	 Thread.sleep(3000);
        	 String mesg7=	 auditlocators.clickcitysavemessage(driver).getText();
        		if(mesg7.equalsIgnoreCase("City Saved Successfully"))
        		{
        			test.log(LogStatus.PASS, "City Saved Successfully");
        		}
        		else
        		{
        			test.log(LogStatus.FAIL, "City Already Exists");
        		}
        		 Thread.sleep(3000);
        	 auditlocators.clickcitycancel(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcitycountry(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickselectcitycountry(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcitystate(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickselectcitystate(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcitysearch(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickcityedit(driver).click();
        	 Thread.sleep(3000); 
        	 auditlocators.clickcityeditname(driver).clear();
        	 Thread.sleep(3000);
        	 Row row58=sheet.getRow(58);
        	  c1=row58.getCell(1);
        	  String cityeditname = c1.getStringCellValue();	
        		auditlocators.clickcityeditname(driver).sendKeys(cityeditname);
        		 Thread.sleep(2000);
        		 auditlocators.clickcityeditsave(driver).click();
        		 Thread.sleep(3000);
        	 
        	 String mesg8=auditlocators.clickcityeditsavemessage(driver).getText();
        		if(mesg8.equalsIgnoreCase("City Updated Successfully"))
        		{
        			test.log(LogStatus.PASS, "City Updated Successfully");
        		}
        		else
        		{
        			test.log(LogStatus.FAIL, "City Already Exist");
        		}
        		 Thread.sleep(3000);
        		 auditlocators.clickverticalmastereditcancel(driver).click();
        		 Thread.sleep(3000);
        		 auditlocators.clickcityeditcancel(driver).click();
        		 Thread.sleep(3000);
        
}
         public static void procesratingmaster(ExtentTest test)throws InterruptedException {
        	 auditlocators.clickMaster(driver).click();
        	 Thread.sleep(5000);
        	 auditlocators.clickprocessratingmaster(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickprocessratingmasteradd(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickprocessratingmastername(driver).click();
        	 Thread.sleep(3000);
        	 Row row60=sheet.getRow(60);
       	  Cell c1=row60.getCell(1);
       	  String processratingmastername = c1.getStringCellValue();	
       		auditlocators.clickprocessratingmastername(driver).sendKeys(processratingmastername);
       		 Thread.sleep(2000);
        	 auditlocators.clickprocessratingmasterdescription(driver).click();
        	 Thread.sleep(3000);
        	 Row row61=sheet.getRow(61);
       	   c1=row61.getCell(1);
       	  String processratingmasterdescription = c1.getStringCellValue();	
       		auditlocators.clickprocessratingmasterdescription(driver).sendKeys(processratingmasterdescription);
       		 Thread.sleep(2000);
        	 auditlocators.clickprocessratingmastersave(driver).click();
        	 Thread.sleep(3000);
        	 
        	 String mesg9=auditlocators.clickprocessratingmastersavemessage(driver).getText();
     		if(mesg9.equalsIgnoreCase("Process Saved Successfully"))
     		{
     			test.log(LogStatus.PASS, "Process Saved Successfully");
     		}
     		else
     		{
     			test.log(LogStatus.FAIL, "Process already exist");
     		}
     		 Thread.sleep(3000);
        	 auditlocators.clickprocessratingmastercancel(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickprocessratingmasteredit(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickprocessratingmastereditname(driver).clear();
        	 Thread.sleep(3000);
        	 Row row62=sheet.getRow(62);
       	     c1=row62.getCell(1);
       	     String processratingmastereditname = c1.getStringCellValue();	
       		 auditlocators.clickprocessratingmastereditname(driver).sendKeys(processratingmastereditname);
       		 Thread.sleep(2000);
        	 auditlocators.clickprocessratingmastereditsave(driver).click();
        	 Thread.sleep(3000);
        	 String mesg10=auditlocators.clickprocessratingmastersavemessage(driver).getText();
      		if(mesg10.equalsIgnoreCase("Process Updated Successfully"))
      		{
      			test.log(LogStatus.PASS, "Process Updated Successfully");
      		}
      		else
      		{
      			test.log(LogStatus.FAIL, "Process already exist");
      		}
      		 Thread.sleep(3000);
        	 auditlocators.clickprocessratingmastereditclose(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickprocessratingmasterdelete(driver).click();
        	 Thread.sleep(3000);
        	String message=driver.switchTo().alert().getText();
        	test.log(LogStatus.PASS, "Message display" +message);
        	driver.switchTo().alert().dismiss();
        	 
}

         public static void Auditassignment(ExtentTest test)throws InterruptedException {
        	 auditlocators.clickauditreporting(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickauditassignment(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickauditassignmentadd(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickauditassignmentselect(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickauditassignmentselectcompany(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickauditassignmentsave(driver).click();
        	 Thread.sleep(3000);
        	 
        	 
        	 String mesg9=auditlocators.clickauditassignmentmessage(driver).getText();
     		if(mesg9.equalsIgnoreCase("Audit Assignment Save Successfully."))
     		{
     			test.log(LogStatus.PASS, "Audit Assignment Save Successfully.");
     		}
     		else
     		{
     			test.log(LogStatus.FAIL, "Audit Assignment Save Successfully.");
     		}
     		 Thread.sleep(3000);
     		auditlocators.clickauditassignmentclose(driver).click();
       	    Thread.sleep(3000);
     		auditlocators.clickauditassignmentfilter1(driver).click();
       	    Thread.sleep(3000);
       	    auditlocators.clickauditassignmentselectfilter1(driver).click();
    	    Thread.sleep(3000);
    	    auditlocators.clickauditassignmentfilter2(driver).click();
       	    Thread.sleep(3000);
       	    auditlocators.clickauditassignmentselectfilter2(driver).click();
    	    Thread.sleep(3000);
         }
         public static void mydocument(ExtentTest test)throws InterruptedException {
        	 auditlocators.clickmydocument(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmydocumentcompany(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmydocumentselectcompany(driver).click();
        	 Thread.sleep(5000);
      		 auditlocators.clickmydocumentdownload(driver).click();
        	 Thread.sleep(3000);
        	/*String mesg10=auditlocators.clickmydocumentmessage(driver).getText();
      		if(mesg10.equalsIgnoreCase("No Document available to Download.."))
      		{
      			test.log(LogStatus.PASS, "No Document available to Download..");
      		}
      		else
      		{
      			test.log(LogStatus.FAIL, "No Document available to Download.");
      		}
      		 Thread.sleep(3000);*/
        	
        	 WebDriverWait wait = new WebDriverWait(driver, (400));
        	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']")));
}
         
         public static void myreport(ExtentTest test)throws InterruptedException {
        	// driver.manage().window()
        	 auditlocators.clickmyreport(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmyreportexecutivereport(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmyreportcompany(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmyreportselectcompany(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmyreportexecutivedownload(driver).click();
        	 Thread.sleep(3000);
        	// String mesg11=auditlocators.clickmyreportexecutivemessage(driver).getText();
       		//if(mesg11.equalsIgnoreCase("You need to generate report first."))
       		//{
       			//test.log(LogStatus.FAIL, "You need to generate report first");
       		//}
       		//else
       		//{
       			//test.log(LogStatus.FAIL, "You need to generate report first");
       		//}
       		
       		auditlocators.clickmyreport(driver).click();
       	 Thread.sleep(3000);
       	 auditlocators.clickmyreportfinalaudit(driver).click();
       		 Thread.sleep(3000);
       		auditlocators.clickmyreportfinalauditcompany(driver).click();
       	 Thread.sleep(3000);
       	auditlocators.clickmyreportfinalauditselectcompany(driver).click();
       	 Thread.sleep(3000);
       	 auditlocators.clickmyreportfinalauditdownload(driver).click();
       	 Thread.sleep(3000);
       	 File dire = new File("C:\\Users\\ambuj\\Downloads");
       		File[] dirContentes = dire.listFiles(); // Counting number of files in directory before download

       		Thread.sleep(500);
       		auditlocators.clickmyreportfinalauditdownload(driver).click(); // Exporting (Downloading) file

       		Thread.sleep(3000);// C://Users//jiya//Downloads//
       		File dir11 = new File("C:\\Users\\ambuj\\Downloads");
       		File[] allFilesNew11 = dir11.listFiles(); // Counting number of files in directory after download
       		Thread.sleep(3000);
       		
       	if (dirContentes.length < allFilesNew11.length) {
       			test.log(LogStatus.PASS, " :- File downloaded successfully.");
       		} else {
       			test.log(LogStatus.INFO, " :- File does not downloaded.");
       		}

       		
       		auditlocators.clickmyreport(driver).click();
      	   Thread.sleep(3000);
         		auditlocators.clickmyreportinternalaudit(driver).click();
            	 Thread.sleep(3000);
            	auditlocators.clickmyreportinternalauditcompany(driver).click();
           	 Thread.sleep(3000);
           	auditlocators.clickmyreportinternalauditselectcompany(driver).click();
           	 Thread.sleep(3000);
           	auditlocators.clickmyreportinternalauditdownload(driver).click();
          	 Thread.sleep(3000);
           	auditlocators.clickmyreportinternalauditmessage(driver).click();
           	 Thread.sleep(3000);
           	 
           	auditlocators.clickmyreport(driver).click();
       	   Thread.sleep(3000);
          		auditlocators.clickmyreportopenobservation(driver).click();
             	 Thread.sleep(3000);
             	auditlocators.clickmyreportopenobservationcompany(driver).click();
            	 Thread.sleep(3000);
            	auditlocators.clickmyreportopenobservationselectcompany(driver).click();
            	 Thread.sleep(5000);
            	auditlocators.clickmyreportopenobservationexporttoexcel(driver).click();
           	 Thread.sleep(3000);
            			
       auditlocators.clickmyreport(driver).click();
 	   Thread.sleep(3000);
    		auditlocators.clickmyreportobservationsummary(driver).click();
       	 Thread.sleep(3000);
       	auditlocators.clickmyreportobservationcompany(driver).click();
      	 Thread.sleep(3000);
      	auditlocators.clickmyreportobservationselectcompany(driver).click();
      	 Thread.sleep(3000);
      	auditlocators.clickmyreportobservationok(driver).click();
     	 Thread.sleep(3000);
      	auditlocators.clickmyreportobservationexporttoexcel(driver).click();
      	 Thread.sleep(3000);
      	 
      	auditlocators.clickmyreport(driver).click();
  	   Thread.sleep(3000);
     		auditlocators.clickmyreportschedulingdeviation(driver).click();
        	 Thread.sleep(3000);
        	auditlocators.clickmyreportschedulingcompany(driver).click();
       	 Thread.sleep(3000);
       	auditlocators.clickmyreportschedulingselectcompany(driver).click();
       	 Thread.sleep(3000);
       	auditlocators.clickmyreportschedulingtype(driver).click();
      	 Thread.sleep(3000);
       	auditlocators.clickmyreportschedulingselecttype(driver).click();
       	 Thread.sleep(3000);
     	auditlocators.clickmyreportschedulingperiod(driver).click();
      	 Thread.sleep(3000);
     	auditlocators.clickmyreportschedulingselectperiod(driver).click();
      	 Thread.sleep(3000);
     	auditlocators.clickmyreportschedulingexporttoexcel(driver).click();
      	 Thread.sleep(3000);
      	 
      	auditlocators.clickmyreport(driver).click();
   	   Thread.sleep(3000);
      		auditlocators.clickmyreportmanagementresponse(driver).click();
         	 Thread.sleep(3000);
         	auditlocators.clickmyreportmanagementresponsecompany(driver).click();
        	 Thread.sleep(3000);
        	auditlocators.clickmyreportmanagementresponseselectcompany(driver).click();
        	 Thread.sleep(3000);
        	auditlocators.clickmyreportmanagementresponsefinancial(driver).click();
       	 Thread.sleep(3000);
        	auditlocators.clickmyreportmanagementresponseselectfinancial(driver).click();
        	 Thread.sleep(3000);
      	auditlocators.clickmyreportmanagementresponseselectscheduling(driver).click();
       	 Thread.sleep(3000);
      	auditlocators.clickmyreportmanagementresponseselectselectscheduling(driver).click();
       	 Thread.sleep(3000);
      	auditlocators.clickmyreportmanagementresponseperiod(driver).click();
       	 Thread.sleep(3000);
       	auditlocators.clickmyreportmanagementresponseselectperiod(driver).click();
      	 Thread.sleep(3000);
      	auditlocators.clickmyreportmanagementresponseexporttoexcel(driver).click();
      	 Thread.sleep(3000);
       	 
       	 
       	auditlocators.clickmyreport(driver).click();
    	   Thread.sleep(3000);
       		auditlocators.clickmyreportprerequisit(driver).click();
          	 Thread.sleep(3000);
          	auditlocators.clickmyreportprerequisitcompancy(driver).click();
         	 Thread.sleep(3000);
         	auditlocators.clickmyreportprerequisitselectcompancy(driver).click();
         	 Thread.sleep(3000);
         	auditlocators.clickmyreportprerequisitfinancial(driver).click();
        	 Thread.sleep(3000);
         	auditlocators.clickmyreportprerequisitselectfinancial(driver).click();
         	 Thread.sleep(3000);
          	auditlocators.clickmyreportprerequisitscheduling(driver).click();
        	 Thread.sleep(3000);
         	auditlocators.clickmyreportmyreportprerequisitselectscheduling(driver).click();
        	 Thread.sleep(3000);
         	auditlocators.clickmyreportmyreportprerequisitperiod(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmyreportmyreportprerequisitselectperiod(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickmyreportmyreportprerequisitexporttoexcel(driver).click();
        	 Thread.sleep(3000);
        	 
        	 auditlocators.clickmyreport(driver).click();
      	   Thread.sleep(3000);
         		auditlocators.clickmyreportauditscheduling(driver).click();
            	 Thread.sleep(3000);
            	auditlocators.clickmyreportauditschedulingcompancy(driver).click();
           	 Thread.sleep(3000);
           	auditlocators.clickmyreportauditschedulingselectcompancy(driver).click();
           	 Thread.sleep(3000);
           	auditlocators.clickmyreportauditschedulingexporttoexcel(driver).click();
          	 Thread.sleep(3000);
          	File dir = new File("C:\\Users\\ambuj\\Downloads");
    		File[] dirContents = dir.listFiles(); // Counting number of files in directory before download

    		Thread.sleep(500);
    		auditlocators.clickmyreportauditschedulingexporttoexcel(driver).click(); // Exporting (Downloading) file

    		Thread.sleep(3000);// C://Users//jiya//Downloads//
    		File dir1 = new File("C:\\Users\\ambuj\\Downloads");
    		File[] allFilesNew = dir1.listFiles(); // Counting number of files in directory after download
    		Thread.sleep(3000);
    		
    if (dirContents.length < allFilesNew.length) {
    			test.log(LogStatus.PASS, " :- File downloaded successfully.");
    		} else {
    			test.log(LogStatus.INFO, " :- File does not downloaded.");
    		}
	 
   	auditlocators.clickmyreport(driver).click();
	   Thread.sleep(3000);
   		auditlocators.clickmyreportauditstatus(driver).click();
      	 Thread.sleep(3000);
      	auditlocators.clickmyreportauditstatuscompany(driver).click();
     	 Thread.sleep(3000);
     	auditlocators.clickmyreportauditstatusselectcompany(driver).click();
     	 Thread.sleep(3000);
     	auditlocators.clickmyreportauditstatusexporttoexcel(driver).click();
     	 Thread.sleep(3000);
     	File dir2 = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents1 = dir2.listFiles(); // Counting number of files in directory before download

		Thread.sleep(500);
		auditlocators.clickmyreportauditschedulingexporttoexcel(driver).click(); // Exporting (Downloading) file

		Thread.sleep(3000);// C://Users//jiya//Downloads//
		File dir3 = new File("C:\\Users\\ambuj\\Downloads");
		File[] allFilesNew1 = dir3.listFiles(); // Counting number of files in directory after download
		Thread.sleep(3000);
		
if (dirContents1.length < allFilesNew1.length) {
			test.log(LogStatus.PASS, " :- File downloaded successfully.");
		} else {
			test.log(LogStatus.FAIL, " :- File does not downloaded.");
		}
 auditlocators.clickmyreport(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastaudit(driver).click();
	 Thread.sleep(3000);
	auditlocators.clickmyreportpastauditaddnew(driver).click();
 Thread.sleep(3000);
auditlocators.clickmyreportpastauditunit(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditselectunit(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditfinancial(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditselectfinancial(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditauditbackground(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditselectauditbackground(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastaudituploadfile(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditsave(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditclose(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditview(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditedit(driver).click();
 Thread.sleep(3000);
 auditlocators.clickmyreportpastauditcancel(driver).click();
 Thread.sleep(3000);
         }
         public static void configuration(ExtentTest test)throws InterruptedException { // live login
        	 auditlocators.clickconfiguration(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemaster(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemasteraddnew(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemasterprofilename(driver).sendKeys("Group HR");
        	 Thread.sleep(3000);
             auditlocators.clickconfigurationprofilemasterlevel(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemasterselectlevel(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprocess(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickselectconfigurationprocess(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickok(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemastersave(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemasterclose(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemasteredit(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemastercancel(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilemasterdeactivate(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfiguration(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofile(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofileclick(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofileuser(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofileselectuser(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilesave(driver).click();
        	 Thread.sleep(3000);
        	 String mesg=auditlocators.clickconfigurationmessage(driver).getText();
				if(mesg.equalsIgnoreCase("Profile users saved successfully.")) 
				{
					test.log(LogStatus.PASS, "Profile users saved successfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Profile users not saved successfully.");
				}
				 Thread.sleep(3000);
				 auditlocators.clickconfigurationeditmessage(driver).click();
	        	 Thread.sleep(3000);
				 
        	 auditlocators.clickconfigurationescalation(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationescalationaddnew(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationprofilename(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationselectprofile(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationadd(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationsave(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationnocancel(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationnoview(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationcross(driver).click();
        	 Thread.sleep(3000);
        	 
        	 auditlocators.clickconfiguration(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationhod(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationhodaddnew(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickhodprofile(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickhodselectprofile(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickhodtimeline(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickhodsave(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickhodcancel(driver).click();
        	 Thread.sleep(3000);
        	
        	 auditlocators.clickconfiguration(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationdashboard(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationdashboardselect(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationdashboardselectprofile(driver).click();
        	 Thread.sleep(3000);
        	 auditlocators.clickconfigurationdashboardsave(driver).click();
        	 Thread.sleep(3000); 
         }
}