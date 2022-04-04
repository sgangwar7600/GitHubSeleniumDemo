package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.pages.BenifitsPage;
import com.qa.pages.FirstCertificatePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MaternityBenefitPage;
import com.qa.pages.SBProcessClaimPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class MBSBCompleteFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	MaternityBenefitPage MB;
	String ClaimId;
	FirstCertificatePage FCP;
	SBProcessClaimPage MBSBPC;
	String CertificateSubmission;

	
	Utility utilobj = new Utility();
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
	public void MBSBLogin() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);
		log.UserId().sendKeys(ReusableFunction.getValue("uid"));
		Thread.sleep(1000);
		log.Login().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")),
				"BO-Ajmeri Gate");

		Thread.sleep(2000);

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
				"LDC/UDC at Branch Office");

		log.Login1().click();


	
		//For Production
	/*		LoginPage log = new LoginPage(driver);
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
*/
		as.assertEquals(driver.getTitle(), "Insurance");
}
	@Test(priority = 2)
	public void MaternityForm18CertificateForMBSB() throws InterruptedException {
	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			MB=new MaternityBenefitPage(driver);

			MB.UploadCertificates().click();

			MB.MaternityForm18Certificate().click();
            MB.IpNoTextBox().sendKeys("1199900090");//1199900090
        	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        	js1.executeScript("document.getElementById('ctl00_HomePageContent_txtIssueDate').value='01/06/2021'");
			Thread.sleep(2000);
            MB.IMOName().sendKeys("TEst");
			MB.ExpectedConfinementType().click();
			Thread.sleep(2000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("document.getElementById('ctl00_HomePageContent_txtExDt').value='01/09/2021'");
			Thread.sleep(2000);
			MB.RemarksTxtBx().sendKeys("Test Test");
			Thread.sleep(2000);
			MB.SubmitBtn().click();
		//	MB.CancelBtn().click();
			Alert alert1 = driver.switchTo().alert();

			String alertMessage1 = driver.switchTo().alert().getText();

			System.out.println(alertMessage1);

			alert1.accept();
	
	}
	
	
	@Test(priority = 3)
	public void FirstCertificateForMBSB() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);
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
		FCP.IPNoTxtBx().sendKeys("1199900090");
		FCP.IMORadioBtn().click();  
		FCP.NewSpellRadioBtn().click();
		FCP.SubmitBtn().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtExmDate').value='01/07/2021'");//First Certificate claim for 7 days 

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtNxtVisitDate').value='07/07/2021'");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtBODate').value='08/07/2021'");

		FCP.DiagnosisTxtBx().sendKeys("Pregnancy");

		FCP.MedicalOfficerName().sendKeys("Test Test");

		FCP.DiagnosisTxtBx().sendKeys("Pregnancy");

		FCP.DispensaryLocation().sendKeys("Test");

		FCP.RemarksTxtBx().sendKeys("Test TEst Test");

		FCP.SubmitButton().click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = driver.switchTo().alert().getText();
		System.out.println(alertMessage1);
		alert1.accept();
		Thread.sleep(2000);
		CertificateSubmission=driver.findElement(By.id("ctl00_HomePageContent_lblStatus")).getText();
		System.out.println("CertificateSubmission");
		//	FCP.CancelBtn().click();
		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_HomePageContent_Button2")).click();

	}

	@Test(priority = 4)
	public void IntermediateCertificateForMBSB() throws InterruptedException{

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
		FCP.IPNoTxtBx().sendKeys("1199900090");
		FCP.IMORadioBtn().click();

		FCP.ContinuationOfPreviousSell().click();
		Thread.sleep(2000);
	//	FCP.SpecialIntermediateChkBx().click();
		FCP.SubmitBtn().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtFirstCertDate').value='01/07/2021'");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtExmDate').value='08/07/2021'");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtNxtVisitDate').value='15/07/2021'");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript("document.getElementById('ctl00_HomePageContent_txtBODate').value='16/07/2021'");

		Thread.sleep(2000);
		FCP.DiagnosisTxtBx().sendKeys("Pregnancy");

		FCP.MedicalOfficerName().sendKeys("Test Test");

		FCP.DiagnosisTxtBx().sendKeys("Pregnancy");

		FCP.DispensaryLocation().sendKeys("Test");

		FCP.RemarksTxtBx().sendKeys("Test TEst Test");
		Thread.sleep(2000);
		FCP.SubmitButton().click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = driver.switchTo().alert().getText();
		System.out.println(alertMessage1);
		alert1.accept();
		Thread.sleep(2000);

		CertificateSubmission=driver.findElement(By.id("ctl00_HomePageContent_lblStatus")).getText();
		System.out.println("CertificateSubmission");
		//	FCP.CancelBtn().click();
		Thread.sleep(2000);
	//	driver.findElement(By.id("ctl00_HomePageContent_Button2")).click();

	}

	@Test(priority = 5)
	public void MBSBFinalCertificate() throws InterruptedException {
		
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
			FCP.IPNoTxtBx().sendKeys("1199900090");
			FCP.IMORadioBtn().click();
			FCP.NewSpellRadioBtn().click();
			FCP.SubmitBtn().click();
            Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("document.getElementById('ctl00_HomePageContent_txtExmDate').value='16/07/2021'");
            FCP.FitnessDate().click();
			JavascriptExecutor js1 = (JavascriptExecutor) driver;

			js1.executeScript("document.getElementById('ctl00_HomePageContent_txtFitnesDate').value='19/07/2021'");
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;

			js2.executeScript("document.getElementById('ctl00_HomePageContent_txtBODate').value='20/07/2021'");
			
			FCP.DiagnosisTxtBx().sendKeys("Pregnancy");
			
			FCP.MedicalOfficerName().sendKeys("Test Test");
			
			FCP.DiagnosisTxtBx().sendKeys("Pregnancy");
			
			FCP.DispensaryLocation().sendKeys("Test");
			
			FCP.RemarksTxtBx().sendKeys("Test TEst Test");
			
			FCP.SubmitButton().click();
			Alert alert1 = driver.switchTo().alert();
			String alertMessage1 = driver.switchTo().alert().getText();
			System.out.println(alertMessage1);
			alert1.accept();
			
		//	FCP.CancelBtn().click();

}
	
	@Test(priority = 6)
	public void CreateClaimForMBSB() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);
	//	benpg.Close().click();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();

		benpg.InsureNumber().sendKeys("1199900090");

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"SB / ESB / TDB / MBSB");

		benpg.submit().click();

	}

	@Test(priority = 7)
	public void MBSicknessClaimForm() throws InterruptedException, AWTException {

		BenifitsPage benpg = new BenifitsPage(driver);
		//  benpg.Close().click();
		// create Acknowledgement
		Thread.sleep(2000);
		benpg.ClaimType().sendKeys("Sickness due to pregnancy");
		benpg.CreateAcknowlegement().click();

		Thread.sleep(2000);

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Sickness Due To Pregnancy");

		benpg.Remarks1().sendKeys("test");

		// click on generate button
		benpg.genrate().click();

		Robot rb = new Robot();

		// rb.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);

		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		// click on back button
		benpg.Back().click();

		// From date
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtFromDate').value='01/07/2021'");

		// Todate
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtToDate').value='19/07/2021'");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtDOF').value='20/07/2021'");

		benpg.SelectAcknowledgeMent().click();
		
	    driver.findElement(By.id("ctl00_HomePageContent_grvSelectAck_ctl21_chkSelectAck")).click();
		benpg.submit3().click();

		Thread.sleep(1000);

		// Enter Remarks
		benpg.Remarks().sendKeys("test");

		// click submit button
		benpg.submit1().click();

		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimId);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		MBSBPC= new SBProcessClaimPage(driver);
		

		MBSBPC.ProcessAClaim().click();

		List<WebElement> allURLs = driver.findElements(By.partialLinkText("Sickness Benefit Claim Processing"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());
		if(allURLs.size()==2){
			System.out.println(allURLs.get(1).getText());
			allURLs.get(1).click();
		}
		else{
			allURLs.get(0).click();
		}

		//	MBSBPC.SBClaimProcessingLink().click();
		Thread.sleep(2000);
		/*	String ClaimId="296";
		for(int i=2;i<=4;i++){
			driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td["+i+"]/a")).click();
			Thread.sleep(2000);
			if(driver.findElement(By.linkText(ClaimId)).isEnabled()==true)
			{
				driver.findElement(By.linkText(ClaimId)).click();

			}


		}*/
		Thread.sleep(2000);
		MBSBPC.Page2().click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(ClaimId)).click();

		MBSBPC.NextBtn().click();

		MBSBPC.NextBtn().click();

		MBSBPC.RemarksTxtBx().sendKeys("Test Test");
		Thread.sleep(2000);
		MBSBPC.SubmitToBM().click();
		Thread.sleep(2000);
	//	driver.findElement(By.id("ctl00_HomePageContent_Exit")).click();
		//MBSBPC.CancelBtn().click();
		Thread.sleep(2000);

	}



	@Test(priority = 8)
	public void BMLoginforMBSB() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}

	@Test(priority = 9)
	public void MBSBProcessClaimBMLogin() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		MBSBPC= new SBProcessClaimPage(driver);

		MBSBPC.ProcessAClaim().click();

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

		MBSBPC.NextBtn().click();

		MBSBPC.NextBtn().click();

		MBSBPC.RemarksTxtBx().sendKeys("Test Test");

		//	MBSBPC.BMApproveBtn().click();
		MBSBPC.BMRejectBtn().click();


		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		//	MBSBPC.CancelBtn().click();

	}


	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String MBSBProcessClaim= utilobj.getScreenshot(driver, "MBSBClaim");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(MBSBProcessClaim).build());
		}
	}

}
