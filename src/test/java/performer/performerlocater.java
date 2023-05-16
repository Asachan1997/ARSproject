package performer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class performerlocater {
	private static WebElement uName=null;
	private static WebElement pass=null;
	private static WebElement submit=null;
	private static WebElement sequrity=null;
	private static WebElement question1=null;
	private static WebElement question2=null;
	private static WebElement btnvalidate=null;
	private static WebElement ars=null;
	private static WebElement financialyear=null;
	private static WebElement selectfinancialyear=null;
	public static WebElement setUname(WebDriver driver) {
		uName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		return uName;
	}
	public static WebElement setPass(WebDriver driver) {
		pass=driver.findElement(By.xpath("//*[@id='txtpass']"));
		return pass;
	}
	
	public static WebElement clicksubmit(WebDriver driver) {
		submit=driver.findElement(By.xpath("//*[@id='Submit']"));
		return submit;
	}
	
	public static WebElement clicksequrity(WebDriver driver) {
		sequrity=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		return sequrity;
	}
	
	public static WebElement setquestion1(WebDriver driver) {
		question1=driver.findElement(By.id("//*[@id='txtAnswer1']"));
		return question1;
	}
	public static WebElement setquestion2(WebDriver driver) {
		question2=driver.findElement(By.xpath("//*[@id='txtAnswar2']"));
		return question2;
	}
	public static WebElement clickbtnvalidate(WebDriver driver) {
		btnvalidate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		return btnvalidate;
	}
	public static WebElement clickars(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='dvbtnAudit']/div[1]"));
		return ars;
	}
	public static WebElement clickfinancialyear(WebDriver driver) {
		financialyear=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a"));
		return financialyear;
	}
	public static WebElement clickselectfinancialyear(WebDriver driver) {
		selectfinancialyear=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlFinancialYear_chosen\"]/div/ul/li[3]"));
		return selectfinancialyear;
	}
	
}
