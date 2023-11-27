package newauditproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class auditlocators {
	private static WebElement uName=null;
	private static WebElement pass=null;
	private static WebElement sumit=null;
	private static WebElement sequrity=null;
	private static WebElement question1=null;
	private static WebElement question2=null;
	private static WebElement btnvalidate=null;
	private static WebElement ars=null;
	private static WebElement Master=null;
	private static WebElement UserMaster=null;
	private static WebElement addnew=null;
	private static WebElement firstname=null;
	private static WebElement lastname=null;
	private static WebElement designation=null;
	private static WebElement contactno=null;
	private static WebElement email=null;
	private static WebElement department=null;
	private static WebElement choosedepartment=null;
	private static WebElement role=null;
	private static WebElement chooserole=null;
	private static WebElement savebtn=null;
	private static WebElement usermessage=null;
	private static WebElement cancelbtn=null;
	private static WebElement search=null;
	private static WebElement search1=null;
	private static WebElement filter=null;
	private static WebElement editbtn=null;
	private static WebElement usereditmessage=null;
	private static WebElement btncancel=null;
	private static WebElement btnsave=null;
	private static WebElement removebtn=null;
	private static WebElement passwordbtn=null;
	private static WebElement unitmaster=null;
	private static WebElement addnewbtn=null;
	private static WebElement name=null;
	private static WebElement unittype=null;
	private static WebElement chooseunittype=null;
	private static WebElement address=null;
	private static WebElement state=null;
	private static WebElement choosestate=null;
	private static WebElement city=null;
	private static WebElement choosecity=null;
	private static WebElement contact=null;
	private static WebElement emailid=null;
	private static WebElement status=null;
	private static WebElement choosestatus=null;
	private static WebElement savebuttn=null;
	private static WebElement cancelbuttn=null;
	private static WebElement updateunit=null;
	private static WebElement firstnameedit=null;
	private static WebElement savebutton=null;
	private static WebElement cancelbutton=null;
	private static WebElement firstnameenter=null;
	private static WebElement exporttoexcelbtn=null;
	private static WebElement subunit=null;
	private static WebElement addnewunit=null;
	private static WebElement name1=null;
	private static WebElement unit1=null;
	private static WebElement select1=null;
	private static WebElement address1=null;
	private static WebElement state1=null;
	private static WebElement selectstate1=null;
	private static WebElement city1=null;
	private static WebElement selectcity1=null;
	private static WebElement contactno1=null;
	private static WebElement email1=null;
	private static WebElement status1=null;
	private static WebElement selectstatus1=null;
	private static WebElement btnsave1=null;
	private static WebElement btncancel1=null;
	private static WebElement process=null;
	private static WebElement processadd=null;
	private static WebElement proname=null;
	private static WebElement prosave=null;
	private static WebElement processmessage=null;
	private static WebElement procancel=null;
	private static WebElement proedit=null;
	private static WebElement pronamedit=null;
	private static WebElement procsave=null;
	private static WebElement procmess=null;
	private static WebElement procclose=null;
	private static WebElement subproce=null;
	private static WebElement subproceadd=null;
	private static WebElement subprocename=null;
	private static WebElement subprocesave=null;
	private static WebElement subprocecancel=null;
	private static WebElement subprocedit=null;
	private static WebElement subprocecname=null;
	private static WebElement procecnamedit=null;
	private static WebElement procecnamsave=null;
	private static WebElement procecnamcancel=null;
	private static WebElement addactivity=null;
	private static WebElement addnewactivity=null;
	private static WebElement nameactivity=null;
	private static WebElement saveactivitybtn=null;
	private static WebElement cancelactivitybtn=null;
	private static WebElement editactivity=null;
	private static WebElement editactivityname=null;
	private static WebElement editsaveactivity=null;
	private static WebElement editcancelactivity=null;
	private static WebElement deparmentmaster=null;
	private static WebElement deparmentadd=null;
	private static WebElement deparmentname=null;
	private static WebElement deparmentsave=null;
	private static WebElement deparmentcancel=null;
	private static WebElement deparmentedit=null;
	private static WebElement deparmenteditname=null;
	private static WebElement deparmenteditsave=null;
	private static WebElement deparmenteditcancel=null;
	private static WebElement observation=null;
	private static WebElement observationadd=null;
	private static WebElement observationname=null;
	private static WebElement observationsave=null;
	private static WebElement observationcancel=null;
	private static WebElement observationedit=null;
	private static WebElement observationeditname=null;
	private static WebElement observationeditsave=null;
	private static WebElement observationeditcancel=null;
	private static WebElement observationmessagedisplay=null;
	private static WebElement subobservation=null;
	private static WebElement subobservationadd=null;
	private static WebElement subobservationname=null;
	private static WebElement subobservationsave=null;
	private static WebElement subobservationcancel=null;
	private static WebElement subobservationedit=null;
	private static WebElement subobservationeditname=null;
	private static WebElement subobservationeditsave=null;
	private static WebElement subobservationeditcancel=null;
	private static WebElement subobservationbackbutton=null;
	private static WebElement riskcategory=null;
	private static WebElement riskcategoryadd=null;
	private static WebElement riskcategoryname=null;
	private static WebElement riskcategorysave=null;
	private static WebElement riskcategorymessagedis=null;
	private static WebElement riskcategorycancel=null;
	private static WebElement riskcategorysearchbox=null;
	private static WebElement riskcategoryedit=null;
	private static WebElement riskcategoryeditname=null;
	private static WebElement riskcategoryeditsave=null;
	private static WebElement riskcategoryeditcancel=null;
	private static WebElement riskcategoryfilter=null;
	private static WebElement riskcategorymessage=null;
	private static WebElement observationsubcategoryeditmessage=null;
	private static WebElement observationsubcategorymessage=null;
	private static WebElement unitmessage=null;
	private static WebElement subunitmessage=null;
	private static WebElement auditormaster=null;
	private static WebElement auditormasteradd=null;
	private static WebElement auditormasterfirmname=null;
	private static WebElement auditormasterpartnername=null;
	private static WebElement auditormastercontno=null;
	private static WebElement auditormastername=null;
	private static WebElement auditormastercontact=null;
	private static WebElement auditormastersave=null;
	private static WebElement auditormastermessage=null;
	private static WebElement auditormastercancel=null;
	private static WebElement auditormasteredit=null;
	private static WebElement auditormastereditname=null;
	private static WebElement auditormasterupsave=null;
	private static WebElement auditormasterupmessage=null;
	private static WebElement auditormasterupcancel=null;
	private static WebElement auditorteammaster=null;
	private static WebElement auditor=null;
	private static WebElement chooseauditor=null;
	private static WebElement auditorteammasteradd=null;
	private static WebElement auditorfirname=null;
	private static WebElement auditorlasname=null;
	private static WebElement auditoremail=null;
	private static WebElement auditorcont=null;
	private static WebElement auditorsave=null;
	private static WebElement auditormessage=null;
	private static WebElement auditorcancel=null;
	private static WebElement selectauditor=null;
	private static WebElement auditorname=null;
	private static WebElement auditoredit=null;
	private static WebElement auditoreditname=null;
	private static WebElement auditoreditsave=null;
	private static WebElement auditoreditmess=null;
	private static WebElement auditoreditcancel=null;
	private static WebElement verticalmaster=null;
	private static WebElement verticalmasteradd=null;
	private static WebElement verticalmastername=null;
	private static WebElement verticalmastersave=null;
	private static WebElement verticalmastermessage=null;
	private static WebElement verticalmastercancel=null;
	private static WebElement verticalmasteredit=null;
	private static WebElement verticalmastereditname=null;
	private static WebElement verticalmastereditsave=null;
	private static WebElement verticalmastereditmessage=null;
	private static WebElement verticalmastereditcancel=null;
	private static WebElement locationverticalmapping=null;
	private static WebElement locationverticalmappingframe=null;
	private static WebElement locationverticalmappingselect=null;
	private static WebElement locationverticalmappingchoose=null;
	private static WebElement locationverticalmappingsave=null;
	private static WebElement locationverticalmappingmessage=null;
	private static WebElement locationverticalmappingdownload=null;
	private static WebElement locationverticalmappingclose=null;
	private static WebElement statemaster=null;
	private static WebElement statemasteradd=null;
	private static WebElement statename=null;
	private static WebElement country=null;
	private static WebElement countrychoose=null;
	private static WebElement statesave=null;
	private static WebElement statecancel=null;
	private static WebElement messagestate=null;
	private static WebElement statesearch=null;
	private static WebElement selectcountry=null;
	private static WebElement choosecountry=null;
	private static WebElement stateedit=null;
	private static WebElement stateeditname=null;
	private static WebElement stateeditsave=null;
	private static WebElement stateeditcancel=null;
	private static WebElement stateeditmessage=null;
	private static WebElement citymaster=null;
	private static WebElement citymasteradd=null;
	private static WebElement cityname=null;
	private static WebElement selectstate=null;
	private static WebElement choosestatecity=null;
	private static WebElement citysave=null;
	private static WebElement citysavemessage=null;
	private static WebElement citycancel=null;
	private static WebElement citycountry=null;
	private static WebElement selectcitycountry=null;
	private static WebElement citystate=null;
	private static WebElement selectcitystate=null;
	private static WebElement citysearch=null;
	private static WebElement cityedit=null;
	private static WebElement cityeditname=null;
	private static WebElement cityeditsave=null;
	private static WebElement cityeditsavemessage=null;
	private static WebElement cityeditcancel=null;
	private static WebElement processratingmaster=null;
	private static WebElement processratingmasteradd=null;
	private static WebElement processratingmastername=null;
	private static WebElement processratingmasterdescription=null;
	private static WebElement processratingmastersave=null;
	private static WebElement processratingmastersavemessage=null;
	private static WebElement processratingmastercancel=null;
	private static WebElement processratingmasteredit=null;
	private static WebElement processratingmastereditname=null;
	private static WebElement processratingmastereditsave=null;
	private static WebElement processratingmastereditsavemessage=null;
	private static WebElement processratingmastereditclose=null;
	private static WebElement processratingmasterdelete=null;
	private static WebElement auditreporting=null;
	private static WebElement auditassignment=null;
	private static WebElement auditassignmentadd=null;
	private static WebElement auditassignmentselect=null;
	private static WebElement auditassignmentsave=null;
	private static WebElement auditassignmentmessage=null;
	private static WebElement auditassignmentclose=null;
	private static WebElement auditassignmentselectcompany=null;
	private static WebElement auditassignmentfilter1=null;
	private static WebElement auditassignmentfilter2=null;
	private static WebElement auditassignmentselectfilter1=null;
	private static WebElement auditassignmentselectfilter2=null;
	private static WebElement mydocument=null;
	private static WebElement mydocumentcompany=null;
	private static WebElement mydocumentselectcompany=null;
	private static WebElement mydocumentdownload=null;
	private static WebElement mydocumentmessage=null;
	private static WebElement mydocumentclick1=null;
	private static WebElement mydocumentclick2=null;
	private static WebElement mydocumentclick3=null;
	private static WebElement mydocumentclick4=null;
	private static WebElement mydocumentclick5=null;
	private static WebElement mydocumentDeleted=null;
	private static WebElement mydocumentDeleteddownload=null;
	private static WebElement mydocumentFeedback=null;
	private static WebElement mydocumentreview=null;
	private static WebElement myannexuredocumentdownload=null;
	private static WebElement mydocumentannexure=null;
	private static WebElement myreviewdocumentdownload=null;
	private static WebElement mydocumentFeedbackdownload=null;
	private static WebElement mydocumentFinaldeliverable=null;
	private static WebElement myFinaldeliverabledocumentdownload=null;
	private static WebElement myreport=null;
	private static WebElement myreportexecutivereport=null;
	private static WebElement myreportcompany=null;
	private static WebElement myreportselectcompany=null;
	private static WebElement myreportexecutivedownload=null;
	private static WebElement myreportexecutivemessage=null;
	private static WebElement myreportinternalaudit=null;
	private static WebElement myreportinternalauditcompany=null;
	private static WebElement myreportinternalauditselectcompany=null;
	private static WebElement myreportinternalauditdownload=null;
	private static WebElement myreportinternalauditmessage=null;
	private static WebElement myreportopenobservation=null;
	private static WebElement myreportopenobservationcompany=null;
	private static WebElement myreportopenobservationselectcompany=null;
	private static WebElement myreportopenobservationexporttoexcel=null;
	private static WebElement myreportobservationsummary=null;
	private static WebElement myreportobservationcompany=null;
	private static WebElement myreportobservationselectcompany=null;
	private static WebElement myreportobservationok=null;
	private static WebElement myreportobservationexporttoexcel=null;
	private static WebElement myreportschedulingdeviation=null;
	private static WebElement myreportschedulingcompany=null;
	private static WebElement myreportschedulingselectcompany=null;
	private static WebElement myreportschedulingtype=null;
	private static WebElement myreportschedulingselecttype=null;
	private static WebElement myreportschedulingperiod=null;
	private static WebElement myreportschedulingselectperiod=null;
	private static WebElement myreportschedulingexporttoexcel=null;
	private static WebElement myreportmanagementresponse=null;
	private static WebElement myreportmanagementresponsecompany=null;
	private static WebElement myreportmanagementresponseselectcompany=null;
	private static WebElement myreportmanagementresponsefinancial=null;
	private static WebElement myreportmanagementresponseselectfinancial=null;
	private static WebElement myreportmanagementresponseselectscheduling=null;
	private static WebElement myreportmanagementresponseselectselectscheduling=null;
	private static WebElement myreportmanagementresponseperiod=null;
	private static WebElement myreportmanagementresponseselectperiod=null;
	private static WebElement myreportmanagementresponseexporttoexcel=null;
	private static WebElement myreportprerequisit=null;
	private static WebElement myreportprerequisitcompancy=null;
	private static WebElement myreportprerequisitselectcompancy=null;
	private static WebElement myreportprerequisitfinancial=null;
	private static WebElement myreportprerequisitselectfinancial=null;
	private static WebElement myreportmyreportprerequisitscheduling=null;
	private static WebElement myreportmyreportprerequisitselectscheduling=null;
	private static WebElement myreportmyreportprerequisitperiod=null;
	private static WebElement myreportmyreportprerequisitselectperiod=null;
	private static WebElement myreportmyreportprerequisitexporttoexcel=null;
	private static WebElement myreportauditscheduling=null;
	private static WebElement myreportauditschedulingcompancy=null;
	private static WebElement myreportauditschedulingselectcompancy=null;
	private static WebElement myreportauditschedulingexporttoexcel=null;
	private static WebElement myreportauditstatus=null;
	private static WebElement myreportauditstatuscompany=null;
	private static WebElement myreportauditstatusselectcompany=null;
	private static WebElement myreportauditstatusexporttoexcel=null;
	private static WebElement myreportpastaudit=null;
	private static WebElement myreportpastauditaddnew=null;
	private static WebElement myreportpastauditunit=null;
	private static WebElement myreportpastauditselectunit=null;
	private static WebElement myreportpastauditfinancial=null;
	private static WebElement myreportpastauditselectfinancial=null;
	private static WebElement myreportpastauditauditbackground=null;
	private static WebElement myreportpastauditselectauditbackground=null;
	private static WebElement myreportpastaudituploadfile=null;
	private static WebElement myreportpastauditsave=null;
	private static WebElement myreportpastauditclose=null;
	private static WebElement myreportpastauditview=null;
	private static WebElement myreportpastauditedit=null;
	private static WebElement myreportpastauditcancel=null;
	private static WebElement myreportfinalaudit=null;
	private static WebElement myreportfinalauditcompany=null;
	private static WebElement myreportfinalauditselectcompany=null;
	private static WebElement myreportfinalauditdownload=null;
	private static WebElement configuration=null;
	private static WebElement configurationprofilemaster=null;
	private static WebElement configurationprofilemasteraddnew=null;
	private static WebElement configurationprofilemasterprofilename=null;
	private static WebElement configurationprofilemasterlevel=null;
	private static WebElement configurationprofilemasterselectlevel=null;
	private static WebElement configurationprofilemastersave=null;
	private static WebElement configurationprofilemasterclose=null;
	private static WebElement configurationprofilemasteredit=null;
	private static WebElement configurationprofilemastercancel=null;
	private static WebElement configurationprofilemasterdeactivate=null;
	private static WebElement configurationprofile=null;
	private static WebElement configurationprofileclick=null;
	private static WebElement configurationprofileuser=null;
	private static WebElement configurationprofileselectuser=null;
	private static WebElement configurationprofilesave=null;
	private static WebElement configurationescalation=null;
	private static WebElement configurationescalationaddnew=null;
	private static WebElement configurationprofilename=null;
	private static WebElement configurationselectprofile=null;
	private static WebElement configurationadd=null;
	private static WebElement configurationnodays=null;
	private static WebElement configurationnosave=null;
	private static WebElement configurationnocancel=null;
	private static WebElement configurationnoview=null;
	private static WebElement configurationcross=null;
	private static WebElement configurationhod=null;
	private static WebElement configurationhodaddnew=null;
	private static WebElement hodprofile=null;
	private static WebElement hodselectprofile=null;
	private static WebElement hodtimeline=null;
	private static WebElement hodsave=null;
	private static WebElement hodcancel=null;
	private static WebElement configurationmessage=null;
	private static WebElement configurationeditmessage=null;
	private static WebElement configurationhodedit=null;
	private static WebElement configurationhodeditclose=null;
	private static WebElement configurationdelete=null;
	private static WebElement configurationdeletecancel=null;
	private static WebElement configurationdashboard=null;
	private static WebElement configurationdashboardselect=null;
	private static WebElement configurationdashboardselectprofile=null;
	private static WebElement configurationdashboardsave=null;
	private static WebElement configurationprocess=null;
	private static WebElement selectconfigurationprocess=null;
	private static WebElement activityupdateme=null;
	private static WebElement activityeme=null;
	private static WebElement deparmenteditmessage=null;
	private static WebElement deparmentmessage=null;
	private static WebElement prupdateme=null;
	private static WebElement ok=null;
	private static WebElement exporttoexcel=null;
	private static WebElement firstname1=null;
	private static WebElement clicksearchsub=null;
	private static WebElement subexporttoexcelbtn=null;
	private static WebElement editback=null;
	private static WebElement subunit1=null;
	private static WebElement subunitedit=null;
	private static WebElement subunitsave=null;
	private static WebElement subunitmessage1=null;
	private static WebElement subunitmessage4=null;
	private static WebElement subunitmessage5=null;
	private static WebElement auditoteamrmessage=null;
	private static WebElement subunitmessage6=null;
	
	//master 
	
	
	 
	
	public static WebElement setUname(WebDriver driver) {                   //old
		uName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		return uName;
	}
	 
	public static WebElement setPass(WebDriver driver) {
		pass=driver.findElement(By.xpath("//*[@id='txtpass']"));
		return pass;
	}
	
	public static WebElement clicksumit(WebDriver driver) {
		sumit=driver.findElement(By.xpath("//*[@id='Submit']"));
		return sumit;
	}
	
	public static WebElement clicksequrity(WebDriver driver) {
		sequrity=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		return sequrity;
	}
	
	public static WebElement setquestion1(WebDriver driver) {
		question1=driver.findElement(By.id("txtAnswer1"));
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
		ars=driver.findElement(By.xpath("//*[@id='dvbtnAudit']/div[1]/img"));
		//*[@id="dvbtnAudit"]/div[1]/img
		return ars;
	}
	
	public  static WebElement clickMaster(WebDriver driver) {
		
		Master=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[5]/a"));
		return Master;
	}
	
public  static WebElement clickUserMaster(WebDriver driver) {
		
		UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[7]/a"));
		return UserMaster;
	}

public  static WebElement clickaddnew(WebDriver driver) {
	
	addnew=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddUser']"));
	return addnew;
}

public  static WebElement setfirstname(WebDriver driver) {
	
	firstname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxFirstName']"));
	return firstname;
}

public  static WebElement setlastname(WebDriver driver) {
	
	lastname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxLastName']"));
	return lastname;
}

public  static WebElement setdesignation(WebDriver driver) {
	
	designation=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxDesignation']"));
	return designation;
}


public  static WebElement setemail(WebDriver driver) {
	
	email=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxEmail']"));
	return email;
}

public  static WebElement setcontactno(WebDriver driver) {
	
	contactno=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxContactNo']"));
	return contactno;
}

public  static WebElement clickdepartment(WebDriver driver) {
	
	department=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']"));
	return department;
}

public  static WebElement clickchoosedepartment(WebDriver driver) {
	
	choosedepartment=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlDepartment']/option[2]"));
	return choosedepartment;
}
	
public  static WebElement clickrole(WebDriver driver) {
	
	role=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']"));
	return role;
}

public  static WebElement clickchooserole(WebDriver driver) {
	
	chooserole=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ddlRiskRole']/option[2]"));
	return chooserole;
}

public static WebElement clicksavebtn(WebDriver driver) {
	savebtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnSave']"));
	return savebtn;
}
public static WebElement clickusermessage(WebDriver driver) {
	usermessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_ValidationSummary15']/ul/li"));
	return usermessage;
}

public static WebElement clickcancelbtn(WebDriver driver) {
	cancelbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnCancel']"));
	//*[@id="ContentPlaceHolder1_btnCancel"]
	return cancelbtn;
}

public static WebElement clicksearch1(WebDriver driver) {
	search1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
	return search1;
}
	
public static WebElement clickeditbtn(WebDriver driver) {
	editbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnEdit_0']/img"));
	//*[@id="ContentPlaceHolder1_btnCancel"]
	return editbtn;
}

public  static WebElement setfirstname1(WebDriver driver) {
	
	firstname1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_tbxFirstName']"));
	return firstname1;
}

public static WebElement clickbtnsave(WebDriver driver) {
	btnsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnSave']"));
	return btnsave;
}
public static WebElement clickusereditmessage(WebDriver driver) {
	usereditmessage=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_udcInputForm_ValidationSummary15\']/ul/li"));
	return usereditmessage;
}
public static WebElement clickbtncancel(WebDriver driver) {
	btncancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_udcInputForm_btnCancel']"));
	return btncancel;
}

public static WebElement clickremovebtn(WebDriver driver) {
	removebtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnDelete_0']/img"));
	//*[@id="ContentPlaceHolder1_grdUser_lbtnDelete_0"]/img
	return removebtn;
}

public static WebElement clickpasswordbtn(WebDriver driver) {
	passwordbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdUser_lbtnReset_0']/img"));
	//*[@id="ContentPlaceHolder1_grdUser_lbtnReset_0"]/img
	return passwordbtn;
}

public static WebElement clickexporttoexcel(WebDriver driver) {
	exporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkExportUserlist']"));
	return exporttoexcel;
}

public  static WebElement clickunitmaster(WebDriver driver) {
	
	unitmaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[1]/a"));
	//*[@id="CMPMenuBar:submenu:6"]/li[1]/a
	return unitmaster;
}
public  static WebElement clickaddnewbtn(WebDriver driver) {
	
	addnewbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCustomerBranch']"));
	return addnewbtn;
}

public  static WebElement setname(WebDriver driver) {
 name=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
	return name;
}
public  static WebElement clickunittype(WebDriver driver) {
	
	unittype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']"));
	return unittype;

}
public  static WebElement clickchooseunittype(WebDriver driver) {
	
	chooseunittype=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlType\"]/option[3]"));
	return chooseunittype;

}
public  static WebElement setnaddress(WebDriver driver) {
	 address=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddressLine1']"));
		return address;
	}

