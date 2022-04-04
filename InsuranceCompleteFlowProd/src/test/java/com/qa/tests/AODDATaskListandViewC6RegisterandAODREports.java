package com.qa.tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class AODDATaskListandViewC6RegisterandAODREports extends Browserfactory {
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
	public void LoginforAOD() throws InterruptedException, IOException  {
	
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
	public void DealingAssistantTaskList() {
		try{
			//Dealing Assistant Task List
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			AOD=new ActionOnDefaulterPage(driver);
			AOD.Close().click();
			utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			Thread.sleep(2000);	
			AOD.DealingAssistantTaskList().click();
			System.out.println("Dealing Assistant Task List");
			Thread.sleep(2000);	
			AOD.DealingEmployerCodeRadioBtn().click();
			Thread.sleep(2000);	
			AOD.DealingEmployerCodeTxtBx().sendKeys(EmployersCode);
			Thread.sleep(2000);	
			AOD.DealingEmployerCodeSearchBtn().click();
			Thread.sleep(3000);
		     utilobj.scroolDown(driver);
			Thread.sleep(5000);
			AOD.DealingAssistantCancelBtn().click();
		}
		catch (Exception ex) {
			Assert.fail();
			System.err.println(ex);
		}
	}
	
	@Test(priority = 3) 
	public void ViewC6Register() {
		try{
			//View C-6 Register
			AOD=new ActionOnDefaulterPage(driver);
			utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			Thread.sleep(2000);	
			AOD.ViewC6Register().click();
			Thread.sleep(2000);	
			System.out.println("View C-6 Register");
			Thread.sleep(2000);	
			AOD.ViewC6EmployersCodeTxtBx().sendKeys(EmployersCode);
			Thread.sleep(2000);	
			AOD.ViewC6FromDate().click();
			Thread.sleep(2000);	
			AOD.SelectFromDatePreviousArrow().click();
			Thread.sleep(2000);	
			AOD.SelectFromDatePreviousArrow().click();
			Thread.sleep(2000);	
			AOD.SelectFromDatePreviousArrow().click();
			Thread.sleep(2000);	
			AOD.SelectFromDatePreviousArrow().click();
			AOD.SelectFromDate().click();
			Thread.sleep(2000);	
			AOD.ViewC6ToDate().click();
			Thread.sleep(2000);	
			AOD.SelectToDate().click();
			Thread.sleep(2000);	
			
			
			String parent4 = driver.getWindowHandle();
            utilobj.Window(driver);

            AOD.ViewC6PrintBtn().click();
			
			Thread.sleep(2000);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			 utilobj.scroolDown(driver);
		    Thread.sleep(2000);
			utilobj.JSClick(AOD.ViewC6CloseBtn(), driver);
			Thread.sleep(2000);
			driver.switchTo().window(parent4);
			Thread.sleep(2000);	

			
		}
		catch (Exception ex) {
			Assert.fail();
			System.err.println(ex);
		}

	}
	
	@Test(priority = 4) 
	public void DefaulterHistory() {
		try{
			//Defaulter History
			AOD=new ActionOnDefaulterPage(driver);
		    utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			
			Thread.sleep(2000);	
			AOD.DefaulterHistory().click();
			Thread.sleep(2000);	
			System.out.println("Defaulter History");
			AOD.HistoryEmployerCodeRadioBtn().click();
			Thread.sleep(2000);	
			AOD.HistoryEmployerCodeTxtBx().sendKeys(EmployersCode);
			Thread.sleep(2000);	
			AOD.HistoryEmployerCodeSearchBtn().click();
			Thread.sleep(2000);	
		/*	AOD.ViewLetterBtn().click();
			Thread.sleep(2000);

			 Robot rb1 =new Robot();
			
 			rb1.keyPress(KeyEvent.VK_DOWN);
 			
 			Thread.sleep(2000);
 			rb1.keyPress(KeyEvent.VK_ENTER);
 			
 			rb1.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(5000);
*/

			AOD.DefaulterActionCancelBtn().click();
		}
		catch (Exception ex) {
			Assert.fail();
			System.out.println(ex);
			//System.err.println(ex);
		}
	}

	@Test(priority = 5) 
	public void DropDefaulterRecords() {
	     try{
				//Drop Defaulter Record
	    	 AOD=new ActionOnDefaulterPage(driver);
			utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			Thread.sleep(2000);	
			AOD.DropDefaulterRecords().click();
			System.out.println("Drop Defaulter Record");
			Thread.sleep(2000);	
			AOD.DropDefaulterRecordsEmployerTxtBx().sendKeys(EmployersCode);
			Thread.sleep(2000);
			AOD.DropDefaulterRecordsTypeSelectDrpDwn().sendKeys("Defaulter Records");
			Thread.sleep(2000);
			AOD.DropDefaulterRecordsSubmitBtn().click();
			Thread.sleep(2000);
			AOD.DropDefaulterRecordsCheckBox().click();
			Thread.sleep(2000);
			AOD.DropDefaulterRecordsRemarksTxtBx().sendKeys("Test");
			Thread.sleep(2000);
			//AOD.DropDefaulterRecordsDropBtn().click();
			AOD.DropDefaulterRecordsCancelBtn().click();
			Thread.sleep(2000);
	        }
	     catch (Exception ex) {
	    	 Assert.fail();
				System.err.println(ex);
			}
		}
	
	@Test(priority = 6) 
	public void AODReports() {
		try{
			
			//AOD Reports
			ActionOnDefaulterPage AOD=new ActionOnDefaulterPage(driver);
			utilobj.MoveElement(AOD.Revenue(), driver);
			Thread.sleep(2000);	
			utilobj.MoveElement(AOD.ActionOnDefaulter(), driver);
			Thread.sleep(2000);	
			AOD.AODReports().click();
			System.out.println("AOD Reports");
			Thread.sleep(2000);	
			AOD.AODReportsRadioBtn1().click();
			Thread.sleep(2000);	
			AOD.AODReportsPDFBtn().click();
            Robot rb =new Robot();
			
 			rb.keyPress(KeyEvent.VK_DOWN);
 			
 			Thread.sleep(2000);
 			rb.keyPress(KeyEvent.VK_ENTER);
 			
 			rb.keyRelease(KeyEvent.VK_ENTER);
 			Thread.sleep(5000);

 			 Robot rb1 =new Robot();
 			
  			rb1.keyPress(KeyEvent.VK_DOWN);
  			
  			Thread.sleep(2000);
  			rb1.keyPress(KeyEvent.VK_ENTER);
  			
  			rb1.keyRelease(KeyEvent.VK_ENTER);
  			Thread.sleep(5000);

		}
		catch (Exception ex) {
			Assert.fail();
			System.err.println(ex);
		}
	}

}
