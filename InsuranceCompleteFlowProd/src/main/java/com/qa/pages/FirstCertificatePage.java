package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstCertificatePage {
	
	WebDriver driver;

	public FirstCertificatePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Upload Certificates")
	WebElement UploadCertificates;
	
	@FindBy(id ="ctl00_HomePageContent_HyperLink1")
	WebElement UploadIMOIMPCertificate;

	@FindBy(id ="ctl00_HomePageContent_txtipnumber")
	WebElement IPNoTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_rbtncertificateissued_0")
	WebElement IMORadioBtn;
	
	@FindBy(id ="ctl00_HomePageContent_rbtncertificateissued_1")
	WebElement IMPRadioBtn;
	
	@FindBy(id ="ctl00_HomePageContent_rbtncertificatefor_0")
	WebElement NewSpellRadioBtn;

	@FindBy(id ="ctl00_HomePageContent_rbtncertificatefor_1")
	WebElement ContinuationOfPreviousSell;

	@FindBy(id ="ctl00_HomePageContent_chboxspecialcertificate")
	WebElement SpecialIntermediateChkBx;



	@FindBy(id ="ctl00_HomePageContent_btnSubmit")
	WebElement SubmitBtn;
	
	@FindBy(id ="ctl00_HomePageContent_txtDiagnosis")
	WebElement DiagnosisTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_txtMedOfficerName")
	WebElement MedicalOfficerName;
	
	@FindBy(id ="ctl00_HomePageContent_txtdispLocation")
	WebElement DispensaryLocation;
	
	@FindBy(id ="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitButton;
	
	@FindBy(id ="ctl00_HomePageContent_cancel")
	WebElement CancelBtn;
	
	@FindBy(id ="ctl00_HomePageContent_chboxFitnessDate")
	WebElement FitnessDate;
	
	@FindBy(id ="ctl00_HomePageContent_chboxisCertissued")
	WebElement CertificateIssueDate;
	
	@FindBy(id ="ctl00_HomePageContent_CalendarExtender2_day_2_4")
	WebElement SelectDateOfExamination;
	
/*	@FindBy(id ="ctl00_HomePageContent_txtNxtVisitDate")
	WebElement DateOfNextVisit;
	
	@FindBy(id ="ctl00_HomePageContent_CalendarExtender4_prevArrow")
	WebElement DateOfNextVisitPrevarrow;
	
	@FindBy(id ="ctl00_HomePageContent_CalendarExtender4_day_3_0")
	WebElement SelectDateOfNextVisit;
	
	@FindBy(id ="ctl00_HomePageContent_txtBODate")
	WebElement BODate;
	
	@FindBy(id ="ctl00_HomePageContent_CalendarExtender4_prevArrow")
	WebElement DateOfNextVisitPrevarrow;
	
	@FindBy(id ="ctl00_HomePageContent_CalendarExtender4_day_3_0")
	WebElement SelectDateOfNextVisit;
*/	
	public WebElement UploadCertificates() {
		return UploadCertificates;
	}
	
	public WebElement UploadIMOIMPCertificate() {
		return UploadIMOIMPCertificate;
	}
	
	public WebElement IPNoTxtBx() {
		return IPNoTxtBx;
	}
	
	public WebElement IMORadioBtn() {
		return IMORadioBtn;
	}
	
	public WebElement IMPRadioBtn() {
		return IMPRadioBtn;
	}
	
	public WebElement NewSpellRadioBtn() {
		return NewSpellRadioBtn;
	}
	
	public WebElement ContinuationOfPreviousSell() {
		return ContinuationOfPreviousSell;
	}
	
	public WebElement SpecialIntermediateChkBx() {
		return SpecialIntermediateChkBx;
	}
	
	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement DiagnosisTxtBx() {
		return DiagnosisTxtBx;
	}
	
	public WebElement MedicalOfficerName() {
		return MedicalOfficerName;
	}
	
	public WebElement DispensaryLocation() {
		return DispensaryLocation;
	}
	
	public WebElement RemarksTxtBx() {
		return RemarksTxtBx;
	}
	
	public WebElement SubmitButton() {
		return SubmitButton;
	}
	
	public WebElement CancelBtn() {
		return CancelBtn;
	}
	
	public WebElement FitnessDate() {
		return FitnessDate;
	}
	
	public WebElement CertificateIssueDate() {
		return CertificateIssueDate;
	}
	
/*	public WebElement SelectDateOfExamination() {
		return SelectDateOfExamination;
	}
	
*/	
	
	//EnSB
	
		@FindBy(id="ctl00_HomePageContent_chk_diag")
		WebElement EnSbChkBx;
		
		@FindBy(id="ctl00_HomePageContent_chboxFitnessDate")
		WebElement DateOfFitnessChkBx;
		
		public WebElement EnSbChkBx(){
			return EnSbChkBx;
		}
		
		public WebElement DateOfFitnessChkBx(){
			return DateOfFitnessChkBx;
		}
}
