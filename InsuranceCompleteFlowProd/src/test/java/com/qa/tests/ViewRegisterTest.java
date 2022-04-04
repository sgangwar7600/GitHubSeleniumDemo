package com.qa.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.pages.LoginPage;
import com.qa.pages.ViewRegisterPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class ViewRegisterTest extends Browserfactory{
	SoftAssert as =new SoftAssert();
	WebDriver driver;
	
	LoginPage log;
	ViewRegisterPage VRP;
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
	
	@Test(priority=1)
	public void LoginforViewRegister() throws InterruptedException, IOException{
	
		driver = Browserfactory.LaunchBrowser();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 log=new LoginPage(driver);
		
		  log.UserId().sendKeys(ReusableFunction.getValue("uid"));
		
	     log.Login().click();
		 
	     log.roRajendraPalce().click();
		   
	    log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")), "Dealing Assistant (Registration)");
		   
	    log.Login1().click();
	    
	    //For Production
	/*
		LoginPage log=new LoginPage(driver);
		
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
         
         log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Dealing Assistant (Registration)");
         
         log.buttonsubmit().click();
	
*/	}
	
	
	@Test(priority=2)
	public void ViewEmployerMasterRegister() throws InterruptedException, IOException{
		VRP=new ViewRegisterPage(driver);
		VRP.doNavigateToViewEmployerMasterRegister(ReusableFunction.getValue("EmployersCode"));
		//VRP.doNavigateToViewWatchOverRegister(ReusableFunction.getValue("EmployersCode"));

	}
	
	
	 @Test(priority=3)
	public void ViewC11() throws InterruptedException, IOException{
		VRP=new ViewRegisterPage(driver);
		VRP.doNavigateToViewC11(ReusableFunction.getValue("EmployersCode"));
	}

	 
	@Test(priority=4)
	public void ViewWatchOverRegister() throws InterruptedException, IOException{
		VRP=new ViewRegisterPage(driver);
		VRP.doNavigateToViewWatchOverRegister(ReusableFunction.getValue("EmployersCode"));
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	 
	
	  @AfterMethod
	   public void tearDown(ITestResult result){
		   if(result.getStatus()==ITestResult.FAILURE)
		   {
			 String ViewReg= utilobj.getScreenshot(driver, "View Register");
			// logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFramePath(YesReg).build());
		   }
	   }
}
