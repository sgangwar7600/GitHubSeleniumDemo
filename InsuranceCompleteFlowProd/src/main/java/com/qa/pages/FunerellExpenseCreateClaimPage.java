package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FunerellExpenseCreateClaimPage {
	
	WebDriver driver;

	public FunerellExpenseCreateClaimPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="ctl00_HomePageContent_ddlClaimType")
	WebElement TypeOfClaim;

	
	@FindBy(id="ctl00_HomePageContent_txtRemarks")
	WebElement Remark;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement Genrate;
	
	@FindBy(id="ctl00_HomePageContent_btnCancel")
	WebElement Back;
	
	@FindBy(id="ctl00_HomePageContent_lnkSelectAck")
	WebElement selectAck;
	
	@FindBy(id="ctl00_HomePageContent_grvSelectAck_ctl02_chkSelectAck")
	WebElement RadioButton;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement Submit1;
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement submit;
	
	@FindBy(id="ctl00_HomePageContent_lnkCreateAcknowledgement")
	WebElement CreateAck;
	
	@FindBy(id="ctl00_HomePageContent_txtDesig")
	WebElement IPDesignation;
	
	@FindBy(id="ctl00_HomePageContent_txtClmtname")
	WebElement ClaimentName;
	
	@FindBy(id="ctl00_HomePageContent_txtclmtage")
	WebElement age;
	
	@FindBy(xpath=".//*[@id='ctl00_HomePageContent_fuclamnt']")
	WebElement Browse;
	
	
	
	
	public void Select_List(WebElement element, String text) throws InterruptedException {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}
	
	public WebElement TypeOfClaim(){
		return TypeOfClaim;
	}
	
	public WebElement Remark(){
		return Remark;
	}
	
	public WebElement Genrate(){
		return Genrate;
	}
	
	public WebElement Back(){
		return Back;
	}
	
	public WebElement selectAck(){
		return selectAck;
	}
	
	public WebElement RadioButton(){
		return RadioButton;
	}
	
	public WebElement  Submit1(){
		return  Submit1;
	}
	
	public WebElement submit(){
		return submit;
	}
	
	public WebElement  CreateAck(){
		return  CreateAck;
	}
	
	public WebElement IPDesignation(){
		return IPDesignation;
	}
	
	public WebElement ClaimentName(){
	return ClaimentName;
}
	
	public WebElement age(){
		return age;
	}
	
	public WebElement Browse(){
		return Browse;
	}

}
