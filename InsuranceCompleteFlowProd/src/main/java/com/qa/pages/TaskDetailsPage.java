package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class TaskDetailsPage {
Utility utilobj = new Utility();
	

	WebDriver driver;

	public TaskDetailsPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;
	
	// Actions action = new Actions(driver);
	 
	 @FindBy(xpath=".//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img")
	 WebElement registr;
	 
	 @FindBy(linkText="Task Details")
	 WebElement TaskDetails;
	
	 /*Form 01 Approval*/
	 
	 @FindBy(id="ctl00_HomePageContent_GridViewTasks_ctl02_ctrlLinkBtnTask" )
		WebElement FormApprovalLink;
	 
	 @FindBy(id="ctl00_HomePageContent_ctrlGridViewTasks_ctl03_linkbtnMainDetails" )
		WebElement AssignedTaskTypeLink;
		
	 @FindBy(id="ctl00_HomePageContent_btnNext" )
		WebElement NextBtn;
		
	 @FindBy(id="ctl00_HomePageContent_btnReject" )
		WebElement ForwardBtn;
	 
	 @FindBy(id="ctl00_HomePageContent_txtRemarks" )
		WebElement RemarksTextBox;
	 
	 @FindBy(id="ctl00_HomePageContent_btnGo_Success" )
		WebElement OkBtn;
		
	 @FindBy(id="ctl00_HomePageContent_btnCancel" )
		WebElement CancelBtn;
		
		/*Change Request Submitted By an Employer*/
 
	 @FindBy(id="ctl00_HomePageContent_GridViewTasks_ctl03_ctrlLinkBtnTask" )
		WebElement ChangeRequestSubmittedbyanemployerLink ;
	
	 @FindBy(id="ctl00_HomePageContent_ctrlGridViewTasks_ctl02_linkbtnMainDetails" )
		WebElement AssignedTaskTypeChangeRequest ;
	 
	 @FindBy(id="ctl00_HomePageContent_txtRemarks" )
		WebElement RemarksChangeRequest ;
	 
	 @FindBy(id="ctl00_HomePageContent_btnDAForward" )
		WebElement ForwardChangeRequest ;
	 
	
	 /*Sub-Unit Registration Submitted*/	 
	
	 @FindBy(id="ctl00_HomePageContent_GridViewTasks_ctl04_ctrlLinkBtnTask" )
		WebElement SubUnitRegistrationSubmittedLink ;
	 
	 @FindBy(id="ctl00_HomePageContent_ctrlGridViewTasks_ctl02_linkbtnMainDetails" )
		WebElement AssignedTaskTypeSubUnitRegistration ;
	 
	 
	 public WebElement  Close(){
			return  Close;
		}
		
		public WebElement registr(){
			return registr;
		}
		
		public WebElement TaskDetails(){
			return TaskDetails;
		}
		
		 /*Form 01 Approval*/
		
		public WebElement FormApprovalLink(){
			return FormApprovalLink;
		}
		
		public WebElement AssignedTaskTypeLink(){
			return AssignedTaskTypeLink;
		}

		public WebElement NextBtn(){
			return NextBtn;
		}
		
		public WebElement ForwardBtn(){
			return ForwardBtn;
		}
		
		public WebElement RemarksTextBox(){
			return RemarksTextBox;
		}
		
		public WebElement CancelBtn(){
			return CancelBtn;
		}
		
		public WebElement OkBtn(){
			return OkBtn;
		}
		
		/*Change Request Submitted By an Employer*/

		public WebElement ChangeRequestSubmittedbyanemployerLink(){
			return ChangeRequestSubmittedbyanemployerLink;
		}
		
		public WebElement AssignedTaskTypeChangeRequest(){
			return AssignedTaskTypeChangeRequest;
		}
		
		public WebElement RemarksChangeRequest(){
			return RemarksChangeRequest;
		}
		
		public WebElement ForwardChangeRequest(){
			return ForwardChangeRequest;
		}
		
		 /*Sub-Unit Registration Submitted*/	
		
		public WebElement SubUnitRegistrationSubmittedLink(){
			return SubUnitRegistrationSubmittedLink;
		}
		
		public WebElement AssignedTaskTypeSubUnitRegistration(){
			return AssignedTaskTypeSubUnitRegistration;
		}
		

	public void doNavigateToTaskDetailsPage() throws InterruptedException {
	
			Close().click();
			utilobj.MoveElement(registr(), driver);
			TaskDetails().click();
			
			 /*Form 01 Approval*/
			
			FormApprovalLink().click();
			Thread.sleep(2000);
			AssignedTaskTypeLink().click();
			Thread.sleep(2000);

			NextBtn().click();
			Thread.sleep(2000);
			NextBtn().click();
			Thread.sleep(2000);
			NextBtn().click();
			Thread.sleep(2000);
			RemarksTextBox().sendKeys("Test test");
			Thread.sleep(2000);
			//ForwardBtn().click();
			Thread.sleep(2000);
			//OkBtn().click();
			Thread.sleep(2000);
			CancelBtn().click();
			
			/*Change Request Submitted By an Employer*/
			
			utilobj.MoveElement(registr(), driver);
			TaskDetails().click();
			Thread.sleep(2000);
			ChangeRequestSubmittedbyanemployerLink().click();
			Thread.sleep(2000);
			AssignedTaskTypeChangeRequest().click();
			Thread.sleep(2000);
			RemarksChangeRequest().sendKeys("Test test");
			Thread.sleep(2000);
			//ForwardChangeRequest().click();
			Thread.sleep(2000);
			CancelBtn().click();
			
			 /*Sub-Unit Registration Submitted*/
			
			utilobj.MoveElement(registr(), driver);
			TaskDetails().click();
			Thread.sleep(2000);
			SubUnitRegistrationSubmittedLink().click();
			Thread.sleep(2000);
			AssignedTaskTypeSubUnitRegistration().click();
			Thread.sleep(2000);
			NextBtn().click();
			Thread.sleep(2000);
			RemarksChangeRequest().sendKeys("Test test");
			Thread.sleep(2000);

			//ForwardChangeRequest().click();
			
			Thread.sleep(2000);
            CancelBtn().click();
			
		
	}
}
