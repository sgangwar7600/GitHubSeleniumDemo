package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MaternityBenefitPage {
	WebDriver driver;

	public MaternityBenefitPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Upload Certificates")
	WebElement UploadCertificates;
	
	@FindBy(id ="ctl00_HomePageContent_HyperLink6")
	WebElement MaternityForm18Certificate;
	
	@FindBy(id ="ctl00_HomePageContent_txtIpNo")
	WebElement IpNoTextBox;
	
	@FindBy(id ="ctl00_HomePageContent_rbtnConfType_1")
	WebElement ConfinementType;
	
	@FindBy(id ="ctl00_HomePageContent_rbtnConfType_0")
	WebElement ExpectedConfinementType;
	
	@FindBy(id ="ctl00_HomePageContent_rbtnConfType_2")
	WebElement MiscarriageRadioBtn;
	
	@FindBy(id ="ctl00_HomePageContent_txtIssueDate")
	WebElement IssueDate;
	
	@FindBy(id ="ctl00_HomePageContent_txtImo")
	WebElement IMOName;
	
	@FindBy(id ="ctl00_HomePageContent_calIssueDate_prevArrow")
	WebElement IssueDatePreviosArrow;
	
	@FindBy(id ="ctl00_HomePageContent_calIssueDate_day_1_4")
	WebElement SelectIssueDate;
	
	@FindBy(id ="ctl00_HomePageContent_txtExDt")
	WebElement ExpectedDate;
	
	@FindBy(id ="ctl00_HomePageContent_calExpDate_nextArrow")
	WebElement ExpectedDateNextArrow;
	
	@FindBy(id ="ctl00_HomePageContent_calExpDate_day_2_6")
	WebElement SelectExpectedDate;
	
	@FindBy(id ="ctl00_HomePageContent_txtRemarks")
	WebElement RemarksTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_Submit")
	WebElement SubmitBtn;
	
	@FindBy(id ="btnCancel")
	WebElement CancelBtn;
	
	@FindBy(id ="ctl00_HomePageContent_HyperLink7")
	WebElement MaternityForm21Certificate;
	
	@FindBy(id ="ctl00_HomePageContent_txtIWDeathDt")
	WebElement DeathDate;
	
	@FindBy(id ="ctl00_HomePageContent_calIWDeathDt_prevArrow")
	WebElement DeathDatePreviouArrow;
	
	@FindBy(id ="ctl00_HomePageContent_calIWDeathDt_day_1_4")
	WebElement SelectDeathDate;
	
	@FindBy(id ="ctl00_HomePageContent_txtIWCause")
	WebElement CauseOfDeath;
	
	@FindBy(id ="ctl00_HomePageContent_txtWeeks")
	WebElement ConfinemextTextBox;
	
	@FindBy(id ="ctl00_HomePageContent_txtPresDt")
	WebElement LastDate;
	
	@FindBy(id ="ctl00_HomePageContent_calPresDt_prevArrow")
	WebElement LastDatePreviousArrow;
	
	@FindBy(id ="ctl00_HomePageContent_calPresDt_day_1_3")
	WebElement SelectLastDate;
	

	
	
	
	public WebElement UploadCertificates() {
		return UploadCertificates;
	}
	
	public WebElement MaternityForm18Certificate() {
		return MaternityForm18Certificate;
	}
	
	public WebElement ConfinementType() {
		return ConfinementType;
	}
	
	public WebElement ExpectedConfinementType() {
		return ExpectedConfinementType;
	}
	
	public WebElement MiscarriageRadioBtn() {
		return MiscarriageRadioBtn;
	}
	
	public WebElement IpNoTextBox() {
		return IpNoTextBox;
	}
	
	public WebElement IssueDate() {
		return IssueDate;
	}
	
	public WebElement IMOName() {
		return IMOName;
	}
	
	public WebElement IssueDatePreviosArrow() {
		return IssueDatePreviosArrow;
	}
	
	public WebElement SelectIssueDate() {
		return SelectIssueDate;
	}
	
	public WebElement ExpectedDate() {
		return ExpectedDate;
	}
	
	public WebElement ExpectedDateNextArrow() {
		return ExpectedDateNextArrow;
	}
	
	public WebElement SelectExpectedDate() {
		return SelectExpectedDate;
	}
	
	public WebElement RemarksTxtBx() {
		return RemarksTxtBx;
	}
	
	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement CancelBtn() {
		return CancelBtn;
	}
	
	public WebElement MaternityForm21Certificate() {
		return MaternityForm21Certificate;
	}
	
	public WebElement DeathDate() {
		return DeathDate;
	}
	
	public WebElement DeathDatePreviouArrow() {
		return DeathDatePreviouArrow;
	}
	
	public WebElement SelectDeathDate() {
		return SelectDeathDate;
	}
	
	public WebElement CauseOfDeath() {
		return CauseOfDeath;
	}
	
	public WebElement ConfinemextTextBox() {
		return ConfinemextTextBox;
	}
	
	public WebElement LastDate() {
		return LastDate;
	}
	
	public WebElement LastDatePreviousArrow() {
		return LastDatePreviousArrow;
	}
	
	public WebElement SelectLastDate() {
		return SelectLastDate;
	}
	
//Create Claim MB Form 19
	@FindBy(id="ctl00_HomePageContent_txtdepttshift")
	WebElement DepartMentShift;
	
	@FindBy(id="ctl00_HomePageContent_txtoccupation")
	WebElement Occupation;
	
	@FindBy(id="ctl00_HomePageContent_txtbranchofficename")
	WebElement BranchName;
	
	@FindBy(id="ctl00_HomePageContent_lnkCreateAcknowledgement")
	WebElement CreateAckn;
	
	@FindBy(id="ctl00_HomePageContent_txtRemarks")
	WebElement remark;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement Genrate;
	
	@FindBy(id="ctl00_HomePageContent_btnCancel")
	WebElement Back;
	
	@FindBy(id="ctl00_HomePageContent_lnkSelectAck")
	WebElement SelectACK;
	
	@FindBy(id="ctl00_HomePageContent_grvSelectAck_ctl15_chkSelectAck")
	WebElement selradiobutton;
	
	@FindBy(id="ctl00_HomePageContent_btnSubmit")
	WebElement Submit1;
	
	@FindBy(id="ctl00_HomePageContent_submit")
	WebElement Submit2;
	
	
	public void Select_List(WebElement element, String text) throws InterruptedException {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}
	
	
	
	public WebElement DepartMentShift(){
		return DepartMentShift;
	}
	
	public WebElement  Occupation(){
		return  Occupation;
	}
	
	public WebElement BranchName(){
		return BranchName;
	}
	
	public WebElement CreateAckn(){
		return CreateAckn;	
	}
	
	
	public WebElement remark(){
		return remark;
	}
	
	public WebElement Genrate(){
		return Genrate;
	}
	
	public WebElement Back(){
		return Back;
	}
	
	public WebElement SelectACK(){
		return SelectACK;
	}
	
	public WebElement selradiobutton(){
		return selradiobutton;
	}
	
	public WebElement Submit1(){
		return Submit1;
	}
	
	public WebElement Submit2(){
		return Submit2;
	}
	

	//Create Claim MB Form 20
	

	@FindBy(id ="ctl00_HomePageContent_lnkCreateAcknowledgement")
	WebElement CreateAcknowledge;
	
	@FindBy(id ="ctl00_HomePageContent_ddlClaimType")
	WebElement ClaimType;

	@FindBy(xpath =".//*[@id='ctl00_HomePageContent_ddlClaimType']/option[7]")
	WebElement ClaimTypeForm20;
	
	@FindBy(id = "ctl00_HomePageContent_txtRemarks")
	WebElement Remark;

	@FindBy(id = "ctl00_HomePageContent_lnkSelectAck")
	WebElement SelectAcknowledgement;

	@FindBy(id = "ctl00_HomePageContent_grvSelectAck_ctl02_chkSelectAck")
	WebElement SelectRadiobutton;

	@FindBy(id = "ctl00_HomePageContent_btnSubmit")
	WebElement Submit20;

	@FindBy(id = "ctl00_HomePageContent_submit")
	WebElement Submit21;

	public WebElement CreateAcknowledge() {
		return CreateAcknowledge;
	}
	
	public WebElement ClaimType() {
		return ClaimType;
	}

	public WebElement ClaimTypeForm20() {
		return ClaimTypeForm20;
	}
	
	public WebElement Remark() {
		return Remark;
	}

	public WebElement SelectAcknowledgement() {
		return SelectAcknowledgement;
	}

	public WebElement SelectRadiobutton() {
		return SelectRadiobutton;
	}

	public WebElement Submit20() {
		return Submit1;
	}

	public WebElement Submit21() {
		return Submit2;
	}

//Claim Processing
	
	@FindBy(linkText ="Process a Claim or Request")
	WebElement ProcessAClaim;
	
	@FindBy(partialLinkText ="Maternity Benefit Claim Processing ")
	WebElement MBClaimProcessingLink;
	
	@FindBy(xpath =".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td[2]/a")
	WebElement Page2;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl16_taskLink")
	WebElement AssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_BenfitTasklist_ctl06_taskLink")
	WebElement BMAssignedTaskId;
	
	@FindBy(id ="ctl00_HomePageContent_Button2")
	WebElement NextBtn;
	
	@FindBy(id ="ctl00_HomePageContent_Button3")
	WebElement NextBtn2;
	
	@FindBy(id ="ctl00_HomePageContent_txtremarks")
	WebElement RemarksTxtBx2;
	
	@FindBy(id ="ctl00_HomePageContent_UploadMBReason")
	WebElement BrowseBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnSubmit")
	WebElement SubmitToBM;
	
	@FindBy(id ="ctl00_HomePageContent_btnPaymentDocket")
	WebElement BMApproveBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnReject")
	WebElement BMRejectBtn;
	
	@FindBy(id ="ctl00_HomePageContent_Button3")
	WebElement CancelBtn2;
	
	public WebElement ProcessAClaim() {
		return ProcessAClaim;
	}
	
	public WebElement MBClaimProcessingLink() {
		return MBClaimProcessingLink;
	}

	public WebElement Page2() {
		return Page2;
	}

	public WebElement AssignedTaskId() {
		return AssignedTaskId;
	}
	
	public WebElement BMAssignedTaskId() {
		return BMAssignedTaskId;
	}
	
	public WebElement NextBtn() {
		return NextBtn;
	}
	
	public WebElement NextBtn2() {
		return NextBtn2;
	}
	
	public WebElement RemarksTxtBx2() {
		return RemarksTxtBx2;
	}
	
	public WebElement BrowseBtn() {
		return BrowseBtn;
	}
	
	public WebElement SubmitToBM() {
		return SubmitToBM;
	}
	
	public WebElement BMApproveBtn() {
		return BMApproveBtn;
	}
	
	public WebElement BMRejectBtn() {
		return BMRejectBtn;
	}
	
	public WebElement CancelBtn2() {
		return CancelBtn2;
	}

	//Extension Maternity Benefit from 84 to 126 days
	
	@FindBy(xpath =".//*[@id='ctl00_NavigationMenun32']/td/table/tbody/tr/td/a")
	WebElement MBApprovalForBM;
	
	@FindBy(id ="ctl00_HomePageContent_txtIPNo")
	WebElement IPNoTxtBx;
	
	@FindBy(id ="ctl00_HomePageContent_btnSearch")
	WebElement SearchBtn;
	
	@FindBy(id ="ctl00_HomePageContent_btnApprove")
	WebElement ApproveBtn;
	
	@FindBy(xpath =".//*[@id='ctl00_NavigationMenun24']/td/table/tbody/tr/td/a")
	WebElement LedgerSheet;
	
	@FindBy(id ="ctl00_HomePageContent_btnSubmit")
	WebElement LedgerSubmitBtn;
	
	public WebElement MBApprovalForBM() {
		return MBApprovalForBM;
	}
	
	public WebElement IPNoTxtBx() {
		return IPNoTxtBx;
	}
	
	public WebElement SearchBtn() {
		return SearchBtn;
	}
	
	public WebElement ApproveBtn() {
		return ApproveBtn;
	}
	
	public WebElement LedgerSheet() {
		return LedgerSheet;
	}
	
	public WebElement LedgerSubmitBtn() {
		return LedgerSubmitBtn;
	}
}
