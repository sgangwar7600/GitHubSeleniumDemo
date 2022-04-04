package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConvyanceAllowance {
	
	WebDriver driver;

	public ConvyanceAllowance(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="ctl00_HomePageContent_btn_next")
	WebElement Next1;
	
	@FindBy(id="ctl00_HomePageContent_radIPEmployed_0")
	WebElement Employeecode;
	
	@FindBy(id="ctl00_HomePageContent_txtNumDays")
	WebElement NumberDays;
	
	@FindBy(id="ctl00_HomePageContent_radAmPm_0")
	WebElement Time ;
	
	@FindBy(id="ctl00_HomePageContent_btn_next")
	WebElement Next2;
	
	@FindBy(id="ctl00_HomePageContent_txtIpPresent")
	WebElement remark1;
	
	@FindBy(id="ctl00_HomePageContent_txtFit")
	WebElement remark2;
	
	@FindBy(id="ctl00_HomePageContent_txtAttendant")
	WebElement remark3;
	
	@FindBy(id="ctl00_HomePageContent_txtSitPos")
	WebElement remrk4;
	
	@FindBy(id="ctl00_HomePageContent_txtPdb")
	WebElement remark5;
	
	@FindBy(id="ctl00_HomePageContent_btn_next")
	WebElement next3;
	
	@FindBy(id="ctl00_HomePageContent_txtFrmPlace")
	WebElement StratTravel;
	
	@FindBy(id="ctl00_HomePageContent_txtToPlace")
	WebElement Destinaion;
	
	@FindBy(id="ctl00_HomePageContent_txtDistance")
	WebElement DistanceKms;
	
	@FindBy(id="ctl00_HomePageContent_txtFare")
	WebElement journeyExpense;
	
	@FindBy(id="ctl00_HomePageContent_txtRetFar")
	WebElement ReturnExpense;
	
	@FindBy(id=".//*[@id='ctl00_HomePageContent_radTravelMode']")	
	WebElement ModeOfTravel;
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement submit;
	
	
	
	 public void Select_List(WebElement element, String text) throws InterruptedException {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);

		}
	 
	 
	 public WebElement Next1(){
		 return Next1;
	 }
	 
	 
	 public WebElement Employeecode(){
		 return Employeecode;
	 }
	 
	 public WebElement NumberDays(){
		 return NumberDays;
	 }
	
	 
	 public WebElement Time (){
		 return Time ;
	 }
	 
	 public WebElement Next2(){
		 return Next2;
	 }
	 
	 public WebElement remark1(){
		 return remark1;
	 }
	 
	 public WebElement remark2(){
		 return remark2;
	 }
	 
	 public WebElement remark3(){
		 return remark3;
	 }
	 
	 
	 public WebElement  remrk4(){
		 return  remrk4;
	 }
	 
	 public WebElement remark5(){
		 return remark5;
	 }
	 
	 public WebElement next3(){
		 return next3;
	 }
	 
	 
	 public WebElement StratTravel(){
		 return StratTravel;
	 }
	 
	 
	 public WebElement Destinaion(){
		 return Destinaion;
	 }
	 
	 public WebElement  DistanceKms(){
		 return  DistanceKms;
	 }
	 
	 public WebElement journeyExpense(){
		 return journeyExpense;
	 }
	 
	 public WebElement ReturnExpense(){
		 return ReturnExpense;
	 }
	 
	 public WebElement ModeOfTravel(){
		 return ModeOfTravel;
	 }
	 
	 public WebElement submit(){
		 return submit;
	 }
	 
	

}
