package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class RecoveryManualPaymentPage {
Utility utilobj = new Utility();
	

	WebDriver driver;

	public RecoveryManualPaymentPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	@FindBy(xpath="/html/body/form/div[3]/table[2]/tbody/tr[1]/td/div/table/tbody/tr/td[13]/table/tbody/tr/td/a/img" )
	WebElement Recovery;
	
	//Recovery Manual Payment
	@FindBy(linkText="Recovery Manual Payment" )
	WebElement RecoveryManualPayment;
	
	@FindBy(id="ctl00_HomePageContent_txtEmprCode" )
	WebElement EmployerCodeTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_ddlCertType" )
	WebElement CertificateTypeDrpDwn;
	
	@FindBy(id="ctl00_HomePageContent_btnSearch" )
	WebElement SearchBtn;
	
	@FindBy(id="ctl00_HomePageContent_gvCertNo_ctl02_lbtnCertNo" )
	WebElement CertificateNumberLink;
	
	@FindBy(id="ctl00_HomePageContent_lblPaymentDue" )
	WebElement PaymentDue;
	
	@FindBy(id="ctl00_HomePageContent_txtAmountPaid" )
	WebElement textPaymentPaid;
	
	@FindBy(id="ctl00_HomePageContent_txtpaymentdate" )
	WebElement DateofPayment;
	
	@FindBy(id="ctl00_HomePageContent_CalendarExtender3_day_0_3" )
	WebElement SelectDateofPayment;
	
	@FindBy(id="ctl00_HomePageContent_txtRemarks" )
	WebElement Remarks;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit" )
	WebElement SubmitBtn;
	
	@FindBy(id="ctl00_HomePageContent_btnCancel" )
	WebElement CancelBtn;
	
	 public WebElement  Close(){
			return  Close;
		}
	
	 public WebElement  Recovery(){
			return  Recovery;
		}
	 
	 public WebElement  RecoveryManualPayment(){
			return  RecoveryManualPayment;
	 }
	 
	 public WebElement  EmployerCodeTxtBx(){
			return  EmployerCodeTxtBx;
	 }
	 
	 public WebElement  CertificateTypeDrpDwn(){
			return  CertificateTypeDrpDwn;
	 }
	 
	 public WebElement  SearchBtn(){
			return  SearchBtn;
	 }

	 public WebElement  CertificateNumberLink(){
			return  CertificateNumberLink;
	 }

	 public WebElement  PaymentDue(){
			return  PaymentDue;
	 }

	 public WebElement  textPaymentPaid(){
			return  textPaymentPaid;
	 }

	 public WebElement  DateofPayment(){
			return  DateofPayment;
	 }

	 public WebElement  SelectDateofPayment(){
			return  SelectDateofPayment;
	 }

	 public WebElement  Remarks(){
			return  Remarks;
	 }

	 public WebElement  SubmitBtn(){
			return  SubmitBtn;
	 }

	 public WebElement  CancelBtn(){
			return  CancelBtn;
	 }

	 
	public void doNavigateToRecoveryManualPayment(String EmployersCode) throws InterruptedException {	
			Close().click();
			utilobj.MoveElement(Recovery(), driver);
			Thread.sleep(2000);	
			RecoveryManualPayment().click();
			Thread.sleep(2000);
			EmployerCodeTxtBx().sendKeys(EmployersCode);
			Thread.sleep(2000);
			CertificateTypeDrpDwn().sendKeys("C-19");
			Thread.sleep(2000);
			SearchBtn().click();
			Thread.sleep(2000);
			CertificateNumberLink().click();
			Thread.sleep(2000);
		//	WebElement PaymentDue  = driver.findElement(By.id("ctl00_HomePageContent_lblPaymentDue"));
			String textPaymentDue = PaymentDue.getText();
			System.out.println(textPaymentDue);
			Thread.sleep(2000);
		//	WebElement textPaymentPaid = driver.findElement(By.id("ctl00_HomePageContent_txtAmountPaid"));
			textPaymentPaid.sendKeys(textPaymentDue);
			Thread.sleep(2000);
			DateofPayment().click();
			Thread.sleep(2000);
			SelectDateofPayment().click();
			Thread.sleep(2000);
			Remarks().sendKeys("Test");
			Thread.sleep(2000);
			//SubmitBtn().click();
			Thread.sleep(2000);
			CancelBtn().click();
		
	}

}
