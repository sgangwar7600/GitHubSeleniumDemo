package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDBClaimProcessingPage {

	WebDriver driver;

	public PDBClaimProcessingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="Permanent Disablement Benefit Claim Processing")
	WebElement PDBClaimProcessingLink;
	
	@FindBy(xpath =".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td[2]/a")
	WebElement Page2;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl08_taskLink")
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl08_taskLink")
	WebElement AssignedTaskIdBM;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;
	
	@FindBy(id ="ctl00_HomePageContent_txtremarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_btnSubmit")
	WebElement SubmitToBM;
	
	@FindBy(id ="ctl00_HomePageContent_approve")
	WebElement BMApproveBtn;
	
	
	@FindBy(id ="ctl00_HomePageContent_btnCancel")
	WebElement CancelBtn;
	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement BMApproveBtn() {
		return BMApproveBtn;
	}
	
	public WebElement PDBClaimProcessingLink() {
		return PDBClaimProcessingLink;
	}

	public WebElement Page2() {
		return Page2;
	}

	public WebElement AssignedTaskId() {
		return AssignedTaskId;
	}
	
	public WebElement AssignedTaskIdBM() {
		return AssignedTaskIdBM;
	}
	
	public WebElement NextBtn() {
		return NextBtn;
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

	
	//BBO  Login
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl04_taskLink")
	WebElement AssignedTaskIdBBO;
	
	@FindBy(id ="ctl00_HomePageContent_ctrltxtRemarks")
	WebElement RemarksTxtBxBBO;
	
	@FindBy(id ="ctl00_HomePageContent_reject")
	WebElement RejectBtn;
	
	@FindBy(id ="ctl00_HomePageContent_approve")
	WebElement ApproveBtnBBO;
	
	public WebElement AssignedTaskIdBBO() {
		return AssignedTaskIdBBO;
	}
		
	public WebElement RemarksTxtBxBBO() {
		return RemarksTxtBxBBO;
	}
	
	public WebElement RejectBtn() {
		return RejectBtn;
	}
	
	public WebElement ApproveBtnBBO() {
		return ApproveBtnBBO;
	}

	
	//BM Login Claim Processing
	
	
	/*@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl04_taskLink")//For Production
	WebElement AssignedTaskIdClaim;
	*/
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl13_taskLink")
	WebElement AssignedTaskIdClaim;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtnClaim;

	
	@FindBy(id ="ctl00_HomePageContent_txtremarks")
	WebElement RemarksTxtBxClaim;
	
	@FindBy(id ="ctl00_HomePageContent_reject")
	WebElement ClaimRejectBtn;
	
	@FindBy(id ="ctl00_HomePageContent_approve")
	WebElement ApproveBtn;
	
	@FindBy(id ="ctl00_HomePageContent_cancel")
	WebElement ClaimCancelBtn;
	


	public WebElement AssignedTaskIdClaim() {
		return AssignedTaskIdClaim;
	}
	
	public WebElement NextBtnClaim() {
		return NextBtnClaim;
	}
	
	public WebElement RemarksTxtBxClaim() {
		return RemarksTxtBxClaim;
	}
	
	public WebElement ClaimRejectBtn() {
		return ClaimRejectBtn;
	}
	
	public WebElement ApproveBtn() {
		return ApproveBtn;
	}
	
	public WebElement ClaimCancelBtn() {
		return ClaimCancelBtn;
	}

}
