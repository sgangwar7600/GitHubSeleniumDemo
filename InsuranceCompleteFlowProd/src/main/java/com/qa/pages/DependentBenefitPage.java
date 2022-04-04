package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DependentBenefitPage {

	WebDriver driver;

	public DependentBenefitPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Upload Alternate Death Certificate
	
	@FindBy(linkText ="Upload Certificates")
	WebElement UploadCertificates;
	
	@FindBy(id ="ctl00_HomePageContent_HyperLink3")
	WebElement UploadAlternateDeathCertificate;
	
	@FindBy(id ="ctl00_HomePageContent_lblIpNum")
	WebElement IpNoTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_deathdt")
	WebElement DateOfDeath;
	
	@FindBy(id ="ctl00_HomePageContent_CECtrlTxtFrm_prevArrow")
	WebElement DateOfDeathPrevArrow;
	
	@FindBy(id ="ctl00_HomePageContent_CECtrlTxtFrm_day_1_3")
	WebElement SelectDateOfDeath;
	
	@FindBy(id ="ctl00_HomePageContent_txtReason")
	WebElement CauseOfDeath;
	
	@FindBy(id ="ctl00_HomePageContent_txtmedname")
	WebElement MedicalOfficerName;
	
	@FindBy(id ="ctl00_HomePageContent_issuedt")
	WebElement DateOfIssue;
	
	@FindBy(id ="ctl00_HomePageContent_CalendarExtender1_prevArrow")
	WebElement DateOfIssuePrevArrow;
	
	@FindBy(id ="ctl00_HomePageContent_CalendarExtender1_day_4_2")
	WebElement SelectDateOfIssue;
	
	@FindBy(id ="ctl00_HomePageContent_MyFile")
	WebElement BrowseFile;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitBtn;
	
	@FindBy(id ="ctl00_HomePageContent_reset")
	WebElement ResetBtn;
	
	public WebElement UploadCertificates() {
		return UploadCertificates;
	}
	
	public WebElement UploadAlternateDeathCertificate() {
		return UploadAlternateDeathCertificate;
	}

	public WebElement IpNoTxtBx() {
		return IpNoTxtBx;
	}
	public WebElement DateOfDeath() {
		return DateOfDeath;
	}
	
	public WebElement DateOfDeathPrevArrow() {
		return DateOfDeathPrevArrow;
	}
	
	public WebElement SelectDateOfDeath() {
		return SelectDateOfDeath;
	}
	
	public WebElement CauseOfDeath() {
		return CauseOfDeath;
	}
	
	public WebElement MedicalOfficerName() {
		return MedicalOfficerName;
	}
	
	public WebElement DateOfIssue() {
		return DateOfIssue;
	}
	
	public WebElement DateOfIssuePrevArrow() {
		return DateOfIssuePrevArrow;
	}
	
	public WebElement SelectDateOfIssue() {
		return SelectDateOfIssue;
	}
	
	public WebElement BrowseFile() {
		return BrowseFile;
	}
	
	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement ResetBtn() {
		return ResetBtn;
	}
	
	//DB Form 16 Claim
	

	@FindBy(id="ctl00_HomePageContent_DependantGrid_ctl02_rbtnSelect")
	WebElement  SelectDependent;
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement CreateClaim;
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement submit;
	
	@FindBy(xpath=".//*[@id='ctl00_HomePageContent_filLivCert']")
	WebElement Browsefile;
	
	
	 public void Select_List(WebElement element, String text) throws InterruptedException {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);

		}
	 
	 public WebElement SelectDependent(){
		 return SelectDependent;
	 }
	 
	 
	 public WebElement CreateClaim(){
		 return CreateClaim;
	 }
	 
	 public WebElement submit(){
		 return submit;
	 }
	 
	 
	 public WebElement Browsefile(){
		 return Browsefile;
	 }
	
	//DB Create Claim
		
		@FindBy(name="rbtnSelect1")
		WebElement dependent;
		
		@FindBy(id="ctl00_HomePageContent_addDependant")
		WebElement AddDependent;
		
		@FindBy(id="ctl00_HomePageContent_txtdep")
		WebElement DepaendentName;
		
		@FindBy(id="ctl00_HomePageContent_add1txt")
		WebElement Address;
		
		@FindBy(id="ctl00_HomePageContent_pintxt")
		WebElement pincode;
		
		@FindBy(id="ctl00_HomePageContent_TextBox8")
		WebElement Remark;
		
		@FindBy(id="ctl00_HomePageContent_Button1")
		WebElement submit1;
		
	
		public WebElement dependent(){
			return dependent;
		}
		
		
		public WebElement AddDependent(){
			return AddDependent;
		}
		
		public WebElement DepaendentName(){
			return DepaendentName;
		}
		
		public WebElement Address(){
			return Address;
		}
		
		public WebElement pincode(){
			return pincode;
		}
		
		public WebElement Remark(){
			return Remark;
		}
		
		public WebElement submit1(){
			return submit1;
		}
		
		
			
	//DB Claim Processing
		@FindBy(linkText ="Process a Claim or Request")
		WebElement ProcessAClaim;
		
		@FindBy(partialLinkText ="Dependant Benefit Claim Processing") //For Production
		WebElement DBClaimProcessingLink;
		
		
		@FindBy(xpath =".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td[2]/a")
		WebElement Page2;
		
		/*@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl04_taskLink")
		WebElement AssignedTaskId;
		*/
		@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")
		WebElement AssignedTaskId;
		
		@FindBy(id ="ctl00_HomePageContent_next")
		WebElement NextBtn;

		
		@FindBy(id ="ctl00_HomePageContent_txtRemarks")
		WebElement RemarksTxtBx;
		
		@FindBy(id ="ctl00_HomePageContent_timebared")
		WebElement BrowseBtn;
		
		@FindBy(id ="ctl00_HomePageContent_submit")
		WebElement SubmitToBM;
		
		@FindBy(id ="ctl00_HomePageContent_cancel")
		WebElement CancelBtn;
		
		public WebElement ProcessAClaim() {
			return ProcessAClaim;
		}
		
		public WebElement DBClaimProcessingLink() {
			return DBClaimProcessingLink;
		}

		public WebElement Page2() {
			return Page2;
		}

		public WebElement AssignedTaskId() {
			return AssignedTaskId;
		}
		
		public WebElement NextBtn() {
			return NextBtn;
		}
		
		public WebElement RemarksTxtBx() {
			return RemarksTxtBx;
		}
		
		public WebElement BrowseBtn() {
			return BrowseBtn;
		}
		
		public WebElement SubmitToBM() {
			return SubmitToBM;
		}
		
		public WebElement CancelBtn() {
			return CancelBtn;
		}

		
	//BM Login
		
		@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")
		WebElement BMAssignedTaskId;
		
		public WebElement BMAssignedTaskId() {
			return BMAssignedTaskId;
		}

	//BBO Login
		
		@FindBy(partialLinkText ="Dependant Benefit Request Processing") //For Production
		WebElement DBRequestProcessingLink;
		
		@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl18_taskLink")
		WebElement BBOAssignedTaskId;
		
		@FindBy(id ="ctl00_HomePageContent_txtRemk")
		WebElement BBORemarksTxtBx;
		
		@FindBy(id ="ctl00_HomePageContent_hlinkGen101")
		WebElement GenerateESIC101;


		@FindBy(id ="ctl00_HomePageContent_btnApprove")
		WebElement SubmitBtnBBO;

		@FindBy(id ="ctl00_HomePageContent_btnCancel")
		WebElement BBOCancelBtn;

		@FindBy(id ="ctl00_HomePageContent_btnClose")
		WebElement BBOCloseBtn;

		@FindBy(id ="ctl00_HomePageContent_rblROHQApproveReject_0")
		WebElement BBOApproveRadioBtn;

		@FindBy(id ="ctl00_HomePageContent_rblROHQApproveReject_1")
		WebElement BBORejectRadioBtn;

		public WebElement DBRequestProcessingLink() {
			return DBRequestProcessingLink;
		}
		
		public WebElement BBORemarksTxtBx() {
			return BBORemarksTxtBx;
		}
		
		public WebElement GenerateESIC101() {
			return GenerateESIC101;
		}
		
		public WebElement BBOCancelBtn() {
			return BBOCancelBtn;
		}
		
		public WebElement BBOCloseBtn() {
			return BBOCloseBtn;
		}
		
		public WebElement BBOApproveRadioBtn() {
			return BBOApproveRadioBtn;
		}
		
		public WebElement BBORejectRadioBtn() {
			return BBORejectRadioBtn;
		}
		
		public WebElement SubmitBtnBBO() {
			return SubmitBtnBBO;
		}
		
		//F&A Login
		
		@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")
		WebElement FAAssignedTaskId;
		
		@FindBy(id ="ctl00_HomePageContent_rblFAApproveReject_0")
		WebElement FAApproveRadioBtn;

		@FindBy(id ="ctl00_HomePageContent_rblFAApproveReject_1")
		WebElement FARejectRadioBtn;
		
		public WebElement FAAssignedTaskId() {
			return FAAssignedTaskId;
		}
		
		public WebElement FAApproveRadioBtn() {
			return FAApproveRadioBtn;
		}
		
		public WebElement FARejectRadioBtn() {
			return FARejectRadioBtn;
		}
}
