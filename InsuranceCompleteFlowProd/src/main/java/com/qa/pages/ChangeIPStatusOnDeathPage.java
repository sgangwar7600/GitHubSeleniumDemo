package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.Utility;


public class ChangeIPStatusOnDeathPage {
	Utility utilobj = new Utility();
	

	WebDriver driver;

	public ChangeIPStatusOnDeathPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	// Actions action = new Actions(driver);
	 
	 @FindBy(xpath=" .//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img")
	 WebElement registr;
	 
	 @FindBy(linkText="Change IP Status on Death")
	 WebElement ChangeIpOnDeath;
	
	 @FindBy(id="ctl00_HomePageContent_txtIpNo")
	 WebElement IpNumber;
	 
	 @FindBy(id="ctl00_HomePageContent_search")
	 WebElement SearchBtn;
	 
	 
	 @FindBy(id="ctl00_HomePageContent_txtDOD")
	 WebElement DateOfDeath;

	 @FindBy(id="ctl00_HomePageContent_calExtDOD_prevArrow")
	 WebElement DateOfDeathprevArrow;
	 
	 @FindBy(id="ctl00_HomePageContent_calExtDOD_day_1_5")
	 WebElement SelectDateOfDeath;
	 
	 
	 @FindBy(id="ctl00_HomePageContent_ctrlFISelectFile")
	 WebElement BrowseBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_btnSubmit")
	 WebElement UpdateBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_txtRemarks")
	 WebElement Remarks;
	 
	 @FindBy(id="ctl00_HomePageContent_submit")
	 WebElement SubmitBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_cancel")
	 WebElement CloseBtn;

	
	public WebElement  Close(){
		return  Close;
	}
	
	public WebElement registr(){
		return registr;
	}
	
	public WebElement ChangeIpOnDeath(){
		return ChangeIpOnDeath;
	}
	
	public WebElement IpNumber(){
		return IpNumber;
	}
	 
	public WebElement DateOfDeath(){
		return DateOfDeath;
	}
	
	public WebElement DateOfDeathprevArrow(){
		return DateOfDeathprevArrow;
	}
	
	public WebElement SelectDateOfDeath(){
		return SelectDateOfDeath;
	}
	
	public WebElement BrowseBtn(){
		return BrowseBtn;
	}
	
	public WebElement UpdateBtn(){
		return UpdateBtn;
	}
	
	public WebElement Remarks(){
		return Remarks;
	}
	
	public WebElement SubmitBtn(){
		return SubmitBtn;
	}
	
	public WebElement CloseBtn(){
		return CloseBtn;
	}
	


	public void doNavigateToChangeIpOnDeathPage(String IpNo ) {
		try{
		System.out.println("ChangeIpOnDeathPage");
		
		Close().click();
		utilobj.MoveElement(registr(), driver);
		//registr().click();
		ChangeIpOnDeath().click();
		Thread.sleep(2000);
		IpNumber.sendKeys(IpNo);
		Thread.sleep(2000);
		SearchBtn.click();
		DateOfDeath().click();
		Thread.sleep(2000);
		DateOfDeathprevArrow().click();
		Thread.sleep(2000);
		SelectDateOfDeath().click();
		Thread.sleep(2000);
		//JavascriptExecutor  js=(JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('ctl00_HomePageContent_calExtDOD_day_2_3').value='Wednesday, May 12, 2021'");
		BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		
		Thread.sleep(2000);
		UpdateBtn().click();
		
		Remarks().clear();
		Thread.sleep(2000);
		Remarks().sendKeys("test test");
		Thread.sleep(2000);
		//SubmitBtn().click();
		CloseBtn().click();		
		}
		
		catch (Exception ex) {
			System.err.println(ex);
		}
		}
		
	}

