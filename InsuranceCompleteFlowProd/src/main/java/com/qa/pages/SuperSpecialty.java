package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperSpecialty {
	
	WebDriver driver;

	public SuperSpecialty(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id="ctl00_HomePageContent_txtNameOfDisease")
	WebElement NameofDesies;
	
	@FindBy(id="ctl00_HomePageContent_txtMCName")
	WebElement MedisuperName;
	
	@FindBy(id="ctl00_HomePageContent_txtReasonForNonEligibility")
	WebElement Reason;
	
	@FindBy(id="ctl00_HomePageContent_txtRemarks")
	WebElement Remark;
	
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement submit;
	
	
	
	public WebElement NameofDesies(){
		return NameofDesies;
	}
	
	public WebElement MedisuperName(){
		return MedisuperName;
	}
	
	
	public WebElement Reason(){
		return Reason;
	}
	
	public WebElement Remark(){
		return Remark;
	}
	
	public WebElement submit(){
		return submit;
	}

	
	
	//For RO Login
	
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="SuperSpeciality Request Processing")
	WebElement SSTClaimProcessingLink;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl04_taskLink")
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_next")
	WebElement NextBtn;
	
	@FindBy(id ="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement ROApproveBtn;
	
	public WebElement ROApproveBtn() {
		return ROApproveBtn;
	}
	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement SSTClaimProcessingLink() {
		return SSTClaimProcessingLink;
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
	
}
