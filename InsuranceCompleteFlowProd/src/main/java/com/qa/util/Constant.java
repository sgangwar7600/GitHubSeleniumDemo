package com.qa.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Constant {

	static Map<String,String> defaultFun=new LinkedHashMap<String, String>();
	//Yes Registration
	static Map<String,String> LoginForYesRegistration=new LinkedHashMap<String, String>();
	static Map<String,String> Register=new LinkedHashMap<String, String>();
	static Map<String,String> RegisterForm1=new LinkedHashMap<String, String>();
	static Map<String,String> DetailsOfNomnee=new LinkedHashMap<String, String>();
	static Map<String,String> FamilyInsuredPerson=new LinkedHashMap<String, String>();
	static Map<String,String> DetailsofBankAccountsofInsuredPerson=new LinkedHashMap<String, String>();

	//No Registration
	static Map<String,String> LoginforNoRegistration=new LinkedHashMap<String, String>();
	static Map<String,String> NoRegister=new LinkedHashMap<String, String>();
	static Map<String,String> NoRegisterForm1=new LinkedHashMap<String, String>();
	static Map<String,String> NoRegDetailsOfNomnee=new LinkedHashMap<String, String>();
	static Map<String,String> NoRegFamilyInsuredPerson=new LinkedHashMap<String, String>();
	static Map<String,String> NoRegDetailsofBankAccountsofInsuredPerson=new LinkedHashMap<String, String>();

	//Sickness Benefit	
	static Map<String,String> LoginForSB=new LinkedHashMap<String, String>();
	static Map<String,String> FirstCertificateForSB=new LinkedHashMap<String, String>();
	static Map<String,String> IntermediateCertificateForSB=new LinkedHashMap<String, String>();
	static Map<String,String> SecondIntermediateCertificateForSB=new LinkedHashMap<String, String>();
	static Map<String,String> CreateClaimForSB=new LinkedHashMap<String, String>();
	static Map<String,String> SicknessClaimForm=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforSB=new LinkedHashMap<String, String>();
	static Map<String,String> SBProcessClaimBMLogin=new LinkedHashMap<String, String>();

	//MB Confinement Claim Benefit
	static Map<String,String> LoginForMBConfinement=new LinkedHashMap<String, String>();
	static Map<String,String> MaternityForm18CertificateforConfinement=new LinkedHashMap<String, String>();
	static Map<String,String> MBCreateConfinementClaim=new LinkedHashMap<String, String>();
	static Map<String,String> MB_Form19Confinement=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforConfinement=new LinkedHashMap<String, String>();
	static Map<String,String> MBForm19ClaimProcessingBMLogin=new LinkedHashMap<String, String>();

	//MB Expected Confinement Claim Benefit
	static Map<String,String> LoginforMBExpectedConfinement=new LinkedHashMap<String, String>();
	static Map<String,String> MaternityForm18CertificateExpectedConfinement=new LinkedHashMap<String, String>();
	static Map<String,String> MBCreateExpectedConfinementClaim=new LinkedHashMap<String, String>();
	static Map<String,String> MB_Form19ExpectedConfinement=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforExpectedConfinement=new LinkedHashMap<String, String>();
	static Map<String,String> ExpectedMBForm19ClaimProcessingBMLogin=new LinkedHashMap<String, String>();

	//MB Miscarriage Benefit
	static Map<String,String> LoginforMiscarriage=new LinkedHashMap<String, String>();
	static Map<String,String> MaternityForm18MiscarriageCertificate=new LinkedHashMap<String, String>();
	static Map<String,String> MBMiscarriageCreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> MB_Form19Miscarriage=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforMiscarriage=new LinkedHashMap<String, String>();
	static Map<String,String> MBForm19MiscarriageClaimProcessingBMLogin=new LinkedHashMap<String, String>();

	//MBForm21 Claim
	static Map<String,String> LoginforMBForm21=new LinkedHashMap<String, String>();
	static Map<String,String> MaternityForm21Certificate=new LinkedHashMap<String, String>();
	static Map<String,String> MBForm20CreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> CreateClaimMBForm20=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforMBForm21=new LinkedHashMap<String, String>();
	static Map<String,String> MBForm21ClaimProcessingBMLogin=new LinkedHashMap<String, String>();

	//MBSB Claim
	static Map<String,String> MBSBLogin=new LinkedHashMap<String, String>();
	static Map<String,String> MaternityForm18CertificateForMBSB=new LinkedHashMap<String, String>();
	static Map<String,String> FirstCertificateForMBSB=new LinkedHashMap<String, String>();
	static Map<String,String> IntermediateCertificateForMBSB=new LinkedHashMap<String, String>();
	static Map<String,String> MBSBFinalCertificate=new LinkedHashMap<String, String>();
	static Map<String,String> CreateClaimForMBSB=new LinkedHashMap<String, String>();
	static Map<String,String> MBSicknessClaimForm=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforMBSB=new LinkedHashMap<String, String>();
	static Map<String,String> MBSBProcessClaimBMLogin=new LinkedHashMap<String, String>();

	//EnSB Claim
	static Map<String,String> LoginForEnSB=new LinkedHashMap<String, String>();
	static Map<String,String> FirstCertificateForENSB=new LinkedHashMap<String, String>();
	static Map<String,String> Fitness_FinalCertificate=new LinkedHashMap<String, String>();
	static Map<String,String> ENSBCreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> ENSBCreateAndProcessClaimLDCLogin=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforENSB=new LinkedHashMap<String, String>();
	static Map<String,String> ENSBProcessClaimBMLogin=new LinkedHashMap<String, String>();

	//PDB Claim
	static Map<String,String> LoginforPDB=new LinkedHashMap<String, String>();
	static Map<String,String> PDBPeriodicalCreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforPDB=new LinkedHashMap<String, String>();
	static Map<String,String> PDBPeriodicalClaimProcessingBMLogin=new LinkedHashMap<String, String>();

	//Funeral Expenses Claim
	static Map<String,String> LoginForFuneralExpenses=new LinkedHashMap<String, String>();
	static Map<String,String> UploadDeathCertificateforFuneralExpenses=new LinkedHashMap<String, String>();
	static Map<String,String> CreateClaimForFuneralExpenses=new LinkedHashMap<String, String>();
	static Map<String,String> FunerallExpenssClaim=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforFuneralExpenses=new LinkedHashMap<String, String>();
	static Map<String,String> FuneralExpensesBMLogin=new LinkedHashMap<String, String>();

	//Extended Sickness benefit
	static Map<String,String> LoginforESB=new LinkedHashMap<String, String>();
	static Map<String,String> ESBMed8Certificate=new LinkedHashMap<String, String>();
	static Map<String,String> ContinuationOfPreviousSpellCertificateForESB1=new LinkedHashMap<String, String>();
	static Map<String,String> ContinuationOfPreviousSpellCertificateForESB2=new LinkedHashMap<String, String>();
	static Map<String,String> ContinuationOfPreviousSpellCertificateForESB3=new LinkedHashMap<String, String>();
	static Map<String,String> ESBCreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> ESBP=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforESB=new LinkedHashMap<String, String>();
	static Map<String,String> ESBProcessClaimBMLogin2=new LinkedHashMap<String, String>();

	//RGSKY Claim
	static Map<String,String> LoginforRGSKY=new LinkedHashMap<String, String>();
	static Map<String,String> RGSKY=new LinkedHashMap<String, String>();
	static Map<String,String> RGSKYUA1=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforRGSKY=new LinkedHashMap<String, String>();
	static Map<String,String> RGSKYBMLogin=new LinkedHashMap<String, String>();
	static Map<String,String> UploadUA4iCertificate=new LinkedHashMap<String, String>();
	static Map<String,String> RGSKYUA4iBMLogin=new LinkedHashMap<String, String>();
	static Map<String,String> ROLoginforRGSKY=new LinkedHashMap<String, String>();
	static Map<String,String> RGSKYROLogin=new LinkedHashMap<String, String>();
	static Map<String,String> UploadUA4iiRGSKYCertificate=new LinkedHashMap<String, String>();
	static Map<String,String> UploadUA4iiCertificate=new LinkedHashMap<String, String>();
	static Map<String,String> UA9Claim=new LinkedHashMap<String, String>();
	static Map<String,String> RGSKYUA9ClaimCreate=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforRGSKYUA9=new LinkedHashMap<String, String>();
	static Map<String,String> RGSKYUA9ProcessingBMLogin=new LinkedHashMap<String, String>();

	//Print Counter Foil 
	static Map<String,String> LoginforPrintCounterFoil=new LinkedHashMap<String, String>();
	static Map<String,String> PrintCounterFoil=new LinkedHashMap<String, String>();

	//Conveyance Allowance Claim 
	static Map<String,String> LoginforConveyanceAllowance=new LinkedHashMap<String, String>();
	static Map<String,String> ConveyanceAllowance=new LinkedHashMap<String, String>();
	static Map<String,String> ConvyanceAllowanceCreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> ConvyanceAllowanceFillDetails=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforConveyanceAllowance=new LinkedHashMap<String, String>();
	static Map<String,String> ConveyanceAllowanceClaimProcessingBM=new LinkedHashMap<String, String>();

	//View SubUnits
	static Map<String,String> LoginforViewSubUnits=new LinkedHashMap<String, String>();
	static Map<String,String> ViewRegister=new LinkedHashMap<String, String>();

	//Update Employee Details
	static Map<String,String> LoginforUpdateEmployerDetails=new LinkedHashMap<String, String>();
	static Map<String,String> UpdateRegister=new LinkedHashMap<String, String>();

	//Edit Employee Details
	static Map<String,String> LoginforEditEmployeeDetails=new LinkedHashMap<String, String>();
	static Map<String,String> EditRegister=new LinkedHashMap<String, String>();
	static Map<String,String> EditPersonalDetails=new LinkedHashMap<String, String>();
	static Map<String,String> EditAddressDetails=new LinkedHashMap<String, String>();
	static Map<String,String> EditDetailsOfNomnee=new LinkedHashMap<String, String>();
	static Map<String,String> EditFamilyInsuredPerson=new LinkedHashMap<String, String>();
	static Map<String,String> EditDetailsofBankAccountsofInsuredPerson=new LinkedHashMap<String, String>();

	//Change IP status on Death
	static Map<String,String> LoginforChangeIpStatusOnDeath=new LinkedHashMap<String, String>();
	static Map<String,String> ChangeIPStatusOnDeath=new LinkedHashMap<String, String>();

	//View Register
	static Map<String,String> LoginforViewRegister=new LinkedHashMap<String, String>();
	static Map<String,String> ViewEmployerMasterRegister=new LinkedHashMap<String, String>();
	static Map<String,String> ViewC11=new LinkedHashMap<String, String>();
	static Map<String,String> ViewWatchOverRegister=new LinkedHashMap<String, String>();

	//Action On Interest
	static Map<String,String> LoginforActionOnInterest=new LinkedHashMap<String, String>();
	static Map<String,String> ActionOnInterest=new LinkedHashMap<String, String>();
	static Map<String,String> SOLoginForAOI=new LinkedHashMap<String, String>();
	static Map<String,String> ActionOnInterestSOLogin=new LinkedHashMap<String, String>();
	static Map<String,String> RBOLoginForAOI=new LinkedHashMap<String, String>();
	static Map<String,String> ActionOnInterestRBOLogin=new LinkedHashMap<String, String>();

	//Action On Damage
	static Map<String,String> LoginforActionsOnDamage=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToActionsonDamage=new LinkedHashMap<String, String>();
	static Map<String,String> SOLoginForAOD=new LinkedHashMap<String, String>();
	static Map<String,String> ActionOnDamageSOLogin=new LinkedHashMap<String, String>();
	static Map<String,String> RBOLoginForAOD=new LinkedHashMap<String, String>();
	static Map<String,String> ActionOnDamageRBOLogin=new LinkedHashMap<String, String>();


	//Confinement Claim
	static Map<String,String> LoginforConfinementClaim=new LinkedHashMap<String, String>();
	static Map<String,String> ConfinementPage=new LinkedHashMap<String, String>();
	static Map<String,String> CreateConfinementClaim=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforConfinementClaim=new LinkedHashMap<String, String>();
	static Map<String,String> ConfinementClaimProcessingBM=new LinkedHashMap<String, String>();

	//Dependent Benefit
	static Map<String,String> LoginforDependentBenefit=new LinkedHashMap<String, String>();
	static Map<String,String> DependentBenifits=new LinkedHashMap<String, String>();
	static Map<String,String> DBForm16=new LinkedHashMap<String, String>();
	static Map<String,String> DBCreateClaimRequest=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforDB=new LinkedHashMap<String, String>();
	static Map<String,String> DBClaimRequestProcessingPageBMLogin=new LinkedHashMap<String, String>();
	static Map<String,String> BBOLoginForDBRequestProcessing=new LinkedHashMap<String, String>();
	static Map<String,String> DBRequestProcessingBBOLogin=new LinkedHashMap<String, String>();
	static Map<String,String> DBRequestProcessingBBOLoginafter30Days=new LinkedHashMap<String, String>();
	static Map<String,String> F_ALoginForDBRequestProcessing=new LinkedHashMap<String, String>();
	static Map<String,String> DBRequsetProcessingF_ALogin=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforDB2=new LinkedHashMap<String, String>();
	static Map<String,String> DBClaimRequestProcessingPageBMLogin2=new LinkedHashMap<String, String>();
	static Map<String,String> LDC_UDCLoginForDBCreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> DBCreateClaim=new LinkedHashMap<String, String>();
	static Map<String,String> DB_Form16Claim=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforDBClaim=new LinkedHashMap<String, String>();
	static Map<String,String> DBClaimProcessingBMLogin=new LinkedHashMap<String, String>();

	//AODDATaskListandViewC6RegisterandAODREports
	static Map<String,String> LoginforAOD=new LinkedHashMap<String, String>();
	static Map<String,String> DealingAssistantTaskList=new LinkedHashMap<String, String>();
	static Map<String,String> ViewC6Register=new LinkedHashMap<String, String>();
	static Map<String,String> DefaulterHistory=new LinkedHashMap<String, String>();
	static Map<String,String> DropDefaulterRecords=new LinkedHashMap<String, String>();
	static Map<String,String> AODReports=new LinkedHashMap<String, String>();

	//Sickness Benefit	for 91 Days
	static Map<String,String> LoginForSB91=new LinkedHashMap<String, String>();
	static Map<String,String> FirstCertificateForSB91=new LinkedHashMap<String, String>();
	static Map<String,String> IntermediateCertificateForSB91=new LinkedHashMap<String, String>();
	static Map<String,String> SecondIntermediateCertificateForSB91=new LinkedHashMap<String, String>();
	static Map<String,String> ThirdIntermediateCertificateForSB91=new LinkedHashMap<String, String>();
	static Map<String,String> FourthIntermediateCertificateForSB91=new LinkedHashMap<String, String>();
	static Map<String,String> CreateClaimForSB91=new LinkedHashMap<String, String>();
	static Map<String,String> SicknessClaimForm91=new LinkedHashMap<String, String>();
	static Map<String,String> BMLoginforSB91=new LinkedHashMap<String, String>();
	static Map<String,String> SBProcessClaimBMLogin91=new LinkedHashMap<String, String>();

	//Task Details
	static Map<String,String> LoginforTaskDetails=new LinkedHashMap<String, String>();
	static Map<String,String> TaskDetails=new LinkedHashMap<String, String>();

	//Survey
	static Map<String,String> LoginForSurvey=new LinkedHashMap<String, String>();
	static Map<String,String> CreateSurveySourceRegister=new LinkedHashMap<String, String>();
	static Map<String,String> EditSurveySourceRegister=new LinkedHashMap<String, String>();
	static Map<String,String> ViewSurveySourceRegister=new LinkedHashMap<String, String>();
	static Map<String,String> ViewPeriodicSurveyRegister=new LinkedHashMap<String, String>();
	static Map<String,String> ViewObservationNote=new LinkedHashMap<String, String>();
	static Map<String,String> SurveyTaskDetails=new LinkedHashMap<String, String>();

	//Inspection
	static Map<String,String> LoginforInspection=new LinkedHashMap<String, String>();
	static Map<String,String> Inspection=new LinkedHashMap<String, String>();
	static Map<String,String> SuperintendentLoginforInspection=new LinkedHashMap<String, String>();
	static Map<String,String> InspectionSuperIntendentLogin=new LinkedHashMap<String, String>();
	static Map<String,String> RBOLoginforInspection=new LinkedHashMap<String, String>();
	static Map<String,String> InspectionRBOLogin=new LinkedHashMap<String, String>();
	static Map<String,String> ScrutinizeObservationNoteInspectionReport=new LinkedHashMap<String, String>();

	//Super Speciality Test
	static Map<String,String> LoginforSST=new LinkedHashMap<String, String>();
	static Map<String,String> SSTClaim=new LinkedHashMap<String, String>();
	static Map<String,String> SST=new LinkedHashMap<String, String>();
	static Map<String,String> ROLoginforSST=new LinkedHashMap<String, String>();
	static Map<String,String> SSTROLogin=new LinkedHashMap<String, String>();

	//Recovery Registers
	static Map<String,String> LoginforRecoveryRegisters=new LinkedHashMap<String, String>();
	static Map<String,String> RecoveryTransactionReport=new LinkedHashMap<String, String>();
	static Map<String,String> IrrecoverableRegister=new LinkedHashMap<String, String>();
	static Map<String,String> WaiverRegister=new LinkedHashMap<String, String>();
	static Map<String,String> CPRegister=new LinkedHashMap<String, String>();

	//Recovery Manual Payment 
	static Map<String,String> LoginforRecoveryManualPayment=new LinkedHashMap<String, String>();
	static Map<String,String> RecoveryManualPayment=new LinkedHashMap<String, String>();

	//Recovery Manual Payment 
	static Map<String,String> LoginforRecoveryEmprInstallmentRequestPage=new LinkedHashMap<String, String>();
	static Map<String,String> RecoveryEmprInstallmentRequest=new LinkedHashMap<String, String>();


	static{
		defaultFun.put("default","");
		defaultFun.put("default-2","");
		//====================================
		//Yes Registration
		LoginForYesRegistration.put("Step1","Enter User Name");
		LoginForYesRegistration.put("Step2","Enter Pass word");
		LoginForYesRegistration.put("Step3","Click Login button");
		LoginForYesRegistration.put("Step4","Verify sucess fully login");

		//=====================================
		//Yes Registration
		Register.put("Step1","Click on Register New Employee ");
		Register.put("Step2","Enter EmployerCode");
		Register.put("Step3","Click on RegistrationYesRadioBtn");
		Register.put("Step4","Enter InsuranceNo");
		Register.put("Step5","Select DateOfAppointment");
		Register.put("Step6","Click on AgreeButton");
		Register.put("Step7","Click on ContinueBtn");

		//========================================
		//Yes Registration
		RegisterForm1.put("Step1","Click on NameRadioBtn");
		RegisterForm1.put("Step2","Enter UserName");
		RegisterForm1.put("Step3","Select RelationShipWithIp");
		RegisterForm1.put("Step4","Select IpAddress");
		RegisterForm1.put("Step5","Select State");
		RegisterForm1.put("Step6","Select District");
		RegisterForm1.put("Step7","Enter PinCode");
		RegisterForm1.put("Step8","Select DeclarationCheckBox");
		RegisterForm1.put("Step9","Click on CloseBtn");

		RegisterForm1.put("Step10","Click on PersonalDetailsRadioBtn");
		RegisterForm1.put("Step11","Select DateOfBirth");
		RegisterForm1.put("Step12","Enter FatherName");
		RegisterForm1.put("Step13","Select MaritalStatus");
		RegisterForm1.put("Step14","Select GenderRadioBtn");
		RegisterForm1.put("Step15","Select PersonalDeclarationChkBx");
		RegisterForm1.put("Step16","Click on PersonalCancelBtn");

		RegisterForm1.put("Step17","Click on AddressDetailsRadioBtn");
		RegisterForm1.put("Step18","Enter Address");
		RegisterForm1.put("Step19","Enter PinCode");
		RegisterForm1.put("Step20","Select State");
		RegisterForm1.put("Step21","Select District");
		RegisterForm1.put("Step22","Select PresentAddressAsPermntCheckBox");
		RegisterForm1.put("Step23","Click on AddressDeclarationCheckBox");
		RegisterForm1.put("Step24","Click on AddressCloseBtn");

		//===========================================
		//Yes Registration
		DetailsOfNomnee.put("Step1","Click on NomineeDetailsRadioBtn");
		DetailsOfNomnee.put("Step2","Enter UserName");
		DetailsOfNomnee.put("Step3","Select RelationShipWithIp");
		DetailsOfNomnee.put("Step4","Select IpAddress");
		DetailsOfNomnee.put("Step5","Select State");
		DetailsOfNomnee.put("Step6","Select District");
		DetailsOfNomnee.put("Step7","Enter PinCode");
		DetailsOfNomnee.put("Step8","Select DeclarationCheckBox");
		DetailsOfNomnee.put("Step9","Click on CloseBtn");

		//===========================================
		//Yes Registration
		FamilyInsuredPerson.put("Step1","Click on FamilyDetailsRadioBtn");
		FamilyInsuredPerson.put("Step2","Enter Name");
		FamilyInsuredPerson.put("Step3","Select DateOfBirth");
		FamilyInsuredPerson.put("Step4","Select Title");
		FamilyInsuredPerson.put("Step5","Select Relation");
		FamilyInsuredPerson.put("Step6","Select RadioBtn");
		FamilyInsuredPerson.put("Step7","Select PermanentState");
		FamilyInsuredPerson.put("Step8","Select PermanentDistrict");
		FamilyInsuredPerson.put("Step9","Click on CloseBtn");

		//===========================================
		//Yes Registration
		DetailsofBankAccountsofInsuredPerson.put("Step1","Click BankDetailsRadioBtn");
		DetailsofBankAccountsofInsuredPerson.put("Step2","Click BankDetailsCancelBtn");

		//============================================================================================================================
		//No Registration
		LoginforNoRegistration.put("Step1","Enter User Name");
		LoginforNoRegistration.put("Step2","Enter Pass word");
		LoginforNoRegistration.put("Step3","Click Login button");
		LoginforNoRegistration.put("Step4","Verify sucess fully login");

		//=====================================
		//No Registration
		NoRegister.put("Step1","Click on Register New Employee ");
		NoRegister.put("Step2","Enter EmployerCode");
		NoRegister.put("Step3","Enter alloted ESI Number");
		NoRegister.put("Step4","Enter Mobile Number");
		NoRegister.put("Step5","Validate Mobile Number");
		NoRegister.put("Step6","Click on ContinueBtn");

		//========================================
		//No Registration
		NoRegisterForm1.put("Step1","Enter Name");
		NoRegisterForm1.put("Step2","Enter Father's Name");
		NoRegisterForm1.put("Step3","Enter Date of Birth");
		NoRegisterForm1.put("Step4","Select Ip Address");
		NoRegisterForm1.put("Step5","Enter PinCode");
		NoRegisterForm1.put("Step6","Select State");
		NoRegisterForm1.put("Step7","Select District");
		NoRegisterForm1.put("Step8","Click on Copy Present address as Permanent Address Checkbox");
		NoRegisterForm1.put("Step9","Select Dispensary State");

		NoRegisterForm1.put("Step10","Select Dispensary District");
		NoRegisterForm1.put("Step11","Select Dispensary");
		NoRegisterForm1.put("Step12","Select Dependant Dispensary State");
		NoRegisterForm1.put("Step13","Select Dependant Dispensary District");
		NoRegisterForm1.put("Step14","Select Dependant Dispensary");
		NoRegisterForm1.put("Step15","Select Date of Appointment");

		//===========================================
		//No Registration
		NoRegDetailsOfNomnee.put("Step1","Click on NomineeDetailsRadioBtn");
		NoRegDetailsOfNomnee.put("Step2","Enter Name of Nominee");
		NoRegDetailsOfNomnee.put("Step3","Select RelationShipWithIp");
		NoRegDetailsOfNomnee.put("Step4","Select Nominee Address");
		NoRegDetailsOfNomnee.put("Step5","Select Yes Radio Button");
		NoRegDetailsOfNomnee.put("Step6","Click on Save button");
		NoRegDetailsOfNomnee.put("Step7","Click on Close Button");

		//===========================================
		//No Registration
		NoRegFamilyInsuredPerson.put("Step1","Click on FamilyDetailsRadioBtn");
		NoRegFamilyInsuredPerson.put("Step2","Enter Name");
		NoRegFamilyInsuredPerson.put("Step3","Select DateOfBirth");
		NoRegFamilyInsuredPerson.put("Step4","Select Title");
		NoRegFamilyInsuredPerson.put("Step5","Select Relation");
		NoRegFamilyInsuredPerson.put("Step6","Select RadioBtn");
		NoRegFamilyInsuredPerson.put("Step7","Select PermanentState");
		NoRegFamilyInsuredPerson.put("Step8","Select PermanentDistrict");
		NoRegFamilyInsuredPerson.put("Step9","Click on CloseBtn");

		NoRegFamilyInsuredPerson.put("Step10","Select Date of Appointment");
		NoRegFamilyInsuredPerson.put("Step11","Select No Agree Button");


		//===========================================
		//Yes Registration
		NoRegDetailsofBankAccountsofInsuredPerson.put("Step1","Click on Details of Bank Account of IP");
		NoRegDetailsofBankAccountsofInsuredPerson.put("Step2","Enter IFSC Code");
		NoRegDetailsofBankAccountsofInsuredPerson.put("Step3","Enter Account Number");
		NoRegDetailsofBankAccountsofInsuredPerson.put("Step4","Select Account type");
		NoRegDetailsofBankAccountsofInsuredPerson.put("Step5","Click on Submit Button");
		NoRegDetailsofBankAccountsofInsuredPerson.put("Step6","Select Terms and Conditions Checkbox");

		NoRegDetailsofBankAccountsofInsuredPerson.put("Step7","Click on Submit Button");

		//============================================================================================================================

		//Sickness Benefit	
		LoginForSB.put("Step1","Enter User Name");
		LoginForSB.put("Step2","Enter Pass word");
		LoginForSB.put("Step3","Click Login button");
		LoginForSB.put("Step4","Verify sucess fully login");

		//=======================================================
		//Sickness Benefit
		FirstCertificateForSB.put("Step1","Click on Upload Certificate ");
		FirstCertificateForSB.put("Step2","Click on Upload IMO/IMP Certificate ");
		FirstCertificateForSB.put("Step3","Enter IP Number");
		FirstCertificateForSB.put("Step4","Select IMO Radio Btn");
		FirstCertificateForSB.put("Step5","Click on New Spell Radio Button");
		FirstCertificateForSB.put("Step6","Click on Submit");
		FirstCertificateForSB.put("Step7","Select Examination Date");
		FirstCertificateForSB.put("Step8","Select Next Visit Date");
		FirstCertificateForSB.put("Step9","Select BO Date");
		FirstCertificateForSB.put("Step10","Enter Diagnosis");
		FirstCertificateForSB.put("Step11","Enter Medical Officer Name");
		FirstCertificateForSB.put("Step12","Enter Dispensary Location");
		FirstCertificateForSB.put("Step13","Enter Remarks");
		FirstCertificateForSB.put("Step11","Click on Submit Button");


		//Sickness Benefit
		IntermediateCertificateForSB.put("Step1","Click on Upload Certificate ");
		IntermediateCertificateForSB.put("Step2","Click on Upload IMO/IMP Certificate ");
		IntermediateCertificateForSB.put("Step3","Enter IP Number");
		IntermediateCertificateForSB.put("Step4","Select IMO Radio Btn");
		IntermediateCertificateForSB.put("Step5","Click on Continuation Of Previous Spell");
		IntermediateCertificateForSB.put("Step6","Click on Special Intermediate ChkBx");
		IntermediateCertificateForSB.put("Step7","Click on Submit");
		IntermediateCertificateForSB.put("Step8","Select First Certificate Date");
		IntermediateCertificateForSB.put("Step9","Select Examination Date");
		IntermediateCertificateForSB.put("Step10","Select Next Visit Date");
		IntermediateCertificateForSB.put("Step11","Select BO Date");
		IntermediateCertificateForSB.put("Step12","Enter Diagnosis");
		IntermediateCertificateForSB.put("Step13","Enter Medical Officer Name");
		IntermediateCertificateForSB.put("Step14","Enter Dispensary Location");
		IntermediateCertificateForSB.put("Step15","Enter Remarks");
		IntermediateCertificateForSB.put("Step16","Click on Submit Button");


		//==========================================================================================

		//Sickness Benefit
		SecondIntermediateCertificateForSB.put("Step1","Click on Upload Certificate ");
		SecondIntermediateCertificateForSB.put("Step2","Click on Upload IMO/IMP Certificate ");
		SecondIntermediateCertificateForSB.put("Step3","Enter IP Number");
		SecondIntermediateCertificateForSB.put("Step4","Select IMO Radio Btn");
		SecondIntermediateCertificateForSB.put("Step5","Click on Continuation Of Previous Spell");
		SecondIntermediateCertificateForSB.put("Step6","Click on Special Intermediate ChkBx");
		SecondIntermediateCertificateForSB.put("Step7","Click on Submit");
		SecondIntermediateCertificateForSB.put("Step8","Select First Certificate Date");
		SecondIntermediateCertificateForSB.put("Step9","Select Examination Date");
		SecondIntermediateCertificateForSB.put("Step10","Select Next Visit Date");
		SecondIntermediateCertificateForSB.put("Step11","Select BO Date");
		SecondIntermediateCertificateForSB.put("Step12","Enter Diagnosis");
		SecondIntermediateCertificateForSB.put("Step13","Enter Medical Officer Name");
		SecondIntermediateCertificateForSB.put("Step14","Enter Dispensary Location");
		SecondIntermediateCertificateForSB.put("Step15","Enter Remarks");
		SecondIntermediateCertificateForSB.put("Step16","Click on Submit Button");
		//==========================================================================================

		//Sickness Benefit

		CreateClaimForSB.put("Step1","Click on Create A new Claim Request ");
		CreateClaimForSB.put("Step2","Enter IP Number");
		CreateClaimForSB.put("Step3","Select SB Claim Type");
		CreateClaimForSB.put("Step4","Click on Submit");

		//=======================================================================
		//Sickness Benefit
		SicknessClaimForm.put("Step1","Click on Create Acknowlegement");
		SicknessClaimForm.put("Step2","Select Claim Type Sickness Benefit");
		SicknessClaimForm.put("Step3","Ehter Remarks");
		SicknessClaimForm.put("Step4","Click on Generate Button");
		SicknessClaimForm.put("Step5","Click on Back button");
		SicknessClaimForm.put("Step6","Select From Date");
		SicknessClaimForm.put("Step7","Select To Date");
		SicknessClaimForm.put("Step8","Click Acknowledgement Button");
		SicknessClaimForm.put("Step9","Select Acknowlegment");
		SicknessClaimForm.put("Step10","Click on Submit Acknowlegement");
		SicknessClaimForm.put("Step11","Enter Remarks");
		SicknessClaimForm.put("Step12","Click on Submit");
		SicknessClaimForm.put("Step13","Get Claim ID");

		SicknessClaimForm.put("Step14","Click on Process A Claim");
		SicknessClaimForm.put("Step15","Click on Sickness Benefit Claim Processing");
		SicknessClaimForm.put("Step16","Click on Page 2");
		SicknessClaimForm.put("Step17","Click on Claim Id");
		SicknessClaimForm.put("Step18","Click on Next Button");
		SicknessClaimForm.put("Step19","Click on Next Button");
		SicknessClaimForm.put("Step20","Enter Remarks");
		SicknessClaimForm.put("Step21","Click on Submit To BM");
		//===========================================

		//Sickness Benefit
		BMLoginforSB.put("Step1","Enter User Name");
		BMLoginforSB.put("Step2","Enter Pass word");
		BMLoginforSB.put("Step3","Click Login button");
		BMLoginforSB.put("Step4","Verify sucess fully login");
		BMLoginforSB.put("Step5","Select BO Ajmeri Gate");
		BMLoginforSB.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforSB.put("Step7","Click on Submit Button");

		//===================================================

		//Sickness Benefit
		SBProcessClaimBMLogin.put("Step1","Click on Process A Claim");
		SBProcessClaimBMLogin.put("Step2","Click on Sickness Benefit Claim Processing");
		SBProcessClaimBMLogin.put("Step3","Click on Claim Id");
		SBProcessClaimBMLogin.put("Step4","Click on Next Button");
		SBProcessClaimBMLogin.put("Step5","Click on Next Button");
		SBProcessClaimBMLogin.put("Step6","Enter Remarks");
		SBProcessClaimBMLogin.put("Step7","Click on Approve/Reject Btn");


		//==================================================================================================================

		//MB Confinement Claim
		LoginForMBConfinement.put("Step1","Enter User Name");
		LoginForMBConfinement.put("Step2","Enter Pass word");
		LoginForMBConfinement.put("Step3","Click Login button");
		LoginForMBConfinement.put("Step4","Verify sucess fully login");


		//=======================================================
		//MB Confinement Claim
		MaternityForm18CertificateforConfinement.put("Step1","Click on Upload Certificate ");
		MaternityForm18CertificateforConfinement.put("Step2","Click on Upload MaternityForm18Certificate ");
		MaternityForm18CertificateforConfinement.put("Step3","Enter IP Number");
		MaternityForm18CertificateforConfinement.put("Step4","Enter Issue Date");
		MaternityForm18CertificateforConfinement.put("Step5","Select Confinement Type");
		MaternityForm18CertificateforConfinement.put("Step6","Enter Confinement Date");
		MaternityForm18CertificateforConfinement.put("Step7","Enter Confinement At");
		MaternityForm18CertificateforConfinement.put("Step8","Enter Remarks");
		MaternityForm18CertificateforConfinement.put("Step9","Click on Submit Button");

		//===============================================
		//MB Confinement Claim
		MBCreateConfinementClaim.put("Step1", "Click on Create A new Claim Request ");
		MBCreateConfinementClaim.put("Step2", "Enter IP Number");
		MBCreateConfinementClaim.put("Step3", "Select Maternity Benefit");
		MBCreateConfinementClaim.put("Step4", "Click on Submit");

		//======================================================
		//MB Confinement Claim
		MB_Form19Confinement.put("Step1","Click on Create Acknowlegement");
		MB_Form19Confinement.put("Step2","Select Claim Type Maternity Benefit - Form 19 Claim");
		MB_Form19Confinement.put("Step3","Ehter Remarks");
		MB_Form19Confinement.put("Step4","Click on Generate Button");
		MB_Form19Confinement.put("Step5","Click on Back button");
		MB_Form19Confinement.put("Step6","Select MB Start Date");
		MB_Form19Confinement.put("Step7","Select DepartmentShift");
		MB_Form19Confinement.put("Step8","Enter Occupation");
		MB_Form19Confinement.put("Step9","Enter Branch Office Name");
		MB_Form19Confinement.put("Step10","Click Acknowledgement Button");
		MB_Form19Confinement.put("Step11","Select Acknowlegment");
		MB_Form19Confinement.put("Step12","Click on Submit Acknowlegement");
		MB_Form19Confinement.put("Step13","Enter Remarks");
		MB_Form19Confinement.put("Step14","Click on Submit");
		MB_Form19Confinement.put("Step15","Get Claim ID");

		MB_Form19Confinement.put("Step16","Click on Process A Claim");
		MB_Form19Confinement.put("Step17","Click on Maternity Benefit Claim Processing");
		MB_Form19Confinement.put("Step18","Click on Claim Id");
		MB_Form19Confinement.put("Step19","Click on Next Button");
		MB_Form19Confinement.put("Step20","Click on Next Button");
		MB_Form19Confinement.put("Step21","Enter Remarks");
		MB_Form19Confinement.put("Step22","Click on Submit To BM");

		//=============================================================
		//MB Confinement Claim
		BMLoginforConfinement.put("Step1","Enter User Name");
		BMLoginforConfinement.put("Step2","Enter Pass word");
		BMLoginforConfinement.put("Step3","Click Login button");
		BMLoginforConfinement.put("Step4","Verify sucess fully login");
		BMLoginforConfinement.put("Step5","Select BO Ajmeri Gate");
		BMLoginforConfinement.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforConfinement.put("Step7","Click on Submit Button");

		//===============================================================
		//MB Confinement Claim
		MBForm19ClaimProcessingBMLogin.put("Step1","Click on Process A Claim");
		MBForm19ClaimProcessingBMLogin.put("Step2","Click on Sickness Benefit Claim Processing");
		MBForm19ClaimProcessingBMLogin.put("Step3","Click on Claim Id");
		MBForm19ClaimProcessingBMLogin.put("Step4","Click on Next Button");
		MBForm19ClaimProcessingBMLogin.put("Step5","Click on Next Button");
		MBForm19ClaimProcessingBMLogin.put("Step6","Enter Remarks");
		MBForm19ClaimProcessingBMLogin.put("Step7","Click on Approve/Reject Btn");

		//==================================================================================================================

		//MB Expected Confinement Claim
		LoginforMBExpectedConfinement.put("Step1","Enter User Name");
		LoginforMBExpectedConfinement.put("Step2","Enter Pass word");
		LoginforMBExpectedConfinement.put("Step3","Click Login button");
		LoginforMBExpectedConfinement.put("Step4","Verify sucess fully login");

		//=======================================================
		//MB Expected Confinement Claim
		MaternityForm18CertificateExpectedConfinement.put("Step1","Click on Upload Certificate ");
		MaternityForm18CertificateExpectedConfinement.put("Step2","Click on Upload MaternityForm18Certificate ");
		MaternityForm18CertificateExpectedConfinement.put("Step3","Enter IP Number");
		MaternityForm18CertificateExpectedConfinement.put("Step4","Enter Issue Date");
		MaternityForm18CertificateExpectedConfinement.put("Step5","Enter IMO Name");
		MaternityForm18CertificateExpectedConfinement.put("Step6","Select Confinement Type");
		MaternityForm18CertificateExpectedConfinement.put("Step7","Enter Expected Date");	
		MaternityForm18CertificateExpectedConfinement.put("Step8","Enter Remarks");
		MaternityForm18CertificateExpectedConfinement.put("Step9","Click on Submit Button");

		//===============================================
		//MB Expected Confinement Claim
		MBCreateExpectedConfinementClaim.put("Step1", "Click on Create A new Claim Request ");
		MBCreateExpectedConfinementClaim.put("Step2", "Enter IP Number");
		MBCreateExpectedConfinementClaim.put("Step3", "Select Maternity Benefit");
		MBCreateExpectedConfinementClaim.put("Step4", "Click on Submit");

		//======================================================
		//MB Expected Confinement Claim
		MB_Form19ExpectedConfinement.put("Step1","Click on Create Acknowlegement");
		MB_Form19ExpectedConfinement.put("Step2","Select Claim Type Maternity Benefit - Form 19 Claim");
		MB_Form19ExpectedConfinement.put("Step3","Ehter Remarks");
		MB_Form19ExpectedConfinement.put("Step4","Click on Generate Button");
		MB_Form19ExpectedConfinement.put("Step5","Click on Back button");
		MB_Form19ExpectedConfinement.put("Step6","Select MB Start Date");
		MB_Form19ExpectedConfinement.put("Step7","Select DepartmentShift");
		MB_Form19ExpectedConfinement.put("Step8","Enter Occupation");
		MB_Form19ExpectedConfinement.put("Step9","Enter Branch Office Name");
		MB_Form19ExpectedConfinement.put("Step10","Click Acknowledgement Button");
		MB_Form19ExpectedConfinement.put("Step11","Select Acknowlegment");
		MB_Form19ExpectedConfinement.put("Step12","Click on Submit Acknowlegement");
		MB_Form19ExpectedConfinement.put("Step13","Enter Remarks");
		MB_Form19ExpectedConfinement.put("Step14","Click on Submit");
		MB_Form19ExpectedConfinement.put("Step15","Get Claim ID");

		MB_Form19ExpectedConfinement.put("Step16","Click on Process A Claim");
		MB_Form19ExpectedConfinement.put("Step17","Click on Maternity Benefit Claim Processing");
		MB_Form19ExpectedConfinement.put("Step18","Click on Claim Id");
		MB_Form19ExpectedConfinement.put("Step19","Click on Next Button");
		MB_Form19ExpectedConfinement.put("Step20","Click on Next Button");
		MB_Form19ExpectedConfinement.put("Step21","Enter Remarks");
		MB_Form19ExpectedConfinement.put("Step22","Click on Submit To BM");

		//=============================================================
		//MB Expected Confinement Claim
		BMLoginforExpectedConfinement.put("Step1","Enter User Name");
		BMLoginforExpectedConfinement.put("Step2","Enter Password");
		BMLoginforExpectedConfinement.put("Step3","Click Login button");
		BMLoginforExpectedConfinement.put("Step4","Verify sucessfully login");
		BMLoginforExpectedConfinement.put("Step5","Select BO Ajmeri Gate");
		BMLoginforExpectedConfinement.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforExpectedConfinement.put("Step7","Click on Submit Button");

		//===============================================================
		//MB Expected Confinement Claim
		ExpectedMBForm19ClaimProcessingBMLogin.put("Step1","Click on Process A Claim");
		ExpectedMBForm19ClaimProcessingBMLogin.put("Step2","Click on Sickness Benefit Claim Processing");
		ExpectedMBForm19ClaimProcessingBMLogin.put("Step3","Click on Claim Id");
		ExpectedMBForm19ClaimProcessingBMLogin.put("Step4","Click on Next Button");
		ExpectedMBForm19ClaimProcessingBMLogin.put("Step5","Click on Next Button");
		ExpectedMBForm19ClaimProcessingBMLogin.put("Step6","Enter Remarks");
		ExpectedMBForm19ClaimProcessingBMLogin.put("Step7","Click on Approve/Reject Btn");

		//==================================================================================================================

		//MB Miscarriage Claim
		LoginforMiscarriage.put("Step1","Enter User Name");
		LoginforMiscarriage.put("Step2","Enter Pass word");
		LoginforMiscarriage.put("Step3","Click Login button");
		LoginforMiscarriage.put("Step4","Verify sucess fully login");

		//=======================================================
		//MB Miscarriage Claim
		MaternityForm18MiscarriageCertificate.put("Step1","Click on Upload Certificate ");
		MaternityForm18MiscarriageCertificate.put("Step2","Click on Upload MaternityForm18Certificate ");
		MaternityForm18MiscarriageCertificate.put("Step3","Enter IP Number");
		MaternityForm18MiscarriageCertificate.put("Step4","Enter Issue Date");
		MaternityForm18MiscarriageCertificate.put("Step5","Select Confinement Type");
		MaternityForm18MiscarriageCertificate.put("Step6","Enter Miscarriage Date");
		MaternityForm18MiscarriageCertificate.put("Step7","Enter Miscarriage At");
		MaternityForm18MiscarriageCertificate.put("Step8","Enter Remarks");
		MaternityForm18MiscarriageCertificate.put("Step9","Click on Submit Button");

		//===============================================
		//MB Miscarriage Claim
		MBMiscarriageCreateClaim.put("Step1", "Click on Create A new Claim Request ");
		MBMiscarriageCreateClaim.put("Step2", "Enter IP Number");
		MBMiscarriageCreateClaim.put("Step3", "Select Maternity Benefit");
		MBMiscarriageCreateClaim.put("Step4", "Click on Submit");

		//======================================================
		//MB Miscarriage Claim
		MB_Form19Miscarriage.put("Step1","Click on Create Acknowlegement");
		MB_Form19Miscarriage.put("Step2","Select Claim Type Maternity Benefit - Form 19 Claim");
		MB_Form19Miscarriage.put("Step3","Enter Remarks");
		MB_Form19Miscarriage.put("Step4","Click on Generate Button");
		MB_Form19Miscarriage.put("Step5","Click on Back button");
		MB_Form19Miscarriage.put("Step6","Select MB Start Date");
		MB_Form19Miscarriage.put("Step7","Select MB Miscarriage Type");
		MB_Form19Miscarriage.put("Step8","Select DepartmentShift");
		MB_Form19Miscarriage.put("Step9","Enter Occupation");
		MB_Form19Miscarriage.put("Step10","Enter Branch Office Name");
		MB_Form19Miscarriage.put("Step11","Click Acknowledgement Button");
		MB_Form19Miscarriage.put("Step12","Select Acknowlegment");
		MB_Form19Miscarriage.put("Step13","Click on Submit Acknowlegement");
		MB_Form19Miscarriage.put("Step14","Enter Remarks");
		MB_Form19Miscarriage.put("Step15","Click on Submit");
		MB_Form19Miscarriage.put("Step16","Get Claim ID");

		MB_Form19Miscarriage.put("Step17","Click on Process A Claim");
		MB_Form19Miscarriage.put("Step18","Click on Maternity Benefit Claim Processing");
		MB_Form19Miscarriage.put("Step19","Click on Claim Id");
		MB_Form19Miscarriage.put("Step20","Click on Next Button");
		MB_Form19Miscarriage.put("Step21","Click on Next Button");
		MB_Form19Miscarriage.put("Step22","Enter Remarks");
		MB_Form19Miscarriage.put("Step23","Click on Submit To BM");

		//=============================================================
		//MB Miscarriage Claim
		BMLoginforMiscarriage.put("Step1","Enter User Name");
		BMLoginforMiscarriage.put("Step2","Enter Pass word");
		BMLoginforMiscarriage.put("Step3","Click Login button");
		BMLoginforMiscarriage.put("Step4","Verify sucess fully login");
		BMLoginforMiscarriage.put("Step5","Select BO Ajmeri Gate");
		BMLoginforMiscarriage.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforMiscarriage.put("Step7","Click on Submit Button");

		//===============================================================
		//MB Miscarriage Claim
		MBForm19MiscarriageClaimProcessingBMLogin.put("Step1","Click on Process A Claim");
		MBForm19MiscarriageClaimProcessingBMLogin.put("Step2","Click on Sickness Benefit Claim Processing");
		MBForm19MiscarriageClaimProcessingBMLogin.put("Step3","Click on Claim Id");
		MBForm19MiscarriageClaimProcessingBMLogin.put("Step4","Click on Next Button");
		MBForm19MiscarriageClaimProcessingBMLogin.put("Step5","Click on Next Button");
		MBForm19MiscarriageClaimProcessingBMLogin.put("Step6","Enter Remarks");
		MBForm19MiscarriageClaimProcessingBMLogin.put("Step7","Click on Approve/Reject Btn");

		//============================================================================================================================

		//MB Form21 Claim
		LoginforMBForm21.put("Step1","Enter User Name");
		LoginforMBForm21.put("Step2","Enter Pass word");
		LoginforMBForm21.put("Step3","Click Login button");
		LoginforMBForm21.put("Step4","Verify sucess fully login");


		//=======================================================
		//MB Form21 Claim
		MaternityForm21Certificate.put("Step1","Click on Upload Certificate ");
		MaternityForm21Certificate.put("Step2","Click on Upload MaternityForm21Certificate ");
		MaternityForm21Certificate.put("Step3","Enter IP Number");
		MaternityForm21Certificate.put("Step4","Enter Issue Date");
		MaternityForm21Certificate.put("Step5","Enter IW Death Date");
		MaternityForm21Certificate.put("Step6","Enter Cause of Death");
		MaternityForm21Certificate.put("Step7","Enter Confinement At");
		MaternityForm21Certificate.put("Step8","Enter Present Date");
		MaternityForm21Certificate.put("Step9","Click on Submit Button");

		//===============================================
		//MB Form21 Claim
		MBForm20CreateClaim.put("Step1", "Click on Create A new Claim Request ");
		MBForm20CreateClaim.put("Step2", "Enter IP Number");
		MBForm20CreateClaim.put("Step3", "Select Maternity Benefit");
		MBForm20CreateClaim.put("Step4", "Select Claim Subtype as 'MB - Form 20 Claim'");
		MBForm20CreateClaim.put("Step5", "Click on Submit");

		//======================================================
		//MB Form21 Claim
		CreateClaimMBForm20.put("Step1","Click on Create Acknowlegement");
		CreateClaimMBForm20.put("Step2","Select Claim Type Maternity Benefit - Form 20 Claim");
		CreateClaimMBForm20.put("Step3","Enter Remarks");
		CreateClaimMBForm20.put("Step4","Click on Generate Button");
		CreateClaimMBForm20.put("Step5","Click on Back button");
		CreateClaimMBForm20.put("Step6","Select MB Start Date");
		CreateClaimMBForm20.put("Step7","Select MB End Date");
		CreateClaimMBForm20.put("Step8","Select Claimaint Status");
		CreateClaimMBForm20.put("Step9","Enter Insured women's death date");
		CreateClaimMBForm20.put("Step10","Click Acknowledgement Button");
		CreateClaimMBForm20.put("Step11","Select Acknowlegment");
		CreateClaimMBForm20.put("Step12","Click on Submit Acknowlegement");
		CreateClaimMBForm20.put("Step13","Click on Submit");
		CreateClaimMBForm20.put("Step14","Get Claim ID");

		CreateClaimMBForm20.put("Step15","Click on Process A Claim");
		CreateClaimMBForm20.put("Step16","Click on Maternity Benefit Claim Processing");
		CreateClaimMBForm20.put("Step17","Click on Claim Id");
		CreateClaimMBForm20.put("Step18","Click on Next Button");
		CreateClaimMBForm20.put("Step19","Click on Next Button");
		CreateClaimMBForm20.put("Step20","Enter Remarks");
		CreateClaimMBForm20.put("Step21","Click on Submit To BM");

		//=============================================================
		//MB Form21 Claim
		BMLoginforMBForm21.put("Step1","Enter User Name");
		BMLoginforMBForm21.put("Step2","Enter Pass word");
		BMLoginforMBForm21.put("Step3","Click Login button");
		BMLoginforMBForm21.put("Step4","Verify sucess fully login");
		BMLoginforMBForm21.put("Step5","Select BO Ajmeri Gate");
		BMLoginforMBForm21.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforMBForm21.put("Step7","Click on Submit Button");

		//===============================================================
		//MB Form21 Claim
		MBForm21ClaimProcessingBMLogin.put("Step1","Click on Process A Claim");
		MBForm21ClaimProcessingBMLogin.put("Step2","Click on Sickness Benefit Claim Processing");
		MBForm21ClaimProcessingBMLogin.put("Step3","Click on Claim Id");
		MBForm21ClaimProcessingBMLogin.put("Step4","Click on Next Button");
		MBForm21ClaimProcessingBMLogin.put("Step5","Click on Next Button");
		MBForm21ClaimProcessingBMLogin.put("Step6","Enter Remarks");
		MBForm21ClaimProcessingBMLogin.put("Step7","Click on Approve/Reject Btn");

		//==========================================================================================================================================
		//MBSB Claim
		MBSBLogin.put("Step1","Enter User Name");
		MBSBLogin.put("Step2","Enter Pass word");
		MBSBLogin.put("Step3","Click Login button");
		MBSBLogin.put("Step4","Verify sucess fully login");


		//=======================================================
		//MBSB Claim
		MaternityForm18CertificateForMBSB.put("Step1","Click on Upload Certificate ");
		MaternityForm18CertificateForMBSB.put("Step2","Click on Upload MaternityForm18Certificate ");
		MaternityForm18CertificateForMBSB.put("Step3","Enter IP Number");
		MaternityForm18CertificateForMBSB.put("Step4","Enter Issue Date");
		MaternityForm18CertificateForMBSB.put("Step5","Enter IMO Name");
		MaternityForm18CertificateForMBSB.put("Step6","Select Confinement Type");
		MaternityForm18CertificateForMBSB.put("Step7","Enter Expected Date");	
		MaternityForm18CertificateForMBSB.put("Step8","Enter Remarks");
		MaternityForm18CertificateForMBSB.put("Step9","Click on Submit Button");

		//=======================================================
		//MBSB Claim
		FirstCertificateForMBSB.put("Step1","Click on Upload Certificate ");
		FirstCertificateForMBSB.put("Step2","Click on Upload IMO/IMP Certificate ");
		FirstCertificateForMBSB.put("Step3","Enter IP Number");
		FirstCertificateForMBSB.put("Step4","Select IMO Radio Btn");
		FirstCertificateForMBSB.put("Step5","Click on New Spell Radio Button");
		FirstCertificateForMBSB.put("Step6","Click on Submit");
		FirstCertificateForMBSB.put("Step7","Select Examination Date");
		FirstCertificateForMBSB.put("Step8","Select Next Visit Date");
		FirstCertificateForMBSB.put("Step9","Select BO Date");
		FirstCertificateForMBSB.put("Step10","Enter Diagnosis");
		FirstCertificateForMBSB.put("Step11","Enter Medical Officer Name");
		FirstCertificateForMBSB.put("Step12","Enter Dispensary Location");
		FirstCertificateForMBSB.put("Step13","Enter Remarks");
		FirstCertificateForMBSB.put("Step11","Click on Submit Button");

		//=======================================================
		//MBSB Claim
		IntermediateCertificateForMBSB.put("Step1","Click on Upload Certificate ");
		IntermediateCertificateForMBSB.put("Step2","Click on Upload IMO/IMP Certificate ");
		IntermediateCertificateForMBSB.put("Step3","Enter IP Number");
		IntermediateCertificateForMBSB.put("Step4","Select IMO Radio Btn");
		IntermediateCertificateForMBSB.put("Step5","Click on Continuation Of Previous Spell");
		IntermediateCertificateForMBSB.put("Step6","Click on Special Intermediate ChkBx");
		IntermediateCertificateForMBSB.put("Step7","Click on Submit");
		IntermediateCertificateForMBSB.put("Step8","Select First Certificate Date");
		IntermediateCertificateForMBSB.put("Step9","Select Examination Date");
		IntermediateCertificateForMBSB.put("Step10","Select Next Visit Date");
		IntermediateCertificateForMBSB.put("Step11","Select BO Date");
		IntermediateCertificateForMBSB.put("Step12","Enter Diagnosis");
		IntermediateCertificateForMBSB.put("Step13","Enter Medical Officer Name");
		IntermediateCertificateForMBSB.put("Step14","Enter Dispensary Location");
		IntermediateCertificateForMBSB.put("Step15","Enter Remarks");
		IntermediateCertificateForMBSB.put("Step16","Click on Submit Button");


		//=======================================================
		//MBSB Claim
		MBSBFinalCertificate.put("Step1","Click on Upload Certificate ");
		MBSBFinalCertificate.put("Step2","Click on Upload IMO/IMP Certificate ");
		MBSBFinalCertificate.put("Step3","Enter IP Number");
		MBSBFinalCertificate.put("Step4","Select IMO Radio Btn");
		MBSBFinalCertificate.put("Step5","Click on Continuation Of Previous Spell");
		MBSBFinalCertificate.put("Step6","Click on Special Intermediate ChkBx");
		MBSBFinalCertificate.put("Step7","Click on Submit");
		MBSBFinalCertificate.put("Step8","Select Examination Date");
		MBSBFinalCertificate.put("Step9","Select Fitness Checkbox");
		MBSBFinalCertificate.put("Step10","Select Fitness Date");
		MBSBFinalCertificate.put("Step11","Select BO Date");
		MBSBFinalCertificate.put("Step12","Enter Diagnosis");
		MBSBFinalCertificate.put("Step13","Enter Medical Officer Name");
		MBSBFinalCertificate.put("Step14","Enter Dispensary Location");
		MBSBFinalCertificate.put("Step15","Enter Remarks");
		MBSBFinalCertificate.put("Step16","Click on Submit Button");

		//=======================================================
		//MBSB Claim
		CreateClaimForMBSB.put("Step1","Click on Create A new Claim Request ");
		CreateClaimForMBSB.put("Step2","Enter IP Number");
		CreateClaimForMBSB.put("Step3","Select SB / ESB / TDB / MBSB Claim Type");
		CreateClaimForMBSB.put("Step4","Click on Submit");

		//=======================================================================
		//MBSB Claim
		MBSicknessClaimForm.put("Step1","Select Claim Type Sickness due to pregnancy");
		MBSicknessClaimForm.put("Step2","Click on Create Acknowlegement");
		MBSicknessClaimForm.put("Step3","Select Claim Type as Sickness due to pregnancy");
		MBSicknessClaimForm.put("Step4","Ehter Remarks");
		MBSicknessClaimForm.put("Step5","Click on Generate Button");
		MBSicknessClaimForm.put("Step6","Click on Back button");
		MBSicknessClaimForm.put("Step7","Select From Date");
		MBSicknessClaimForm.put("Step8","Select To Date");
		MBSicknessClaimForm.put("Step9","Select Date");
		MBSicknessClaimForm.put("Step10","Click Acknowledgement Button");
		MBSicknessClaimForm.put("Step11","Select Acknowlegment");
		MBSicknessClaimForm.put("Step12","Click on Submit Acknowlegement");
		MBSicknessClaimForm.put("Step13","Enter Remarks");
		MBSicknessClaimForm.put("Step14","Click on Submit");
		MBSicknessClaimForm.put("Step15","Get Claim ID");

		MBSicknessClaimForm.put("Step14","Click on Process A Claim");
		MBSicknessClaimForm.put("Step15","Click on Sickness Benefit Claim Processing");
		MBSicknessClaimForm.put("Step16","Click on Page 2");
		MBSicknessClaimForm.put("Step17","Click on Claim Id");
		MBSicknessClaimForm.put("Step18","Click on Next Button");
		MBSicknessClaimForm.put("Step19","Click on Next Button");
		MBSicknessClaimForm.put("Step20","Enter Remarks");
		MBSicknessClaimForm.put("Step21","Click on Submit To BM");
		//===========================================
		//MBSB Claim

		BMLoginforMBSB.put("Step1","Enter User Name");
		BMLoginforMBSB.put("Step2","Enter Pass word");
		BMLoginforMBSB.put("Step3","Click Login button");
		BMLoginforMBSB.put("Step4","Verify sucess fully login");
		BMLoginforMBSB.put("Step5","Select BO Ajmeri Gate");
		BMLoginforMBSB.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforMBSB.put("Step7","Click on Submit Button");

		//===================================================
		//MBSB Claim

		MBSBProcessClaimBMLogin.put("Step1","Click on Process A Claim");
		MBSBProcessClaimBMLogin.put("Step2","Click on Sickness Benefit Claim Processing");
		MBSBProcessClaimBMLogin.put("Step3","Click on Claim Id");
		MBSBProcessClaimBMLogin.put("Step4","Click on Next Button");
		MBSBProcessClaimBMLogin.put("Step5","Click on Next Button");
		MBSBProcessClaimBMLogin.put("Step6","Enter Remarks");
		MBSBProcessClaimBMLogin.put("Step7","Click on Approve/Reject Btn");

		//=====================================================================================================================
		//EnSB Claim
		LoginForEnSB.put("Step1","Enter User Name");
		LoginForEnSB.put("Step2","Enter Pass word");
		LoginForEnSB.put("Step3","Click Login button");
		LoginForEnSB.put("Step4","Verify sucess fully login");


		//=======================================================
		//EnSB Claim
		FirstCertificateForENSB.put("Step1","Click on Upload Certificate ");
		FirstCertificateForENSB.put("Step2","Click on Upload IMO/IMP Certificate ");
		FirstCertificateForENSB.put("Step3","Enter IP Number");
		FirstCertificateForENSB.put("Step4","Select IMO Radio Btn");
		FirstCertificateForENSB.put("Step5","Click on New Spell Radio Button");
		FirstCertificateForENSB.put("Step6","Click on Submit");
		FirstCertificateForENSB.put("Step7","Select Examination Date");
		FirstCertificateForENSB.put("Step8","Select Next Visit Date");
		FirstCertificateForENSB.put("Step9","Select BO Date");
		FirstCertificateForENSB.put("Step10","Enter Diagnosis");
		FirstCertificateForENSB.put("Step11","Enter Medical Officer Name");
		FirstCertificateForENSB.put("Step12","Enter Dispensary Location");
		FirstCertificateForENSB.put("Step13","Enter Remarks");
		FirstCertificateForENSB.put("Step11","Click on Submit Button");

		//EnSB Claim
		Fitness_FinalCertificate.put("Step1","Click on Upload Certificate ");
		Fitness_FinalCertificate.put("Step2","Click on Upload IMO/IMP Certificate ");
		Fitness_FinalCertificate.put("Step3","Enter IP Number");
		Fitness_FinalCertificate.put("Step4","Select IMO Radio Btn");
		Fitness_FinalCertificate.put("Step5","Click on Continuation Of Previous Spell");
		Fitness_FinalCertificate.put("Step6","Click on Submit");
		Fitness_FinalCertificate.put("Step7","Select First Certificate Date");
		Fitness_FinalCertificate.put("Step8","Select Examination Date");
		Fitness_FinalCertificate.put("Step9","Select Fitness Checkbox");
		Fitness_FinalCertificate.put("Step10","Select Fitness Date");
		Fitness_FinalCertificate.put("Step11","Select BO Date");
		Fitness_FinalCertificate.put("Step12","Select EnSB Checkbox");
		Fitness_FinalCertificate.put("Step13","Enter Diagnosis");
		Fitness_FinalCertificate.put("Step14","Enter Medical Officer Name");
		Fitness_FinalCertificate.put("Step15","Enter Dispensary Location");
		Fitness_FinalCertificate.put("Step16","Enter Remarks");
		Fitness_FinalCertificate.put("Step17","Click on Submit Button");

		//EnSB Claim
		ENSBCreateClaim.put("Step1","Click on Create A new Claim Request ");
		ENSBCreateClaim.put("Step2","Enter IP Number");
		ENSBCreateClaim.put("Step3","Select SB / ESB / TDB / MBSB Claim Type");
		ENSBCreateClaim.put("Step4","Click on Submit");

		//=======================================================================
		//EnSB Claim
		ENSBCreateAndProcessClaimLDCLogin.put("Step1","Click on Create Acknowlegement");
		ENSBCreateAndProcessClaimLDCLogin.put("Step2","Select Claim Type Enhanced Sickness Benefit");
		ENSBCreateAndProcessClaimLDCLogin.put("Step3","Enter Remarks");
		ENSBCreateAndProcessClaimLDCLogin.put("Step4","Click on Generate Button");
		ENSBCreateAndProcessClaimLDCLogin.put("Step5","Click on Back button");
		ENSBCreateAndProcessClaimLDCLogin.put("Step6","Select From Date");
		ENSBCreateAndProcessClaimLDCLogin.put("Step7","Select To Date");
		ENSBCreateAndProcessClaimLDCLogin.put("Step8","Click Acknowledgement Button");
		ENSBCreateAndProcessClaimLDCLogin.put("Step9","Select Acknowlegment");
		ENSBCreateAndProcessClaimLDCLogin.put("Step10","Click on Submit Acknowlegement");
		ENSBCreateAndProcessClaimLDCLogin.put("Step11","Enter Remarks");
		ENSBCreateAndProcessClaimLDCLogin.put("Step12","Click on Submit");
		ENSBCreateAndProcessClaimLDCLogin.put("Step13","Get Claim ID");

		ENSBCreateAndProcessClaimLDCLogin.put("Step14","Click on Process A Claim");
		ENSBCreateAndProcessClaimLDCLogin.put("Step15","Click on Sickness Benefit Claim Processing");
		ENSBCreateAndProcessClaimLDCLogin.put("Step16","Click on Page 2");
		ENSBCreateAndProcessClaimLDCLogin.put("Step17","Click on Claim Id");
		ENSBCreateAndProcessClaimLDCLogin.put("Step18","Click on Next Button");
		ENSBCreateAndProcessClaimLDCLogin.put("Step19","Click on Next Button");
		ENSBCreateAndProcessClaimLDCLogin.put("Step20","Enter Remarks");
		ENSBCreateAndProcessClaimLDCLogin.put("Step21","Click on Submit To BM");
		//===========================================

		//EnSB Claim
		BMLoginforENSB.put("Step1","Enter User Name");
		BMLoginforENSB.put("Step2","Enter Pass word");
		BMLoginforENSB.put("Step3","Click Login button");
		BMLoginforENSB.put("Step4","Verify sucess fully login");
		BMLoginforENSB.put("Step5","Select BO Ajmeri Gate");
		BMLoginforENSB.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforENSB.put("Step7","Click on Submit Button");

		//===================================================

		//EnSB Claim
		ENSBProcessClaimBMLogin.put("Step1","Click on Process A Claim");
		ENSBProcessClaimBMLogin.put("Step2","Click on Enhanced Claim Processing");
		ENSBProcessClaimBMLogin.put("Step3","Click on Claim Id");
		ENSBProcessClaimBMLogin.put("Step4","Click on Next Button");
		ENSBProcessClaimBMLogin.put("Step5","Click on Next Button");
		ENSBProcessClaimBMLogin.put("Step6","Enter Remarks");
		ENSBProcessClaimBMLogin.put("Step7","Click on Approve/Reject Btn");

		//=======================================================================================================================
		//PDB Claim
		LoginforPDB.put("Step1","Enter User Name");
		LoginforPDB.put("Step2","Enter Pass word");
		LoginforPDB.put("Step3","Click Login button");
		LoginforPDB.put("Step4","Verify sucess fully login");

		//	============================================================
		//PDB Claim
		PDBPeriodicalCreateClaim.put("Step1","Click on Create A new Claim Request ");
		PDBPeriodicalCreateClaim.put("Step2","Enter IP Number");
		PDBPeriodicalCreateClaim.put("Step3","Select Permanent Disablement Benefit Claim Type");
		PDBPeriodicalCreateClaim.put("Step4","Select PDB - Periodical Claim as Claim SubType");
		PDBPeriodicalCreateClaim.put("Step5","Click on Submit");

		PDBPeriodicalCreateClaim.put("Step6","Select Accident Date");
		PDBPeriodicalCreateClaim.put("Step7","Upload Life Certificate");
		PDBPeriodicalCreateClaim.put("Step8","Click on Submit Button");
		PDBPeriodicalCreateClaim.put("Step9","Get Claim ID");

		PDBPeriodicalCreateClaim.put("Step10","Click on Process A Claim");
		PDBPeriodicalCreateClaim.put("Step11","Click on Permanent Disablement Benefit Claim Processing Link");
		PDBPeriodicalCreateClaim.put("Step12","Click on Claim Id");
		PDBPeriodicalCreateClaim.put("Step13","Click on Next Button");
		PDBPeriodicalCreateClaim.put("Step14","Click on Next Button");
		PDBPeriodicalCreateClaim.put("Step15","Enter Remarks");
		PDBPeriodicalCreateClaim.put("Step16","Click on Submit To BM");

		//=====================================================================
		//PDB Claim
		BMLoginforPDB.put("Step1","Enter User Name");
		BMLoginforPDB.put("Step2","Enter Pass word");
		BMLoginforPDB.put("Step3","Click Login button");
		BMLoginforPDB.put("Step4","Verify sucess fully login");
		BMLoginforPDB.put("Step5","Select BO Ajmeri Gate");
		BMLoginforPDB.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforPDB.put("Step7","Click on Submit Button");

		//============================================================
		//PDB Claim
		PDBPeriodicalClaimProcessingBMLogin.put("Step1","Click on Process A Claim");
		PDBPeriodicalClaimProcessingBMLogin.put("Step2","Click on Permanent Disablement Benefit Claim Processing Link");
		PDBPeriodicalClaimProcessingBMLogin.put("Step3","Click on Claim Id");
		PDBPeriodicalClaimProcessingBMLogin.put("Step4","Click on Next Button");
		PDBPeriodicalClaimProcessingBMLogin.put("Step5","Click on Next Button");
		PDBPeriodicalClaimProcessingBMLogin.put("Step6","Enter Remarks");
		PDBPeriodicalClaimProcessingBMLogin.put("Step7","Click on Approve/Reject Btn");

		//====================================================================================================================
		//Funeral Expenses Claim
		LoginForFuneralExpenses.put("Step1","Enter User Name");
		LoginForFuneralExpenses.put("Step2","Enter Pass word");
		LoginForFuneralExpenses.put("Step3","Click Login button");
		LoginForFuneralExpenses.put("Step4","Verify sucess fully login");


		//=======================================================
		//Funeral Expenses Claim
		UploadDeathCertificateforFuneralExpenses.put("Step1","Click on Upload Certificate ");
		UploadDeathCertificateforFuneralExpenses.put("Step2","Click on Upload Alternate Death Certificate ");
		UploadDeathCertificateforFuneralExpenses.put("Step3","Enter IP Number");
		UploadDeathCertificateforFuneralExpenses.put("Step4","Enter Death Date");
		UploadDeathCertificateforFuneralExpenses.put("Step5","Enter Cause Of Death");
		UploadDeathCertificateforFuneralExpenses.put("Step6","Enter Medical Officer Name");
		UploadDeathCertificateforFuneralExpenses.put("Step7","Enter Issue Date");
		UploadDeathCertificateforFuneralExpenses.put("Step8","Upload Death Certificate");
		UploadDeathCertificateforFuneralExpenses.put("Step9","Click on Submit Button");

		//===============================================
		//Funeral Expenses Claim
		CreateClaimForFuneralExpenses.put("Step1", "Click on Create A new Claim Request ");
		CreateClaimForFuneralExpenses.put("Step2", "Enter IP Number");
		CreateClaimForFuneralExpenses.put("Step3", "Select Funeral Expenses");
		CreateClaimForFuneralExpenses.put("Step4", "Click on Submit");

		//======================================================
		//Funeral Expenses Claim
		FunerallExpenssClaim.put("Step1","Click on Create Acknowlegement");
		FunerallExpenssClaim.put("Step2","Select Claim Type Funeral Expenses");
		FunerallExpenssClaim.put("Step3","Enter Remarks");
		FunerallExpenssClaim.put("Step4","Click on Generate Button");
		FunerallExpenssClaim.put("Step5","Click on Back button");
		FunerallExpenssClaim.put("Step6","Select Death Date");
		FunerallExpenssClaim.put("Step7","Enter Ip Designation");
		FunerallExpenssClaim.put("Step8","Enter Claiment Name");
		FunerallExpenssClaim.put("Step9","Enter age");
		FunerallExpenssClaim.put("Step10","Click Acknowledgement Button");
		FunerallExpenssClaim.put("Step11","Select Acknowlegment");
		FunerallExpenssClaim.put("Step12","Click on Submit Acknowlegement");
		FunerallExpenssClaim.put("Step13","Upload Death Certificate");
		FunerallExpenssClaim.put("Step14","Click on Submit");
		FunerallExpenssClaim.put("Step15","Get Claim ID");

		FunerallExpenssClaim.put("Step16","Click on Process A Claim");
		FunerallExpenssClaim.put("Step17","Click on Funeral Expenses Claim Processing");
		FunerallExpenssClaim.put("Step18","Click on Claim Id");
		FunerallExpenssClaim.put("Step19","Click on Next Button");
		FunerallExpenssClaim.put("Step20","Click on Next Button");
		FunerallExpenssClaim.put("Step21","Enter Remarks");
		FunerallExpenssClaim.put("Step22","Click on Submit To BM");

		//=============================================================
		//Funeral Expenses Claim
		BMLoginforFuneralExpenses.put("Step1","Enter User Name");
		BMLoginforFuneralExpenses.put("Step2","Enter Pass word");
		BMLoginforFuneralExpenses.put("Step3","Click Login button");
		BMLoginforFuneralExpenses.put("Step4","Verify sucess fully login");
		BMLoginforFuneralExpenses.put("Step5","Select BO Ajmeri Gate");
		BMLoginforFuneralExpenses.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforFuneralExpenses.put("Step7","Click on Submit Button");

		//===============================================================
		//Funeral Expenses Claim
		FuneralExpensesBMLogin.put("Step1","Click on Process A Claim");
		FuneralExpensesBMLogin.put("Step2","Click on Sickness Benefit Claim Processing");
		FuneralExpensesBMLogin.put("Step3","Click on Claim Id");
		FuneralExpensesBMLogin.put("Step4","Click on Next Button");
		FuneralExpensesBMLogin.put("Step5","Click on Next Button");
		FuneralExpensesBMLogin.put("Step6","Enter Remarks");
		FuneralExpensesBMLogin.put("Step7","Click on Approve/Reject Btn");

		//==================================================================================================================================
		//Extended Sickness Benefit
		LoginforESB.put("Step1","Enter User Name");
		LoginforESB.put("Step2","Enter Pass word");
		LoginforESB.put("Step3","Click Login button");
		LoginforESB.put("Step4","Verify sucess fully login");


		//=======================================================
		//Extended Sickness Benefit
		ESBMed8Certificate.put("Step1","Click on Upload Certificate ");
		ESBMed8Certificate.put("Step2","Click on Upload Med8 Certificate");
		ESBMed8Certificate.put("Step3","Enter IP Number");
		ESBMed8Certificate.put("Step4","Click on Submit Button");
		ESBMed8Certificate.put("Step5","Enter Occupation");
		ESBMed8Certificate.put("Step6","Enter Place Of Work");
		ESBMed8Certificate.put("Step7","Enter History Of Case");
		ESBMed8Certificate.put("Step8","Enter Previous Illness");
		ESBMed8Certificate.put("Step9","Enter Specialist Report");
		ESBMed8Certificate.put("Step10","Select Diagnosis Date");
		ESBMed8Certificate.put("Step11","Select Present Diagnosis");
		ESBMed8Certificate.put("Step12","Select Date");
		ESBMed8Certificate.put("Step13","Select Date");
		ESBMed8Certificate.put("Step14","Enter ImoName");
		ESBMed8Certificate.put("Step15","Enter ImpCode");
		ESBMed8Certificate.put("Step16","Click on Submit Button");

		//=======================================================
		//Extended Sickness Benefit
		ContinuationOfPreviousSpellCertificateForESB1.put("Step1","Click on Upload Certificate ");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step2","Click on Upload IMO/IMP Certificate ");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step3","Enter IP Number");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step4","Select IMO Radio Btn");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step5","Click on Continuation Of Previous Spell");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step6","Click on Special Intermediate ChkBx");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step7","Click on Submit");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step8","Select First Certificate Date");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step9","Select Examination Date");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step10","Select Next Visit Date");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step11","Select BO Date");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step12","Enter Diagnosis");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step13","Enter Medical Officer Name");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step14","Enter Dispensary Location");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step15","Enter Remarks");
		ContinuationOfPreviousSpellCertificateForESB1.put("Step16","Click on Submit Button");

		//=======================================================
		//Extended Sickness Benefit
		ContinuationOfPreviousSpellCertificateForESB2.put("Step1","Click on Upload Certificate ");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step2","Click on Upload IMO/IMP Certificate ");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step3","Enter IP Number");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step4","Select IMO Radio Btn");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step5","Click on Continuation Of Previous Spell");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step6","Click on Special Intermediate ChkBx");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step7","Click on Submit");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step8","Select First Certificate Date");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step9","Select Examination Date");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step10","Select Next Visit Date");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step11","Select BO Date");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step12","Enter Diagnosis");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step13","Enter Medical Officer Name");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step14","Enter Dispensary Location");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step15","Enter Remarks");
		ContinuationOfPreviousSpellCertificateForESB2.put("Step16","Click on Submit Button");

		//=======================================================
		//Extended Sickness Benefit
		ContinuationOfPreviousSpellCertificateForESB3.put("Step1","Click on Upload Certificate ");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step2","Click on Upload IMO/IMP Certificate ");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step3","Enter IP Number");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step4","Select IMO Radio Btn");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step5","Click on Continuation Of Previous Spell");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step6","Click on Special Intermediate ChkBx");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step7","Click on Submit");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step8","Select First Certificate Date");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step9","Select Examination Date");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step10","Select Next Visit Date");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step11","Select BO Date");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step12","Enter Diagnosis");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step13","Enter Medical Officer Name");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step14","Enter Dispensary Location");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step15","Enter Remarks");
		ContinuationOfPreviousSpellCertificateForESB3.put("Step16","Click on Submit Button");

		//=======================================================
		//Extended Sickness Benefit
		ESBCreateClaim.put("Step1","Click on Create A new Claim Request ");
		ESBCreateClaim.put("Step2","Enter IP Number");
		ESBCreateClaim.put("Step3","Select SB / ESB / TDB / MBSB Claim Type");
		ESBCreateClaim.put("Step4","Click on Submit");

		//=======================================================
		//Extended Sickness Benefit
		ESBP.put("Step1","Click on Create Acknowlegement");
		ESBP.put("Step2","Select Claim Type Extended Sickness Benefit");
		ESBP.put("Step3","Enter Remarks");
		ESBP.put("Step4","Click on Generate Button");
		ESBP.put("Step5","Click on Back button");
		ESBP.put("Step6","Select From Date");
		ESBP.put("Step7","Select To Date");
		ESBP.put("Step8","Click Acknowledgement Button");
		ESBP.put("Step9","Select Acknowlegment");
		ESBP.put("Step10","Click on Submit Acknowlegement");
		ESBP.put("Step11","Enter Remarks");
		ESBP.put("Step12","Click on Submit");
		ESBP.put("Step13","Get Claim ID");

		ESBP.put("Step14","Click on Process A Claim");
		ESBP.put("Step15","Click on Sickness Benefit Claim Processing");
		ESBP.put("Step16","Click on Page 2");
		ESBP.put("Step17","Click on Claim Id");
		ESBP.put("Step18","Click on Next Button");
		ESBP.put("Step19","Click on Next Button");
		ESBP.put("Step20","Enter Remarks");
		ESBP.put("Step21","Click on Submit To BM");
		//===========================================

		//=======================================================
		//Extended Sickness Benefit
		BMLoginforESB.put("Step1","Enter User Name");
		BMLoginforESB.put("Step2","Enter Pass word");
		BMLoginforESB.put("Step3","Click Login button");
		BMLoginforESB.put("Step4","Verify sucess fully login");
		BMLoginforESB.put("Step5","Select BO Ajmeri Gate");
		BMLoginforESB.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforESB.put("Step7","Click on Submit Button");

		//=======================================================
		//Extended Sickness Benefit
		ESBProcessClaimBMLogin2.put("Step1","Click on Process A Claim");
		ESBProcessClaimBMLogin2.put("Step2","Click on Sickness Benefit Claim Processing");
		ESBProcessClaimBMLogin2.put("Step3","Click on Claim Id");
		ESBProcessClaimBMLogin2.put("Step4","Click on Next Button");
		ESBProcessClaimBMLogin2.put("Step5","Click on Next Button");
		ESBProcessClaimBMLogin2.put("Step6","Enter Remarks");
		ESBProcessClaimBMLogin2.put("Step7","Click on Approve/Reject Btn");

		//=================================================================================================================================
		//RGSKY Claim
		LoginforRGSKY.put("Step1","Enter User Name");
		LoginforRGSKY.put("Step2","Enter Pass word");
		LoginforRGSKY.put("Step3","Click Login button");
		LoginforRGSKY.put("Step4","Verify sucess fully login");

		//=============================================
		//RGSKY Claim
		RGSKY.put("Step1","Click on Create A new Claim Request ");
		RGSKY.put("Step2","Enter IP Number");
		RGSKY.put("Step3","Select RGSKY Claim Type");
		RGSKY.put("Step4","Click on Submit");

		//==========================================
		//RGSKY Claim
		RGSKYUA1.put("Step1","Select Unemployment reason");
		RGSKYUA1.put("Step2","Select Unemployment From Date");
		RGSKYUA1.put("Step3","Select Unemployment To Date");
		RGSKYUA1.put("Step4","Select Last Date of Unemployment");
		RGSKYUA1.put("Step5","Attach Scanned copy of UA-1");
		RGSKYUA1.put("Step6","Enter Name");
		RGSKYUA1.put("Step7","Enter Designation");
		RGSKYUA1.put("Step8","Enter Issuing Date");
		RGSKYUA1.put("Step9","Attach Scanned copy of UA-2");
		RGSKYUA1.put("Step10","Click on Submit");
		RGSKYUA1.put("Step11","Get Claim ID");

		RGSKYUA1.put("Step12","Click on Process A Claim");
		RGSKYUA1.put("Step13","Click on RGSKY Claim Processing Link");
		RGSKYUA1.put("Step14","Click on Claim Id");
		RGSKYUA1.put("Step15","Click on Next Button");
		RGSKYUA1.put("Step16","Click on Next Button");
		RGSKYUA1.put("Step17","Upload Delay Reason");
		RGSKYUA1.put("Step18","Enter Remarks");
		RGSKYUA1.put("Step19","Click on Submit To BM");

		//======================================================
		//RGSKY Claim
		BMLoginforRGSKY.put("Step1","Enter User Name");
		BMLoginforRGSKY.put("Step2","Enter Pass word");
		BMLoginforRGSKY.put("Step3","Click Login button");
		BMLoginforRGSKY.put("Step4","Verify sucess fully login");
		BMLoginforRGSKY.put("Step5","Select BO Ajmeri Gate");
		BMLoginforRGSKY.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforRGSKY.put("Step7","Click on Submit Button");

		//===============================================================
		//RGSKY Claim
		RGSKYBMLogin.put("Step1","Click on Process A Claim");
		RGSKYBMLogin.put("Step2","Click on RGSKY Claim Processing Link");
		RGSKYBMLogin.put("Step3","Click on Claim Id");
		RGSKYBMLogin.put("Step4","Click on Next Button");
		RGSKYBMLogin.put("Step5","Click on Send UA3 to Employer for UA4I Link");
		RGSKYBMLogin.put("Step6","Click on Send Button");

		//===============================================================
		//RGSKY Claim
		UploadUA4iCertificate.put("Step1","Click on Upload Certificate ");
		UploadUA4iCertificate.put("Step2","Click on Upload UA4i Certificate");
		UploadUA4iCertificate.put("Step3","Enter IP Number");
		UploadUA4iCertificate.put("Step4","Enter SuperAnnuation Date");
		UploadUA4iCertificate.put("Step5","Enter Appointment Date");
		UploadUA4iCertificate.put("Step6","Select Reason Of Unemployment from DropDown");
		UploadUA4iCertificate.put("Step7","Select Unemployment Date");
		UploadUA4iCertificate.put("Step8","Upload File");
		UploadUA4iCertificate.put("Step9","Select CheckBox");
		UploadUA4iCertificate.put("Step10","Click on Submit Button");

		//===============================================================
		//RGSKY Claim
		RGSKYUA4iBMLogin.put("Step1","Click on Process A Claim");
		RGSKYUA4iBMLogin.put("Step2","Click on RGSKY Claim Processing Link");
		RGSKYUA4iBMLogin.put("Step3","Click on Claim Id");
		RGSKYUA4iBMLogin.put("Step4","Click on Next Button");
		RGSKYUA4iBMLogin.put("Step5","Click on Next Button");
		RGSKYUA4iBMLogin.put("Step6","Enter Remarks");
		RGSKYUA4iBMLogin.put("Step7","Click on Submit/Reject button");

		//======================================================
		//RGSKY Claim
		ROLoginforRGSKY.put("Step1","Enter User Name");
		ROLoginforRGSKY.put("Step2","Enter Pass word");
		ROLoginforRGSKY.put("Step3","Click Login button");
		ROLoginforRGSKY.put("Step4","Verify sucess fully login");
		ROLoginforRGSKY.put("Step5","Select RO-Rajendra Place");
		ROLoginforRGSKY.put("Step6","Select Benefits Branch Officer");
		ROLoginforRGSKY.put("Step7","Click on Submit Button");

		//===============================================================
		//RGSKY Claim
		RGSKYROLogin.put("Step1","Click on Process A Claim");
		RGSKYROLogin.put("Step2","Click on RGSKY Claim Processing Link");
		RGSKYROLogin.put("Step3","Click on Claim Id");
		RGSKYROLogin.put("Step4","Click on Next Button");
		RGSKYROLogin.put("Step5","Click on Next Button");
		RGSKYROLogin.put("Step6","Enter Remarks");
		RGSKYROLogin.put("Step7","Click on Approve button");

		//======================================================
		//RGSKY Claim
		UploadUA4iiRGSKYCertificate.put("Step1","Enter User Name");
		UploadUA4iiRGSKYCertificate.put("Step2","Enter Pass word");
		UploadUA4iiRGSKYCertificate.put("Step3","Click Login button");
		UploadUA4iiRGSKYCertificate.put("Step4","Verify sucess fully login");
		UploadUA4iiRGSKYCertificate.put("Step5","Select BO-Ajmeri Gate");
		UploadUA4iiRGSKYCertificate.put("Step6","Select LDC/UDC at Branch Office");
		UploadUA4iiRGSKYCertificate.put("Step7","Click on Submit Button");

		//===============================================================
		//RGSKY Claim
		UploadUA4iiCertificate.put("Step1","Click on Upload Certificate ");
		UploadUA4iiCertificate.put("Step2","Click on Upload UA4ii Certificate");
		UploadUA4iiCertificate.put("Step3","Enter IP Number");
		UploadUA4iiCertificate.put("Step4","Enter Designation");
		UploadUA4iiCertificate.put("Step5","Select Employment From Date");
		UploadUA4iiCertificate.put("Step6","Select Employment To Date");
		UploadUA4iiCertificate.put("Step7","Enter Department");
		UploadUA4iiCertificate.put("Step8","Select CheckBox");
		UploadUA4iiCertificate.put("Step9","Click on Submit Button");

		//=============================================
		//RGSKY Claim
		UA9Claim.put("Step1","Click on Create A new Claim Request ");
		UA9Claim.put("Step2","Enter IP Number");
		UA9Claim.put("Step3","Select RGSKY Claim Type");
		UA9Claim.put("Step4","Select RGSKY UA9 Claim SubType");
		UA9Claim.put("Step5","Click on Submit");

		//==========================================
		//RGSKY Claim
		RGSKYUA9ClaimCreate.put("Step1","Select Claim From Date");
		RGSKYUA9ClaimCreate.put("Step2","Select Claim To Date");
		RGSKYUA9ClaimCreate.put("Step3","Attach Scanned Copy of UA-9");
		RGSKYUA9ClaimCreate.put("Step4","Click on Submit");
		RGSKYUA9ClaimCreate.put("Step5","Get Claim ID");

		RGSKYUA9ClaimCreate.put("Step6","Click on Process A Claim");
		RGSKYUA9ClaimCreate.put("Step7","Click on RGSKY Claim Processing Link");
		RGSKYUA9ClaimCreate.put("Step8","Click on Claim Id");
		RGSKYUA9ClaimCreate.put("Step9","Click on Next Button");
		RGSKYUA9ClaimCreate.put("Step10","Click on Next Button");
		RGSKYUA9ClaimCreate.put("Step11","Upload Delay Reason");
		RGSKYUA9ClaimCreate.put("Step12","Enter Remarks");
		RGSKYUA9ClaimCreate.put("Step13","Click on Submit To BM");

		//======================================================
		//RGSKY Claim
		BMLoginforRGSKYUA9.put("Step1","Enter User Name");
		BMLoginforRGSKYUA9.put("Step2","Enter Pass word");
		BMLoginforRGSKYUA9.put("Step3","Click Login button");
		BMLoginforRGSKYUA9.put("Step4","Verify sucess fully login");
		BMLoginforRGSKYUA9.put("Step5","Select BO Ajmeri Gate");
		BMLoginforRGSKYUA9.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforRGSKYUA9.put("Step7","Click on Submit Button");

		//RGSKY Claim
		RGSKYUA9ProcessingBMLogin.put("Step1","Click on Process A Claim");
		RGSKYUA9ProcessingBMLogin.put("Step2","Click on RGSKY Claim Processing Link");
		RGSKYUA9ProcessingBMLogin.put("Step3","Click on Claim Id");
		RGSKYUA9ProcessingBMLogin.put("Step4","Click on Next Button");
		RGSKYUA9ProcessingBMLogin.put("Step5","Click on Next Button");
		RGSKYUA9ProcessingBMLogin.put("Step6","Enter Remarks");
		RGSKYUA9ProcessingBMLogin.put("Step7","Click on Approve/Reject button");

		//===============================================================================================================================
		//Print Counter Foil
		LoginforPrintCounterFoil.put("Step1","Enter User Name");
		LoginforPrintCounterFoil.put("Step2","Enter Pass word");
		LoginforPrintCounterFoil.put("Step3","Click Login button");
		LoginforPrintCounterFoil.put("Step4","Verify sucess fully login");

		//==========================================================
		//Print Counter Foil
		PrintCounterFoil.put("Step1","Click on e-Pehchan card");
		PrintCounterFoil.put("Step2","Enter Employers Code");
		PrintCounterFoil.put("Step3","Click on View button");
		PrintCounterFoil.put("Step4","Click on View Counter Foil Link");
		PrintCounterFoil.put("Step5","Click on Print Counter Foil Btn");
		PrintCounterFoil.put("Step6","Click on Cancel Counter Foil Btn");

		//===================================================================================================================================
		//Conveyance Allowance
		LoginforConveyanceAllowance.put("Step1","Enter User Name");
		LoginforConveyanceAllowance.put("Step2","Enter Pass word");
		LoginforConveyanceAllowance.put("Step3","Click Login button");
		LoginforConveyanceAllowance.put("Step4","Verify sucess fully login");

		//======================================================================
		//Conveyance Allowance
		ConveyanceAllowance.put("Step1","Click on Create A new Claim Request ");
		ConveyanceAllowance.put("Step2","Enter IP Number");
		ConveyanceAllowance.put("Step3","Select Conveyance Allowance Claim Type");
		ConveyanceAllowance.put("Step4","Click on Submit");

		//======================================================================
		//Conveyance Allowance
		ConvyanceAllowanceCreateClaim.put("Step1","Select Appeared before from Dropdown");
		ConvyanceAllowanceCreateClaim.put("Step2","Select Date of Appearance");
		ConvyanceAllowanceCreateClaim.put("Step3","Click on Next");
		ConvyanceAllowanceCreateClaim.put("Step4","Select whether Insured person employed ");
		ConvyanceAllowanceCreateClaim.put("Step5","Select loss of wages From Date");
		ConvyanceAllowanceCreateClaim.put("Step6","Select loss of wages To Date");
		ConvyanceAllowanceCreateClaim.put("Step7","Enter number of days");
		ConvyanceAllowanceCreateClaim.put("Step8","Select AM or PM ");
		ConvyanceAllowanceCreateClaim.put("Step9","Select loss of wages To Date");
		ConvyanceAllowanceCreateClaim.put("Step10","Enter time of abstention from work");
		ConvyanceAllowanceCreateClaim.put("Step11","Select Abstention From Date and To Date");
		ConvyanceAllowanceCreateClaim.put("Step12","Click on Next");
		ConvyanceAllowanceCreateClaim.put("Step13","Select Authority who Certified Section D ");
		ConvyanceAllowanceCreateClaim.put("Step14","Enter Remarks");
		ConvyanceAllowanceCreateClaim.put("Step15","Click on Next");

		//======================================================================
		//Conveyance Allowance
		ConvyanceAllowanceFillDetails.put("Step1","Select Start place of travel");
		ConvyanceAllowanceFillDetails.put("Step2","Select Destination");
		ConvyanceAllowanceFillDetails.put("Step3","Enter Distance travelled");
		ConvyanceAllowanceFillDetails.put("Step4","Enter Onward journey expense");
		ConvyanceAllowanceFillDetails.put("Step5","Enter Return Journey expense");
		ConvyanceAllowanceFillDetails.put("Step6","Select mode of Travel");
		ConvyanceAllowanceFillDetails.put("Step7","Select Ticket Type");
		ConvyanceAllowanceFillDetails.put("Step8","Click on Submit");

		ConvyanceAllowanceFillDetails.put("Step9","Get Claim ID");
		ConvyanceAllowanceFillDetails.put("Step10","Click on Process A Claim");
		ConvyanceAllowanceFillDetails.put("Step11","Click on Conveyance Allowance Claim Processing Link");
		ConvyanceAllowanceFillDetails.put("Step12","Click on Claim Id");
		ConvyanceAllowanceFillDetails.put("Step13","Click on Next Button");
		ConvyanceAllowanceFillDetails.put("Step14","Enter Remarks");
		ConvyanceAllowanceFillDetails.put("Step15","Click on Submit To BM");

		//======================================================================
		//Conveyance Allowance
		BMLoginforConveyanceAllowance.put("Step1","Enter User Name");
		BMLoginforConveyanceAllowance.put("Step2","Enter Pass word");
		BMLoginforConveyanceAllowance.put("Step3","Click Login button");
		BMLoginforConveyanceAllowance.put("Step4","Verify sucess fully login");
		BMLoginforConveyanceAllowance.put("Step5","Select BO Ajmeri Gate");
		BMLoginforConveyanceAllowance.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforConveyanceAllowance.put("Step7","Click on Submit Button");

		//=======================================================
		//Conveyance Allowance
		ConveyanceAllowanceClaimProcessingBM.put("Step1","Click on Process A Claim");
		ConveyanceAllowanceClaimProcessingBM.put("Step2","Click on Conveyance Allowance Claim Processing Link");
		ConveyanceAllowanceClaimProcessingBM.put("Step3","Click on Claim Id");
		ConveyanceAllowanceClaimProcessingBM.put("Step4","Click on Next Button");
		ConveyanceAllowanceClaimProcessingBM.put("Step5","Enter Remarks");
		ConveyanceAllowanceClaimProcessingBM.put("Step6","Click on Approve/Reject Btn");
		ConveyanceAllowanceClaimProcessingBM.put("Step6","Click on Print Btn");

		//====================================================================================================================================
		//View SubUnits
		LoginforViewSubUnits.put("Step1","Enter User Name");
		LoginforViewSubUnits.put("Step2","Enter Pass word");
		LoginforViewSubUnits.put("Step3","Click Login button");
		LoginforViewSubUnits.put("Step4","Verify sucess fully login");

		//===========================================================
		//View SubUnits
		ViewRegister.put("Step1","Click on View Subunits");
		ViewRegister.put("Step2","Enter Employers Code");
		ViewRegister.put("Step3","Click on Search Button");
		ViewRegister.put("Step4","Click on View Link");
		ViewRegister.put("Step5","Click on any SubUnit Code");
		ViewRegister.put("Step6","Click on Edit button");
		ViewRegister.put("Step7","lick on Yes Radio Button");
		ViewRegister.put("Step8","Enter Address");
		ViewRegister.put("Step9","Select state");
		ViewRegister.put("Step10","Enter Pincode");
		ViewRegister.put("Step11","Select District");

		ViewRegister.put("Step12","Enter Mobile Number");
		ViewRegister.put("Step13","Click on Next button");
		ViewRegister.put("Step14","Enter Name of the Official");
		ViewRegister.put("Step15","Enter Address");
		ViewRegister.put("Step16","Enter Designation");
		ViewRegister.put("Step17","Enter State");
		ViewRegister.put("Step18","Enter Pincode");
		ViewRegister.put("Step19","Enter District");
		ViewRegister.put("Step20","Enter Mobile Number");
		ViewRegister.put("Step21","Click on Update");

		//================================================================================================================================
		//Update Employee Details
		LoginforUpdateEmployerDetails.put("Step1","Enter User Name");
		LoginforUpdateEmployerDetails.put("Step2","Enter Pass word");
		LoginforUpdateEmployerDetails.put("Step3","Click Login button");
		LoginforUpdateEmployerDetails.put("Step4","Verify sucess fully login");

		//======================================================
		//Update Employee Details
		UpdateRegister.put("Step1","Click on Update Employee");
		UpdateRegister.put("Step2","Enter ESIC Code Number Of Employer");
		UpdateRegister.put("Step3","Click on Search Button");
		UpdateRegister.put("Step4","Select a Property to Edit as Name of Factory / Establishment");
		UpdateRegister.put("Step5","Click on Edit Button");
		UpdateRegister.put("Step6","Enter Name of the Establishment");
		UpdateRegister.put("Step7","Select a Property to Edit as Complete Postal Address of Factory/Establishment");
		UpdateRegister.put("Step8","Click on Edit");
		UpdateRegister.put("Step9","Enter Address");
		UpdateRegister.put("Step10","Select Pincode");
		UpdateRegister.put("Step11","Enter State");
		UpdateRegister.put("Step12","Select District");

		UpdateRegister.put("Step13","Enter Police Station");
		UpdateRegister.put("Step14","Select Property to Edit as Constitution of Ownership");
		UpdateRegister.put("Step15","Click on Edit Button");
		UpdateRegister.put("Step16","Select Constitution of Ownership");
		UpdateRegister.put("Step17","Select Property to Edit as Name / Address(s) of Present Proprietor / Managing Directors / Managing Partners / Secretary of the Co-operative Society");
		UpdateRegister.put("Step18","Click on Edit Button");
		UpdateRegister.put("Step19","Click on the 'Click Here to Enter Details' Link");
		UpdateRegister.put("Step20","Select Partner from dropdown");
		UpdateRegister.put("Step21","Enter Name");
		UpdateRegister.put("Step22","Enter Age");
		UpdateRegister.put("Step23","Enter Designation");
		UpdateRegister.put("Step24","Enter Father's Name");
		UpdateRegister.put("Step25","Enter Present and Peramnent Address");
		UpdateRegister.put("Step26","Click on Save");
		UpdateRegister.put("Step27","Select Property to Edit as Details of Bank Account(s)");
		UpdateRegister.put("Step28","Click on Edit Button");
		UpdateRegister.put("Step29","Select Account Checkbox");
		UpdateRegister.put("Step30","Enter Account Number");
		UpdateRegister.put("Step31","Enter Name of the Bank");
		UpdateRegister.put("Step32","Enter Name of the Branch");
		UpdateRegister.put("Step33","Enter MICR Code of the Bank/Branch");
		UpdateRegister.put("Step34","Enter IFSC Code of the Bank/Branch");
		UpdateRegister.put("Step35","Select Property to Edit as BO / ID");
		UpdateRegister.put("Step36","Click on Edit Button");
		UpdateRegister.put("Step37","Select Branch Office");
		UpdateRegister.put("Step38","Select Inspection Division");
		UpdateRegister.put("Step39","Click on Update/Cancel button");

		//============================================================================================================================
		//Edit Employee Details
		LoginforEditEmployeeDetails.put("Step1","Enter User Name");
		LoginforEditEmployeeDetails.put("Step2","Enter Pass word");
		LoginforEditEmployeeDetails.put("Step3","Click Login button");
		LoginforEditEmployeeDetails.put("Step4","Verify sucess fully login");

		//=====================================
		//Edit Employee Details
		EditRegister.put("Step1","Click on Edit Employee Details ");
		EditRegister.put("Step2","Enter Employee Insurance Number");
		EditRegister.put("Step3","Click on Search");
		EditRegister.put("Step4","Select the Radio Button");
		EditRegister.put("Step5","Click on Edit button");
		EditRegister.put("Step6","Click on Name/Dispensary Details Radio Button");
		EditRegister.put("Step6","Edit Name");
		EditRegister.put("Step6","Select Declaration Checkbox");
		EditRegister.put("Step6","Click on Update Button");


		//========================================
		//Edit Employee Details
		EditPersonalDetails.put("Step1","Click on Personal Deatils Radio Button");
		EditPersonalDetails.put("Step2","Select DOB");
		EditPersonalDetails.put("Step3","Enter Father's Name");
		EditPersonalDetails.put("Step4","Select Marital Status");
		EditPersonalDetails.put("Step5","Select Gender");
		EditPersonalDetails.put("Step6","Select Declaration Checkbox");
		EditPersonalDetails.put("Step7","Click on Update Button");

		//===========================================
		//Edit Employee Details
		EditAddressDetails.put("Step1","Click on Address Details Radio Button");
		EditAddressDetails.put("Step2","Enter Address");
		EditAddressDetails.put("Step3","Enter Pincode");
		EditAddressDetails.put("Step4","Select State");
		EditAddressDetails.put("Step5","Select District");
		EditAddressDetails.put("Step6","Click on Present Address As Permanent Address CheckBox");
		EditAddressDetails.put("Step7","Select Declaration Checkbox");
		EditAddressDetails.put("Step8","Click on Update Button");

		//===========================================
		//Edit Employee Details
		EditDetailsOfNomnee.put("Step1","Click on Nominee Details Radio Button");
		EditDetailsOfNomnee.put("Step2","Enter Name of Nominee");
		EditDetailsOfNomnee.put("Step3","Select RelationShipWithIp");
		EditDetailsOfNomnee.put("Step4","Select Nominee Address");
		EditDetailsOfNomnee.put("Step5","Select State");
		EditDetailsOfNomnee.put("Step6","Select District");
		EditDetailsOfNomnee.put("Step7","Enter Pincode");
		EditDetailsOfNomnee.put("Step8","Select Declaration Checkbox");
		EditDetailsOfNomnee.put("Step9","Click on Update Button");

		//===========================================
		//Edit Employee Details
		EditFamilyInsuredPerson.put("Step1","Click on FamilyDetailsRadioBtn");
		EditFamilyInsuredPerson.put("Step2","Enter Name");
		EditFamilyInsuredPerson.put("Step3","Select DateOfBirth");
		EditFamilyInsuredPerson.put("Step4","Select Title");
		EditFamilyInsuredPerson.put("Step5","Select Relation");
		EditFamilyInsuredPerson.put("Step6","Select No RadioBtn");
		EditFamilyInsuredPerson.put("Step7","Select PermanentState");
		EditFamilyInsuredPerson.put("Step8","Select PermanentDistrict");
		EditFamilyInsuredPerson.put("Step9","Click on Add Button");
		EditFamilyInsuredPerson.put("Step10","Select Declaration Checkbox");
		EditFamilyInsuredPerson.put("Step11","Click on Update Button");


		//===========================================
		//Edit Employee Details
		EditDetailsofBankAccountsofInsuredPerson.put("Step1","Click on Details of Bank Account of IP");
		EditDetailsofBankAccountsofInsuredPerson.put("Step2","Enter IFSC Code");
		EditDetailsofBankAccountsofInsuredPerson.put("Step3","Enter Account Number");
		EditDetailsofBankAccountsofInsuredPerson.put("Step4","Select Account type");
		EditDetailsofBankAccountsofInsuredPerson.put("Step5","Click on Submit Button");
		EditDetailsofBankAccountsofInsuredPerson.put("Step6","Select Terms and Conditions Checkbox");
		EditDetailsofBankAccountsofInsuredPerson.put("Step7","Click on Submit Button");


		//==================================================================================================================================
		//Change IP Status on Death
		LoginforChangeIpStatusOnDeath.put("Step1","Enter User Name");
		LoginforChangeIpStatusOnDeath.put("Step2","Enter Pass word");
		LoginforChangeIpStatusOnDeath.put("Step3","Click Login button");
		LoginforChangeIpStatusOnDeath.put("Step4","Verify sucess fully login");

		//=======================================================================
		//Change IP Status on Death
		ChangeIPStatusOnDeath.put("Step1","Click on Change IP Status on Death");
		ChangeIPStatusOnDeath.put("Step2","Enter IP Number");
		ChangeIPStatusOnDeath.put("Step3","Click on Search button");
		ChangeIPStatusOnDeath.put("Step4","Select Date of Death");
		ChangeIPStatusOnDeath.put("Step5","Upload Death certificate");
		ChangeIPStatusOnDeath.put("Step6","Click on Update");
		ChangeIPStatusOnDeath.put("Step7","Enter Remarks");
		ChangeIPStatusOnDeath.put("Step8","Click on Submit/Close Button");

		//========================================================================================================================================================================
		//View Register
		LoginforViewRegister.put("Step1","Enter User Name");
		LoginforViewRegister.put("Step2","Enter Pass word");
		LoginforViewRegister.put("Step3","Click Login button");
		LoginforViewRegister.put("Step4","Verify sucess fully login");

		//=======================================================================
		//View Register
		ViewEmployerMasterRegister.put("Step1","Click on View Employer Master Register");
		ViewEmployerMasterRegister.put("Step2","Enter Employer Code");
		ViewEmployerMasterRegister.put("Step3","Click on Search button");

		//=======================================================================
		//View Register
		ViewC11.put("Step1","Click on View C11");
		ViewC11.put("Step2","Enter Employer Code");
		ViewC11.put("Step3","Click on Search button");

		//=======================================================================
		//View Register
		ViewWatchOverRegister.put("Step1","Click on ViewWatchOverRegister");
		/*	ViewWatchOverRegister.put("Step2","Enter Employer Code");
		ViewWatchOverRegister.put("Step3","Click on Search button");*/

		//====================================================================================================================================
		//Action On Interest
		LoginforActionOnInterest.put("Step1","Enter User Name");
		LoginforActionOnInterest.put("Step2","Enter Pass word");
		LoginforActionOnInterest.put("Step3","Click Login button");
		LoginforActionOnInterest.put("Step4","Verify sucess fully login");

		//=======================================================================
		//Action On Interest
		ActionOnInterest.put("Step1","Click on Revenue");
		ActionOnInterest.put("Step2","Click on Action On Defaulter");
		ActionOnInterest.put("Step3","Click on Action On Interest");
		ActionOnInterest.put("Step4","Click on Employer's Code Radio Button");
		ActionOnInterest.put("Step5","Enter on From Employer Code");
		ActionOnInterest.put("Step6","Enter on To Employer Code");
		ActionOnInterest.put("Step7","Click on Search Button");
		ActionOnInterest.put("Step8","Click on Employer's Code Link");
		ActionOnInterest.put("Step9","Select Radio Button");
		ActionOnInterest.put("Step10","Enter Remarks");
		ActionOnInterest.put("Step11","Click on Submit Button");
		ActionOnInterest.put("Step12","Click on Create C18 Letter Link");
		ActionOnInterest.put("Step13","Click on Letter Submit Button");
		ActionOnInterest.put("Step14","Click on Commom Notice Submit Button");



		//=======================================================================
		//Action On Interest
		SOLoginForAOI.put("Step1","Enter User Name");
		SOLoginForAOI.put("Step2","Enter Pass word");
		SOLoginForAOI.put("Step3","Click Login button");
		SOLoginForAOI.put("Step4","Verify sucess fully login");
		SOLoginForAOI.put("Step5","Select RO-Rajendra Place");
		SOLoginForAOI.put("Step6","Select Superintendent");
		SOLoginForAOI.put("Step7","Click on Submit Button");

		//=======================================================================
		//Action On Interest
		ActionOnInterestSOLogin.put("Step1","Click on Revenue");
		ActionOnInterestSOLogin.put("Step2","Click on Action On Defaulter");
		ActionOnInterestSOLogin.put("Step3","Click on Action On Interest");
		ActionOnInterestSOLogin.put("Step4","Click on My Tasklist");
		ActionOnInterestSOLogin.put("Step5","Click on Action On Interest Link");

		//=======================================================================
		//Action On Interest
		RBOLoginForAOI.put("Step1","Enter User Name");
		RBOLoginForAOI.put("Step2","Enter Pass word");
		RBOLoginForAOI.put("Step3","Click Login button");
		RBOLoginForAOI.put("Step4","Verify sucess fully login");
		RBOLoginForAOI.put("Step5","Select RO-Rajendra Place");
		RBOLoginForAOI.put("Step6","Select Revenue Branch Officer");
		RBOLoginForAOI.put("Step7","Click on Submit Button");

		//=======================================================================
		//Action On Interest
		ActionOnInterestRBOLogin.put("Step1","Click on Revenue");
		ActionOnInterestRBOLogin.put("Step2","Click on Action On Defaulter");
		ActionOnInterestRBOLogin.put("Step3","Click on Action On Interest");
		ActionOnInterestRBOLogin.put("Step4","Click on My Tasklist");
		ActionOnInterestRBOLogin.put("Step5","Click on Action On Interest Link");


		//====================================================================================================================================
		//Action On Damage
		LoginforActionsOnDamage.put("Step1","Enter User Name");
		LoginforActionsOnDamage.put("Step2","Enter Pass word");
		LoginforActionsOnDamage.put("Step3","Click Login button");
		LoginforActionsOnDamage.put("Step4","Verify sucess fully login");

		//=======================================================================
		//Action On Damage
		doNavigateToActionsonDamage.put("Step1","Click on Revenue");
		doNavigateToActionsonDamage.put("Step2","Click on Action On Defaulter");
		doNavigateToActionsonDamage.put("Step3","Click on Action On Damage");
		doNavigateToActionsonDamage.put("Step4","Click on Employer's Code Radio Button");
		doNavigateToActionsonDamage.put("Step5","Enter on From Employer Code");
		doNavigateToActionsonDamage.put("Step6","Enter on To Employer Code");
		doNavigateToActionsonDamage.put("Step7","Click on Search Button");
		doNavigateToActionsonDamage.put("Step8","Click on Employer's Code Link");
		doNavigateToActionsonDamage.put("Step9","Select Radio Button");
		doNavigateToActionsonDamage.put("Step10","Select Hearing Date");
		doNavigateToActionsonDamage.put("Step11","Enter Remarks");
		doNavigateToActionsonDamage.put("Step12","Click on Submit Button");
		doNavigateToActionsonDamage.put("Step13","Click on Create C18 Letter Link");
		doNavigateToActionsonDamage.put("Step14","Click on Letter Submit Button");
		doNavigateToActionsonDamage.put("Step15","Click on Commom Notice Submit Button");

		//=======================================================================
		//Action On Damage
		SOLoginForAOD.put("Step1","Enter User Name");
		SOLoginForAOD.put("Step2","Enter Pass word");
		SOLoginForAOD.put("Step3","Click Login button");
		SOLoginForAOD.put("Step4","Verify sucess fully login");
		SOLoginForAOD.put("Step5","Select RO-Rajendra Place");
		SOLoginForAOD.put("Step6","Select Superintendent");
		SOLoginForAOD.put("Step7","Click on Submit Button");

		//=======================================================================
		//Action On Damage
		ActionOnDamageSOLogin.put("Step1","Click on Revenue");
		ActionOnDamageSOLogin.put("Step2","Click on Action On Defaulter");
		ActionOnDamageSOLogin.put("Step3","Click on Action On Interest");
		ActionOnDamageSOLogin.put("Step4","Click on My Tasklist");
		ActionOnDamageSOLogin.put("Step5","Click on Action On Interest Link");

		//=======================================================================
		//Action On Damage
		RBOLoginForAOD.put("Step1","Enter User Name");
		RBOLoginForAOD.put("Step2","Enter Pass word");
		RBOLoginForAOD.put("Step3","Click Login button");
		RBOLoginForAOD.put("Step4","Verify sucessfully login");
		RBOLoginForAOD.put("Step5","Select RO-Rajendra Place");
		RBOLoginForAOD.put("Step6","Select Revenue Branch Officer");
		RBOLoginForAOD.put("Step7","Click on Submit Button");

		//=======================================================================
		//Action On Damage
		ActionOnDamageRBOLogin.put("Step1","Click on Revenue");
		ActionOnDamageRBOLogin.put("Step2","Click on Action On Defaulter");
		ActionOnDamageRBOLogin.put("Step3","Click on Action On Interest");
		ActionOnDamageRBOLogin.put("Step4","Click on My Tasklist");
		ActionOnDamageRBOLogin.put("Step5","Click on Action On Interest Link");

		//====================================================================================================================================
		//Confinement Claim
		LoginforConfinementClaim.put("Step1","Enter User Name");
		LoginforConfinementClaim.put("Step2","Enter Pass word");
		LoginforConfinementClaim.put("Step3","Click Login button");
		LoginforConfinementClaim.put("Step4","Verify sucess fully login");

		//=======================================================================
		//Confinement Claim
		ConfinementPage.put("Step1","Click on Benefits");
		ConfinementPage.put("Step2","Click on Create A new Claim Request");
		ConfinementPage.put("Step3","Enter Ip Number");
		ConfinementPage.put("Step4","Select Claim Type as Confinement");
		ConfinementPage.put("Step5","Click on Submit");

		//=======================================================================
		//Confinement Claim
		CreateConfinementClaim.put("Step1","Click on Create Acknowledgement");
		CreateConfinementClaim.put("Step2","Select Confinement Claim Type");
		CreateConfinementClaim.put("Step3","Enter Remarks");
		CreateConfinementClaim.put("Step4","Click on Generate Button");
		CreateConfinementClaim.put("Step5","Click on Back Button");
		CreateConfinementClaim.put("Step6","Select Confinement Date");
		CreateConfinementClaim.put("Step7","Select Confinement Location");
		CreateConfinementClaim.put("Step8","Click on Select Acknowledgement");
		CreateConfinementClaim.put("Step9","Select Acknowledgement Radio Button");
		CreateConfinementClaim.put("Step10","Click on Acknowledgement Submit Button");
		CreateConfinementClaim.put("Step11","Upload File");
		CreateConfinementClaim.put("Step12","Click on Submit Button");
		CreateConfinementClaim.put("Step13","Get the Claim Id");
		CreateConfinementClaim.put("Step14","Click on Benefits");
		CreateConfinementClaim.put("Step15","Click on Process A Claim");
		CreateConfinementClaim.put("Step16","Click on Confinemet Claim Processing Link");
		CreateConfinementClaim.put("Step17","Click on Claim ID");
		CreateConfinementClaim.put("Step18","Click on Next Button");
		CreateConfinementClaim.put("Step19","Click on Next Button");
		CreateConfinementClaim.put("Step20","Enter Remarks");
		CreateConfinementClaim.put("Step21","Click on Submit To BM");

		//=======================================================================
		//Confinement Claim
		BMLoginforConfinementClaim.put("Step1","Enter User Name");
		BMLoginforConfinementClaim.put("Step2","Enter Pass word");
		BMLoginforConfinementClaim.put("Step3","Click Login button");
		BMLoginforConfinementClaim.put("Step4","Verify sucess fully login");
		BMLoginforConfinementClaim.put("Step5","Select BO Ajmeri Gate");
		BMLoginforConfinementClaim.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforConfinementClaim.put("Step7","Click on Submit Button");

		//=======================================================================
		//Confinement Claim
		ConfinementClaimProcessingBM.put("Step1","Click on Brnefits");
		ConfinementClaimProcessingBM.put("Step2","Click on Process a Claim");
		ConfinementClaimProcessingBM.put("Step3","Click on Confinemet Claim Processing Link");
		ConfinementClaimProcessingBM.put("Step4","Click on Claim Id");
		ConfinementClaimProcessingBM.put("Step5","Click on Next button");
		ConfinementClaimProcessingBM.put("Step6","Click on Next button");
		ConfinementClaimProcessingBM.put("Step7","Enter Remarks");
		ConfinementClaimProcessingBM.put("Step8","Click on Approve Button");

		//=========================================================================================================================
		//Dependent Benefit
		LoginforDependentBenefit.put("Step1","Enter User Name");
		LoginforDependentBenefit.put("Step2","Enter Pass word");
		LoginforDependentBenefit.put("Step3","Click Login button");
		LoginforDependentBenefit.put("Step4","Verify sucess fully login");


		//=======================================================
		//Dependent Benefit
		DependentBenifits.put("Step1","Click on Benefits ");
		DependentBenifits.put("Step2","Click on Upload Certificate ");
		DependentBenifits.put("Step3","Click on Upload Alternate Death Certificate ");
		DependentBenifits.put("Step4","Enter IP Number");
		DependentBenifits.put("Step5","Select Date Of Death");
		DependentBenifits.put("Step6","Enter Cause Of Death");
		DependentBenifits.put("Step7","Enter Medical Officer Name");
		DependentBenifits.put("Step8","Select Certificate Issue Date");
		DependentBenifits.put("Step9","Attach Alternate Certificate");
		DependentBenifits.put("Step10","Click on Submit Button");

		//=======================================================
		//Dependent Benefit
		DBForm16.put("Step1","Click on Benefits");
		DBForm16.put("Step2","Click on Create a New Claim ");
		DBForm16.put("Step3","Enter Insurance Number");
		DBForm16.put("Step4","Select Claim Type as Dependent Benefit");
		DBForm16.put("Step5","Select Claim SubType as DB-Form 16 Request");
		DBForm16.put("Step6","Click on Submit");

		//==========================================================================================

		//Dependent Benefit
		DBCreateClaimRequest.put("Step1","Click on Add Dependent ");
		DBCreateClaimRequest.put("Step2","Add Dependent Name");
		DBCreateClaimRequest.put("Step3","Select Relationship with Deceased");
		DBCreateClaimRequest.put("Step4","Select DOB");
		DBCreateClaimRequest.put("Step5","Enter Address");
		DBCreateClaimRequest.put("Step6","Enter Pincode");
		DBCreateClaimRequest.put("Step7","Select State");
		DBCreateClaimRequest.put("Step8","Enter Remarks");
		DBCreateClaimRequest.put("Step9","Click on Submit");
		DBCreateClaimRequest.put("Step10","Store Claim Request Id");

		//==========================================================================================

		//Dependent Benefit
		BMLoginforDB.put("Step1","Enter User Name");
		BMLoginforDB.put("Step2","Enter Pass word");
		BMLoginforDB.put("Step3","Click Login button");
		BMLoginforDB.put("Step4","Verify sucess fully login");
		BMLoginforDB.put("Step5","Select BO Ajmeri Gate");
		BMLoginforDB.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforDB.put("Step7","Click on Submit Button");

		//=======================================================================
		//Dependent Benefit
		DBClaimRequestProcessingPageBMLogin.put("Step1","Click on Benefit");
		DBClaimRequestProcessingPageBMLogin.put("Step2","Click on Process A Claim");
		DBClaimRequestProcessingPageBMLogin.put("Step3","Click on DB Request Processing Link");
		DBClaimRequestProcessingPageBMLogin.put("Step4","Click on Claim Request Id");
		DBClaimRequestProcessingPageBMLogin.put("Step5","Click on Next Button");
		DBClaimRequestProcessingPageBMLogin.put("Step6","Click on Next Button");
		DBClaimRequestProcessingPageBMLogin.put("Step7","Enter Remarks");
		DBClaimRequestProcessingPageBMLogin.put("Step8","Click on Approve Button");

		//===========================================
		//Dependent Benefit
		BBOLoginForDBRequestProcessing.put("Step1","Enter User Name");
		BBOLoginForDBRequestProcessing.put("Step2","Enter Pass word");
		BBOLoginForDBRequestProcessing.put("Step3","Click Login button");
		BBOLoginForDBRequestProcessing.put("Step4","Verify sucess fully login");
		BBOLoginForDBRequestProcessing.put("Step5","Select BO Ajmeri Gate");
		BBOLoginForDBRequestProcessing.put("Step6","Select Benefits Branch Officer");
		BBOLoginForDBRequestProcessing.put("Step7","Click on Submit Button");

		//===================================================
		//Dependent Benefit
		DBRequestProcessingBBOLogin.put("Step1","Click on Process A Claim");
		DBRequestProcessingBBOLogin.put("Step2","Click on DB Request Processing Link");
		DBRequestProcessingBBOLogin.put("Step3","Click on Claim Request Id");
		DBRequestProcessingBBOLogin.put("Step4","Click on Next Button");
		DBRequestProcessingBBOLogin.put("Step5","Click on Next Button");
		DBRequestProcessingBBOLogin.put("Step6","Enter Remarks");
		DBRequestProcessingBBOLogin.put("Step7","Click on Generate ESIC 101");
		DBRequestProcessingBBOLogin.put("Step8","Click on Close Button");
		DBRequestProcessingBBOLogin.put("Step9","Click on Submit/Cancel Button");

		//===================================================
		//Dependent Benefit
		DBRequestProcessingBBOLoginafter30Days.put("Step1","Click on Benefits");
		DBRequestProcessingBBOLoginafter30Days.put("Step2","Click on Process A Claim");
		DBRequestProcessingBBOLoginafter30Days.put("Step3","Click on DB Request Processing Link");
		DBRequestProcessingBBOLoginafter30Days.put("Step4","Click on Next Button");
		DBRequestProcessingBBOLoginafter30Days.put("Step5","Click on Next Button");
		DBRequestProcessingBBOLoginafter30Days.put("Step6","Enter Remarks");
		DBRequestProcessingBBOLoginafter30Days.put("Step7","Click on Approve Button");

		//===================================================
		//Dependent Benefit
		F_ALoginForDBRequestProcessing.put("Step1","Enter User Name");
		F_ALoginForDBRequestProcessing.put("Step2","Enter Pass word");
		F_ALoginForDBRequestProcessing.put("Step3","Click Login button");
		F_ALoginForDBRequestProcessing.put("Step4","Verify sucess fully login");
		F_ALoginForDBRequestProcessing.put("Step5","Select BO Ajmeri Gate");
		F_ALoginForDBRequestProcessing.put("Step6","Select Branch Officer of F&A");
		F_ALoginForDBRequestProcessing.put("Step7","Click on Submit Button");


		//===================================================
		//Dependent Benefit
		DBRequsetProcessingF_ALogin.put("Step1","Click on Process A Claim");
		DBRequsetProcessingF_ALogin.put("Step2","Click on DB Request Processing Link");
		DBRequsetProcessingF_ALogin.put("Step3","Click on Claim Request Id");
		DBRequsetProcessingF_ALogin.put("Step4","Click on Next Button");
		DBRequsetProcessingF_ALogin.put("Step5","Click on Next Button");
		DBRequsetProcessingF_ALogin.put("Step6","Enter Remarks");
		DBRequsetProcessingF_ALogin.put("Step7","Click on Agree the Rate Radio button");
		DBRequsetProcessingF_ALogin.put("Step8","Click on Submit/Cancel button");

		//===================================================
		//Dependent Benefit
		BMLoginforDB2.put("Step1","Enter User Name");
		BMLoginforDB2.put("Step2","Enter Pass word");
		BMLoginforDB2.put("Step3","Click Login button");
		BMLoginforDB2.put("Step4","Verify sucess fully login");
		BMLoginforDB2.put("Step5","Select BO Ajmeri Gate");
		BMLoginforDB2.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforDB2.put("Step7","Click on Submit Button");


		//===================================================
		//Dependent Benefit
		DBClaimRequestProcessingPageBMLogin2.put("Step1","Click on Process A Claim");
		DBClaimRequestProcessingPageBMLogin2.put("Step2","Click on DB Request Processing Link");
		DBClaimRequestProcessingPageBMLogin2.put("Step3","Click on Claim Request Id");
		DBClaimRequestProcessingPageBMLogin2.put("Step4","Click on Next Button");
		DBClaimRequestProcessingPageBMLogin2.put("Step5","Click on Next Button");
		DBClaimRequestProcessingPageBMLogin2.put("Step6","Enter Remarks");
		DBClaimRequestProcessingPageBMLogin2.put("Step7","Click on Agree the Rate Radio button");
		DBClaimRequestProcessingPageBMLogin2.put("Step8","Click on Submit/Cancel button");

		//===================================================
		//Dependent Benefit
		LDC_UDCLoginForDBCreateClaim.put("Step1","Enter User Name");
		LDC_UDCLoginForDBCreateClaim.put("Step2","Enter Pass word");
		LDC_UDCLoginForDBCreateClaim.put("Step3","Click Login button");
		LDC_UDCLoginForDBCreateClaim.put("Step4","Verify sucess fully login");
		LDC_UDCLoginForDBCreateClaim.put("Step5","Select BO Ajmeri Gate");
		LDC_UDCLoginForDBCreateClaim.put("Step6","Select LDC/UDC at Branch Office");
		LDC_UDCLoginForDBCreateClaim.put("Step7","Click on Submit Button");

		//===================================================
		//Dependent Benefit
		DBCreateClaim.put("Step1","Click on Benefits");
		DBCreateClaim.put("Step2","Click on Create a New Claim");
		DBCreateClaim.put("Step3","Enter Insurance Number");
		DBCreateClaim.put("Step4","Select Claim Type as Dependent Benefit");
		DBCreateClaim.put("Step5","Select Claim SubType as DB - Form 16 A Claim");
		DBCreateClaim.put("Step6","Click on Submit");

		//===================================================
		//Dependent Benefit
		DB_Form16Claim.put("Step1","Select Dependent");
		DB_Form16Claim.put("Step2","Click on Create Claim button");
		DB_Form16Claim.put("Step3","Store Claim Id");
		DB_Form16Claim.put("Step4","Click on Benefits");
		DB_Form16Claim.put("Step5","Click on Process A Claim");
		DB_Form16Claim.put("Step2","Click on DB Claim Processing Link");
		DB_Form16Claim.put("Step3","Click on Claim Id");
		DB_Form16Claim.put("Step4","Click on Next Button");
		DB_Form16Claim.put("Step5","Click on Next Button");
		DB_Form16Claim.put("Step6","Enter Remarks");
		DB_Form16Claim.put("Step7","Click on Submit/Cancel Btn");

		//===================================================
		//Dependent Benefit
		BMLoginforDBClaim.put("Step1","Enter User Name");
		BMLoginforDBClaim.put("Step2","Enter Pass word");
		BMLoginforDBClaim.put("Step3","Click Login button");
		BMLoginforDBClaim.put("Step4","Verify sucess fully login");
		BMLoginforDBClaim.put("Step5","Select BO Ajmeri Gate");
		BMLoginforDBClaim.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforDBClaim.put("Step7","Click on Submit Button");

		//===================================================
		//Dependent Benefit
		DBClaimProcessingBMLogin.put("Step1","Click on Process A Claim");
		DBClaimProcessingBMLogin.put("Step2","Click on DB Claim Processing Link");
		DBClaimProcessingBMLogin.put("Step3","Click on Claim Id");
		DBClaimProcessingBMLogin.put("Step4","Click on Next Button");
		DBClaimProcessingBMLogin.put("Step5","Click on Next Button");
		DBClaimProcessingBMLogin.put("Step6","Enter Remarks");
		DBClaimProcessingBMLogin.put("Step7","Click on Approve/Reject Btn");


		//==========================================================================================================================
		//AODDATaskListandViewC6RegisterandAODREports
		LoginforAOD.put("Step1","Enter User Name");
		LoginforAOD.put("Step2","Enter Pass word");
		LoginforAOD.put("Step3","Click Login button");
		LoginforAOD.put("Step4","Verify sucess fully login");

		//=============================================================
		//AODDATaskListandViewC6RegisterandAODREports
		DealingAssistantTaskList.put("Step1","Click on Revenue");
		DealingAssistantTaskList.put("Step2","Click on Action On Defaulter");
		DealingAssistantTaskList.put("Step3","Click on Dealing Assistant TaskList");
		DealingAssistantTaskList.put("Step4","Select Employer code Radio Button");
		DealingAssistantTaskList.put("Step5","Enter Employer Code");
		DealingAssistantTaskList.put("Step6","Click on Search");
		DealingAssistantTaskList.put("Step7","Click on Cancel button");

		//=============================================================
		//AODDATaskListandViewC6RegisterandAODREports
		ViewC6Register.put("Step1","Click on Revenue");
		ViewC6Register.put("Step2","Click on Action On Defaulter");
		ViewC6Register.put("Step3","Click on View C6 Register");
		ViewC6Register.put("Step4","Enter Employer Code");
		ViewC6Register.put("Step5","Select From Date");
		ViewC6Register.put("Step6","Select To Date");
		ViewC6Register.put("Step7","Click on Print button");
		ViewC6Register.put("Step8","Click on Close button");

		//=============================================================
		//AODDATaskListandViewC6RegisterandAODREports
		DefaulterHistory.put("Step1","Click on Revenue");
		DefaulterHistory.put("Step2","Click on Action On Defaulter");
		DefaulterHistory.put("Step3","Click on Defaulter History");
		DefaulterHistory.put("Step4","Click on Employer Code Radio Button");
		DefaulterHistory.put("Step5","Enter Employer Code");
		DefaulterHistory.put("Step6","Click on Search button");
		DefaulterHistory.put("Step7","Click on Cancel button");

		//=============================================================
		//AODDATaskListandViewC6RegisterandAODREports
		DropDefaulterRecords.put("Step1","Click on Revenue");
		DropDefaulterRecords.put("Step2","Click on Action On Defaulter");
		DropDefaulterRecords.put("Step3","Click on Drop Defaulter Records");
		DropDefaulterRecords.put("Step4","Enter Employer Code");
		DropDefaulterRecords.put("Step5","Select Defaulter Records");
		DropDefaulterRecords.put("Step6","Click on Submit button");
		DropDefaulterRecords.put("Step7","Select Checkbox");
		DropDefaulterRecords.put("Step8","Enter Remarks");
		DropDefaulterRecords.put("Step8","Click on Drop Button");
		DropDefaulterRecords.put("Step8","Click on Cancel Button");

		//=============================================================
		//AODDATaskListandViewC6RegisterandAODREports
		AODReports.put("Step1","Click on Revenue");
		AODReports.put("Step2","Click on Action On Defaulter");
		AODReports.put("Step3","Click on AOD Reports");
		AODReports.put("Step4","Select Radio Button");
		AODReports.put("Step5","Click on PDF Button");

		//============================================================================================================================

		//Sickness Benefit for 91 Days	
		LoginForSB91.put("Step1","Enter User Name");
		LoginForSB91.put("Step2","Enter Pass word");
		LoginForSB91.put("Step3","Click Login button");
		LoginForSB91.put("Step4","Verify sucess fully login");


		//=======================================================
		//Sickness Benefit for 91 Days
		FirstCertificateForSB91.put("Step1","Click on Upload Certificate ");
		FirstCertificateForSB91.put("Step2","Click on Upload IMO/IMP Certificate ");
		FirstCertificateForSB91.put("Step3","Enter IP Number");
		FirstCertificateForSB91.put("Step4","Select IMO Radio Btn");
		FirstCertificateForSB91.put("Step5","Click on New Spell Radio Button");
		FirstCertificateForSB91.put("Step6","Click on Submit");
		FirstCertificateForSB91.put("Step7","Select Examination Date");
		FirstCertificateForSB91.put("Step8","Select Next Visit Date");
		FirstCertificateForSB91.put("Step9","Select BO Date");
		FirstCertificateForSB91.put("Step10","Enter Diagnosis");
		FirstCertificateForSB91.put("Step11","Enter Medical Officer Name");
		FirstCertificateForSB91.put("Step12","Enter Dispensary Location");
		FirstCertificateForSB91.put("Step13","Enter Remarks");
		FirstCertificateForSB91.put("Step11","Click on Submit Button");


		//Sickness Benefit for 91 Days
		IntermediateCertificateForSB91.put("Step1","Click on Upload Certificate ");
		IntermediateCertificateForSB91.put("Step2","Click on Upload IMO/IMP Certificate ");
		IntermediateCertificateForSB91.put("Step3","Enter IP Number");
		IntermediateCertificateForSB91.put("Step4","Select IMO Radio Btn");
		IntermediateCertificateForSB91.put("Step5","Click on Continuation Of Previous Spell");
		IntermediateCertificateForSB91.put("Step6","Click on Special Intermediate ChkBx");
		IntermediateCertificateForSB91.put("Step7","Click on Submit");
		IntermediateCertificateForSB91.put("Step8","Select First Certificate Date");
		IntermediateCertificateForSB91.put("Step9","Select Examination Date");
		IntermediateCertificateForSB91.put("Step10","Select Next Visit Date");
		IntermediateCertificateForSB91.put("Step11","Select BO Date");
		IntermediateCertificateForSB91.put("Step12","Enter Diagnosis");
		IntermediateCertificateForSB91.put("Step13","Enter Medical Officer Name");
		IntermediateCertificateForSB91.put("Step14","Enter Dispensary Location");
		IntermediateCertificateForSB91.put("Step15","Enter Remarks");
		IntermediateCertificateForSB91.put("Step16","Click on Submit Button");


		//==========================================================================================

		//Sickness Benefit for 91 Days
		SecondIntermediateCertificateForSB91.put("Step1","Click on Upload Certificate ");
		SecondIntermediateCertificateForSB91.put("Step2","Click on Upload IMO/IMP Certificate ");
		SecondIntermediateCertificateForSB91.put("Step3","Enter IP Number");
		SecondIntermediateCertificateForSB91.put("Step4","Select IMO Radio Btn");
		SecondIntermediateCertificateForSB91.put("Step5","Click on Continuation Of Previous Spell");
		SecondIntermediateCertificateForSB91.put("Step6","Click on Special Intermediate ChkBx");
		SecondIntermediateCertificateForSB91.put("Step7","Click on Submit");
		SecondIntermediateCertificateForSB91.put("Step8","Select First Certificate Date");
		SecondIntermediateCertificateForSB91.put("Step9","Select Examination Date");
		SecondIntermediateCertificateForSB91.put("Step10","Select Next Visit Date");
		SecondIntermediateCertificateForSB91.put("Step11","Select BO Date");
		SecondIntermediateCertificateForSB91.put("Step12","Enter Diagnosis");
		SecondIntermediateCertificateForSB91.put("Step13","Enter Medical Officer Name");
		SecondIntermediateCertificateForSB91.put("Step14","Enter Dispensary Location");
		SecondIntermediateCertificateForSB91.put("Step15","Enter Remarks");
		SecondIntermediateCertificateForSB91.put("Step16","Click on Submit Button");

		//==========================================================================================
		//Sickness Benefit for 91 Days
		ThirdIntermediateCertificateForSB91.put("Step1","Click on Upload Certificate ");
		ThirdIntermediateCertificateForSB91.put("Step2","Click on Upload IMO/IMP Certificate ");
		ThirdIntermediateCertificateForSB91.put("Step3","Enter IP Number");
		ThirdIntermediateCertificateForSB91.put("Step4","Select IMO Radio Btn");
		ThirdIntermediateCertificateForSB91.put("Step5","Click on Continuation Of Previous Spell");
		ThirdIntermediateCertificateForSB91.put("Step6","Click on Special Intermediate ChkBx");
		ThirdIntermediateCertificateForSB91.put("Step7","Click on Submit");
		ThirdIntermediateCertificateForSB91.put("Step8","Select First Certificate Date");
		ThirdIntermediateCertificateForSB91.put("Step9","Select Examination Date");
		ThirdIntermediateCertificateForSB91.put("Step10","Select Next Visit Date");
		ThirdIntermediateCertificateForSB91.put("Step11","Select BO Date");
		ThirdIntermediateCertificateForSB91.put("Step12","Enter Diagnosis");
		ThirdIntermediateCertificateForSB91.put("Step13","Enter Medical Officer Name");
		ThirdIntermediateCertificateForSB91.put("Step14","Enter Dispensary Location");
		ThirdIntermediateCertificateForSB91.put("Step15","Enter Remarks");
		ThirdIntermediateCertificateForSB91.put("Step16","Click on Submit Button");

		//==========================================================================================
		//Sickness Benefit for 91 Days
		FourthIntermediateCertificateForSB91.put("Step1","Click on Upload Certificate ");
		FourthIntermediateCertificateForSB91.put("Step2","Click on Upload IMO/IMP Certificate ");
		FourthIntermediateCertificateForSB91.put("Step3","Enter IP Number");
		FourthIntermediateCertificateForSB91.put("Step4","Select IMO Radio Btn");
		FourthIntermediateCertificateForSB91.put("Step5","Click on Continuation Of Previous Spell");
		FourthIntermediateCertificateForSB91.put("Step6","Click on Special Intermediate ChkBx");
		FourthIntermediateCertificateForSB91.put("Step7","Click on Submit");
		FourthIntermediateCertificateForSB91.put("Step8","Select First Certificate Date");
		FourthIntermediateCertificateForSB91.put("Step9","Select Examination Date");
		FourthIntermediateCertificateForSB91.put("Step10","Select Next Visit Date");
		FourthIntermediateCertificateForSB91.put("Step11","Select BO Date");
		FourthIntermediateCertificateForSB91.put("Step12","Enter Diagnosis");
		FourthIntermediateCertificateForSB91.put("Step13","Enter Medical Officer Name");
		FourthIntermediateCertificateForSB91.put("Step14","Enter Dispensary Location");
		FourthIntermediateCertificateForSB91.put("Step15","Enter Remarks");
		FourthIntermediateCertificateForSB91.put("Step16","Click on Submit Button");

		//==========================================================================================

		//Sickness Benefit for 91 Days
		CreateClaimForSB91.put("Step1","Click on Create A new Claim Request ");
		CreateClaimForSB91.put("Step2","Enter IP Number");
		CreateClaimForSB91.put("Step3","Select SB Claim Type");
		CreateClaimForSB91.put("Step4","Click on Submit");

		//=======================================================================
		//Sickness Benefit for 91 Days
		SicknessClaimForm91.put("Step1","Click on Create Acknowlegement");
		SicknessClaimForm91.put("Step2","Select Claim Type Sickness Benefit");
		SicknessClaimForm91.put("Step3","Ehter Remarks");
		SicknessClaimForm91.put("Step4","Click on Generate Button");
		SicknessClaimForm91.put("Step5","Click on Back button");
		SicknessClaimForm91.put("Step6","Select From Date");
		SicknessClaimForm91.put("Step7","Select To Date");
		SicknessClaimForm91.put("Step8","Click Acknowledgement Button");
		SicknessClaimForm91.put("Step9","Select Acknowlegment");
		SicknessClaimForm91.put("Step10","Click on Submit Acknowlegement");
		SicknessClaimForm91.put("Step11","Enter Remarks");
		SicknessClaimForm91.put("Step12","Click on Submit");
		SicknessClaimForm91.put("Step13","Get Claim ID");

		SicknessClaimForm91.put("Step14","Click on Process A Claim");
		SicknessClaimForm91.put("Step15","Click on Sickness Benefit Claim Processing");
		SicknessClaimForm91.put("Step16","Click on Page 2");
		SicknessClaimForm91.put("Step17","Click on Claim Id");
		SicknessClaimForm91.put("Step18","Click on Next Button");
		SicknessClaimForm91.put("Step19","Click on Next Button");
		SicknessClaimForm91.put("Step20","Enter Remarks");
		SicknessClaimForm91.put("Step21","Click on Submit To BM");
		//===========================================

		//Sickness Benefit for 91 Days
		BMLoginforSB91.put("Step1","Enter User Name");
		BMLoginforSB91.put("Step2","Enter Pass word");
		BMLoginforSB91.put("Step3","Click Login button");
		BMLoginforSB91.put("Step4","Verify sucess fully login");
		BMLoginforSB91.put("Step5","Select BO Ajmeri Gate");
		BMLoginforSB91.put("Step6","Select Branch Manager at Branch Office");
		BMLoginforSB91.put("Step7","Click on Submit Button");
		//===================================================

		//Sickness Benefit for 91 Days
		SBProcessClaimBMLogin91.put("Step1","Click on Process A Claim");
		SBProcessClaimBMLogin91.put("Step2","Click on Sickness Benefit Claim Processing");
		SBProcessClaimBMLogin91.put("Step3","Click on Claim Id");
		SBProcessClaimBMLogin91.put("Step4","Click on Next Button");
		SBProcessClaimBMLogin91.put("Step5","Click on Next Button");
		SBProcessClaimBMLogin91.put("Step6","Enter Remarks");
		SBProcessClaimBMLogin91.put("Step7","Click on Approve/Reject Btn");
		//============================================================================================================================

		//Sickness Benefit for 91 Days	
		LoginforTaskDetails.put("Step1","Enter User Name");
		LoginforTaskDetails.put("Step2","Enter Pass word");
		LoginforTaskDetails.put("Step3","Click Login button");
		LoginforTaskDetails.put("Step4","Verify sucess fully login");

		//=======================================================================
		//Task Details
		TaskDetails.put("Step1","Click on Register");
		TaskDetails.put("Step2","Click on Task Details");
		TaskDetails.put("Step3","Click on Form Approval link");
		TaskDetails.put("Step4","Click on Assigned Task Id");
		TaskDetails.put("Step5","Click on Next button");
		TaskDetails.put("Step6","Click on Next button");
		TaskDetails.put("Step7","Click on Next button");
		TaskDetails.put("Step8","Enter Remarks");
		TaskDetails.put("Step9","Click on Forward button");
		TaskDetails.put("Step10","Click on Cancel Button");

		TaskDetails.put("Step11","Click on Register");
		TaskDetails.put("Step12","Click on Task Details");
		TaskDetails.put("Step13","Click on Change Request Submitted by an employer Link");
		TaskDetails.put("Step14","Click on Assigned Task Type");
		TaskDetails.put("Step15","Enter Remarks");
		TaskDetails.put("Step16","Click on Forward button");

		TaskDetails.put("Step17","Click on Register");
		TaskDetails.put("Step18","Click on Task Details");
		TaskDetails.put("Step19","Click on SubUnit Registration Submitted Link");
		TaskDetails.put("Step20","Click on Assigned TaskType SubUnit Registration");
		TaskDetails.put("Step21","Click on Next Button");
		TaskDetails.put("Step22","Enter Remarks");
		TaskDetails.put("Step23","Click on Forward Button");

		//============================================================================================================================

		//Survey	
		LoginForSurvey.put("Step1","Enter User Name");
		LoginForSurvey.put("Step2","Enter Pass word");
		LoginForSurvey.put("Step3","Click Login button");
		LoginForSurvey.put("Step4","Verify sucess fully login");


		//=======================================================
		//Survey
		CreateSurveySourceRegister.put("Step1","Click on Revenue ");
		CreateSurveySourceRegister.put("Step2","Click on Survey ");
		CreateSurveySourceRegister.put("Step3","Click on Create Survey Source Register");
		CreateSurveySourceRegister.put("Step4","Enter Factory Name");
		CreateSurveySourceRegister.put("Step5","Enter Owner Name");
		CreateSurveySourceRegister.put("Step6","Enter Unit Address");
		CreateSurveySourceRegister.put("Step7","Enter Owner Address");
		CreateSurveySourceRegister.put("Step8","Enter Source");
		CreateSurveySourceRegister.put("Step9","Enter Remarks");
		CreateSurveySourceRegister.put("Step10","Click on Submit/Cancel button");

		//Survey	
		EditSurveySourceRegister.put("Step1","Click on Revenue ");
		EditSurveySourceRegister.put("Step2","Click on Survey ");
		EditSurveySourceRegister.put("Step3","Click on Edit Survey Source Register");
		EditSurveySourceRegister.put("Step4","Enter Survey Number");
		EditSurveySourceRegister.put("Step5","Click on Search button");
		EditSurveySourceRegister.put("Step6","Click on Survey Link");
		EditSurveySourceRegister.put("Step7","Edit Owner Name");
		EditSurveySourceRegister.put("Step8","Click on Submit/Cancel button");

		//==========================================================================================
		//Survey	
		ViewSurveySourceRegister.put("Step1","Click on Revenue ");
		ViewSurveySourceRegister.put("Step2","Click on Survey ");
		ViewSurveySourceRegister.put("Step3","Click on View Survey Source Register ");
		ViewSurveySourceRegister.put("Step4","Enter Survey Number");
		ViewSurveySourceRegister.put("Step5","Click on Search button");
		ViewSurveySourceRegister.put("Step6","Click on Survey Link");
		ViewSurveySourceRegister.put("Step7","Click on Next Button");
		ViewSurveySourceRegister.put("Step8","Click on Next Button");
		ViewSurveySourceRegister.put("Step9","Click on Next Button");
		ViewSurveySourceRegister.put("Step10","Click on Next Button");
		ViewSurveySourceRegister.put("Step11","Click on Print Button");
		ViewSurveySourceRegister.put("Step12","Click on Cancel button");

		//==========================================================================================
		//Survey	
		ViewPeriodicSurveyRegister.put("Step1","Click on Revenue ");
		ViewPeriodicSurveyRegister.put("Step2","Click on Survey ");
		ViewPeriodicSurveyRegister.put("Step3","Click on View Periodic Survey Registerr ");

		//==========================================================================================
		//Survey	
		ViewObservationNote.put("Step1","Click on Revenue ");
		ViewObservationNote.put("Step2","Click on Survey ");
		ViewObservationNote.put("Step3","Click on View Observation Note");
		ViewObservationNote.put("Step4","Enter Survey Number");
		ViewObservationNote.put("Step5","Click on Search button");
		ViewObservationNote.put("Step6","Click on Survey Link");
		ViewObservationNote.put("Step7","Click on Next Button");
		ViewObservationNote.put("Step8","Click on Cancel button");

		//==========================================================================================
		//Survey	
		SurveyTaskDetails.put("Step1","Click on Revenue ");
		SurveyTaskDetails.put("Step2","Click on Survey ");
		SurveyTaskDetails.put("Step3","Click on Task Details");
		SurveyTaskDetails.put("Step4","Click on Approval Link");
		SurveyTaskDetails.put("Step5","Enter Remarks");
		SurveyTaskDetails.put("Step6","Click on Forward button");

		SurveyTaskDetails.put("Step7","Click on Revenue ");
		SurveyTaskDetails.put("Step8","Click on Survey ");
		SurveyTaskDetails.put("Step9","Click on Task Details");
		SurveyTaskDetails.put("Step10","Click on Form01 ApprovalLink");
		SurveyTaskDetails.put("Step11","Enter Employers Code");
		SurveyTaskDetails.put("Step12","Click on Search button");
		SurveyTaskDetails.put("Step13","Click on Employer Link");
		SurveyTaskDetails.put("Step14","Click on Next Button");
		SurveyTaskDetails.put("Step15","Click on Next Button");
		SurveyTaskDetails.put("Step16","Click on Next Button");
		SurveyTaskDetails.put("Step17","Click on Next Button");
		SurveyTaskDetails.put("Step18","Click on Forward Button");

		//============================================================================================================================

		//Inspection	
		LoginforInspection.put("Step1","Enter User Name");
		LoginforInspection.put("Step2","Enter Pass word");
		LoginforInspection.put("Step3","Click Login button");
		LoginforInspection.put("Step4","Verify sucess fully login");


		//=======================================================
		//Inspection
		Inspection.put("Step1","Click on Revenue ");
		Inspection.put("Step2","Click on Inspection ");
		Inspection.put("Step3","Click on UWP Scrutinize Inspection Report");
		Inspection.put("Step4","Select Unit Type");
		Inspection.put("Step5","Click on Search");
		Inspection.put("Step6","Click on UWP Scrutinize Inspection Report Link");
		Inspection.put("Step7","Click on Next button");
		Inspection.put("Step8","Enter DA Remarks");
		Inspection.put("Step9","Click on Next button");
		Inspection.put("Step10","Enter Remarks");
		Inspection.put("Step11","Click on Forward Button");

		//==============================================================
		//Inspection	
		SuperintendentLoginforInspection.put("Step1","Enter User Name");
		SuperintendentLoginforInspection.put("Step2","Enter Pass word");
		SuperintendentLoginforInspection.put("Step3","Click Login button");
		SuperintendentLoginforInspection.put("Step4","Verify sucess fully login");
		SuperintendentLoginforInspection.put("Step5","Select RO-Rajendra Place");
		SuperintendentLoginforInspection.put("Step6","Select Superintendent");
		SuperintendentLoginforInspection.put("Step7","Click on Submit Button");

		//==========================================================================================
		//Inspection	
		InspectionSuperIntendentLogin.put("Step1","Click on Revenue ");
		InspectionSuperIntendentLogin.put("Step2","Click on Inspection ");
		InspectionSuperIntendentLogin.put("Step3","Click on UWP Scrutinize Inspection Report");
		InspectionSuperIntendentLogin.put("Step4","Select Unit Type");
		InspectionSuperIntendentLogin.put("Step5","Click on Search");
		InspectionSuperIntendentLogin.put("Step6","Click on UWP Scrutinize Inspection Report Link");
		InspectionSuperIntendentLogin.put("Step7","Click on Next button");
		InspectionSuperIntendentLogin.put("Step8","Enter SO Remarks");
		InspectionSuperIntendentLogin.put("Step9","Click on Next button");
		InspectionSuperIntendentLogin.put("Step10","Enter Remarks");
		InspectionSuperIntendentLogin.put("Step11","Click on Forward Button");

		//==============================================================
		//Inspection	
		RBOLoginforInspection.put("Step1","Enter User Name");
		RBOLoginforInspection.put("Step2","Enter Pass word");
		RBOLoginforInspection.put("Step3","Click Login button");
		RBOLoginforInspection.put("Step4","Verify sucess fully login");
		RBOLoginforInspection.put("Step5","Select RO-Rajendra Place");
		RBOLoginforInspection.put("Step6","Select Revenue Branch Officer");
		RBOLoginforInspection.put("Step7","Click on Submit Button");

		//==========================================================================================
		//Inspection	
		InspectionRBOLogin.put("Step1","Click on Revenue ");
		InspectionRBOLogin.put("Step2","Click on Inspection ");
		InspectionRBOLogin.put("Step3","Click on UWP Scrutinize Inspection Report");
		InspectionRBOLogin.put("Step4","Select Unit Type");
		InspectionRBOLogin.put("Step5","Click on Search");
		InspectionRBOLogin.put("Step6","Click on UWP Scrutinize Inspection Report Link");
		InspectionRBOLogin.put("Step7","Click on Next button");
		InspectionRBOLogin.put("Step8","Enter RBO Remarks");
		InspectionRBOLogin.put("Step9","Click on Next button");
		InspectionRBOLogin.put("Step10","Enter Remarks");
		InspectionRBOLogin.put("Step11","Click on Forward Button");

		//==========================================================================================
		//Inspection	
		ScrutinizeObservationNoteInspectionReport.put("Step1","Click on Revenue ");
		ScrutinizeObservationNoteInspectionReport.put("Step2","Click on Inspection ");
		ScrutinizeObservationNoteInspectionReport.put("Step3","Click on Scrutinize Observation Note Inspection Report");
		ScrutinizeObservationNoteInspectionReport.put("Step4","Select Unit Type");
		ScrutinizeObservationNoteInspectionReport.put("Step5","Click on Search button");


		//============================================================================================================================
		//Super Speciality	
		LoginforSST.put("Step1","Enter User Name");
		LoginforSST.put("Step2","Enter Pass word");
		LoginforSST.put("Step3","Click Login button");
		LoginforSST.put("Step4","Verify sucess fully login");


		//=======================================================
		//Super Speciality
		SSTClaim.put("Step1","Click on Benefits ");
		SSTClaim.put("Step2","Click on Create A new Claim Request ");
		SSTClaim.put("Step3","Enter IP Number");
		SSTClaim.put("Step4","Select Claim Type as Super Speciality");
		SSTClaim.put("Step5","Click on Submit");


		//Super Speciality		
		SST.put("Step1","Select Relax Request Date");
		SST.put("Step2","Enter Name of Disease");
		SST.put("Step3","Enter Medical Superintendent Name");
		SST.put("Step4","Enter Reason");
		SST.put("Step5","Enter Remark");
		SST.put("Step6","Click on Submit");
		SST.put("Step7","Get the Claim ID");

		//==========================================================================================
		//Super Speciality		
		ROLoginforSST.put("Step1","Enter User Name");
		ROLoginforSST.put("Step2","Enter Pass word");
		ROLoginforSST.put("Step3","Click Login button");
		ROLoginforSST.put("Step4","Verify sucess fully login");
		ROLoginforSST.put("Step5","Select RO-Rajendra Place");
		ROLoginforSST.put("Step6","Select Regional Director ");
		ROLoginforSST.put("Step7","Click on Submit Button");

		//==========================================================================================
		//Super Speciality		
		SSTROLogin.put("Step1","Click on Benefits ");
		SSTROLogin.put("Step2","Click on Process A Claim ");
		SSTROLogin.put("Step3","Click on SST Claim Processing Link");
		SSTROLogin.put("Step4","Click on Claim ID");
		SSTROLogin.put("Step5","Click on Next button");
		SSTROLogin.put("Step6","Enter Remarks");
		SSTROLogin.put("Step7","Click on Approve Button");

		//===============================================================================================================================
		//Recovery Registers
		LoginforRecoveryRegisters.put("Step1","Enter User Name");
		LoginforRecoveryRegisters.put("Step2","Enter Pass word");
		LoginforRecoveryRegisters.put("Step3","Click Login button");
		LoginforRecoveryRegisters.put("Step4","Verify sucess fully login");

		//==========================================================
		//Recovery Registers
		RecoveryTransactionReport.put("Step1","Click on Recovery");
		RecoveryTransactionReport.put("Step2","Click on Recovery Transaction Report");
		RecoveryTransactionReport.put("Step3","Select From Date");
		RecoveryTransactionReport.put("Step4","Select To Date");
		RecoveryTransactionReport.put("Step5","Click on Search Button");

		//======================================================================
		//Recovery Registers
		IrrecoverableRegister.put("Step1","Click on Recovery");
		IrrecoverableRegister.put("Step2","Click on Irrecoverable Register");
		IrrecoverableRegister.put("Step3","Select From Date");
		IrrecoverableRegister.put("Step4","Select To Date");
		IrrecoverableRegister.put("Step5","Click on Search Button");

		//======================================================================
		//Recovery Registers
		WaiverRegister.put("Step1","Click on Recovery");
		WaiverRegister.put("Step2","Click on Waiver Register");
		WaiverRegister.put("Step3","Select From Date");
		WaiverRegister.put("Step4","Select To Date");
		WaiverRegister.put("Step5","Click on Search Button");

		//======================================================================
		//Recovery Registers
		CPRegister.put("Step1","Click on Recovery");
		CPRegister.put("Step2","Click on CP Register");
		CPRegister.put("Step3","Select CP Type");
		CPRegister.put("Step4","Click on Search button");

		//===============================================================================================================================
		//Recovery Manual Payment
		LoginforRecoveryManualPayment.put("Step1","Enter User Name");
		LoginforRecoveryManualPayment.put("Step2","Enter Pass word");
		LoginforRecoveryManualPayment.put("Step3","Click Login button");
		LoginforRecoveryManualPayment.put("Step4","Verify sucess fully login");

		//==========================================================
		//Recovery Manual Payment
		RecoveryManualPayment.put("Step1","Click on Recovery");
		RecoveryManualPayment.put("Step2","Click on Recovery Manual Payment");
		RecoveryManualPayment.put("Step3","Enter Employer Code");
		RecoveryManualPayment.put("Step4","Select Certificate Type as C-19");
		RecoveryManualPayment.put("Step5","Click on Search Button");
		RecoveryManualPayment.put("Step6","Click on Certificate number link");
		RecoveryManualPayment.put("Step7","Get Payment Due");
		RecoveryManualPayment.put("Step8","Enter Payment to be paid");
		RecoveryManualPayment.put("Step9","Select Date of Payment");
		RecoveryManualPayment.put("Step10","Enter Remarks");
		RecoveryManualPayment.put("Step11","Click on Submit/Cancel Button");

		//===============================================================================================================================
		//Recovery Installment Register
		LoginforRecoveryEmprInstallmentRequestPage.put("Step1","Enter User Name");
		LoginforRecoveryEmprInstallmentRequestPage.put("Step2","Enter Pass word");
		LoginforRecoveryEmprInstallmentRequestPage.put("Step3","Click Login button");
		LoginforRecoveryEmprInstallmentRequestPage.put("Step4","Verify sucess fully login");

		//==========================================================
		//Recovery Installment Register
		RecoveryEmprInstallmentRequest.put("Step1","Click on Recovery");
		RecoveryEmprInstallmentRequest.put("Step2","Click on Recovery Empr Installment Request");
		RecoveryEmprInstallmentRequest.put("Step3","Enter Employer Code");
		RecoveryEmprInstallmentRequest.put("Step4","Click on Submit Button");
		RecoveryEmprInstallmentRequest.put("Step5","Enter No of Installment");
		RecoveryEmprInstallmentRequest.put("Step6","Enter Cut-Off Day from Dropdown");
		RecoveryEmprInstallmentRequest.put("Step7","Select Effective Date");
		RecoveryEmprInstallmentRequest.put("Step8","Click on Submit");

		RecoveryEmprInstallmentRequest.put("Step9","Click on Recovery");
		RecoveryEmprInstallmentRequest.put("Step10","Click on Installment Register");
		RecoveryEmprInstallmentRequest.put("Step11","Enter From Date");
		RecoveryEmprInstallmentRequest.put("Step12","Enter To Date");
		RecoveryEmprInstallmentRequest.put("Step13","Click on Search Button");

		RecoveryEmprInstallmentRequest.put("Step14","Click on Recovery");
		RecoveryEmprInstallmentRequest.put("Step15","Click on Instalment_Reschedule_History");
		RecoveryEmprInstallmentRequest.put("Step16","Enter Employer Code");
		RecoveryEmprInstallmentRequest.put("Step17","Click on Submit Button");
		RecoveryEmprInstallmentRequest.put("Step18","Click on History Button");


	}


	//Yes Registration
	public static Map<String,String> getFuncnctionlity(String key){
		System.out.println("getFuncnctionlity-key : "+key);
		//Yes Registration
		if(key.equalsIgnoreCase("LoginForYesRegistration")){
			return LoginForYesRegistration;
		}else if(key.equalsIgnoreCase("Register")){
			return Register;
		}else if(key.equalsIgnoreCase("RegisterForm1")){
			return RegisterForm1;
		}
		else if(key.equalsIgnoreCase("DetailsOfNomnee")){
			return DetailsOfNomnee;
		}else if(key.equalsIgnoreCase("FamilyInsuredPerson")){
			return FamilyInsuredPerson;
		}else if(key.equalsIgnoreCase("DetailsofBankAccountsofInsuredPerson")){
			return DetailsofBankAccountsofInsuredPerson;
		}

		//No Registration
		else if(key.equalsIgnoreCase("LoginforNoRegistration")){
			return LoginforNoRegistration;
		}else if(key.equalsIgnoreCase("NoRegister")){
			return NoRegister;
		}else if(key.equalsIgnoreCase("NoRegisterForm1")){
			return NoRegisterForm1;
		}else if(key.equalsIgnoreCase("NoRegDetailsOfNomnee")){
			return NoRegDetailsOfNomnee;
		}else if(key.equalsIgnoreCase("NoRegFamilyInsuredPerson")){
			return NoRegFamilyInsuredPerson;
		}else if(key.equalsIgnoreCase("NoRegDetailsofBankAccountsofInsuredPerson")){
			return NoRegDetailsofBankAccountsofInsuredPerson;
		}

		//Sickness Benefit
		else if(key.equalsIgnoreCase("LoginForSB")){
			return LoginForSB;
		}else if(key.equalsIgnoreCase("FirstCertificateForSB")){
			return FirstCertificateForSB;
		}else if(key.equalsIgnoreCase("IntermediateCertificateForSB")){
			return IntermediateCertificateForSB;
		}
		else if(key.equalsIgnoreCase("SecondIntermediateCertificateForSB")){
			return SecondIntermediateCertificateForSB;
		}else if(key.equalsIgnoreCase("CreateClaimForSB")){
			return CreateClaimForSB;
		}else if(key.equalsIgnoreCase("SicknessClaimForm")){
			return SicknessClaimForm;

		}else if(key.equalsIgnoreCase("BMLoginforSB")){
			return BMLoginforSB;
		}else if(key.equalsIgnoreCase("SBProcessClaimBMLogin")){
			return SBProcessClaimBMLogin;
		}

		//MB Confinement Claim
		else if(key.equalsIgnoreCase("LoginForMBConfinement")){
			return LoginForMBConfinement;
		}else if(key.equalsIgnoreCase("MaternityForm18CertificateforConfinement")){
			return MaternityForm18CertificateforConfinement;
		}else if(key.equalsIgnoreCase("MBCreateConfinementClaim")){
			return MBCreateConfinementClaim;
		}
		else if(key.equalsIgnoreCase("MB_Form19Confinement")){
			return MB_Form19Confinement;
		}else if(key.equalsIgnoreCase("BMLoginforConfinement")){
			return BMLoginforConfinement;
		}else if(key.equalsIgnoreCase("MBForm19ClaimProcessingBMLogin")){
			return MBForm19ClaimProcessingBMLogin;
		}

		//MB Expected Confinement Claim
		else if(key.equalsIgnoreCase("LoginforMBExpectedConfinement")){
			return LoginforMBExpectedConfinement;
		}else if(key.equalsIgnoreCase("MaternityForm18CertificateExpectedConfinement")){
			return MaternityForm18CertificateExpectedConfinement;
		}else if(key.equalsIgnoreCase("MBCreateExpectedConfinementClaim")){
			return MBCreateExpectedConfinementClaim;
		}
		else if(key.equalsIgnoreCase("MB_Form19ExpectedConfinement")){
			return MB_Form19ExpectedConfinement;
		}else if(key.equalsIgnoreCase("BMLoginforExpectedConfinement")){
			return BMLoginforExpectedConfinement;
		}else if(key.equalsIgnoreCase("ExpectedMBForm19ClaimProcessingBMLogin")){
			return ExpectedMBForm19ClaimProcessingBMLogin;
		}

		//Miscarriage Claim
		else if(key.equalsIgnoreCase("LoginforMiscarriage")){
			return LoginforMiscarriage;
		}else if(key.equalsIgnoreCase("MaternityForm18MiscarriageCertificate")){
			return MaternityForm18MiscarriageCertificate;
		}else if(key.equalsIgnoreCase("MBMiscarriageCreateClaim")){
			return MBMiscarriageCreateClaim;
		}
		else if(key.equalsIgnoreCase("MB_Form19Miscarriage")){
			return MB_Form19Miscarriage;
		}else if(key.equalsIgnoreCase("BMLoginforMiscarriage")){
			return BMLoginforMiscarriage;
		}else if(key.equalsIgnoreCase("MBForm19MiscarriageClaimProcessingBMLogin")){
			return MBForm19MiscarriageClaimProcessingBMLogin;
		}

		//MBForm21 Claim
		else if(key.equalsIgnoreCase("LoginforMBForm21")){
			return LoginforMBForm21;
		}else if(key.equalsIgnoreCase("MaternityForm21Certificate")){
			return MaternityForm21Certificate;
		}else if(key.equalsIgnoreCase("MBForm20CreateClaim")){
			return MBForm20CreateClaim;
		}else if(key.equalsIgnoreCase("CreateClaimMBForm20")){
			return CreateClaimMBForm20;
		}else if(key.equalsIgnoreCase("BMLoginforMBForm21")){
			return BMLoginforMBForm21;
		}else if(key.equalsIgnoreCase("MBForm21ClaimProcessingBMLogin")){
			return MBForm21ClaimProcessingBMLogin;
		}

		//MBSB Claim
		else if(key.equalsIgnoreCase("MBSBLogin")){
			return MBSBLogin;
		}else if(key.equalsIgnoreCase("MaternityForm18CertificateForMBSB")){
			return MaternityForm18CertificateForMBSB;
		}else if(key.equalsIgnoreCase("FirstCertificateForMBSB")){
			return FirstCertificateForMBSB;
		}else if(key.equalsIgnoreCase("IntermediateCertificateForMBSB")){
			return IntermediateCertificateForMBSB;
		}else if(key.equalsIgnoreCase("MBSBFinalCertificate")){
			return MBSBFinalCertificate;
		}else if(key.equalsIgnoreCase("CreateClaimForMBSB")){
			return CreateClaimForMBSB;
		}else if(key.equalsIgnoreCase("MBSicknessClaimForm")){
			return MBSicknessClaimForm;

		}else if(key.equalsIgnoreCase("BMLoginforMBSB")){
			return BMLoginforMBSB;
		}else if(key.equalsIgnoreCase("MBSBProcessClaimBMLogin")){
			return MBSBProcessClaimBMLogin;
		}

		//EnSB Claim
		else if(key.equalsIgnoreCase("LoginForEnSB")){
			return LoginForEnSB;
		}else if(key.equalsIgnoreCase("FirstCertificateForENSB")){
			return FirstCertificateForENSB;
		}else if(key.equalsIgnoreCase("Fitness_FinalCertificate")){
			return Fitness_FinalCertificate;
		}else if(key.equalsIgnoreCase("ENSBCreateClaim")){
			return ENSBCreateClaim;
		}else if(key.equalsIgnoreCase("ENSBCreateAndProcessClaimLDCLogin")){
			return ENSBCreateAndProcessClaimLDCLogin;
		}else if(key.equalsIgnoreCase("BMLoginforENSB")){
			return BMLoginforENSB;
		}else if(key.equalsIgnoreCase("ENSBProcessClaimBMLogin")){
			return ENSBProcessClaimBMLogin;
		}

		//PDB Claim
		else if(key.equalsIgnoreCase("LoginforPDB")){
			return LoginforPDB;
		}else if(key.equalsIgnoreCase("PDBPeriodicalCreateClaim")){
			return PDBPeriodicalCreateClaim;
		}else if(key.equalsIgnoreCase("BMLoginforPDB")){
			return BMLoginforPDB;
		}else if(key.equalsIgnoreCase("PDBPeriodicalClaimProcessingBMLogin")){
			return PDBPeriodicalClaimProcessingBMLogin;
		}

		//Funeral Expenses Claim
		else if(key.equalsIgnoreCase("LoginForFuneralExpenses")){
			return LoginForFuneralExpenses;
		}else if(key.equalsIgnoreCase("UploadDeathCertificateforFuneralExpenses")){
			return UploadDeathCertificateforFuneralExpenses;
		}else if(key.equalsIgnoreCase("CreateClaimForFuneralExpenses")){
			return CreateClaimForFuneralExpenses;
		}else if(key.equalsIgnoreCase("FunerallExpenssClaim")){
			return FunerallExpenssClaim;
		}else if(key.equalsIgnoreCase("BMLoginforFuneralExpenses")){
			return BMLoginforFuneralExpenses;
		}else if(key.equalsIgnoreCase("FuneralExpensesBMLogin")){
			return FuneralExpensesBMLogin;
		}

		//Extended Sickness Benefit claim
		else if(key.equalsIgnoreCase("LoginforESB")){
			return LoginforESB;
		}else if(key.equalsIgnoreCase("ESBMed8Certificate")){
			return ESBMed8Certificate;
		}else if(key.equalsIgnoreCase("ContinuationOfPreviousSpellCertificateForESB1")){
			return ContinuationOfPreviousSpellCertificateForESB1;
		}else if(key.equalsIgnoreCase("ContinuationOfPreviousSpellCertificateForESB2")){
			return ContinuationOfPreviousSpellCertificateForESB2;
		}else if(key.equalsIgnoreCase("ContinuationOfPreviousSpellCertificateForESB3")){
			return ContinuationOfPreviousSpellCertificateForESB3;
		}else if(key.equalsIgnoreCase("ESBCreateClaim")){
			return ESBCreateClaim;
		}else if(key.equalsIgnoreCase("ESBP")){
			return ESBP;
		}else if(key.equalsIgnoreCase("BMLoginforESB")){
			return BMLoginforESB;
		}else if(key.equalsIgnoreCase("ESBProcessClaimBMLogin2")){
			return ESBProcessClaimBMLogin2;
		}

		//RGSKY Claim
		else if(key.equalsIgnoreCase("LoginforRGSKY")){
			return LoginforRGSKY;
		}else if(key.equalsIgnoreCase("RGSKY")){
			return RGSKY;
		}else if(key.equalsIgnoreCase("RGSKYUA1")){
			return RGSKYUA1;
		}else if(key.equalsIgnoreCase("BMLoginforRGSKY")){
			return BMLoginforRGSKY;
		}else if(key.equalsIgnoreCase("RGSKYBMLogin")){
			return RGSKYBMLogin;
		}else if(key.equalsIgnoreCase("UploadUA4iCertificate")){
			return UploadUA4iCertificate;
		}else if(key.equalsIgnoreCase("RGSKYUA4iBMLogin")){
			return RGSKYUA4iBMLogin;
		}else if(key.equalsIgnoreCase("ROLoginforRGSKY")){
			return ROLoginforRGSKY;
		}else if(key.equalsIgnoreCase("RGSKYROLogin")){
			return RGSKYROLogin;
		}else if(key.equalsIgnoreCase("UploadUA4iiRGSKYCertificate")){
			return UploadUA4iiRGSKYCertificate;
		}else if(key.equalsIgnoreCase("UploadUA4iiCertificate")){
			return UploadUA4iiCertificate;
		}else if(key.equalsIgnoreCase("UA9Claim")){
			return UA9Claim;
		}else if(key.equalsIgnoreCase("RGSKYUA9ClaimCreate")){
			return RGSKYUA9ClaimCreate;
		}else if(key.equalsIgnoreCase("BMLoginforRGSKYUA9")){
			return BMLoginforRGSKYUA9;
		}else if(key.equalsIgnoreCase("RGSKYUA9ProcessingBMLogin")){
			return RGSKYUA9ProcessingBMLogin;
		}

		//Print Counter Foil
		else if(key.equalsIgnoreCase("LoginforPrintCounterFoil")){
			return LoginforPrintCounterFoil;
		}else if(key.equalsIgnoreCase("PrintCounterFoil")){
			return PrintCounterFoil;
		}

		//Conveyance Allowance
		else if(key.equalsIgnoreCase("LoginforConveyanceAllowance")){
			return LoginforConveyanceAllowance;
		}else if(key.equalsIgnoreCase("ConveyanceAllowance")){
			return ConveyanceAllowance;
		}else if(key.equalsIgnoreCase("ConvyanceAllowanceCreateClaim")){
			return ConvyanceAllowanceCreateClaim;
		}else if(key.equalsIgnoreCase("ConvyanceAllowanceFillDetails")){
			return ConvyanceAllowanceFillDetails;
		}else if(key.equalsIgnoreCase("BMLoginforConveyanceAllowance")){
			return BMLoginforConveyanceAllowance;
		}else if(key.equalsIgnoreCase("ConveyanceAllowanceClaimProcessingBM")){
			return ConveyanceAllowanceClaimProcessingBM;
		}


		//View SubUnits
		else if(key.equalsIgnoreCase("LoginforViewSubUnits")){
			return LoginforViewSubUnits;
		}else if(key.equalsIgnoreCase("ViewRegister")){
			return ViewRegister;
		}

		//Update Employer
		else if(key.equalsIgnoreCase("LoginforUpdateEmployerDetails")){
			return LoginforUpdateEmployerDetails;
		}else if(key.equalsIgnoreCase("UpdateRegister")){
			return UpdateRegister;
		}

		//Edit Employee Details
		else if(key.equalsIgnoreCase("LoginforEditEmployeeDetails")){
			return LoginforEditEmployeeDetails;
		}else if(key.equalsIgnoreCase("EditRegister")){
			return EditRegister;
		}else if(key.equalsIgnoreCase("EditPersonalDetails")){
			return EditPersonalDetails;
		}else if(key.equalsIgnoreCase("EditAddressDetails")){
			return EditAddressDetails;
		}else if(key.equalsIgnoreCase("EditDetailsOfNomnee")){
			return EditDetailsOfNomnee;
		}else if(key.equalsIgnoreCase("EditFamilyInsuredPerson")){
			return EditFamilyInsuredPerson;
		}else if(key.equalsIgnoreCase("EditDetailsofBankAccountsofInsuredPerson")){
			return EditDetailsofBankAccountsofInsuredPerson;
		}

		//Change IP Status on Death
		else if(key.equalsIgnoreCase("LoginforChangeIpStatusOnDeath")){
			return LoginforChangeIpStatusOnDeath;
		}else if(key.equalsIgnoreCase("ChangeIPStatusOnDeath")){
			return ChangeIPStatusOnDeath;
		}

		//View Register
		else if(key.equalsIgnoreCase("LoginforViewRegister")){
			return LoginforViewRegister;
		}else if(key.equalsIgnoreCase("ViewEmployerMasterRegister")){
			return ViewEmployerMasterRegister;
		}else if(key.equalsIgnoreCase("ViewC11")){
			return ViewC11;
		}else if(key.equalsIgnoreCase("ViewWatchOverRegister")){
			return ViewWatchOverRegister;
		}

		//Action On Interest
		else if(key.equalsIgnoreCase("LoginforActionOnInterest")){
			return LoginforActionOnInterest;
		}else if(key.equalsIgnoreCase("ActionOnInterest")){
			return ActionOnInterest;
		}else if(key.equalsIgnoreCase("SOLoginForAOI")){
			return SOLoginForAOI;
		}else if(key.equalsIgnoreCase("ActionOnInterestSOLogin")){
			return ActionOnInterestSOLogin;
		}else if(key.equalsIgnoreCase("RBOLoginForAOI")){
			return RBOLoginForAOI;
		}else if(key.equalsIgnoreCase("ActionOnInterestRBOLogin")){
			return ActionOnInterestRBOLogin;
		}

		//Action on Damage
		else if(key.equalsIgnoreCase("LoginforActionsOnDamage")){
			return LoginforActionsOnDamage;
		}else if(key.equalsIgnoreCase("doNavigateToActionsonDamage")){
			return doNavigateToActionsonDamage;
		}else if(key.equalsIgnoreCase("SOLoginForAOD")){
			return SOLoginForAOD;
		}else if(key.equalsIgnoreCase("ActionOnDamageSOLogin")){
			return ActionOnDamageSOLogin;
		}else if(key.equalsIgnoreCase("RBOLoginForAOD")){
			return RBOLoginForAOD;
		}else if(key.equalsIgnoreCase("ActionOnDamageRBOLogin")){
			return ActionOnDamageRBOLogin;
		}

		//Confinement Claim
		else if(key.equalsIgnoreCase("LoginforConfinementClaim")){
			return LoginforConfinementClaim;
		}else if(key.equalsIgnoreCase("ConfinementPage")){
			return ConfinementPage;
		}else if(key.equalsIgnoreCase("CreateConfinementClaim")){
			return CreateConfinementClaim;
		}else if(key.equalsIgnoreCase("BMLoginforConfinementClaim")){
			return BMLoginforConfinementClaim;
		}else if(key.equalsIgnoreCase("ConfinementClaimProcessingBM")){
			return ConfinementClaimProcessingBM;
		}

		//Dependent Benefit
		else if(key.equalsIgnoreCase("LoginforDependentBenefit")){
			return LoginforDependentBenefit;
		}else if(key.equalsIgnoreCase("DependentBenifits")){
			return DependentBenifits;
		}else if(key.equalsIgnoreCase("DBForm16")){
			return DBForm16;
		}else if(key.equalsIgnoreCase("DBCreateClaimRequest")){
			return DBCreateClaimRequest;
		}else if(key.equalsIgnoreCase("BMLoginforDB")){
			return BMLoginforDB;
		}else if(key.equalsIgnoreCase("DBClaimRequestProcessingPageBMLogin")){
			return DBClaimRequestProcessingPageBMLogin;
		}else if(key.equalsIgnoreCase("BBOLoginForDBRequestProcessing")){
			return BBOLoginForDBRequestProcessing;
		}else if(key.equalsIgnoreCase("DBRequestProcessingBBOLogin")){
			return DBRequestProcessingBBOLogin;
		}else if(key.equalsIgnoreCase("DBRequestProcessingBBOLoginafter30Days")){
			return DBRequestProcessingBBOLoginafter30Days;
		}else if(key.equalsIgnoreCase("F_ALoginForDBRequestProcessing")){
			return F_ALoginForDBRequestProcessing;
		}else if(key.equalsIgnoreCase("DBRequsetProcessingF_ALogin")){
			return DBRequsetProcessingF_ALogin;
		}else if(key.equalsIgnoreCase("BMLoginforDB2")){
			return BMLoginforDB2;
		}else if(key.equalsIgnoreCase("DBClaimRequestProcessingPageBMLogin2")){
			return DBClaimRequestProcessingPageBMLogin2;
		}else if(key.equalsIgnoreCase("LDC_UDCLoginForDBCreateClaim")){
			return LDC_UDCLoginForDBCreateClaim;
		}else if(key.equalsIgnoreCase("DBCreateClaim")){
			return DBCreateClaim;
		}else if(key.equalsIgnoreCase("DB_Form16Claim")){
			return DB_Form16Claim;
		}else if(key.equalsIgnoreCase("BMLoginforDBClaim")){
			return BMLoginforDBClaim;
		}else if(key.equalsIgnoreCase("DBClaimProcessingBMLogin")){
			return DBClaimProcessingBMLogin;
		}


		//AODDATaskListandViewC6RegisterandAODReports
		else if(key.equalsIgnoreCase("LoginforAOD")){
			return LoginforAOD;
		}else if(key.equalsIgnoreCase("DealingAssistantTaskList")){
			return DealingAssistantTaskList;
		}else if(key.equalsIgnoreCase("ViewC6Register")){
			return ViewC6Register;
		}else if(key.equalsIgnoreCase("DefaulterHistory")){
			return DefaulterHistory;
		}else if(key.equalsIgnoreCase("DropDefaulterRecords")){
			return DropDefaulterRecords;
		}else if(key.equalsIgnoreCase("AODReports")){
			return AODReports;
		}

		//Sickness Benefit for 91 Days
		else if(key.equalsIgnoreCase("LoginForSB91")){
			return LoginForSB91;
		}else if(key.equalsIgnoreCase("FirstCertificateForSB91")){
			return FirstCertificateForSB91;
		}else if(key.equalsIgnoreCase("IntermediateCertificateForSB91")){
			return IntermediateCertificateForSB91;
		}else if(key.equalsIgnoreCase("SecondIntermediateCertificateForSB91")){
			return SecondIntermediateCertificateForSB91;
		}else if(key.equalsIgnoreCase("ThirdIntermediateCertificateForSB91")){
			return ThirdIntermediateCertificateForSB91;
		}else if(key.equalsIgnoreCase("FourthIntermediateCertificateForSB91")){
			return FourthIntermediateCertificateForSB91;
		}else if(key.equalsIgnoreCase("CreateClaimForSB91")){
			return CreateClaimForSB91;
		}else if(key.equalsIgnoreCase("SicknessClaimForm91")){
			return SicknessClaimForm91;
		}else if(key.equalsIgnoreCase("BMLoginforSB91")){
			return BMLoginforSB91;
		}else if(key.equalsIgnoreCase("SBProcessClaimBMLogin91")){
			return SBProcessClaimBMLogin91;
		}

		//Task Details
		else if(key.equalsIgnoreCase("LoginforTaskDetails")){
			return LoginforTaskDetails;
		}else if(key.equalsIgnoreCase("TaskDetails")){
			return TaskDetails;
		}

		//Survey
		else if(key.equalsIgnoreCase("LoginForSurvey")){
			return LoginForSurvey;
		}else if(key.equalsIgnoreCase("CreateSurveySourceRegister")){
			return CreateSurveySourceRegister;
		}else if(key.equalsIgnoreCase("EditSurveySourceRegister")){
			return EditSurveySourceRegister;
		}else if(key.equalsIgnoreCase("ViewSurveySourceRegister")){
			return ViewSurveySourceRegister;
		}else if(key.equalsIgnoreCase("ViewPeriodicSurveyRegister")){
			return ViewPeriodicSurveyRegister;
		}else if(key.equalsIgnoreCase("ViewObservationNote")){
			return ViewObservationNote;
		}else if(key.equalsIgnoreCase("SurveyTaskDetails")){
			return SurveyTaskDetails;
		}

		//Inspection
		else if(key.equalsIgnoreCase("LoginforInspection")){
			return LoginforInspection;
		}else if(key.equalsIgnoreCase("Inspection")){
			return Inspection;
		}else if(key.equalsIgnoreCase("SuperintendentLoginforInspection")){
			return SuperintendentLoginforInspection;
		}else if(key.equalsIgnoreCase("InspectionSuperIntendentLogin")){
			return InspectionSuperIntendentLogin;
		}else if(key.equalsIgnoreCase("RBOLoginforInspection")){
			return RBOLoginforInspection;
		}else if(key.equalsIgnoreCase("InspectionRBOLogin")){
			return InspectionRBOLogin;
		}else if(key.equalsIgnoreCase("ScrutinizeObservationNoteInspectionReport")){
			return ScrutinizeObservationNoteInspectionReport;
		}

		//Super Speciality
		else if(key.equalsIgnoreCase("LoginforSST")){
			return LoginforSST;
		}else if(key.equalsIgnoreCase("SSTClaim")){
			return SSTClaim;
		}else if(key.equalsIgnoreCase("SST")){
			return SST;
		}else if(key.equalsIgnoreCase("ROLoginforSST")){
			return ROLoginforSST;
		}else if(key.equalsIgnoreCase("SSTROLogin")){
			return SSTROLogin;
		}

		//Recovery Registers
		else if(key.equalsIgnoreCase("LoginforRecoveryRegisters")){
			return LoginforRecoveryRegisters;
		}else if(key.equalsIgnoreCase("RecoveryTransactionReport")){
			return RecoveryTransactionReport;
		}else if(key.equalsIgnoreCase("IrrecoverableRegister")){
			return IrrecoverableRegister;
		}else if(key.equalsIgnoreCase("WaiverRegister")){
			return WaiverRegister;
		}else if(key.equalsIgnoreCase("CPRegister")){
			return CPRegister;
		}

		//Recovery Manual Payment
		else if(key.equalsIgnoreCase("LoginforRecoveryManualPayment")){
			return LoginforRecoveryManualPayment;
		}else if(key.equalsIgnoreCase("RecoveryManualPayment")){
			return RecoveryManualPayment;
		}

		//Recovery Empr Installment Request
		else if(key.equalsIgnoreCase("LoginforRecoveryEmprInstallmentRequestPage")){
			return LoginforRecoveryEmprInstallmentRequestPage;
		}else if(key.equalsIgnoreCase("RecoveryEmprInstallmentRequest")){
			return RecoveryEmprInstallmentRequest;
		}

		return defaultFun;
	}

}

