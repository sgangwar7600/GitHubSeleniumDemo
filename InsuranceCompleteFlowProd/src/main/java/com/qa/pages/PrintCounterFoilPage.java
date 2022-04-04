package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class PrintCounterFoilPage  {
	Utility utilobj = new Utility();
	

	WebDriver driver;

	public PrintCounterFoilPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	// Actions action = new Actions(driver);
	 
	 @FindBy(xpath=" .//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img")
	 WebElement registr;
	 
	 @FindBy(linkText="e-Pehchan Card")
	 WebElement ePehchanCard;
	 
	 
	 @FindBy(id="ctl00_HomePageContent_ctrlTextEmprCode")
	 WebElement EmployersCodeNumber;
	 
	 @FindBy(id="ctl00_HomePageContent_ctrlBtnShow")
	 WebElement ViewButton;
	 
	 @FindBy(id="ctl00_HomePageContent_gvEmployeList_ctl02_lnlViweCounterfolil")
	 WebElement ViewCounterFoilLink;
	 
	 
	 @FindBy(id="ctl00_HomePageContent_exit")
	 WebElement CancelCounterFoilBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_print")
	 WebElement PrintCounterFoilBtn;
	 
	 
	 
	 public WebElement  Close(){
			return  Close;
		}
		
		public WebElement registr(){
			return registr;
		}
		
		public WebElement ePehchanCard(){
			return ePehchanCard;
		}
		
		public WebElement EmployersCodeNumber(){
			return EmployersCodeNumber;
		}
		
		public WebElement ViewButton(){
			return ViewButton;
		}
		
		public WebElement ViewCounterFoilLink(){
			return ViewCounterFoilLink;
		}
		
		public WebElement PrintCounterFoilBtn(){
			return PrintCounterFoilBtn;
		}
		
		public WebElement CancelCounterFoilBtn(){
			return CancelCounterFoilBtn;
		}

	public void doNavigateToPrintCounterFoilPage(String EmployersCode) throws InterruptedException, AWTException {
		
		Close().click();
		utilobj.MoveElement(registr(), driver);
		
		ePehchanCard().click();
		Thread.sleep(2000);
		EmployersCodeNumber().sendKeys(EmployersCode);
		Thread.sleep(2000);
		ViewButton().click();
		Thread.sleep(2000);
		ViewCounterFoilLink().click();
		Thread.sleep(2000);
		
		PrintCounterFoilBtn().click();
		Robot rb =new Robot();
			
 			rb.keyPress(KeyEvent.VK_DOWN);
 			
 			Thread.sleep(2000);
 			rb.keyPress(KeyEvent.VK_ENTER);
 			
 			rb.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(5000);
		CancelCounterFoilBtn().click();
	
	}

}
