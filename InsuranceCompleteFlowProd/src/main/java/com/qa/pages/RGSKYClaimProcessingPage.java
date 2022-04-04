package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RGSKYClaimProcessingPage {
	WebDriver driver;

	public RGSKYClaimProcessingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="RGSKY Claim Processing")
	WebElement RGSKYClaimProcessingLink;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl04_taskLink")
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;
	
	@FindBy(id ="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitToBM;
	
	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement RGSKYClaimProcessingLink() {
		return RGSKYClaimProcessingLink;
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
	
	public WebElement SubmitToBM() {
		return SubmitToBM;
	}
	

//BM Login
	@FindBy(id ="ctl00_HomePageContent_emplyrGrid_ctl02_Generate")
	WebElement SendUA3toEmployerforUA4ILink;
	
	@FindBy(id ="ctl00_HomePageContent1_Button1")
	WebElement SendButton;
	
	@FindBy(id ="ctl00_HomePageContent_approve")
	WebElement ApproveBtn;

	
	@FindBy(id ="ctl00_HomePageContent_approve")
	WebElement RejectBtn;
	
	
	public WebElement SendUA3toEmployerforUA4ILink() {
		return SendUA3toEmployerforUA4ILink;
	}
	
	public WebElement SendButton() {
		return SendButton;
	}
	
	public WebElement ApproveBtn() {
		return ApproveBtn;
	}
	
	public WebElement RejectBtn() {
		return RejectBtn;
	}

	
	//RO Login
	
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement ROApproveBtn;
	
	public WebElement ROApproveBtn() {
		return ROApproveBtn;
	}
	
}
