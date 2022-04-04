package com.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class InspectionPage {

Utility utilobj = new Utility();
	WebDriver driver;

	public InspectionPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	@FindBy(xpath=".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img" )
	WebElement Revenue;
	
	@FindBy(linkText="Inspection" )
	WebElement Inspection;
	
	//AOD REports
	@FindBy(linkText="AOD Reports" )
	WebElement AODReports ;
	
	@FindBy(id="ctl00_HomePageContent_rdbtnopt_0" )
	WebElement AODReportsRadioBtn1 ;
	
	@FindBy(id="ctl00_HomePageContent_rdbtnopt_1" )
	WebElement AODReportsRadioBtn2 ;
	
	@FindBy(id="ctl00_HomePageContent_rdbtnopt_2" )
	WebElement AODReportsRadioBtn3 ;
	
	@FindBy(id="ctl00_HomePageContent_btnPdf" )
	WebElement AODReportsPDFBtn ;
	
	
	@FindBy(linkText="UWP_SC15" )
	WebElement UWP_SC15;
	
	@FindBy(id="ctl00_HomePageContent_txtemprnio" )
	WebElement EmpoyerCode;
	
	@FindBy(id="ctl00_HomePageContent_ddlUnitType" )
	WebElement UnitType;
	
	@FindBy(id="ctl00_HomePageContent_ddlInspection" )
	WebElement InspectionReportDrpDwn;
	
	@FindBy(id="ctl00_HomePageContent_ddlBranchOffice" )
	WebElement BranchOfficeDrpDwn;
	
	@FindBy(id="ctl00_HomePageContent_txt6DigitsFrom" )
	WebElement EmployerCodeTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_CtrlBtnView" )
	WebElement ViewBtn;
	
	@FindBy(linkText="UWP Scrutinize Inspection Report" )
	WebElement UWPScrutinizeInspectionReport;
	
	

	@FindBy(id="ctl00_HomePageContent_btnSearch" )
	WebElement SearchBtn;
	
	@FindBy(id="ctl00_HomePageContent_CtrlGrdInspTaskDet_ctl02_InspNolinkbutton" )
	WebElement UWPScrutinizeInspectionReportLink;

	
	@FindBy(id="ctl00_HomePageContent_btnNext" )
	WebElement NextBtn;
	
	@FindBy(id="ctl00_HomePageContent_txtdaremarks" )
	WebElement DARemarksTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_txtspremarks" )
	WebElement SPRemarksTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_txtboremarks" )
	WebElement RBORemarksTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit" )
	WebElement NextBtn2;
	
	@FindBy(id="ctl00_HomePageContent_CtrlGrdInsDet_ctl02_txtRemarks" )
	WebElement RemarksTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_CtrlGrdInsDet_ctl02_btnApproval" )
	WebElement ForwardBtn;
	
	@FindBy(linkText="Scrutinize Observation Note/Inspection Report" )
	WebElement ScrutinizeObservationNoteInspectionReport;
	
	
	 public WebElement  Close(){
			return  Close;
		}
	
	 public WebElement  Revenue(){
			return  Revenue;
		}
	 
	 public WebElement  Inspection(){
			return  Inspection;
	 }
	 
	 //AOD Reports
	 public WebElement  AODReports(){
			return  AODReports;
	 }

	 public WebElement  AODReportsRadioBtn1(){
			return  AODReportsRadioBtn1;
	 }

	 public WebElement  AODReportsRadioBtn2(){
			return  AODReportsRadioBtn2;
	 }

	 public WebElement  AODReportsRadioBtn3(){
			return  AODReportsRadioBtn3;
	 }

	 public WebElement  AODReportsPDFBtn(){
			return  AODReportsPDFBtn;
	 }


	 public WebElement  UWP_SC15(){
			return  UWP_SC15;
	 }
	 
	 public WebElement  EmpoyerCode(){
			return  EmpoyerCode;
	 }
	 
	 public WebElement  UnitType(){
			return  UnitType;
	 }
	 
	 public WebElement  InspectionReportDrpDwn(){
			return  InspectionReportDrpDwn;
	 }
	 
	 public WebElement  BranchOfficeDrpDwn(){
			return  BranchOfficeDrpDwn;
	 }
	 
	 public WebElement  EmployerCodeTxtBx(){
			return  EmployerCodeTxtBx;
	 }
	 
	 
	 public WebElement  ViewBtn(){
			return  ViewBtn;
	 }

	 public WebElement  UWPScrutinizeInspectionReport(){
			return  UWPScrutinizeInspectionReport;
	 }
	 
	 public WebElement  SearchBtn(){
			return  SearchBtn;
	 }
	 
	 public WebElement  UWPScrutinizeInspectionReportLink(){
			return  UWPScrutinizeInspectionReportLink;
	 }
	 
	 public WebElement  NextBtn(){
			return  NextBtn;
	 }
	 
	 public WebElement  DARemarksTxtBx(){
			return  DARemarksTxtBx;
	 }
	 
	 public WebElement  SPRemarksTxtBx(){
			return  SPRemarksTxtBx;
	 }
	 
	 public WebElement  RBORemarksTxtBx(){
			return  RBORemarksTxtBx;
	 }
	 
	 public WebElement  NextBtn2(){
			return  NextBtn2;
	 }
	 
	 public WebElement  RemarksTxtBx(){
			return  RemarksTxtBx;
	 }
	 
	 public WebElement  ForwardBtn(){
			return  ForwardBtn;
	 }
	 

	 public WebElement  ScrutinizeObservationNoteInspectionReport(){
			return  ScrutinizeObservationNoteInspectionReport;
	 }

	 
	public void doNavigateToInspection(String EmployersCode, String FromEmployerCode) {
		try{
			Close().click();
			
			//AOD Reports
		/*	utilobj.MoveElement(Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(Inspection(), driver);
			Thread.sleep(2000);	
			AODReports().click();
			System.out.println("AOD Reports");
			Thread.sleep(2000);	
			AODReportsRadioBtn1().click();
			Thread.sleep(2000);	
			AODReportsPDFBtn().click();
            Robot rb =new Robot();
			
 			rb.keyPress(KeyEvent.VK_DOWN);
 			
 			Thread.sleep(2000);
 			rb.keyPress(KeyEvent.VK_ENTER);
 			
 			rb.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(5000);
 			String parent2 = driver.getWindowHandle();
            utilobj.Window(driver);


            Robot rb1 =new Robot();
				
            rb1.keyPress(KeyEvent.VK_DOWN);
	 			
	 			Thread.sleep(2000);
	 			rb1.keyPress(KeyEvent.VK_ENTER);
	 			
	 			rb1.keyRelease(KeyEvent.VK_ENTER);
	 			Thread.sleep(5000);
	 
 	 			
			
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			 utilobj.scroolDown(driver);
			 
			 rb1.keyPress(KeyEvent.VK_ESCAPE);
	 			
			 rb1.keyRelease(KeyEvent.VK_ESCAPE);
	 			Thread.sleep(5000);
			driver.switchTo().window(parent2);
			
 			
*/
			
 	 			//UWP_SC15
 	 		utilobj.MoveElement(Revenue(), driver);
 			Thread.sleep(2000);	
 			utilobj.MoveElement(Inspection(), driver);
 			Thread.sleep(2000);	
			UWP_SC15().click();
			Thread.sleep(2000);	
			EmpoyerCode().sendKeys(EmployersCode);
			Thread.sleep(2000);	
			UnitType().sendKeys("Main Unit");
			Thread.sleep(2000);	
			ViewBtn().click();
			Thread.sleep(2000);	
		
		//UWPScrutinizeInspectionReport	
			utilobj.MoveElement(Revenue(), driver);
 			Thread.sleep(2000);	
 			utilobj.MoveElement(Inspection(), driver);
 			Thread.sleep(2000);	
 			UWPScrutinizeInspectionReport().click();
 			Thread.sleep(2000);	
 			UnitType().sendKeys("Main Unit");
 			Thread.sleep(2000);	
 			/*InspectionReportDrpDwn().sendKeys("ID - Inspection Area No 10");
 			Thread.sleep(2000);	
 			BranchOfficeDrpDwn().sendKeys("BO - Ajmeri Gate");
 			Thread.sleep(2000);	
 			EmployerCodeTxtBx().sendKeys(FromEmployerCode);
 			*/Thread.sleep(2000);	
 			SearchBtn().click();
 			Thread.sleep(2000);	
 			UWPScrutinizeInspectionReportLink().click();
 			Thread.sleep(2000);	
 			NextBtn().click();
 			Thread.sleep(2000);
 			DARemarksTxtBx().sendKeys("DA Remarks");
 			NextBtn2().click();
 			Thread.sleep(2000);	
 			RemarksTxtBx().sendKeys("Test");
 			Thread.sleep(2000);	
 			//ForwardBtn().click();
 			
 			//ScrutinizeObservationNoteInspectionReport
 			utilobj.MoveElement(Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(Inspection(), driver);
			Thread.sleep(2000);	
			ScrutinizeObservationNoteInspectionReport().click();
			Thread.sleep(2000);	
			UnitType().sendKeys("Main Unit");
 			Thread.sleep(2000);	
 			SearchBtn().click();
}
		catch (Exception ex) {
			System.err.println(ex);
		}
		
		
	}

}
