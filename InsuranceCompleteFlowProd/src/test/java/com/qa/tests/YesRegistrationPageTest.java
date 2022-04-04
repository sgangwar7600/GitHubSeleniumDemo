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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class YesRegistrationPageTest extends Browserfactory {

	Utility utilobj = new Utility();
	SoftAssert as = new SoftAssert();
	WebDriver driver;
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
	public void LoginForYesRegistration() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//For Production

        	LoginPage log=new LoginPage(driver);

			log.username().sendKeys(ReusableFunction.getValue("uidd"));

			log.password().sendKeys(ReusableFunction.getValue("pwd"));
            Thread.sleep(2000);
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

			Thread.sleep(2000);

			log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Dealing Assistant (Registration)");
			Thread.sleep(2000);
			log.buttonsubmit().click();
	}

	@Test(priority = 2)
	public void Register() throws InterruptedException {
		
			RegistrationPage Reg = new RegistrationPage(driver);

			Reg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			
			// Reg.registr().click();

			Reg.RegisterNewEmployee().click();
			Thread.sleep(5000);
		//	Reg.EmployerCode().sendKeys("11001183010001018");
			Reg.EmployerCode().sendKeys("11000000000000003");//For Production
			Thread.sleep(2000);
			logger.pass("EmployerCode");
			Reg.RegistrationYesRadioBtn().click();
			Thread.sleep(2000);
			/*Alert alert = driver.switchTo().alert();

			String alertMessage = driver.switchTo().alert().getText();

			System.out.println(alertMessage);

			alert.accept();

			Thread.sleep(2000);
*/
			
   	//    Reg.InsuranceNoTxtBx().sendKeys("1115104253");
        Reg.InsuranceNoTxtBx().sendKeys("1100000034");//For Production
    	Thread.sleep(2000);
		Reg.DateOfAppointment().click();
		Thread.sleep(2000);
		Reg.DateOfAppointmentPreviousArrow().click();
		Thread.sleep(2000);
		Reg.SelectDateOfAppointment().click();
		Thread.sleep(2000);
		Reg.AgreeButton().click();
		Thread.sleep(2000);
		utilobj.JSClick(Reg.ContinueBtn(), driver);
		Thread.sleep(2000);
	/*	Reg.ContinueBtn().click();
		Thread.sleep(2000);
	*/	
/*
		Alert alert1 = driver.switchTo().alert();

		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();
			 */}

		
	

		@Test(priority = 3)
	public void RegisterForm1() throws InterruptedException {
     // Insured Person's Particulars
		RegistrationPage Reg = new RegistrationPage(driver);
		String Parent1 = driver.getWindowHandle();
		 Reg.NameRadioBtn().click();
         Thread.sleep(2000);
		Set<String> s2 = driver.getWindowHandles();

		Iterator<String> I2 = s2.iterator();

		while (I2.hasNext()) {

			String Child_window2 = I2.next();

			if (!Parent1.equals(Child_window2)) {

				driver.switchTo().window(Child_window2).getTitle();

				System.out.println(driver.switchTo().window(Child_window2).getTitle());

			}
		}

        
         Reg.UserNameTxtBx().sendKeys("Test");
         Thread.sleep(2000);
         Reg.RelationShipWithIp().sendKeys("Spouse");
         Reg.RelationShipWithIp().sendKeys("Spouse");
         Thread.sleep(2000);
         Reg.IpAddress().clear();
         Reg.IpAddress().sendKeys("Bengal");
         Thread.sleep(2000);
         Reg.StateDrpDwn().sendKeys("West Bengal");
         Reg.StateDrpDwn().sendKeys("West Bengal");
         Thread.sleep(2000);
         Reg.DistrictDrpDwn().sendKeys("Darjeeling");
         Thread.sleep(2000);
         Reg.DistrictDrpDwn().sendKeys("Darjeeling");
         Thread.sleep(2000);
         Reg.PinCode().sendKeys("101010");
         Thread.sleep(2000);
         Reg.DeclarationCheckBox().click();
         Thread.sleep(2000);
       //  Reg.UpdateBtn().click();
         Thread.sleep(2000);
         Reg.CloseBtn().click();
         Thread.sleep(5000);
         
         driver.switchTo().window(Parent1);
         Thread.sleep(5000);
       
 		String Parent2 = driver.getWindowHandle();
 		 Reg.PersonalDetailsRadioBtn().click();
          Thread.sleep(2000);
 		Set<String> s3 = driver.getWindowHandles();

 		Iterator<String> I3 = s3.iterator();

 		while (I3.hasNext()) {

 			String Child_window2 = I3.next();

 			if (!Parent2.equals(Child_window2)) {

 				driver.switchTo().window(Child_window2).getTitle();

 				System.out.println(driver.switchTo().window(Child_window2).getTitle());

 			}
 		}
    //    Reg.DateOfBirth().click();
        Thread.sleep(2000);
      //  Reg.SelectDateOfBirth().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('ctrlTxtIpDate').value='01/06/2000'");
        Thread.sleep(2000);
        Reg.FatherName().clear();
        Reg.FatherName().sendKeys("AK M");
        Thread.sleep(2000);
        Reg.MaritalStatusDrpDwn().sendKeys("Unmarried");
        Thread.sleep(2000);
        Reg.GenderRadioBtn().click();
        Thread.sleep(2000);
        Reg.perDeclarationChkBx().click();
        Thread.sleep(2000);
      //  Reg.perUpdateBtn().click();
        Thread.sleep(2000);
        Reg.perCancelBtn().click();
         
        driver.switchTo().window(Parent2);
        Thread.sleep(5000);
        
       String Parent3 = driver.getWindowHandle();
		 Reg.AddressDetailsRadioBtn().click();
         Thread.sleep(2000);
		Set<String> s4 = driver.getWindowHandles();

		Iterator<String> I4 = s4.iterator();

		while (I4.hasNext()) {

			String Child_window2 = I4.next();

			if (!Parent3.equals(Child_window2)) {

				driver.switchTo().window(Child_window2).getTitle();

				System.out.println(driver.switchTo().window(Child_window2).getTitle());

			}
		}

		Reg.AddressTextBox().clear();
		   Thread.sleep(2000);
		Reg.AddressTextBox().sendKeys("New Road");
		   Thread.sleep(2000);
		Reg.PinCodeTextBox().clear();
		   Thread.sleep(2000);
		Reg.PinCodeTextBox().sendKeys("101010");
		   Thread.sleep(2000);
		Reg.StateTextBox().sendKeys("Delhi");
		   Thread.sleep(5000);
	/*	Reg.MobileNoEditButton().click();
		Reg.MobileNoEditButton().click();
		   Thread.sleep(2000);
		Reg.MobileNoTextBox().sendKeys("8979610055");
		   Thread.sleep(2000);
		Reg.ValidateMobileNoLink().click();
		  Thread.sleep(2000);
		Reg.ValidateMobileNoProceed().click();
		 Thread.sleep(2000);
	*/	 // Thread.sleep(3000);
		   Reg.DistrictTextBox().sendKeys("Central Delhi");
		   Thread.sleep(2000);
		   Reg.DistrictTextBox().sendKeys("Central Delhi");
		   Thread.sleep(2000);
		Reg.PresentAddressAsPermntCheckBox().click();
		   Thread.sleep(2000);
		Reg.AddressDeclarationCheckBox().click();
		   Thread.sleep(2000);
	    //Reg.UpdateFamilyDetailsBtn().click();
	    Thread.sleep(2000);
		Reg.AddressCloseBtn().click();
		   driver.switchTo().window(Parent3);
	        Thread.sleep(5000);
	
	}

	@Test(priority = 4)
	public void DetailsOfNomnee() throws InterruptedException {
		// Details of Nominee

		
		RegistrationPage Reg = new RegistrationPage(driver);
		
		String Parent1 = driver.getWindowHandle();
		Reg.NomineeDetailsRadioBtn().click();
		 Thread.sleep(2000);
		Set<String> s2 = driver.getWindowHandles();

		Iterator<String> I2 = s2.iterator();

		while (I2.hasNext()) {

			String Child_window2 = I2.next();

			if (!Parent1.equals(Child_window2)) {

				driver.switchTo().window(Child_window2).getTitle();

				System.out.println(driver.switchTo().window(Child_window2).getTitle());

			}
		}

        
         Reg.UserNameTxtBx().sendKeys("Test");
         Thread.sleep(2000);
         Reg.RelationShipWithIp().sendKeys("Brother");
         Thread.sleep(2000);
         Reg.IpAddress().clear();
         Reg.IpAddress().sendKeys("Bengal");
         Thread.sleep(2000);
         Reg.StateDrpDwn().sendKeys("West Bengal");
         Thread.sleep(2000);
         Reg.DistrictDrpDwn().sendKeys("Darjeeling");
         Thread.sleep(2000);

         Reg.DistrictDrpDwn().sendKeys("Darjeeling");
         Thread.sleep(2000);

         Reg.PinCode().sendKeys("101010");
         Thread.sleep(2000);
         Reg.DeclarationCheckBox().click();
         Thread.sleep(2000);
        // Reg.UpdateBtn().click();
         Thread.sleep(2000);
         Reg.CloseBtn().click();
         Thread.sleep(5000);
         
         driver.switchTo().window(Parent1);
         Thread.sleep(5000);
		
	
	}

	@Test(priority = 5)
	public void FamilyInsuredPerson() throws InterruptedException {

		RegistrationPage Reg = new RegistrationPage(driver);

		// Family Particulars of InsuredPerson
		Reg.FamilyDetailsRadioBtn().click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());

			String Parent1 = driver.getWindowHandle();

			Set<String> s2 = driver.getWindowHandles();

			Iterator<String> I2 = s2.iterator();

			while (I2.hasNext()) {

				String Child_window2 = I2.next();

				if (!Parent1.equals(Child_window2)) {

					driver.switchTo().window(Child_window2).getTitle();

					System.out.println(driver.switchTo().window(Child_window2).getTitle());

				}
			}
			Reg.FamilyDetailsNameTxtBx().sendKeys("test wife");
			Thread.sleep(2000);
			Reg.FamilyDetailsDOB().click();
			Thread.sleep(2000);
			Reg.FamilyDetailsSelectTitle().click();
			Thread.sleep(1000);
			Reg.FamilyDetailsSelectTitle().click();
			Thread.sleep(1000);
			Reg.FamilyDetailsPreviosBtn().click();
			Thread.sleep(1000);
			Reg.FamilyDetailsPreviosBtn().click();
			Thread.sleep(1000);
			Reg.FamilyDetailsSelectYear().click();
			Thread.sleep(1000);
			Reg.FamilyDetailsSelectMonth().click();
			Thread.sleep(1000);
			Reg.FamilyDetailsSelectDay().click();
			Thread.sleep(2000);
			Reg.FamilyDetailsRelationDrpDwn().sendKeys("Spouse");
			Thread.sleep(2000);
			Reg.FamilyDetailsNoRadioBtn().click();
			Thread.sleep(2000);
			Reg.FamilyDetailsPermanentStateDrpDwn().sendKeys("Madhya Pradesh");
			Thread.sleep(3000);
			Reg.FamilyDetailsPermanentDistrictDrpDwn().sendKeys("Damoh");
			Thread.sleep(2000);
			Reg.FamilyDetailsPermanentDistrictDrpDwn().sendKeys("Damoh");
			Thread.sleep(2000);
			// Reg.AddButton().click();
			// Thread.sleep(2000);
			Reg.close().click();
			//Reg.Submit().click();

			Thread.sleep(1000);

			driver.switchTo().window(Parent1);
			Thread.sleep(5000);
}

	

	@Test(priority = 6)
	public void DetailsofBankAccountsofInsuredPerson() throws InterruptedException {

		RegistrationPage Reg = new RegistrationPage(driver);
		// Details of Bank Accounts of Insured Person

		Reg.BankDetailsRadioBtn().click();

		System.out.println(driver.getTitle());

		String Parent3 = driver.getWindowHandle();

		Set<String> s3 = driver.getWindowHandles();

		Iterator<String> I3 = s3.iterator();

		while (I3.hasNext()) {

			String Child_window3 = I3.next();

			if (!Parent3.equals(Child_window3)) {

				driver.switchTo().window(Child_window3).getTitle();

				System.out.println(driver.switchTo().window(Child_window3).getTitle());

			}
		}
		Thread.sleep(3000);
		Reg.IFSCcodeTextBox().sendKeys("UBIN0561258");

		Reg.IFSCcodeSeasrchBtn().click();

		Thread.sleep(3000);

		Reg.AccountNoTextBox().sendKeys("1234009871243674");

		Thread.sleep(2000);

		Reg.AccountTypeDrpDwn().sendKeys("Savings");;

		Reg.BankDetailsSubmitBtn().click();
		Thread.sleep(2000);
		Reg.BankDetailsCancelBtn().click();

		driver.switchTo().window(Parent3);

        Thread.sleep(2000);

	//	Reg.termscondition().click();

	//	Reg.submit().click();
}


/*	@AfterTest
	
	public void closeBrowser() {
		driver.quit();
	}
	 */
   @AfterMethod
   public void tearDown(ITestResult result) throws IOException{
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
		 String YesReg= utilobj. getScreenshot(driver, "Yes Registration");
		 logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(YesReg).build());
	   }
   }

}
