package Auditlogin;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginexcel {
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;
	public static WebDriver driver=null;
	public static Row row=null;
	public static Cell cell=null;
	
	@BeforeTest()
	public void m() throws InterruptedException, IOException {
		{
			 System.setProperty("webdriver.chrome.driver","D://eclipse-workspace//Audit//chromedriver_win32//chromedriver.exe"); 
			 driver=new ChromeDriver();       //Created new Chrome driver instance.
			  
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
			WebElement userName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		    userName.sendKeys(uname); 
		    Row row2 = sheet.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
	       WebElement password1=driver.findElement(By.xpath("//*[@id='txtpass']"));
		  password1.sendKeys(password);
		  WebElement signBtn=driver.findElement(By.xpath("//*[@id='Submit']"));
		  signBtn.click();  
		  WebElement DonotAcc=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		  DonotAcc.click();  
		  Thread.sleep(3000);
		  WebElement firstQ=driver.findElement(By.id("txtAnswer1"));
		  firstQ.sendKeys("123");
		  WebElement secQ=driver.findElement(By.xpath("//*[@id='txtAnswar2']"));
		  secQ.sendKeys("123");
		  WebElement validate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		  validate.click();
		  WebElement ars=driver.findElement(By.xpath("//*[@id='dvbtnAudit']/div[1]/img"));
		  ars.click();  
		  
		 
		  
		
		}  
	}
	
	//@Test(priority=1)
	  public void f() throws InterruptedException, IOException {
		 /*System.setProperty("webdriver.chrome.driver","D://eclipse-workspace//Audit//chromedriver_win32//chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();       //Created new Chrome driver instance.
		  
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
		WebElement userName=driver.findElement(By.xpath("//*[@id='txtemail']"));
	    userName.sendKeys(uname); 
	    Row row2 = sheet.getRow(2);		               //Selected 2nd index row (Third row)
        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
	    String password = c1.getStringCellValue();
       WebElement password1=driver.findElement(By.xpath("//*[@id='txtpass']"));
	  password1.sendKeys(password);
	  WebElement signBtn=driver.findElement(By.xpath("//*[@id='Submit']"));
	  signBtn.click();  
	  WebElement DonotAcc=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
	  DonotAcc.click();  
	  Thread.sleep(3000);
	  WebElement firstQ=driver.findElement(By.id("txtAnswer1"));
	  firstQ.sendKeys("123");
	  WebElement secQ=driver.findElement(By.xpath("//*[@id='txtAnswar2']"));
	  secQ.sendKeys("123");
	  WebElement validate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
	  validate.click();
	  WebElement ars=driver.findElement(By.xpath("//*[@id='dvbtnAudit']/div[1]/img"));
	  ars.click();  */
	  
	  WebElement master=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
	  master.click();
	  Thread.sleep(3000);
	  
	  WebElement usermaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
	  usermaster.click();
	  Thread.sleep(3000);
	  
	  WebElement addnew=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddUser']"));
	  addnew.click();
	  Thread.sleep(3000);
	  
	 // WebElement frame=driver.findElement(By.xpath("//*[@id='divCustomersDialog']/div/div/div[2]"));
	  //driver.switchTo().frame(frame);
	  
	  Row row4=sheet.getRow(4);
	 Cell c1=row4.getCell(1);
	  String FirstName = c1.getStringCellValue();	
	  
	  WebElement firstname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxFirstName']"));
	  firstname1.sendKeys(FirstName);
	  Thread.sleep(3000);
	  
	  Row row5 = sheet.getRow(5);		               
      c1 = row5.getCell(1);		
      
	    String LastName = c1.getStringCellValue();
     WebElement lastname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxLastName']"));
	  lastname1.sendKeys(LastName);
	  Thread.sleep(3000);
	  
	  Row row6 = sheet.getRow(6);		               
      c1 = row6.getCell(1);	
      
      String Designation = c1.getStringCellValue();
      
      WebElement Designation1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxDesignation']"));
      Designation1.sendKeys(Designation);
	  Thread.sleep(3000); 
	  
	  Row row7 = sheet.getRow(7);		               
      c1 = row7.getCell(1);	
      
      String Email = c1.getStringCellValue();
      WebElement email1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxEmail']"));
      
     email1.sendKeys(Email);
	  Thread.sleep(3000); 
	  
	  Row row8 = sheet.getRow(8);		               
      c1 = row8.getCell(1);	
      int contact= (int)c1.getNumericCellValue();
      
      WebElement contactno=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxContactNo']"));
      contactno.sendKeys( contact+"");
      
    
      WebElement department1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']"));
      department1.click();
      
      WebElement departmentIT=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[3]"));
      departmentIT.click();
      
      WebElement role=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']"));
		role.click();
		Thread.sleep(3000);
		
		  WebElement role1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]"));
			role1.click();
			Thread.sleep(3000);
			
		 JavascriptExecutor js=(JavascriptExecutor) driver ;
			js.executeScript("window.scroll(0,500)");
			Thread.sleep(3000);
			
		//WebElement customer=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlCustomer'])"));
	    //customer.click();
		//Thread.sleep(3000);
		
		//WebElement customer1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlCustomer']/option[2])"));
		//customer1.click();
		//Thread.sleep(3000);
		//WebElement reporting=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlReportingTo'])"));
		//reporting.click();
	    //Thread.sleep(3000);
		
		//Row row9 = sheet.getRow(9);				
		//c1 = row9.getCell(1);					
		//String Address = c1.getStringCellValue();
		//WebElement address=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxAddress']"));
		//address.sendKeys(Address);
		//Thread.sleep(3000);
		
		//WebElement choosee=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_UserImageUpload'])"));
		//choosee.sendKeys("C://Users//ambuj//Pictures//Screenshots//Screenshot(3).png");
		//Thread.sleep(3000);
		
		WebElement saveBtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnSave']"));
		saveBtn.click();
		Thread.sleep(3000);
		// message=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_upUsers']/div/div[18]/p)"));
		//message.getText();
		//Thread.sleep(3000);
		
		//driver.switchTo().parentFrame();
		
		WebElement close=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnCancel']"));
		close.click();
		
		
		  
		}
	
	//@Test(priority=2)
	public void i() throws InterruptedException, IOException {
		 WebElement master=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		  master.click();
		  Thread.sleep(3000);
		  
		  WebElement usermaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
		  usermaster.click();
		  Thread.sleep(3000);

		
		WebElement search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));

		search.sendKeys("kamal",Keys.ENTER);
		 Thread.sleep(3000);
		
		WebElement edituser=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnEdit_0']/img"));
        edituser.click();
        Thread.sleep(5000);
        
        WebElement firstname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxFirstName']"));
  	  firstname1.clear();
  	  Thread.sleep(3000);
  	  firstname1.sendKeys("Samar");
  	 JavascriptExecutor js=(JavascriptExecutor) driver ;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(3000);
		WebElement saveBtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnSave']"));
		saveBtn.click();
		Thread.sleep(3000);
		WebElement close=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnCancel']"));
		close.click();
	}
	//@Test(priority=3)
		public void deleteuser() throws InterruptedException

		{
			WebElement master1=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
			  master1.click();
			  Thread.sleep(3000);
			  
			  WebElement usermaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
			  usermaster.click();
			  Thread.sleep(3000);
			  
			  WebElement search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));

				search.sendKeys("samar",Keys.ENTER);
				 Thread.sleep(5000);
				 
				 WebElement delete=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnDelete_0']/img"));
				 delete.click();
				 Thread.sleep(3000);
				 
				 driver.switchTo().alert().accept();

				 Thread.sleep(3000);
				 
				 WebElement searchs=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));

				 searchs.clear();

				 Thread.sleep(3000);
				  

		}
	//@Test(priority=4)
	public void forgetpassword() throws InterruptedException
	{
		WebElement master1=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		  master1.click();
		  Thread.sleep(3000);
		  
		  WebElement usermaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
		  usermaster.click();
		  Thread.sleep(3000);
		  
		  WebElement search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));

			search.sendKeys("kamal",Keys.ENTER);
			 Thread.sleep(5000);
			 
			 WebElement forgotpassword=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnReset_0']/img"));

			 forgotpassword.click();

			 Thread.sleep(3000);
			 
			 driver.switchTo().alert().accept();
			 Thread.sleep(3000);
			 
			 driver.switchTo().alert().accept();

			 Thread.sleep(2000);
			 
		  
		
	}
	//@Test(priority=5)
	public void cretaunit() throws InterruptedException
	{
		WebElement master=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		  master.click();
		  Thread.sleep(3000);
		  
		  WebElement usermaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[1]/a"));
		  usermaster.click();
		  Thread.sleep(3000);
		  
		  WebElement addnew=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCustomerBranch']"));
		  addnew.click();
		  Thread.sleep(3000);
		  
		  Row row4=sheet.getRow(4);
			 Cell c1=row4.getCell(1);
			  String UnitName = c1.getStringCellValue();	
			  WebElement UnitName1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
			 UnitName1.sendKeys(UnitName);
			  Thread.sleep(3000);
			  
			  WebElement Unittype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']"));
		      Unittype.click();
		      Thread.sleep(3000);
		      
		      WebElement unitbranch=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlType\"]/option[3]"));
		      unitbranch.click();
		      Thread.sleep(3000);
		      
		      Row row5=sheet.getRow(5);
				 c1=row5.getCell(1);
				  String Address = c1.getStringCellValue();	
				  WebElement Address1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddressLine1']"));
				  Address1.sendKeys(Address);
				  Thread.sleep(3000);
				   
				  WebElement State=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlState']"));
			      State.click();
			      Thread.sleep(3000);
			      
			      WebElement State1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlState\"]/option[7]"));
			      State1.click();
			      Thread.sleep(3000);
			      
			      WebElement City=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']"));
			     City.click();
			      Thread.sleep(3000);
			      
			      WebElement City1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']/option[5]"));
			      City1.click();
			      Thread.sleep(3000);
			      
			      Row row6=sheet.getRow(6);
					 c1=row6.getCell(1);
					  String Contactperson = c1.getStringCellValue();	
					  WebElement Contactperson1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxContactPerson']"));
					  Contactperson1.sendKeys(Contactperson);
					  Thread.sleep(3000);
					  
					  Row row7=sheet.getRow(7);
						 c1=row7.getCell(1);
						  String Email = c1.getStringCellValue();	
						  WebElement Email1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxEmail']"));
						  Email1.sendKeys(Email);
						  Thread.sleep(3000);
						  
						  JavascriptExecutor js=(JavascriptExecutor) driver ;
							js.executeScript("window.scroll(0,500)");
							Thread.sleep(3000);
			      
							  WebElement Status=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']"));
							     Status.click();
							      Thread.sleep(3000);
							      
							      WebElement Status1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']/option[2]"));
							      Status1.click();
							      Thread.sleep(3000);
							      
							      JavascriptExecutor ks=(JavascriptExecutor) driver ;
									ks.executeScript("window.scroll(0,500)");
									Thread.sleep(3000);
									
									WebElement saveBtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
									saveBtn.click();
									Thread.sleep(3000);
									
									WebElement CloseBtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
									CloseBtn.click();
									Thread.sleep(3000);
			  
		  
		  
	}
	//@Test(priority=6)
	public void updateunit() throws InterruptedException
	{
		WebElement master=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		  master.click();
		  Thread.sleep(3000);
		  
		  WebElement usermaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[1]/a"));
		  usermaster.click();
		  Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));

		search.sendKeys("nancy",Keys.ENTER);
		 Thread.sleep(3000);
		
		WebElement edituser=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch_LinkButton1_0']/img"));
       edituser.click();
       Thread.sleep(5000);
       
       WebElement firstname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
   	  firstname1.clear();
   	  Thread.sleep(3000);
   	  firstname1.sendKeys("Nancyee");
   	  
   	 JavascriptExecutor js=(JavascriptExecutor) driver ;
 		js.executeScript("window.scroll(0,500)");
 		Thread.sleep(3000);
 		
 		WebElement saveBtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
 		saveBtn.click();
 		Thread.sleep(3000);
 		
 		WebElement close=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
 		close.click();
       
		
	}
	@Test(priority=7)
	public void subunit() throws InterruptedException
	{
		WebElement master=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]"));
		  master.click();
		  Thread.sleep(3000);
		  
		  WebElement usermaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[1]/a"));
		  usermaster.click();
		  Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));

		search.sendKeys("Nancyee",Keys.ENTER);
		 Thread.sleep(3000);
		 
		 WebElement subunit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch']/tbody/tr[2]/td[8]/a"));
	       subunit.click();
	       Thread.sleep(5000);
		 
	}}

		 
	
				
		

		
		
		
		
	

	

