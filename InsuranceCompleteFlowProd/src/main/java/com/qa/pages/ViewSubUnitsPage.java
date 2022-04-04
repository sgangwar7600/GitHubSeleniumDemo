package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class ViewSubUnitsPage {
Utility utilobj = new Utility();
	

	WebDriver driver;

	public ViewSubUnitsPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	// Actions action = new Actions(driver);
	 
	 @FindBy(xpath=" .//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img")
	 WebElement registr;
	 
	 @FindBy(linkText="View SubUnits")
	 WebElement ViewSubUnits;
	 

	@FindBy(id="ctl00_HomePageContent_ctrlTxtEmprCode" )
	WebElement EmployerCode;
	
	@FindBy(id="ctl00_HomePageContent_ctrlBtnSearch" )
	WebElement SearchBtn;
	 
	@FindBy(id="ctl00_HomePageContent_ctrlLinkView0col3" )
	WebElement ViewLink;
	
	
	@FindBy(id="ctl00_HomePageContent_cancel" )
	WebElement CloseBtn;
	
	 
	 @FindBy(linkText="53110000000220002")
	 WebElement OPenSubUnits;
	
	/* @FindBy(linkText="53110000000010002")// For Production
	 WebElement OPenSubUnits;
	*/ 
	 
	 @FindBy(id="ctl00_HomePageContent_rdDoesAnOfficeExist_1")
	 WebElement YesRadioBtn;
	 
	 
	 @FindBy(id="ctl00_HomePageContent_btnEdit")
	 WebElement EditSubUnits;
	 
	 @FindBy(id="ctl00_HomePageContent_txtAddr1NewSubUnit")
	 WebElement Address;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlStateNewSubUnit")
	 WebElement State;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlDistNewSubUnit")
	 WebElement District;
	 
	 @FindBy(id="ctl00_HomePageContent_txtPinNewSubUnit")
	 WebElement PinCode;
	 
	 @FindBy(id="ctl00_HomePageContent_txtMobileNoNewSubUnit")
	 WebElement MobileNo;
	 
	 @FindBy(id="ctl00_HomePageContent_btnNext")
	 WebElement NextBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_txtNameOfOfficial")
	 WebElement NameOfOfficialTxtbx;
	 
	 @FindBy(id="ctl00_HomePageContent_txtAdd1_ESI_Act")
	 WebElement Address2;
	 
	 @FindBy(id="ctl00_HomePageContent_txtDesignation")
	 WebElement Designation;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlState_ESI_Act")
	 WebElement State2;
	 
	 @FindBy(id="ctl00_HomePageContent_ddlDist_ESI_Act")
	 WebElement District2;
	 
	 @FindBy(id="ctl00_HomePageContent_txtPin_ESI_Act")
	 WebElement Pincode2;
	 
	 @FindBy(id="ctl00_HomePageContent_txtMobileNo_ESI_Act")
	 WebElement MobileNo2;
	 
	
	 
	 
	 @FindBy(id="ctl00_HomePageContent_btnUpdate")
	 WebElement UpdateBtn;
	 
	 
	 @FindBy(id="ctl00_HomePageContent_btnCancel" )
		WebElement CloseSubUnit;
		
	 
	
	 public WebElement  Close(){
			return  Close;
		}
		
		public WebElement registr(){
			return registr;
		}
		
		public WebElement ViewSubUnits(){
			return ViewSubUnits;
		}
		
		public WebElement EmployerCode(){
			return EmployerCode;
		}
		
		public WebElement SearchBtn(){
			return SearchBtn;
		}
		
		public WebElement ViewLink(){
			return ViewLink;
		}
		
		public WebElement OPenSubUnits(){
			return OPenSubUnits;
		}
		
		public WebElement EditSubUnits(){
			return EditSubUnits;
		}
		
		public WebElement YesRadioBtn(){
			return YesRadioBtn;
		}
		
		public WebElement Address(){
			return Address;
		}
		
		public WebElement State(){
			return State;
		}
		
		public WebElement District(){
			return District;
		}
		
		public WebElement PinCode(){
			return PinCode;
		}
		
		public WebElement MobileNo(){
			return MobileNo;
		}
		
		public WebElement NextBtn(){
			return NextBtn;
		}
		
		public WebElement NameOfOfficialTxtbx(){
			return NameOfOfficialTxtbx;
		}
		
		public WebElement Address2(){
			return Address2;
		}
		
		public WebElement Designation(){
			return Designation;
		}
		
		public WebElement State2(){
			return State2;
		}
		
		public WebElement District2(){
			return District2;
		}
		
		public WebElement PinCode2(){
			return Pincode2;
		}
		
		public WebElement MobileNo2(){
			return MobileNo2;
		}
	
		
		public WebElement UpdateBtn(){
			return UpdateBtn;
		}
		
		
		public WebElement CloseBtn(){
			return CloseBtn;
		}
		
		public WebElement CloseSubUnit(){
			return CloseSubUnit;
		}

	public void doNavigateToViewSubUnits(String EmployersCode) {
		try{
			Close().click();
			utilobj.MoveElement(registr(), driver);
			Thread.sleep(2000);	
			ViewSubUnits().click();
			Thread.sleep(2000);	
			EmployerCode().sendKeys(EmployersCode);
			Thread.sleep(2000);	
			SearchBtn().click();
			Thread.sleep(2000);	
			ViewLink().click();
			Thread.sleep(2000);	
	        utilobj.JSClick(OPenSubUnits, driver);
	        Thread.sleep(2000);
	       
	        EditSubUnits().click();
	        Thread.sleep(2000);
	        YesRadioBtn().click();
	        Thread.sleep(2000);
	        Address().clear();
	        Thread.sleep(2000);	
	        Address().sendKeys("abc");
	        Thread.sleep(2000);
	        State().sendKeys("Bihar");
	      
	        Thread.sleep(2000);
	        Thread.sleep(2000);
	        PinCode().clear();
	        PinCode().sendKeys("100001");
	        Thread.sleep(2000);	
	        District().sendKeys("Araria");
	        Thread.sleep(2000);	
	        MobileNo().clear();
	        MobileNo().sendKeys("9888888888");
	        Thread.sleep(2000);	
	        NextBtn().click();
	        Thread.sleep(2000);	
	        NameOfOfficialTxtbx().clear();
	        Thread.sleep(2000);	
	        NameOfOfficialTxtbx().sendKeys("name");
	        Thread.sleep(2000);	
	        
	          Address2().clear();
	        Thread.sleep(2000);	
	        Address2().sendKeys("address1");
	        Thread.sleep(2000);
	        Designation().clear();
	        Thread.sleep(2000);	
	        Designation().sendKeys("designation");
	        Thread.sleep(2000);
	        State2().sendKeys("Himachal Pradesh");
	       
	        Thread.sleep(2000);	
	        PinCode2().clear();
	        PinCode2().sendKeys("507306");
	        Thread.sleep(2000);
	        District2().sendKeys("Kangra");
	        Thread.sleep(2000);	
	        MobileNo2().clear();
	        MobileNo2().sendKeys("9640369400");
	       //UpdateBtn().click();
	        
	        Thread.sleep(3000);	
	   //    CloseSubUnit().click();

			//CloseBtn().click();
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
		
	}
}