public  static WebElement clickstate(WebDriver driver) {
	
	state=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlState']"));
	return state;

}
public  static WebElement clickchoosestate(WebDriver driver) {
	
	choosestate=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlState\"]/option[7]"));
	return choosestate;

}

public  static WebElement clickcity(WebDriver driver) {
	
	city=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']"));
	return city;

}
public  static WebElement clickchoosecity(WebDriver driver) {
	
	choosecity=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']/option[3]"));
	return choosecity;

}
public  static WebElement setcontact(WebDriver driver) {
	
	contact=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxContactPerson']"));
	return contact;

}

public  static WebElement setemailid(WebDriver driver) {
	
	emailid=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxEmail']"));
	return emailid;

}
public  static WebElement clickstatus(WebDriver driver) {
	
	status=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']"));
	return status;



}
public  static WebElement clickchoosestatus(WebDriver driver) {
	
	choosestatus=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']/option[2]"));
	return choosestatus;



}
public  static WebElement clicksavebuttn(WebDriver driver) {
	
	savebuttn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return savebuttn;
}
	public static WebElement clickunitmessage(WebDriver driver) {
		unitmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_valcustomerbranch']/ul/li"));
		//*[@id="ContentPlaceHolder1_valcustomerbranch"]/ul/li
		return unitmessage;
	
	}



