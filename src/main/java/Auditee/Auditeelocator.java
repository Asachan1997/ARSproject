package Auditee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Auditeelocator {
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
	private static WebElement financialyear2=null;
	private static WebElement selectfinancialyear2=null;
	private static WebElement opencount=null;
	private static WebElement company=null;
	private static WebElement selectcompany=null;
	private static WebElement checkbox=null;
	private static WebElement save=null;
	private static WebElement actionbutton=null;
	private static WebElement management=null;
	private static WebElement timeline=null;
	private static WebElement reviewremark=null;
	private static WebElement saveobservation=null;
	private static WebElement submitbtnn=null;
	private static WebElement Auditlogview=null;
	private static WebElement Auditlogdownload=null;
	private static WebElement openpre=null;
	private static WebElement Auditname=null;
	private static WebElement selectAuditnam=null;
	private static WebElement process=null;
	private static WebElement selectprocess=null;
	private static WebElement presave=null;
	private static WebElement preclose=null;
	private static WebElement prereqremark=null;
	private static WebElement viewauditdetails2=null;
	private static WebElement mydashboard=null;
	private static WebElement financialyear1=null;
	private static WebElement selectfinancialyear1=null;
	private static WebElement submittedcount=null;
	private static WebElement Auditname1=null;
	private static WebElement selectAuditname1=null;
	private static WebElement process1=null;
	private static WebElement selectprocess1=null;
	private static WebElement downloaddocument=null;
	private static WebElement rejectedcount=null;
	private static WebElement Auditname2=null;
	private static WebElement selectAuditname2=null;
	private static WebElement process2=null;
	private static WebElement selectprocess2=null;
	private static WebElement viewauditdetailspre=null;
	private static WebElement documentdownload2=null;
	private static WebElement enterremarks=null;
	private static WebElement selectfile=null;
	private static WebElement saveaudit=null;
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
		question1=driver.findElement(By.xpath("//*[@id=\"txtAnswer1\"]"));
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
		financialyear=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/div
		return financialyear;
	}
	public static WebElement clickselectfinancialyear(WebDriver driver) {
		selectfinancialyear=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlFinancialYear_chosen\']/div/ul/li[16]"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[16]
		return selectfinancialyear;
	}
	
	/////////////////IMPLIMENTATION/////////////////////////////////////////////////////////////////////////////////////
	public static WebElement clickopenimpcount(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upObservationStatus']/div/div/div[2]/div/div[2]/div[2]/div/div[3]/a"));
		return ars;
	}
	public static WebElement clickopenimpobser(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdImplementationAudits_lblRiskNotDone_0']"));
		return ars;
	}
	public static WebElement clickaudithis(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP_btnOldAudit_0']"));
		return ars;
	}
	public static WebElement clickaudithisclose(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
		return ars;
	}
	public static WebElement clickauditchangestatus(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverageIMP_btnChangeStatus_0']"));
		return ars;
	}
	public static WebElement clickimpframe(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='showdetails']"));
		return ars;
	}
	public static WebElement clickimpmanagere(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='txtIMPNewManagementResponse']"));
		return ars;
	}
	public static WebElement clickimpstatus1(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='ddlIMPFinalStatus']"));
		return ars;
	}
	public static WebElement clickimpstatus2(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id=\"ddlIMPFinalStatus\"]/option[2]"));
		return ars;
	}
	public static WebElement clickimpstatus3(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id=\"ddlIMPFinalStatus\"]/option[3]"));
		return ars;
	}
	public static WebElement clickimpstatus4(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id=\"ddlIMPFinalStatus\"]/option[4]"));
		return ars;
	}
	public static WebElement clickimpstatus5(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id=\"ddlIMPFinalStatus\"]/option[5]"));
		return ars;
	}
	public static WebElement clicktimelineimp(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='txtIMPNewTimeLine']"));
		return ars;
	}
	public static WebElement clicksubmitimp(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='btnIMPNext3']"));
		return ars;
	}
	public static WebElement clickclosepopup(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id=\"divShowDialog\"]/div/div/div[1]/button"));
		return ars;
	}
	public static WebElement clickbackbutton(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return ars;
	}
	public static WebElement openupcomingCount(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upObservationStatus']/div/div/div[2]/div/div[2]/div[2]/div/div[2]/a"));
		return ars;
	}
	
    
	 
	
	
	//////////////////AUDIT////////////////////////////////////////////////////////////////////////////////////////////
	public static WebElement clickopencount(WebDriver driver) {
		opencount=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divOpenAuditCount']"));
		return opencount;
	}
	public static WebElement clickcompany(WebDriver driver) {
		company=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		return company;
	}
	public static WebElement clickselectcompany(WebDriver driver) {
		selectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[3]"));
		return selectcompany;
	}
	public static WebElement clickcheckbox(WebDriver driver) {
		checkbox=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown_CheckBox1_0']"));
		return checkbox;
	}
	public static WebElement clicksave(WebDriver driver) {
		save=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAllSavechk']"));
		return save;
	}
	public static WebElement clickactionbutton(WebDriver driver) {
		actionbutton=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdDrillDown_btnChangeStatus_0']/img"));
		//*[@id="ContentPlaceHolder1_grdDrillDown_btnChangeStatus_0"]/img
		return actionbutton;
	}
	public static WebElement clickmanagement(WebDriver driver) {
		management=driver.findElement(By.xpath("//*[@id='txtMgtResponse']"));
		return management;
	}
	public static WebElement clicktimeline(WebDriver driver) {
		timeline=driver.findElement(By.xpath("//*[@id='txtTimeLine']"));
		return timeline;
	}
	public static WebElement clickAuditlogview(WebDriver driver) {
		Auditlogview=driver.findElement(By.xpath("//*[@id='AuditLogGrid']/div[2]/table/tbody/tr/td[4]/a[1]"));
		return Auditlogview;
	}
	public static WebElement clickAuditlogdownload(WebDriver driver) {
		Auditlogdownload=driver.findElement(By.xpath("//*[@id='AuditLogGrid']/div[2]/table/tbody/tr/td[4]/a[2]"));
		return Auditlogdownload;
	}
	public static WebElement clickreviewremark(WebDriver driver) {
		reviewremark=driver.findElement(By.xpath("//*[@id='txtRemark']"));
		return reviewremark;
	}
	public static WebElement clicksaveobservation(WebDriver driver) {
		saveobservation=driver.findElement(By.xpath("//*[@id='saveRecommendation']"));
		return saveobservation;
	}
	public static WebElement clicksubmitbtnn(WebDriver driver) {
		submitbtnn=driver.findElement(By.xpath("//*[@id='btnSave']"));
		return submitbtnn;
	}
	public static WebElement clickopenpre(WebDriver driver) {
		openpre=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divPreRequisiteOpenAuditCount']"));
		return openpre;
	}
	public static WebElement clickAuditname(WebDriver driver) {
		Auditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]
		return Auditname;
	}
	public static WebElement clickselectAuditname(WebDriver driver) {
		selectAuditnam=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[10]"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[10]
		return selectAuditnam;
	}
	public static WebElement clickfinancialyear2(WebDriver driver) {
		financialyear2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/div
		return financialyear2;
	}
	public static WebElement clickselectfinancialyear2(WebDriver driver) {
		selectfinancialyear2=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlFinancialYear_chosen\']/div/ul/li[15]"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[15]
		return selectfinancialyear2;
	}
	public static WebElement clickprocess(WebDriver driver) {
		process=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
		//*[@id="ContentPlaceHolder1_ddlProcess_chosen"]
		return process;
	}
	public static WebElement clickselectprocess(WebDriver driver) {
		selectprocess=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
		return selectprocess;
		//*[@id="ContentPlaceHolder1_ddlProcess_chosen"]/div/ul/li[2]
	}
	public static WebElement clickviewauditdetails2(WebDriver driver) {
		viewauditdetails2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditDetails_0']/img"));
		return viewauditdetails2;
	}
	public static WebElement clickprereqremark(WebDriver driver) {
		prereqremark=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtRemark']"));
		return prereqremark;
	}
	public static WebElement clickpresave(WebDriver driver) {
		presave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return presave;
	}
	public static WebElement clickpreclose(WebDriver driver) {
		preclose=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
		return preclose;
	}
	public static WebElement clickmydashboard(WebDriver driver) {
		mydashboard=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]/a"));
		//*[@id="CMPMenuBar"]/ul/li[2]/a
		return mydashboard;
	}
	/*public static WebElement clickfinancialyear1(WebDriver driver) {
		financialyear1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
		return financialyear1;
	}*/
	public static WebElement clickselectfinancialyear1(WebDriver driver) {
		selectfinancialyear1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlFinancialYear_chosen\']/div/ul/li[3]"));
		return selectfinancialyear1;
	}
	public static WebElement clicksubmittedcount(WebDriver driver) {
		submittedcount=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount']"));
		//*[@id="ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount"]
		return submittedcount;
	}
	public static WebElement clickAuditname1(WebDriver driver) {
		Auditname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]
		return Auditname1;
	}
	public static WebElement clickselectAuditname1(WebDriver driver) {
		selectAuditname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[9]"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[9]
		return selectAuditname1;
	}
	public static WebElement clickprocess1(WebDriver driver) {
		process1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
		//*[@id="ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount"]
		return process1;
	}
	public static WebElement clickselectprocess1(WebDriver driver) {
		selectprocess1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
		//*[@id="ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount"]
		return selectprocess1;
	}
	public static WebElement clickdownloaddocument(WebDriver driver) {
		downloaddocument=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lblDocumentDownLoadDraftFile_0']"));
		//*[@id="ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount"]
		return downloaddocument;
	}
	public static WebElement clickrejectedcount(WebDriver driver) {
		rejectedcount=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divPreRequisiteRejectedCount']"));
		//*[@id="ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount"]
		return rejectedcount;
	}
	public static WebElement clickAuditname2(WebDriver driver) {
		Auditname2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]
		return Auditname2;
	}
	public static WebElement clickselectAuditname2(WebDriver driver) {
		selectAuditname2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[9]"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[9]
		return selectAuditname2;
	}
	public static WebElement clickprocess2(WebDriver driver) {
		process2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']"));
		//*[@id="ContentPlaceHolder1_divPreRequisiteSubmittedAuditCount"]
		return process2;
	}
	public static WebElement clickselectprocess2(WebDriver driver) {
		selectprocess2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
		return selectprocess2;
	}
	public static WebElement clickdocumentdownload2(WebDriver driver) {
		documentdownload2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lblDocumentDownLoadDraftFile_0']"));
		return documentdownload2;
	}
	public static WebElement clickviewauditdetailspre(WebDriver driver) {
		viewauditdetailspre=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditDetails_0']/img"));
		return viewauditdetailspre;
	}
	public static WebElement clickenterremarks(WebDriver driver) {
		enterremarks=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtRemark']"));
		return enterremarks;
	}       
	public static WebElement clickselctfile(WebDriver driver) {
		selectfile=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtSelectfile']"));
		return selectfile;
	}
	public static WebElement clicksaveaudit(WebDriver driver) {
		saveaudit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return saveaudit;
	}
}
