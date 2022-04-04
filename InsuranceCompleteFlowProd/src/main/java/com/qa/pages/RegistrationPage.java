package com.qa.pages;

import javax.xml.ws.WebEndpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="ctl00_HomePageContent_btnClose" )
	WebElement Close;

	// Actions action = new Actions(driver);
	
	//No

	@FindBy(id="ctl00_HomePageContent_ctrlDIDateOfAppointmentDy")
	WebElement DateOfAppointmentNo;

	@FindBy(id="ctl00_HomePageContent_cEDOA_prevArrow")
	WebElement DateOfAppointmentPreviousArrowNo;

	@FindBy(id="ctl00_HomePageContent_cEDOA_day_4_5")
	WebElement SelectDateOfAppointmentno;
	
	@FindBy(id="ctl00_HomePageContent_btnAgree")
	WebElement NoAgreeBtn;
//
	
	@FindBy(xpath=" .//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img")
	WebElement registr;

	@FindBy(xpath=".//*[@id='ctl00_NavigationMenun6']/td/table/tbody/tr/td/a")
	WebElement RegisterNewEmployee;

	@FindBy(id="ctl00_HomePageContent_txtEmployerCode")
	WebElement EmployerCode;

	@FindBy(id="ctl00_HomePageContent_rbtnlistIsregistered_0")
	WebElement RegistrationYesRadioBtn;

	@FindBy(id="ctl00_HomePageContent_ctrlTxtIPNumber")
	WebElement InsuranceNoTxtBx;

	@FindBy(id="ctl00_HomePageContent_ctrlTxtAppointmentDate")
	WebElement DateOfAppointment;

	@FindBy(id="ctl00_HomePageContent_cEDOA_prevArrow")
	WebElement DateOfAppointmentPreviousArrow;

	@FindBy(id="ctl00_HomePageContent_cEDOA_day_3_4")
	WebElement SelectDateOfAppointment;

	@FindBy(id="ctl00_HomePageContent_btnAgree")
	WebElement AgreeButton;

	@FindBy(id="ctl00_HomePageContent_rbtnlistIsregistered_1")
	WebElement allottedESINumber;

	@FindBy(id="ctl00_HomePageContent_txtmobilenumber")
	WebElement MobileNumber;

	@FindBy(id="ctl00_HomePageContent_lnkmobilecheck")
	WebElement ValidateMobileNumber;

	@FindBy(xpath="/html/body/form/div[3]/table[2]/tbody/tr[2]/td/div/div/table/tbody/tr/td/div[1]/div[3]/div/input[1]")
	WebElement Continue;
	

	@FindBy(id="ctl00_HomePageContent_btnContinue")
	WebElement ContinueBtn;

	//For Yes
	@FindBy(id="ctl00_HomePageContent_rdRegistrationDetails")
	WebElement NameRadioBtn;

	@FindBy(id="ctrlTextUserName")
	WebElement UserNameTxtBx;

	@FindBy(id="RelationShipWithIp")
	WebElement RelationShipWithIp;

	@FindBy(id="ctrlTextAddress1")
	WebElement IpAddress;

	@FindBy(id="ddlStates")
	WebElement StateDrpDwn;

	@FindBy(id="ddlDistricts")
	WebElement DistrictDrpDwn;

	@FindBy(id="ctrlTextPin")
	WebElement PinCode;

	
	@FindBy(id="dec_chkbox_nom")
	WebElement DeclarationCheckBox;

	@FindBy(id="ctrlButtonSave")
	WebElement UpdateBtn;

	@FindBy(id="close_btn")
	WebElement CloseBtn;
	
	


	//Address Details
	@FindBy(id="ctl00_HomePageContent_rdAddressDetails")
	WebElement AddressDetailsRadioBtn;

	@FindBy(id="ctrlTextPresentAddress1")
	WebElement AddressTextBox;

	@FindBy(id="ctrlTxtPresentPinCode")
	WebElement PinCodeTextBox;

	@FindBy(id="ctrlTxtPresentState")
	WebElement StateTextBox;

	@FindBy(id="lnkmobileedit")
	WebElement MobileNoEditButton;

	@FindBy(id="ctrlTextPresentMobileNo")
	WebElement MobileNoTextBox;

	@FindBy(id="lnkmobilecheck")
	WebElement ValidateMobileNoLink;
	
	@FindBy(id="btnmobile")
	WebElement ValidateMobileNoProceed;

	@FindBy(id="ctrlTextPresentDistrict")
	WebElement DistrictTextBox;

	@FindBy(id="chkboxCopyPresentAddress")
	WebElement PresentAddressAsPermntCheckBox;

	@FindBy(id="dec_chkbox_Add")
	WebElement AddressDeclarationCheckBox;

	@FindBy(id="close_btn")
	WebElement AddressCloseBtn;



	//Personal Details
	@FindBy(id="ctl00_HomePageContent_rdPersonalDetails")
	WebElement PersonalDetailsRadioBtn;

	@FindBy(id="ctrlTxtIpDate")
	WebElement DateOfBirth;

	@FindBy(id="cEDOA_day_1_2")
	WebElement SelectDateOfBirth;

	@FindBy(id="ctrlTextFatherHusName")
	WebElement FatherName;

	@FindBy(id="ctrlRDMarried")
	WebElement MaritalStatusDrpDwn;

	@FindBy(id="ctrlRDMale_0")
	WebElement GenderRadioBtn;

	@FindBy(id="dec_chkbox_per")
	WebElement perDeclarationChkBx;

	@FindBy(id="ctrlButtonSave")
	WebElement perUpdateBtn;

	@FindBy(id="close_btn")
	WebElement perCancelBtn;
	//


	//
	@FindBy(id="ctl00_HomePageContent_ctrlTextEmpName")
	WebElement Name;

	@FindBy(id="ctl00_HomePageContent_ctrlTextFatherHusName")
	WebElement Fathername;

	@FindBy(id="ctl00_HomePageContent_ctrlTextPresentAddress1")
	WebElement Address;

	@FindBy(id="ctl00_HomePageContent_ctrlTxtPresentPinCode")
	WebElement pincode;

	@FindBy(id="ctl00_HomePageContent_chkboxCopyPresentAddress")
	WebElement CopyPresentAdderss;

	@FindBy(xpath=".//*[@id='Tr11']/td[2]/a")
	WebElement DetailsofNominee ;

	@FindBy(id="ctl00_HomePageContent_rdNomineeDetails")
	WebElement NomineeDetailsRadioBtn;

	@FindBy(id="ctl00_HomePageContent_ctrlTextUserName")
	WebElement NameOfNominee;

	@FindBy(id="ctl00_HomePageContent_ctrlTextAddress1")
	WebElement NomineeAddress;

	@FindBy(id="ctl00_HomePageContent_Save")
	WebElement save;

	@FindBy(id="ctl00_HomePageContent_rbtnlistNomneeAkaFamily_0")
	WebElement yes;

	@FindBy(id="ctl00_HomePageContent_btnClose")
	WebElement Close1;

	//Family Details
	@FindBy(id="ctl00_HomePageContent_rdFamilyDetails")
	WebElement FamilyDetailsRadioBtn;


	@FindBy(xpath=".//*[@id='Tr12']/td[2]/a")
	WebElement FamilyParticularsofInsuredPerson;

	@FindBy(id="ctl00_HomePageContent_txtName")
	WebElement FamilyName;

	@FindBy(id="ctl00_HomePageContent_ctrlButtonSave")
	WebElement Submit;

	@FindBy(id="ctl00_HomePageContent_ctrlRDIpDisable_0")
	WebElement Residence;

	@FindBy(xpath=".//*[@value='Close']")
	WebElement Close2;
	
	@FindBy(id="close_btn")
	WebElement close;
	
	//Family Details for Yes Radio Btn
	
	@FindBy(id="ctl00_HomePageContent_rdFamilyDetails")
	WebElement FamilyDetailsRadioBtnYes;

	@FindBy(id="txtName")
	WebElement FamilyDetailsNameTxtBx;

	@FindBy(id="CtrlDOB")
	WebElement FamilyDetailsDOB;
	
	@FindBy(id="cEDOA_title")
	WebElement FamilyDetailsSelectTitle;
	
	@FindBy(id="cEDOA_prevArrow")
	WebElement FamilyDetailsPreviosBtn;
	
	@FindBy(id="cEDOA_year_0_0")
	WebElement FamilyDetailsSelectYear;
	
	@FindBy(id="cEDOA_month_0_0")
	WebElement FamilyDetailsSelectMonth;
	
	@FindBy(id="cEDOA_day_1_3")
	WebElement FamilyDetailsSelectDay;
	
	@FindBy(id="CtrlRelation")
	WebElement FamilyDetailsRelationDrpDwn;

	@FindBy(id="ctrlRDIpDisable_1")
	WebElement FamilyDetailsNoRadioBtn;
	
	@FindBy(id="ctrlTextPermanentState")
	WebElement FamilyDetailsPermanentStateDrpDwn;
	
	@FindBy(id="ctrlTextPermanentDistrict")
	WebElement FamilyDetailsPermanentDistrictDrpDwn;
	
	@FindBy(id="Update_family_det")
	WebElement UpdateFamilyDetailsBtn;
	
	@FindBy(id="ctrlButtonAdd")
	WebElement AddButton;

