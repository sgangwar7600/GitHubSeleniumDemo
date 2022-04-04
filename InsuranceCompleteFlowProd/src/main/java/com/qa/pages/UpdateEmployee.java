package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Browserfactory;

public class UpdateEmployee {
	
	
	WebDriver driver;

	public UpdateEmployee(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath=".//*[@id='ctl00_NavigationMenun7']/td/table/tbody/tr/td/a")
	WebElement UpdateEmployee;
	
	@FindBy(id="ctl00_HomePageContent_txtCodeNoAlloted")
	WebElement ESICCodeNumberOfEmployer;
	
	@FindBy(id="ctl00_HomePageContent_btnSearch")
	WebElement Search;
	
	@FindBy(id="ctl00_HomePageContent_btnEdit")
	WebElement Edit;
	
	@FindBy(id="ctl00_HomePageContent_txtNameOfFact_InitiatedReq")
	WebElement Nameofthe;
	
	@FindBy(id="ctl00_HomePageContent_txtAddress1_InitiatedReq")
	WebElement Address;
	
	@FindBy(id="ctl00_HomePageContent_txtPinCode_InitiatedReq")
	WebElement Pincode;
	
	@FindBy(id="ctl00_HomePageContent_ddlState_InitiatedReq")
	WebElement State;
	
	@FindBy(id="ctl00_HomePageContent_ddlDistrict_InitiatedReq")
	WebElement District;
	
	@FindBy(id="ctl00_HomePageContent_txtPoliceStation_InitiatedReq")
	WebElement PoliceStation;
	
	@FindBy(id="ctl00_HomePageContent_ddlConstOfOwnership")
	WebElement ConstitutionOfOwnership;
	
	@FindBy(id="ctl00_HomePageContent_hl_ProprietorDetails")
	WebElement ProprietorDetails;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_rdPEmployer")
	WebElement ProprietorDetailsRadioBtn;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_ddlDetails")
	WebElement ProprietorDetailsDrpDwn;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_txtName")
	WebElement ProprietorDetailsName;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_txtAge")
	WebElement ProprietorDetailsAge;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_txtDesignation")
	WebElement ProprietorDetailsDesignation;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_txtFatherName")
	WebElement ProprietorDetailsFatherName;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_txtPresent")
	WebElement ProprietorDetailsPresentAddress;
	
	@FindBy(id="ctl00_HomePageContent_gdvProprietorDetails_ctl03_txtPermanent")
	WebElement ProprietorDetailsPermanentAddress;
	
	@FindBy(id="ctl00_HomePageContent_btnSave")
	WebElement ProprietorDetailsSaveBtn;
	
	@FindBy(id="ctl00_HomePageContent_btnSave")
	WebElement ProprietorDetailsCloseBtn;
	
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_checkBoxAccDet")
	WebElement AccountChkBox;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtAccountNo")
	WebElement AccountNoTxtBx;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtBankName")
	WebElement NameOfBank;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtBranchName")
	WebElement NameOfBranch;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtmicr_code")
	WebElement MICRCodeOfBankBranch;
	
	@FindBy(id="ctl00_HomePageContent_gdvBankDetails_ctl02_txtifsc_code")
	WebElement IFSCCodeOfBankBranch;
	
	@FindBy(id="ctl00_HomePageContent_ddlBranchOffice_InitiatedReq")
	WebElement BranchOffice;

	@FindBy(id="ctl00_HomePageContent_ddlInspectionDivision_InitiatedReq")
	WebElement InspectionDivision;
	
	@FindBy(xpath=".//*[@id='ctl00_HomePageContent_btnSubmit']")
	WebElement submit;
	
	
	@FindBy(id="ctl00_HomePageContent_btnCancel")
	WebElement CancelBtn;
	
	public WebElement UpdateEmployee(){
		return UpdateEmployee;
	}
	
	public WebElement ESICCodeNumberOfEmployer(){
		return ESICCodeNumberOfEmployer;
	}
	
	public WebElement Search(){
		return Search;
	}
	
	public WebElement Edit(){
		return Edit;
	}
	
	public WebElement Nameofthe(){
		return Nameofthe;
	}
	
	public WebElement Address(){
		return Address;
	}
	
	public WebElement Pincode(){
		return Pincode;
	}
	
	public WebElement State(){
		return State;
	}
	
	public WebElement District(){
		return District;
	}
	
	public WebElement PoliceStation(){
		return PoliceStation;
	}
	
	public WebElement ConstitutionOfOwnership(){
		return ConstitutionOfOwnership;
	}
	
	public WebElement ProprietorDetails(){
		return ProprietorDetails;
	}
	
	public WebElement ProprietorDetailsRadioBtn(){
		return ProprietorDetailsRadioBtn;
	}
	
	public WebElement ProprietorDetailsDrpDwn(){
		return ProprietorDetailsDrpDwn;
	}
	
	public WebElement ProprietorDetailsName(){
		return ProprietorDetailsName;
	}
	
	public WebElement ProprietorDetailsAge(){
		return ProprietorDetailsAge;
	}
	
	public WebElement ProprietorDetailsDesignation(){
		return ProprietorDetailsDesignation;
	}
	
	public WebElement ProprietorDetailsFatherName(){
		return ProprietorDetailsFatherName;
	}
	
	public WebElement ProprietorDetailsPresentAddress(){
		return ProprietorDetailsPresentAddress;
	}
	
	public WebElement ProprietorDetailsPermanentAddress(){
		return ProprietorDetailsPermanentAddress;
	}
	
	public WebElement ProprietorDetailsSaveBtn(){
		return ProprietorDetailsSaveBtn;
	}
	
	public WebElement ProprietorDetailsCloseBtn(){
		return ProprietorDetailsCloseBtn;
	}
	
	public WebElement AccountChkBox(){
		return AccountChkBox;
	}
	
	public WebElement AccountNoTxtBx(){
		return AccountNoTxtBx;
	}
	
	public WebElement NameOfBank(){
		return NameOfBank;
	}
	
	public WebElement NameOfBranch(){
		return NameOfBranch;
	}
	
	public WebElement MICRCodeOfBankBranch(){
		return MICRCodeOfBankBranch;
	}
	
	public WebElement IFSCCodeOfBankBranch(){
		return IFSCCodeOfBankBranch;
	}
	
	public WebElement BranchOffice(){
		return BranchOffice;
	}
	
	public WebElement InspectionDivision(){
		return InspectionDivision;
	}
	
	
	public WebElement submit(){
		return submit;
	}

	public WebElement CancelBtn(){
		return CancelBtn;
	}

	
}
