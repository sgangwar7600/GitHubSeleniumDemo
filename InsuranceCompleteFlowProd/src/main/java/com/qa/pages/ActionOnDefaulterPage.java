package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.qa.util.Utility;

public class ActionOnDefaulterPage {
	Utility utilobj = new Utility();
	
	SoftAssert as = new SoftAssert();
		WebDriver driver;

		public ActionOnDefaulterPage(WebDriver driver) {

			this.driver = driver;

			PageFactory.initElements(driver, this);

		}
		@FindBy(id="ctl00_HomePageContent_btnClose" )
		WebElement Close;
		
		@FindBy(xpath=".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img" )
		WebElement Revenue;
		
		
		@FindBy(linkText="Action On Defaulter" )
		WebElement ActionOnDefaulter;
		
		@FindBy(id="ctl00_HomePageContent_rdbtnopt_2" )
		WebElement EmployerCodeRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_txt6Digits" )
		WebElement FromEmployerCodeTxtBx;
		
		@FindBy(id="ctl00_HomePageContent_txt6Digits2" )
		WebElement ToEmployerCodeTxtBx;
		
		@FindBy(id="ctl00_HomePageContent_btnSearch" )
		WebElement EmployerCodeSearchBtn;
		
		
		
		//Monthly Defaulters
		@FindBy(linkText="Monthly Defaulters" )
		WebElement MonthlyDefaulters;
		
	/*	@FindBy(linkText="MonthlyDefaulters" ) // For Production
		WebElement MonthlyDefaulters;
	*/	/*
		@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl02_id" )
		WebElement MonthlyDefaultersLink;
		*/
		@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl21_id" )
		WebElement MonthlyDefaultersLink;//For Production
		
		@FindBy(id="ctl00_HomePageContent_CtrlDdlActns" )
		WebElement MonthlyDefaultersAction;
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtRmrks" )
		WebElement MonthlyDefaultersRemarks;
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnSubmit" )
		WebElement MonthlyDefaultersSubmitBtn;
		
		@FindBy(linkText=" My Tasklist" )
		WebElement MyTaskList;
		
		public WebElement  MyTaskList(){
				return  MyTaskList;
		 }
		
		@FindBy(linkText=" REVENUE_ACTION_INTEREST_SUBMIT" )
		WebElement ActionOnInterestLink;
		
		public WebElement  ActionOnInterestLink(){
				return  ActionOnInterestLink;
		 }
		
		@FindBy(linkText=" REVENUE_ACTION_DAMAGE_SUBMIT" )
		WebElement ActionOnDamageLink;
		
		public WebElement  ActionOnDamageLink(){
				return  ActionOnDamageLink;
		 }
		 
		
		//Defaulter List
		@FindBy(linkText="Defaulter List" )
		WebElement DefaulterList;
		
		@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl26_id" )//For Production
		WebElement DefaulterLink;
		
		/*@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl30_id" ) // For Staging
		WebElement DefaulterLink;
		*/
		@FindBy(id="ctl00_HomePageContent_CtrlDDlC18Numbers" )
		WebElement DefaulterPendingAction;
		
		@FindBy(id="ctl00_HomePageContent_Button1" )
		WebElement DefaulterPendingActionSearchBtn;
		
		@FindBy(id="ctl00_HomePageContent_rdBtnListchkBtn_0" ) //For C-18 Ad-hoc
		WebElement C18AdhocRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_rdBtnListchkBtn_1" ) //For C-18 Actual
		WebElement C18ActualRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtPrsHrngdate" ) //For C-18 Ad-hoc
		WebElement HearingDate;
		
		@FindBy(id="ctl00_HomePageContent_CalendarExtenderdtFact_EsttClosed_nextArrow" ) //For C-18 Ad-hoc
		WebElement HearingDateNextArrow;
		
		@FindBy(id="ctl00_HomePageContent_CalendarExtenderdtFact_EsttClosed_day_1_4" ) //For C-18 Ad-hoc
		WebElement SelectHearingDate;
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtRmrks" )
		WebElement DefaulterActionRemarks;
		
		@FindBy(id="ctl00_HomePageContent_ctrlsubmitButton0" )
		WebElement DefaulterActionNextBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnCancel" )
		WebElement DefaulterActionCancelBtn;

		
		
