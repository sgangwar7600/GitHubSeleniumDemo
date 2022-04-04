package com.qa.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
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
import com.qa.pages.DependentBenefitPage;
import com.qa.pages.LoginPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class DependentBenefitCompleteFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	DependentBenefitPage DBP;
	String ClaimId;
	String ClaimRequestId;

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
	public void LoginforDependentBenefit() throws InterruptedException, IOException  {


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

		as.assertEquals(driver.getTitle(), "Insurance");		
		 */	
	}
	@Test(priority = 2)
	public void DependentBenifits() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		DBP=new DependentBenefitPage(driver);
		Thread.sleep(1000);
		DBP.UploadCertificates().click();
		DBP.UploadAlternateDeathCertificate().click();
		DBP.IpNoTxtBx().sendKeys("1111111120");
		Thread.sleep(1000);
		DBP.DateOfDeath().click();
		DBP.DateOfDeath().click();
		DBP.DateOfDeathPrevArrow().click();
		DBP.SelectDateOfDeath().click();
		DBP.CauseOfDeath().sendKeys("Test Test");
		DBP.MedicalOfficerName().sendKeys("Test");
		Thread.sleep(2000);
		DBP.DateOfIssue().click();
		DBP.DateOfIssue().click();
		DBP.DateOfIssuePrevArrow().click();
		DBP.SelectDateOfIssue().click();
		DBP.BrowseFile().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		DBP.SubmitBtn().click();
		//DBP.ResetBtn().click();

	}

	@Test(priority = 3)
	public void DBForm16() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();

		benpg.InsureNumber().sendKeys("1111111120");

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Dependant Benefit");

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimSubType']")),
				"DB - Form 16 Request");

		benpg.submit().click();

	}


	@Test(priority = 4)
	public void DBCreateClaimRequest() throws InterruptedException {

		DBP= new DependentBenefitPage(driver);

		//	DBP.dependent().click();

		DBP.AddDependent().click();

		DBP.DepaendentName().sendKeys("niket");

		DBP.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_DropDownList1']")), "Father");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('ctl00_HomePageContent_CtrlTxtIPRetdate').value='07/06/1968'");

		DBP.Address().sendKeys("fnnryy");

		DBP.pincode().sendKeys("485771");

		DBP.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_state']")), "Madhya Pradesh");

		DBP.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_state']")), "Madhya Pradesh");

		DBP.Remark().sendKeys("tetst");

		//		DBP.submit().click();
		//
		//		Alert alert1 = driver.switchTo().alert();
		//
		//		String alertMessage1 = driver.switchTo().alert().getText();
		//
		//		System.out.println(alertMessage1);
		//
		//		alert1.accept();
		/*	ClaimRequestId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimRequestId);
		 */	String strtext = driver.findElement(By.id("ctl00_HomePageContent_lblStatus")).getText();
		 System.out.println(strtext);
		 String strtextRequestNo[] = strtext.split(" ");
		 ClaimRequestId = strtextRequestNo[3];
		 System.out.println(ClaimRequestId);
		 Thread.sleep(2000);

	}

		@Test(priority = 5)
	public void BMLoginforDB() throws InterruptedException, IOException {

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


	@Test(priority = 6)
	public void DBClaimRequestProcessingPageBMLogin() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);

			DBP= new DependentBenefitPage(driver);

			DBP.ProcessAClaim().click();

			DBP.DBRequestProcessingLink().click();

			driver.findElement(By.linkText(ClaimRequestId)).click();

			DBP.NextBtn().click();


			DBP.NextBtn().click();


			DBP.BBORemarksTxtBx().sendKeys("Test Test");

			Thread.sleep(2000);

			DBP.BBOApproveRadioBtn().click();

		//	DBP.SubmitBtn().click();
			Thread.sleep(2000);
			DBP.BBOCancelBtn().click();
}

	@Test(priority = 7)
	public void BBOLoginForDBRequestProcessing() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Benefits Branch Officer");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Benefits Branch Officer");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}

	@Test(priority = 8)
	public void DBRequestProcessingBBOLogin() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);

			DBP= new DependentBenefitPage(driver);

			DBP.ProcessAClaim().click();

			DBP.DBRequestProcessingLink().click();

			driver.findElement(By.linkText(ClaimRequestId)).click();

			DBP.NextBtn().click();

			DBP.NextBtn().click();

		//	DBP.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");//For late

			DBP.BBORemarksTxtBx().sendKeys("Test Test");

			Thread.sleep(2000);

			DBP.GenerateESIC101().click();
			Thread.sleep(2000);
			DBP.BBOCloseBtn().click();
		//	DBP.SubmitBtnBBO().click();
			Thread.sleep(2000);
			DBP.BBOCancelBtn().click();
}

	@Test(priority = 9)
	public void DBRequestProcessingBBOLoginafter30Days() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			//benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);

			DBP= new DependentBenefitPage(driver);

			DBP.ProcessAClaim().click();

			DBP.DBRequestProcessingLink().click();

			driver.findElement(By.linkText(ClaimRequestId)).click();

			DBP.NextBtn().click();

			DBP.NextBtn().click();

		//	DBP.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");//For late

			DBP.BBORemarksTxtBx().sendKeys("Test Test");

			Thread.sleep(2000);

			DBP.GenerateESIC101().click();
			Thread.sleep(2000);
			DBP.BBOCloseBtn().click();

		//	DBP.BBOApproveRadioBtn().click();  //After 30 days Benefit Branch Officer have to approve the Dependant


		//	DBP.SubmitBtnBBO().click();
			Thread.sleep(2000);
			DBP.BBOCancelBtn().click();
}

	@Test(priority = 10)
	public void F_ALoginForDBRequestProcessing() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Officer of F&A");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Officer of F&A");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}

	@Test(priority = 11)
	public void DBRequsetProcessingF_ALogin() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);

			DBP= new DependentBenefitPage(driver);

			DBP.ProcessAClaim().click();

			DBP.DBRequestProcessingLink().click();

			driver.findElement(By.linkText(ClaimRequestId)).click();

			DBP.NextBtn().click();

			DBP.NextBtn().click();

			DBP.BBORemarksTxtBx().sendKeys("Test Test");

			Thread.sleep(2000);

			DBP.FAApproveRadioBtn().click();  //After 30 days Benefit Branch Officer have to approve the Dependant


		//	DBP.SubmitBtn().click();
			Thread.sleep(2000);
			DBP.BBOCancelBtn().click();
}


	@Test(priority = 12)
	public void BMLoginforDB2() throws InterruptedException, IOException {

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


	@Test(priority = 13)
	public void DBClaimRequestProcessingPageBMLogin2() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);

			DBP= new DependentBenefitPage(driver);

			DBP.ProcessAClaim().click();

			DBP.DBRequestProcessingLink().click();

			driver.findElement(By.linkText(ClaimRequestId)).click();

			DBP.NextBtn().click();

			DBP.NextBtn().click();

			DBP.BBORemarksTxtBx().sendKeys("Test Test");

			Thread.sleep(2000);

			DBP.BBOApproveRadioBtn().click();

		//	DBP.SubmitBtn().click();
			Thread.sleep(2000);
			DBP.BBOCancelBtn().click();
}

	@Test(priority = 14)
	public void LDC_UDCLoginForDBCreateClaim() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("LDC/UDC at Branch Office");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("LDC/UDC at Branch Office");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}

	@Test(priority = 15)
	public void DBCreateClaim() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();

		benpg.InsureNumber().sendKeys("1111111120");

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Dependant Benefit");

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimSubType']")),
				"DB - Form 16 A Claim");

		benpg.submit().click();

		Thread.sleep(2000);

	}
	@Test(priority = 16)
	public void DB_Form16Claim() throws InterruptedException {

		DBP= new DependentBenefitPage(driver);

		DBP.SelectDependent().click();
		 Thread.sleep(1000);
		DBP.CreateClaim().click();
		 Thread.sleep(2000);
		DBP.Browsefile().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");

		//DBP.submit().click();

//		Alert alert1 = driver.switchTo().alert();
//
//		String alertMessage1 = driver.switchTo().alert().getText();
//
//		System.out.println(alertMessage1);
//
//		alert1.accept();

		Thread.sleep(2000);
		String strtext = driver.findElement(By.id("ctl00_HomePageContent_lblStatus")).getText();
		 System.out.println(strtext);
		 String strtextClaimId[] = strtext.split(" ");
		 ClaimId = strtextClaimId[3];
		 System.out.println(ClaimId);
		 Thread.sleep(2000);


		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);

		DBP= new DependentBenefitPage(driver);

		DBP.ProcessAClaim().click();

		DBP.DBClaimProcessingLink().click();

		driver.findElement(By.linkText(ClaimId)).click();

		DBP.NextBtn().click();

		DBP.NextBtn().click();

	//	DBP.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");//For late

		DBP.RemarksTxtBx().sendKeys("Test Test");

		//DBP.SubmitToBM().click();
		Thread.sleep(2000);

		DBP.CancelBtn().click();

	}

	@Test(priority = 17)
	public void BMLoginforDBClaim() throws InterruptedException, IOException {

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

	@Test(priority = 18)
	public void DBClaimProcessingBMLogin() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);

			DBP= new DependentBenefitPage(driver);

			DBP.ProcessAClaim().click();

			DBP.DBClaimProcessingLink().click();

			driver.findElement(By.linkText(ClaimId)).click();

			DBP.NextBtn().click();

			DBP.NextBtn().click();

		//	DBP.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");//For late

			DBP.RemarksTxtBx().sendKeys("Test Test");

			//DBP.SubmitToBM().click();
			Thread.sleep(2000);

			//DBP.CancelBtn().click();
}
	 
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String DBProcessClaim= utilobj.getScreenshot(driver, "DBClaim");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(DBProcessClaim).build());
		}
	}
}
