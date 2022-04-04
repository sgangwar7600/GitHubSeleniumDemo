package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEmployee {
	
	WebDriver driver;

	public EditEmployee (WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath=".//*[@id='ctl00_NavigationMenun8']/td/table/tbody/tr/td/a")
	WebElement EditEmployee;
	
	@FindBy(id="ctl00_HomePageContent_ctrlTextTINOrPIN")
	WebElement EmployeeInsuranceNo;
	
	@FindBy(id="ctl00_HomePageContent_Button1")
	WebElement Serach;
	
	@FindBy(id="ctl00_HomePageContent_gdvRegistredEmploee_ctl02_rbtnRegEmployee")
	WebElement radioButton;
	
	@FindBy(id="ctl00_HomePageContent_ctrlBtnEdit")
	WebElement Edit;
	
	@FindBy(id="dec_chkbox_reg")
	WebElement EditDeclarationCheckBox;
	
	@FindBy(xpath=".//*[@id='ctl00_HomePageContent_rdRegistrationDetails']")
	WebElement NameDispensaryDetails;
	
	@FindBy(id="ctrlTextEmpName")
	WebElement Name;
	
	@FindBy(id="ddlDispensaryState")
	WebElement DispensaryStateDrpDwn;
	
	
//	
	@FindBy(id="ctrlButtonSave")
	WebElement updateButton;
	
	@FindBy(id="close_btn")
	WebElement close;
	
	
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

	@FindBy(id="cEDOA_day_2_2")
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

	//Family Details for Yes Radio Btn
	
	@FindBy(id="ctl00_HomePageContent_rdFamilyDetails")
	WebElement FamilyDetailsRadioBtn;
	
		
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
		
		@FindBy(id="ctrlButtonAdd")
		WebElement AddButton;

		//Nominee Details
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


	
	public WebElement  EditEmployee(){
		return  EditEmployee;
	}
	
	
	public WebElement EmployeeInsuranceNo(){
		return EmployeeInsuranceNo;
	}
	
	public WebElement Serach(){
		return Serach;
	}
	
	public WebElement  radioButton(){
		return  radioButton;
	}
	
	public WebElement Edit(){
		return Edit;
	}
	
	public WebElement NameDispensaryDetails(){
		return NameDispensaryDetails;
	}
	
	public WebElement Name(){
		return Name;
	}
	
	public WebElement updateButton(){
		return updateButton;
	}
	
	public WebElement close(){
		return close;
	}
	
	public WebElement EditDeclarationCheckBox(){
		return EditDeclarationCheckBox;
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

	//Family Details
	public WebElement  FamilyDetailsRadioBtn(){
		return  FamilyDetailsRadioBtn;
	}
	
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


		//Nominee Detiails
	

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
		


}
