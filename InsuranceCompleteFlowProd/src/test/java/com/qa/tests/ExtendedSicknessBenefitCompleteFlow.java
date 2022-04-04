package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.pages.BenifitsPage;
import com.qa.pages.ESBMed8CertificatePage;
import com.qa.pages.FirstCertificatePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SBProcessClaimPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class ExtendedSicknessBenefitCompleteFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	ESBMed8CertificatePage ECP;
	FirstCertificatePage FCP;
	String CertificateSubmission;
    SBProcessClaimPage SBPC;
	String ClaimId;
	String InsuranceNumber="1115828637";//1115828637, //1199900090, //1115885386
	
	Utility utilobj;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeMethod
	public void setup(){
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/automation.html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		logger=extent.createTest("LoginTest");
	}

	@BeforeTest
	public void LaunchURL() throws IOException {
		driver = Browserfactory.LaunchBrowser();

	}

	@Test(priority = 1)
	public void LoginforESB() throws InterruptedException, IOException  {
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//For Production
			LoginPage log = new LoginPage(driver);
			Thread.sleep(5000);

		// log.UserId().sendKeys(ReusableFunction.getValue("uidd"));
		log.username().sendKeys(ReusableFunction.getValue("uidd"));

		log.password().sendKeys(ReusableFunction.getValue("pwd"));

		log.login2().click();

		log.Application().click();

		log.Insurance().click();

		System.out.println(driver.getTitle());

		String Parent = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String Child_window1 = I1.next();

			if (!Parent.equals(Child_window1)) {

				driver.switchTo().window(Child_window1).getTitle();

				System.out.println(driver.switchTo().window(Child_window1).getTitle());

			}
		}

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlLocation']")), "BO-Ajmeri Gate");

		Thread.sleep(1000);

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "LDC/UDC at Branch Office");

		log.buttonsubmit().click();

		as.assertEquals(driver.getTitle(), "Insurance");
	
	}
	
	@Test(priority = 2)
	public void ESBMed8Certificate() throws InterruptedException {
	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			ECP=new ESBMed8CertificatePage(driver);
			Thread.sleep(1000);
			ECP.UploadCertificates().click();
			
			ECP.UploadMed8Certificate().click();
			
			ECP.IPNoTxtBx().sendKeys(InsuranceNumber);//1199900090
			
			ECP.SubmitBtn().click();
			Thread.sleep(1000);
			
			ECP.OccupationTxtBx().sendKeys("Test");
			
			ECP.PlaceOfWorkTxtBx().sendKeys("Test");
			
			ECP.HistoryOfCaseTxtBx().sendKeys("Test Test");
			
			ECP.PreviousIllnessTxtBx().sendKeys("Previous Test");
			
			ECP.SpecialistReportTxtBx().sendKeys("Test Test");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("document.getElementById('ctl00_HomePageContent_diagdate').value='03/03/2021'");
			
			//ECP.PresentDiagnosisDrpDwn().sendKeys("Tuberculosis");
						
			ECP.PresentDiagnosisDrpDwn().sendKeys("Disease of eye:Detachment of retina : (18)");
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;

			js1.executeScript("document.getElementById('ctl00_HomePageContent_confdiagdt').value='05/03/2021'");
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;

			js2.executeScript("document.getElementById('ctl00_HomePageContent_refDate').value='05/04/2021'");
			Thread.sleep(1000);
			ECP.ImoNameTxtBx().sendKeys("Test");
			ECP.ImoNameTxtBx().sendKeys("Test");		
			ECP.ImpCodeTxtBx().sendKeys("170653");
			ECP.SubmitButton().click();
			
		//	ECP.CancelButton().click();

}
	@Test(priority = 3)
	public void ContinuationOfPreviousSpellCertificateForESB1() throws InterruptedException{

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

	//	benpg.Close().click();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		FCP=new FirstCertificatePage(driver);
		Thread.sleep(1000);
		FCP.UploadCertificates().click();
		FCP.UploadIMOIMPCertificate().click();
		FCP.IPNoTxtBx().sendKeys(InsuranceNumber);
		FCP.IMORadioBtn().click();

		FCP.ContinuationOfPreviousSell().click();
		Thread.sleep(2000);
		FCP.SpecialIntermediateChkBx().click();
		FCP.SubmitBtn().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtFirstCertDate').value='01/01/2021'");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtExmDate').value='05/04/2021'");//Special Intermediate claim for 28 days

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtNxtVisitDate').value='03/05/2021'");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript("document.getElementById('ctl00_HomePageContent_txtBODate').value='06/04/2021'");

		Thread.sleep(2000);
		FCP.DiagnosisTxtBx().sendKeys("Test");

		FCP.MedicalOfficerName().sendKeys("Test Test");

		FCP.DiagnosisTxtBx().sendKeys("Test");

		FCP.DispensaryLocation().sendKeys("Test");

		FCP.RemarksTxtBx().sendKeys("Test TEst Test");
		Thread.sleep(2000);
		FCP.SubmitButton().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		CertificateSubmission=driver.findElement(By.id("ctl00_HomePageContent_lblStatus")).getText();
		System.out.println("CertificateSubmission");
	//	FCP.CancelBtn().click();
		Thread.sleep(2000);
	//	driver.findElement(By.id("ctl00_HomePageContent_Button2")).click();

	}
	
	@Test(priority = 4)
	public void ContinuationOfPreviousSpellCertificateForESB2() throws InterruptedException{

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

	//	benpg.Close().click();
        WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		FCP=new FirstCertificatePage(driver);
		Thread.sleep(1000);
		FCP.UploadCertificates().click();
		FCP.UploadIMOIMPCertificate().click();
		FCP.IPNoTxtBx().sendKeys(InsuranceNumber);
		FCP.IMORadioBtn().click();

		FCP.ContinuationOfPreviousSell().click();
		Thread.sleep(2000);
		FCP.SpecialIntermediateChkBx().click();
		FCP.SubmitBtn().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtFirstCertDate').value='01/01/2021'");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtExmDate').value='03/05/2021'");//Special Intermediate claim for 28 days

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtNxtVisitDate').value='31/05/2021'");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript("document.getElementById('ctl00_HomePageContent_txtBODate').value='04/05/2021'");

		Thread.sleep(2000);
		FCP.DiagnosisTxtBx().sendKeys("Test");

		FCP.MedicalOfficerName().sendKeys("Test Test");

		FCP.DiagnosisTxtBx().sendKeys("Test");

		FCP.DispensaryLocation().sendKeys("Test");

		FCP.RemarksTxtBx().sendKeys("Test TEst Test");
		Thread.sleep(2000);
		FCP.SubmitButton().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		CertificateSubmission=driver.findElement(By.id("ctl00_HomePageContent_lblStatus")).getText();
		System.out.println("CertificateSubmission");
		//	FCP.CancelBtn().click();
		Thread.sleep(2000);
	//	driver.findElement(By.id("ctl00_HomePageContent_Button2")).click();

	}
	
	@Test(priority = 5)
	public void ContinuationOfPreviousSpellCertificateForESB3() throws InterruptedException{

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

	//	benpg.Close().click();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		FCP=new FirstCertificatePage(driver);
		Thread.sleep(1000);
		FCP.UploadCertificates().click();
		FCP.UploadIMOIMPCertificate().click();
		FCP.IPNoTxtBx().sendKeys(InsuranceNumber);
		FCP.IMORadioBtn().click();

		FCP.ContinuationOfPreviousSell().click();
		Thread.sleep(2000);
		FCP.SpecialIntermediateChkBx().click();
		FCP.SubmitBtn().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtFirstCertDate').value='01/01/2021'");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtExmDate').value='31/05/2021'");//Special Intermediate claim for 28 days

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtNxtVisitDate').value='28/06/2021'");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript("document.getElementById('ctl00_HomePageContent_txtBODate').value='02/06/2021'");

		Thread.sleep(2000);
		FCP.DiagnosisTxtBx().sendKeys("Test");

		FCP.MedicalOfficerName().sendKeys("Test Test");

		FCP.DiagnosisTxtBx().sendKeys("Test");
		FCP.DispensaryLocation().sendKeys("Test");
		FCP.RemarksTxtBx().sendKeys("Test TEst Test");
		Thread.sleep(2000);
		FCP.SubmitButton().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		CertificateSubmission=driver.findElement(By.id("ctl00_HomePageContent_lblStatus")).getText();
		System.out.println("CertificateSubmission");
		//	FCP.CancelBtn().click();
		Thread.sleep(2000);
	//	driver.findElement(By.id("ctl00_HomePageContent_Button2")).click();

	}
	 