//Bank details
	@FindBy(xpath=".//*[@id='Tr18']/td[2]/a")
	WebElement DetailsofBankAccountsofInsuredPerson;

	@FindBy(id="ctl00_HomePageContent_txtIFSCcode")
	WebElement IFSCCode;

	@FindBy(id="ctl00_HomePageContent_btnIFSCcode")
	WebElement Search; 

	@FindBy(id="ctl00_HomePageContent_txtacc_number")
	WebElement AccountNo;

	@FindBy(id="ctl00_HomePageContent_btnsubmit")
	WebElement submitButton;

	@FindBy(id="ctl00_HomePageContent_dec_chkbox")
	WebElement termscondition;

	@FindBy(id="ctl00_HomePageContent_Submit")
	WebElement submit;
	
	//Bank Details for Yes RadioBtn
	
	@FindBy(id="ctl00_HomePageContent_rdBankDetails")
	WebElement BankDetailsRadioBtn;

	@FindBy(id="ctl00_HomePageContent_txtIFSCcode")
	WebElement IFSCcodeTextBox;

	@FindBy(id="ctl00_HomePageContent_btnIFSCcode")
	WebElement IFSCcodeSeasrchBtn;

	@FindBy(id="ctl00_HomePageContent_txtacc_number")
	WebElement AccountNoTextBox;

	@FindBy(id="ctl00_HomePageContent_ddlAccountType")
	WebElement AccountTypeDrpDwn;

	@FindBy(id="ctl00_HomePageContent_btnsubmit")
	WebElement BankDetailsSubmitBtn;
	
	@FindBy(id="btnCancel")
	WebElement BankDetailsCancelBtn;

	

	public void Select_List(WebElement element, String text) throws InterruptedException {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}


	public WebElement  Close(){
		return  Close;
	}

	public WebElement registr(){
		return registr;
	}

	public WebElement  RegisterNewEmployee(){
		return  RegisterNewEmployee;
	}

	public WebElement EmployerCode(){
		return EmployerCode;
	}

	public WebElement allottedESINumber(){
		return allottedESINumber;
	}

	public WebElement RegistrationYesRadioBtn(){
		return RegistrationYesRadioBtn;
	}

	public WebElement InsuranceNoTxtBx(){
		return InsuranceNoTxtBx;
	}

	public WebElement DateOfAppointment(){
		return DateOfAppointment;
	}

	public WebElement DateOfAppointmentPreviousArrow(){
		return DateOfAppointmentPreviousArrow;
	}

	public WebElement SelectDateOfAppointment(){
		return SelectDateOfAppointment;
	}

	public WebElement AgreeButton(){
		return AgreeButton;
	}

	public WebElement MobileNumber(){
		return MobileNumber;
	}


	public WebElement ValidateMobileNumber(){
		return ValidateMobileNumber;
	}

	public WebElement Continue(){
		return Continue;
	}
	
	public WebElement ContinueBtn(){
		return ContinueBtn;
	}

	//For Yes
	public WebElement NameRadioBtn(){
		return NameRadioBtn;
	}

	public WebElement UserNameTxtBx(){
		return UserNameTxtBx;
	}

	public WebElement RelationShipWithIp(){
		return RelationShipWithIp;
	}

	public WebElement IpAddress(){
		return IpAddress;
	}

	public WebElement StateDrpDwn(){
		return StateDrpDwn;
	}

	public WebElement DistrictDrpDwn(){
		return DistrictDrpDwn;
	}

	public WebElement PinCode(){
		return PinCode;
	}

	public WebElement DeclarationCheckBox(){
		return DeclarationCheckBox;
	}

	public WebElement UpdateBtn(){
		return UpdateBtn;
	}

	public WebElement CloseBtn(){
		return CloseBtn;
	}
	//Address Details
	public WebElement AddressDetailsRadioBtn(){
		return AddressDetailsRadioBtn;
	}
	public WebElement AddressTextBox(){
		return AddressTextBox;	
	}

	public WebElement PinCodeTextBox(){
		return PinCodeTextBox;
	}
	public WebElement StateTextBox(){
		return StateTextBox;
	}

	public WebElement MobileNoEditButton(){
		return MobileNoEditButton;
	}

	public WebElement MobileNoTextBox(){
		return MobileNoTextBox;
	}

	public WebElement ValidateMobileNoLink(){
		return ValidateMobileNoLink;
	}
	
	public WebElement ValidateMobileNoProceed(){
		return ValidateMobileNoProceed;
	}

	public WebElement DistrictTextBox(){
		return DistrictTextBox;
	}

	public WebElement PresentAddressAsPermntCheckBox(){
		return PresentAddressAsPermntCheckBox;
	}

	public WebElement AddressDeclarationCheckBox(){
		return AddressDeclarationCheckBox;
	}

	public WebElement AddressCloseBtn(){
		return AddressCloseBtn;
	}

	//For Personal Details
	public WebElement PersonalDetailsRadioBtn(){
		return PersonalDetailsRadioBtn;
	}

	public WebElement DateOfBirth(){
		return DateOfBirth;
	}

	public WebElement SelectDateOfBirth(){
		return SelectDateOfBirth;
	}

	public WebElement FatherName(){
		return FatherName;
	}

	public WebElement MaritalStatusDrpDwn(){
		return MaritalStatusDrpDwn;
	}

	public WebElement GenderRadioBtn(){
		return GenderRadioBtn;
	}

	public WebElement perDeclarationChkBx(){
		return perDeclarationChkBx;
	}

	public WebElement perUpdateBtn(){
		return perUpdateBtn;
	}

	public WebElement perCancelBtn(){
		return perCancelBtn;
	}

	//
	public WebElement Name(){
		return Name;
	}

	public WebElement Fathername(){
		return Fathername;
	}

	public WebElement Address(){
		return Address;
	}

	public WebElement pincode(){
		return pincode;
	}

	public WebElement CopyPresentAdderss(){
		return CopyPresentAdderss;
	}

	public WebElement DetailsofNominee(){
		return DetailsofNominee ;
	}

	public WebElement NomineeDetailsRadioBtn(){
		return NomineeDetailsRadioBtn ;
	}

	public WebElement NameOfNominee(){
		return NameOfNominee;
	}

	public WebElement NomineeAddress(){
		return NomineeAddress;
	}

	public WebElement yes(){
		return yes;
	}

	public WebElement save(){
		return save;
	}

	public WebElement Close1(){
		return Close1;
	}

	public WebElement FamilyDetailsRadioBtn(){
		return FamilyDetailsRadioBtn;

	}

	public WebElement FamilyParticularsofInsuredPerson(){
		return FamilyParticularsofInsuredPerson;

	}


	public WebElement FamilyName(){
		return FamilyName;
	}


	public WebElement Submit(){
		return Submit;
	}

	public WebElement  Residence(){
		return  Residence;
	}

	public WebElement Close2(){
		return Close2;
	}
	
	public WebElement close(){
		return close;
	}
	
	//Family Details for Yes RadioBtn
	
	
	

	public WebElement DetailsofBankAccountsofInsuredPerson(){
		return DetailsofBankAccountsofInsuredPerson;
	}

	public WebElement  IFSCCode(){
		return  IFSCCode;
	}

	public WebElement Search(){
		return Search; 
	}

	public WebElement AccountNo(){
		return AccountNo;
	}

	public WebElement submitButton(){
		return submitButton;

	}
	
	public WebElement UpdateFamilyDetailsBtn(){
		return UpdateFamilyDetailsBtn;

	}


	public WebElement termscondition(){
		return termscondition;
	}

	public WebElement  submit(){
		return  submit;
	}



