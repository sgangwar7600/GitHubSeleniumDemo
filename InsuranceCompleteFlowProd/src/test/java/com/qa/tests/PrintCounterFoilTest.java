package com.qa.tests;

import java.awt.AWTException;
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
import com.qa.pages.PrintCounterFoilPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;

public class PrintCounterFoilTest  extends Browserfactory{
	
	SoftAssert as =new SoftAssert();
	WebDriver driver;
	
	LoginPage log;
	PrintCounterFoilPage PCFP;
	
	
	@Test(priority=1)
	public void LoginforPrintCounterFoil() throws InterruptedException, IOException {
	
		driver = Browserfactory.LaunchBrowser();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 log=new LoginPage(driver);
		
		  log.UserId().sendKeys(ReusableFunction.getValue("uid"));
	
		  log.Login().click();
		 
	     log.roRajendraPalce().click();
		   
	    log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")), "Dealing Assistant (Registration)");
		   
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
         
         log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Dealing Assistant (Registration)");
         
         log.buttonsubmit().click();
	  
	*/
		   
	}
	
	
	@Test(priority=2)
	public void PrintCounterFoil()throws InterruptedException, IOException, AWTException{
		PCFP=new PrintCounterFoilPage(driver);
		PCFP.doNavigateToPrintCounterFoilPage(ReusableFunction.getValue("EmployersCode"));
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	 
	

}
