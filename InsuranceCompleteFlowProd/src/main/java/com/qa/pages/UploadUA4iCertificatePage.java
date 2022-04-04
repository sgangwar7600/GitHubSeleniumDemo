package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadUA4iCertificatePage {

	WebDriver driver;

	public UploadUA4iCertificatePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Upload Certificates")
	WebElement UploadCertificates;
	
	@FindBy(id ="ctl00_HomePageContent_HyperLink152343")
	WebElement UploadUA4iCertificate;
	
	@FindBy(id ="ctl00_HomePageContent_txtIpNo")
	WebElement InsuranceNoTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_ddlUnemployedReason")
	WebElement ReasonOfUnemploymentDrpDwn;
	
	@FindBy(id ="ctl00_HomePageContent_AttachDocUA_4")
	WebElement BrowseBtn;
	
	@FindBy(id ="ctl00_HomePageContent_CheckBox1")
	WebElement CheckBox;
	
	@FindBy(id ="ctl00_HomePageContent_btnSubmit")
	WebElement SubmitBtn;
	
	@FindBy(id ="ctl00_HomePageContent_reset")
	WebElement ResetBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnCancel")
	WebElement CancelBtn;
	
	
	public WebElement UploadCertificates() {
		return UploadCertificates;
	}
	
	public WebElement UploadUA4iCertificate() {
		return UploadUA4iCertificate;
	}
	
	public WebElement InsuranceNoTxtBx() {
		return InsuranceNoTxtBx;
	}
	
	public WebElement ReasonOfUnemploymentDrpDwn() {
		return ReasonOfUnemploymentDrpDwn;
	}
	
	public WebElement BrowseBtn() {
		return BrowseBtn;
	}
	
	public WebElement CheckBox() {
		return CheckBox;
	}
	
	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement ResetBtn() {
		return ResetBtn;
	}
	
	public WebElement CancelBtn() {
		return CancelBtn;
	}
	
	@FindBy(id ="ctl00_HomePageContent_LinkButton1")
	WebElement UploadUA4iiCertificate;
	

	@FindBy(id ="ctl00_HomePageContent_txtIP_No")
	WebElement InsuranceNoTxtBx2;
	
	@FindBy(id ="ctl00_HomePageContent_txtDesignation")
	WebElement Designation;
	
	@FindBy(id ="ctl00_HomePageContent_txtDeptNo")
	WebElement DepartmentTxtBx;
	
	public WebElement UploadUA4iiCertificate() {
		return UploadUA4iiCertificate;
	}
	
	public WebElement InsuranceNoTxtBx2() {
		return InsuranceNoTxtBx2;
	}
	
	public WebElement Designation() {
		return Designation;
	}
	
	
	public WebElement DepartmentTxtBx() {
		return DepartmentTxtBx;
	}
}
