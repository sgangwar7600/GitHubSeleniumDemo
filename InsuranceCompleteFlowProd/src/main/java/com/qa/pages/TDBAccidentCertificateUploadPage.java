package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TDBAccidentCertificateUploadPage {
	WebDriver driver;

	public TDBAccidentCertificateUploadPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Upload Certificates")
	WebElement UploadCertificates;
	
	@FindBy(id ="ctl00_HomePageContent_lnkAcc")
	WebElement UploadAccidentReport ;
	
	@FindBy(id ="ctl00_HomePageContent_txtIpNo")
	WebElement IPNoTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_Submit")
	WebElement SubmitBtn ;
	
	@FindBy(id ="ctl00_HomePageContent_ddlEmprCode")
	WebElement EmployerCodeDrpDwn ;
	
	@FindBy(id ="ctl00_HomePageContent_txtoccupationOfIp")
	WebElement OccupationOfIp ;
	
	@FindBy(id ="ctl00_HomePageContent_txtDepartment")
	WebElement DepartmentTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_btn_next")
	WebElement NextBtn ;

	@FindBy(id ="ctl00_HomePageContent_txtplaceOfAccdnt")
	WebElement PlaceOfAccident ;

	@FindBy(id ="ctl00_HomePageContent_ddlShifthrs")
	WebElement ShiftHoursFrom ;
	
	@FindBy(id ="ctl00_HomePageContent_ddlShifthrs1")
	WebElement ShiftHoursTo ;

	@FindBy(id ="ctl00_HomePageContent_rbtnShift1_1")
	WebElement ToPMRadioBtn ;
	
	@FindBy(id ="ctl00_HomePageContent_ddlStartHour")
	WebElement DayHourOfAccident ;
	
	@FindBy(id ="ctl00_HomePageContent_ddlHours")
	WebElement TimeOfAccident ;
	
	@FindBy(id ="ctl00_HomePageContent_rbtnTime_1")
	WebElement TimeOfAccidentPMRadioBtn ;
	
	@FindBy(id ="ctl00_HomePageContent_txtnatureOfInjury")
	WebElement NatureOfInjury ;

	@FindBy(id ="ctl00_HomePageContent_txtlocationOfInjury")
	WebElement LocationOfInjury ;
	
	@FindBy(id ="ctl00_HomePageContent_txtAccdntAddress")
	WebElement AccidentAddress ;
	
	@FindBy(id ="ctl00_HomePageContent_txtemergencyNature")
	WebElement NatureOfAccident ;
	
	@FindBy(id ="ctl00_HomePageContent_txtdispensarySelected")
	WebElement DispensaryTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtwitness1")
	WebElement WitnessNameTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtwitnessAddress1")
	WebElement WitnessAddressTxtBx ;

	@FindBy(id ="ctl00_HomePageContent_txtwitness2")
	WebElement WitnessNameTxtBx2 ;
	
	@FindBy(id ="ctl00_HomePageContent_txtwitnessAddress2")
	WebElement WitnessAddressTxtBx2 ;
	
	@FindBy(id ="ctl00_HomePageContent_txtworkBeingDone")
	WebElement WorkBeingDoneTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtOfficerName")
	WebElement PersonSubmittingReport ;
	
	@FindBy(id ="ctl00_HomePageContent_txtOfficerDesgn")
	WebElement OfficerDesignation ;
	
	@FindBy(id ="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtbriefDes")
	WebElement BriefDesc ;
	
	@FindBy(id ="ctl00_HomePageContent_CheckBox1")
	WebElement DeclarationChkBx ;

	@FindBy(id ="ctl00_HomePageContent_btnSubmit")
	WebElement FormSubmitBtn ;
	
	@FindBy(id ="ctl00_HomePageContent_Button1")
	WebElement FormCancelBtn ;
	
	
	
	public WebElement UploadCertificates() {
		return UploadCertificates;
	}
	
	public WebElement UploadAccidentReport() {
		return UploadAccidentReport;
	}
	
	public WebElement IPNoTxtBx() {
		return IPNoTxtBx;
	}
	
	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement EmployerCodeDrpDwn() {
		return EmployerCodeDrpDwn;
	}
	
	public WebElement OccupationOfIp() {
		return OccupationOfIp;
	}
	
	public WebElement DepartmentTxtBx() {
		return DepartmentTxtBx;
	}
	
	public WebElement NextBtn() {
		return NextBtn;
	}
	
	public WebElement PlaceOfAccident() {
		return PlaceOfAccident;
	}
	
	public WebElement ShiftHoursFrom() {
		return ShiftHoursFrom;
	}
	
	public WebElement ShiftHoursTo() {
		return ShiftHoursTo;
	}
	
	public WebElement ToPMRadioBtn() {
		return ToPMRadioBtn;
	}
	
	public WebElement DayHourOfAccident() {
		return DayHourOfAccident;
	}
	
	public WebElement TimeOfAccident() {
		return TimeOfAccident;
	}
	
	public WebElement TimeOfAccidentPMRadioBtn() {
		return TimeOfAccidentPMRadioBtn;
	}
	
	public WebElement NatureOfInjury() {
		return NatureOfInjury;
	}
	
	public WebElement LocationOfInjury() {
		return LocationOfInjury;
	}
	
	public WebElement AccidentAddress() {
		return AccidentAddress;
	}
	
	public WebElement NatureOfAccident() {
		return NatureOfAccident;
	}
	
	public WebElement DispensaryTxtBx() {
		return DispensaryTxtBx;
	}
	
	public WebElement WitnessNameTxtBx() {
		return WitnessNameTxtBx;
	}
	
	public WebElement WitnessAddressTxtBx() {
		return WitnessAddressTxtBx;
	}
	
	public WebElement WitnessNameTxtBx2() {
		return WitnessNameTxtBx2;
	}
	
	public WebElement WitnessAddressTxtBx2() {
		return WitnessAddressTxtBx2;
	}
	
	public WebElement WorkBeingDoneTxtBx() {
		return WorkBeingDoneTxtBx;
	}
	
	public WebElement PersonSubmittingReport() {
		return PersonSubmittingReport;
	}
	
	
	public WebElement OfficerDesignation() {
		return OfficerDesignation;
	}
	
	public WebElement RemarksTxtBx() {
		return RemarksTxtBx;
	}
	
	public WebElement BriefDesc() {
		return BriefDesc;
	}
	
	public WebElement DeclarationChkBx() {
		return DeclarationChkBx;
	}
	
	public WebElement FormSubmitBtn() {
		return FormSubmitBtn;
	}
	
	public WebElement FormCancelBtn() {
		return FormCancelBtn;
	}
	
	
	
}
