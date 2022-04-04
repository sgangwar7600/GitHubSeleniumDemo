package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.LoginPage;
import com.qa.pages.SurveyPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class SurveyTest extends Browserfactory{
	Utility utilobj = new Utility();
	SoftAssert as =new SoftAssert();
	WebDriver driver;

	LoginPage log;
	SurveyPage SP;


	@Test(priority=1)
	public void LoginForSurvey() throws InterruptedException, IOException{

		driver = Browserfactory.LaunchBrowser();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		log=new LoginPage(driver);

		// log.doNavigateToLoginPage(ReusableFunction.getValue("uidd"));

		log.UserId().sendKeys(ReusableFunction.getValue("uid"));

		log.Login().click();

		log.roRajendraPalce().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")), "Dealing Assistant (Revenue)");

		log.Login1().click();

		//For Production

		/*	LoginPage log=new LoginPage(driver);

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

		 */	}



	@Test(priority=2)
	public void CreateSurveySourceRegister() throws InterruptedException, IOException{
		SP=new SurveyPage(driver);
		SP.Close().click();
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);

		//Create Survey Source Register
		SP.CreateSurveySourceRegister().click();
		Thread.sleep(2000);	
		SP.FactoryNameTxtBx().sendKeys("Test01");
		Thread.sleep(2000);
		SP.OwnerNameTxtBx().sendKeys("Owner test");
		Thread.sleep(2000);
		SP.UnitAddressTxtBx().sendKeys("Test Unit Address");
		Thread.sleep(2000);
		SP.OwnerAddressTxtBx().sendKeys("Owner test address");
		Thread.sleep(2000);
		SP.SourceDrpDwn().sendKeys("Provident Fund ");
		Thread.sleep(2000);
		SP.Remarks().sendKeys("Test");
		//SP.CreateSubmitBtn().click();
		//SP.OKBtn().click();
		Thread.sleep(2000);
		//SP.CancelSurveyBtn().click();

		Thread.sleep(2000);	}

	@Test(priority=3)
	public void EditSurveySourceRegister() throws InterruptedException, IOException{
		SP=new SurveyPage(driver);
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.EditSurveySourceRegister().click();
		SP.EditSurveyNumberTxtBx().sendKeys(ReusableFunction.getValue("EditSurveyNumber"));
		Thread.sleep(2000);	
		SP.EditSurveySearchBtn().click();
		Thread.sleep(2000);	
		SP.EditSurveyLink().click();
		Thread.sleep(2000);	
		SP.OwnerNameTxtBx().clear();
		Thread.sleep(2000);	
		SP.OwnerNameTxtBx().sendKeys("tyyt");
		Thread.sleep(2000);	
		//SP.CreateSubmitBtn().click();
		//SP.OKBtn().click();
		SP.CancelSurveyBtn().click();
	}

	//View Survey Source Register
	@Test(priority=4)
	public void ViewSurveySourceRegister() throws InterruptedException, IOException, AWTException{
		SP=new SurveyPage(driver);
		Thread.sleep(2000);
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.ViewSurveyReport().click();
		SP.SurveyNumberTxtBx().sendKeys(ReusableFunction.getValue("ViewSurveyNumber"));
		Thread.sleep(2000);	
		SP.SurveyNumberSearchBtn().click();
		Thread.sleep(2000);	
		SP.ViewSurveyLink().click();
		Thread.sleep(2000);	
		SP.ViewSurveyNextBtn().click();
		Thread.sleep(2000);	
		SP.ViewSurveyNextBtn().click();
		Thread.sleep(2000);	
		SP.ViewSurveyNextBtn().click();
		Thread.sleep(2000);	
		SP.ViewSurveyNextBtn().click();
		SP.ViewSurveyPrintBtn().click();

		Robot rb =new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		SP.ViewSurveyCancelBtn().click();
	}

	//View Periodic Survey Register
	@Test(priority=5)
	public void ViewPeriodicSurveyRegister() throws InterruptedException, IOException{
		SP=new SurveyPage(driver);
		Thread.sleep(2000);
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.ViewPeriodicSurveyRegister().click();
	}

	
	//View Observation Note
	@Test(priority=6)
	public void ViewObservationNote() throws InterruptedException, IOException{
		SP=new SurveyPage(driver);
		Thread.sleep(2000);
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.ViewObservationNote().click();
		SP.SurveyNumberTxtBx().sendKeys(ReusableFunction.getValue("ViewSurveyNumber"));
		Thread.sleep(2000);	
		SP.SurveyNumberSearchBtn().click();
		Thread.sleep(2000);	
		SP.ViewSurveyLink().click();
		Thread.sleep(2000);	
		SP.ViewObservationNextBtn().click();
		Thread.sleep(2000);	
		SP.ViewObservationCancelBtn().click();	
		}

	//Task Details
	@Test(priority=7)
	public void SurveyTaskDetails() throws InterruptedException, IOException{
		SP=new SurveyPage(driver);
		
		Thread.sleep(2000);
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.TaskDetails().click();
		Thread.sleep(2000);	
		SP.SurveyApprovalLink().click();
		Thread.sleep(2000);
		SP.RemarksTxtBx().sendKeys("Test");
		//SP.ApprovalForwardBtn().click();
		//Thread.sleep(2000);
		
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.TaskDetails().click();
		Thread.sleep(2000);	
		SP.Form01ApprovalLink().click();
		Thread.sleep(2000);
		SP.EmployerCodeTxtBx().sendKeys(ReusableFunction.getValue("EmployersCode"));
		Thread.sleep(2000);
		SP.SearchBtn().click();
		Thread.sleep(2000);
		SP.Form01EmployerLink().click();
		Thread.sleep(2000);
		
		SP.NextBtn().click();
		Thread.sleep(2000);	
	/*	SP.AccountNo().clear();
		SP.AccountNo().sendKeys("48978565");
		Thread.sleep(2000);
		SP.BankName().clear();
		SP.BankName().sendKeys("TEST");
		Thread.sleep(2000);
		SP.BranchName().clear();
		SP.BranchName().sendKeys("TEST");
		Thread.sleep(2000);	
		SP.MICRCode().clear();
		SP.MICRCode().sendKeys("7816628");
		Thread.sleep(2000);	
		SP.IFSCCode().clear();
		SP.IFSCCode().sendKeys("TR65262876781");
	*/	Thread.sleep(2000);	
	    SP.NextBtn().click();
		Thread.sleep(2000);	
		SP.NextBtn().click();
		Thread.sleep(2000);	
		SP.NextBtn().click();
		
		//SP.ForwardBtn().click();
	}


/*	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}*/


}
