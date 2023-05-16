package Auditlogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginpage 
{
	 @Test
	  public void f() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D://eclipse-workspace//Audit//chromedriver_win32//chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();   
		 driver.manage().window().maximize(); 
		 driver.get("https://test.avantisregtec.in/DIYProduction/Login.aspx"); 
		  WebElement userName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		  userName.sendKeys("spiralofficerone@gmail.com");
		  WebElement password=driver.findElement(By.xpath("//*[@id='txtpass']"));
		  password.sendKeys("team@123");
		  WebElement signBtn=driver.findElement(By.xpath("//*[@id='Submit']"));
		  signBtn.click(); 
		  WebElement DonotAcc=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		  DonotAcc.click();  
		  Thread.sleep(3000);
		  WebElement firstQ=driver.findElement(By.id("txtAnswer1"));
		  firstQ.sendKeys("123");
		  WebElement secQ=driver.findElement(By.xpath("//*[@id=\"txtAnswar2\"]"));
		  secQ.sendKeys("123");
		  WebElement validate=driver.findElement(By.xpath("//*[@id=\"btnValidateQuestions\"]"));
		  validate.click();
		  
	 }
	
}
