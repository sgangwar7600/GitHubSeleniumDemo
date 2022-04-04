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
import com.qa.pages.ConveyanceAllowanceClaimProcessingPage;
import com.qa.pages.ConvyanceAllowance;
import com.qa.pages.LoginPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class ConveyanceAllowanceCompleteFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	ConveyanceAllowanceClaimProcessingPage CACP;
	String ClaimId;
	String InsuranceNumber="1115828637";//1115828637, //1199900090, //1115885386
	
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
	public void LoginforConveyanceAllowance() throws InterruptedException, IOException  {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//For Production
		LoginPage log = new LoginPage(driver);

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
	public void ConveyanceAllowance() throws InterruptedException {

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
		benpg.InsureNumber().sendKeys(InsuranceNumber);
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Conveyance Allowance");
		Thread.sleep(2000);
		benpg.submit().click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void ConvyanceAllowanceCreateClaim() throws InterruptedException {

		ConvyanceAllowance Conallow = new ConvyanceAllowance(driver);

		Conallow.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_radMrMb']")),
				"Medical Board");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtRefdate').value='01/05/2021'");
		Thread.sleep(2000);
		Conallow.Next1().click();

		Thread.sleep(2000);

		Conallow.Employeecode().click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("document.getElementById('ctl00_HomePageContent_txtFrmDate').value='01/05/2021'");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtToDate').value='01/05/2021'");
		Thread.sleep(2000);
		Conallow.NumberDays().sendKeys("1");
		Thread.sleep(2000);
		Conallow.Time().click();
		Thread.sleep(2000);
		Conallow.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlTime']")), "10:00");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js3.executeScript("document.getElementById('ctl00_HomePageContent_txtEmpFrmDate').value='01/05/2021'");

		JavascriptExecutor js4 = (JavascriptExecutor) driver;

		js4.executeScript("document.getElementById('ctl00_HomePageContent_txtEmpToDate').value='01/05/2021'");
		Thread.sleep(2000);
		Conallow.Next2().click();
		Thread.sleep(2000);
		Conallow.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlMrDetails']")), "MR/MB");
		Thread.sleep(2000);
		Conallow.remark1().sendKeys("Test1");
		Thread.sleep(2000);
		Conallow.remark2().sendKeys("Test2");
		Thread.sleep(2000);
		Conallow.remark3().sendKeys("Test3");
		Thread.sleep(2000);
		Conallow.remrk4().sendKeys("Test4");
		Thread.sleep(2000);
		Conallow.remark5().sendKeys("Test5");
		Thread.sleep(2000);
		Conallow.next3().click();
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void ConvyanceAllowanceFillDetails() throws InterruptedException {

		ConvyanceAllowance Conallow = new ConvyanceAllowance(driver);
		Thread.sleep(3000);
		Conallow.StratTravel().sendKeys("Maiahr");
		Thread.sleep(2000);
		Conallow.Destinaion().sendKeys("Delhi");
		Thread.sleep(2000);
		Conallow.DistanceKms().sendKeys("700");
		Thread.sleep(2000);
		Conallow.journeyExpense().sendKeys("400");
		Thread.sleep(2000);
		Conallow.ReturnExpense().sendKeys("500");
		Thread.sleep(2000);
		Conallow.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_radTravelMode']")), "Train");
		Thread.sleep(2000);
		Conallow.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlTicketType']")),
				"Second Class");
		Thread.sleep(2000);
		Conallow.submit().click();

		//driver.switchTo().alert().accept();
		
		   
    	ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
    	System.out.println(ClaimId);
    	
    	WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		
		CACP= new ConveyanceAllowanceClaimProcessingPage(driver);
		
		CACP.ProcessAClaim().click();
		
		CACP.CAClaimProcessingLink().click();
		
		driver.findElement(By.linkText(ClaimId)).click();
		
		CACP.NextBtn().click();
		
	//	CACP.NextBtn().click(); //For Production
		Thread.sleep(2000);
		CACP.RemarksTxtBx().sendKeys("Test Test");
		
		CACP.SubmitToBM().click();
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
	
}

	@Test(priority = 5)
	public void BMLoginforConveyanceAllowance() throws InterruptedException, IOException {
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
	public void ConveyanceAllowanceClaimProcessingBM() throws InterruptedException {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();
			
			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			
			CACP= new ConveyanceAllowanceClaimProcessingPage(driver);
			
			CACP.ProcessAClaim().click();
			
			CACP.CAClaimProcessingLink().click();
			
			driver.findElement(By.linkText(ClaimId)).click();
			
			CACP.NextBtn().click();
			
	    //	CACP.NextBtn().click(); //For Production
			Thread.sleep(2000);
			CACP.RemarksTxtBx().sendKeys("Test Test");
			
			//Approve Btn
			driver.findElement(By.id("ctl00_HomePageContent_approve")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_HomePageContent_print")).click();
		//	driver.findElement(By.id("btnCancel")).click();		
}

	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String ConveyanceAllowance= utilobj.getScreenshot(driver, "ConveyanceAllowance");
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(ConveyanceAllowance).build());
		}
	}
}
