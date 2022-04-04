package com.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class SurveyPage {
Utility utilobj = new Utility();
	

	WebDriver driver;

	public SurveyPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	@FindBy(xpath=".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img" )
	WebElement Revenue;
	
	@FindBy(linkText="Survey" )
	WebElement Survey;
	
	//Create Survey Source Register
	@FindBy(linkText="Create Survey Source Register" )
	WebElement CreateSurveySourceRegister;
	
	@FindBy(id="ctl00_HomePageContent_txtFactName" )
	WebElement FactoryNameTxtBx;
	
    @FindBy(id="ctl00_HomePageContent_txtEmprName" )
	WebElement OwnerNameTxtBx;
    
    @FindBy(id="ctl00_HomePageContent_txtLocation" )
   	WebElement UnitAddressTxtBx;
    
    @FindBy(id="ctl00_HomePageContent_txtAddOcu" )
   	WebElement OwnerAddressTxtBx;
    
    @FindBy(id="ctl00_HomePageContent_ddlSrcInfo" )
   	WebElement SourceDrpDwn;
    
    @FindBy(id="ctl00_HomePageContent_ddlIns" )
   	WebElement InspectionDivisionDrpDwn;
    
    
    @FindBy(id="ctl00_HomePageContent_TextBox2" )
   	WebElement IssuanceDate;
    
    @FindBy(id="ctl00_HomePageContent_ctrltxtremrks" )
   	WebElement Remarks;
    
    @FindBy(id="ctl00_HomePageContent_btnSubmit" )
   	WebElement CreateSubmitBtn;
	
	//Edit survey Source Register
	
	@FindBy(linkText="Edit Survey Source Register" )
	WebElement EditSurveySourceRegister;
	
	 @FindBy(id="ctl00_HomePageContent_txtsurveynumber" )
	   	WebElement EditSurveyNumberTxtBx;
	 
	 @FindBy(id="ctl00_HomePageContent_CtrlBtnView" )
	   	WebElement EditSurveySearchBtn; 
	
	 @FindBy(id="ctl00_HomePageContent_grdSurveyDetails_ctl02_lnkeditsurvey" )
	   	WebElement EditSurveyLink; 
	 
	 @FindBy(id="ctl00_HomePageContent_btnCancel" )
	   	WebElement CancelSurveyBtn; 
	 
	 @FindBy(id="ctl00_HomePageContent_exit" )
	   	WebElement OKBtn;
	
	
	@FindBy(linkText="View Periodic Survey Register" )
	WebElement ViewPeriodicSurveyRegister;
	
	//Task Details
	@FindBy(linkText="Task Details" )
	WebElement TaskDetails;
	
	@FindBy(id="ctl00_HomePageContent_lnlSurveyApproval" )
	WebElement SurveyApprovalLink;
	

	@FindBy(id="ctl00_HomePageContent_CtrlGrdInsDet_ctl02_txtRemarks" )
	WebElement RemarksTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_CtrlGrdInsDet_ctl02_btnApproval" )
	WebElement ApprovalForwardBtn;
	

	@FindBy(id="ctl00_HomePageContent_LinkButton1" )
	WebElement Form01ApprovalLink;
	
	@FindBy(id="ctl00_HomePageContent_ctrlTxtEmprCode" )
	WebElement EmployerCodeTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_ctrlBtnSearch" )
	WebElement SearchBtn;
	
	@FindBy(id="ctl00_HomePageContent_grvEmployerList_ctl03_lnkEmployercode" )
	WebElement Form01EmployerLink;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit" )
	WebElement NextBtn;
	

	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtAccountNo" )
	WebElement AccountNo;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtBankName" )
	WebElement BankName;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtBranchName" )
	WebElement BranchName;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtMICRCode" )
	WebElement MICRCode;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtIFSCCode" )
	WebElement IFSCCode;
	
	@FindBy(id="ctl00_HomePageContent_btnForward" )
	WebElement ForwardBtn;
	
	//View survey Report
	@FindBy(linkText="View Survey Report" )
	WebElement ViewSurveyReport;
	
	 @FindBy(id="ctl00_HomePageContent_CtrlTxtBxInsNum" )
	   	WebElement SurveyNumberTxtBx;
	
	 @FindBy(id="ctl00_HomePageContent_CtrlBtnView" )
	   	WebElement SurveyNumberSearchBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_grdSurveyDetails_ctl02_InspNolinkbutton" )
	   	WebElement ViewSurveyLink;
	 
	 @FindBy(id="ctl00_HomePageContent_btnnext" )
	   	WebElement ViewSurveyNextBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_btnPrint" )
	   	WebElement ViewSurveyPrintBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_btnCancel" )
	   	WebElement ViewSurveyCancelBtn;
	 
	//View Observation Note
	@FindBy(linkText="View Observation Note" )
	WebElement ViewObservationNote;
	
	 @FindBy(id="ctl00_HomePageContent_BtnNext" )
	   	WebElement ViewObservationNextBtn;
	
	 @FindBy(id="ctl00_HomePageContent_btncancel" )
	   	WebElement ViewObservationCancelBtn;
	 
	 public WebElement  Close(){
			return  Close;
		}
	
	 public WebElement  Revenue(){
			return  Revenue;
		}
	 
	 public WebElement  Survey(){
			return  Survey;
	 }

	 //Create Survey Source Register
	 public WebElement  CreateSurveySourceRegister(){
			return  CreateSurveySourceRegister;
	 }
	 
	 public WebElement  FactoryNameTxtBx(){
			return  FactoryNameTxtBx;
	 }
	 
	 public WebElement  OwnerNameTxtBx(){
			return  OwnerNameTxtBx;
	 }
	 
	 public WebElement  UnitAddressTxtBx(){
			return  UnitAddressTxtBx;
	 }
	 
	 public WebElement  OwnerAddressTxtBx(){
			return  OwnerAddressTxtBx;
	 }
	 
	 public WebElement  SourceDrpDwn(){
			return  SourceDrpDwn;
	 }
	 
	 public WebElement  InspectionDivisionDrpDwn(){
			return  InspectionDivisionDrpDwn;
	 }
	 
	 public WebElement  IssuanceDate(){
			return  IssuanceDate;
	 }
	 
	 public WebElement  Remarks(){
			return  Remarks;
	 }
	 
	 public WebElement  CreateSubmitBtn(){
			return  CreateSubmitBtn;
	 }
	  

	 //Edit Survey source register
	 public WebElement  EditSurveySourceRegister(){
			return  EditSurveySourceRegister;
	 }
	 
	 public WebElement  EditSurveyNumberTxtBx(){
			return  EditSurveyNumberTxtBx;
	 }
	 
	 public WebElement  EditSurveySearchBtn(){
			return  EditSurveySearchBtn;
	 }
	 
	 public WebElement  EditSurveyLink(){
			return  EditSurveyLink;
	 }
	 
	 public WebElement  CancelSurveyBtn(){
			return  CancelSurveyBtn;
	 }
	 
	 public WebElement  OKBtn(){
			return  OKBtn;
	 }

	 //View Periodic Survey Register
	 public WebElement  ViewPeriodicSurveyRegister(){
			return  ViewPeriodicSurveyRegister;
	 }
	 
	 //Task Details

	 public WebElement  TaskDetails(){
			return  TaskDetails;
	 }
	 
	 public WebElement  SurveyApprovalLink(){
			return  SurveyApprovalLink;
	 }
	 
	 public WebElement  RemarksTxtBx(){
			return  RemarksTxtBx;
	 }
	 
	 public WebElement  ApprovalForwardBtn(){
			return  ApprovalForwardBtn;
	 }
	 
	 public WebElement  Form01ApprovalLink(){
			return  Form01ApprovalLink;
	 }
	 
	 public WebElement  EmployerCodeTxtBx(){
			return  EmployerCodeTxtBx;
	 }
	 
	 public WebElement  SearchBtn(){
			return  SearchBtn;
	 }
	 
	 
	 
	 public WebElement  Form01EmployerLink(){
			return  Form01EmployerLink;
	 }
	 
	 public WebElement  NextBtn(){
			return  NextBtn;
	 }
	 
	 public WebElement  AccountNo(){
			return  AccountNo;
	 }
	 
	 public WebElement  BankName(){
			return  BankName;
	 }
	 
	 public WebElement  BranchName(){
			return  BranchName;
	 }
	 
	 public WebElement  MICRCode(){
			return  MICRCode;
	 }
	 
	 public WebElement  IFSCCode(){
			return  IFSCCode;
	 }
	 
	 
	 public WebElement  ForwardBtn(){
			return  ForwardBtn;
	 }

	 //View Survey Report
	 public WebElement  ViewSurveyReport(){
			return  ViewSurveyReport;
	 }
	 
	 public WebElement  SurveyNumberTxtBx(){
			return  SurveyNumberTxtBx;
	 }
	 
	 public WebElement  SurveyNumberSearchBtn(){
			return  SurveyNumberSearchBtn;
	 }
	 
	 public WebElement  ViewSurveyLink(){
			return  ViewSurveyLink;
	 }
	 
	 public WebElement  ViewSurveyNextBtn(){
			return  ViewSurveyNextBtn;
	 }
	 
	 public WebElement  ViewSurveyPrintBtn(){
			return  ViewSurveyPrintBtn;
	 }
	 
	 public WebElement  ViewSurveyCancelBtn(){
			return  ViewSurveyCancelBtn;
	 }

	 //View Observation Note
	 public WebElement  ViewObservationNote(){
			return  ViewObservationNote;
	 }
	 
	 public WebElement  ViewObservationNextBtn(){
			return  ViewObservationNextBtn;
	 }

	 public WebElement  ViewObservationCancelBtn(){
			return  ViewObservationCancelBtn;
	 }


	 //Schedule Survey
	 @FindBy(linkText="Schedule Survey" )
		WebElement ScheduleSurvey;
	 
	 @FindBy(id="ctl00_HomePageContent_txtEmpCode" )
		WebElement SurveyTextBox;
	 
	 @FindBy(id="ctl00_HomePageContent_CtrlBtnSearch" )
		WebElement SurveySearchBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_SurveyDetails_ctl02_InspNolinkbutton" )
		WebElement SurveyLink;
	 
	 @FindBy(xpath=".//*[@id='ctl00_HomePageContent1_txtAddnlInsp']" )
		WebElement AdditionalInspector;
	 
	 @FindBy(id="ctl00_HomePageContent1_CtrlTxtRemarks" )
		WebElement WindowRemarks;
	 
	 @FindBy(id="ctl00_HomePageContent1_Submit" )
		WebElement WindowSubmit;
	 
	 public WebElement  ScheduleSurvey(){
			return  ScheduleSurvey;
	 }
	 
	 public WebElement  SurveyTextBox(){
			return  SurveyTextBox;
	 }
	 
	 public WebElement  SurveySearchBtn(){
			return  SurveySearchBtn;
	 }
	 
	 public WebElement  SurveyLink(){
			return  SurveyLink;
	 }
	 
	 public WebElement  AdditionalInspector(){
			return  AdditionalInspector;
	 }
	 
	 public WebElement  WindowRemarks(){
			return  WindowRemarks;
	 }
	 
	 public WebElement  WindowSubmit(){
			return  WindowSubmit;
	 }
	 
	 //Create Observation Note 
	 
	 @FindBy(linkText="Create Observation Note Survey Report" )
		WebElement CreateObservationNote;
	 
	 @FindBy(id="ctl00_HomePageContent_CtrlTxtempcode" )
		WebElement ObservationSurveyTextBox;
	 
	 @FindBy(id="ctl00_HomePageContent_CtrlBtnSubmit" )
		WebElement ObservationSubmitBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_GridViewDiaryDetails_ctl02_InspNolinkbutton" )
		WebElement ObservationSurveyLink;
	 
	 @FindBy(id="ctl00_HomePageContent_HyperLink2" )
		WebElement CreateObservationNoteLink;
	 
	 @FindBy(id="ctl00_HomePageContent_txtnameoftheprincepleemployer" )
		WebElement PrincipalEmployer;
	 
	 @FindBy(id="ctl00_HomePageContent_txtnameofthecontacteforinspection" )
		WebElement PersonContactedForSurvey;
	 
	 @FindBy(id="ctl00_HomePageContent_BtnNext" )
		WebElement NextButton;
	 
	 @FindBy(id="ctl00_HomePageContent_txtnoofemployees" )
		WebElement NoOfEmployees;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlnature" )
		WebElement NatureOfBusinessDrpDwn;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlcategory" )
		WebElement CategoryOfBusinessDrpDwn;
	 
	 @FindBy(id="ctl00_HomePageContent_btnupload" )
		WebElement UploadBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_btnSubmit" )
		WebElement SubmitBtn;
	 
	 public WebElement  CreateObservationNote(){
			return  CreateObservationNote;
	 }
	 
	 public WebElement  ObservationSurveyTextBox(){
			return  ObservationSurveyTextBox;
	 }
	 
	 public WebElement  ObservationSubmitBtn(){
			return  ObservationSubmitBtn;
	 }
	 
	 public WebElement  ObservationSurveyLink(){
			return  ObservationSurveyLink;
	 }
	 
	 public WebElement  CreateObservationNoteLink(){
			return  CreateObservationNoteLink;
	 }
	 
	 public WebElement  PrincipalEmployer(){
			return  PrincipalEmployer;
	 }
	 
	 public WebElement  PersonContactedForSurvey(){
			return  PersonContactedForSurvey;
	 }
	 
	 public WebElement  NextButton(){
			return  NextButton;
	 }
	 
	 public WebElement  NoOfEmployees(){
			return  NoOfEmployees;
	 }
	 
	 public WebElement  NatureOfBusinessDrpDwn(){
			return  NatureOfBusinessDrpDwn;
	 }
	 
	 public WebElement  CategoryOfBusinessDrpDwn(){
			return  CategoryOfBusinessDrpDwn;
	 }
	 
	 public WebElement  UploadBtn(){
			return  UploadBtn;
	 }
	 
	 public WebElement  SubmitBtn(){
			return  SubmitBtn;
	 }
	 
	 //Generate Survey Report
	 
	 @FindBy(id="ctl00_HomePageContent_HyperLink3" )
		WebElement GenerateSurveyLink;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlState" )
		WebElement StateDrpDwn;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlDistrict" )
		WebElement DistrictDrpDwn;
	 
	 @FindBy(id="ctl00_HomePageContent_txtPoliceStation" )
		WebElement PoliceStation;
	 
	 @FindBy(id="ctl00_HomePageContent_txtPinCode" )
		WebElement PinCode;
	 
	 @FindBy(id="ctl00_HomePageContent_txtMobileNo" )
		WebElement MobileNo;
	 
	 @FindBy(id="ctl00_HomePageContent_txtEmail" )
		WebElement EmailId;
	 
	 @FindBy(id="ctl00_HomePageContent_chkNameChange" )
		WebElement ChkBx;
	 
	 @FindBy(id="ctl00_HomePageContent_txtNameOfTown" )
		WebElement NameOfTown;
	 
	 @FindBy(id="ctl00_HomePageContent_txtNameOfTaluk" )
		WebElement NameOfTaluk;
	 
	 @FindBy(id="ctl00_HomePageContent_txtMucipality" )
		WebElement Municipality;
	 
	 @FindBy(id="ctl00_HomePageContent_txtHudbastRevDemarc" )
		WebElement HudbastNo;
	 
	 @FindBy(id="ctl00_HomePageContent_btnNext" )
		WebElement ButtonNext;
	
	 //OwnerShip Details
	 @FindBy(id="ctl00_HomePageContent_ddlOwnerType" )
		WebElement TypeOfOwnership;
	 
	 @FindBy(id="ctl00_HomePageContent_txtAddress1View2" )
		WebElement Address1;
	 
	 @FindBy(id="ctl00_HomePageContent_txtFatherName" )
		WebElement FatherName;
	 
	 
	 @FindBy(id="ctl00_HomePageContent_ddlStateView2" )
		WebElement OwnerState;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlDistrictView2" )
		WebElement OwnerDistrict;
	 
	 @FindBy(id="ctl00_HomePageContent_txtPinCodeView2" )
		WebElement OwnerPincode;
	 
	 @FindBy(id="ctl00_HomePageContent_txtMobileNoView2" )
		WebElement OwnerMobileNo;
	 
	 @FindBy(id="ctl00_HomePageContent_txtMgrName" )
		WebElement ManagerName;
	 
	 @FindBy(id="ctl00_HomePageContent_chkRegtdFactAct" )
		WebElement RegisteredUnderFactoryAxtChkbx;
	 
	 @FindBy(id="ctl00_HomePageContent_txtRegNo" )
		WebElement RegistrationNo;
	 
	 @FindBy(id="ctl00_HomePageContent_rdIsRegisterdExpoPromoComm_1" )
		WebElement NoRadioBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_rdIsRegisterdPFAct_2" )
		WebElement NotDisclosedRadioBtn;
	 
	 //Labour Details
	/* @FindBy(id="ctl00_HomePageContent_txtRegNo" )
		WebElement RegistrationNo;
	 
	 @FindBy(id="ctl00_HomePageContent_chkRegtdFactAct" )
		WebElement RegisteredUnderFactoryAxtChkbx;*/
	 
	 
	 
	 public WebElement  GenerateSurveyLink(){
			return  GenerateSurveyLink;
	 }
	 
	 public WebElement  StateDrpDwn(){
			return  StateDrpDwn;
	 }
	 
	 public WebElement  DistrictDrpDwn(){
			return  DistrictDrpDwn;
	 }
	 
	 public WebElement  PoliceStation(){
			return  PoliceStation;
	 }
	 
	 public WebElement  PinCode(){
			return  PinCode;
	 }
	 
	 public WebElement  MobileNo(){
			return  MobileNo;
	 }
	 
	 public WebElement  EmailId(){
			return  EmailId;
	 }
	 
	 public WebElement  ChkBx(){
			return  ChkBx;
	 }
	 
	 public WebElement  NameOfTown(){
			return  NameOfTown;
	 }
	 
	 public WebElement  NameOfTaluk(){
			return  NameOfTaluk;
	 }
	 
	 public WebElement  Municipality(){
			return  Municipality;
	 }
	 
	 public WebElement  HudbastNo(){
			return  HudbastNo;
	 }
	 
	 public WebElement  ButtonNext(){
			return  ButtonNext;
	 }
	 
	 public WebElement  TypeOfOwnership(){
			return  TypeOfOwnership;
	 }
	 
	 public WebElement  Address1(){
			return  Address1;
	 }
	 
	 public WebElement  FatherName(){
			return  FatherName;
	 }
	 
	 public WebElement  OwnerState(){
			return  OwnerState;
	 }
	 
	 public WebElement  OwnerDistrict(){
			return  OwnerDistrict;
	 }
	 
	 public WebElement  OwnerPincode(){
			return  OwnerPincode;
	 }
	 
	 public WebElement  OwnerMobileNo(){
			return  OwnerMobileNo;
	 }
	 
	 public WebElement  ManagerName(){
			return  ManagerName;
	 }
	 
	 public WebElement  RegisteredUnderFactoryAxtChkbx(){
			return  RegisteredUnderFactoryAxtChkbx;
	 }
	 
	 public WebElement  RegistrationNo(){
			return  RegistrationNo;
	 }
	  
	 public WebElement  NoRadioBtn(){
			return  NoRadioBtn;
	 } 
	 
	 public WebElement  NotDisclosedRadioBtn(){
			return  NotDisclosedRadioBtn;
	 }
	 
	 @FindBy(xpath=".//*[@id='ctl00_HomePageContent1_CtrlTxtStrtDt']" )
		WebElement StartDate;
	 
	 @FindBy(xpath=".//*[@id='ctl00_HomePageContent1_CtrlTxtEndDt']" )
		WebElement EndDate;
	 
	 public WebElement  StartDate(){
			return  StartDate;
	 }
	 
	 public WebElement  EndDate(){
			return  EndDate;
	 }
}
