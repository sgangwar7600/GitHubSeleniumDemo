package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class RecoveryTransactionReportPage {
Utility utilobj = new Utility();
	

	WebDriver driver;

	public RecoveryTransactionReportPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	@FindBy(xpath="/html/body/form/div[3]/table[2]/tbody/tr[1]/td/div/table/tbody/tr/td[13]/table/tbody/tr/td/a/img" )
	WebElement Recovery;
	
	//Recovery Transaction Report
	@FindBy(linkText="Recovery Transaction Report" )
	WebElement RecoveryTransactionReport;
	
	@FindBy(id="ctl00_HomePageContent_txtFromDate" )
	WebElement FromDate;
	
	@FindBy(id="ctl00_HomePageContent_cal1IFromDate_prevArrow" )
	WebElement FromDatePreviousArrow;
	
	@FindBy(id="ctl00_HomePageContent_cal1IFromDate_day_0_5" )
	WebElement FromDateSelect;
	
	@FindBy(id="ctl00_HomePageContent_txtToDate" )
	WebElement ToDate;
	
	@FindBy(id="ctl00_HomePageContent_cal1IToDate_day_0_3" )
	WebElement ToDateSelect;
	
	@FindBy(id="ctl00_HomePageContent_btnSearch" )
	WebElement SearchBtn;

	//IrrecoverableRegister
	@FindBy(linkText="Irrecoverable Register" )
	WebElement IrrecoverableRegister;
	
	//WaiverRegister
/*	@FindBy(linkText="WaiverRegister" )
	WebElement WaiverRegister;
*/	
	@FindBy(linkText="Waiver Register" ) //For Production
	WebElement WaiverRegister;
	
	//CPRegister
		/*@FindBy(linkText="CpRegister" )
		WebElement CPRegister;
		*/
		@FindBy(linkText="CP Register" )//For Production
		WebElement CPRegister;
		
		@FindBy(id="ctl00_HomePageContent_ddlCptype" )
		WebElement CPType;
		
	
	 public WebElement  Close(){
			return  Close;
		}
	
	 public WebElement  Recovery(){
			return  Recovery;
		}
	 
	 public WebElement  RecoveryTransactionReport(){
			return  RecoveryTransactionReport;
	 }
	 
	 public WebElement  FromDate(){
			return  FromDate;
	 }
	 
	 public WebElement  FromDatePreviousArrow(){
			return  FromDatePreviousArrow;
	 }
	 
	 public WebElement  FromDateSelect(){
			return  FromDateSelect;
	 }
	 
	 public WebElement  ToDate(){
			return  ToDate;
	 }
	 
	 public WebElement  ToDateSelect(){
			return  ToDateSelect;
	 }
	 
	 public WebElement  SearchBtn(){
			return  SearchBtn;
	 }
	
	 //IrrecoverableRegister
	 public WebElement  IrrecoverableRegister(){
			return  IrrecoverableRegister;
	 }
	 
	 //WaiverRegister
	 public WebElement  WaiverRegister(){
			return  WaiverRegister;
	 }
	 
	 //CPRegister
	 public WebElement  CPRegister(){
			return  CPRegister;
	 }
	 
	 public WebElement  CPType(){
			return  CPType;
	 }
	 

	public void doNavigateToRecoveryTransactionReport(String value) {
		try{
			Close().click();
			utilobj.MoveElement(Recovery(), driver);
			Thread.sleep(2000);	
			RecoveryTransactionReport().click();
			Thread.sleep(2000);
			FromDate().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDateSelect().click();
			Thread.sleep(2000);
			ToDate().click();
			Thread.sleep(2000);
			ToDateSelect().click();
			Thread.sleep(2000);
			SearchBtn().click();
			
			Thread.sleep(2000);
				}
		
		catch (Exception ex) {
			System.err.println(ex);
		}
		
	}

	public void doNavigateToIrrecoverableRegister() {
		try{
			//IrrecoverableRegister
			utilobj.MoveElement(Recovery(), driver);
			Thread.sleep(2000);	
			IrrecoverableRegister().click();
			Thread.sleep(2000);
			FromDate().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDateSelect().click();
			Thread.sleep(2000);
			ToDate().click();
			Thread.sleep(2000);
			ToDateSelect().click();
			Thread.sleep(2000);
			SearchBtn().click();
			
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
	}

	public void doNavigateToWaiverRegister() {
		try{

			//WaiverRegister
			Thread.sleep(2000);
			utilobj.MoveElement(Recovery(), driver);
			Thread.sleep(2000);	
			WaiverRegister().click();
			Thread.sleep(2000);
			FromDate().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			Thread.sleep(2000);
			FromDatePreviousArrow().click();
			
			Thread.sleep(2000);
			FromDateSelect().click();
			Thread.sleep(2000);
			ToDate().click();
			Thread.sleep(2000);
			ToDateSelect().click();
			Thread.sleep(2000);
			SearchBtn().click();
			
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
	}

	public void doNavigateToCPRegister() {
		try{

			//CPRegister
			Thread.sleep(2000);
			utilobj.MoveElement(Recovery(), driver);
			Thread.sleep(2000);	
			CPRegister().click();
			Thread.sleep(2000);	
			CPType().sendKeys("CP-2");
			Thread.sleep(2000);	
			SearchBtn().click();
	
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
