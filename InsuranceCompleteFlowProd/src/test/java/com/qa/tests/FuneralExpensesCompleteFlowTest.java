package com.qa.tests;

import java.io.IOException;
import java.util.Iterator;
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
import com.qa.pages.FuneralExpenseClaimProcesssingPage;
import com.qa.pages.FunerellExpenseCreateClaimPage;
import com.qa.pages.LoginPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class FuneralExpensesCompleteFlowTest extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	DependentBenefitPage DBP;
	String ClaimId;
	FuneralExpenseClaimProcesssingPage FECP;
	String InsuranceNumber="1199900090";   //1115690653
	
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
	public void LoginForFuneralExpenses() throws InterruptedException, IOException  {
	

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
	public void UploadDeathCertificateforFuneralExpenses() throws InterruptedException {
		
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
			DBP.IpNoTxtBx().sendKeys(InsuranceNumber);
			Thread.sleep(1000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;

			js2.executeScript(
					"document.getElementById('ctl00_HomePageContent_deathdt').value='01/06/2021'");
			Thread.sleep(2000);
			
			DBP.CauseOfDeath().sendKeys("Test Test");
			DBP.CauseOfDeath().sendKeys("Test Test");
			DBP.MedicalOfficerName().sendKeys("Test");
			Thread.sleep(2000);
			JavascriptExecutor js3 = (JavascriptExecutor) driver;

			js3.executeScript(
					"document.getElementById('ctl00_HomePageContent_issuedt').value='01/06/2021'");
			Thread.sleep(2000);
			DBP.BrowseFile().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
			Thread.sleep(2000);
		//	DBP.SubmitBtn().click();
			Thread.sleep(2000);
			//DBP.ResetBtn().click();
			
}
	
	@Test(priority = 3)
	public void CreateClaimForFuneralExpenses() throws InterruptedException {

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
		benpg.InsureNumber().sendKeys(InsuranceNumber);//1115104238
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Funeral Expenses");
		Thread.sleep(2000);
		benpg.submit().click();
		Thread.sleep(2000);

	/*	Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();
		*/
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void FunerallExpenssClaim() throws InterruptedException {
		FunerellExpenseCreateClaimPage FuelExpens=new FunerellExpenseCreateClaimPage(driver);
		Thread.sleep(2000);
		FuelExpens.CreateAck().click();
		/*if(FuelExpens.CreateAck().isEnabled()==true){
        FuelExpens.CreateAck().click();
		}
		else{
		FuelExpens.TypeOfClaim().sendKeys("Funeral Expenses");
		}
*/		FuelExpens.TypeOfClaim().sendKeys("Funeral Expenses");
        Thread.sleep(2000);
     
		FuelExpens.Remark().sendKeys("test");
		FuelExpens.Remark().sendKeys("test");
		Thread.sleep(2000);
		
		FuelExpens.Genrate().click();
		Thread.sleep(2000);
		
		FuelExpens.Back().click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript(
				"document.getElementById('ctl00_HomePageContent_deathdt').value='01/06/2021'");
		Thread.sleep(2000);
		FuelExpens.IPDesignation().sendKeys("Tester");
		Thread.sleep(2000);
		FuelExpens.ClaimentName().sendKeys("testst");
		Thread.sleep(2000);
		FuelExpens.age().sendKeys("47");
		Thread.sleep(2000);
		FuelExpens.selectAck().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent_grvSelectAck_ctl02_chkSelectAck")).click();
		FuelExpens.RadioButton().click();
		Thread.sleep(2000);
		FuelExpens.Submit1().click();
		Thread.sleep(2000);
		FuelExpens.Browse().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");
		Thread.sleep(2000);
	//	FuelExpens.submit().click();
		
        driver.switchTo().alert().accept();
        
        ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimId);
		

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		
		FECP= new FuneralExpenseClaimProcesssingPage(driver);
		
		FECP.ProcessAClaim().click();
		
		FECP.FEClaimProcessingLink().click();
		
		driver.findElement(By.linkText(ClaimId)).click();
		
		FECP.NextBtn().click();
		
		FECP.NextBtn().click();
		
		FECP.RemarksTxtBx().sendKeys("Test Test");
		
		FECP.SubmitToBM().click();
	
	}
	
	@Test(priority = 5)
	public void BMLoginforFuneralExpenses() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("https://gateway.esic.in/InsuranceGlobalWebV15/Login/StaffLogin.aspx");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.xpath(".//*[@id='ddlRole']")).sendKeys("Branch Manager at Branch Office");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
	}
	
	@Test(priority = 6)
	public void FuneralExpensesBMLogin() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			
			FECP= new FuneralExpenseClaimProcesssingPage(driver);
			
			FECP.ProcessAClaim().click();
			
			FECP.FEClaimProcessingLink().click();
			
			driver.findElement(By.linkText(ClaimId)).click();
			
			FECP.NextBtn().click();
			
			FECP.NextBtn().click();
			
			FECP.RemarksTxtBx().sendKeys("Test Test");
			
		//	FECP.BMApproveBtn().click();
			
			FECP.BMRejectBtn().click();
		
	
}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String FuneralExpensesClaim= utilobj.getScreenshot(driver, "FuneralExpenses");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(FuneralExpensesClaim).build());
			//logger.addScreenCaptureFromPath("C:\\Users\\User\\workspace\\InsuranceCompleteFlowProd\\FailedTestsScreenshots\\Confinement20211109022929.png");

			extent.flush();
	
		}
	}

}