public  static WebElement clickcancelbuttn(WebDriver driver) {
	
	cancelbuttn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return cancelbuttn;

}



public  static WebElement clickcupdateunit(WebDriver driver) {
	
	updateunit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch_LinkButton1_0']/img"));
	return updateunit;



}
public  static WebElement clickfirstnameedit(WebDriver driver) {
	
	firstnameedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddressLine1']"));
	return firstnameedit;
}
public  static WebElement clickfirstnameenter(WebDriver driver) {
	
	firstnameenter=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddressLine1']"));
	return firstnameenter;
}

public static WebElement clicksavebutton(WebDriver driver) {
	savebutton=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return savebutton;
}

public static WebElement clickcancelbutton(WebDriver driver) {
	cancelbutton=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return cancelbutton;
}

public  static WebElement clickexporttoexcelbtn(WebDriver driver) {
	
	exporttoexcelbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkExportCustomerBranchlist']"));
	return exporttoexcelbtn;

}

public static WebElement clicksearch(WebDriver driver) {
	search=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
	return search;
}

public static WebElement clicksubunit(WebDriver driver) {
	subunit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch']/tbody/tr[2]/td[9]/a"));
	//*[@id="ContentPlaceHolder1_grdCustomerBranch"]/tbody/tr[2]/td[9]/a
	return subunit;
}
public static WebElement clickaddnewunit(WebDriver driver) {
	addnewunit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddCustomerBranch']"));
	//*[@id="ContentPlaceHolder1_grdCustomerBranch"]/tbody/tr[2]/td[9]/a
	return addnewunit;
}

public static WebElement clickname1(WebDriver driver) {
	name1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxName']"));
	return name1;
}
public static WebElement clickunit1(WebDriver driver) {
	unit1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']"));
	return unit1;
}
public static WebElement clickselect1(WebDriver driver) {
	select1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlType']/option[3]"));
	return select1;
}
public static WebElement clickaddress1(WebDriver driver) {
	address1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxAddressLine1']"));
	return address1;
}
public static WebElement clickstate1(WebDriver driver) {
	state1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlState\']"));
	return state1;
}
public static WebElement clickselectstate1(WebDriver driver) {
	selectstate1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlState']/option[18]"));
	return selectstate1;
}
public static WebElement clickcity1(WebDriver driver) {
	city1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlCity\"]"));
	return city1;
}
public static WebElement clickselectcity1(WebDriver driver) {
	selectcity1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCity']/option[3]"));
	//*[@id="ContentPlaceHolder1_ddlCity"]/option[3]
	return selectcity1;
}

public static WebElement clickcontactno1(WebDriver driver) {
	contactno1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxContactPerson\']"));
	return contactno1;
}
public static WebElement clickemail1(WebDriver driver) {
	email1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxEmail\']"));
	return email1;
}

public static WebElement clickstatus1(WebDriver driver) {
	status1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlCustomerStatus\']"));
	return status1;
}

public static WebElement clickselectstatus1(WebDriver driver) {
	selectstatus1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCustomerStatus']/option[2]"));
	return selectstatus1;
}
public static WebElement clickbtnsave1(WebDriver driver) {
	btnsave1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return btnsave1;
}
public static WebElement clicksubexporttoexcelbtn(WebDriver driver) {
	subexporttoexcelbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkExportCustomerBranchlist']"));
	return subexporttoexcelbtn;
}
public static WebElement clicksearchsub(WebDriver driver) {
	clicksearchsub=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxFilter']"));
	return clicksearchsub;
}
public static WebElement clicksubunit1(WebDriver driver) {
	subunit1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch_LinkButton1_0']/img"));
	return subunit1;
}
public static WebElement clicksubunitedit(WebDriver driver) {
	subunitedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdCustomerBranch_LinkButton1_0']/img"));
	return subunitedit;
}
public static WebElement clicksubunitsave(WebDriver driver) {
	subunitsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return subunitsave;
}
public static WebElement clicksubunitmessage1(WebDriver driver) {
	subunitmessage1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_valcustomerbranch']/ul/li']"));
	return subunitmessage1;
}

public static WebElement clickbtncancel1(WebDriver driver) {
	btncancel1=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return btncancel1;
}
public static WebElement clickfilter(WebDriver driver) {
	filter=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxFilter\']"));
	return filter;
}

public static WebElement clickprocess(WebDriver driver) {
	process=driver.findElement(By.xpath("//*[@id=\"CMPMenuBar:submenu:6\"]/li[4]/a"));
	//UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
	return process;
}
public static WebElement clickprocessadd(WebDriver driver) {
	processadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddProcess\']"));
	return processadd;
}
public static WebElement clickproname(WebDriver driver) {
	proname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return proname;
}
public static WebElement clickprosave(WebDriver driver) {
	prosave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return prosave;
}
public static WebElement clickprocessmessage(WebDriver driver) {
	processmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return processmessage;
}
public static WebElement clickprocancel(WebDriver driver) {
	procancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return procancel;
}
public static WebElement clickproedit(WebDriver driver) {
	proedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdProcessList_lbtEdit_2\']/img"));
	return proedit;
}
public static WebElement clickpronamedit(WebDriver driver) {
	pronamedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return pronamedit;
}
public static WebElement clickprocsave(WebDriver driver) {
	procsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return procsave;
}
public static WebElement clickprocmess(WebDriver driver) {
	procmess=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	return procmess;
}
public static WebElement clickprocclose(WebDriver driver) {
	procclose=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return procclose;
}

public static WebElement clickactivityupdateme(WebDriver driver) {
	activityupdateme=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return activityupdateme;
}
public static WebElement clickactivityeme(WebDriver driver) {
	activityeme=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return activityeme;
}
public static WebElement clickprupdateme(WebDriver driver) {
	prupdateme=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return prupdateme;
}

