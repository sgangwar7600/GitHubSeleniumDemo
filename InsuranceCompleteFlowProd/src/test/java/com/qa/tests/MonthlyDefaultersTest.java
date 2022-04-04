package com.qa.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.pages.ActionOnDefaulterPage;
import com.qa.pages.LoginPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class MonthlyDefaultersTest extends Browserfactory {
	SoftAssert as = new SoftAssert();
	WebDriver driver;
	String ClaimId;
	ActionOnDefaulterPage AOD;
	
	Utility utilobj = new Utility();
	ExtentReports extent;
	ExtentTest logger;
	String EmployersCode="11000000000000002";

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
	public void Login() throws InterruptedException, IOException  {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);
		log.UserId().sendKeys(ReusableFunction.getValue("uid"));
		log.Login().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")),
				"RO-Rajendra Place");

		Thread.sleep(2000);

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
				"Dealing Assistant (Revenue)");

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

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlLocation']")), "RO-Rajendra Place");

		Thread.sleep(1000);

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Dealing Assistant (Revenue)");

		log.buttonsubmit().click();

		as.assertEquals(driver.getTitle(), "Insurance");
*/
	}
	
	@Test(priority = 2) 
	public void MonthlyDefaultersD1Letter() {
	try{	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			ActionOnDefaulterPage AOD=new ActionOnDefaulterPage(driver);
			AOD.Close().click();
			utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			Thread.sleep(2000);	
			//Monthly Defaulter
			AOD.MonthlyDefaulters().click();
			System.out.println("Monthly Defaulter");
			Thread.sleep(2000);	
			AOD.EmployerCodeRadioBtn().click();
			Thread.sleep(2000);	
			AOD.FromEmployerCodeTxtBx().sendKeys(ReusableFunction.getValue("FromEmployerCode"));
			Thread.sleep(2000);	
			AOD.ToEmployerCodeTxtBx().sendKeys(ReusableFunction.getValue("ToEmployerCode"));
			Thread.sleep(2000);	
			AOD.EmployerCodeSearchBtn().click();
			Thread.sleep(3000);	
		//	AOD.MonthlyDefaultersLink().click();
			driver.findElement(By.linkText(EmployersCode)).click();
			Thread.sleep(2000);	
			AOD.MonthlyDefaultersAction().sendKeys("D1");
			Thread.sleep(2000);	
			AOD.MonthlyDefaultersRemarks().sendKeys("Test");
			Thread.sleep(2000);
			AOD.MonthlyDefaultersSubmitBtn().click();
			
			String parent01 = driver.getWindowHandle();
           utilobj.Window(driver);

           AOD.CreateC18LetterLink().click();
			
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			driver.findElement(By.id("ctl00_HomePageContent1_Editor1_ctl01_ctl00")).click();
		    utilobj.scroolDown(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/p[5]/font/strong[2]")).sendKeys("Test Test");
			Thread.sleep(2000);
			utilobj.JSClick(AOD.LetterSubmitBtn(), driver);
			Thread.sleep(4000);
			//utilobj.JSClick(AOD.LetterCancelBtn(), driver);
			Thread.sleep(2000);
			driver.switchTo().window(parent01);
			Thread.sleep(2000);
			AOD.CommonNoticeSubmitBtn().click();
		//	AOD.CommonNoticeCancelBtn().click();
			Thread.sleep(2000);	
		
	}
		
		catch (Exception ex) {
			Assert.fail();
			System.err.println(ex);
		}
	}
	
/*	@Test(priority = 3) 
	public void MonthlyDefaultersD2Letter() {
	try{	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			ActionOnDefaulterPage AOD=new ActionOnDefaulterPage(driver);
			AOD.Close().click();
			utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			Thread.sleep(2000);	
			//Monthly Defaulter
			AOD.MonthlyDefaulters().click();
			System.out.println("Monthly Defaulter");
			Thread.sleep(2000);	
			AOD.EmployerCodeRadioBtn().click();
			Thread.sleep(2000);	
			AOD.FromEmployerCodeTxtBx().sendKeys(ReusableFunction.getValue("FromEmployerCode"));
			Thread.sleep(2000);	
			AOD.ToEmployerCodeTxtBx().sendKeys(ReusableFunction.getValue("ToEmployerCode"));
			Thread.sleep(2000);	
			AOD.EmployerCodeSearchBtn().click();
			Thread.sleep(3000);	
		//	AOD.MonthlyDefaultersLink().click();
			driver.findElement(By.linkText(EmployersCode)).click();
			Thread.sleep(2000);	
			AOD.MonthlyDefaultersAction().sendKeys("D2");
			Thread.sleep(2000);	
			AOD.MonthlyDefaultersRemarks().sendKeys("Test");
			Thread.sleep(2000);
			AOD.MonthlyDefaultersSubmitBtn().click();
			
			String parent01 = driver.getWindowHandle();
           utilobj.Window(driver);

           AOD.CreateC18LetterLink().click();
			
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			utilobj.JSClick(AOD.LetterSubmitBtn(), driver);
			Thread.sleep(4000);
			 utilobj.scroolDown(driver);
		    Thread.sleep(2000);
			//utilobj.JSClick(AOD.LetterCancelBtn(), driver);
			Thread.sleep(2000);
			driver.switchTo().window(parent01);
			
			AOD.CommonNoticeSubmitBtn().click();
		//	AOD.CommonNoticeCancelBtn().click();
			Thread.sleep(2000);	
		
	}
		
		catch (Exception ex) {
			Assert.fail();
			System.err.println(ex);
		}
		
	
	}*/


	@Test(priority = 2) 
	public void MonthlyDefaultersD3Letter() {
	try{	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			ActionOnDefaulterPage AOD=new ActionOnDefaulterPage(driver);
			AOD.Close().click();
			utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			Thread.sleep(2000);	
			//Monthly Defaulter
			AOD.MonthlyDefaulters().click();
			System.out.println("Monthly Defaulter");
			Thread.sleep(2000);	
			AOD.EmployerCodeRadioBtn().click();
			Thread.sleep(2000);	
			AOD.FromEmployerCodeTxtBx().sendKeys(ReusableFunction.getValue("FromEmployerCode"));
			Thread.sleep(2000);	
			AOD.ToEmployerCodeTxtBx().sendKeys(ReusableFunction.getValue("ToEmployerCode"));
			Thread.sleep(2000);	
			AOD.EmployerCodeSearchBtn().click();
			Thread.sleep(3000);	
		//	AOD.MonthlyDefaultersLink().click();
			driver.findElement(By.linkText(EmployersCode)).click();
			Thread.sleep(2000);	
			AOD.MonthlyDefaultersAction().sendKeys("D3");
			Thread.sleep(2000);	
			AOD.MonthlyDefaultersRemarks().sendKeys("Test");
			Thread.sleep(2000);
			AOD.MonthlyDefaultersSubmitBtn().click();
			
			String parent01 = driver.getWindowHandle();
           utilobj.Window(driver);

           AOD.CreateC18LetterLink().click();
			
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			driver.findElement(By.id("ctl00_HomePageContent1_Editor1_ctl01_ctl00")).click();
		    utilobj.scroolDown(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/p[5]/font/strong[2]")).sendKeys("Test Test");
			Thread.sleep(2000);
			utilobj.JSClick(AOD.LetterSubmitBtn(), driver);
			Thread.sleep(4000);
			//utilobj.JSClick(AOD.LetterCancelBtn(), driver);
			Thread.sleep(2000);
			driver.switchTo().window(parent01);
			Thread.sleep(2000);
			AOD.CommonNoticeSubmitBtn().click();
		//	AOD.CommonNoticeCancelBtn().click();
			Thread.sleep(2000);	
		
	}
		
		catch (Exception ex) {
			Assert.fail();
			System.err.println(ex);
		}
	}
}
