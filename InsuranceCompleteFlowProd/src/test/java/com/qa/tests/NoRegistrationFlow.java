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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.sun.xml.internal.txw2.Document;

public class NoRegistrationFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;


	@BeforeTest
	public void LaunchURL() throws IOException {
		driver = Browserfactory.LaunchBrowser();

	}

	@Test(priority = 1)
	public void LoginforNoRegistration() throws InterruptedException, IOException  {

		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);
	
		//For Production
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
		log.Login().click();

		log.roRajendraPalce().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
				"Dealing Assistant (Registration)");

		log.Login1().click();

		as.assertEquals(driver.getTitle(), "Insurance");

	}

	@Test(priority = 2)
	public void NoRegister() throws InterruptedException {

		RegistrationPage Reg = new RegistrationPage(driver);

		Reg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Reg.registr().click();

		Reg.RegisterNewEmployee().click();
	//	Reg.EmployerCode().sendKeys("11000000000000002");
		Reg.EmployerCode().sendKeys("11000000000000003");//For Production

		Reg.allottedESINumber().click();

		Alert alert = driver.switchTo().alert();

		String alertMessage = driver.switchTo().alert().getText();

		System.out.println(alertMessage);

		alert.accept();

		Thread.sleep(2000);

		Reg.MobileNumber().sendKeys("6268812240");
		Thread.sleep(5000);
		Reg.ValidateMobileNumber().click();

		Thread.sleep(3000);

		Reg.ContinueBtn().click();

		Alert alert1 = driver.switchTo().alert();

		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();
	}

	@Test(priority = 3)
	public void NoRegisterForm1() throws InterruptedException {
		// Insured Person's Particulars
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		RegistrationPage Reg = new RegistrationPage(driver);
		Thread.sleep(5000);
		Reg.Name().sendKeys("Test12");
		Thread.sleep(2000);
		Reg.Fathername().sendKeys("test");

		// Date of Birth
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_ctrlTxtIpDate').value='20/04/1994'");
		Thread.sleep(2000);
		Reg.Address().sendKeys("Maihar");
		Thread.sleep(2000);
		Reg.pincode().sendKeys("485771");
		Thread.sleep(2000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ctrlTxtPresentState']")),
				"Madhya Pradesh");
		Thread.sleep(2000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ctrlTextPresentDistrict']")),
				"Satna");
		// Copy Present Address to Permanent Address
		Thread.sleep(5000);
		Reg.CopyPresentAdderss().click();
		Thread.sleep(3000);
		/*Alert alert1 = driver.switchTo().alert();

		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();*/

		// Dispensary Or IMP or mEUD For IP

		Thread.sleep(7000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlDispensaryState']")),
				"Madhya Pradesh");

		Thread.sleep(8000);
		Reg.DispensaryDistrict().sendKeys("Bhopal");
		Thread.sleep(2000);
		Reg.DispensaryDistrict().sendKeys("Bhopal");
		//Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlDispensaryDistrict']")),
		//	"Bhopal");
		Thread.sleep(2000);

		Reg.Select_List(driver.findElement(By.id("ctl00_HomePageContent_ctrlTextDispensary")),
				"BHEL, Bhopal, MP (ESIS Disp.)");

		// Dispensary Or IMP or mEUD for Family Members:
		Thread.sleep(2000);
		Reg.DependantDispensaryState().sendKeys("Madhya Pradesh");
		/*Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddldependantDispensaryState']")),
				"Madhya PradeshThread.sleep(10000);*/
		Thread.sleep(2000);
		Reg.DependantDispensaryDistrict().sendKeys("Bhopal");
		Thread.sleep(2000);
		Reg.DependantDispensaryDistrict().sendKeys("Bhopal");
		/*Reg.Select_List(
				driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddldependantDispensaryDistrict']")),
				"Bhopal");*/
		Thread.sleep(5000);
		Reg.Select_List(driver.findElement(By.id("ctl00_HomePageContent_ddldependantdispensary")),
				"BHEL, Bhopal, MP (ESIS Disp.)");

		// Current Employer's Particulars
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;


		js1.executeScript("document.getElementById('ctl00_HomePageContent_ctrlDIDateOfAppointmentDy').value='01/07/2021'");

	}

	@Test(priority = 4)
	public void NoRegDetailsOfNomnee() throws InterruptedException {
		// Details of Nominee
		RegistrationPage Reg = new RegistrationPage(driver);

		Thread.sleep(10000);
		Reg.DetailsofNominee().click();

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

		Reg.NameOfNominee().sendKeys("qwerty");
		Thread.sleep(2000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_RelationShipWithIp']")),
				"Brother");

		Reg.NomineeAddress().sendKeys("Satna");
		Thread.sleep(2000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_States']")), "Delhi");
		Thread.sleep(2000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_Districts']")), "Central Delhi");
		Thread.sleep(2000);
		Reg.yes().click();
		Thread.sleep(2000);
		Reg.save().click();
		Thread.sleep(2000);
		Reg.Close1().click();

		driver.switchTo().window(Parent);

		Reg.FamilyParticularsofInsuredPerson().click();


	}

	@Test(priority = 4)
	public void NoRegFamilyInsuredPerson() throws InterruptedException {

		RegistrationPage Reg = new RegistrationPage(driver);
		Thread.sleep(5000);
		// Family Particulars of InsuredPerson
		Reg.FamilyParticularsofInsuredPerson().click();

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

		Reg.FamilyName().sendKeys("test wife");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('ctl00_HomePageContent_CtrlDOB').value='24/02/1999'");

		Thread.sleep(2000);

		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_CtrlRelation']")), "Spouse");

		// Reg.Residence().click();
		Thread.sleep(5000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ctrlTextPermanentState']")),
				"Madhya Pradesh");

		Thread.sleep(5000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ctrlTextPermanentDistrict']")),
				"Damoh");

		Reg.Submit().click();

		Thread.sleep(1000);

		Reg.Close2().click();

		driver.switchTo().window(Parent1);

		Thread.sleep(2000);

		Reg.DateOfAppointmentNo().click();
		Thread.sleep(2000);

		Reg.DateOfAppointmentPreviousArrowNo().click();
		Thread.sleep(2000);

		Reg.SelectDateOfAppointmentno().click();
		Thread.sleep(2000);
		Reg.NoAgreeBtn().click();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void NoRegDetailsofBankAccountsofInsuredPerson() throws InterruptedException {
		RegistrationPage Reg = new RegistrationPage(driver);
		// Details of Bank Accounts of Insured Person
		Thread.sleep(5000);
		Reg.DetailsofBankAccountsofInsuredPerson().click();

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

		Reg.IFSCCode().sendKeys("UBIN0561258");

		Reg.Search().click();

		Thread.sleep(3000);

		Reg.AccountNo().sendKeys("1234009871243674");

		Thread.sleep(2000);

		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlAccountType']")), "Savings");
		Thread.sleep(2000);
		Reg.submitButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(Parent3);

		Thread.sleep(2000);

		Reg.termscondition().click();

		Alert alert1 = driver.switchTo().alert();

		String alertMessage1 = driver.switchTo().alert().getText();

		System.out.println(alertMessage1);

		alert1.accept();
		Thread.sleep(2000);

		Reg.Select_List(driver.findElement(By.id("ctl00_HomePageContent_ctrlTextDispensary")),
				"BHEL, Bhopal, MP (ESIS Disp.)");

		// Dispensary Or IMP or mEUD for Family Members:
		Thread.sleep(9000);
		Reg.DependantDispensaryState().sendKeys("Madhya Pradesh");
		/*Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddldependantDispensaryState']")),
				"Madhya PradeshThread.sleep(10000);*/
		Thread.sleep(7000);
		Reg.DependantDispensaryDistrict().sendKeys("Bhopal");
		Thread.sleep(2000);
		Reg.DependantDispensaryDistrict().sendKeys("Bhopal");
		Thread.sleep(2000);
		Reg.Select_List(driver.findElement(By.id("ctl00_HomePageContent_ddldependantdispensary")),
				"BHEL, Bhopal, MP (ESIS Disp.)");
		Thread.sleep(4000);
		Reg.termscondition().click();
		Thread.sleep(2000);

		Alert alert2 = driver.switchTo().alert();

		String alertMessage2 = driver.switchTo().alert().getText();

		System.out.println(alertMessage2);

		alert2.accept();
		Thread.sleep(2000);
		Thread.sleep(2000);
		Reg.Select_List(driver.findElement(By.id("ctl00_HomePageContent_ddldependantdispensary")),
				"BHEL, Bhopal, MP (ESIS Disp.)");

		//	Reg.submit().click();	
	}
/*
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
*/
}