		@FindBy(id="ctl00_HomePageContent_CtrlRdLst1_2" )//For C-18 Ad-hoc
		WebElement NoOfEmployeRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlRdLst1_3" )//For C-18 Ad-hoc
		WebElement NoOfEmployeOthersRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlOtrs" )//For C-18 Ad-hoc
		WebElement NoOfEmployeOthersTextBx;
		
		@FindBy(id="ctl00_HomePageContent_CtrlRdLst_0" )//For C-18 Ad-hoc
		WebElement AssumedWagesRadioBtn;
		
		
		@FindBy(id="ctl00_HomePageContent_CtrlRdLst_2" )//For C-18 Ad-hoc
		WebElement AssumedWagesOthersRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlOthers1" )//For C-18 Ad-hoc
		WebElement AssumedWagesOthersTextBx;
		
		@FindBy(id="ctl00_HomePageContent_btnCompute" )//For C-18 Ad-hoc
		WebElement ComputeBtn;
		
		@FindBy(id="ctl00_HomePageContent_Button1" )//For C-18 Ad-hoc
		WebElement C18AdhocSubmitBtn;
		
		
		//Show Cause Notice Prosecution Sanction Memo
		@FindBy(linkText="Show Cause Notice/Prosecution & Sanction memo" )
		WebElement ShowCauseNoticeProsecutionSanctionmemo;
		
		@FindBy(id="ctl00_HomePageContent_ddlActionTypeScn" )
		WebElement ShowCauseNoticeActionType;
		
		@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl30_id" )
		WebElement SCNEmployerLink;
		
		@FindBy(id="ctl00_HomePageContent_rdbtnSCNType_0" )
		WebElement SCNDefaulterRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_DAPane_content_txtDARemarks" )
		WebElement SCNRemarksTxtBx;
		
		@FindBy(id="ctl00_HomePageContent_ctrlsubmitButton2" )
		WebElement SCNNextBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlLinkButton1" )
		WebElement SCNLetterLink;
		
		
		//Actions On Interest
		@FindBy(linkText="Actions On Interest" )
		WebElement ActionsOnInterest ;
		
		@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl02_id" )
		WebElement EmployerCodeLink ;
		
	/*	@FindBy(id="ctl00_HomePageContent_CtrlGrdDelPaymnt_ctl12_CtrlRdbtnSelect" )
		WebElement SelectRadioBtn ;
	*/	
		@FindBy(id="ctl00_HomePageContent_CtrlGrdDelPaymnt_ctl02_CtrlRdbtnSelect" )
		WebElement SelectRadioBtn ;//For Production
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtRmrk" )
		WebElement RemarksTxtBx ;
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnSubmit" )
		WebElement AOISubmitBtn ;
		
		@FindBy(id="ctl00_HomePageContent_CtrlLinkButton1" )
		WebElement CreateC18LetterLink ;
		
		@FindBy(id="ctl00_HomePageContent1_btnGeneratedButton" )
		WebElement LetterSubmitBtn ;
		
		@FindBy(id="ctl00_HomePageContent1_btnCancel" )
		WebElement LetterCancelBtn ;
		
		@FindBy(id="ctl00_HomePageContent_Submit" )
		WebElement CommonNoticeSubmitBtn ;
		
		@FindBy(id="ctl00_HomePageContent_Close" )
		WebElement CommonNoticeCancelBtn ;
		
		
		
		//View C-6 Register
		@FindBy(linkText="View C-6 Register" )
		WebElement ViewC6Register;
		
		@FindBy(id="ctl00_HomePageContent_txtemployerCode" )
		WebElement ViewC6EmployersCodeTxtBx;
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtBxFromDate" )
		WebElement ViewC6FromDate;
		
		@FindBy(id="ctl00_HomePageContent_calExtCtrlTxtBxFromDate_prevArrow" )
		WebElement SelectFromDatePreviousArrow;
		
		@FindBy(id="ctl00_HomePageContent_calExtCtrlTxtBxFromDate_day_1_4" )
		WebElement SelectFromDate;
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtBxToDate" )
		WebElement ViewC6ToDate;
		
		@FindBy(id="ctl00_HomePageContent_calExtCtrlTxtBxToDate_day_0_3" )
		WebElement SelectToDate;
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnView" )
		WebElement ViewC6PrintBtn;
		

