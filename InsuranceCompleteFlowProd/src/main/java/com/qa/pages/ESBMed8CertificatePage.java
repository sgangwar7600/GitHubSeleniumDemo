package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ESBMed8CertificatePage {
	WebDriver driver;

	public ESBMed8CertificatePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText ="Upload Certificates")
	WebElement UploadCertificates;
	
	@FindBy(id ="ctl00_HomePageContent_LinkButton7")
	WebElement UploadMed8Certificate ;
	
	@FindBy(id ="ctl00_HomePageContent_txtIpNo")
	WebElement IPNoTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_Submit")
	WebElement SubmitBtn ;
	
	@FindBy(id ="ctl00_HomePageContent_txtOccupation")
	WebElement OccupationTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtPlace")
	WebElement PlaceOfWorkTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtHistory")
	WebElement HistoryOfCaseTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtPrev")
	WebElement PreviousIllnessTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtSpecRprt")
	WebElement SpecialistReportTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_drpConfmDate")
	WebElement PresentDiagnosisDrpDwn ;
	
	@FindBy(id ="ctl00_HomePageContent_txtImoName")
	WebElement ImoNameTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_txtImpCode")
	WebElement ImpCodeTxtBx ;
	
	@FindBy(id ="ctl00_HomePageContent_submit")
	WebElement SubmitButton ;
	
	@FindBy(id ="cancel")
	WebElement CancelButton ;

	public WebElement UploadCertificates() {
		return UploadCertificates;
	}
	
	public WebElement UploadMed8Certificate() {
		return UploadMed8Certificate;
	}
	
	public WebElement IPNoTxtBx() {
		return IPNoTxtBx;
	}
	
	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement OccupationTxtBx() {
		return OccupationTxtBx;
	}
	
	public WebElement PlaceOfWorkTxtBx() {
		return PlaceOfWorkTxtBx;
	}
	
	public WebElement HistoryOfCaseTxtBx() {
		return HistoryOfCaseTxtBx;
	}
	
	public WebElement PreviousIllnessTxtBx() {
		return PreviousIllnessTxtBx;
	}
	
	public WebElement SpecialistReportTxtBx() {
		return SpecialistReportTxtBx;
	}
	
	public WebElement PresentDiagnosisDrpDwn() {
		return PresentDiagnosisDrpDwn;
	}
	
	public WebElement ImoNameTxtBx() {
		return ImoNameTxtBx;
	}
	
	public WebElement ImpCodeTxtBx() {
		return ImpCodeTxtBx;
	}
	
	public WebElement SubmitButton() {
		return SubmitButton;
	}
	
	public WebElement CancelButton() {
		return CancelButton;
	}
}