public static WebElement clicksubproce(WebDriver driver) {
	subproce=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdProcessList_LinkButton1_2\']"));
	return subproce;
}
public static WebElement clicksubproceadd(WebDriver driver) {
	subproceadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddSubEvent\']"));
	return subproceadd;
}
public static WebElement clicksubprocename(WebDriver driver) {
	subprocename=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subprocename;
}
public static WebElement clicksubprocesave(WebDriver driver) {
	subprocesave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return subprocesave;
}
public static WebElement clicksubprocecancel(WebDriver driver) {
	subprocecancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return subprocecancel;
}
public static WebElement clicksubprocedit(WebDriver driver) {
	subprocedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdSubProcessList_LinkButton1_0\']/img"));
	return subprocedit;
}
public static WebElement clicksubprocecname(WebDriver driver) {
	subprocecname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subprocecname;
}
public static WebElement clickprocecnamsave(WebDriver driver) {
	procecnamsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return procecnamsave;
}
public static WebElement clickprocecnamcancel(WebDriver driver) {
	procecnamcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return procecnamcancel;
}
public static WebElement clickaddactivity(WebDriver driver) {
	addactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdSubProcessList\']/tbody/tr[2]/td[4]/a"));
	return addactivity;
}
public static WebElement clickaddnewactivity(WebDriver driver) {
	addnewactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddSubEvent\']"));
	return addnewactivity;
}
public static WebElement clicknameactivity(WebDriver driver) {
	nameactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return nameactivity;
}
public static WebElement clicksaveactivitybtn(WebDriver driver) {
	saveactivitybtn=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return saveactivitybtn;
}
public static WebElement clickcancelactivitybtn(WebDriver driver) {
	cancelactivitybtn=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return cancelactivitybtn;
}
public static WebElement clickeditactivity(WebDriver driver) {
	editactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdActivityList_LinkButton1_0\']/img"));
	return editactivity;
}
public static WebElement clickeditactivityname(WebDriver driver) {
	editactivityname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return editactivityname;
}
public static WebElement clickeditsaveactivity(WebDriver driver) {
	editsaveactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return editsaveactivity;
}
public static WebElement clickeditcancelactivity(WebDriver driver) {
	editcancelactivity=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return editcancelactivity;
}
public static WebElement clickeditback(WebDriver driver) {
	editback=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkBackToProcess']"));
	return editback;
}
public static WebElement clickdeparmentmaster(WebDriver driver) {
	deparmentmaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[2]/a"));
	return deparmentmaster;
}
public static WebElement clickdeparmentadd(WebDriver driver) {
	deparmentadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddPromotor\']"));
	return deparmentadd;
}
public static WebElement clickdeparmentname(WebDriver driver) {
	deparmentname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txtFName\']"));
	return deparmentname;
}
public static WebElement clickdeparmentsave(WebDriver driver) {
	deparmentsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return deparmentsave;
}
public static WebElement clickdeparmentmessage(WebDriver driver) {
	deparmentmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return deparmentmessage;
}
public static WebElement clickdeparmentcancel(WebDriver driver) {
	deparmentcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return deparmentcancel;
}
public static WebElement clickdeparmentedit(WebDriver driver) {
	deparmentedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdAuditor_LinkButton1_0\']/img"));
	return deparmentedit;
}
public static WebElement clickdeparmenteditname(WebDriver driver) {
	deparmenteditname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txtFName\']"));
	return deparmenteditname;
}
public static WebElement clickdeparmenteditsave(WebDriver driver) {
	deparmenteditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return deparmenteditsave;
}
public static WebElement clickdeparmenteditmessage(WebDriver driver) {
	deparmenteditmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return deparmenteditmessage;
}
public static WebElement clickdeparmenteditcancel(WebDriver driver) {
	deparmenteditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return deparmenteditcancel;
}
public static WebElement clickobservation(WebDriver driver) {
	observation=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[5]/a"));
	//UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
	return observation;
}
public static WebElement clickobservationadd(WebDriver driver) {
	observationadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddPromotor\']"));
	return observationadd;
}
public static WebElement clickobservationname(WebDriver driver) {
	observationname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txtFName\']"));
	return observationname;
}
public static WebElement clickobservationsave(WebDriver driver) {
	observationsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return observationsave;
}
public static WebElement clickobservationcancel(WebDriver driver) {
	observationcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return observationcancel;
}
public static WebElement clickobservationedit(WebDriver driver) {
	observationedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdAuditor_LinkButton1_2\']/img"));
	//proedit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdProcessList_lbtEdit_2\']/img"));
	return observationedit;
}
public static WebElement clickobservationeditname(WebDriver driver) {
	observationeditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return observationeditname;
}
public static WebElement clickobservationeditsave(WebDriver driver) {
	observationeditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return observationeditsave;
}
public static WebElement clickobservationmessagedisplay(WebDriver driver) {
	observationmessagedisplay=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return observationmessagedisplay;
}
public static WebElement clickobservationeditcancel(WebDriver driver) {
	observationeditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return observationeditcancel;
}
public static WebElement clicksubobservation1(WebDriver driver) {
	subobservation=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_grdAuditor_lnkCategory_3\']"));
	return subobservation;
}
public static WebElement clicksubobservationadd(WebDriver driver) {
	subobservationadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSubcategory\']"));
	return subobservationadd;
}
public static WebElement clicksubobservationname(WebDriver driver) {
	subobservationname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subobservationname;
}
public static WebElement clicksubobservationsave(WebDriver driver) {
	subobservationsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return subobservationsave;
}
public static WebElement clickobservationsubcategorymessage(WebDriver driver) {
	observationsubcategorymessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	return observationsubcategorymessage;
}
public static WebElement clicksubsubobservationcancel(WebDriver driver) {
	subobservationcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return subobservationcancel;
}
public static WebElement clicksubobservationedit(WebDriver driver) {
	subobservationedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lbtEdit_0']/img"));
	return subobservationedit;
}
public static WebElement clicksubobservationeditname(WebDriver driver) {
	subobservationeditname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return subobservationeditname;
}
public static WebElement clicksubobservationeditsave(WebDriver driver) {
	subobservationeditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return subobservationeditsave;
}
public static WebElement clickobservationsubcategoryeditmessage(WebDriver driver) {
	 observationsubcategoryeditmessage=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return  observationsubcategoryeditmessage;
}
public static WebElement clicksubobservationeditcancel(WebDriver driver) {
	subobservationeditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return subobservationeditcancel;
}
public static WebElement clicksubobservationbackbutton(WebDriver driver) {
	subobservationbackbutton=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_lnkBackToProcess\']"));
	return subobservationbackbutton;
}
public static WebElement clickriskcategory(WebDriver driver) {
	riskcategory=driver.findElement(By.xpath("//*[@id=\"CMPMenuBar:submenu:6\"]/li[6]/a"));
	//UserMaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:5']/li[7]/a"));
	return riskcategory;
}
public static WebElement clickriskcategoryadd(WebDriver driver) {
	riskcategoryadd=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnAddProcess\']"));
	return riskcategoryadd;
}
public static WebElement clickriskcategoryname(WebDriver driver) {
	riskcategoryname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return riskcategoryname;
}
public static WebElement clickriskcategorysave(WebDriver driver) {
	riskcategorysave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return riskcategorysave;
}
public static WebElement clickriskcategorymessagedis(WebDriver driver) {
	riskcategorymessagedis=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return riskcategorymessagedis;
}
public static WebElement clickriskcategorycancel(WebDriver driver) {
	riskcategorycancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return riskcategorycancel;
}
public static WebElement clickriskcategorysearchbox(WebDriver driver) {
	riskcategorysearchbox=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxFilter\']"));
	return riskcategorysearchbox;
}
public static WebElement clickriskcategoryedit(WebDriver driver) {
	riskcategoryedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskcategoryList_lbtEdit_0']/img"));
	//*[@id="ContentPlaceHolder1_grdRiskcategoryList_lbtEdit_0"]/img
	return riskcategoryedit;
}
public static WebElement clickriskcategoryeditname(WebDriver driver) {
	riskcategoryeditname=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxName\']"));
	return riskcategoryeditname;
}
public static WebElement clickriskcategoryeditsave(WebDriver driver) {
	riskcategoryeditsave=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnSave\']"));
	return riskcategoryeditsave;
}
public static WebElement clickriskcategorymessage(WebDriver driver) {
	riskcategorymessage=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ValidationSummary1\']/ul/li"));
	return riskcategorymessage;
}
public static WebElement clickriskcategoryeditcancel(WebDriver driver) {
	riskcategoryeditcancel=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_btnCancel\']"));
	return riskcategoryeditcancel;
}
public static WebElement clickriskcategoryfilter(WebDriver driver) {
	riskcategoryfilter=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_tbxFilter\']"));
	return riskcategoryfilter;
}

public static WebElement clicksubunitmessage(WebDriver driver) {
	subunitmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	//*[@id="ContentPlaceHolder1_valcustomerbranch"]/ul/li
	//*[@id="ContentPlaceHolder1_valcustomerbranch"]/ul/li
	return subunitmessage;
}
public static WebElement clicksubunitmessage4(WebDriver driver) {
	subunitmessage4=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_valcustomerbranch']/ul/li"));
	return subunitmessage4;
}
public static WebElement clicksubunitmessage5(WebDriver driver) {
	subunitmessage5=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_valcustomerbranch']/ul/li"));
	return subunitmessage5;
}
public static WebElement clicksubunitmessage6(WebDriver driver) {
	subunitmessage6=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_valcustomerbranch']/ul/li"));
	return subunitmessage6;
}
public static WebElement clickauditormaster(WebDriver driver) {
	auditormaster=driver.findElement(By.xpath("//*[@id=\"CMPMenuBar:submenu:6\"]/li[9]/a"));
	return auditormaster;
}
public static WebElement clickauditormasteradd(WebDriver driver) {
	auditormasteradd=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return auditormasteradd;
}
public static WebElement clickauditormasterfirmname(WebDriver driver) {
	auditormasterfirmname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return auditormasterfirmname;
}
public static WebElement clickauditormasterpartnername(WebDriver driver) {
	auditormasterpartnername=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPName']"));
	return auditormasterpartnername;
}
public static WebElement clickauditormastercontno(WebDriver driver) {
	 auditormastercontno=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPContactNo']"));
	return  auditormastercontno;
}
public static WebElement clickauditormastername(WebDriver driver) {
	auditormastername=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtAName']"));
	return auditormastername;
}
public static WebElement clickauditormastercontact(WebDriver driver) {
	auditormastercontact=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtAContactNo']"));
	return  auditormastercontact;
}
public static WebElement clickauditormastersave(WebDriver driver) {
	auditormastersave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return  auditormastersave;
}
public static WebElement clickauditormastermessage(WebDriver driver) {
	auditormastermessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return  auditormastermessage;
}
public static WebElement clickauditormastercancel(WebDriver driver) {
	auditormastercancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return  auditormastercancel;
}
public static WebElement clickauditormasteredit(WebDriver driver) {
	auditormasteredit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
	return  auditormasteredit;
}

public static WebElement clickauditormastereditname(WebDriver driver) {
	auditormastereditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return auditormastereditname;
}
public static WebElement clickauditormasterupsave(WebDriver driver) {
	auditormasterupsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return  auditormasterupsave; //*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
}
public static WebElement clickauditormasterupmessage(WebDriver driver) {
	auditormasterupmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return  auditormasterupmessage;
}
public static WebElement clickauditormasterupcancel(WebDriver driver) {
	auditormasterupcancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return  auditormasterupcancel;
}
public static WebElement clickauditorteammaster(WebDriver driver) {
	auditorteammaster=driver.findElement(By.xpath("//*[@id=\"CMPMenuBar:submenu:6\"]/li[10]/a"));
	return  auditorteammaster;
}
public static WebElement clickauditorteammasteradd(WebDriver driver) {
	auditorteammasteradd=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return  auditorteammasteradd;
}
public  static WebElement clickauditor(WebDriver driver) {
	
	auditor=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditor']"));
	return auditor;
}