		@FindBy(id="ctl00_HomePageContent1_CtrlBtnClose" )
		WebElement ViewC6CloseBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnView0" )
		WebElement ViewC6CancelBtn;
		
		
		//Dealing Assistant Task List
		@FindBy(linkText="Dealing Assistant Task List" )
		WebElement DealingAssistantTaskList;
		
		@FindBy(id="ctl00_HomePageContent_searchSelectPanel_1" )
		WebElement DealingEmployerCodeRadioBtn;
		
		@FindBy(id="ctl00_HomePageContent_txtEmpCode" )
		WebElement DealingEmployerCodeTxtBx;
		
		@FindBy(id="ctl00_HomePageContent_btnSubmit" )
		WebElement DealingEmployerCodeSearchBtn;
		
		@FindBy(id="ctl00_HomePageContent_btnCancel" )
		WebElement DealingAssistantCancelBtn;
		
		
		//Actions on Damage 
		@FindBy(linkText="Actions on Damage" )
		WebElement ActionsonDamage ;
		
		@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl02_id" )
		WebElement ActionsonDamageEmployerLink ;
		
		
		/*
		@FindBy(id="ctl00_HomePageContent_CtrlGrdDelPayment_ctl11_CtrlRdbtnSelect" )
		WebElement ActionsonDamageRadioBtn ;
		*/
		@FindBy(id="ctl00_HomePageContent_CtrlGrdDelPayment_ctl03_CtrlRdbtnSelect" ) //For Production
		WebElement ActionsonDamageRadioBtn ;
		
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtRmrk" )
		WebElement ActionsonDamageRemarksTxtBx;
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnSubmit" )
		WebElement ActionsonDamageNextBtn;
		
		@FindBy(id="ctl00_HomePageContent_CtrlLinkButton1" )
		WebElement CreateLetterLink;
		
		//Drop Defaulter Records
		@FindBy(linkText="Drop Defaulter Records" )
		WebElement DropDefaulterRecords ;
		
		@FindBy(id="ctl00_HomePageContent_txtEmployerCode" )
		WebElement DropDefaulterRecordsEmployerTxtBx ;
		
		@FindBy(id="ctl00_HomePageContent_ddlRecrdType" )//Defaulter Records
		WebElement DropDefaulterRecordsTypeSelectDrpDwn ;
		
		@FindBy(id="ctl00_HomePageContent_btnSubmit" )
		WebElement DropDefaulterRecordsSubmitBtn ;
		
		@FindBy(id="ctl00_HomePageContent_dataGrid_ctl02_CtrlCheck" )
		WebElement DropDefaulterRecordsCheckBox ;
		
		@FindBy(id="ctl00_HomePageContent_txtRemarks" )
		WebElement DropDefaulterRecordsRemarksTxtBx ;
		
		@FindBy(id="Button3" )
		WebElement DropDefaulterRecordsDropBtn ;
		
		@FindBy(id="ctl00_HomePageContent_btnCancel" )
		WebElement DropDefaulterRecordsCancelBtn ;
		
		
		//Initiate Recovery
		@FindBy(linkText="Initiate Recovery" )
		WebElement InitiateRecovery ;
		
		@FindBy(id="ctl00_HomePageContent_ddlActionTypeRec" )
		WebElement InitiateRecoveryDrpDwn ;
		
		@FindBy(id="ctl00_HomePageContent_GrdEmplDetails_ctl03_id" )
		WebElement InitiateRecoveryEmployerLink ;
		
		@FindBy(id="ctl00_HomePageContent_GridView1_ctl02_CtrlRdSel1" )
		WebElement InitiateRecoveryRadioBtn ;
		
		@FindBy(id="ctl00_HomePageContent_daPane_content_txtDARemarks" )
		WebElement InitiateRecoveryRemarksTxtBx ;
		
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnCancel" )
		WebElement CancelButton ;
		
		
		//Defaulter History
		@FindBy(linkText="Defaulter History" )
		WebElement DefaulterHistory ;
		
		@FindBy(id="ctl00_HomePageContent_searchSelectPanel_0" )
		WebElement HistoryEmployerCodeRadioBtn ;
		
