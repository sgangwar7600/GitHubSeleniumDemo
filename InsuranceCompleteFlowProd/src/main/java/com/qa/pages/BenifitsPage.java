package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BenifitsPage {
	WebDriver driver;

	public BenifitsPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath=".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img")
	WebElement Benifits;
	
	@FindBy(xpath=".//*[@id='ctl00_HomePageContent_btnClose']" )
	WebElement Close;
	
	@FindBy(linkText="Create a New Claim or Request")
	WebElement CreateAnewClaimRequest;
	
//	@FindBy(xpath=".//*[@id='ctl00_NavigationMenun11']/td/table/tbody/tr/td/a")
//	WebElement CreateAnewClaimRequest;
	
	
	
	@FindBy(id="ctl00_HomePageContent_txtIPNumber")
	WebElement InsureNumber;
	
	@FindBy(id="ctl00_HomePageContent_Submit")
	WebElement submit;
	
	@FindBy(id="ctl00_HomePageContent_lnkCreateAcknowledgement")
	WebElement CreateAcknowlegement;
	
	@FindBy(id="ctl00_HomePageContent_txtRemarks")
	WebElement Remarks1;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement genrate;
	
	@FindBy(id="ctl00_HomePageContent_btnCancel")
	WebElement Back;
	
	@FindBy(id="ctl00_HomePageContent_lnkSelectAck")
	WebElement SelectAcknowledgeMent;
	
	@FindBy(xpath="ctl00_HomePageContent_grvSelectAck_ctl72_chkSelectAck")
	WebElement selectRadiobutton;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement submit3;
	
	@FindBy(id="ctl00_HomePageContent_txtRemarks")
	WebElement Remarks;
	
	@FindBy(id="ctl00_HomePageContent_Submit")
	WebElement submit1;
	
	 public void Select_List(WebElement element, String text) throws InterruptedException {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);

		}
	
	
	public WebElement BenifitsPage(){
		return Benifits;
	}
	
	public WebElement  Close(){
		return  Close;
	}
	
	public WebElement CreateAnewClaimRequest(){
		return CreateAnewClaimRequest;
	}
	
	public WebElement InsureNumber(){
		return InsureNumber;
	}
	
	public WebElement submit(){
		return submit;
	}
	
	public WebElement CreateAcknowlegement(){
		return CreateAcknowlegement;
	}
	
	public WebElement Remarks1(){
		return Remarks1;
	}
	public WebElement genrate(){
		return genrate;
	}
	
	public WebElement Back(){
		return Back;
	}
	
	
	public WebElement SelectAcknowledgeMent(){
		return SelectAcknowledgeMent;
	}
	
	public WebElement selectRadiobutton(){
		return selectRadiobutton;
	}
	
	public WebElement submit3(){
		return submit3;
		
	}
	
	
	
	public WebElement Remarks(){
		return Remarks;
	}
	
	public WebElement submit1(){
		return submit1;
	}
	
	//ENSB
	
	@FindBy(xpath=".//*[@id='ctl00_HomePageContent_grvSelectAck_ctl19_chkSelectAck']")
	WebElement selectENSBRadiobutton;

	public WebElement selectENSBRadiobutton(){
		return selectENSBRadiobutton;
	}
	
	//MBSB CLaim
	@FindBy(id="ctl00_HomePageContent_ddlClaimType")
	WebElement ClaimType;

	public WebElement ClaimType(){
		return ClaimType;
	}
	
}
