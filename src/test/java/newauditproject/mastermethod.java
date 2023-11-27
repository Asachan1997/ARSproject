package newauditproject;
import java.awt.RenderingHints.Key;

	import java.io.File;
	import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
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
import org.openqa.selenium.support.ui.WebDriverWait;

	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;
	public class mastermethod {

		public static FileInputStream fis = null;	//File input stream variable
		public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
		public static XSSFSheet sheet = null;		//Sheet variable
		private static int open;

		
		public static void Master(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			//Thread.sleep(1000);
			//masterlocator.ars(driver).click();
			//Thread.sleep(3000);
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Unit(driver).click();
			Thread.sleep(3000);
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText = "Option 3";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText1 = "Option 5";
			String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText1);
			WebElement dropdownOption1 = driver.findElement(By.xpath(xpathExpression1));
			dropdownOption1.click();
			
			Thread.sleep(3000);
			String OptionText2 = "Option 6";
			String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText2);
			WebElement dropdownOption2 = driver.findElement(By.xpath(xpathExpression2));
			dropdownOption2.click();
			
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, t );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Edit(driver).click();
			Thread.sleep(5000);
			
			masterlocator.Name(driver).clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(7);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText3 = "Option 9";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlCompanyType']/option[9]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			
			masterlocator.Adress(driver).clear();
			Thread.sleep(1000);
			Thread.sleep(3000);
			row0 = sheet.getRow(8);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText4 = "Option 5";
			String xpathExpression4 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText4);
			WebElement dropdownOption4 = driver.findElement(By.xpath(xpathExpression4));
			dropdownOption4.click();
			
			Thread.sleep(3000);
			String OptionText5 = "Option 6";
			String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText5);
			WebElement dropdownOption5 = driver.findElement(By.xpath(xpathExpression5));
			dropdownOption5.click();
			
			masterlocator.ContactPerson(driver).clear();
			Thread.sleep(1000);
			
			Thread.sleep(3000);
			row0 = sheet.getRow(9);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			masterlocator.Email(driver).clear();
			Thread.sleep(1000);
			row0 = sheet.getRow(10);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t1 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			if(masterlocator.ExportToExcel(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.ExportToExcel(driver).click();
				test.log(LogStatus.PASS, " File Download Successfully " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " File Download Successfully "  );
				
			}
			
			
		
		}
		
		
		
		
		public static void MasterUnitWithoutEnterData(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			//Thread.sleep(1000);
			//masterlocator.ars(driver).click();
			//Thread.sleep(3000);
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Unit(driver).click();
			Thread.sleep(3000);
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, t );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			
			
		
		}
		
		
		
		
		public static void MasterWithoutEnterParticularField(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Unit(driver).click();
			Thread.sleep(3000);
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			/*
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			*/
			
			String OptionText = "Option 3";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText1 = "Option 5";
			String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText1);
			WebElement dropdownOption1 = driver.findElement(By.xpath(xpathExpression1));
			dropdownOption1.click();
			
			Thread.sleep(3000);
			String OptionText2 = "Option 6";
			String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText2);
			WebElement dropdownOption2 = driver.findElement(By.xpath(xpathExpression2));
			dropdownOption2.click();
			
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Name - " + t );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			///////////////////////////////////
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			/*
			String OptionText = "Option 3";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			*/
			
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText3 = "Option 5";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			
			Thread.sleep(3000);
			String OptionText4 = "Option 6";
			String xpathExpression4 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText4);
			WebElement dropdownOption4 = driver.findElement(By.xpath(xpathExpression4));
			dropdownOption4.click();
			
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t1 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Unit Type - " + t1 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			////////////////////////////////////////////
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText5 = "Option 3";
			String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText5);
			WebElement dropdownOption5 = driver.findElement(By.xpath(xpathExpression5));
			dropdownOption5.click();
			
			/*
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			*/
			
			String OptionText6 = "Option 5";
			String xpathExpression6 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText6);
			WebElement dropdownOption6 = driver.findElement(By.xpath(xpathExpression6));
			dropdownOption6.click();
			
			Thread.sleep(3000);
			String OptionText7 = "Option 6";
			String xpathExpression7 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText7);
			WebElement dropdownOption7 = driver.findElement(By.xpath(xpathExpression7));
			dropdownOption7.click();
			
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t2 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Adress - " + t2 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
		/////////////////////////////
			
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText8 = "Option 3";
			String xpathExpression8 = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText8);
			WebElement dropdownOption8 = driver.findElement(By.xpath(xpathExpression8));
			dropdownOption8.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			/*
			String OptionText6 = "Option 5";
			String xpathExpression6 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText6);
			WebElement dropdownOption6 = driver.findElement(By.xpath(xpathExpression6));
			dropdownOption6.click();
			*/
			Thread.sleep(3000);
			String OptionText9 = "Option 2";
			String xpathExpression9 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[2]",OptionText9);
			WebElement dropdownOption9 = driver.findElement(By.xpath(xpathExpression9));
			dropdownOption9.click();
			
			Thread.sleep(3000);
			row0 = sheet.getRow(62);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Other(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t3 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter State - " + t3 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			
			////////////////////////////
			
			
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText10 = "Option 3";
			String xpathExpression10 = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText10);
			WebElement dropdownOption10 = driver.findElement(By.xpath(xpathExpression10));
			dropdownOption10.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText11 = "Option 5";
			String xpathExpression11 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText11);
			WebElement dropdownOption11 = driver.findElement(By.xpath(xpathExpression11));
			dropdownOption11.click();
			
			/*
			Thread.sleep(3000);
			String OptionText9 = "Option 6";
			String xpathExpression9 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText9);
			WebElement dropdownOption9 = driver.findElement(By.xpath(xpathExpression9));
			dropdownOption9.click();
			*/
			
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t4 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter City - " + t4 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			/////////////////////////////////
			
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText12 = "Option 3";
			String xpathExpression12 = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText12);
			WebElement dropdownOption12 = driver.findElement(By.xpath(xpathExpression12));
			dropdownOption12.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText13 = "Option 5";
			String xpathExpression13 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText13);
			WebElement dropdownOption13 = driver.findElement(By.xpath(xpathExpression13));
			dropdownOption13.click();
			
			
			Thread.sleep(3000);
			String OptionText14 = "Option 6";
			String xpathExpression14 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText14);
			WebElement dropdownOption14 = driver.findElement(By.xpath(xpathExpression14));
			dropdownOption14.click();
			
			/*
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			*/
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t5 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Contact Person - " + t5 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			
			//////////////////////////////
			
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText15 = "Option 3";
			String xpathExpression15 = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText15);
			WebElement dropdownOption15 = driver.findElement(By.xpath(xpathExpression15));
			dropdownOption15.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			
			String OptionText16 = "Option 5";
			String xpathExpression16 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText16);
			WebElement dropdownOption16 = driver.findElement(By.xpath(xpathExpression16));
			dropdownOption16.click();
			
			
			Thread.sleep(3000);
			String OptionText17 = "Option 6";
			String xpathExpression17 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText17);
			WebElement dropdownOption17 = driver.findElement(By.xpath(xpathExpression17));
			dropdownOption17.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			/*
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			*/
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t6 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Email - " + t6 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void MasterUnitFilter(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Unit(driver).click();
			Thread.sleep(3000);
			
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;

		
			Thread.sleep(3000);
			row0 = sheet.getRow(61);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FilterU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
		//	test.log(LogStatus.PASS, " Search Filter Working Properly " );

			/*
		    String FilterText =masterlocator.Filter(driver).getText();
		    Thread.sleep(2000);
		    
		    System.out.println( " -" + FilterText + "- ");

		    masterlocator.FilterTextU(driver).click();
		    Thread.sleep(3000);
		    */
			
			/*
		    
		    if(masterlocator.FilterTextU(driver).isEnabled())
			{
		    	
		    	Thread.sleep(3000);
		    	masterlocator.FilterTextU(driver).click();
				Thread.sleep(2000);
				String FilterText1 =masterlocator.Filter(driver).getText();
				test.log(LogStatus.PASS, " Message Displyaed " + FilterText1 );
				
			}
			
			else
			{
				String FilterText1 =masterlocator.Filter(driver).getText();
				test.log(LogStatus.FAIL, " Message Displyaed on Grid " + FilterText1 );
				
			}
			
	*/

			masterlocator.FilterTextU(driver).click();
			Thread.sleep(2000);
			
			String FilterText1 =masterlocator.Filter(driver).getText();
			

	 List<String> li=new ArrayList<String>();
	 
	//   li.add(locationText);
	 li.add(FilterText1);


	 
	 Thread.sleep(3000);
	 
		List<String> filter=new ArrayList<String>();	

		filter.add("Contact Person");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		masterlocator.Grid(driver).click();					//Clicking on Text of total items just to scroll down.
		String s = masterlocator.Grid(driver).getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);