		@FindBy(id="ctl00_HomePageContent_CtrlTxtEmprCode" )
		WebElement HistoryEmployerCodeTxtBx ;
		
		@FindBy(id="ctl00_HomePageContent_CtrlBtnSearch" )
		WebElement HistoryEmployerCodeSearchBtn ;
		
		@FindBy(id="ctl00_HomePageContent_CtrlGrdActnHistry_ctl03_Hlink_view_hist" )
		WebElement ViewLetterBtn ;
		
		//
		@FindBy(linkText="Manual Payment Migration" )
		WebElement ManualPaymentMigration ;
		
		//AOD REports
		@FindBy(linkText="AOD Reports" )
		WebElement AODReports ;
		
		@FindBy(id="ctl00_HomePageContent_rdbtnopt_0" )
		WebElement AODReportsRadioBtn1 ;
		
		@FindBy(id="ctl00_HomePageContent_rdbtnopt_1" )
		WebElement AODReportsRadioBtn2 ;
		
		@FindBy(id="ctl00_HomePageContent_rdbtnopt_2" )
		WebElement AODReportsRadioBtn3 ;
		
		@FindBy(id="ctl00_HomePageContent_btnPdf" )
		WebElement AODReportsPDFBtn ;
		
		
		 public WebElement  Close(){
				return  Close;
			}
		
		 public WebElement  Revenue(){
				return  Revenue;
			}
		 
		 public WebElement  ActionOnDefaulter(){
				return  ActionOnDefaulter;
		 }
		 
		 public WebElement  EmployerCodeRadioBtn(){
				return  EmployerCodeRadioBtn;
		 }
		 
		 public WebElement  FromEmployerCodeTxtBx(){
				return  FromEmployerCodeTxtBx;
		 }
		 
		 public WebElement  ToEmployerCodeTxtBx(){
				return  ToEmployerCodeTxtBx;
		 }
		 
		 public WebElement  EmployerCodeSearchBtn(){
				return  EmployerCodeSearchBtn;
		 }
		 
		 //Monthly Defaulters
		 public WebElement  MonthlyDefaulters(){
				return  MonthlyDefaulters;
		 }
		 
		 public WebElement  MonthlyDefaultersLink(){
				return  MonthlyDefaultersLink;
		 }
		 
		 public WebElement  MonthlyDefaultersAction(){
				return  MonthlyDefaultersAction;
		 }
		 
		 public WebElement  MonthlyDefaultersRemarks(){
				return  MonthlyDefaultersRemarks;
		 }
		 
		 public WebElement  MonthlyDefaultersSubmitBtn(){
				return  MonthlyDefaultersSubmitBtn;
		 }
		 
		 //Defaulter List
		 public WebElement  DefaulterList(){
				return  DefaulterList;
		 }
		 
		 public WebElement  DefaulterLink(){
				return  DefaulterLink;
		 }
		 
		 public WebElement  DefaulterPendingAction(){
				return  DefaulterPendingAction;
		 }
		 
		 public WebElement  DefaulterPendingActionSearchBtn(){
				return  DefaulterPendingActionSearchBtn;
		 }
		 
		 public WebElement  C18AdhocRadioBtn(){
				return  C18AdhocRadioBtn;
		 }
		 
		 public WebElement  C18ActualRadioBtn(){
				return  C18ActualRadioBtn;
		 }
		 
		 
		 public WebElement  HearingDate(){
				return  HearingDate;
		 }
		 
		 public WebElement  HearingDateNextArrow(){
				return  HearingDateNextArrow;
		 }
		 
		 public WebElement  SelectHearingDate(){
				return  SelectHearingDate;
		 }
		 
		 public WebElement  DefaulterActionRemarks(){
				return  DefaulterActionRemarks;
		 }
		 
		 public WebElement  DefaulterActionNextBtn(){
				return  DefaulterActionNextBtn;
		 }
		 
		 public WebElement  DefaulterActionCancelBtn(){
				return  DefaulterActionCancelBtn;
		 }
		 
		 //For C-18 Adhoc
		 public WebElement  NoOfEmployeRadioBtn(){
				return  NoOfEmployeRadioBtn;
		 }
		 
		 public WebElement  NoOfEmployeOthersRadioBtn(){
				return  NoOfEmployeOthersRadioBtn;
		 }
		 
