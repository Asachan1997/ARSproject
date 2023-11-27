package performer;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;



public class performermethod {
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet1 = null;
	public static WebDriver driver=null;
	public static Row row=null;
	public static Cell cell=null;
	public static void Login() throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ambuj\\Downloads\\chromedriver_win32 (1)//chromedriver.exe"); 
		  
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
		    performerlocater.setUname(driver).sendKeys(uname);
			Row row2 = sheet1.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
		    performerlocater.setPass(driver).sendKeys(password);
		    performerlocater.clicksubmit(driver).click();
		    performerlocater.clicksequrity(driver).click();
		    Thread.sleep(5000);
		    
		    performerlocater.setquestion1(driver).sendKeys("123");
		    Thread.sleep(3000);
		    performerlocater.setquestion2(driver).sendKeys("123");
			  Thread.sleep(3000);
			  performerlocater.clickbtnvalidate(driver).click();
			  Thread.sleep(3000);
			  performerlocater.clickars(driver).click();
			  Thread.sleep(3000);
	}
	public static void count(ExtentTest test)throws InterruptedException {
			  performerlocater.clickfinancialyear(driver).click();
			  Thread.sleep(3000);
			  performerlocater.clickselectfinancialyear(driver).click();
			  Thread.sleep(3000);
	}	
}