public  static WebElement clickchooseauditor(WebDriver driver) {
	
	chooseauditor=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlAuditor']/option[2]"));
	//*[@id="ContentPlaceHolder1_ddlAuditor"]/option[2]
	return chooseauditor;
}
public  static WebElement clickauditorfirname(WebDriver driver) {
	
	auditorfirname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return auditorfirname;
}
public  static WebElement clickauditorlasname(WebDriver driver) {
	
	auditorlasname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtLName']"));
	return auditorlasname;
}
public  static WebElement clickauditoremail(WebDriver driver) {
	
	auditoremail=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtEmail']"));
	return auditoremail;
}
public  static WebElement clickauditorcont(WebDriver driver) {
	
	auditorcont=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtContactNo']"));
	return auditorcont;
}
public  static WebElement clickauditorsave(WebDriver driver) {
	
	auditorsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return auditorsave;
}
public  static WebElement clickauditormessage(WebDriver driver) {
	
	auditormessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	return auditormessage;
}
public  static WebElement clickauditoteamrmessage(WebDriver driver) {
	
	auditoteamrmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	return auditoteamrmessage;
}
public  static WebElement clickauditorcancel(WebDriver driver) {
	
	auditorcancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	//*[@id="ContentPlaceHolder1_ValidationSummary1"]/ul/li
	return auditorcancel;
}
public  static WebElement clickselectauditor(WebDriver driver) {
	
	selectauditor=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterAuditor']"));
	return selectauditor;
}
public  static WebElement clickauditorname(WebDriver driver) {
	
	auditorname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterAuditor']/option[2]"));
	return auditorname;
}
public  static WebElement clickauditoredit(WebDriver driver) {
	
	auditoredit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']"));
	//*[@id="ContentPlaceHolder1_grdAuditor_LinkButton1_0"]
	//*[@id="ContentPlaceHolder1_grdAuditor_LinkButton1_0"]/img
	return auditoredit;
}
public  static WebElement clickauditoreditname(WebDriver driver) {
	
	auditoreditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return auditoreditname;
}
public  static WebElement clickauditoreditsave(WebDriver driver) {
	
	auditoreditsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return auditoreditsave;
}
public  static WebElement clickauditoreditmess(WebDriver driver) {
	
	auditoreditmess=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return auditoreditmess;
}
public  static WebElement clickauditoreditcancel(WebDriver driver) {
	
	auditoreditcancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return auditoreditcancel;
}
public  static WebElement clickverticalmaster(WebDriver driver) {
	
	verticalmaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[3]/a"));
	//*[@id="CMPMenuBar:submenu:6"]/li[3]/a
	return verticalmaster;
}
public  static WebElement clickverticalmasteradd(WebDriver driver) {
	
	verticalmasteradd=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return verticalmasteradd;
}
public  static WebElement clickverticalmastername(WebDriver driver) {
	
	verticalmastername=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return verticalmastername;
}
public  static WebElement clickverticalmastersave(WebDriver driver) {
	
	verticalmastersave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return verticalmastersave;
}
public  static WebElement clickverticalmastermessage(WebDriver driver) {
	
	verticalmastermessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return verticalmastermessage;          
}
public  static WebElement clickverticalmastercancel(WebDriver driver) {
	
	verticalmastercancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return verticalmastercancel;
}
public  static WebElement clickverticalmasteredit(WebDriver driver) {
	verticalmasteredit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_1']/img"));
	//*[@id="ContentPlaceHolder1_grdAuditor_LinkButton1_1"]/img
	return verticalmasteredit;
}
public  static WebElement clickverticalmastereditname(WebDriver driver) {
	verticalmastereditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return verticalmastereditname;
}
public  static WebElement clickverticalmastereditsave(WebDriver driver) {
	verticalmastereditsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return verticalmastereditsave;
}
public  static WebElement clickverticalmastereditmessage(WebDriver driver) {
	verticalmastereditmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return verticalmastereditmessage;
}
public  static WebElement clickverticalmastereditcancel(WebDriver driver) {
	verticalmastereditcancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return verticalmastereditcancel;
}
public  static WebElement clicklocationverticalmapping(WebDriver driver) {
	locationverticalmapping=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_LinkButton3']"));
	return locationverticalmapping;
}
public  static WebElement clicklocationverticalmappingframe(WebDriver driver) {
	locationverticalmappingframe=driver.findElement(By.xpath("//*[@id='showdetails']"));
	return locationverticalmappingframe;
}
public  static WebElement clicklocationverticalmappingselect(WebDriver driver) {
	locationverticalmappingselect=driver.findElement(By.xpath("//*[@id='ddlLegalEntity_chosen']"));
	return locationverticalmappingselect;
}
public  static WebElement clicklocationverticalmappingchoose(WebDriver driver) {
	locationverticalmappingchoose=driver.findElement(By.xpath("//*[@id='ddlLegalEntity_chosen']/div/ul/li[4]"));
	return locationverticalmappingchoose;
}
public  static WebElement clicklocationverticalmappingsave(WebDriver driver) {
	locationverticalmappingsave=driver.findElement(By.xpath("//*[@id='btnSave']"));
	return locationverticalmappingsave;
}
public  static WebElement clicklocationverticalmappingmessage(WebDriver driver) {
	locationverticalmappingmessage=driver.findElement(By.xpath("//*[@id='ValidationSummary1']/ul/li"));
	return locationverticalmappingmessage;
}
public  static WebElement clicklocationverticalmappingdownload(WebDriver driver) {
	locationverticalmappingdownload=driver.findElement(By.xpath("//*[@id='btnUploadFile1']"));
	return locationverticalmappingdownload;
}
public  static WebElement clicklocationverticalmappingclose(WebDriver driver) {
	locationverticalmappingclose=driver.findElement(By.xpath("//*[@id='divreports']/div/div/div[1]/button"));
	return locationverticalmappingclose;
}
public  static WebElement clickstatemaster(WebDriver driver) {
	statemaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[11]/a"));
	return statemaster;
}
public  static WebElement clickstatemasteradd(WebDriver driver) {
	statemasteradd=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return statemasteradd;
}
public  static WebElement clickstatename(WebDriver driver) {
	statename=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return statename;
}
public  static WebElement clickcountry(WebDriver driver) {
	country=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCountry']"));
	return country;
}
public  static WebElement clickcountrychoose(WebDriver driver) {
	countrychoose=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCountry']/option[2]"));
	return countrychoose;
}
public  static WebElement clickstatesave(WebDriver driver) {
	statesave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return statesave;
}
public  static WebElement clickmessagestate(WebDriver driver) {
	messagestate=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return messagestate;
}
public  static WebElement clickstatecancel(WebDriver driver) {
	statecancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return statecancel;
}
public  static WebElement clickstatesearch(WebDriver driver) {
	statesearch=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxSearchState']"));
	return statesearch;
}
public  static WebElement clickselectcountry(WebDriver driver) {
	selectcountry=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCountryList_chosen']/a/span"));
	return selectcountry;
}
public  static WebElement clickchoosecountry(WebDriver driver) {
	choosecountry=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlCountryList_chosen\"]/a/span"));
	return choosecountry;
}
public  static WebElement clickstateedit(WebDriver driver) {
	stateedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
	return stateedit;
}
public  static WebElement clickstateeditname(WebDriver driver) {
	stateeditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return stateeditname;
}
public  static WebElement clickstateeditsave(WebDriver driver) {
	stateeditsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return stateeditsave;
}
public  static WebElement clickstateeditmessage(WebDriver driver) {
	stateeditmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return stateeditmessage;
}
public  static WebElement clickstateeditcancel(WebDriver driver) {
	stateeditcancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return stateeditcancel;
}
public  static WebElement clickcitymaster(WebDriver driver) {
	citymaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[12]/a"));
	return citymaster;
}
public  static WebElement clickcitymasteradd(WebDriver driver) {
	citymasteradd=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return citymasteradd;
}
public  static WebElement clickcityname(WebDriver driver) {
	cityname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return cityname;
}
public  static WebElement clickselectstate(WebDriver driver) {
	selectstate=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlState']"));
	return selectstate;
}
public  static WebElement clickchoosestatecity(WebDriver driver) {
	choosestatecity=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlState']/option[3]"));
	return choosestatecity;
}
public  static WebElement clickcitysave(WebDriver driver) {
	citysave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return citysave;
}
public  static WebElement clickcitysavemessage(WebDriver driver) {
	citysavemessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return citysavemessage;
}
public  static WebElement clickcitycancel(WebDriver driver) {
	citycancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return citycancel;
}
public  static WebElement clickcitycountry(WebDriver driver) {
	citycountry=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCountry_chosen']/a/span"));
	//*[@id="ContentPlaceHolder1_ddlCountry_chosen"]/a
	return citycountry;
}
public  static WebElement clickselectcitycountry(WebDriver driver) {
	selectcitycountry=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCountry_chosen']/div/ul/li[2]"));
	return selectcitycountry;
}
public  static WebElement clickcitystate(WebDriver driver) {
	citystate=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStateList_chosen']/a/span"));
	return citystate;
}

