package com.qa.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
import com.qa.pages.LoginPage;
import com.qa.pages.RGSKYClaimProcessingPage;
import com.qa.pages.RGSKYUA1;
import com.qa.pages.UploadUA4iCertificatePage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class RGSKYCompleteFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	String ClaimId;
	String ClaimId1;
	RGSKYClaimProcessingPage RGSKYCP;


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
	public void LoginforRGSKY() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);
		log.UserId().sendKeys(ReusableFunction.getValue("uid"));
		log.Login().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")),
				"BO-Ajmeri Gate");

		Thread.sleep(2000);

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
				"LDC/UDC at Branch Office");

		log.Login1().click();

		as.assertEquals(driver.getTitle(), "Insurance");



		//For Production

		/*	LoginPage log = new LoginPage(driver);	
      //log.UserId().sendKeys(ReusableFunction.getValue("uidd"));


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
		//as.assertEquals(driver.getTitle(), "Insurance");

		 */	}

	@Test(priority = 2)
	public void RGSKY() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();
		Thread.sleep(2000);
		benpg.InsureNumber().sendKeys("1115104063");
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")), "RGSKY");
		Thread.sleep(2000);
		benpg.submit().click();

		Thread.sleep(2000);


	}

	@Test(priority = 3)
	public void  RGSKYUA1() throws InterruptedException {

		RGSKYUA1 RGSKY = new RGSKYUA1(driver);

		RGSKY.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlUnemployedReason']")),
				"Closure of Factory");
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript(
				"document.getElementById('ctl00_HomePageContent_txtClaimUnemploymentAllowanceFrom').value='01/01/2020'");
		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript(
				"document.getElementById('ctl00_HomePageContent_txtClaimUnemploymentAllowanceTo').value='31/10/2020'");
		Thread.sleep(2000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;

		js4.executeScript(
				"document.getElementById('ctl00_HomePageContent_txtDtLastDayEmployment').value='31/12/2019'");
		Thread.sleep(2000);
		RGSKY.Browse().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		Thread.sleep(2000);
		RGSKY.Name().sendKeys("Test");
		Thread.sleep(2000);
		RGSKY.Designation().sendKeys("tester");
		Thread.sleep(2000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js5.executeScript("document.getElementById('ctl00_HomePageContent_txtIssuingDate').value='05/11/2020'");
		Thread.sleep(2000);
		RGSKY.Browse2().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		RGSKY.submit().click();
		//  RGSKY.CancelBtn().click();
		ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimId);

		Thread.sleep(2000);
		RGSKYCP= new RGSKYClaimProcessingPage(driver);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		RGSKYCP.ProcessAClaim().click();

		RGSKYCP.RGSKYClaimProcessingLink().click();

		driver.findElement(By.linkText(ClaimId)).click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.NextBtn().click();
		driver.findElement(By.id("ctl00_HomePageContent_UploaddelayReason")).sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		Thread.sleep(2000);

		RGSKYCP.RemarksTxtBx().sendKeys("Test Test");

		RGSKYCP.SubmitToBM().click();
		Thread.sleep(2000);



	}

	//RGSKY Claim Processing Through BM Login
	@Test(priority = 4)
	public void BMLoginforRGSKY() throws InterruptedException, IOException {

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

	@Test(priority = 5)
	public void RGSKYBMLogin() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		RGSKYCP= new RGSKYClaimProcessingPage(driver);

		RGSKYCP.ProcessAClaim().click();

		RGSKYCP.RGSKYClaimProcessingLink().click();

		driver.findElement(By.linkText(ClaimId)).click();

		RGSKYCP.NextBtn().click();
		Thread.sleep(2000);
		String parent02 = driver.getWindowHandle();
		utilobj.Window(driver);

		RGSKYCP.SendUA3toEmployerforUA4ILink().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

		Thread.sleep(4000);
		utilobj.scroolDown(driver);
		Thread.sleep(2000);
		utilobj.scroolDown(driver);
		Thread.sleep(2000);
		utilobj.JSClick(RGSKYCP.SendButton(), driver);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().window(parent02);

		/*RGSKYCP.NextBtn().click();

			RGSKYCP.RemarksTxtBx().sendKeys("Test Test");

			RGSKYCP.RejectBtn().click();*/

		//		RGSKYCP.ApproveBtn().click();

		Thread.sleep(2000);

	}

	//Upload UA4i Certificate Through BM Login	
	@Test(priority = 6)
	public void UploadUA4iCertificate() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		UploadUA4iCertificatePage U4iCP=new UploadUA4iCertificatePage(driver);
		Thread.sleep(2000);
		U4iCP.UploadCertificates().click();
		Thread.sleep(2000);
		U4iCP.UploadUA4iCertificate().click();
		Thread.sleep(2000);
		U4iCP.InsuranceNoTxtBx().sendKeys("1115104063");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtDtSuperannuation').value='01/01/2020'");
		Thread.sleep(2000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtDtAppointment').value='14/06/2017'");
		Thread.sleep(2000);
		U4iCP.ReasonOfUnemploymentDrpDwn().sendKeys("Closure of Factory");
		U4iCP.ReasonOfUnemploymentDrpDwn().sendKeys("Closure of Factory");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtDtUnemployment').value='31/12/2019'");
		Thread.sleep(2000);
		U4iCP.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		U4iCP.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");

		Thread.sleep(2000);
		U4iCP.CheckBox().click();
		Thread.sleep(2000);
		U4iCP.SubmitBtn().click();
		//	U4iCP.CancelBtn().click();

	}

	@Test(priority = 7)
	public void RGSKYUA4iBMLogin() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		//	benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		RGSKYCP= new RGSKYClaimProcessingPage(driver);

		RGSKYCP.ProcessAClaim().click();

		RGSKYCP.RGSKYClaimProcessingLink().click();

		driver.findElement(By.linkText(ClaimId)).click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.RemarksTxtBx().sendKeys("Test Test");

		//	RGSKYCP.RejectBtn().click();

		driver.findElement(By.id("ctl00_HomePageContent_submit")).click();

		Thread.sleep(2000);

	}
	//RGSKY Claim Processing through RO Login
	@Test(priority = 8)
	public void ROLoginforRGSKY() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("RO-Rajendra Place");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Benefits Branch Officer");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Benefits Branch Officer");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}

	@Test(priority = 9)
	public void RGSKYROLogin() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		RGSKYCP= new RGSKYClaimProcessingPage(driver);

		RGSKYCP.ProcessAClaim().click();

		RGSKYCP.RGSKYClaimProcessingLink().click();

		driver.findElement(By.linkText(ClaimId)).click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.RemarksTxtBx().sendKeys("Test Test");

		RGSKYCP.ROApproveBtn().click();

		Thread.sleep(2000);

	}

	//Upload UA4iiCertificate through LDC/UDC Login
	@Test(priority = 10)
	public void UploadUA4iiRGSKYCertificate() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);
		log.UserId().sendKeys(ReusableFunction.getValue("uid"));
		log.Login().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")),
				"BO-Ajmeri Gate");

		Thread.sleep(2000);

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
				"LDC/UDC at Branch Office");

		log.Login1().click();
	}

	@Test(priority = 11)
	public void UploadUA4iiCertificate() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		UploadUA4iCertificatePage U4iiCP=new UploadUA4iCertificatePage(driver);
		Thread.sleep(2000);
		U4iiCP.UploadCertificates().click();
		Thread.sleep(2000);
		U4iiCP.UploadUA4iiCertificate().click();
		Thread.sleep(2000);
		U4iiCP.InsuranceNoTxtBx2().sendKeys("1115104063");

		Thread.sleep(2000);
		U4iiCP.Designation().sendKeys("Tester");
		U4iiCP.Designation().sendKeys("Tester");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtEmpFrom').value='14/06/2017'");
		Thread.sleep(2000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtEmpTo').value='31/12/2019'");
		Thread.sleep(2000);
		U4iiCP.DepartmentTxtBx().sendKeys("Testing");

		Thread.sleep(2000);
		U4iiCP.CheckBox().click();
		Thread.sleep(2000);
		U4iiCP.SubmitBtn().click();
		//	U4iiCP.CancelBtn().click();

	}

	//Create UA9 Claim through LDC/UDC Login
	@Test(priority = 12)
	public void UA9Claim() throws InterruptedException {

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
		benpg.InsureNumber().sendKeys("1115104063");
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")), "RGSKY");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent_ddlClaimSubType")).sendKeys("RGSKY UA9 Claim");
		benpg.submit().click();

		Thread.sleep(2000);


	}

	//UA9 Claim processing
	@Test(priority = 13)
	public void  RGSKYUA9ClaimCreate() throws InterruptedException {

		RGSKYUA1 RGSKY = new RGSKYUA1(driver);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript(
				"document.getElementById('ctl00_HomePageContent_txtClaimUnemploymentAllowanceFrom').value='01/01/2020'");
		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript(
				"document.getElementById('ctl00_HomePageContent_txtClaimUnemploymentAllowanceTo').value='31/10/2020'");
		Thread.sleep(2000);

		RGSKY.Browse3().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		Thread.sleep(2000);

		RGSKY.UA9SubmitBtn().click();

		ClaimId1=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimId1);

		Thread.sleep(2000);
		RGSKYCP= new RGSKYClaimProcessingPage(driver);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		RGSKYCP.ProcessAClaim().click();

		RGSKYCP.RGSKYClaimProcessingLink().click();

		driver.findElement(By.linkText(ClaimId)).click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.NextBtn().click();
		driver.findElement(By.id("ctl00_HomePageContent_UploaddelayReason")).sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		Thread.sleep(2000);

		RGSKYCP.RemarksTxtBx().sendKeys("Test Test");

		RGSKYCP.SubmitToBM().click();
		Thread.sleep(2000);

	}

	//UA9 Claim Processing Through BM Login
	@Test(priority = 14)
	public void BMLoginforRGSKYUA9() throws InterruptedException, IOException {

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

	@Test(priority = 15)
	public void RGSKYUA9ProcessingBMLogin() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		RGSKYCP= new RGSKYClaimProcessingPage(driver);

		RGSKYCP.ProcessAClaim().click();

		RGSKYCP.RGSKYClaimProcessingLink().click();

		driver.findElement(By.linkText(ClaimId)).click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.NextBtn().click();

		RGSKYCP.RemarksTxtBx().sendKeys("Test Test");

		//	RGSKYCP.RejectBtn().click();

		RGSKYCP.ApproveBtn().click();

		Thread.sleep(2000);

	}


	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String RGSKYClaim= utilobj.getScreenshot(driver, "RGSKYClaim");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(RGSKYClaim).build());
		}
	}

}
