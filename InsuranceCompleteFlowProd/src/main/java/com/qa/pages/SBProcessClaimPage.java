package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SBProcessClaimPage {
	WebDriver driver;

	public SBProcessClaimPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;

	@FindBy(partialLinkText ="Sickness Benefit Claim Processing")
	WebElement SBClaimProcessingLink;
	

	@FindBy(partialLinkText ="Extended Sickness Benefit Claim Processing")
	WebElement ESBClaimProcessingLink;
	
	
	@FindBy(xpath =".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td[2]/a")
	WebElement Page2;
	
	@FindBy(xpath =".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td[3]/a")
	WebElement Page3;
	
/*	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl05_taskLink")
	WebElement AssignedTaskId;
*/	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl03_taskLink")
	WebElement AssignedTaskIdForBM;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")//For Production
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;
	
	@FindBy(id ="next")
	WebElement NextBtn2;
	
	@FindBy(id ="ctl00_HomePageContent_txtremarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_btnSubmit")
	WebElement SubmitToBM;
	
	@FindBy(id ="ctl00_HomePageContent_btnCancel")
	WebElement CancelBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnApprove")
	WebElement BMApproveBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnReject")
	WebElement BMRejectBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnRest")
	WebElement BMResetBtn;
	
	
	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement SBClaimProcessingLink() {
		return SBClaimProcessingLink;
	}
	
	public WebElement ESBClaimProcessingLink() {
		return ESBClaimProcessingLink;
	}

	public WebElement Page2() {
		return Page2;
	}
	
	public WebElement Page3() {
		return Page3;
	}

	public WebElement AssignedTaskId() {
		return AssignedTaskId;
	}
	
	public WebElement AssignedTaskIdForBM() {
		return AssignedTaskIdForBM;
	}
	
	public WebElement NextBtn() {
		return NextBtn;
	}
	
	public WebElement NextBtn2() {
		return NextBtn2;
	}
	
	public WebElement RemarksTxtBx() {
		return RemarksTxtBx;
	}
	
	public WebElement SubmitToBM() {
		return SubmitToBM;
	}
	
	public WebElement CancelBtn() {
		return CancelBtn;
	}
	
	public WebElement BMApproveBtn() {
		return BMApproveBtn;
	}
	
	public WebElement BMRejectBtn() {
		return BMRejectBtn;
	}
	
	public WebElement BMResetBtn() {
		return BMResetBtn;
	}
	

	//Extended ESB
	@FindBy(id ="ctl00_HomePageContent_LinkESBExtend")
	WebElement ExtendEsb;
	
	@FindBy(partialLinkText ="SB / TDB (ESB)")
	WebElement ESBClaimProcessingLinkMRLogin;
	
	@FindBy(id ="ctl00_HomePageContent_RadioButtonList1_0")
	WebElement SBRadioBtn;
	
	@FindBy(id ="ctl00_HomePageContent_RadioButtonList1_1")
	WebElement ESBRadioBtn;
	
	@FindBy(id ="ctl00_HomePageContent_LinkESBInitiate")
	WebElement MRReferenceLink;
	
	@FindBy(id ="ctl00_HomePageContent_chkApprove")
	WebElement MRApproveChkBx;
	
	@FindBy(id ="ctl00_HomePageContent_ddlDisease")
	WebElement NatureOfDisease;
	

	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement MRSubmitBtn;
	
	@FindBy(id ="ctl00_HomePageContent_Reject")
	WebElement MRRejectBtn;
	
	@FindBy(id ="ctl00_HomePageContent_LinkViewMed8")
	WebElement ViewMed8Details;
	
	@FindBy(xpath =".//*[@id='tblUser']/tbody/tr/td/input")
	WebElement CloseBtn;
	
	@FindBy(id ="ctl00_HomePageContent_approve")
	WebElement BMAppproveBtn;
	

	@FindBy(id ="ctl00_HomePageContent_btnAttach")
	WebElement AttachRateCardBtn;
	
	public WebElement AttachRateCardBtn() {
		return AttachRateCardBtn;
	}
	
	public WebElement BMAppproveBtn() {
		return BMAppproveBtn;
	}
	
	public WebElement CloseBtn() {
		return CloseBtn;
	}
	
	
	public WebElement ViewMed8Details() {
		return ViewMed8Details;
	}
	
	public WebElement MRApproveChkBx() {
		return MRApproveChkBx;
	}
	
	public WebElement MRReferenceLink() {
		return MRReferenceLink;
	}
	
	public WebElement NatureOfDisease() {
		return NatureOfDisease;
	}
	
	public WebElement MRSubmitBtn() {
		return MRSubmitBtn;
	}
	
	public WebElement MRRejectBtn() {
		return MRRejectBtn;
	}
	
	public WebElement ExtendEsb() {
		return ExtendEsb;
	}
	
	public WebElement ESBClaimProcessingLinkMRLogin() {
		return ESBClaimProcessingLinkMRLogin;
	}
	
	public WebElement SBRadioBtn() {
		return SBRadioBtn;
	}
	
	public WebElement ESBRadioBtn() {
		return ESBRadioBtn;
	}
	
}
