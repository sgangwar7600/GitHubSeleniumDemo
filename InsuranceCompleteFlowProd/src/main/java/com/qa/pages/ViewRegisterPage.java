package com.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class ViewRegisterPage  {
	Utility utilobj = new Utility();
	

	WebDriver driver;

	public ViewRegisterPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	// Actions action = new Actions(driver);
	 
	 @FindBy(xpath=" .//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img")
	 WebElement registr;
	 
		/*EmployerMasterRegister*/

	 @FindBy(linkText="View Employer Master Register")
	 WebElement ViewEmployerMasterRegister;
	 

	@FindBy(id="ctl00_HomePageContent_ctrlTxtEmprCode" )
    WebElement EmployerCode;
	

	@FindBy(id="ctl00_HomePageContent_ctrlBtnSearch" )
    WebElement SearchBtn;
	
	/*View WatchOver Register*/
	
	 @FindBy(linkText="View Watch Over Register")
	 WebElement ViewWatchOverRegister;
	
	 
	 /*View C11*/
	 
	 @FindBy(linkText="View C11")
	 WebElement ViewC11;
	 
	 @FindBy(id="ctl00_HomePageContent_ctrlTxtEmprCode" )
	    WebElement EmpCodeTxtBx;
	 
	 @FindBy(id="ctl00_HomePageContent_ctrlBtnSearch" )
	    WebElement ViewC11SearchBtn;
	 
	 public WebElement  Close(){
			return  Close;
		}
		
		public WebElement registr(){
			return registr;
		}
		
		/*EmployerMasterRegister*/

		public WebElement ViewEmployerMasterRegister(){
			return ViewEmployerMasterRegister;
		}
		
		public WebElement EmployerCode(){
			return EmployerCode;
		}
		
		public WebElement SearchBtn(){
			return SearchBtn;
		}
	
		/*View WatchOver Register*/

		public WebElement ViewWatchOverRegister(){
			return ViewWatchOverRegister;
		}

		/*View C11*/

		public WebElement ViewC11(){
			return ViewC11;
		}

		public WebElement EmpCodeTxtBx(){
			return EmpCodeTxtBx;
		}
		
		public WebElement ViewC11SearchBtn(){
			return ViewC11SearchBtn;
		}

		
		public void doNavigateToViewEmployerMasterRegister(String EmployersCode) {
			try{
				Close().click();
				utilobj.MoveElement(registr(), driver);
				Thread.sleep(2000);	
				
				/*EmployerMasterRegister*/
				
				ViewEmployerMasterRegister().click();
				Thread.sleep(2000);	
				
				EmployerCode.sendKeys(EmployersCode);
				Thread.sleep(2000);	
				SearchBtn().click();
				Thread.sleep(2000);	
				
			/*View WatchOver Register
				
				Thread.sleep(2000);	
				utilobj.MoveElement(registr(), driver);
				Thread.sleep(2000);	
				ViewWatchOverRegister().click();
				Thread.sleep(2000);	*/
				
			}
			
			catch (Exception ex) {
				System.err.println(ex);
			}
			
			
		}

		//View C11
		public void doNavigateToViewC11(String EmployersCode) {
			try{
			utilobj.MoveElement(registr(), driver);
			ViewC11().click();
			EmpCodeTxtBx().sendKeys(EmployersCode);
			ViewC11SearchBtn().click();
			Thread.sleep(2000);
			
             Robot rb1 =new Robot();
 			
  			rb1.keyPress(KeyEvent.VK_DOWN);
  			
  			Thread.sleep(2000);
  			rb1.keyPress(KeyEvent.VK_ENTER);
  			
  			rb1.keyRelease(KeyEvent.VK_ENTER);
  			Thread.sleep(5000);
}
			
			catch (Exception ex) {
				System.err.println(ex);
			}
		}
         //View WatchOver Register
		public void doNavigateToViewWatchOverRegister(String value) {
			try{
				Thread.sleep(2000);
		
			utilobj.MoveElement(registr(), driver);
			Thread.sleep(2000);	
			ViewWatchOverRegister().click();
			Thread.sleep(2000);
	//		driver.findElement(By.id("")).sendKeys("");(Not able to inspect)
			
			}	
			catch (Exception ex) {
				System.err.println(ex);
			}
			
}
		
		
		
}