		 public WebElement  NoOfEmployeOthersTextBx(){
				return  NoOfEmployeOthersTextBx;
		 }
		 
		 public WebElement  AssumedWagesRadioBtn(){
				return  AssumedWagesRadioBtn;
		 }
		 
		 public WebElement  AssumedWagesOthersRadioBtn(){
				return  AssumedWagesOthersRadioBtn;
		 }
		 
		 public WebElement  AssumedWagesOthersTextBx(){
				return  AssumedWagesOthersTextBx;
		 }
		 
		 public WebElement  ComputeBtn(){
				return  ComputeBtn;
		 }
		 
		 public WebElement  C18AdhocSubmitBtn(){
				return  C18AdhocSubmitBtn;
		 }
		 
		 
		 //Show Cause Notice Prosecution Sanction memo
		 public WebElement  ShowCauseNoticeProsecutionSanctionmemo(){
				return  ShowCauseNoticeProsecutionSanctionmemo;
		 }
		 
		 public WebElement  ShowCauseNoticeActionType(){
				return  ShowCauseNoticeActionType;
		 }
		 
		 public WebElement  SCNEmployerLink(){
				return  SCNEmployerLink;
		 }
		 
		 public WebElement  SCNDefaulterRadioBtn(){
				return  SCNDefaulterRadioBtn;
		 }
		 
		 public WebElement  SCNRemarksTxtBx(){
				return  SCNRemarksTxtBx;
		 }
		 
		 public WebElement  SCNNextBtn(){
				return  SCNNextBtn;
		 }
		 
		 public WebElement  SCNLetterLink(){
				return  SCNLetterLink;
		 }
		 
		 
		 
		 //Actions of Interest
		 public WebElement  ActionsOnInterest(){
				return  ActionsOnInterest;
		 }
		 
		 public WebElement  EmployerCodeLink(){
				return  EmployerCodeLink;
		 }
		 
		 public WebElement  SelectRadioBtn(){
				return  SelectRadioBtn;
		 }
		 
		 public WebElement  RemarksTxtBx(){
				return  RemarksTxtBx;
		 }
		 
		 public WebElement  AOISubmitBtn(){
				return  AOISubmitBtn;
		 }
		 
		 public WebElement  CreateC18LetterLink(){
				return  CreateC18LetterLink;
		 }
		 
		 public WebElement  LetterSubmitBtn(){
				return  LetterSubmitBtn;
		 }
		 
		 public WebElement  LetterCancelBtn(){
				return  LetterCancelBtn;
		 }
		 
		 public WebElement  CommonNoticeSubmitBtn(){
				return  CommonNoticeSubmitBtn;
		 }
		 
		 public WebElement  CommonNoticeCancelBtn(){
				return  CommonNoticeCancelBtn;
		 }
		 
		 public WebElement  ViewC6Register(){
				return  ViewC6Register;
		 }
		 
		 public WebElement  ViewC6EmployersCodeTxtBx(){
				return  ViewC6EmployersCodeTxtBx;
		 }
		 
		 public WebElement  ViewC6FromDate(){
				return  ViewC6FromDate;
		 }
		 
		 public WebElement  SelectFromDate(){
				return  SelectFromDate;
		 }
		 
		 public WebElement  SelectFromDatePreviousArrow(){
				return  SelectFromDatePreviousArrow;
		 }
		 
		 public WebElement  ViewC6ToDate(){
				return  ViewC6ToDate;
		 }
		 
		 public WebElement  SelectToDate(){
				return  SelectToDate;
		 }
		 
		 public WebElement  ViewC6PrintBtn(){
				return  ViewC6PrintBtn;
		 }
		 
		 public WebElement  ViewC6CloseBtn(){
				return  ViewC6CloseBtn;
		 }
		 
		 public WebElement  ViewC6CancelBtn(){
				return  ViewC6CancelBtn;
		 }
		 
		 public WebElement  DealingAssistantTaskList(){
				return  DealingAssistantTaskList;
		 }
		 
		 public WebElement  DealingEmployerCodeRadioBtn(){
				return  DealingEmployerCodeRadioBtn;
		 }
		 
		 public WebElement  DealingEmployerCodeTxtBx(){
				return  DealingEmployerCodeTxtBx;
		 }
		 