public  static WebElement clickselectcitystate(WebDriver driver) {
	selectcitystate=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStateList_chosen']/div/ul/li[32]"));
	//*[@id="ContentPlaceHolder1_ddlStateList_chosen"]/div/ul/li[32]
	return selectcitystate;
}
public  static WebElement clickcitysearch(WebDriver driver) {
	citysearch=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_tbxSearchCity']"));
	return citysearch;
}
public  static WebElement clickcityedit(WebDriver driver) {
	cityedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
	return cityedit;
}
public  static WebElement clickcityeditname(WebDriver driver) {
	cityeditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return cityeditname;
}
public  static WebElement clickcityeditsave(WebDriver driver) {
	cityeditsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return cityeditsave;
}
public  static WebElement clickcityeditsavemessage(WebDriver driver) {
	cityeditsavemessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return cityeditsavemessage;
}
public  static WebElement clickcityeditcancel(WebDriver driver) {
	cityeditcancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return cityeditcancel;
}
public  static WebElement clickprocessratingmaster(WebDriver driver) {
	processratingmaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:6']/li[13]/a"));
	//*[@id="CMPMenuBar:submenu:6"]/li[13]/a
	return processratingmaster;
}
public  static WebElement clickprocessratingmasteradd(WebDriver driver) {
	processratingmasteradd=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return processratingmasteradd;
}
public  static WebElement clickprocessratingmastername(WebDriver driver) {
	processratingmastername=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return processratingmastername;
}
public  static WebElement clickprocessratingmasterdescription(WebDriver driver) {
	processratingmasterdescription=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtDescription']"));
	return processratingmasterdescription;
}
public  static WebElement clickprocessratingmastersave(WebDriver driver) {
	processratingmastersave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return processratingmastersave;
}
public  static WebElement clickprocessratingmastersavemessage(WebDriver driver) {
	processratingmastersavemessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return processratingmastersavemessage;   //Process Saved Successfully
}
public  static WebElement clickprocessratingmastercancel(WebDriver driver) {
	processratingmastercancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return processratingmastercancel;   //Process Saved Successfully
}
public  static WebElement clickprocessratingmasteredit(WebDriver driver) {
	processratingmasteredit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton1_0']/img"));
	return processratingmasteredit;  
}
public  static WebElement clickprocessratingmastereditname(WebDriver driver) {
	processratingmastereditname=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFName']"));
	return processratingmastereditname;  
}
public  static WebElement clickprocessratingmastereditsave(WebDriver driver) {
	processratingmastereditsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return processratingmastereditsave;  
}
public  static WebElement clickprocessratingmastereditsavemessage(WebDriver driver) {
	processratingmastereditsavemessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return processratingmastereditsavemessage;  
}
public  static WebElement clickprocessratingmastereditclose(WebDriver driver) {
	processratingmastereditclose=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return processratingmastereditclose;  
}
public  static WebElement clickprocessratingmasterdelete(WebDriver driver) {
	processratingmasterdelete=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditor_LinkButton2_0']/img"));
	return processratingmasterdelete;  
}
public  static WebElement clickauditreporting(WebDriver driver) {
	auditreporting=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]/a"));
	return auditreporting;  
}
public  static WebElement clickauditassignment(WebDriver driver) {
	auditassignment=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[3]/a"));
	return auditassignment;  
}
public  static WebElement clickauditassignmentadd(WebDriver driver) {
	auditassignmentadd=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddAuditAssignment']"));
	return auditassignmentadd;  
}
public  static WebElement clickauditassignmentselect(WebDriver driver) {
	auditassignmentselect=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPopPup_chosen']/a"));
	return auditassignmentselect;  
}
public  static WebElement clickauditassignmentselectcompany(WebDriver driver) {
	auditassignmentselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityPopPup_chosen']/div/ul/li[17]"));
	return auditassignmentselectcompany;  
}
public  static WebElement clickauditassignmentsave(WebDriver driver) {
	auditassignmentsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	return auditassignmentsave;  //*[@id="ContentPlaceHolder1_ddlAuditHeadUsers_chosen"]/a/span
}
public  static WebElement clickauditassignmentclose(WebDriver driver) {
	auditassignmentclose=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']"));
	return auditassignmentclose; 
}
public  static WebElement clickauditassignmentmessage(WebDriver driver) {
	auditassignmentmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return auditassignmentmessage;  
}
public  static WebElement clickauditassignmentfilter1(WebDriver driver) {
	auditassignmentfilter1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return auditassignmentfilter1;  
}
public  static WebElement clickauditassignmentselectfilter1(WebDriver driver) {
	auditassignmentselectfilter1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[2]"));
	return auditassignmentselectfilter1;  
}
public  static WebElement clickauditassignmentfilter2(WebDriver driver) {
	auditassignmentfilter2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/a"));
	return auditassignmentfilter2;  
}
public  static WebElement clickauditassignmentselectfilter2(WebDriver driver) {
	auditassignmentselectfilter2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/div/ul/li[2]"));
	return auditassignmentselectfilter2;  
}
public  static WebElement clickmydocument(WebDriver driver) {
	mydocument=driver.findElement(By.xpath("//*[@id=\"CMPMenuBar\"]/ul/li[10]/a"));
	return mydocument;  
}
public  static WebElement clickmydocumentcompany(WebDriver driver) {
	mydocumentcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return mydocumentcompany;  
}
public  static WebElement clickmydocumentselectcompany(WebDriver driver) {
	mydocumentselectcompany=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlLegalEntity_chosen\"]/a/span"));
	return mydocumentselectcompany;  
}
public  static WebElement clickmydocumentdownload(WebDriver driver) {
	mydocumentdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	return mydocumentdownload;  
	//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0"]
}
public  static WebElement clickmydocumentmessage(WebDriver driver) {
	mydocumentmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return mydocumentmessage;  
}
public static WebElement clickmydocumentclick1(WebDriver driver) {
	mydocumentclick1=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
	return mydocumentclick1;
}
public static WebElement clickmydocumentreview(WebDriver driver) {
	mydocumentreview=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[2]"));
	//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0"]/option[2]
	//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[3]
	return mydocumentreview;
}
public static WebElement clickmyreviewdocumentdownload(WebDriver driver) {
	myreviewdocumentdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	return myreviewdocumentdownload;
}
public static WebElement clickmydocumentclick2(WebDriver driver) {
	mydocumentclick2=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
	return mydocumentclick2;
}
public static WebElement clickmydocumentannexure(WebDriver driver) {
	mydocumentannexure=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[3]"));
	return mydocumentannexure;
}
public static WebElement clickmyannexuredocumentdownload(WebDriver driver) {
	myannexuredocumentdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	return myannexuredocumentdownload;
}

public static WebElement clickmydocumentclick3(WebDriver driver) {
	mydocumentclick3=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
	return mydocumentclick3;
}
public static WebElement clickmydocumentFinaldeliverable(WebDriver driver) {
	mydocumentFinaldeliverable=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[5]"));
	return mydocumentFinaldeliverable;
}
public static WebElement clickmyFinaldeliverabledocumentdownload(WebDriver driver) {
	myFinaldeliverabledocumentdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	return myFinaldeliverabledocumentdownload;
}

public static WebElement clickmydocumentclick4(WebDriver driver) {
	mydocumentclick4=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
	return mydocumentclick4;
}
public static WebElement clickmydocumentFeedback(WebDriver driver) {
	mydocumentFeedback=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[7]"));
	return mydocumentFeedback;
}
public static WebElement clickmydocumentFeedbackdownload(WebDriver driver) {
	mydocumentFeedbackdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	return mydocumentFeedbackdownload;
}

public static WebElement clickmydocumentclick5(WebDriver driver) {
	mydocumentclick5=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']"));
	return mydocumentclick5;
}
public static WebElement clickmydocumentDeleted(WebDriver driver) {
	mydocumentDeleted=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0']/option[6]"));
	//*[@id="ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_ddlDocumentFile_0"]/option[6]
	return mydocumentDeleted;
}
public static WebElement clickmydocumentDeleteddownload(WebDriver driver) {
	mydocumentDeleteddownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
	return mydocumentDeleteddownload;
}
public  static WebElement clickmyreport(WebDriver driver) {
	myreport=driver.findElement(By.xpath("//*[@id=\"CMPMenuBar\"]/ul/li[11]/a"));
	return myreport;  
}
public  static WebElement clickmyreportexecutivereport(WebDriver driver) {
	myreportexecutivereport=driver.findElement(By.xpath("//*[@id=\"CMPMenuBar:submenu:42\"]/li[3]/a"));
	//*[@id="CMPMenuBar:submenu:42"]/li[3]/a
	return myreportexecutivereport;  
}
public  static WebElement clickmyreportcompany(WebDriver driver) {
	myreportcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']"));
	return myreportcompany;  
}
public  static WebElement clickmyreportselectcompany(WebDriver driver) {
	myreportselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a/span"));
	return myreportselectcompany;  
}
public  static WebElement clickmyreportexecutivedownload(WebDriver driver) {
	myreportexecutivedownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
	return myreportexecutivedownload;  
}
/*public  static WebElement clickmyreportexecutivemessage(WebDriver driver) {
	myreportexecutivemessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return myreportexecutivemessage;  
}*/
public  static WebElement clickmyreportinternalaudit(WebDriver driver) {
	myreportinternalaudit=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[2]/a"));
	return myreportinternalaudit;  
}
public  static WebElement clickmyreportinternalauditcompany(WebDriver driver) {
	myreportinternalauditcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportinternalauditcompany;  
}
public  static WebElement clickmyreportinternalauditselectcompany(WebDriver driver) {
	myreportinternalauditselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[16]"));
	return myreportinternalauditselectcompany;  
}
public  static WebElement clickmyreportinternalauditdownload(WebDriver driver) {
	myreportinternalauditdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProcessAudits_lnkAuditDetails_0']/img"));
	return myreportinternalauditdownload;  
	
}
public  static WebElement clickmyreportinternalauditmessage(WebDriver driver) {
	myreportinternalauditmessage=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
	return myreportinternalauditmessage;  
	
}
public  static WebElement clickmyreportopenobservation(WebDriver driver) {
	myreportopenobservation=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[6]/a"));
	return myreportopenobservation;  
	
}
public  static WebElement clickmyreportopenobservationcompany(WebDriver driver) {
	myreportopenobservationcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportopenobservationcompany;  
}
public  static WebElement clickmyreportopenobservationselectcompany(WebDriver driver) {
	myreportopenobservationselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[5]"));
	return myreportopenobservationselectcompany;  
}
public  static WebElement clickmyreportopenobservationexporttoexcel(WebDriver driver) {
	myreportopenobservationexporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return myreportopenobservationexporttoexcel;  //*[@id="ContentPlaceHolder1_lbtnExportExcel"]
}
public  static WebElement clickmyreportobservationsummary(WebDriver driver) {
	myreportobservationsummary=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:42']/li[2]/a"));
	return myreportobservationsummary;  
}
public  static WebElement clickmyreportobservationcompany(WebDriver driver) {
	myreportobservationcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntityMultiSelect_sl']"));
	return myreportobservationcompany;  
}
public  static WebElement clickmyreportobservationselectcompany(WebDriver driver) {
	myreportobservationselectcompany=driver.findElement(By.xpath("//*[@id='checks']/span[1]/label"));
	return myreportobservationselectcompany;  
}
public  static WebElement clickmyreportobservationok(WebDriver driver) {
	myreportobservationok=driver.findElement(By.xpath("//*[@id='buttons']/input[1]"));
	return myreportobservationok;  
}
public  static WebElement clickmyreportobservationexporttoexcel(WebDriver driver) {
	myreportobservationexporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Button1']"));
	return myreportobservationexporttoexcel;  
}
public  static WebElement clickmyreportschedulingdeviation(WebDriver driver) {
	myreportschedulingdeviation=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[5]/a"));
	return myreportschedulingdeviation;  
}
public  static WebElement clickmyreportschedulingcompany(WebDriver driver) {
	myreportschedulingcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportschedulingcompany;  
}
public  static WebElement clickmyreportschedulingselectcompany(WebDriver driver) {
	myreportschedulingselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[14]"));
	return myreportschedulingselectcompany;  
}
public  static WebElement clickmyreportschedulingtype(WebDriver driver) {
	myreportschedulingtype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
	return myreportschedulingtype;  
}
public  static WebElement clickmyreportschedulingselecttype(WebDriver driver) {
	myreportschedulingselecttype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
	return myreportschedulingselecttype;  
}
public  static WebElement clickmyreportschedulingperiod(WebDriver driver) {
	myreportschedulingperiod=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a"));
	return myreportschedulingperiod;  
}
public  static WebElement clickmyreportschedulingselectperiod(WebDriver driver) {
	myreportschedulingselectperiod=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
	return myreportschedulingselectperiod;  
}
public  static WebElement clickmyreportschedulingexporttoexcel(WebDriver driver) {
	myreportschedulingexporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return myreportschedulingexporttoexcel;  
}

