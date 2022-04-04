package com.qa.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.EditEmployee;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class EditEmployee1 extends Browserfactory {

	Utility utilobj = new Utility();
	SoftAssert as = new SoftAssert();
	WebDriver driver;
	RegistrationPage Reg;
	EditEmployee EditEmp;

	@BeforeTest
	public void LaunchURL() throws IOException {
		driver = Browserfactory.LaunchBrowser();

	}

	@Test(priority = 1)
	public void LoginforEditEmployeeDetails() throws InterruptedException, IOException {
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
		 
		//log.UserId().sendKeys(ReusableFunction.getValue("uidd"));

		//For Production
	/*	LoginPage log = new LoginPage(driver);

		//log.UserId().sendKeys(ReusableFunction.getValue("uidd"));

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

		as.assertEquals(driver.getTitle(), "Insurance");
*/		
	}

	@Test(priority = 2)
	public void EditRegister() throws InterruptedException {

		Reg = new RegistrationPage(driver);

		Reg.Close().click();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun1']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		// Edit Employee Detail
		EditEmp = new EditEmployee(driver);

		EditEmp.EditEmployee().click();
		Thread.sleep(2000);

		// Employee Insurance No
		//EditEmp.EmployeeInsuranceNo().sendKeys("1111111111");
	//	EditEmp.EmployeeInsuranceNo().sendKeys("1115104238");//For Production
		EditEmp.EmployeeInsuranceNo().sendKeys("1111111111");
		EditEmp.Serach().click();
		Thread.sleep(2000);

		EditEmp.radioButton().click();
		Thread.sleep(2000);

		EditEmp.Edit().click();
		Thread.sleep(2000);

		EditEmp.NameDispensaryDetails().click();

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

		EditEmp.Name().clear();

		Thread.sleep(2000);

		EditEmp.Name().sendKeys("TEST19");
		Thread.sleep(3000);
		EditEmp.EditDeclarationCheckBox().click();
		Thread.sleep(2000);
		EditEmp.EditDeclarationCheckBox().click();
		Thread.sleep(2000);
		EditEmp.updateButton().click();
		Thread.sleep(2000);
	//	EditEmp.perCancelBtn().click();

		Thread.sleep(2000);

		driver.switchTo().window(Parent);

		Thread.sleep(2000);
	}
	//Personal Details
	@Test(priority = 3)	 
	public void EditPersonalDetails() throws InterruptedException {
		 
			EditEmp = new EditEmployee(driver);
			Thread.sleep(2000);			
			String Parent2 = driver.getWindowHandle();
			Thread.sleep(2000);
			EditEmp.PersonalDetailsRadioBtn().click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			Set<String> s3 = driver.getWindowHandles();

			Iterator<String> I3 = s3.iterator();

			while (I3.hasNext()) {

				String Child_window2 = I3.next();

				if (!Parent2.equals(Child_window2)) {

					driver.switchTo().window(Child_window2).getTitle();

					System.out.println(driver.switchTo().window(Child_window2).getTitle());

				}
			}
			EditEmp.DateOfBirth().click();
			Thread.sleep(2000);
			EditEmp.SelectDateOfBirth().click();
			Thread.sleep(2000);
			EditEmp.FatherName().clear();
			EditEmp.FatherName().sendKeys("AK M");
			Thread.sleep(2000);
			EditEmp.MaritalStatusDrpDwn().sendKeys("Unmarried");
			Thread.sleep(2000);
			EditEmp.GenderRadioBtn().click();
			Thread.sleep(2000);
			EditEmp.perDeclarationChkBx().click();
			Thread.sleep(2000);
		    EditEmp.perUpdateBtn().click();
	//		EditEmp.perCancelBtn().click();

			driver.switchTo().window(Parent2);
			Thread.sleep(5000);
	
	}


	//Address Details
	@Test(priority = 4)
	public void EditAddressDetails() throws InterruptedException {
	
			EditEmp = new EditEmployee(driver);

			String Parent3 = driver.getWindowHandle();

			EditEmp.AddressDetailsRadioBtn().click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
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

			EditEmp.AddressTextBox().clear();
			Thread.sleep(2000);
			EditEmp.AddressTextBox().sendKeys("New Road");
			Thread.sleep(2000);
			EditEmp.PinCodeTextBox().clear();
			Thread.sleep(2000);
			EditEmp.PinCodeTextBox().sendKeys("101010");
			Thread.sleep(2000);
			EditEmp.StateTextBox().sendKeys("Delhi");
			/*			Thread.sleep(5000);
			EditEmp.MobileNoEditButton().click();
			Thread.sleep(2000);
			EditEmp.MobileNoTextBox().sendKeys("8979610055");
			Thread.sleep(2000);
			EditEmp.ValidateMobileNoLink().click();
			Thread.sleep(2000);
			EditEmp.ValidateMobileNoProceed().click();
			Thread.sleep(2000);
			 */			Thread.sleep(3000);
			 EditEmp.DistrictTextBox().sendKeys("Central Delhi");
			 Thread.sleep(3000);
			 EditEmp.DistrictTextBox().sendKeys("Central Delhi");
			 Thread.sleep(3000);
			 EditEmp.PresentAddressAsPermntCheckBox().click();
			 Thread.sleep(2000);
			 EditEmp.AddressDeclarationCheckBox().click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("Update_family_det")).click();
			 Thread.sleep(2000);
			 EditEmp.AddressCloseBtn().click();
			 driver.switchTo().window(Parent3);
			 Thread.sleep(5000);
		
	}



	// Details of Nominee
	@Test(priority = 5)
	public void EditDetailsOfNomnee() throws InterruptedException {
		
			EditEmp = new EditEmployee(driver);

			String Parent1 = driver.getWindowHandle();
			EditEmp.NomineeDetailsRadioBtn().click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
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


			EditEmp.UserNameTxtBx().sendKeys("Test");
			Thread.sleep(2000);
			EditEmp.RelationShipWithIp().sendKeys("Spouse");
			Thread.sleep(2000);
			EditEmp.IpAddress().sendKeys("Bengal");
			Thread.sleep(2000);
			EditEmp.StateDrpDwn().sendKeys("West Bengal");
			
			Thread.sleep(2000);
			Reg.DistrictDrpDwn().sendKeys("Darjeeling");
			Thread.sleep(2000);

			Reg.DistrictDrpDwn().sendKeys("Darjeeling");
			Thread.sleep(2000);
			EditEmp.PinCode().sendKeys("101010");
			Thread.sleep(2000);
			EditEmp.DeclarationCheckBox().click();
			Thread.sleep(2000);
		    EditEmp.UpdateBtn().click();
			Thread.sleep(2000);
			EditEmp.CloseBtn().click();
			Thread.sleep(5000);

			driver.switchTo().window(Parent1);
			Thread.sleep(5000);
	
	}


	@Test(priority = 6)
	public void EditFamilyInsuredPerson() throws InterruptedException {
		
			EditEmp = new EditEmployee(driver);


			// Family Particulars of InsuredPerson
			EditEmp.FamilyDetailsRadioBtn().click();
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
			EditEmp.FamilyDetailsNameTxtBx().sendKeys("test wife");
			Thread.sleep(2000);
			EditEmp.FamilyDetailsDOB().click();
			Thread.sleep(2000);
			EditEmp.FamilyDetailsSelectTitle().click();
			Thread.sleep(1000);
			EditEmp.FamilyDetailsSelectTitle().click();
			Thread.sleep(1000);
			EditEmp.FamilyDetailsPreviosBtn().click();
			Thread.sleep(1000);
			EditEmp.FamilyDetailsPreviosBtn().click();
			Thread.sleep(1000);
			EditEmp.FamilyDetailsSelectYear().click();
			Thread.sleep(1000);
			EditEmp.FamilyDetailsSelectMonth().click();
			Thread.sleep(1000);
			EditEmp.FamilyDetailsSelectDay().click();
			Thread.sleep(2000);
			EditEmp.FamilyDetailsRelationDrpDwn().sendKeys("Spouse");
			Thread.sleep(2000);
			EditEmp.FamilyDetailsNoRadioBtn().click();
			Thread.sleep(2000);
			EditEmp.FamilyDetailsPermanentStateDrpDwn().sendKeys("Madhya Pradesh");
			Thread.sleep(3000);
			EditEmp.FamilyDetailsPermanentDistrictDrpDwn().sendKeys("Damoh");
			Thread.sleep(2000);
			EditEmp.FamilyDetailsPermanentDistrictDrpDwn().sendKeys("Damoh");
			Thread.sleep(2000);
		    EditEmp.AddButton().click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("dec_chkbox_fam")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ctrlButtonSave")).click();
			EditEmp.close().click();
			//Reg.Submit().click();

			Thread.sleep(1000);

			driver.switchTo().window(Parent1);
			Thread.sleep(5000);
	}



	@Test(priority = 7)
	public void EditDetailsofBankAccountsofInsuredPerson() throws InterruptedException {
	
			EditEmp = new EditEmployee(driver);
			// Details of Bank Accounts of Insured Person

			EditEmp.BankDetailsRadioBtn().click();
			Thread.sleep(2000);
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
			EditEmp.IFSCcodeTextBox().sendKeys("UBIN0561258");

			EditEmp.IFSCcodeSeasrchBtn().click();

			Thread.sleep(3000);

			EditEmp.AccountNoTextBox().sendKeys("1234009871243674");

			Thread.sleep(2000);

			EditEmp.AccountTypeDrpDwn().sendKeys("Savings");;
			Thread.sleep(2000);
		//	EditEmp.BankDetailsSubmitBtn().click();
		//	EditEmp.BankDetailsCancelBtn().click();
			Thread.sleep(2000);
			driver.switchTo().window(Parent3);

			Thread.sleep(2000);

		//	EditEmp.termscondition().click();

			//	EditEmp.submit().click();

	}

/*
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}*/
	 

}