		 public WebElement  DealingEmployerCodeSearchBtn(){
				return  DealingEmployerCodeSearchBtn;
		 }
		 
		 public WebElement  DealingAssistantCancelBtn(){
				return  DealingAssistantCancelBtn;
		 }
		 
		 //Actions On Damage
		 public WebElement  ActionsonDamage(){
				return  ActionsonDamage;
		 }
		 
		 public WebElement  ActionsonDamageEmployerLink(){
				return  ActionsonDamageEmployerLink;
		 }
		 
		 public WebElement  ActionsonDamageRadioBtn(){
				return  ActionsonDamageRadioBtn;
		 }
		 
		 public WebElement  ActionsonDamageRemarksTxtBx(){
				return  ActionsonDamageRemarksTxtBx;
		 }
		 
		 public WebElement  ActionsonDamageNextBtn(){
				return  ActionsonDamageNextBtn;
		 }
		 
		 public WebElement  CreateLetterLink(){
				return  CreateLetterLink;
		 }
		 
		 
		 
		 //Drop Defaulter Record
		 public WebElement  DropDefaulterRecords(){
				return  DropDefaulterRecords;
		 }
		 
		 public WebElement  DropDefaulterRecordsEmployerTxtBx(){
				return  DropDefaulterRecordsEmployerTxtBx;
		 }
		 
		 public WebElement  DropDefaulterRecordsTypeSelectDrpDwn(){
				return  DropDefaulterRecordsTypeSelectDrpDwn;
		 }
		 
		 public WebElement  DropDefaulterRecordsSubmitBtn(){
				return  DropDefaulterRecordsSubmitBtn;
		 }
		 
		 public WebElement  DropDefaulterRecordsCheckBox(){
				return  DropDefaulterRecordsCheckBox;
		 }
		 
		 public WebElement  DropDefaulterRecordsRemarksTxtBx(){
				return  DropDefaulterRecordsRemarksTxtBx;
		 }
		 
		 public WebElement  DropDefaulterRecordsDropBtn(){
				return  DropDefaulterRecordsDropBtn;
		 }
		 
		 public WebElement  DropDefaulterRecordsCancelBtn(){
				return  DropDefaulterRecordsCancelBtn;
		 }
		 
		 //Initiate Recover
		 public WebElement  InitiateRecovery(){
				return  InitiateRecovery;
		 }
		 
		 public WebElement  InitiateRecoveryDrpDwn(){
				return  InitiateRecoveryDrpDwn;
		 }
		 
		 public WebElement  InitiateRecoveryEmployerLink(){
				return  InitiateRecoveryEmployerLink;
		 }
		 
		 public WebElement  InitiateRecoveryRadioBtn(){
				return  InitiateRecoveryRadioBtn;
		 }
		 public WebElement  InitiateRecoveryRemarksTxtBx(){
				return  InitiateRecoveryRemarksTxtBx;
		 }
		 
		 public WebElement  CancelButton(){
				return  CancelButton;
		 }
		 
		 
		//Defaulter History 
		 
		 public WebElement  DefaulterHistory(){
				return  DefaulterHistory;
		 }
		 
		 public WebElement  HistoryEmployerCodeRadioBtn(){
				return  HistoryEmployerCodeRadioBtn;
		 }

		 public WebElement  HistoryEmployerCodeTxtBx(){
				return  HistoryEmployerCodeTxtBx;
		 }

		 public WebElement  HistoryEmployerCodeSearchBtn(){
				return  HistoryEmployerCodeSearchBtn;
		 }
		 
		 public WebElement  ViewLetterBtn(){
				return  ViewLetterBtn;
		 }


		 
		 //Manual Payment Migration
		 public WebElement  ManualPaymentMigration(){
				return  ManualPaymentMigration;
		 }
		 
		 //AOD Reports
		 public WebElement  AODReports(){
				return  AODReports;
		 }

		 public WebElement  AODReportsRadioBtn1(){
				return  AODReportsRadioBtn1;
		 }

		 public WebElement  AODReportsRadioBtn2(){
				return  AODReportsRadioBtn2;
		 }

		 public WebElement  AODReportsRadioBtn3(){
				return  AODReportsRadioBtn3;
		 }

		 public WebElement  AODReportsPDFBtn(){
				return  AODReportsPDFBtn;
		 }


}
