package com.qa.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.BenifitsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.PDBClaimPage;
import com.qa.pages.PDBClaimProcessingPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;

public class PDBPeriodicalFlowDelayCase extends Browserfactory{
	
	SoftAssert as = new SoftAssert();
	WebDriver driver;
	String ClaimId;

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

*/
		as.assertEquals(driver.getTitle(), "Insurance");
}

	@Test(priority = 2)
	public void PDBPeriodicalCreateClaim() throws InterruptedException {

		BenifitsPage benpg = new BenifitsPage(driver);

		benpg.Close().click();

		WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		// Enter Insured Number
		benpg.CreateAnewClaimRequest().click();
		Thread.sleep(2000);
		benpg.InsureNumber().sendKeys("1199900090");// 
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_HomePageContent_ddlClaimType']")),
				"Permanent Disablement Benefit");
		Thread.sleep(2000);
		
		benpg.Select_List(driver.findElement(By.id("ctl00_HomePageContent_ddlClaimSubType")),
				"PDB - Periodical Claim");
		Thread.sleep(2000); 
		
		PDBClaimPage PDB= new PDBClaimPage(driver);
		Thread.sleep(2000);
		PDB.Submit().click();
		Thread.sleep(2000);
		benpg.Select_List(driver.findElement(By.id("ctl00_HomePageContent_esicddlDate")), "03-05-2019");
		Thread.sleep(2000);
		PDB.Browse().sendKeys("C:\\Users\\User\\Downloads\\11000000000000003.pdf");
		Thread.sleep(2000);
		PDB.Submit1().click();
		//PDB.Cancel().click();
		
		Thread.sleep(2000);
		String strtext = driver.findElement(By.id("ctl00_HomePageContent_iblmsg1")).getText();
		String strtextClaimId[] = strtext.split(" ");

		 ClaimId = strtextClaimId[2];
		System.out.println(ClaimId);
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun3']/table/tbody/tr/td/a/img"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(1000);
		
		PDBClaimProcessingPage PDBCP= new PDBClaimProcessingPage(driver);
		
		PDBCP.ProcessAClaim().click();
		
		PDBCP.PDBClaimProcessingLink().click();
		
	//	PDBCP.Page2().click();
		
		driver.findElement(By.linkText(ClaimId)).click();
		
		PDBCP.NextBtn().click();
		
		PDBCP.NextBtn().click();
		
		PDBCP.RemarksTxtBx().sendKeys("Test Test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent_submit")).click();
		
		Thread.sleep(2000);
		
		//PDBCP.CancelBtn().click();
		
	}
	
	@Test(priority = 3)
	public void BMLoginforPDB() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}

	@Test(priority = 4)
	public void PDBPeriodicalClaimProcessingBMLogin() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			
			PDBClaimProcessingPage 
			PDBPCP= new PDBClaimProcessingPage(driver);
			
			PDBPCP.ProcessAClaim().click();
			
			
			PDBPCP.PDBClaimProcessingLink().click();
			
			driver.findElement(By.linkText(ClaimId)).click();
			
			PDBPCP.NextBtnClaim().click();
			
			PDBPCP.NextBtnClaim().click();
			
		//	PDBPCP.BrowseBtnClaim().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");//For late
			
			PDBPCP.RemarksTxtBxClaim().sendKeys("Test Test");
			
			//PDBPCP.ClaimRejectBtn().click();
			Thread.sleep(2000);
			PDBPCP.BMApproveBtn().click();
			driver.switchTo().alert().accept();
//			PDBPCP.ClaimCancelBtn().click();
}
	
	@Test(priority = 5)
	public void BBOLoginforPDB() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("RO-Rajendra Place");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Benefits Branch Officer");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Benefits Branch Officer");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}
	
	@Test(priority = 6)
	public void PDBPeriodicalClaimProcessingBBOLogin() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			
			PDBClaimProcessingPage PDBPCP= new PDBClaimProcessingPage(driver);
			
			PDBPCP.ProcessAClaim().click();
			
			
			PDBPCP.PDBClaimProcessingLink().click();
			
			driver.findElement(By.linkText(ClaimId)).click();
			
			
			PDBPCP.NextBtnClaim().click();
			
			PDBPCP.NextBtnClaim().click();
			 
			PDBPCP.RemarksTxtBxClaim().sendKeys("Test Test");
			
			//PDBPCP.ClaimRejectBtn().click();
			Thread.sleep(2000);
			PDBPCP.ApproveBtnBBO().click();
			
		//	PDBPCP.ClaimCancelBtn().click();
}
	@Test(priority = 7)
	public void BMLoginforPDBDocketGeneration() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("BO-Ajmeri Gate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Branch Manager at Branch Office");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}
	
	@Test(priority = 8)
	public void PDBPeriodicalClaimDocketGenerationBMLogin() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			BenifitsPage benpg = new BenifitsPage(driver);

			benpg.Close().click();

			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_NavigationMenun2']/table/tbody/tr/td/a/img"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			Thread.sleep(1000);
			
			PDBClaimProcessingPage PDBPCP= new PDBClaimProcessingPage(driver);
			
			PDBPCP.ProcessAClaim().click();
			
			
			PDBPCP.PDBClaimProcessingLink().click();
			
			driver.findElement(By.linkText(ClaimId)).click();
			
			PDBPCP.NextBtnClaim().click();
			
			PDBPCP.NextBtnClaim().click();
			
		//	PDBPCP.BrowseBtnClaim().sendKeys("C:\\Users\\User\\Downloads\\WhatsApp Image 2021-05-24 at 2.04.22 PM.jpeg");//For late
			
			PDBPCP.RemarksTxtBxClaim().sendKeys("Test Test");
			
			//PDBPCP.ClaimRejectBtn().click();
			Thread.sleep(2000);
			
			
		//	PDBPCP.ClaimCancelBtn().click();
}
	

}
