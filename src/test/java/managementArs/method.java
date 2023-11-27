package managementArs;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.NumberFormatException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Reviewer.Reviewerlocator;

public class method {

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void HighRisk(WebDriver driver, ExtentTest test ,String RiskType,String type) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(1000);
	locators.ClickHighOpen(driver).click();
	Thread.sleep(2000);
	}else {
		
		Thread.sleep(1000);
		locators.ClickHighClose(driver).click();
		Thread.sleep(2000);
		
	}
	
	String FinanceAccounts = locators.FinanceAccountsHigh(driver).getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
	
	locators.FinanceAccountsHigh(driver).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(1000);
	File dir = new File("C:\\Users\\ambuj\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	locators.ClickExport(driver).click();		//Exporting (Downloading) file
	
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
	
	locators.RiskView(driver).click();		
	Thread.sleep(8000);
	locators.RiskViewClose(driver).click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = locators.readTotalItems(driver).getText();
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
	
	
	
	driver.switchTo().parentFrame();
	locators.ClosePopRisk(driver).click();		
	
	
	Thread.sleep(3000);
	locators.ClickDashboard(driver).click();		
	Thread.sleep(3000);
	 }
	
	public static void MediumRisk(WebDriver driver, ExtentTest test ,String RiskType,String type) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(3000);
	locators.ClickMediumOpen(driver).click();
	Thread.sleep(4000);
	
	
	}else {
		
		Thread.sleep(3000);
		locators.ClickMediumClose(driver).click();
		Thread.sleep(4000);
		
	}
	
	String FinanceAccounts = locators.FinanceAccountsHigh(driver).getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
	
	locators.FinanceAccountsHigh(driver).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(3000);
	File dir = new File("C:\\Users\\ambuj\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	locators.ClickExport(driver).click();		//Exporting (Downloading) file
	
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
	
	locators.RiskView(driver).click();		
	Thread.sleep(3000);
	locators.RiskViewClose(driver).click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = locators.readTotalItems(driver).getText();
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
	
	driver.switchTo().parentFrame();
	locators.ClosePopRisk(driver).click();		
	
		
	Thread.sleep(3000);
	locators.ClickDashboard(driver).click();		
	Thread.sleep(3000);
	 }
	public static void LowRisk(WebDriver driver, ExtentTest test ,String RiskType,String type) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	if(type.equalsIgnoreCase("open")) {
	Thread.sleep(3000);
	locators.ClickLowOpen(driver).click();
	Thread.sleep(3000);
	
	
	}else {
		
		Thread.sleep(3000);
		locators.ClickLowClose(driver).click();
		Thread.sleep(4000);
		
	}
	
	String FinanceAccounts = locators.FinanceAccountsHigh(driver).getText();		//Reading the Closed Timely value of Human Resource
	FinanceAccounts = FinanceAccounts.replaceAll(" ","");									//Removing all white spaces from string. 
	int Finance_Accounts = Integer.parseInt(FinanceAccounts);	
	
	locators.FinanceAccountsHigh(driver).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(4000);
	File dir = new File("C:\\Users\\ambuj\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	locators.ClickExport(driver).click();		//Exporting (Downloading) file
	
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
	
	locators.RiskView(driver).click();		
	Thread.sleep(3000);
	locators.RiskViewClose(driver).click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = locators.readTotalItems(driver).getText();
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
	
	driver.switchTo().parentFrame();
	locators.ClosePopRisk(driver).click();		
	Thread.sleep(3000);
	locators.ClickDashboard(driver).click();		
	Thread.sleep(3000);
	 }
	public static void CategoryOpen(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)");	
	
	
	Thread.sleep(5000);
	int ProcessInefficiency_Open = Integer.parseInt(locators.ProcessInefficiencyOpen(driver).getText());	//Reading value of 'After Due Date'
	locators.ProcessInefficiencyOpen(driver).click();								//CLicking on 'Not Completed' count
	
	Thread.sleep(500);
	
	int high = Integer.parseInt(locators.readHigh(driver).getText());		//reading High risk count.
	int medium = Integer.parseInt(locators.readMedium(driver).getText());	//reading Medium risk count.
	int low = Integer.parseInt(locators.readLow(driver).getText());			//reading Low risk count.
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
	
	locators.ClickDashboard(driver).click();		
	Thread.sleep(3000);
	 }
	
	public static void CategoryClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");	
	
	
	Thread.sleep(2000);
	int ProcessInefficiency_Close = Integer.parseInt(locators.ProcessInefficiencyClose(driver).getText());	//Reading value of 'After Due Date'
	locators.ProcessInefficiencyClose(driver).click();								//CLicking on 'Not Completed' count
	
	Thread.sleep(5000);
	
	int high = Integer.parseInt(locators.readHigh(driver).getText());		//reading High risk count.
	int medium = Integer.parseInt(locators.readMedium(driver).getText());	//reading Medium risk count.
	int low = Integer.parseInt(locators.readLow(driver).getText());			//reading Low risk count.
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
	locators.ClickDashboard(driver).click();		
	Thread.sleep(3000);
	 }
	
	
	public static void CategoryWise(WebDriver driver, ExtentTest test ,String risk,int riskCount) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	if(risk.equalsIgnoreCase("High"))
	{
		locators.readHigh(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
	}
	else if(risk.equalsIgnoreCase("Medium"))
	{
		locators.readMedium(driver).click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
	}
	else if(risk.equalsIgnoreCase("Low"))
	{
		locators.readLow(driver).click();						//Clicking on Low value of Pie Chart of 'Not Completed'.
	}
	
	Thread.sleep(5000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(5000);
	File dir = new File("C:\\Users\\ambuj\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	locators.ClickExport(driver).click();		//Exporting (Downloading) file
	
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
	
	locators.CategoryView(driver).click();		
	Thread.sleep(3000);
	locators.RiskViewClose(driver).click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = locators.readTotalItems(driver).getText();
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
	
	
	/*locators.SelectPeriod(driver).click();		
	Thread.sleep(1000);
	locators.PeriodAnnually(driver).click();		
	Thread.sleep(3000);
	if(locators.ApplyFilter(driver).isEnabled()) {
	locators.ApplyFilter(driver).click();		
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "  Filter Working successfully.");
	}else {
		test.log(LogStatus.PASS,  "  Filter not Working");
	}*/
	driver.switchTo().parentFrame();
	locators.ClosePopRisk(driver).click();		
	
		
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
	
		int Process_High = Integer.parseInt(locators.ProcessHigh(driver).getText());	
		Thread.sleep(2000);
		locators.ProcessHigh(driver).click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(locators.ProcessOpen(driver).getText());		//reading High risk count.
		Thread.sleep(500);
		int close = Integer.parseInt(locators.ProcessClose(driver).getText());	//reading Medium risk count.
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
		
		
		locators.ClickDashboard(driver).click();		
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
	
		int Process_Medium = Integer.parseInt(locators.ProcessMedium(driver).getText());	
		Thread.sleep(2000);
		locators.ProcessMedium(driver).click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(locators.ProcessOpen(driver).getText());		//reading High risk count.
		Thread.sleep(5000);
		int close = Integer.parseInt(locators.ProcessClose(driver).getText());	//reading Medium risk count.
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
		
		
		locators.ClickDashboard(driver).click();		
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
	
		int Process_Low = Integer.parseInt(locators.ProcessLow(driver).getText());	
		Thread.sleep(2000);
		locators.ProcessLow(driver).click();						
		Thread.sleep(3000);
		int open = Integer.parseInt(locators.ProcessOpen(driver).getText());		//reading High risk count.
		Thread.sleep(5000);
		int close = Integer.parseInt(locators.ProcessClose(driver).getText());	//reading Medium risk count.
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
		
		
		locators.ClickDashboard(driver).click();		
		Thread.sleep(3000);
	
	
	 }
	
	
	public static void ProcessCategories(WebDriver driver, ExtentTest test ,String Category,int CategoryCount) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	if(Category.equalsIgnoreCase("open"))
	{
		locators.ProcessOpen(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
	}
	else if(Category.equalsIgnoreCase("close"))
	{
		locators.ProcessClose(driver).click();						//Clicking on Medium value of Pie Chart of 'Not Completed'.
	}
	
	Thread.sleep(1000);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

	Thread.sleep(5000);
	File dir = new File("C:\\Users\\ambuj\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	locators.ClickExport(driver).click();		//Exporting (Downloading) file
	
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
	
	locators.RiskView(driver).click();		
	Thread.sleep(3000);
	locators.RiskViewClose(driver).click();		
	Thread.sleep(3000);
	
	test.log(LogStatus.PASS,  "  View successfully.");
	
	String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
	String[] bits = s1.split(" ");									//Splitting the String
	String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
	
	if(itomsCount.equalsIgnoreCase("to"))							//If not items found
	{
		Thread.sleep(1000);
		s1 = locators.readTotalItems(driver).getText();
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
	
	driver.switchTo().parentFrame();
    locators.ClosePopRisk(driver).click();		
	
		
	Thread.sleep(3000);
	
	 }
	public static void AgingGreater90(WebDriver driver, ExtentTest test ) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (50));
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
	/*	locators.btnminimize(driver).click();						//Clicking on High value of Pie Chart of 'Not Completed'.
		Thread.sleep(1000);
		locators.SelectFinancialYear1(driver).click();		
		Thread.sleep(1000);
		locators.SelectAll(driver).click();
		Thread.sleep(1000);
		locators.SelectAllOk(driver).click();
		Thread.sleep(2000);
		locators.ApplyFilters(driver).click();
		Thread.sleep(3000);
		*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");	
		Thread.sleep(3000);
		
		int Aging_90 = Integer.parseInt(locators.Click90dayss(driver).getText());	
		Thread.sleep(2000);
		locators.Click90dayss(driver).click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		locators.ClickExport(driver).click();		//Exporting (Downloading) file
		
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
		
		locators.RiskView(driver).click();		
		Thread.sleep(3000);
		locators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = locators.readTotalItems(driver).getText();
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
		locators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		locators.ClickDashboard(driver).click();		
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
		
		int Aging_NotDue = Integer.parseInt(locators.ClickNotDue(driver).getText());	
		Thread.sleep(2000);
		locators.ClickNotDue(driver).click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		locators.ClickExport(driver).click();		//Exporting (Downloading) file
		
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
		
		locators.RiskView(driver).click();		
		Thread.sleep(3000);
		locators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = locators.readTotalItems(driver).getText();
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
		locators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		locators.ClickDashboard(driver).click();		
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
		
		int AuditCommittee_Open = Integer.parseInt(locators.AuditCommitteeOpen(driver).getText());	
		Thread.sleep(2000);
		locators.AuditCommitteeOpen(driver).click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(3000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		locators.ClickExport(driver).click();		//Exporting (Downloading) file
		
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
		
		locators.RiskView(driver).click();		
		Thread.sleep(3000);
		locators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = locators.readTotalItems(driver).getText();
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
		locators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		locators.ClickDashboard(driver).click();		
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
		
		int AuditCommittee_close = Integer.parseInt(locators.AuditCommitteeClose(driver).getText());	
		Thread.sleep(2000);
		locators.AuditCommitteeClose(driver).click();						
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));	//Switching to iFrame.

		Thread.sleep(1000);
		File dir = new File("C:\\Users\\ambuj\\Downloads");
		File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		
		
		locators.ClickExport(driver).click();		//Exporting (Downloading) file
		
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
		
		locators.RiskView(driver).click();		
		Thread.sleep(3000);
		locators.RiskViewClose(driver).click();		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  "  View successfully.");
		
		String s1 = locators.readTotalItems(driver).getText();		//Reading total number of items.
		String[] bits = s1.split(" ");									//Splitting the String
		String itomsCount = bits[bits.length - 2];						//Getting the second last word (total number of items)
		
		if(itomsCount.equalsIgnoreCase("to"))							//If not items found
		{
			Thread.sleep(1000);
			s1 = locators.readTotalItems(driver).getText();
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
		locators.ClosePopRisk(driver).click();		
		
			
		Thread.sleep(3000);
		locators.ClickDashboard(driver).click();		
		Thread.sleep(3000);
	 }
	public static void observationlist(WebDriver driver, ExtentTest test ) throws InterruptedException
	 {
		Thread.sleep(3000);
		locators.clickobservationlist(driver).click();
		  Thread.sleep(3000);
		  locators.clickunit(driver).click();
		  Thread.sleep(3000);  
		  locators.clickselectunit(driver).click();
		  Thread.sleep(3000);
		  locators.clickfinancialyear(driver).click();
		  Thread.sleep(3000);
		  locators.clickselectfinancialyear(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Filters work successfully.");
		  locators.clickviewbutton(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List View Button work successfully.");
		  locators.clickprocess1(driver).click();
		  Thread.sleep(3000);
		  locators.clickselectprocess1(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Dashboard Filters work successfully.");
		  locators.clickbackbutton(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Back Button work successfully.");
		  locators.clickauditstataus(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Status Button work successfully.");
		  locators.clickbackbutton1(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Audit Status Back Button work successfully.");
		  locators.clickimplementation(driver).click();
		  Thread.sleep(3000);
		  locators.clickunit(driver).click();
		  Thread.sleep(3000);  
		  locators.clickselectunit1(driver).click();
		  Thread.sleep(3000);
		  locators.clickfinancialyear(driver).click();
		  Thread.sleep(3000);
		  locators.clickselectfinancialyear(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Implimentation Dashboard Filters work successfully.");
		  locators.clickviewbutton1(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation List Implementation View Button work successfully.");
		  driver.switchTo().frame(locators.clickframe1(driver)); // i frame enter krne krne k liye
		  Thread.sleep(7000);
		  locators.clickmanagementresponse(driver).sendKeys("management Response done");
		  Thread.sleep(3000);
		  //locators.clicksubmittohigherlevel(driver).click();
		  Thread.sleep(3000);
		  test.log(LogStatus.PASS, "Observation submitted successfully to next level.");
		  driver.switchTo().parentFrame();
		  locators.clickclosed1(driver).click();
		  Thread.sleep(3000);
		 // locators.clickimplementstatus(driver).click();
		 // Thread.sleep(3000);
		
		  
	 }
}