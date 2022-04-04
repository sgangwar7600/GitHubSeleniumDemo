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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.BenifitsPage;
import com.qa.pages.ESBMed8CertificatePage;
import com.qa.pages.LoginPage;
import com.qa.pages.TDBAccidentCertificateUploadPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;

public class TDBAccidentCertificateUploadTest extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	TDBAccidentCertificateUploadPage TCAP;
	

	@BeforeTest
	public void LaunchURL() throws IOException {
		driver = Browserfactory.LaunchBrowser();

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);
		log.UserId().sendKeys(ReusableFunction.getValue("uid"));
		log.Login().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")),
				"BO-Ajmeri Gate");

		Thread.sleep(2000);

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
				"LDC/UDC at Branch Office");

		log.Login1().click();


		//For Production
/*			LoginPage log = new LoginPage(driver);
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
*/	}
	@Test(priority = 2)
	public void Benifits() throws InterruptedException {
	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			TCAP=new TDBAccidentCertificateUploadPage(driver);
			Thread.sleep(1000);
			TCAP.UploadCertificates().click();
			
			TCAP.UploadAccidentReport().click();
			
			TCAP.IPNoTxtBx().sendKeys("1199900090");//1115104055
			
			TCAP.SubmitBtn().click();
			
			//TCAP.EmployerCodeDrpDwn().sendKeys("11000000000000002");
			Thread.sleep(2000);
			TCAP.OccupationOfIp().sendKeys("Test");
			TCAP.OccupationOfIp().sendKeys("Test");
			
			TCAP.DepartmentTxtBx().sendKeys("Testing");
			
			TCAP.NextBtn().click();
			Thread.sleep(1000); 
	
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("document.getElementById('ctl00_HomePageContent_txtShiftStartDate').value='30/03/2019'");
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;

			js1.executeScript("document.getElementById('ctl00_HomePageContent_txtdateOfAccident').value='30/03/2019'");
			
			TCAP.PlaceOfAccident().sendKeys("Test");
			
			TCAP.ShiftHoursFrom().sendKeys("7");
			
			TCAP.ShiftHoursTo().sendKeys("5");
			
			TCAP.ToPMRadioBtn().click();
			
			TCAP.DayHourOfAccident().sendKeys("7");
			
			TCAP.TimeOfAccident().sendKeys("4");
			
			TCAP.TimeOfAccidentPMRadioBtn().click();
			
			TCAP.NatureOfInjury().sendKeys("Fracture");
			
			TCAP.LocationOfInjury().sendKeys("Hand");
			
			TCAP.AccidentAddress().sendKeys("Test");
			
			TCAP.DispensaryTxtBx().sendKeys("Test");
			
			TCAP.WitnessNameTxtBx().sendKeys("Witness 1");
			
			TCAP.WitnessAddressTxtBx().sendKeys("Address 1");
			
			TCAP.WitnessNameTxtBx2().sendKeys("Witness 2");
			
			TCAP.WitnessAddressTxtBx2().sendKeys("Address 2");
			Thread.sleep(2000);
			
			TCAP.NextBtn().click();
			
			TCAP.WorkBeingDoneTxtBx().sendKeys("Test");
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;

			js2.executeScript("document.getElementById('ctl00_HomePageContent_txtDateDispatch').value='30/03/2019'");
			
			TCAP.PersonSubmittingReport().sendKeys("Test");
			
			TCAP.OfficerDesignation().sendKeys("Test");
			
			//TCAP.RemarksTxtBx().sendKeys("Test Test");
			Thread.sleep(2000);
			TCAP.BriefDesc().sendKeys("Test Test Test");
			Thread.sleep(2000);
			TCAP.DeclarationChkBx().click();
			Thread.sleep(2000);
			TCAP.SubmitBtn().click();
			driver.switchTo().alert().accept();
		//	TCAP.FormCancelBtn().click();
		}
/*	 @AfterTest
	 public void closebrowser() {
	 driver.quit();
	 }
*/}