//No

	public WebElement  DateOfAppointmentNo(){
		return  DateOfAppointmentNo;
	}
	
	public WebElement  DateOfAppointmentPreviousArrowNo(){
		return  DateOfAppointmentPreviousArrowNo;
	}
	
	public WebElement  SelectDateOfAppointmentno(){
		return  SelectDateOfAppointmentno;
	}

	public WebElement  NoAgreeBtn(){
		return  NoAgreeBtn;
	}

	//Family Details
	public WebElement  FamilyDetailsNameTxtBx(){
		return  FamilyDetailsNameTxtBx;
	}

	public WebElement  FamilyDetailsDOB(){
		return  FamilyDetailsDOB;
	}
	
	public WebElement  FamilyDetailsSelectTitle(){
		return  FamilyDetailsSelectTitle;
	}
	
	public WebElement  FamilyDetailsPreviosBtn(){
		return  FamilyDetailsPreviosBtn;
	}
	
	public WebElement  FamilyDetailsSelectYear(){
		return  FamilyDetailsSelectYear;
	}
	
	public WebElement  FamilyDetailsSelectMonth(){
		return  FamilyDetailsSelectMonth;
	}
	
	public WebElement  FamilyDetailsSelectDay(){
		return  FamilyDetailsSelectDay;
	}
	

	public WebElement  FamilyDetailsRelationDrpDwn(){
		return  FamilyDetailsRelationDrpDwn;
	}

	public WebElement  FamilyDetailsNoRadioBtn(){
		return  FamilyDetailsNoRadioBtn;
	}

	public WebElement  FamilyDetailsPermanentStateDrpDwn(){
		return  FamilyDetailsPermanentStateDrpDwn;
	}

	public WebElement  FamilyDetailsPermanentDistrictDrpDwn(){
		return  FamilyDetailsPermanentDistrictDrpDwn;
	}

	public WebElement  AddButton(){
		return  AddButton;
	}


	

	//bank details for Yes btn
	
	public WebElement  BankDetailsRadioBtn(){
		return  BankDetailsRadioBtn;
	}
	
	public WebElement  IFSCcodeTextBox(){
		return  IFSCcodeTextBox;
	}
	
	public WebElement  IFSCcodeSeasrchBtn(){
		return  IFSCcodeSeasrchBtn;
	}
	
	public WebElement  AccountNoTextBox(){
		return  AccountNoTextBox;
	}
	
	public WebElement  AccountTypeDrpDwn(){
		return  AccountTypeDrpDwn;
	}
	public WebElement  BankDetailsSubmitBtn(){
		return  BankDetailsSubmitBtn;
	}
	public WebElement  BankDetailsCancelBtn(){
		return  BankDetailsCancelBtn;
	}
	
//For No
	@FindBy(id="ctl00_HomePageContent_ddlDispensaryDistrict")
	WebElement DispensaryDistrict;
	
	@FindBy(id="ctl00_HomePageContent_ddldependantDispensaryState")
	WebElement DependantDispensaryState;
	
	@FindBy(id="ctl00_HomePageContent_ddldependantDispensaryDistrict")
	WebElement DependantDispensaryDistrict;
	
	public WebElement  DispensaryDistrict(){
		return  DispensaryDistrict;
	}
	
	public WebElement  DependantDispensaryState(){
		return  DependantDispensaryState;
	}
	
	public WebElement  DependantDispensaryDistrict(){
		return  DependantDispensaryDistrict;
	}
}
