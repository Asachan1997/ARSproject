package managementArs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class locators {
	
	private static WebElement ars = null;
	
	public static WebElement clickARS(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='dvbtnAudit']"));
		return ars;
	}
	public static WebElement ClickHighOpen(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"));
		return ars;
	}

	public static WebElement FinanceAccountsHigh(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;                                          
	}
					
	public static WebElement ClickExport(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='lbtnExportExcel']"));
				return ars;
	}
			
	public static WebElement RiskView(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody/tr[1]/td[8]/a"));
				return ars;                      
	}
			
	public static WebElement RiskViewClose(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
				return ars;
	}
			
	public static WebElement readTotalItems(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[3]/span"));
				return ars;
	}
			
	public static WebElement SelectPeriod(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ddlPeriodMultiSelect_sl']"));
				return ars;
	}
	
	public static WebElement PeriodAnnually(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ddlPeriodMultiSelect_0']"));
				return ars;
	}
	
	public static WebElement ApplyFilter(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='btnFilter']"));
				return ars;
	}
	
	public static WebElement ClosePopRisk(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='DivReports']/div/div/div[1]/button"));
				return ars;
	}
	
	public static WebElement ClickBack(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@class='highcharts-button highcharts-drillup-button highcharts-button-normal']"));
				return ars;
	}
	
	public static WebElement ClickBack1(WebDriver driver)		
	{
				ars = driver.findElement(By.linkText("< Back"));
				return ars;
	}
	
	public static WebElement ClickHighClose(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label']"));
				return ars;
	}
	public static WebElement ClickDashboard(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]"));
		return ars;
	}
	public static WebElement ClickMediumOpen(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[2]"));
				return ars;
	}
	
	public static WebElement ClickMediumClose(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[2]"));
				return ars;
	}
	public static WebElement ClickLowOpen(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[3]"));
				return ars;
	}
	
	public static WebElement ClickLowClose(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[3]"));
				return ars;
	}
	public static WebElement ProcessInefficiencyClose(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[6]"));
				return ars;
	}
	
	public static WebElement ProcessInefficiencyOpen(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[6]"));
				return ars;
	}
	
	public static WebElement readHigh(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined ']"));
				return ars;
	}
	
	public static WebElement readMedium(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;
	}
	
	public static WebElement readLow(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[3]"));
				return ars;
	}
	
	public static WebElement CategoryView(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ObservationDetailsGrid']/div[2]/table/tbody/tr[1]/td[9]/a"));
				return ars;
	}
	public static WebElement ProcessLow (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label']"));
				return ars;
	}
	
	public static WebElement ProcessMedium (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[10]"));
				return ars;
	}
	
	public static WebElement ProcessHigh (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[13]"));
				return ars;
	}
	public static WebElement ProcessOpen (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined ']"));
				return ars;
	}
	
	public static WebElement ProcessClose (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;
	}
	public static WebElement btnminimize (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='DivFilters']/div/div/div/div[1]/div/a[1]/i"));
				return ars;
	}
	
	public static WebElement SelectFinancialYear1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYearMultiSelect_sl']"));
				return ars;
	}
	
	public static WebElement SelectAll (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@id='checks']/span[1]/input)[6]"));
				return ars;
	}
	
	public static WebElement SelectAllOk (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[6]"));
				return ars;
	}
	
	public static WebElement ApplyFilters (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnFilter']"));
				return ars;
	}
	
	public static WebElement RightArrow (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class=' highcharts-button-box'])[6]"));
				return ars;
	}
	
	public static WebElement Categoryname (WebDriver driver)		
	{
				ars = driver.findElement(By.cssSelector("#highcharts-0 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(23) > tspan"));
				
				return ars;
	}
	public static WebElement Click90dayss (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;
	}
	
	public static WebElement ClickNotDue (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[7]"));;
				return ars;
	}
	public static WebElement AuditCommitteeOpen (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 '])[2]"));
				return ars;
	}
	public static WebElement AuditCommitteeClose (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 '])[2]"));
				return ars;
	}
	public static WebElement AuditTrackerPlanned (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditTrackerSummary']/tbody/tr[2]/td[2]"));
				return ars;
	}
	public static WebElement clickobservationlist (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[3]/a"));
				return ars;
				
	}
	public static WebElement clickunit (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
				//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/a
				return ars;			
	}
	public static WebElement clickselectunit (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[11]"));
				//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[11]
				return ars;			
	}
	public static WebElement clickfinancialyear (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
				return ars;			
	}
	public static WebElement clickselectfinancialyear (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[15]"));
				return ars;			
	}
	public static WebElement clickviewbutton (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkviewAudit_0']/img"));
				return ars;			
	}
	public static WebElement clickprocess1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
				return ars;			
	}
	public static WebElement clickselectprocess1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
				return ars;			
	}
	public static WebElement clickbackbutton (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
				return ars;			
	}
	public static WebElement clickbackbutton1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
				return ars;			
	}
	public static WebElement clickauditstataus (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditStatus_0']"));
				//*[@id="ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditStatus_0"]/img
				return ars;			
	}
	public static WebElement clickimplementation (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkImplementation']"));
				return ars;			
	}
	public static WebElement clickviewbutton1 (WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudit_btnChangeStatus_0']"));
		//*[@id="ContentPlaceHolder1_grdImplementationAudit_btnChangeStatus_0"]
				return ars;			
	}
	public static WebElement clickframe1(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='showdetails']"));
		//*[@id="showdetails"]
		return ars;
	}
	public static WebElement clickselectunit1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[39]"));
				//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[39]
				return ars;
	}
	public static WebElement clickmanagementresponse (WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='txtIMPNewManagementResponse']"));
				return ars;			
	}
	public static WebElement clicksubmittohigherlevel (WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='btnSubmitToHigher']"));
				return ars;			
	}
	public static WebElement clickclosed1 (WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
		//*[@id="divShowDialog"]/div/div/div[1]/button
				return ars;			
	}
	public static WebElement clickimplementstatus (WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
				return ars;			
	}
}
	
	/*public static WebElement HighOpen(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label']"));
		return ars;
		
	}*/
	