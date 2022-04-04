package com.qa.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.InspectionPage;
import com.qa.pages.LoginPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;
import com.qa.util.Utility;

public class InspectionTest extends Browserfactory{

	SoftAssert as =new SoftAssert();
	WebDriver driver;
	Utility utilobj = new Utility();
	LoginPage log;
	InspectionPage IP;


	@Test(priority=1)
	public void LoginforInspection() throws InterruptedException, IOException {

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

         log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Dealing Assistant (Revenue)");

         log.buttonsubmit().click();

		 */	}



	@Test(priority=2)
	public void Inspection() throws InterruptedException, IOException{
		IP=new InspectionPage(driver);
		IP.Close().click();
		//UWP_SC15
		/*	utilobj.MoveElement(IP.Revenue(), driver);
		Thread.sleep(2000);	
		utilobj.MoveElement(IP.Inspection(), driver);
		Thread.sleep(2000);	
		IP.UWP_SC15().click();
		Thread.sleep(2000);	
		IP.EmpoyerCode().sendKeys("11000000000000002");
		Thread.sleep(2000);	
		IP.UnitType().sendKeys("Main Unit");
		Thread.sleep(2000);	
		IP.ViewBtn().click();
		Thread.sleep(2000);	
		 */
		//UWPScrutinizeInspectionReport	
		utilobj.MoveElement(IP.Revenue(), driver);	
		Thread.sleep(2000);	
		utilobj.MoveElement(IP.Inspection(), driver);
		Thread.sleep(2000);	
		IP.UWPScrutinizeInspectionReport().click();
		Thread.sleep(2000);	
		IP.UnitType().sendKeys("Main Unit");
		Thread.sleep(2000);	
		/*IP.InspectionReportDrpDwn().sendKeys("ID - Inspection Area No 10");
		Thread.sleep(2000);	
		IP.BranchOfficeDrpDwn().sendKeys("BO - Ajmeri Gate");
		Thread.sleep(2000);	
		IP.EmployerCodeTxtBx().sendKeys(FromEmployerCode);
		 */Thread.sleep(2000);	
		 IP.SearchBtn().click();
		 Thread.sleep(2000);	
		 IP.UWPScrutinizeInspectionReportLink().click();
		 Thread.sleep(2000);	
		 IP.NextBtn().click();
		 Thread.sleep(2000);
		 IP.DARemarksTxtBx().sendKeys("DA Remarks");
		 IP.NextBtn2().click();
		 Thread.sleep(2000);	
		 IP.RemarksTxtBx().sendKeys("Test");
		 Thread.sleep(2000);	
		 IP.ForwardBtn().click();
	}
	@Test(priority = 3)
	public void SuperintendentLoginforInspection() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("RO-Rajendra Place");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Superintendent");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Superintendent");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}


	@Test(priority=4)
	public void InspectionSuperIntendentLogin() throws InterruptedException, IOException{
		IP=new InspectionPage(driver);
		IP.Close().click();
		//UWPScrutinizeInspectionReport	
		utilobj.MoveElement(IP.Revenue(), driver);	
		Thread.sleep(2000);	
		utilobj.MoveElement(IP.Inspection(), driver);
		Thread.sleep(2000);	
		IP.UWPScrutinizeInspectionReport().click();
		Thread.sleep(2000);	
		IP.UnitType().sendKeys("Main Unit");
		Thread.sleep(2000);	
		/*IP.InspectionReportDrpDwn().sendKeys("ID - Inspection Area No 10");
		Thread.sleep(2000);	
		IP.BranchOfficeDrpDwn().sendKeys("BO - Ajmeri Gate");
		Thread.sleep(2000);	
		IP.EmployerCodeTxtBx().sendKeys(FromEmployerCode);
		 */Thread.sleep(2000);	
		 IP.SearchBtn().click();
		 Thread.sleep(2000);	
		 IP.UWPScrutinizeInspectionReportLink().click();
		 Thread.sleep(2000);	
		 IP.NextBtn().click();
		 Thread.sleep(2000);
		 IP.SPRemarksTxtBx().sendKeys("SO Remarks");
		 IP.NextBtn2().click();
		 Thread.sleep(2000);	
		 IP.RemarksTxtBx().sendKeys("Test");
		 Thread.sleep(2000);	
		 IP.ForwardBtn().click();
	}

	@Test(priority = 5)
	public void RBOLoginforInspection() throws InterruptedException, IOException {

		Thread.sleep(2000);
		driver.navigate().to("http://10.30.26.51/InsuranceGlobalWebV1/Login/StaffLogin1.aspx");
		driver.findElement(By.id("ctl00_HomePageContent1_login")).sendKeys("userda11");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_HomePageContent1_Button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlLocation']")).sendKeys("RO-Rajendra Place");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Revenue Branch Officer");
		driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")).sendKeys("Revenue Branch Officer");
		driver.findElement(By.id("ctl00_stfMasterContent_btnSubmit")).click();
	}

	
	@Test(priority=6)
	public void InspectionRBOLogin() throws InterruptedException, IOException{
		IP=new InspectionPage(driver);
		IP.Close().click();
		//UWPScrutinizeInspectionReport	
		utilobj.MoveElement(IP.Revenue(), driver);	
		Thread.sleep(2000);	
		utilobj.MoveElement(IP.Inspection(), driver);
		Thread.sleep(2000);	
		IP.UWPScrutinizeInspectionReport().click();
		Thread.sleep(2000);	
		IP.UnitType().sendKeys("Main Unit");
		Thread.sleep(2000);	
		/*IP.InspectionReportDrpDwn().sendKeys("ID - Inspection Area No 10");
		Thread.sleep(2000);	
		IP.BranchOfficeDrpDwn().sendKeys("BO - Ajmeri Gate");
		Thread.sleep(2000);	
		IP.EmployerCodeTxtBx().sendKeys(FromEmployerCode);
		 */Thread.sleep(2000);	
		 IP.SearchBtn().click();
		 Thread.sleep(2000);	
		 IP.UWPScrutinizeInspectionReportLink().click();
		 Thread.sleep(2000);	
		 IP.NextBtn().click();
		 Thread.sleep(2000);
		 IP.RBORemarksTxtBx().sendKeys("RBO Remarks");
		 IP.NextBtn2().click();
		 Thread.sleep(2000);	
		 IP.RemarksTxtBx().sendKeys("Test");
		 Thread.sleep(2000);	
		 //IP.ForwardBtn().click();
	}

	/*
 	@Test(priority = 7)
	public void ScrutinizeObservationNoteInspectionReport() throws InterruptedException, IOException {
	IP=new InspectionPage(driver);
	IP.Close().click();
	//ScrutinizeObservationNoteInspectionReport
    utilobj.MoveElement(IP.Revenue(), driver);
	Thread.sleep(2000);	
	utilobj.MoveElement(IP.Inspection(), driver);
	Thread.sleep(2000);	
	IP.ScrutinizeObservationNoteInspectionReport().click();
	Thread.sleep(2000);	
	IP.UnitType().sendKeys("Main Unit");
	Thread.sleep(2000);	
	IP.SearchBtn().click();*/
}


/*@AfterTest
	public void closeBrowser() {
		driver.quit();
	}*/