public  static WebElement clickmyreportmanagementresponse(WebDriver driver) {
	myreportmanagementresponse=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[10]/a"));
	return myreportmanagementresponse;  
}
public  static WebElement clickmyreportmanagementresponsecompany(WebDriver driver) {
	myreportmanagementresponsecompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportmanagementresponsecompany;  
}
public  static WebElement clickmyreportmanagementresponseselectcompany(WebDriver driver) {
	myreportmanagementresponseselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[4]"));
	return myreportmanagementresponseselectcompany;  
}
public  static WebElement clickmyreportmanagementresponsefinancial(WebDriver driver) {
	myreportmanagementresponsefinancial=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/a"));
	return myreportmanagementresponsefinancial;  
}
public  static WebElement clickmyreportmanagementresponseselectfinancial(WebDriver driver) {
	myreportmanagementresponseselectfinancial=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[2]"));
	return myreportmanagementresponseselectfinancial;  
}
public  static WebElement clickmyreportmanagementresponseselectscheduling(WebDriver driver) {
	myreportmanagementresponseselectscheduling=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
	return myreportmanagementresponseselectscheduling;  
}
public  static WebElement clickmyreportmanagementresponseselectselectscheduling(WebDriver driver) {
	myreportmanagementresponseselectselectscheduling=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen]/div/ul/li[2]"));
	return myreportmanagementresponseselectselectscheduling;  
}
public  static WebElement clickmyreportmanagementresponseperiod(WebDriver driver) {
	myreportmanagementresponseperiod=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a"));
	return myreportmanagementresponseperiod;  
}
public  static WebElement clickmyreportmanagementresponseselectperiod(WebDriver driver) {
	myreportmanagementresponseselectperiod=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
	return myreportmanagementresponseselectperiod;  
}
public  static WebElement clickmyreportmanagementresponseexporttoexcel(WebDriver driver) {
	myreportmanagementresponseexporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return myreportmanagementresponseexporttoexcel;  
}
public  static WebElement clickmyreportprerequisit(WebDriver driver) {
	myreportprerequisit=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[9]/a"));
	return myreportprerequisit;  
}
public  static WebElement clickmyreportprerequisitcompancy(WebDriver driver) {
	myreportprerequisitcompancy=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportprerequisitcompancy;  
}
public  static WebElement clickmyreportprerequisitselectcompancy(WebDriver driver) {
	myreportprerequisitselectcompancy=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[7]"));
	return myreportprerequisitselectcompancy;  
}
public  static WebElement clickmyreportprerequisitfinancial(WebDriver driver) {
	myreportprerequisitfinancial=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen]/a"));
	return myreportprerequisitfinancial;  
}
public  static WebElement clickmyreportprerequisitselectfinancial(WebDriver driver) {
	myreportprerequisitselectfinancial=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[14]"));
	return myreportprerequisitselectfinancial;  
}
public  static WebElement clickmyreportprerequisitscheduling(WebDriver driver) {
	myreportmyreportprerequisitscheduling=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a"));
	return myreportmyreportprerequisitscheduling;  
}
public  static WebElement clickmyreportmyreportprerequisitselectscheduling(WebDriver driver) {
	myreportmyreportprerequisitselectscheduling=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
	return myreportmyreportprerequisitselectscheduling;  
}
public  static WebElement clickmyreportmyreportprerequisitperiod(WebDriver driver) {
	myreportmyreportprerequisitperiod=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a"));
	return myreportmyreportprerequisitperiod;  
}
public  static WebElement clickmyreportmyreportprerequisitselectperiod(WebDriver driver) {
	myreportmyreportprerequisitselectperiod=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
	return myreportmyreportprerequisitselectperiod;  
}
public  static WebElement clickmyreportmyreportprerequisitexporttoexcel(WebDriver driver) {
	myreportmyreportprerequisitexporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return myreportmyreportprerequisitexporttoexcel;  
}
public  static WebElement clickmyreportauditscheduling(WebDriver driver) {
	myreportauditscheduling=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[8]/a"));
	return myreportauditscheduling;  
}
public  static WebElement clickmyreportauditschedulingcompancy(WebDriver driver) {
	myreportauditschedulingcompancy=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportauditschedulingcompancy;  
}
public  static WebElement clickmyreportauditschedulingselectcompancy(WebDriver driver) {
	myreportauditschedulingselectcompancy=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[16]"));
	return myreportauditschedulingselectcompancy;  
}
public  static WebElement clickmyreportauditschedulingexporttoexcel(WebDriver driver) {
	myreportauditschedulingexporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
	return myreportauditschedulingexporttoexcel;  
}
public  static WebElement clickmyreportauditstatus(WebDriver driver) {
	myreportauditstatus=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[7]/a"));
	return myreportauditstatus;  
}
public  static WebElement clickmyreportauditstatuscompany(WebDriver driver) {
	myreportauditstatuscompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportauditstatuscompany;  
}
public  static WebElement clickmyreportauditstatusselectcompany(WebDriver driver) {
	myreportauditstatusselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportauditstatusselectcompany;  
}
public  static WebElement clickmyreportauditstatusexporttoexcel(WebDriver driver) {
	myreportauditstatusexporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnExportExcel']"));
	return myreportauditstatusexporttoexcel;  
}
public  static WebElement clickmyreportpastaudit(WebDriver driver) {
	myreportpastaudit=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[11]/a"));
	return myreportpastaudit;  
}
public  static WebElement clickmyreportpastauditaddnew(WebDriver driver) {
	myreportpastauditaddnew=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddPromotor']"));
	return myreportpastauditaddnew;  
}
public  static WebElement clickmyreportpastauditunit(WebDriver driver) {
	myreportpastauditunit=driver.findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/a"));
	return myreportpastauditunit;  
}
public  static WebElement clickmyreportpastauditselectunit(WebDriver driver) {
	myreportpastauditselectunit=driver.findElement(By.xpath("//*[@id='ddlLegalEntityPopPup_chosen']/div/ul/li[7]"));
	return myreportpastauditselectunit;  
}
public  static WebElement clickmyreportpastauditfinancial(WebDriver driver) {
	myreportpastauditfinancial=driver.findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/a"));
	return myreportpastauditfinancial;  
}
public  static WebElement clickmyreportpastauditselectfinancial(WebDriver driver) {
	myreportpastauditselectfinancial=driver.findElement(By.xpath("//*[@id='ddlFilterFinancialPopPup_chosen']/div/ul/li[2]"));
	return myreportpastauditselectfinancial;  
}
public  static WebElement clickmyreportpastauditauditbackground(WebDriver driver) {
	myreportpastauditauditbackground=driver.findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']/a"));
	return myreportpastauditauditbackground;  
}
public  static WebElement clickmyreportpastauditselectauditbackground(WebDriver driver) {
	myreportpastauditselectauditbackground=driver.findElement(By.xpath("//*[@id='ddlAuditBackground_chosen']/a/span"));
	return myreportpastauditselectauditbackground;  
}
public  static WebElement clickmyreportpastaudituploadfile(WebDriver driver) {
	myreportpastaudituploadfile=driver.findElement(By.xpath("//*[@id='FileUploadObservation']"));
	return myreportpastaudituploadfile;  
}
public  static WebElement clickmyreportpastauditsave(WebDriver driver) {
	myreportpastauditsave=driver.findElement(By.xpath("//*[@id='btnSave']"));
	return myreportpastauditsave;  
}
public  static WebElement clickmyreportpastauditclose(WebDriver driver) {
	myreportpastauditclose=driver.findElement(By.xpath("//*[@id='btnCancel']"));
	return myreportpastauditclose;  
}
public  static WebElement clickmyreportpastauditview(WebDriver driver) {
	myreportpastauditview=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']/img"));
	return myreportpastauditview;  
}
public  static WebElement clickmyreportpastauditedit(WebDriver driver) {
	myreportpastauditedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblEditFile_0']/img"));
	return myreportpastauditedit;  
}
public  static WebElement clickmyreportpastauditcancel(WebDriver driver) {
	myreportpastauditcancel=driver.findElement(By.xpath("//*[@id='btnCancel']"));
	return myreportpastauditcancel;  
}
public  static WebElement clickmyreportfinalaudit(WebDriver driver) {
	myreportfinalaudit=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:42']/li[5]/a"));
	//*[@id="CMPMenuBar:submenu:42"]/li[5]/a
	return myreportfinalaudit;  
}
public  static WebElement clickmyreportfinalauditcompany(WebDriver driver) {
	myreportfinalauditcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
	return myreportfinalauditcompany;  
}
public  static WebElement clickmyreportfinalauditselectcompany(WebDriver driver) {
	myreportfinalauditselectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[28]"));
	return myreportfinalauditselectcompany;  
}
public  static WebElement clickmyreportfinalauditdownload(WebDriver driver) {
	myreportfinalauditdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfileActionAll_0']"));
	return myreportfinalauditdownload;  
}
public  static WebElement clickconfiguration(WebDriver driver) {
	configuration=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[5]/a"));
	return configuration;  
}
public  static WebElement clickconfigurationprofilemaster(WebDriver driver) {
	configurationprofilemaster=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[1]/a"));
	return configurationprofilemaster;  
}
public  static WebElement clickconfigurationprofilemasteraddnew(WebDriver driver) {
	configurationprofilemasteraddnew=driver.findElement(By.xpath("//*[@id=\"btnAddNew\"]"));
	return configurationprofilemasteraddnew;  
}
public  static WebElement clickconfigurationprofilemasterprofilename(WebDriver driver) {
	configurationprofilemasterprofilename=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPName']"));
	return configurationprofilemasterprofilename;  
}
public  static WebElement clickconfigurationprofilemasterlevel(WebDriver driver) {
	configurationprofilemasterlevel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLevel']"));
	return configurationprofilemasterlevel;  
}
public  static WebElement clickconfigurationprofilemasterselectlevel(WebDriver driver) {
	configurationprofilemasterselectlevel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLevel']/option[2]"));
	return configurationprofilemasterselectlevel;  
}
public  static WebElement clickconfigurationprocess(WebDriver driver) {
	configurationprocess=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlMutiselect_sl']"));
	return configurationprocess;  
}
public  static WebElement clickselectconfigurationprocess(WebDriver driver) {
	selectconfigurationprocess=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlMutiselect']/label[1]"));
	return selectconfigurationprocess;  
}
public  static WebElement clickok(WebDriver driver) {
	ok=driver.findElement(By.xpath("//*[@id='buttons']/input[1]"));
	return ok;  
}
public  static WebElement clickconfigurationprofilemastersave(WebDriver driver) {
	configurationprofilemastersave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
	//*[@id="ContentPlaceHolder1_btnSave"]
	return configurationprofilemastersave;  
}
public  static WebElement clickconfigurationprofilemasterclose(WebDriver driver) {
	configurationprofilemasterclose=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']"));
	//*[@id="ContentPlaceHolder1_btnCloseDeptPopUp"]
	
	return configurationprofilemasterclose;  
}
public  static WebElement clickconfigurationprofilemasteredit(WebDriver driver) {
	configurationprofilemasteredit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_lnkEditProfile_0']/img"));
	return configurationprofilemasteredit;  
}
public  static WebElement clickconfigurationprofilemastercancel(WebDriver driver) {
	configurationprofilemastercancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']"));
	return configurationprofilemastercancel;  
}
public  static WebElement clickconfigurationprofilemasterdeactivate(WebDriver driver) {
	configurationprofilemasterdeactivate=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_lnkDeactivateProfile_0']/img"));
	return configurationprofilemasterdeactivate;  
}
public  static WebElement clickconfigurationprofile(WebDriver driver) {
	configurationprofile=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[2]/a"));
	return configurationprofile;  
}
public  static WebElement clickconfigurationprofileclick(WebDriver driver) {
	configurationprofileclick=driver.findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[3]/td[1]/a"));
	return configurationprofileclick;  
}
public  static WebElement clickconfigurationprofileuser(WebDriver driver) {
	configurationprofileuser=driver.findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[4]/td[2]/div/table/tbody/tr[1]/td[3]/span/span"));
	return configurationprofileuser;  
}
public  static WebElement clickconfigurationprofileselectuser(WebDriver driver) {
	configurationprofileselectuser=driver.findElement(By.xpath("//*[@id='ece7d857-c2a5-4031-b98b-84b54f339377']"));
	return configurationprofileselectuser;  
}
public  static WebElement clickconfigurationprofilesave(WebDriver driver) {
	configurationprofilesave=driver.findElement(By.xpath("//*[@id='btnsave']"));
	return configurationprofilesave;  
}
public  static WebElement clickconfigurationescalation(WebDriver driver) {
	configurationescalation=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[3]/a"));
	return configurationescalation;  
}
public  static WebElement clickconfigurationescalationaddnew(WebDriver driver) {
	configurationescalationaddnew=driver.findElement(By.xpath("//*[@id='btnAddNew']"));
	return configurationescalationaddnew;  
}
public  static WebElement clickconfigurationprofilename(WebDriver driver) {
	configurationprofilename=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlprofile']"));
	return configurationprofilename;  
}
public  static WebElement clickconfigurationselectprofile(WebDriver driver) {
	configurationselectprofile=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlprofile']/option[5]"));
	return configurationselectprofile;  
}
public  static WebElement clickconfigurationadd(WebDriver driver) {
	configurationadd=driver.findElement(By.xpath("//*[@id='btnadd']"));
	return configurationadd;  
}
public  static WebElement clickconfigurationnodays(WebDriver driver) {
	configurationnodays=driver.findElement(By.xpath("//*[@id='txtdays']")); 
	return configurationnodays;  
}
public  static WebElement clickconfigurationsave(WebDriver driver) {
	configurationnosave=driver.findElement(By.xpath("//*[@id='btnsave']")); 
	return configurationnosave;  
}
public  static WebElement clickconfigurationnocancel(WebDriver driver) {
	configurationnocancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
	return configurationnocancel;  
}
public  static WebElement clickconfigurationnoview(WebDriver driver) {
	configurationnoview=driver.findElement(By.xpath("//*[@id='grd_data_request']/div[2]/table/tbody/tr[2]/td[4]/a")); 
	return configurationnoview;  
}
public  static WebElement clickconfigurationcross(WebDriver driver) {
	configurationcross=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
	return configurationcross;  
}
public  static WebElement clickconfigurationhod(WebDriver driver) {
	configurationhod=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[4]/a")); 
	return configurationhod;  
}
public  static WebElement clickconfigurationhodaddnew(WebDriver driver) {
	configurationhodaddnew=driver.findElement(By.xpath("//*[@id='btnAddNew']")); 
	return configurationhodaddnew;  
}
public  static WebElement clickhodprofile(WebDriver driver) {
	hodprofile=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddl_profile']")); 
	return hodprofile;  
}
public  static WebElement clickhodselectprofile(WebDriver driver) {
	hodselectprofile=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddl_profile']/option[6]")); 
	return hodselectprofile;  
}
public  static WebElement clickhodtimeline(WebDriver driver) {
	hodtimeline=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txttimeline']")); 
	return hodtimeline;  
}
public  static WebElement clickhodsave(WebDriver driver) {
	hodsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']")); 
	return hodsave;  
}
public  static WebElement clickhodcancel(WebDriver driver) {
	hodcancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
	return hodcancel;  
}
public  static WebElement clickconfigurationmessage(WebDriver driver) {
	configurationmessage=driver.findElement(By.xpath("//*[@id='confirmbox']/p1/strong")); 
	return configurationmessage;  
}
public  static WebElement clickconfigurationeditmessage(WebDriver driver) {
	configurationeditmessage=driver.findElement(By.xpath("/html/body/div[9]/div[3]/button")); 
	return configurationeditmessage;  
}
public  static WebElement clickconfigurationhodedit(WebDriver driver) {
	configurationhodedit=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gridView_lnkEditProfile_0']/img")); 
	return configurationhodedit;  
}
public  static WebElement clickconfigurationhodeditclose(WebDriver driver) {
	configurationhodeditclose=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCloseDeptPopUp']")); 
	return configurationhodeditclose;  
}
public  static WebElement clickconfigurationdelete(WebDriver driver) {
	configurationdelete=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gridView_ButtonDelete_0']/img")); 
	return configurationdelete;  
}
public  static WebElement clickconfigurationdeletecancel(WebDriver driver) {
	configurationdeletecancel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gridView_ButtonDelete_0']/img")); 
	return configurationdeletecancel;    //cancel button pr click krna hai
}
public  static WebElement clickconfigurationdashboard(WebDriver driver) {
	configurationdashboard=driver.findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[5]/a")); 
	return configurationdashboard;   
}
public  static WebElement clickconfigurationdashboardselect(WebDriver driver) {
	configurationdashboardselect=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_ddlDashboardView_0']")); 
	return configurationdashboardselect;   
}
public  static WebElement clickconfigurationdashboardselectprofile(WebDriver driver) {
	configurationdashboardselectprofile=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdProfile_ddlDashboardView_0']/option[1]")); 
	return configurationdashboardselectprofile;   
}
public  static WebElement clickconfigurationdashboardsave(WebDriver driver) {
	configurationdashboardsave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']")); 
	return configurationdashboardsave;   
}

