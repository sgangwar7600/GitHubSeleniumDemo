package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.LoginPage;
import com.qa.pages.SurveyPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class SurveyCompleteFlow extends Browserfactory{
	Utility utilobj = new Utility();
	SoftAssert as =new SoftAssert();
	WebDriver driver;

	LoginPage log;
	SurveyPage SP;
	String SurveyNo;
	String SurveyNo2;

	@Test(priority=1)
	public void Login() throws InterruptedException, IOException{

		driver = Browserfactory.LaunchBrowser();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		log=new LoginPage(driver);

		// log.doNavigateToLoginPage(ReusableFunction.getValue("uidd"));

		log.UserId().sendKeys(ReusableFunction.getValue("uid"));

		log.Login().click();

		log.roRajendraPalce().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")), "Social Security Officer");

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

         log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Social Security Officer");

         log.buttonsubmit().click();  

		 */	}



	@Test(priority=2)
	public void Survey() throws InterruptedException, IOException{
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
		SP.InspectionDivisionDrpDwn().sendKeys("ID - Inspection Area No 10   ");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_txtDueDate').value='01/07/2021'");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_CtrlTxtRemindrdate').value='15/07/2021'");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_TextBox4').value='30/09/2021'");
		Thread.sleep(2000);
		SP.Remarks().sendKeys("Test");
		SP.CreateSubmitBtn().click();
	//	SP.OKBtn().click();
		Thread.sleep(2000);
	//	SP.CancelSurveyBtn().click();
		String strtext = driver.findElement(By.id("ctl00_HomePageContent_SuccessMsg")).getText();
		System.out.println(strtext);
		String strtextSurveyNo[] = strtext.split(" ");
		SurveyNo = strtextSurveyNo[9];
		System.out.println(SurveyNo);
		Thread.sleep(2000);


		
	}
	
	@Test(priority=3)
	public void EditSurveySourceRegister() throws InterruptedException, IOException{
		SP=new SurveyPage(driver);
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.EditSurveySourceRegister().click();
	    utilobj.JSEnterText(SP.EditSurveyNumberTxtBx(), driver, SurveyNo);
		Thread.sleep(2000);
		SP.EditSurveySearchBtn().click();
		Thread.sleep(2000);	
		SP.EditSurveyLink().click();
		Thread.sleep(2000);	
		SP.OwnerNameTxtBx().clear();
		Thread.sleep(2000);	
		SP.OwnerNameTxtBx().sendKeys("tyyt");
		Thread.sleep(2000);	
		SP.CreateSubmitBtn().click();
		//SP.OKBtn().click();
		//SP.CancelSurveyBtn().click();
		String strtext2 = driver.findElement(By.id("ctl00_HomePageContent_SuccessMsg")).getText();
		System.out.println(strtext2);
		String strtextSurveyNo2[] = strtext2.split(" ");
	    SurveyNo2 = strtextSurveyNo2[9];
		System.out.println(SurveyNo2);
		Thread.sleep(2000);
	}
	 

	@Test(priority=4)
	public void ScheduleSurvey() throws InterruptedException, IOException, AWTException{
		SP=new SurveyPage(driver);
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.ScheduleSurvey().click();
	//	SP.SurveyTextBox().sendKeys(SurveyNo2);
		utilobj.JSEnterText(SP.SurveyTextBox(), driver, SurveyNo2);
		Thread.sleep(1000);
		SP.SurveySearchBtn().click();
		Thread.sleep(2000);
		
     //	String parent5 = driver.getWindowHandle();
	//	utilobj.Window(driver);
		Thread.sleep(2000);
		SP.SurveyLink().click();
		Thread.sleep(2000);
//		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		
		
		
	//	System.out.println(driver.getTitle());
		utilobj.ActionClick(SP.StartDate(), driver);
		utilobj.JSEnterText(SP.StartDate(), driver, "15/09/2021");
		utilobj.JSEnterText(SP.EndDate(), driver, "30/09/2021");
	/*	JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementByxpath('.//*[@id='ctl00_HomePageContent1_CtrlTxtStrtDt']').value='15/09/2021'");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('.//*[@id='ctl00_HomePageContent1_CtrlTxtEndDt']').value='30/09/2021'");
*/
		Thread.sleep(4000);
		utilobj.scroolDown(driver);
		Thread.sleep(2000);
		SP.AdditionalInspector().sendKeys("Test Test Additional Inspector");
		SP.WindowRemarks().sendKeys("Testing Survey");
		Thread.sleep(2000);
		SP.WindowSubmit().click();
	//	driver.switchTo().window(parent5);

	}

	@Test(priority=5)
	public void CreateObservationNote() throws InterruptedException, IOException{
		SP=new SurveyPage(driver);
	//	SP.Close().click();
		utilobj.MoveElement(SP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(SP.Survey(), driver);
		Thread.sleep(2000);	
		SP.CreateObservationNote().click();
		Thread.sleep(1000);
	//	SP.ObservationSurveyTextBox().sendKeys(SurveyNo2);
		utilobj.JSEnterText(SP.ObservationSurveyTextBox(), driver, SurveyNo2);

		Thread.sleep(1000);
		SP.ObservationSubmitBtn().click();
		Thread.sleep(1000);
		SP.ObservationSurveyLink().click();
		Thread.sleep(1000);
		SP.CreateObservationNoteLink().click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("document.getElementById('ctl00_HomePageContent_CtrlLblInspCovPrdFrom').value='15/09/2021'");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_CtrlLblInspCovPrdTo').value='30/09/2021'");

		SP.PrincipalEmployer().sendKeys("Principal Test");
		Thread.sleep(2000);
		SP.PersonContactedForSurvey().sendKeys("Survey Test Contacted Person");
		Thread.sleep(2000);
		SP.NextButton().click();
		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript("document.getElementById('ctl00_HomePageContent_txtvisdate').value='15/09/2021'");
		SP.NoOfEmployees().sendKeys("25");
		JavascriptExecutor js4 = (JavascriptExecutor) driver;

		js4.executeScript("document.getElementById('ctl00_HomePageContent_txtdate').value='15/09/2021'");

		JavascriptExecutor js5 = (JavascriptExecutor) driver;

		js5.executeScript("document.getElementById('ctl00_HomePageContent_txtsinsceDate').value='15/09/2020'");

		SP.NatureOfBusinessDrpDwn().sendKeys("Miscellaneous");	
		Thread.sleep(2000);
		SP.CategoryOfBusinessDrpDwn().sendKeys("Software Development");
		SP.CategoryOfBusinessDrpDwn().sendKeys("Software Development");

		JavascriptExecutor js6 = (JavascriptExecutor) driver;

		js6.executeScript("document.getElementById('ctl00_HomePageContent_txtesteffectfrom').value='15/09/2020'");

		driver.findElement(By.id("ctl00_HomePageContent_fpanexure")).sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");  
		Thread.sleep(2000);
		SP.UploadBtn().click();
		Thread.sleep(2000);
		SP.SubmitBtn().click();
		Thread.sleep(2000);
		
		//Generate SurveyLink
		SP.GenerateSurveyLink().click();
		SP.StateDrpDwn().sendKeys("Delhi");
		SP.DistrictDrpDwn().sendKeys("New Delhi");
		SP.DistrictDrpDwn().sendKeys("New Delhi");
		Thread.sleep(2000);
		SP.PoliceStation().sendKeys("Police Test");
		SP.PinCode().sendKeys("110002");
		SP.MobileNo().sendKeys("9876543219");
		SP.EmailId().sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		SP.ChkBx().click();
		Thread.sleep(2000);
		SP.NameOfTown().sendKeys("Town Test");
		SP.NameOfTaluk().sendKeys("Taluk Test");
		SP.Municipality().sendKeys("Municipality test");
		SP.HudbastNo().sendKeys("Test");
		Thread.sleep(2000);
		SP.ButtonNext().click();
		Thread.sleep(2000);
		SP.TypeOfOwnership().sendKeys("Proprietory Firms");
		Thread.sleep(2000);
		SP.FatherName().sendKeys("Father Test");
		SP.Address1().sendKeys("Test Address");
		SP.OwnerState().sendKeys("Delhi");
		
		SP.OwnerDistrict().sendKeys("East Delhi");
		Thread.sleep(2000);
		SP.OwnerDistrict().sendKeys("East Delhi");

		SP.OwnerPincode().sendKeys("110002");
		SP.OwnerMobileNo().sendKeys("9876543210");
		SP.ManagerName().sendKeys("Manager Test");

		JavascriptExecutor js7 = (JavascriptExecutor) driver;

		js7.executeScript("document.getElementById('ctl00_HomePageContent_txtStrtDteOfFactory').value='15/04/2015'");
        SP.RegisteredUnderFactoryAxtChkbx().click();
        Thread.sleep(2000);
        SP.RegistrationNo().sendKeys("007006005");
        JavascriptExecutor js8 = (JavascriptExecutor) driver;

		js8.executeScript("document.getElementById('ctl00_HomePageContent_txtDate').value='15/04/2015'");
		  Thread.sleep(2000);
       SP.NoRadioBtn().click();
       SP.NotDisclosedRadioBtn().click();
       Thread.sleep(2000);
       SP.ButtonNext().click();
       
       //Labor Details
       
		

	}
	
	
}
