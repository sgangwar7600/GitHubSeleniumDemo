package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfinementClaimProcessingPage {
	WebDriver driver;

	public ConfinementClaimProcessingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="ctl00_HomePageContent_txtconfdate")
	WebElement ConfinementDate;
	
	@FindBy(id="ctl00_HomePageContent_txtconfloc")
	WebElement ConfinemetLocation;
	
	@FindBy(id="ctl00_HomePageContent_MyFile")
	WebElement BrowseBtn;
	
	@FindBy(id="ctl00_HomePageContent_lnkCreateAcknowledgement1")
	WebElement CreateAcknowledgement;
	
	@FindBy(id="ctl00_HomePageContent_lnkSelectAck")
	WebElement SelectAcknowledgement;
	
	@FindBy(id="ctl00_HomePageContent_Submit1")
	WebElement AcknowledgementSubmitBtn;

	@FindBy(id="ctl00_HomePageContent_ddlClaimType")
	WebElement ClaimType;
	
	@FindBy(id="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement GenerateAcknowledgementBtn;
	
	@FindBy(id="ctl00_HomePageContent_btnCancel")
	WebElement BackBtn;
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement SubmitBtn;
	
	@FindBy(id="ctl00_HomePageContent_print")
	WebElement ResetBtn;
	
	@FindBy(id="ctl00_HomePageContent_cancel")
	WebElement CloseBtn;
	
	
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="Confinement Claim Processing")
	WebElement ConfinemetClaimProcessingLink;
	
	
	//Process a claim
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;
	
	@FindBy(id ="next")
	WebElement NextBtn2;
	
	@FindBy(id ="ctl00_HomePageContent_txtremarks")
	WebElement Remarks2TxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitToBM;
	
	@FindBy(id ="ctl00_HomePageContent_btnCancel")
	WebElement CancelBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnApprove")
	WebElement BMApproveBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnReject")
	WebElement BMRejectBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnRest")
	WebElement BMResetBtn;
	
	
	public WebElement ConfinementDate() {
		return ConfinementDate;
	}
	
	public WebElement ConfinemetLocation() {
		return ConfinemetLocation;
	}
	
	public WebElement BrowseBtn() {
		return BrowseBtn;
	}
	
	public WebElement CreateAcknowledgement() {
		return CreateAcknowledgement;
	}
	
	public WebElement SelectAcknowledgement() {
		return SelectAcknowledgement;
	}
	
	public WebElement AcknowledgementSubmitBtn() {
		return AcknowledgementSubmitBtn;
	}
	
	public WebElement ClaimType() {
		return ClaimType;
	}
	
	public WebElement RemarksTxtBx() {
		return RemarksTxtBx;
	}
	
	public WebElement GenerateAcknowledgementBtn() {
		return GenerateAcknowledgementBtn;
	}
	
	public WebElement BackBtn() {
		return BackBtn;
	}
	
	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement ResetBtn() {
		return ResetBtn;
	}

	public WebElement CloseBtn() {
		return CloseBtn;
	}

	//Process Claim
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement ConfinemetClaimProcessingLink() {
		return ConfinemetClaimProcessingLink;
	}

	public WebElement NextBtn() {
		return NextBtn;
	}
	
	public WebElement NextBtn2() {
		return NextBtn2;
	}
	
	public WebElement Remarks2TxtBx() {
		return Remarks2TxtBx;
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
	
	
	
}