////////////////////////////////////////////////NEW DASHBOARD/////////////////////////////////////////////////////////
public  static WebElement clicknewdashbard(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[3]/a")); 
	return ars;   
}
public  static WebElement clickcompanyname(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_CompanyWise']/div[2]/table/tbody/tr[1]/td[1]/a")); 
	return ars;   
}
public  static WebElement clickondateobdervationhigh(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[6]/a")); 
	return ars;   
}
public  static WebElement clickondateobdervationexoptexcel(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']")); 
	return ars;   
}
public  static WebElement clickvobservation(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCountDetails']/div[2]/table/tbody/tr[1]/td[8]/a")); 
	return ars;   
}
public  static WebElement clickobservationpopclose(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button")); 
	return ars;   
}
public  static WebElement clickback(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']")); 
	return ars;   
}
public  static WebElement clickback2(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btn_Back1']")); 
	return ars;   
}
public  static WebElement clickondateobdervationmedium(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[7]/a")); 
	return ars;   
}
public  static WebElement clickondateobdervationlow(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[8]/a")); 
	return ars;   
}
public  static WebElement clickondatetotalobservation(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[9]/a")); 
	return ars;   
}
public  static WebElement clickoverduehighobser(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[10]/a")); 
	return ars;   
}
public  static WebElement clickoverduemediumobser(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[11]/a")); 
	return ars;   
}
public  static WebElement clickoverduelowobservation(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[12]/a")); 
	return ars;   
}
public  static WebElement openoverdueototalobs(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_UnitCount']/div[2]/table/tbody/tr[3]/td[13]/a")); 
	return ars;   
}
public  static WebElement clickprocesswise(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='liNewMail']/a")); 
	return ars;   
}
public  static WebElement clickprocessname(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessWise']/div[2]/table/tbody/tr[2]/td[1]/a")); 
	return ars;   
}
public  static WebElement clickproceopenhighondate(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCount']/div[2]/table/tbody/tr[3]/td[6]/a")); 
	return ars;   
}
public  static WebElement clickproceopenhighexportexcel(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']")); 
	//*[@id="ContentPlaceHolder1_lbtnExportExcel"]
	return ars;   
}
public  static WebElement clickproceopenhighobsview(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCountDetails']/div[2]/table/tbody/tr[1]/td[8]/a")); 
	return ars;   
}
public  static WebElement clickproceopenhighobspopclose(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button")); 
	return ars;   
}
public  static WebElement clickproceopenhighobsback(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']")); 
	return ars;   
}
public  static WebElement clickproceopenhighobsback1(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCount']/div[2]/table/tbody/tr[3]/td[6]/a")); 
	return ars;   
}
public  static WebElement clickproceopenmediumondate(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCount']/div[2]/table/tbody/tr[3]/td[7]/a")); 
	//*[@id="grd_ProcessCount"]/div[2]/table/tbody/tr[3]/td[7]/a
	return ars;   
}
public  static WebElement clickproceopenlowondate(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCount']/div[2]/table/tbody/tr[3]/td[8]/a")); 
	return ars;   
}
public  static WebElement clickopenprocetotalondate(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCount']/div[2]/table/tbody/tr[3]/td[9]/a")); 
	return ars;   
}
public  static WebElement clickopenprocehighoverdue(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCount']/div[2]/table/tbody/tr[8]/td[10]/a")); 
	return ars;   
}
public  static WebElement clickopenprocemediumoverdue(WebDriver driver) {
	ars=driver.findElement(By.xpath("//*[@id='grd_ProcessCount']/div[2]/table/tbody/tr[8]/td[11]/a")); 
	return ars;   
}

}







