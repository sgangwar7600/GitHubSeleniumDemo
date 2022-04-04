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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.pages.BenifitsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MaternityBenefitPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class MBForm21CompleteFlow extends Browserfactory {

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
	public void LoginforMBForm21() throws InterruptedException, IOException {

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
	public void MaternityForm21Certificate() throws InterruptedException{
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			MB=new MaternityBenefitPage(driver);

			MB.UploadCertificates().click();
			
			MB.MaternityForm21Certificate().click();
			MB.IpNoTextBox().sendKeys("1115104063");
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("document.getElementById('ctl00_HomePageContent_txtIssueDate').value='12/08/2021'");
	        Thread.sleep(1000);
	    	JavascriptExecutor js1 = (JavascriptExecutor) driver;

			js1.executeScript("document.getElementById('ctl00_HomePageContent_txtIWDeathDt').value='11/08/2021'");
	        Thread.sleep(1000);
	        MB.CauseOfDeath().sendKeys("Test Test");
          
            MB.ConfinemextTextBox().sendKeys("4");
            MB.CauseOfDeath().sendKeys("Test Test");
            Thread.sleep(2000);
            JavascriptExecutor js2 = (JavascriptExecutor) driver;

			js2.executeScript("document.getElementById('ctl00_HomePageContent_txtPresDt').value='11/08/2021'");
	        Thread.sleep(1000);
            MB.SubmitBtn().click();
		//	MB.CancelBtn().click();

	}
	
	@Test(priority = 3)
	public void MBForm20CreateClaim() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

		//benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();
		Thread.sleep(1000);
		benpg.InsureNumber().sendKeys("1115104063");//1115104135
		Thread.sleep(1000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Maternity Benefit");
		Thread.sleep(2000);
	/*	Alert alert1 = driver.switchTo().alert(); 

		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();
*/
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimSubType']")),
				"MB - Form 20 Claim");
		Thread.sleep(2000);
		benpg.submit().click();
		Thread.sleep(2000);
	/*	Alert alert2 = driver.switchTo().alert();

		String alertMessage2 = driver.switchTo().alert().getText();

		System.out.println(alertMessage2);

		alert2.accept();*/
		
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void CreateClaimMBForm20() throws InterruptedException, AWTException {

		 MB = new MaternityBenefitPage(driver);
		Thread.sleep(3000);
	

		MB.CreateAcknowledge().click();
		
		Thread.sleep(5000);
		// For Maternity Benefit - Form 20 Claim
		//MB.Select_List(driver.findElement(By.xpath("/html/body/form/div[3]/table[2]/tbody/tr[2]/td/div/table[1]/tbody/tr[7]/td[2]/select")),
			//	"Maternity Benefit - Form 20 Claim");
	
		MB.ClaimType().click();
		Thread.sleep(1000);
		MB.ClaimTypeForm20().click();
		
		Thread.sleep(2000);
	  MB.Remark().sendKeys("Test");
		
		Thread.sleep(1000);

		// Click on Genrate
		MB.Genrate().click();
		
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

		js.executeScript("document.getElementById('ctl00_HomePageContent_CtrlTxtIPRetdate').value='12/08/2021'");
		Thread.sleep(1000);
		// MB End Date
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_CtrlTxtIPRetdate2').value='18/01/2022'");
		Thread.sleep(1000);
		// Insured Women Death Date
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_IWddate').value='11/08/2021'");
		Thread.sleep(1000);
		MB.SelectAcknowledgement().click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_HomePageContent_grvSelectAck_ctl03_chkSelectAck")).click();
        Thread.sleep(1000);
		MB.Submit1().click();
		Thread.sleep(1000);
		MB.Submit2().click();

		Alert alert1 = driver.switchTo().alert();

		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();

		Thread.sleep(3000);

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
			
			MB.SubmitToBM().click();
			Thread.sleep(2000);
			
			//MB.CancelBtn2().click();		
		}

		@Test(priority = 5)
		public void BMLoginforMBForm21() throws InterruptedException, IOException {

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
		public void MBForm21ClaimProcessingBMLogin() throws InterruptedException {
			
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
				Thread.sleep(2000);
				MB.RemarksTxtBx2().sendKeys("Test Test");
		
		//		MB.BMApproveBtn().click();
				MB.BMRejectBtn().click();
				Thread.sleep(2000);
				
				//MB.CancelBtn2().click();	
	}

	

}