//Create Claim For ESB
	
	@Test(priority = 6)
	public void ESBCreateClaim() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

	//	benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();
		Thread.sleep(2000);
		benpg.InsureNumber().sendKeys(InsuranceNumber);
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"SB / ESB / TDB / MBSB");
		Thread.sleep(2000);
		benpg.submit().click();
		Thread.sleep(2000);
		/*Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();*/
	}

	@Test(priority = 7)
	public void ESBP() throws InterruptedException, AWTException {

		BenifitsPage benpg = new BenifitsPage(driver);
	//	benpg.Close().click();
		// create Acknowledgement
		benpg.CreateAcknowlegement().click();
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Extended Sickness Benefit");
		Thread.sleep(2000);
		benpg.Remarks1().sendKeys("test");
		Thread.sleep(2000);
		// click on genrate button
		benpg.genrate().click();
		Thread.sleep(2000);
		Robot rb = new Robot();
	//  rb.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);

		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// click on back button
		benpg.Back().click();
		Thread.sleep(1000);
		// From date
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtFromDate').value='05/04/2021'");
		Thread.sleep(1000);
 // Todate
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtToDate').value='29/06/2021'");
		Thread.sleep(1000);
		benpg.SelectAcknowledgeMent().click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_HomePageContent_grvSelectAck_ctl03_chkSelectAck")).click();
	//	benpg.selectRadiobutton().click();
		Thread.sleep(1000);
		benpg.submit3().click();

		Thread.sleep(1000);

		// Enter Remarks
		benpg.Remarks().sendKeys("test");

		// click submit button
		benpg.submit1().click();
		
		Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();
		
		Thread.sleep(2000);
		ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimId);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		SBPC= new SBProcessClaimPage(driver);

		SBPC.ProcessAClaim().click();

		List<WebElement> allURLs = driver.findElements(By.partialLinkText("Sickness Benefit Claim Processing"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());
		if(allURLs.size()==2){
			System.out.println(allURLs.get(1).getText());
			allURLs.get(1).click();
		}
		else{
			allURLs.get(0).click();
		}

		//	SBPC.SBClaimProcessingLink().click();
		Thread.sleep(2000);
	
	//	SBPC.Page2().click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(ClaimId)).click();
		SBPC.NextBtn().click();
		SBPC.NextBtn().click();
		SBPC.RemarksTxtBx().sendKeys("Test Test");
		Thread.sleep(2000);
		SBPC.ESBRadioBtn().click();
		
		SBPC.SubmitToBM().click();
		Thread.sleep(2000);
	//	driver.findElement(By.id("ctl00_HomePageContent_Exit")).click();
		//SBPC.CancelBtn().click();
		Thread.sleep(2000);
	}


	@Test(priority = 8)
	public void BMLoginforESB() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("https://gateway.esic.in/InsuranceGlobalWebV15/Login/StaffLogin.aspx");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Branch Manager at Branch Office");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
	}

	@Test(priority = 9)
	public void ESBProcessClaimBMLogin2() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		SBPC= new SBProcessClaimPage(driver);

		SBPC.ProcessAClaim().click();

		List<WebElement> allURLs = driver.findElements(By.partialLinkText("Sickness Benefit Claim Processing"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());
		if(allURLs.size()==2){
			System.out.println(allURLs.get(1).getText());
			allURLs.get(1).click();
		}
		else{
			allURLs.get(0).click();
		}

		
		driver.findElement(By.linkText(ClaimId)).click();

		SBPC.NextBtn().click();

		SBPC.NextBtn().click();
		
		SBPC.MRReferenceLink().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	//	SBPC.RemarksTxtBx().sendKeys("Test Test");

		//	SBPC.BMApproveBtn().click();
	//	SBPC.BMRejectBtn().click();


		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();

		//	SBPC.CancelBtn().click();  Medical Referee

	}
	
	@Test(priority = 10)
	public void MRLoginforESB() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("https://gateway.esic.in/InsuranceGlobalWebV15/Login/StaffLogin.aspx");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Medical Referee");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Medical Referee");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
	}


	
	@Test(priority = 11)
	public void ESBProcessClaimMRLogin() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		SBPC= new SBProcessClaimPage(driver);

		SBPC.ProcessAClaim().click();

		SBPC.ESBClaimProcessingLinkMRLogin().click();
		driver.findElement(By.id("ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")).click();
		
		//driver.findElement(By.linkText(ClaimId)).click();

	    SBPC.NatureOfDisease().sendKeys("Dislocation of vertebra/prolapse of intervertebral disc");
		
	    SBPC.MRSubmitBtn().click();
	 //   SBPC.MRRejectBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		//	SBPC.CancelBtn().click();

	}
	
	@Test(priority = 12)
	public void BMLoginforESBRateCard() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("https://gateway.esic.in/InsuranceGlobalWebV15/Login/StaffLogin.aspx");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Branch Manager at Branch Office");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
	}

	@Test(priority = 13)
	public void ESBProcessClaimRateCardBMLogin2() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		SBPC= new SBProcessClaimPage(driver);

		SBPC.ProcessAClaim().click();

		SBPC.ESBClaimProcessingLinkMRLogin().click();
		driver.findElement(By.id("ctl00_HomePageContent_BenfitTasklist_ctl02_taskLink")).click();
	    Thread.sleep(2000);
	    String parent5 = driver.getWindowHandle();
		utilobj.Window(driver);

	    SBPC.ViewMed8Details().click();

		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		utilobj.JSClick(SBPC.CloseBtn(), driver);
		Thread.sleep(4000);
	
		Thread.sleep(2000);
		driver.switchTo().window(parent5);

	    driver.findElement(By.id("ctl00_HomePageContent_txtRemarks")).sendKeys("Test test");
	//	SBPC.RemarksTxtBx().sendKeys("Test Test");

		SBPC.BMAppproveBtn().click();
	//	SBPC.BMRejectBtn().click();


		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	//	SBPC.CancelBtn().click();

	}
	

	@Test(priority = 14)
	public void ESBProcessClaimBMLogin3() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);
	//	benpg.Close().click();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		SBPC= new SBProcessClaimPage(driver);

		SBPC.ProcessAClaim().click();

		List<WebElement> allURLs = driver.findElements(By.partialLinkText("Sickness Benefit Claim Processing"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());
		if(allURLs.size()==2){
			System.out.println(allURLs.get(1).getText());
			allURLs.get(1).click();
		}
		else{
			allURLs.get(0).click();
		}
		driver.findElement(By.linkText(ClaimId)).click();

		SBPC.NextBtn().click();

		SBPC.NextBtn().click();
	
		Thread.sleep(2000);
		SBPC.AttachRateCardBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		SBPC.RemarksTxtBx().sendKeys("Test Test");

	//	SBPC.BMApproveBtn().click();
		SBPC.BMRejectBtn().click();


		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	//	SBPC.CancelBtn().click();

	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String ESBProcessClaim= utilobj.getScreenshot(driver, "ESBClaim");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(ESBProcessClaim).build());
		}
	}
	
}
