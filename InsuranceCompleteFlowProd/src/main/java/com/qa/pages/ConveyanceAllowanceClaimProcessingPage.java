package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConveyanceAllowanceClaimProcessingPage {

	WebDriver driver;

	public ConveyanceAllowanceClaimProcessingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="Conveyance Allowance")
	WebElement CAClaimProcessingLink;
	/*
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl05_taskLink") //For Production
	WebElement AssignedTaskId;
	*/
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;
	
	@FindBy(id ="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitToBM;
	
	@FindBy(id ="ctl00_HomePageContent_btnCancel")
	WebElement CancelBtn;
	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement CAClaimProcessingLink() {
		return CAClaimProcessingLink;
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
	
	public WebElement CancelBtn() {
		return CancelBtn;
	}


}
