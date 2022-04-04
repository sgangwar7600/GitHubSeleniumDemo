package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import com.qa.pages.ConfinementClaimProcessingPage;
import com.qa.pages.ConveyanceAllowanceClaimProcessingPage;
import com.qa.pages.LoginPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class ConfinementClaimProcessingTest extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	ConveyanceAllowanceClaimProcessingPage CACP;
	String ClaimId;
	
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
	public void LoginforConfinementClaim() throws InterruptedException, IOException  {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	/*	LoginPage log = new LoginPage(driver);

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

		// log.Login().click();
		//
		// log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")),
		// "BO-Ajmeri Gate");
		//
		// Thread.sleep(2000);
		//
		// log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
		// "LDC/UDC at Branch Office");
		//
		// log.Login1().click();

		as.assertEquals(driver.getTitle(), "Insurance");
*/
	}

	@Test(priority = 2)
	public void ConfinementPage() throws InterruptedException {

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
		benpg.InsureNumber().sendKeys("1199900090");
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Confinement");
		Thread.sleep(2000);
		benpg.submit().click();
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void CreateConfinementClaim() throws InterruptedException, AWTException{
		ConfinementClaimProcessingPage CCPP=new ConfinementClaimProcessingPage(driver);
		 CCPP.CreateAcknowledgement().click();
		 Thread.sleep(2000);
		 CCPP.ClaimType().sendKeys("Confinemet");
		 Thread.sleep(2000);
		 CCPP.RemarksTxtBx().sendKeys("Test Test");
		 CCPP.RemarksTxtBx().sendKeys("Test Test");

		 CCPP.GenerateAcknowledgementBtn().click();
		 Robot rb = new Robot();

			// rb.keyPress(KeyEvent.VK_DOWN);

			Thread.sleep(3000);
			rb.keyPress(KeyEvent.VK_ENTER);

			rb.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(2000);
			
			CCPP.BackBtn().click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("document.getElementById('ctl00_HomePageContent_txtconfdate').value='01/07/2021'");
			Thread.sleep(2000);
			CCPP.ConfinemetLocation().sendKeys("Delhi");
			Thread.sleep(2000);
			CCPP.SelectAcknowledgement().click();
			
			driver.findElement(By.id("ctl00_HomePageContent_grvSelectAck_ctl21_chkSelectAck")).click();
			Thread.sleep(2000);
			CCPP.AcknowledgementSubmitBtn().click();
			Thread.sleep(2000);
			
			CCPP.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
			
			CCPP.SubmitBtn().click();
			Thread.sleep(2000);
			ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
			System.out.println(ClaimId);

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);

			CCPP.ProcessAClaim().click();
		    CCPP.ConfinemetClaimProcessingLink().click();	
		  
			Thread.sleep(2000);
			driver.findElement(By.linkText(ClaimId)).click();
			CCPP.NextBtn().click();
			CCPP.NextBtn2().click();
			Thread.sleep(2000);
			CCPP.Remarks2TxtBx().sendKeys("Test Test");
			Thread.sleep(2000);
			CCPP.SubmitToBM().click();
	}
	
	@Test(priority = 4)
	public void BMLoginforConfinementClaim() throws InterruptedException, IOException {

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
	public void ConfinementClaimProcessingBM() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();
			
			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			
			ConfinementClaimProcessingPage CCPP=new ConfinementClaimProcessingPage(driver);
			
			CCPP.ProcessAClaim().click();
			
			CCPP.ConfinemetClaimProcessingLink().click();
			
			driver.findElement(By.linkText(ClaimId)).click();
			
			CCPP.NextBtn().click();
			
			CCPP.NextBtn2().click(); 
			Thread.sleep(2000);
			CCPP.Remarks2TxtBx().sendKeys("Test Test");
			
			//Approve Button
		/*	driver.findElement(By.id("ctl00_HomePageContent_approve")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.findElement(By.id("ctl00_HomePageContent_print")).click();
			driver.findElement(By.id("btnCancel")).click();
		*/	
			
			driver.findElement(By.id("ctl00_HomePageContent_reject")).click();
		
}

	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String Confinement= utilobj.getScreenshot(driver, "Confinement");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(Confinement).build());
		}
	}

}