//		List<WebElement> entitycol=driver.findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> contactpersoncol=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch']/tbody/tr[2]/td[5]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(contactpersoncol);
				}
			
			
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  " Search filter working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" Column displayed Value : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
	}
		
		
		
		
		
		public static void MasterSubUnitFilter(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Unit(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubUnit(driver).click();
			Thread.sleep(3000);
			
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;

		
			Thread.sleep(3000);
			row0 = sheet.getRow(65);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FilterU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
		
			masterlocator.FilterTextU(driver).click();
			Thread.sleep(2000);
			
			String FilterText1 =masterlocator.Filter(driver).getText();
			

	 List<String> li=new ArrayList<String>();
	 
	//   li.add(locationText);
	 li.add(FilterText1);


	 
	 Thread.sleep(3000);
	 
		List<String> filter=new ArrayList<String>();	

		filter.add("Contact Person");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		masterlocator.Grid(driver).click();					//Clicking on Text of total items just to scroll down.
		String s = masterlocator.Grid(driver).getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);

//		List<WebElement> entitycol=driver.findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> contactpersoncol=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch']/tbody/tr[2]/td[5]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(contactpersoncol);
				}
			
			
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  " Search filter working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" Column displayed Value : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
	}
		
		
		
		
		
		
		
		
		
		
		public static void MasterSubUnit(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Unit(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubUnit(driver).click();
			Thread.sleep(3000);
			
			masterlocator.addnew(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(71);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText = "Option 3";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlType']/option[3]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			
			
			Thread.sleep(3000);
			row0 = sheet.getRow(72);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText1 = "Option 5";
			String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText1);
			WebElement dropdownOption1 = driver.findElement(By.xpath(xpathExpression1));
			dropdownOption1.click();
			
			Thread.sleep(3000);
			String OptionText2 = "Option 6";
			String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText2);
			WebElement dropdownOption2 = driver.findElement(By.xpath(xpathExpression2));
			dropdownOption2.click();
			
			Thread.sleep(3000);
			row0 = sheet.getRow(73);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(74);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, t );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			
		}
			
			
			
			public static void MasterSubUnitUpdate(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{

				
				masterlocator.Master(driver).click();
				Thread.sleep(3000);
				
				masterlocator.Unit(driver).click();
				Thread.sleep(3000);
				
				masterlocator.SubUnit(driver).click();
				Thread.sleep(3000);
				
			
			masterlocator.Edit(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			masterlocator.Name(driver).clear();
			Thread.sleep(1000);
			row0 = sheet.getRow(7);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			/*
			String OptionText3 = "Option 9";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlCompanyType']/option[9]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			*/
			masterlocator.Adress(driver).clear();
			Thread.sleep(1000);
			Thread.sleep(3000);
			row0 = sheet.getRow(8);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Adress(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			String OptionText4 = "Option 5";
			String xpathExpression4 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[5]",OptionText4);
			WebElement dropdownOption4 = driver.findElement(By.xpath(xpathExpression4));
			dropdownOption4.click();
			
			Thread.sleep(3000);
			String OptionText5 = "Option 6";
			String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_ddlCity']/option[6]",OptionText5);
			WebElement dropdownOption5 = driver.findElement(By.xpath(xpathExpression5));
			dropdownOption5.click();
			
			masterlocator.ContactPerson(driver).clear();
			Thread.sleep(1000);
			
			Thread.sleep(3000);
			row0 = sheet.getRow(9);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			masterlocator.Email(driver).clear();
			Thread.sleep(1000);
			row0 = sheet.getRow(10);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			
			masterlocator.save(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Successfully(driver).click();
			Thread.sleep(3000);
			
			String t1 = masterlocator.Successfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );

			Thread.sleep(2000);
			
			masterlocator.Close(driver).click();
			Thread.sleep(3000);
			
			}
			
			
			public static void MasterSubUnitExport(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
			{
				
				masterlocator.Master(driver).click();
				Thread.sleep(3000);
				
				masterlocator.Unit(driver).click();
				Thread.sleep(3000);
				
				masterlocator.SubUnit(driver).click();
				Thread.sleep(3000);
				
			
			
			if(masterlocator.ExportToExcel(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.ExportToExcel(driver).click();
				test.log(LogStatus.PASS, " File Download Successfully " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " File Download Successfully "  );
				
			}
			
			
			
			
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void DepartmentMaster(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.DepartmentMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewDM(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(11);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DepartmentName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
		
			masterlocator.SaveDM(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullyDM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, t );

			Thread.sleep(2000);
			
			masterlocator.CloseDM(driver).click();
			Thread.sleep(3000);
			
			masterlocator.EditDM(driver).click();
			Thread.sleep(3000);
			
			masterlocator.DepartmentName(driver).clear();
			Thread.sleep(1000);
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DepartmentName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
		
			masterlocator.SaveDM(driver).click();
			Thread.sleep(3000);
			
			String t1 = masterlocator.SuccessfullyDM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );

			Thread.sleep(2000);
			
			masterlocator.CloseDM(driver).click();
			Thread.sleep(3000);
			
			
		
		}
		
		
		
		public static void DepartmentMasterWithoutEnterData(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.DepartmentMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewDM(driver).click();
			Thread.sleep(3000);
		
			masterlocator.SaveDM(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullyDM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, t );

			Thread.sleep(2000);
			
			masterlocator.CloseDM(driver).click();
			Thread.sleep(3000);
			
			
		
		}
		
		
		
		
		
		
		public static void VerticalMaster(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

		
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.VerticalMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewVM(driver).click();
			Thread.sleep(6000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.VerticalName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.SaveVM(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullyVM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseVM(driver).click();
			Thread.sleep(3000);
		
			masterlocator.EditVM(driver).click();
			Thread.sleep(5000);
			
			masterlocator.VerticalName(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(14);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.VerticalName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			masterlocator.SaveVM(driver).click();
			Thread.sleep(3000);
			
			String t1 = masterlocator.SuccessfullyVM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(2000);
			
			masterlocator.CloseVM(driver).click();
			Thread.sleep(3000);
		
			masterlocator.LocationVerticalMapping(driver).click();
			Thread.sleep(3000);
			
			driver.switchTo().frame(masterlocator.Frame(driver));
		    Thread.sleep(5000);
			
			masterlocator.SelectCompanyVM(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SelectCompanyDDVM(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SelectVertical(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SelectVerticalDD(driver).click();
			Thread.sleep(3000);
			
			masterlocator.OKVM(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SaveLVM(driver).click();
			Thread.sleep(3000);
			
			String t2 = masterlocator.SuccessfullyLVM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t2 );
			Thread.sleep(3000);
			
			if(masterlocator.DownloadLVM(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.DownloadLVM(driver).click();
				test.log(LogStatus.PASS, " File Download Successfully " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " File Download Successfully "  );
				
			}
			
		
		}
		
		
		
		public static void VerticalMasterWithoutEnterData(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

		
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.VerticalMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewVM(driver).click();
			Thread.sleep(6000);
			
			masterlocator.SaveVM(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullyVM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseVM(driver).click();
			Thread.sleep(3000);
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void BusinessProcess(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.BusinessProcess(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewBP(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(15);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.SaveBP(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfulBP(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseBP(driver).click();
			Thread.sleep(3000);
			
			masterlocator.EditBP(driver).click();
			Thread.sleep(3000);
			
			masterlocator.NameBP(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(16);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(4000);
			
			masterlocator.SaveBP(driver).click();
			Thread.sleep(4000);
			
			String t1 = masterlocator.SuccessfulBP(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CloseBP(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SubProcessBP(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SubProcessAddNewBP(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(17);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.SubProcessNameBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(4000);
			
			masterlocator.SaveBP(driver).click();
			Thread.sleep(3000);
			
			String t2 = masterlocator.SuccessfulBP(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t2 );
			Thread.sleep(3000);
			
			masterlocator.CloseBP(driver).click();
			Thread.sleep(3000);
			
			masterlocator.EditSubProcessBP(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubProcessNameBP(driver).clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(18);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.SubProcessNameBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			masterlocator.SaveBP(driver).click();
			Thread.sleep(3000);
			
			String t3 = masterlocator.SuccessfulBP(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t3 );
			Thread.sleep(3000);
			
			masterlocator.CloseBP(driver).click();
			Thread.sleep(3000);
			
			masterlocator.BackSubProcessBP(driver).click();
			Thread.sleep(3000);
			
			
			
			
			
		}
		
		
		
	
		public static void BusinessProcessBackButton(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.BusinessProcess(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubProcessBP(driver).click();
			Thread.sleep(5000);
			
			if(masterlocator.BackSubProcessBP(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.BackSubProcessBP(driver).click();
				test.log(LogStatus.PASS, " Back Button Is Clickable " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Back Button Is Not Clickable "  );
				
			}
			
			Thread.sleep(3000);
			
			
			String t =masterlocator.BusinessProcessPage(driver).getText();
			
			test.log(LogStatus.PASS, t + " Page Displayed "  );
			
			Thread.sleep(3000);
			
		}
		
		
		
		public static void BusinessProcessAddActivity(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.BusinessProcess(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubProcessBP(driver).click();
			Thread.sleep(5000);
			
			masterlocator.BusinessProcessSubActivity(driver).click();
			Thread.sleep(5000);
			
			masterlocator.BusinessActivity(driver).click();
			Thread.sleep(5000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(66);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.BusinessActivityName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.BusinessActivitySave(driver).click();
			Thread.sleep(5000);
		
			String t3 = masterlocator.BusinessActivitySuccessfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t3 );
			Thread.sleep(3000);
			
			masterlocator.BusinessActivityClose(driver).click();
			Thread.sleep(5000);
		
			masterlocator.BusinessActivityEdit(driver).click();
			Thread.sleep(5000);
		
			masterlocator.BusinessActivityName(driver).clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(70);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.BusinessActivityName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.BusinessActivitySave(driver).click();
			Thread.sleep(9000);
		
			String t4 = masterlocator.BusinessActivitySuccessfully(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t4 );
			Thread.sleep(3000);
			
			
			masterlocator.BusinessActivityClose(driver).click();
			Thread.sleep(5000);
			
			
			
		}
		
		
		public static void BusinessProcessActivityCloseButton(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.BusinessProcess(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubProcessBP(driver).click();
			Thread.sleep(5000);
			
			masterlocator.BusinessProcessSubActivity(driver).click();
			Thread.sleep(5000);
			
			masterlocator.BusinessActivityEdit(driver).click();
			Thread.sleep(5000);
		
			if(masterlocator.BusinessActivityClose(driver).isEnabled())
			{
				
				Thread.sleep(3000);
			 masterlocator.BusinessActivityClose(driver).click();
				test.log(LogStatus.PASS, " Close Button Is Clickable " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Close Button Is Not Clickable "  );
				
			}
			
			Thread.sleep(5000);
			
		
			
		}
		
		
		
		public static void BusinessProcessActivityBackButton(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

		
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.BusinessProcess(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubProcessBP(driver).click();
			Thread.sleep(5000);
			
			masterlocator.BusinessProcessSubActivity(driver).click();
			Thread.sleep(5000);
			
			if(masterlocator.BackSubProcessBP(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.BackSubProcessBP(driver).click();
				test.log(LogStatus.PASS, " Back Button Is Clickable " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Back Button Is Not Clickable "  );
				
			}
			
			Thread.sleep(5000);
			
		}
		
		
		public static void BusinessProcessWithoutEnterData(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.BusinessProcess(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewBP(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SaveBP(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfulBP(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseBP(driver).click();
			Thread.sleep(3000);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void ObservationCatogaries(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.ObservationCatogary(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewOC(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(19);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameOC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.EditOC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.NameOC(driver).clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(20);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameOC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t1 = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
		
			masterlocator.SubCatogariesOC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubCatogariesAddNewOC(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(21);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.SubCatogariesNameOC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t2 = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t2 );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubCatogariesEditOC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.SubCatogariesNameOC(driver).clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(22);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.SubCatogariesNameOC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t3 = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t3 );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
			
			
			if(masterlocator.BackSubProcessBP(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.BackSubProcessBP(driver).click();
				test.log(LogStatus.PASS, " Back Button Is Clickable " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Back Button Is Not Clickable "  );
				
			}
			
			
		
		}
		
		
		public static void ObservationCatogariesWithoutEnterData(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.ObservationCatogary(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewOC(driver).click();
			Thread.sleep(3000);
			
			
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void RiskCategory(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.RiskCatogary(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewRC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.RadioRC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Radio1RC(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(23);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameRC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.EditRC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Radio1RC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.RadioRC(driver).click();
			Thread.sleep(3000);
			
			masterlocator.NameRC(driver).clear();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(24);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameRC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t1 = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
			
		
		}
		
		
		
		public static void RiskSearchFilter(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.RiskCatogary(driver).click();
			Thread.sleep(3000);
			
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;

		
			Thread.sleep(3000);
			row0 = sheet.getRow(67);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FilterU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			masterlocator.ClickOperation(driver).click();
			Thread.sleep(2000);
			
			String FilterText1 =masterlocator.RiskFilterText(driver).getText();
			Thread.sleep(2000);

	 List<String> li=new ArrayList<String>();
	 
	//   li.add(locationText);
	 li.add(FilterText1);

	 Thread.sleep(3000);
	 
		List<String> filter=new ArrayList<String>();	

		filter.add("Name");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");	
		Thread.sleep(3000);

		masterlocator.Grid(driver).click();					//Clicking on Text of total items just to scroll down.
		String s = masterlocator.Grid(driver).getText();
		Thread.sleep(2000);

		if(!s.equalsIgnoreCase("No items to display")) {
		Thread.sleep(5000);

//		List<WebElement> entitycol=driver.findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
		List<WebElement> contactpersoncol=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskcategoryList']/tbody/tr[2]/td[2]"));
		
		Thread.sleep(2000);

		for(int i=0; i<li.size(); i++){
			
			List<String> text= new ArrayList<String>();
			HashSet<String> pass=new LinkedHashSet<>();
			HashSet<String> fail=new LinkedHashSet<>();
			List<WebElement> raw=new ArrayList<WebElement>();

				if(i==0)
				{
					raw.addAll(contactpersoncol);
				}
			
			
				
			for(int k=0;k<raw.size();k++)
				{
					text.add(raw.get(k).getText());
				}

				for(int l=0;l<text.size();l++)
					{
				if(text.get(l).equals(li.get(i)))
					{
						pass.add(text.get(l));	
						System.out.println("pass : "+text.get(l)+" : "+li.get(i));

					}
				else
				{
					fail.add(text.get(l));		
					System.out.println("fail : "+text.get(l)+" : "+li.get(i));
					System.out.println(i);

				}
				 }
		 
	for(String Fal : fail)
		 {
				test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
		 }	
		 for(String Pas : pass)
		 {
			 test.log(LogStatus.PASS,  " Search filter working properly.");
				test.log(LogStatus.PASS, filter.get(i)+" Column displayed Value : "+Pas);	
				System.out.println(filter.get(i)+" : "+Pas);
	 }
		 text.clear();
		pass.clear();
		fail.clear();
		raw.clear();
		
		
		}
		}else {
			test.log(LogStatus.PASS,"No records found");	
		}
		Thread.sleep(3000);
		
		
	}
		
		
		
		public static void RiskCategoryWithoutEnterData(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.RiskCatogary(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewRC(driver).click();
			Thread.sleep(3000);
			
			
			masterlocator.SaveOC(driver).click();
			Thread.sleep(3000);
			
			String t = masterlocator.SuccessfullOC(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CancelOC(driver).click();
			Thread.sleep(3000);
			
			
		}
		
		
		
		
		
		
		
		public static void Users(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Users(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText = "Option 2";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			
			masterlocator.DepartmentCheckBoxU(driver).click();
			Thread.sleep(3000);
			
			masterlocator.RadioU(driver).click();
			Thread.sleep(3000);
			
			String OptionText1 = "Option 2";
			String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText1);
			WebElement dropdownOption1 = driver.findElement(By.xpath(xpathExpression1));
			dropdownOption1.click();
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t1 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);
			row0 = sheet.getRow(68);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FilterU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			masterlocator.ClickOperation(driver).click();
			Thread.sleep(6000);
			
			masterlocator.EditU(driver).click();
			Thread.sleep(6000);
			
			masterlocator.FirstNameU(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(30);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.LastNameU(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(31);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.DestinationU(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(32);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.EmailU(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(33);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.ContactNoU(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(34);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText2 = "Option 2";
			String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText2);
			WebElement dropdownOption2 = driver.findElement(By.xpath(xpathExpression2));
			dropdownOption2.click();
			
			masterlocator.DepartmentCheckBoxU(driver).click();
			Thread.sleep(3000);
			
			masterlocator.RadioU(driver).click();
			Thread.sleep(3000);
			
			String OptionText3 = "Option 2";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(17000);
			
			String t2 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t2 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			masterlocator.DeleteU(driver).click();
			Thread.sleep(4000);
			
			Alert ac=driver.switchTo().alert();
			
			String t3=driver.switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t3 );
			
			Thread.sleep(4000);
			ac.accept();
			
			masterlocator.ResetPasswordU(driver).click();
			Thread.sleep(4000);
			
			
	        Alert ac1=driver.switchTo().alert();
			
			String t4=driver.switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t4 );
			
			Thread.sleep(4000);
			ac1.accept();
			
			Thread.sleep(7000);
			
	        Alert ac2=driver.switchTo().alert();
			
			String t5=driver.switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t5 );
			
			Thread.sleep(4000);
			ac2.accept();
			
			if(masterlocator.ExportToExcelU(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.ExportToExcelU(driver).click();
				test.log(LogStatus.PASS, " File Download Successfully " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " File Download Successfully "  );
				
			}
			
			Thread.sleep(2000);
		}
		
	
			
			
			
		
		
		
		public static void UsersSearchFilter(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Users(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;


			Thread.sleep(3000);
			row0 = sheet.getRow(68);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FilterU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
		//	masterlocator.ClickOperation(driver).click();
		//	Thread.sleep(5000);
			
			
			if(masterlocator.ClickOperation(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.ClickOperation(driver).click();
				test.log(LogStatus.PASS, " Search Box Is working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Search Box Is working Properly "  );
				
			}
			
			
			
			String FilterText1 =masterlocator.RiskFilterText(driver).getText();
			
			List<String> li=new ArrayList<String>();

			//li.add(locationText);
			li.add(FilterText1);

			Thread.sleep(3000);

			List<String> filter=new ArrayList<String>();	

			filter.add("First Name");

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");	
			Thread.sleep(3000);

			masterlocator.Grid(driver).click();					//Clicking on Text of total items just to scroll down.
			String s = masterlocator.Grid(driver).getText();
			Thread.sleep(2000);

			if(!s.equalsIgnoreCase("No items to display")) {
			Thread.sleep(5000);

			//List<WebElement> entitycol=driver.findElements(By.xpath("//*[@id='grid']/div[3]/table/tbody/tr/td[1]"));
			List<WebElement> contactpersoncol=driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_grdUser']/tbody/tr[2]/td[2]"));

			Thread.sleep(2000);

			for(int i=0; i<li.size(); i++){
				
				List<String> text= new ArrayList<String>();
				HashSet<String> pass=new LinkedHashSet<>();
				HashSet<String> fail=new LinkedHashSet<>();
				List<WebElement> raw=new ArrayList<WebElement>();

					if(i==0)
					{
						raw.addAll(contactpersoncol);
					}
				
				
					
				for(int k=0;k<raw.size();k++)
					{
						text.add(raw.get(k).getText());
					}

					for(int l=0;l<text.size();l++)
						{
					if(text.get(l).equals(li.get(i)))
						{
							pass.add(text.get(l));	
							System.out.println("pass : "+text.get(l)+" : "+li.get(i));

						}
					else
					{
						fail.add(text.get(l));		
						System.out.println("fail : "+text.get(l)+" : "+li.get(i));
						System.out.println(i);

					}
					 }
			 
					for(String Fal : fail)
					 {
							test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
					 }	
					 for(String Pas : pass)
					 {
						 test.log(LogStatus.PASS,  " Search filter working properly.");
							test.log(LogStatus.PASS, filter.get(i)+" Column displayed Value : "+Pas);	
							System.out.println(filter.get(i)+" : "+Pas);
					}
					 text.clear();
					pass.clear();
					fail.clear();
					raw.clear();


					}
					}else {
						test.log(LogStatus.PASS,"No records found");	
					}
					Thread.sleep(3000);

	

	}
		
		
		
		
		
		public static void UsersWithoutEnterData(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Users(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t1 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			
			
		}
		
		
		
		
		
		public static void UsersWitoutEnterParticularField(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.Users(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			/*
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			*/
		

		/*	row0 = sheet.getRow(26);              //comment remove
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText = "Option 2";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			Thread.sleep(5000);
			
			String OptionText1 = "Option 2";
			String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText1);
			WebElement dropdownOption1 = driver.findElement(By.xpath(xpathExpression1));
			dropdownOption1.click();
			Thread.sleep(5000);
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t1 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Name - " + t1 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			
			///////////////////////
			
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		/*
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
		*/
			row0 = sheet.getRow(27);   //remove 
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText3 = "Option 2";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			Thread.sleep(5000);
			
			String OptionText2 = "Option 2";
			String xpathExpression2 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText2);
			WebElement dropdownOption2 = driver.findElement(By.xpath(xpathExpression2));
			dropdownOption2.click();
			Thread.sleep(5000);
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t2 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Last Name - " + t2 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			///////////////////////////////
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
		/*
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			*/
	
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText5 = "Option 2";
			String xpathExpression5 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText5);
			WebElement dropdownOption5 = driver.findElement(By.xpath(xpathExpression5));
			dropdownOption5.click();
			Thread.sleep(5000);
			
			String OptionText6 = "Option 2";
			String xpathExpression6 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText6);
			WebElement dropdownOption6 = driver.findElement(By.xpath(xpathExpression6));
			dropdownOption6.click();
			Thread.sleep(5000);
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t3 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Destination - " + t3 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			//////////////////////////////
			
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
		
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			/*
		
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			*/
		
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText7 = "Option 2";
			String xpathExpression7 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText7);
			WebElement dropdownOption7 = driver.findElement(By.xpath(xpathExpression7));
			dropdownOption7.click();
			Thread.sleep(5000);
			
			
			String OptionText8 = "Option 2";
			String xpathExpression8 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText8);
			WebElement dropdownOption8 = driver.findElement(By.xpath(xpathExpression8));
			dropdownOption8.click();
			Thread.sleep(5000);
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t4 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Email - " + t4 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			/////////////////////////////
			
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
		
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			/*
		
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			*/
		
			String OptionText9 = "Option 2";
			String xpathExpression9 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText9);
			WebElement dropdownOption9 = driver.findElement(By.xpath(xpathExpression9));
			dropdownOption9.click();
			Thread.sleep(5000);
			
			String OptionText10 = "Option 2";
			String xpathExpression10 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText10);
			WebElement dropdownOption10 = driver.findElement(By.xpath(xpathExpression10));
			dropdownOption10.click();
			Thread.sleep(5000);
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t5 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Contact Number - " + t5 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			///////////////////////////
			
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
		
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			
		
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			/*
		
			String OptionText9 = "Option 2";
			String xpathExpression9 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText9);
			WebElement dropdownOption9 = driver.findElement(By.xpath(xpathExpression9));
			dropdownOption9.click();
			
			*/
			
		
			String OptionText11 = "Option 2";
			String xpathExpression11 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText11);
			WebElement dropdownOption11 = driver.findElement(By.xpath(xpathExpression11));
			dropdownOption11.click();
			Thread.sleep(5000);
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t6 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Department - " + t6 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			/////////////////////
			
			masterlocator.AddNewUsers(driver).click();
			Thread.sleep(5000);
			
			row0 = sheet.getRow(25);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			row0 = sheet.getRow(26);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
		
			row0 = sheet.getRow(27);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DestinationU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			row0 = sheet.getRow(28);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			row0 = sheet.getRow(29);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactNoU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			String OptionText12 = "Option 2";
			String xpathExpression12 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]",OptionText12);
			WebElement dropdownOption12 = driver.findElement(By.xpath(xpathExpression12));
			dropdownOption12.click();
			Thread.sleep(5000);
			
			/*
			String OptionText11 = "Option 2";
			String xpathExpression11 = String.format("//select[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]",OptionText11);
			WebElement dropdownOption11 = driver.findElement(By.xpath(xpathExpression11));
			dropdownOption11.click();
			*/
			
			masterlocator.SaveU(driver).click();
			Thread.sleep(9000);
			
			String t7 = masterlocator.SuccessfullyU(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Enter Audit Role - " + t7 );
			Thread.sleep(3000);
			
			masterlocator.CancelU(driver).click();
			Thread.sleep(3000);
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void AuditorMaster(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AuditorMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewAM(driver).click();
			Thread.sleep(5000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(35);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.AuditFirmNameAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(36);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.PartenerNameAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(37);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.PartenerContactNoAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(38);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ManagerNameAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
		
			row0 = sheet.getRow(39);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ManagerContactNoAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t2 = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t2 );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
		
			masterlocator.EditAM(driver).click();
			Thread.sleep(5000);
			
			masterlocator.AuditFirmNameAM(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.AuditFirmNameAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.PartenerNameAM(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.PartenerNameAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.PartenerContactNoAM(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.PartenerContactNoAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.ManagerNameAM(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ManagerNameAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.ManagerContactNoAM(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ManagerContactNoAM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
		
		
			
		
		
		}
		
		
		
		
		public static void AuditorsTeamMaster(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{


			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AuditorsTeamMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewATM(driver).click();
			Thread.sleep(5000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
		
			String OptionText3 = "Option 2";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlAuditor']/option[2]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			
			masterlocator.RadioATM(driver).click();
			Thread.sleep(5000);
		
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(47);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			row0 = sheet.getRow(48);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
			
			String OptionText1 = "Option 2";
			String xpathExpression1 = String.format("//select[@id='ContentPlaceHolder1_ddlFilterAuditor']/option[2]",OptionText1);
			WebElement dropdownOption1 = driver.findElement(By.xpath(xpathExpression1));
			dropdownOption1.click();
			
			Thread.sleep(5000);
			
			masterlocator.EditATM(driver).click();
			Thread.sleep(5000);
		
			String OptionText = "Option 2";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlAuditor']/option[2]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			
			masterlocator.RadioATM(driver).click();
			Thread.sleep(5000);
			
			masterlocator.FirstNameATM(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(49);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FirstNameATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.LastNameATM(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(50);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.LastNameATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.EmailATM(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(51);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.EmailATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.ContactATM(driver).clear();
			Thread.sleep(3000);
		
			row0 = sheet.getRow(52);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.ContactATM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t1 = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
		
		}
		
		
		
		public static void StateMaster(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.StateMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewSM(driver).click();
			Thread.sleep(5000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(53);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameSM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText3 = "Option 2";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlCountry']/option[2]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t1 = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
		
			masterlocator.EditSM(driver).click();
			Thread.sleep(5000);
		
			masterlocator.NameSM(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(54);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NameSM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText = "Option 2";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlCountry']/option[2]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
		
			
		}
		
		
		public static void StateMasterSearchFilterVerification(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.StateMaster(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;


			Thread.sleep(3000);
			row0 = sheet.getRow(68);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FilterU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
		//	masterlocator.ClickOperation(driver).click();
		//	Thread.sleep(2000);
		
			if(masterlocator.ClickOperation(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.ClickOperation(driver).click();
				test.log(LogStatus.PASS, " Search Box Is working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Search Box Is working Properly "  );
				
			}
		
		
		

		}
		
		
		
		public static void CityMaster(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

		
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.CityMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewCM(driver).click();
			Thread.sleep(13000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(55);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.CityNameCM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText3 = "Option 20";
			String xpathExpression3 = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[20]",OptionText3);
			WebElement dropdownOption3 = driver.findElement(By.xpath(xpathExpression3));
			dropdownOption3.click();
			
			Thread.sleep(10000);
			
			masterlocator.SaveAM(driver).click();
			Thread.sleep(9000);
		
			String t1 = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
			
			masterlocator.EditCM(driver).click();
			Thread.sleep(9000);
			
			masterlocator.CityNameCM(driver).clear();
			Thread.sleep(7000);
			
			row0 = sheet.getRow(56);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.CityNameCM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
		
			String OptionText = "Option 32";
			String xpathExpression = String.format("//select[@id='ContentPlaceHolder1_ddlState']/option[32]",OptionText);
			WebElement dropdownOption = driver.findElement(By.xpath(xpathExpression));
			dropdownOption.click();
			
			Thread.sleep(7000);
			
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.FAIL,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
			
			
		
		
		}
		
		
		
		public static void CityMasterSearchFilter(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.CityMaster(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;


			Thread.sleep(3000);
			row0 = sheet.getRow(68);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.FilterU(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(3000);
			
			//masterlocator.FilterClick(driver).click();
			//Thread.sleep(2000);
			
			if(masterlocator.FilterClick(driver).isEnabled())
			{
				
				Thread.sleep(2000);
			 masterlocator.FilterClick(driver).click();
				test.log(LogStatus.PASS, " Search Box Is working Properly " );
				
			}
			
			else
			{
				test.log(LogStatus.FAIL, " Search Box Is working Properly "  );
				
			}
			Thread.sleep(2000);
		
		
		}
		
		public static void ProcessRatingMaster(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.ProcessMaster(driver).click();
			Thread.sleep(3000);
			
			masterlocator.AddNewPM(driver).click();
			Thread.sleep(5000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			row0 = sheet.getRow(57);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NamePM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			row0 = sheet.getRow(58);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DescriptionPM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
			
			masterlocator.EditPM(driver).click();
			Thread.sleep(5000);
			
			masterlocator.NamePM(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(59);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.NamePM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.DescriptionPM(driver).clear();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(60);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			masterlocator.DescriptionPM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(5000);
			
			masterlocator.SaveAM(driver).click();
			Thread.sleep(5000);
		
			String t1 = masterlocator.SuccessfullyAM(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(3000);
			
			masterlocator.CloseAM(driver).click();
			Thread.sleep(5000);
			
			masterlocator.DeletePM(driver).click();
			Thread.sleep(5000);
			
	        Alert ac2=driver.switchTo().alert();
			
			String t5=driver.switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t5 );
			
			Thread.sleep(4000);
			ac2.accept();
			
			Thread.sleep(1000);
			
			
			
			
		}
		
		
		
		
		public static void UnitAssignment(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{

			
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.UnitAssignment(driver).click();
			Thread.sleep(9000);
			
			masterlocator.AddNewUA(driver).click();
			Thread.sleep(19000);
			
			masterlocator.SelectCompanyUA(driver).click();
			Thread.sleep(9000);
			
			masterlocator.SelectCompanyUADD(driver).click();
			Thread.sleep(5000);
			
			masterlocator.OKUA(driver).click();
			Thread.sleep(19000);
			
			masterlocator.SelectProcessUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SelectProcessUADD(driver).click();
			Thread.sleep(19000);
			
			masterlocator.OK3(driver).click();
			Thread.sleep(19000);
			
			masterlocator.UsersUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.UsersDDUA(driver).click();
			Thread.sleep(15000);
			
			masterlocator.SaveUA(driver).click();
			Thread.sleep(5000);
			
			String t1 = masterlocator.SuccessfullyUA(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(9000);
			
			masterlocator.CloseUA(driver).click();
			Thread.sleep(5000);
			
			
			
			
			
		}
		
		
		
		public static void UnitAssignmentWithoutEnterAnyFilter(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.UnitAssignment(driver).click();
			Thread.sleep(9000);
			
			masterlocator.AddNewUA(driver).click();
			Thread.sleep(19000);
			
			masterlocator.SaveUA(driver).click();
			Thread.sleep(5000);
			
			String t1 = masterlocator.SuccessfullyUA(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t1 );
			Thread.sleep(9000);
			
			masterlocator.CloseUA(driver).click();
			Thread.sleep(5000);
			
			
			
			
			
		}
		
		
		
		public static void UnitAssignmentWithoutEnterParticularFilter(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.UnitAssignment(driver).click();
			Thread.sleep(9000);
			
			masterlocator.AddNewUA(driver).click();
			Thread.sleep(19000);
			
			/*
			masterlocator.SelectCompanyUA(driver).click();
			Thread.sleep(9000);
			
			masterlocator.SelectCompanyUADD(driver).click();
			Thread.sleep(5000);
			
			masterlocator.OKUA(driver).click();
			Thread.sleep(19000);
			
			*/
			
			masterlocator.SelectProcessUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SelectProcessUADD(driver).click();
			Thread.sleep(19000);
			
			masterlocator.OK3(driver).click();
			Thread.sleep(19000);
			
			masterlocator.UsersUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.UsersDDUA(driver).click();
			Thread.sleep(15000);
			
			masterlocator.SaveUA(driver).click();
			Thread.sleep(5000);
			
			String t1 = masterlocator.SuccessfullyUA(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Apply Company Filter - " +  t1 );
			Thread.sleep(9000);
			
			masterlocator.CloseUA(driver).click();
			Thread.sleep(5000);
			
			////////////////////////////////
			
			masterlocator.AddNewUA(driver).click();
			Thread.sleep(19000);
			
			
			masterlocator.SelectCompanyUA(driver).click();
			Thread.sleep(9000);
			
			masterlocator.SelectCompanyUADD(driver).click();
			Thread.sleep(5000);
			
			masterlocator.OKUA(driver).click();
			Thread.sleep(19000);
			
			/*
			
			masterlocator.SelectProcessUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SelectProcessUADD(driver).click();
			Thread.sleep(19000);
			
			masterlocator.OK3(driver).click();
			Thread.sleep(19000);
			*/
		
			masterlocator.UsersUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.UsersDDUA(driver).click();
			Thread.sleep(15000);
			
			masterlocator.SaveUA(driver).click();
			Thread.sleep(5000);
			
			String t21 = masterlocator.SuccessfullyUA(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Apply Process Filter - " +  t21 );
			Thread.sleep(9000);
			
			masterlocator.CloseUA(driver).click();
			Thread.sleep(5000);
			
			//////////////////////////
			
			masterlocator.AddNewUA(driver).click();
			Thread.sleep(19000);
			
			
			masterlocator.SelectCompanyUA(driver).click();
			Thread.sleep(9000);
			
			masterlocator.SelectCompanyUADD(driver).click();
			Thread.sleep(5000);
			
			masterlocator.OKUA(driver).click();
			Thread.sleep(19000);
			
			
			
			masterlocator.SelectProcessUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SelectProcessUADD(driver).click();
			Thread.sleep(19000);
			
			masterlocator.OK3(driver).click();
			Thread.sleep(19000);
			/*
			masterlocator.UsersUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.UsersDDUA(driver).click();
			Thread.sleep(15000);
			
			*/
			
			masterlocator.SaveUA(driver).click();
			Thread.sleep(5000);
			
			String t3 = masterlocator.SuccessfullyUA(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS, "Without Apply User Filter - " +  t3 );
			Thread.sleep(9000);
			
			masterlocator.CloseUA(driver).click();
			Thread.sleep(5000);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		public static void UnitAssignmentEdit(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.UnitAssignment(driver).click();
			Thread.sleep(9000);
			
			masterlocator.EditUA(driver).click();
			Thread.sleep(19000);
			
			masterlocator.SelectUnitUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.SelectUnitDDUA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.Ok(driver).click();
			Thread.sleep(19000);
			
			masterlocator.User1(driver).click();
			Thread.sleep(5000);
			
			masterlocator.User1DD(driver).click();
			Thread.sleep(9000);
			
			masterlocator.SelectProcess(driver).click();
			Thread.sleep(19000);
			
			masterlocator.SelectProcessDD(driver).click();
			Thread.sleep(5000);
			
			masterlocator.ok1(driver).click();
			Thread.sleep(19000);
			
			masterlocator.save2(driver).click();
			Thread.sleep(20000);
			
			String t = masterlocator.Successfully2(driver).getText();
			Thread.sleep(5000);
			
			test.log(LogStatus.PASS,   t );
			Thread.sleep(19000);
			
			masterlocator.close2(driver).click();
			Thread.sleep(9000);
			
		
		
		}
		
		
		
		
		public static void UnitAssignmentReasign(WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException
		{
			
			masterlocator.Master(driver).click();
			Thread.sleep(3000);
			
			masterlocator.UnitAssignment(driver).click();
			Thread.sleep(9000);
			
			masterlocator.ReAssignUA(driver).click();
			Thread.sleep(15000);
			
			masterlocator.User3(driver).click();
			Thread.sleep(5000);
			
			masterlocator.User3DD(driver).click();
			Thread.sleep(20000);
			
			masterlocator.NewUserAssignUA(driver).click();
			Thread.sleep(20000);
			
			masterlocator.NewUserAssignUADD(driver).click();
			Thread.sleep(20000);
			
			masterlocator.Save1UA(driver).click();
			Thread.sleep(5000);
			
	        Alert ac2=driver.switchTo().alert();
			
			String t5=driver.switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t5 );
			
			Thread.sleep(4000);
			ac2.accept();
			
			Thread.sleep(5000);
			
			String t2 = masterlocator.Successfully3(driver).getText();
			Thread.sleep(3000);
			
			test.log(LogStatus.PASS,   t2 );
			Thread.sleep(3000);
			
			masterlocator.Close1UA(driver).click();
			Thread.sleep(5000);
			
			masterlocator.DeleteUA(driver).click();
			Thread.sleep(5000);
		
	        Alert ac=driver.switchTo().alert();
			
			String t=driver.switchTo().alert().getText();
			
			test.log(LogStatus.PASS,  t );
			
			Thread.sleep(4000);
			ac.accept();
			
			Thread.sleep(1000);	
		}
		
	}
