package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDBClaimPage {

	WebDriver driver;

	public PDBClaimPage (WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	//Periodical Claim and Commutation Claim
	@FindBy(id="ctl00_HomePageContent_Submit")
	WebElement Submit;
	
	
	@FindBy(id="ctl00_HomePageContent_File_Certificate")
	WebElement Browse;
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement Submit1;
	
	@FindBy(id="ctl00_HomePageContent_cancel")
	WebElement Cancel;
	
	public WebElement Submit(){
		return Submit;
	}
	
	public WebElement  Browse(){
		return  Browse;
	}
	
	public WebElement Submit1(){
		return Submit1;
	}
	
	public WebElement Cancel(){
		return Cancel;
	}
	
	
	//BO Login
	
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="Permanent Disablement Benefit Request Processing") //For Production
	WebElement PDBRequestProcessingLink;
	
	@FindBy(xpath =".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td[2]/a")
	WebElement Page2;
	
	/*@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl04_taskLink")
	WebElement AssignedTaskId;
	*/
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;

	
	@FindBy(id ="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_timebared")
	WebElement BrowseBtn;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitToBM;
	
	@FindBy(id ="ctl00_HomePageContent_cancel")
	WebElement CancelBtn;
	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement PDBRequestProcessingLink() {
		return PDBRequestProcessingLink;
	}

	public WebElement Page2() {
		return Page2;
	}

	public WebElement AssignedTaskId() {
		return AssignedTaskId;
	}
	
	public WebElement NextBtn() {
		return NextBtn;
	}
	
	public WebElement RemarksTxtBx() {
		return RemarksTxtBx;
	}
	
	public WebElement BrowseBtn() {
		return BrowseBtn;
	}
	
	public WebElement SubmitToBM() {
		return SubmitToBM;
	}
	
	public WebElement CancelBtn() {
		return CancelBtn;
	}

	//BBO  Login
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl05_taskLink")
	WebElement AssignedTaskIdBBO;
	
	@FindBy(id ="ctl00_HomePageContent_ctrltxtRemarks")
	WebElement RemarksTxtBxBBO;
	
	@FindBy(id ="ctl00_HomePageContent_reject")
	WebElement RejectBtn;
	
	public WebElement AssignedTaskIdBBO() {
		return AssignedTaskIdBBO;
	}
		
	public WebElement RemarksTxtBxBBO() {
		return RemarksTxtBxBBO;
	}
	
	public WebElement RejectBtn() {
		return RejectBtn;
	}

	
	//BM Login Claim Processing
	
	
	
	@FindBy(partialLinkText ="Permanent Disablement Benefit Claim Processing") 
	WebElement PDBClaimProcessingLink;
	
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
	
	public WebElement PDBClaimProcessingLink() {
		return PDBClaimProcessingLink;
	}

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
