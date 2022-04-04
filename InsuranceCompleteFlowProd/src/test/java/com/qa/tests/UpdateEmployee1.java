package com.qa.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.pages.UpdateEmployee;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class UpdateEmployee1 extends Browserfactory {

	Utility utilobj = new Utility();
	SoftAssert as = new SoftAssert();
	WebDriver driver;

	@BeforeTest
	public void LaunchURL() throws IOException {
		driver = Browserfactory.LaunchBrowser();

	}

	@Test(priority = 1)
	public void LoginforUpdateEmployerDetails() throws InterruptedException, IOException {

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage log = new LoginPage(driver);
		Thread.sleep(5000);

		log.UserId().sendKeys(ReusableFunction.getValue("uid"));

		log.Login().click();

		log.roRajendraPalce().click();

		log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")),
				"Dealing Assistant (Registration)");

		log.Login1().click();

		as.assertEquals(driver.getTitle(), "Insurance");
		 		
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
	*/}

	@Test(priority = 2)
	public void UpdateRegister() throws InterruptedException {

		RegistrationPage Reg = new RegistrationPage(driver);

		Reg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// update employee Detail
		UpdateEmployee updtemp = new UpdateEmployee(driver);

		updtemp.UpdateEmployee().click();

		// ESIC Code Number Of Employer

		updtemp.ESICCodeNumberOfEmployer().sendKeys("11000000000000002");

		updtemp.Search().click();

		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlNatureOf_Work_InitiatedReq']")),
				"Name of Factory / Establishment");
		// update employee detail

		updtemp.Edit().click();

		// name of the Factory Estblishment

		updtemp.Nameofthe().clear();

		updtemp.Nameofthe().sendKeys("Delhi Electric testing Company&sons&father");

		Thread.sleep(5000);

		// Complete Postal Address of Factory/Establishment
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlNatureOf_Work_InitiatedReq']")),
				"Complete Postal Address of Factory/Establishment");

		updtemp.Edit().click();
		Thread.sleep(2000);
		// Complete Postal Address of Factory/Establishment

		updtemp.Address().clear();
		Thread.sleep(2000);
		updtemp.Address().sendKeys("500");
		Thread.sleep(2000);
		updtemp.Pincode().clear();
		Thread.sleep(2000);
		updtemp.Pincode().sendKeys("222222");
		Thread.sleep(2000);
		updtemp.State().sendKeys("Delhi");
		Thread.sleep(2000);
		updtemp.District().sendKeys("West Delhi");
		Thread.sleep(2000);
		updtemp.PoliceStation().clear();
		Thread.sleep(2000);
		updtemp.PoliceStation().sendKeys("Alwal");

		Thread.sleep(5000);

		// Constitution of Ownership
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlNatureOf_Work_InitiatedReq']")),
				"Constitution of Ownership");

		updtemp.Edit().click();
		Thread.sleep(2000);
		updtemp.ConstitutionOfOwnership().sendKeys("Central Govt. Controlled");


		Thread.sleep(5000);

		// Name / Address(s) of Present Proprietor / Managing Directors / Managing Partners / Secretary of the Co-operative Society
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlNatureOf_Work_InitiatedReq']")),
				"Name / Address(s) of Present Proprietor / Managing Directors / Managing Partners / Secretary of the Co-operative Society");

		updtemp.Edit().click();
		Thread.sleep(2000);
		updtemp.ProprietorDetails().click();
		String parent1 = driver.getWindowHandle();
		utilobj.Window(driver);

		updtemp.ProprietorDetails().click();

		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		updtemp.ProprietorDetailsRadioBtn().click();
		Thread.sleep(2000);
		updtemp.ProprietorDetailsDrpDwn().sendKeys("Partner");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsName().clear();
		updtemp.ProprietorDetailsName().sendKeys("Dummy");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsName().sendKeys("Dummy");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsAge().clear();
		updtemp.ProprietorDetailsAge().sendKeys("26");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsDesignation().clear();
		updtemp.ProprietorDetailsDesignation().sendKeys("Proprietor");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsFatherName().clear();
		updtemp.ProprietorDetailsFatherName().sendKeys("DummyFather");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsPresentAddress().clear();
		updtemp.ProprietorDetailsPresentAddress().sendKeys("Present Test");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsPermanentAddress().clear();
		updtemp.ProprietorDetailsPermanentAddress().sendKeys("Permanent Test");
		Thread.sleep(2000);
		updtemp.ProprietorDetailsSaveBtn().click();
		Thread.sleep(4000);
		updtemp.ProprietorDetailsCloseBtn().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent1);

		// Details of Bank Account(s)
		Thread.sleep(5000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlNatureOf_Work_InitiatedReq']")),
				"Details of Bank Account(s)");

		updtemp.Edit().click();
		Thread.sleep(2000);
		updtemp.AccountChkBox().click();
		Thread.sleep(2000);
		updtemp.AccountNoTxtBx().clear();
		updtemp.AccountNoTxtBx().sendKeys("123456789");
		Thread.sleep(2000);
		updtemp.NameOfBank().clear();
		updtemp.NameOfBank().sendKeys("Bank on India");
		Thread.sleep(2000);
		updtemp.NameOfBranch().clear();
		updtemp.NameOfBranch().sendKeys("West Delhi");
		Thread.sleep(2000);
		updtemp.MICRCodeOfBankBranch().clear();
		updtemp.MICRCodeOfBankBranch().sendKeys("12345");
		Thread.sleep(2000);
		updtemp.IFSCCodeOfBankBranch().clear();
		updtemp.IFSCCodeOfBankBranch().sendKeys("BOI00120");  

		// BO / ID
		Thread.sleep(5000);
		Reg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlNatureOf_Work_InitiatedReq']")),
				"BO / ID");

		updtemp.Edit().click();
		Thread.sleep(3000);
		updtemp.BranchOffice().sendKeys("BO - Ajmeri Gate (West Delhi)");
		Thread.sleep(2000);
		updtemp.InspectionDivision().sendKeys("ID - Inspection Area No 10 (West Delhi)");
		Thread.sleep(5000);
		//updtemp.submit().click();

		updtemp.CancelBtn().click();

		//		Alert alert = driver.switchTo().alert();
		//
		//		String alertMessage = driver.switchTo().alert().getText();
		//
		//		System.out.println(alertMessage);
		//
		//		alert.accept();

	}

/*	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	 */
	 
}
