package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FuneralExpenseClaimProcesssingPage {
	WebDriver driver;

	public FuneralExpenseClaimProcesssingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="Funeral Expenses Claim Processing")
	WebElement FEClaimProcessingLink;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;
	
	@FindBy(id ="ctl00_HomePageContent_txtremarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitToBM;
	
	@FindBy(id ="back")
	WebElement BMBackBtn;
	
	@FindBy(id ="ctl00_HomePageContent_approve")
	WebElement BMApproveBtn;
	
	@FindBy(id ="ctl00_HomePageContent_reject")
	WebElement BMRejectBtn;

	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement FEClaimProcessingLink() {
		return FEClaimProcessingLink;
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

	public WebElement BMBackBtn() {
		return BMBackBtn;
	}

	public WebElement BMApproveBtn() {
		return BMApproveBtn;
	}

	public WebElement BMRejectBtn() {
		return BMRejectBtn;
	}

	
}
