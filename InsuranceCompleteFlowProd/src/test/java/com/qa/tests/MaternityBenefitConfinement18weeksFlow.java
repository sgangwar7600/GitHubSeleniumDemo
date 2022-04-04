package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
import com.qa.pages.LoginPage;
import com.qa.pages.MaternityBenefitPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class MaternityBenefitConfinement18weeksFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	MaternityBenefitPage MB;
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
	public void Login() throws InterruptedException, IOException {

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
	/*@Test(priority = 2)
	public void MaternityForm18Certificate() throws InterruptedException {
	
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
            MB.IpNoTextBox().sendKeys("1199900090");
        	JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('ctl00_HomePageContent_txtIssueDate').value='09/06/2021'");
			Thread.sleep(2000);
            
			MB.ConfinementType().click();
			Thread.sleep(2000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("document.getElementById('ctl00_HomePageContent_txtConfDt').value='08/06/2021'");
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_HomePageContent_txtConfAt")).sendKeys("Test");
			Thread.sleep(2000);
			MB.RemarksTxtBx().sendKeys("Test Test");
			Thread.sleep(2000);
			MB.SubmitBtn().click();
		//	MB.CancelBtn().click();
			driver.switchTo().alert().accept();
	
	}
	*/
	@Test(priority = 3)
	public void MBCreateClaim() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();
        Thread.sleep(1000);
		benpg.InsureNumber().sendKeys("1199900090");//1115104135
        Thread.sleep(1000);

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Maternity Benefit");

		Alert alert1 = driver.switchTo().alert();

		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();

		benpg.submit().click();

	}
	

	@Test(priority = 4)
	public void MB_Form19() throws InterruptedException, AWTException {
		 MB = new MaternityBenefitPage(driver);
		 Thread.sleep(1000);
		// Create acknowledge
		MB.CreateAckn().click();
        Thread.sleep(1000);

		MB.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Maternity Benefit - Form 19 Claim");
        Thread.sleep(1000);

		MB.remark().sendKeys("Test");
        Thread.sleep(1000);

		// click on Generate button

		MB.Genrate().click();
        Thread.sleep(1000);
		
		Robot rb = new Robot();

		// rb.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);

		// Click on Back
		MB.Back().click();
        Thread.sleep(1000);

		// MB Start Date
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtmbstartdate').value='09/06/2021'");
        Thread.sleep(1000);

		// Rejoin date
	/*	JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_txtrejoindate').value='05/07/2021'");
        Thread.sleep(1000);*/

		MB.DepartMentShift().sendKeys("2");
        Thread.sleep(1000);

		MB.Occupation().sendKeys("Doctor");
        Thread.sleep(1000);

		MB.BranchName().sendKeys("ajmerigate");
        Thread.sleep(1000);

		MB.SelectACK().click();
        Thread.sleep(1000);

		MB.selradiobutton().click();
        Thread.sleep(1000);

		MB.Submit1().click();
        Thread.sleep(1000);

		MB.Submit2().click();
        Thread.sleep(1000);

   driver.switchTo().alert().accept();
        
        ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimId);
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		
		MB= new MaternityBenefitPage(driver);
		
		MB.ProcessAClaim().click();
		
		MB.MBClaimProcessingLink().click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_BenfitTasklist']/tbody/tr[22]/td/table/tbody/tr/td[2]/a")).click();
		
        driver.findElement(By.linkText(ClaimId)).click();
		
		MB.NextBtn().click();
		
		MB.NextBtn2().click();
		
		MB.RemarksTxtBx2().sendKeys("Test Test");
		
		/*MB.SubmitToBM().click();
		Thread.sleep(2000);
		*/
		//MB.CancelBtn2().click();		
	}

	/*@Test(priority = 5)
	public void BMLoginforConfinement() throws InterruptedException, IOException {

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
	public void MBForm19ClaimProcessingBMLogin() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			
			MB= new MaternityBenefitPage(driver);
			
			MB.ProcessAClaim().click();
			
			MB.MBClaimProcessingLink().click();
			
			driver.findElement(By.linkText(ClaimId)).click();
			
			MB.NextBtn().click();
			
			MB.NextBtn2().click();
			
			MB.RemarksTxtBx2().sendKeys("Test Test");
			
	//		MB.BrowseBtn().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
			
			MB.BMApproveBtn().click();
	//		MB.BMRejectBtn().click();
			Thread.sleep(2000);
			
			//MB.CancelBtn2().click();	
}
	

*/	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String MBConfinementClaim= utilobj.getScreenshot(driver, "MBConfinementClaim");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(MBConfinementClaim).build());
		}
	}

}
