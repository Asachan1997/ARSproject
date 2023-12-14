package arsProduct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArsLocators {
	
private static WebElement ars = null;				//WebElement variable created for 'Categories' click
	
	private static List<WebElement> arsList = null;		
	

	public static WebElement clickARS(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='dvbtnAudit']"));
		return ars;
	}
	
	public static WebElement clickMaster(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"));
		return ars;
	}
	
	public static WebElement UnitAssignment(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[8]/a"));
		return ars;
	}
	
	public static WebElement AddNew(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddComplianceType']"));
		return ars;
	}
	
	public static WebElement SelectCompany(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPup_sl']"));
		return ars;
	}
	
	public static WebElement Ahemdabad(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPup_0']"));
		return ars;
	}
	
	public static WebElement Ok(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='buttons']/input[1]"));
		return ars;
	}
	
	public static WebElement SelectUser(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsers_chosen']/a/span"));
		return ars;
	}
	
	public static WebElement RichaShah(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsers_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement SelectProcess(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHead_sl']"));
		return ars;
	}
	
	public static WebElement ActionProcess(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHead_1']"));
		return ars;
	}
	
	public static WebElement ProcessOk(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[6]"));
		return ars;
	}
	
	public static WebElement Save(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAuditHeadSave']"));
		return ars;
	}
	
	public static WebElement Savemsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_AuditHeadValidationSummary']/ul/li"));
		return ars;
	}
	
	public static WebElement close(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnClose']"));
		return ars;
	}
	
	public static WebElement Management(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabManagement']"));
		return ars;
	}
	
	public static WebElement SelectUnit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPup_sl']"));
		return ars;
	}
	
	
	public static WebElement AhemdabadMgmt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPup_0']"));
		return ars;
	}
	
	public static WebElement User(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsers_chosen']/a"));
		return ars;
	}
	
	public static WebElement PlantHead(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsers_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement SelectProcessMgmt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagement_sl']"));
		return ars;
	}
	
	public static WebElement ActionProcessMgmt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagement_1']"));
		return ars;
	}

	public static WebElement SaveMgmt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnManagementSave']"));
		return ars;
	}

	public static WebElement SaveMgmtMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ManagementValidationSummary']/ul/li"));
		return ars;
	}
	
	public static WebElement CloseMgmt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseManagement']"));
		return ars;
	}
	
	public static WebElement DepartmentHead(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabDepartmentHead']"));
		return ars;
	}

	
	public static WebElement SelectUnitDpt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPup_sl']"));
		return ars;
	}
	
	public static WebElement AhemdabadDept(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPup_0']"));
		return ars;
	}

	public static WebElement SelectUserDpt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsers_chosen']/a"));
		return ars;
	}
	
	public static WebElement Departmenthead(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsers_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement SelectDepartment(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartment_sl']"));
		return ars;
	}
	
	public static WebElement AdminDpt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartment_0']"));
		return ars;
	}
	
	
	public static WebElement SaveDpt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDepartmentHeadSave']"));
		return ars;
	}
	
	public static WebElement SaveDptMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DepartmentHeadValidationSummary']/ul/li"));
		return ars;
	}
	
	public static WebElement CloseDpt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDepartmentHead']"));
		return ars;
	}
	
	public static WebElement EditUnitAssignment(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddComplianceTypeEdit']"));
		return ars;
	}
	
	public static WebElement SelectUnitEdit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPupEdit_sl']"));
		return ars;
	}
	
	public static WebElement Ahemdabad1(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityAuditHeadPopPupEdit_0']"));
		return ars;
	}
	
	public static WebElement Ok1(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[19]"));
		return ars;
	}

	public static WebElement SelectUser1(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsersEdit_chosen']/a"));
		return ars;
	}

	public static WebElement RichaShah1(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditHeadUsersEdit_chosen']/div/ul/li[2]"));
		return ars;
	}

	public static WebElement SelectProcess1(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHeadEdit_sl']"));
		return ars;
	}
	
	public static WebElement AgroServiceDivision(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessAuditHeadEdit_1']"));
		return ars;
	}
	
	public static WebElement Ok2(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[24]"));
		return ars;
	}

	public static WebElement SaveEdit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAuditHeadSaveEdit']"));
		return ars;
	}
	
	public static WebElement SaveEditMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_AuditHeadValidationSummaryEdit']/ul/li"));
		return ars;
	}
	
	public static WebElement Editclose(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseEdit']"));
		return ars;
	}
	
	public static WebElement ManagementEdit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabManagementEdit']"));
		return ars;
	}
	
	public static WebElement SelectUnitEditM(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPupEdit_sl']"));
		return ars;
	}
	
	public static WebElement AhemdabadEditM(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityManagementPopPupEdit_0']"));
		return ars;
	}

	public static WebElement SelectUser1M(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsersEdit_chosen']/a"));
		return ars;
	}
	
	public static WebElement PlantHead1M(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlManagementUsersEdit_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement SelectProcess1M(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagementEdit_sl']"));
		return ars;
	}
	
	public static WebElement ActionProcessM(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessManagementEdit_1']"));
		return ars;
	}
	
	public static WebElement SaveME(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnManagementSaveEdit']"));
		return ars;
	}

	public static WebElement SaveMEMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ManagementValidationSummaryEdit']/ul/li"));
		return ars;
	}

	public static WebElement SelectSubUnit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1ManagementPopPupEdit_sl']"));
		return ars;
	}
	
	public static WebElement gujrat(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1ManagementPopPupEdit_0']"));
		return ars;
	}
	
	public static WebElement OkSubunit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[20]"));
		return ars;
	}

	public static WebElement CloseEditM(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseManagementEdit']"));
		return ars;
	}
	
	public static WebElement DepartmentHeadEdit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnTabDepartmentHeadEdit']"));
		return ars;
	}
	
	public static WebElement SelectUnitDept(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPupEdit_sl']"));
		return ars;
	}
	
	public static WebElement AhemdabadEditDept(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityDepartmentHeadPopPupEdit_0']"));
		return ars;
	}
	
	public static WebElement SelectUser1Dpt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsersEdit_chosen']/a"));
		return ars;
	}
	
	public static WebElement DepartmentheadDpt(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentHeadUsersEdit_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement SelectDepartmentedit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentEdit_sl']"));
		return ars;
	}
	
	public static WebElement Adminedit(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlDepartmentEdit_0']"));
		return ars;
	}
	
	public static WebElement DptSave(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDepartmentHeadSaveEdit']"));
		return ars;
	}
	
	public static WebElement DptSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DepartmentHeadValidationSummaryEdit']/ul/li"));
		return ars;
	}
	
	public static WebElement DptClose(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDepartmentHeadEdit']"));
		return ars;
	}
	
	public static WebElement ReAssign(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReAssign']"));
		return ars;
	}
	
	public static WebElement ReAssignUser(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/a"));
		return ars;
	}
	
	public static WebElement ReAsRichaShahr(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement NewUser(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/a"));
		return ars;
	}
	
	public static WebElement NewUserRS(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement NewUserSave(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReassignEvent']"));
		return ars;
	}
	
	public static WebElement ReAssignClose(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReassignClose']"));
		return ars;
	}
	
	public static WebElement NewUserSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_VSReassignSummary']/ul/li"));
		return ars;
	}
	
	public static WebElement DeleteProcess(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAssignEntities_lbtDelete_0']/img"));
		return ars;
	}
	
	public static WebElement AuditReporting(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"));
		return ars;
	}
	
	public static WebElement ImportExportUtility(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[1]/a"));
		return ars;
	}
	
	public static WebElement RiskControlMatrix(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rdoRCMUpload']"));
		return ars;
	}
	
	public static WebElement SelectApplicableLocation(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilterLocation']"));
		return ars;
	}
	
	public static WebElement LocationExpand(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tvFilterLocationn0']"));
		return ars;
	}	
	
	public static WebElement India(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tvFilterLocationn43CheckBox']"));
		return ars;
	}	
	
	public static WebElement Vertical(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='caption']"));
		//*[@id="caption"]
		return ars;
	}	
	
	public static WebElement Vertical1(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVerticalBranch_sl']"));
		return ars;
	}	
	
	public static WebElement NA(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVerticalBranch_5']"));
		//*[@id="ContentPlaceHolder1_ddlVerticalBranch_5"]
		return ars;
	}	
	
	public static WebElement ChooseFile(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_MasterFileUpload']"));
		return ars;
	}	
	
	public static WebElement Upload(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnUploadFile']"));
		return ars;
	}	
	
	public static WebElement SubProcess(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rdoSubProcess']"));
		return ars;
	}	
	
	
	public static WebElement UpdateRiskControlMatrix(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rdoRCMUpdate']"));
		return ars;
	}	
	
	public static WebElement ExportUtility(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Tab2']"));
		return ars;
	}	
	
	public static WebElement Company(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		return ars;
	}	
	
	public static WebElement EnterText(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/div/input"));
		return ars;
	}	
	
	public static WebElement IndiaCompany(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[59]"));
		return ars;
	}	
	
	public static WebElement Export(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return ars;
	}	
	
	public static WebElement AuditScheduling(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[4]/a"));
		return ars;
	}	
	
	public static WebElement ASAddNew(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCompliance']"));
		return ars;
	}	
	
	public static WebElement ASSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ctl02']/ul/li"));
		return ars;
	}	
	
	public static WebElement CompanyAS(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/a"));
		return ars;
	}	
	
	public static WebElement IndiaAS(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/div/ul/li[59]"));
		return ars;
	}	
	
	public static WebElement SelectProcessAS(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessList_sl']"));
		return ars;
	}	
	
	public static WebElement BankingCheckbox(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessList_0']"));
		return ars;
	}	
	
	public static WebElement OK(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[2]"));
		return ars;
	}	
	
	public static WebElement FinancialYear(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a"));
		return ars;
	}	
	
	public static WebElement SelectFinancialYear(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[16]"));
		return ars;
	}	
	
	public static WebElement SchedulingType(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
		return ars;
	}	
	
	public static WebElement STAnnually(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
		return ars;
	}	
	
	public static WebElement StartDate(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtStartDatePop']"));
		return ars;
	}	
	
	public static WebElement EndDate(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtEndDatePop']"));
		return ars;
	}	
	
	public static WebElement SelectBank(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAnnually_chkAnnualy1_1']"));
		return ars;
	}	
	
	public static WebElement SaveBtn(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ars;
	}	
	
	public static WebElement CloseBtn(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
		return ars;
	}	
	
	public static WebElement DisplayScheduleInformation(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_LinkButton3_0']/img"));
		return ars;
	}	
	
	public static WebElement DisplayScheduleInformationSave(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSaveSchedule']"));
		return ars;
	}	
	
	public static WebElement DSSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ars;
	}	
	
	public static WebElement DSClose(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Button2']"));
		return ars;
	}
	
	public static WebElement EditScheduleInformation(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_LinkButton1_0']/img"));
		return ars;
	}
	
	public static WebElement Frequency(WebDriver driver)		//Method for closing Message Popup
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditSchedulingEDIT_chkAnnualy1_1']"));
		return ars;
	}
	
	public static WebElement EditSave(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnEDITSave']"));
		return ars;
	}
	
	public static WebElement EditSaveMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary3']/ul/li"));
		return ars;
	}
	
	public static WebElement DeleteSchedulingDetails(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_LinkButton2_0']/img"));
		return ars;
	}
	
	public static WebElement AuditKickoff(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[5]/a"));
		return ars;
	}
	
	public static WebElement ReAssignAK(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReAssign']"));
		return ars;
	}
	
	public static WebElement UserAK(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/a"));
		return ars;
	}
	
	public static WebElement DhammapalPerformer(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlUser_chosen']/div/ul/li[18]"));
		return ars;
	}
	
	public static WebElement CompanyAK(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPopup_chosen']/a"));
		return ars;
	}
	
	public static WebElement IndiaAK(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPopup_chosen']/div/ul/li[59]"));
		return ars;
	}
	
	public static WebElement NewUserAK(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/a"));
		//*[@id="ContentPlaceHolder1_ddlREAssignUser_chosen"]/a
		return ars;
	}
	
	public static WebElement ambujperformer2(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdReassign_ddlGridReAssignUser_0_chosen']/div/ul/li[3]"));
		return ars;
	}
	
	public static WebElement SaveAk(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnReassignEvent']"));
		return ars;
	}
	
	public static WebElement SaveAkMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_VSReassignSummary']/ul/li"));
		return ars;
	}
	
	public static WebElement Close(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divReAssign']/div/div/div[1]/button"));
		return ars;
	}
	
	public static WebElement Implementation(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rbtEventReAssignment_1']"));
		return ars;
	}
	
	public static WebElement ViewProcessWiseDetails(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudit_LinkButton3_0']/img"));
		return ars;
	}
	
	public static WebElement Performer(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlPerformerImplemetationHeader_sl']"));
		return ars;
	}
	
	public static WebElement PerformerCheckBox(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlPerformerImplemetationHeader_1']"));
		return ars;
	}
	
	public static WebElement PerformerOk(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[2]"));
		return ars;
	}
	
	public static WebElement SelectReviwer(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlReviewerImplemetationHeader']"));
		return ars;
	}
	
	public static WebElement SelectReviwerA(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcess_ddlReviewerImplemetationHeader']/option[4]"));
		return ars;
	}
	
	public static WebElement SaveVp(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ars;
	}
	
	public static WebElement SaveVpMSg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ars;
	}
	
	public static WebElement AuditAssignmentSampleExcelFile(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnDownloadSampleFormat']"));
		return ars;
	}
	
	public static WebElement ChooseFileVP(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_fileUploadKickOff']"));
		return ars;
	}
	
	public static WebElement UploadVp(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnUploadDocument']"));
		return ars;
	}
	
	public static WebElement Back(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return ars;
	}
	
	public static WebElement UploadMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ars;
	}
	
	public static WebElement AdditionalRiskCreation(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[2]/a"));
		return ars;
	}
	
	public static WebElement ARAddNew(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']"));
		return ars;
	}
	
	public static WebElement CompanyAr(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/a"));
		return ars;
	}
	
	public static WebElement IndiaAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/div/ul/li[30]"));
		return ars;
	}
	
	public static WebElement SelectProcessAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessPopup_sl']"));
		return ars;
	}
	
	public static WebElement ActionProcessAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcessPopup_1']"));
		//*[@id="ContentPlaceHolder1_ddlProcessPopup_1"]
		return ars;
	}
	
	public static WebElement OkAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='buttons']/input[1]"));
		//*[@id="buttons"]/input[1]
		return ars;
	}
	
	public static WebElement SelectSubProcess(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='caption']"));
		//*[@id="caption"]
		return ars;
	}
	
	public static WebElement SubAction(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubProcessPopup_0']"));
		//*[@id="ContentPlaceHolder1_ddlSubProcessPopup_0"]
		return ars;
	}
	
	public static WebElement OkSubAction(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("(//*[@id='buttons']/input[1])[2]"));
		return ars;
	}
	
	public static WebElement SelectPersonResponsible(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditee_chosen']/a"));
		return ars;
	}
	
	public static WebElement ambujperformer2AR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditee_chosen']/div/ul/li[3]"));
		return ars;
	}
	
	public static WebElement SelectRCMType(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlRCMType_chosen']/a"));
		return ars;
	}
	
	public static WebElement Both(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlRCMType_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement ObjectiveRef(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxControlNo']"));
		return ars;
	}
	
	public static WebElement Risk(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxRisk']"));
		return ars;
	}
	
	public static WebElement ControlObjective(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxConrolObj']"));
		return ars;
	}
	
	public static WebElement ControlDescription(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxControlDesc']"));
		return ars;
	}
	
	public static WebElement AuditMethodology(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAuditObjective']"));
		return ars;
	}
	
	public static WebElement AuditSteps(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAuditSteps']"));
		return ars;
	}
	
	public static WebElement SaveAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ars;
	}
	
	public static WebElement SelectKeyType(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlKeyControl_chosen']/a"));
		return ars;
	}
	
	public static WebElement SelectKeyTypeYes(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlKeyControl_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement SaveMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ctl04']/ul/li"));
		return ars;
	}
	
	public static WebElement CloseBtnAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Button1']"));
		return ars;
	}
	
	public static WebElement ExportAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return ars;
	}
	
	public static WebElement CompanyAR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		return ars;
	}
	
	public static WebElement IndiaARF(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[59]"));
		return ars;
	}

	public static WebElement Process(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/a"));
		return ars;
	}
	
	public static WebElement ActionProcessARF(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	public static WebElement Search(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFilter']"));
		return ars;
	}
	
	public static WebElement AuditStepFilter(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lblActivityToBeDone_0']"));
		return ars;
	}
	
	public static WebElement AddNewRiskDetails(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_LinkButton2_0']/img"));
		return ars;
	}
	
	public static WebElement AuditStep(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtATBD']"));
		return ars;
	}
	
	public static WebElement SaveANR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnPopupSave']"));
		return ars;
	}
	
	public static WebElement SaveANRMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary3']/ul/li"));
		return ars;
	}
	
	public static WebElement CloseANR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
		return ars;
	}
	
	public static WebElement EditRiskDetails(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_LinkButton1_0']/img"));
		return ars;
	}
	
	public static WebElement DeActivate(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeActivate']"));
		return ars;
	}
	
	public static WebElement ireland(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[3]"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[3]
		return ars;
	}
	
	public static WebElement SelectAuditStep(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditStepList_sl']"));
		return ars;
	}
	
	public static WebElement SelectAuditStepChckBox(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditStepList_0']"));
		return ars;
	}
	
	public static WebElement ClickShow(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnShow']"));
		return ars;
	}
	
	public static WebElement CheckBox(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditStepList_chkRow_0']"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/div/ul/li[3]
		return ars;
	}
	
	public static WebElement SaveDeactivate(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ars;
	}
	
	public static WebElement SaveDeactivateMSG(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ars;
	}
	
	
	public static WebElement ClickDashboard(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]"));
		return ars;
	}
	
	public static WebElement SpecialAuditScheduling(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[6]/a"));
		return ars;
	}
	
	public static WebElement ADDNew(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCompliance']"));
		return ars;
	}
	
	public static WebElement india(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPop_chosen']/div/ul/li[59]"));
		return ars;
	}
	
	public static WebElement FinancialYearSA(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a"));
		return ars;
	}
	
	public static WebElement FY20232024(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[16]"));
		return ars;
	}
	
	public static WebElement VerticalSA(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVertical_chosen']/a"));
		return ars;
	}
	
	public static WebElement NASA(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlVertical_chosen']/div/ul/li[2]"));
		return ars;
	}
	
	
	public static WebElement StartDateSA(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtStartDatePop']"));
		return ars;
	}
	
	public static WebElement EndDateSa(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtEndDatePop']"));
		return ars;
	}
	
	public static WebElement ProcessName(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAnnually_txtNewProcess_0']"));
		return ars;
	}
	
	public static WebElement SaveSA(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ars;
	}
	
	public static WebElement SaveSAMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ars;
	}
	
	public static WebElement CloseSa(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
		return ars;
	}
	
	public static WebElement AuditDocuments(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[7]/a"));
		return ars;
	}
	
	public static WebElement AddNewDA(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
		return ars;//*[@id="ddlLegalEntityPopPup_chosen"]/a
	}
	
	public static WebElement CompanyAD(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/a"));
		return ars;
	}
	
	public static WebElement indiaAD(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/div/ul/li[30]"));
		return ars;
	}
	
	public static WebElement FinanacialYear(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/a"));
		return ars;
	}
	
	public static WebElement FY(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/div/ul/li[16]"));
		return ars;
	}
	
	public static WebElement ChooseFileAD(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='FileUploadObservation']"));
		return ars;
	}
	
	public static WebElement SaveAD(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='btnSave']"));
		return ars;
	}
	
	public static WebElement ClosePop(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divreports']/div/div/div[1]/button"));
		return ars;
	}
	
	public static WebElement View(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']"));
		return ars;
	}
	
	public static WebElement ClickDownload(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdVersionDownload_lblDownLoadfile_0']"));
		return ars;
	}
	
	public static WebElement ViewClose(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divVersionDialog']/div/div/div[1]/button"));
		return ars;
	}
	
	public static WebElement  SpecialAuditStep(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_upCompliancesList']/div/div/div/section/div[8]/div[1]/u/a"));
		return ars;
	}
	
	public static WebElement  Choosefile(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_fuSpecialAuditSteps_3']"));
		return ars;
	}
	
	public static WebElement  upload(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_btnAuditStepsSave_3']"));
		return ars;
	}
	
	public static WebElement  uploadMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary2']/ul/li"));
		return ars;
	}
	
	public static WebElement ReportGeneration(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[7]/a"));
		return ars;
	}
	
	public static WebElement allahabad(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[53]"));
		//*[@id="ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_16"]/img
		return ars;
	}
	
	public static WebElement FinancialYearRG(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancialYear_chosen']/a"));
		return ars;
	}
	
	public static WebElement RG20232024(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancialYear_chosen']/div/ul/li[15]"));
		return ars;
	}
	
	public static WebElement RG20222023(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancialYear_chosen']/div/ul/li[15]"));
		return ars;
	}
	
	public static WebElement FinancialYearText(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling']/tbody/tr[2]/td[5]/div/span"));
		return ars;
	}
	
	public static WebElement ExportRG(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnExcelExport']"));
		return ars;
	}
	
	public static WebElement ViewAuditStatus(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_lnkAuditStatus_0']/img"));
		return ars;
	}
	
	public static WebElement ViewAuditStatusClose(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
		return ars;
	}
	
	public static WebElement ViewAuditDetails(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_11']/img"));
		//*[@id="ContentPlaceHolder1_grdAuditScheduling_lnkAuditDetails_11"]/img
		return ars;
	}
	
	public static WebElement ChooseFileRG(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_FeedbackFileUpload']"));
		return ars;
	}
	
	public static WebElement Remarks(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtRemark']"));
		return ars;
	}
	
	public static WebElement SaveVAD(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnObservation']"));
		return ars;
	}
	
	public static WebElement SaveVADMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary3']/ul/li"));
		return ars;//Record Save Successfully.
	}
	
	public static WebElement Draft(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDraft']"));
		return ars;
	}
	
	public static WebElement GenerateReport(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnGenrateReport']"));
		return ars;
	}
	
	public static WebElement DraftObservationListing(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtObservationList']"));
		return ars;
	}
	
	public static WebElement Observation(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_tbxObservation_0']"));
		return ars;
	}
	
	public static WebElement ObservationList_CheckBox(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_CheckBox1_0']"));
		return ars;
	}
	
	public static WebElement ObservationList_Save(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ars;
	}
	
	public static WebElement ObservationList_SaveMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ars;
	}
	
	public static WebElement ObservationList_Export(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblExport']"));
		return ars;
	}
	
	public static WebElement ViewAuditDetail(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkViewAudit_0']/img"));
		return ars;//*[@id="ContentPlaceHolder1_grdObservationList_lnkViewAudit_0"]/img
	}
	
	public static WebElement ViewAuditDetailclose(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
		return ars;
	}
	
	public static WebElement Delete(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkAuditDetails_0']/img"));
		return ars;
	}
	
	public static WebElement BackDOR(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return ars;
	}
	
	
	public static WebElement PastObservations(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[8]/a"));
		return ars;
	}
	
	public static WebElement UploadHistoricalObservations(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:37']/li[1]/a"));
		return ars;
	}
	
	public static WebElement FormatHistoricalObservation(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_performerdocuments']/div[1]/div[4]/div[3]/u/a"));
		return ars;
	}
	
	public static WebElement fileUploadHO(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_fileUploadRCM']"));
		return ars;
	}
	
	public static WebElement UploadHO(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnUploadRCM']"));
		return ars;
	}
	
	public static WebElement UploadHOMsg(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li/ol/li"));
		return ars;
	}
	
	public static WebElement ClickDwonload(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUploadedHistrory_lnkAuditDetails_0']/img"));
		return ars;
	}
	
	public static WebElement ViewHistoricalObservations(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:37']/li[2]/a"));
		return ars;
	}
	
	public static WebElement AuditStepText(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations_lblAuditStep_0']"));
		return ars;
	}
	
	public static WebElement ViewAuditt(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations']/tbody/tr[2]/td[4]/div/div[2]"));
		return ars;
	}
	
	public static WebElement ViewAuditText(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblviewAuditStep']"));
		return ars;
	}
	
	public static WebElement ViewAuditclose(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='btnClose']"));
		return ars;
	}
	
	
	public static WebElement ObservationCount(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdViewObservations_lnkObservationCount_0']"));
		return ars;
	}
	
	
	public static WebElement ObservationViewAuditStep(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='LinkButton1']/img"));
		return ars;
	}
	
	public static WebElement ObservationViewAuditStepT(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='lblviewAuditStep']"));
		return ars;
	}
	
	public static WebElement ObservationCloseAuditStep(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("(//*[@id='btnClose'])[2]"));
		return ars;
	}
	
	public static WebElement DetailedObservationView(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='grdDetailedObs_LinkButton1_0']/img"));
		return ars;
	}
	
	public static WebElement DetailedObservationViewText(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='lblObservation']"));
		return ars;
	}
	
	public static WebElement DetailedObservationViewClose(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("(//*[@id='btnClose'])"));
		return ars;
	}
	
	public static WebElement DetailedObservationClose(WebDriver driver)		
	{
		ars = driver.findElement(By.xpath("//*[@id='divPREDOCShowDialog']/div/div/div[1]/button"));
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
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-1 highcharts-drilldown-data-label'])[4]"));
				return ars;
	}
	
	public static WebElement ProcessInefficiencyOpen(WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-0 highcharts-drilldown-data-label'])[5]"));
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
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined highcharts-drilldown-data-label'])[17]"));
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
	
	public static WebElement Click90days (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[2]"));
				return ars;
	}
	
	public static WebElement ClickNotDue (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("(//*[@class='highcharts-label highcharts-data-label highcharts-data-label-color-undefined '])[11]"));
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
	
	public static WebElement AuditStatusView (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_newLinkButton2']/img"));
				return ars;
	}
	
	
	public static WebElement AuditTrackerActual (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditTrackerSummary']/tbody/tr[3]/td[2]"));
				return ars;
	}
	
	public static WebElement AuditStatusExport (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
				return ars;
	}
	
	public static WebElement DraftClosure (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDraftClosure']"));
				return ars;
	}
	
	public static WebElement DraftObservationListing1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDraftClosure']"));
				return ars;
	}
	
	public static WebElement ExportToExcel (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
				return ars;
	}
	
	public static WebElement Observation1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_tbxObservation_0]"));
				return ars;
	}
	
	public static WebElement OpenAudit (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divOpenAMCount']"));
				return ars;
	}
	
	public static WebElement ViewAuditDetails1 (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_2']/img"));
				return ars;
	}
	
	public static WebElement ExporttoExcel (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
				return ars;
	}
	
	public static WebElement ImplementationOpenAudit (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divOpenAMIMPCount']"));
				return ars;
	}
	
	public static WebElement ClosedAudits (WebDriver driver)		
	{
				ars = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_divCloseAMCount']"));
				return ars;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
