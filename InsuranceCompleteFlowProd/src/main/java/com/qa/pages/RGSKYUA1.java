package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RGSKYUA1 {
	
	WebDriver driver;

	public RGSKYUA1(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id="ctl00_HomePageContent_txtIssuingAuthName")
	WebElement Name;
	
	@FindBy(id="ctl00_HomePageContent_txtDesignation")
	WebElement Designation;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement submit;
	

	@FindBy(id="ctl00_HomePageContent_txtAttachDoc1")
	WebElement Browse;
	
	@FindBy(id="ctl00_HomePageContent_txtAttachDoc2")
	WebElement Browse2;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement UA9SubmitBtn;
	
	@FindBy(id="ctl00_HomePageContent_btnReset")
	WebElement ResetBtn;
	
	@FindBy(id="ctl00_HomePageContent_Button2")
	WebElement CancelBtn;
	
	@FindBy(id="ctl00_HomePageContent_uploadFile")
	WebElement Browse3;
	
	
	 public void Select_List(WebElement element, String text) throws InterruptedException {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);

		}
	 
	 
	 public WebElement Name(){
		 return Name;
	 }
	 
	 
	 public WebElement Designation(){
		 return Designation;
	 }
	 
	 public WebElement submit(){
		 return submit;
	 }
	 
	 public WebElement UA9SubmitBtn(){
		 return UA9SubmitBtn;
	 }
	 
	 public WebElement Browse(){
		 return Browse;
	 }
	 
	 public WebElement Browse2(){
		 return Browse2;
	 }
	 
	 public WebElement Browse3(){
		 return Browse3;
	 }
	 
	 public WebElement ResetBtn(){
		 return ResetBtn;
	 }
	 
	 public WebElement CancelBtn(){
		 return CancelBtn;
	 }

}
