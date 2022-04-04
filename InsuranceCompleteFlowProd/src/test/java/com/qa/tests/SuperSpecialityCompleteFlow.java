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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.BenifitsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.SuperSpecialty;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;

public class SuperSpecialityCompleteFlow extends Browserfactory {

	SoftAssert as = new SoftAssert();
	WebDriver driver;
	String ClaimId;

	@BeforeTest
	public void LaunchURL() throws IOException {
		driver = Browserfactory.LaunchBrowser();

	}

	@Test(priority = 1)
	public void LoginforSST() throws InterruptedException, IOException {
	
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

			as.assertEquals(driver.getTitle(), "Insurance");

			
			
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

			log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlLocation']")), "BO-Ajmeri Gate");

			Thread.sleep(1000);

			log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "LDC/UDC at Branch Office");

			log.buttonsubmit().click();
			//as.assertEquals(driver.getTitle(), "Insurance");
*/
	}

	@Test(priority = 2)
	public void SSTClaim() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();

		benpg.InsureNumber().sendKeys("1199900090");

		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"SuperSpeciality");

		benpg.submit().click();

		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void SST() throws InterruptedException {

		SuperSpecialty SST = new SuperSpecialty(driver);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("document.getElementById('ctl00_HomePageContent_txtRelaxRequestDate').value='01/06/2021'");
		Thread.sleep(2000);
		SST.NameofDesies().sendKeys("Test Disease");
		Thread.sleep(2000);
		SST.MedisuperName().sendKeys("Mr Test Medical Superintendent");

		SST.Reason().sendKeys("Test");

		SST.Remark().sendKeys("Test");
		Thread.sleep(2000);
		SST.submit().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		ClaimId=driver.findElement(By.id("ctl00_HomePageContent_claimIDlbl")).getText();
		System.out.println(ClaimId);
		

	}
	
	@Test(priority = 4)
	public void ROLoginforSST() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("RO-Rajendra Place");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Regional Director ");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Regional Director ");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}
	
	@Test(priority = 5)
	public void SSTROLogin() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			SuperSpecialty SST = new SuperSpecialty(driver);
			
			SST.ProcessAClaim().click();
			SST.SSTClaimProcessingLink().click();
			driver.findElement(By.linkText(ClaimId)).click();
			SST.NextBtn().click();
			
			SST.RemarksTxtBx().sendKeys("Test");
			
			SST.ROApproveBtn().click();
	}

}
