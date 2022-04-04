package com.qa.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.LoginPage;
import com.qa.pages.RecoveryManualPaymentPage;
import com.qa.util.Browserfactory;
import com.qa.util.ReusableFunction;

public class RecoveryManualPaymentTest extends Browserfactory{
	
	SoftAssert as =new SoftAssert();
	WebDriver driver;
	
	LoginPage log;
	RecoveryManualPaymentPage RMPP;
	
	
	@Test(priority=1)
	public void Login() throws InterruptedException, IOException{
	
		driver = Browserfactory.LaunchBrowser();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 log=new LoginPage(driver);
		 
		
		
		  log.UserId().sendKeys(ReusableFunction.getValue("uid"));
		
	     log.Login().click();
		 
	     log.roRajendraPalce().click();
		   
	    log.Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")), "Recovery Officer");
		   
	   log.Login1().click();
	    
	    //For Productiongul
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
         
         log.Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Recovery Officer");
         
         log.buttonsubmit().click();
	  
*/	
	   
	}
	
	@Test(priority=2)
	public void RecoveryManualPayment() throws InterruptedException, IOException{
		RMPP=new RecoveryManualPaymentPage(driver);
		RMPP.doNavigateToRecoveryManualPayment(ReusableFunction.getValue("EmployersCode"));
	}


}
