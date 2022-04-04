package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.ReusableFunction;

public class LoginPage {
	
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id="ctl00_HomePageContent1_login")
	WebElement UserId;
//	
//	@FindBy(id="IDToken1")
//	WebElement username;
//	
//	@FindBy(id="IDToken2")
//	WebElement password;
	
	@FindBy(id="ctl00_HomePageContent1_Button1")
	WebElement Login;
	
	@FindBy(id="ctl00_stfMasterContent_btnSubmit")
	WebElement Login1;
	
	@FindBy(xpath=".//*[@id='ctl00_stfMasterContent_ddlLocation']/option[31]")
	WebElement roRajendraPalce;
	
	
	@FindBy(xpath=".//*[@id='ctl00_stfMasterContent_ddlLocation']")
	WebElement UserLocation;
	
	//For Production
	
	@FindBy(id="IDToken1")
	WebElement username;
	
	@FindBy(id="IDToken2")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='navigation']/ul/li[2]/a")
	WebElement Application;
	
	@FindBy(xpath=".//*[@class='Btn1Def']")
	WebElement login2;
	
	@FindBy(xpath=".//*[@id='navigation']/ul/li[2]/ul/li[2]/a")
	WebElement Insurance;
	
	@FindBy(id="btnSubmit")
	WebElement buttonsubmit;
	
	public void Select_List(WebElement element, String text) throws InterruptedException {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}
	
	public  void drpdwn1() {
	      Select drop = new Select(UserLocation);
	      drop.selectByValue("11") ; 
	}
	
	
//	public WebElement userName(){
//		return username;
//	}
//	
//	public WebElement password(){
//		return password;
//		
//	}
	
	
	
	public WebElement UserId(){
		return UserId;
	}
	
	public WebElement  Login(){
		return Login;
	}
	
	public WebElement Login1(){
		return Login1;
	}
	
	
	
	public WebElement roRajendraPalce(){
		return roRajendraPalce;
	}
	
	//For production
	
	 public WebElement username(){
		return username;
	}
	
	public WebElement password(){
		return password;
		
	}
	
	public WebElement Application(){
		
		return Application;
	}
	
	public WebElement Insurance(){
		return Insurance;
	}
	
	public WebElement login2(){
		return login2;
	}
	
	public WebElement buttonsubmit(){
		return buttonsubmit;
	}

	public void doNavigateToLoginPage(String string) {
		try{
			  /*UserId().sendKeys(ReusableFunction.getValue("uid"));
				
				 Login().click();
				 
			     roRajendraPalce().click();
				   
			    Select_List(driver.findElement(By.xpath(".//*[@id='ctl00_stfMasterContent_ddlRole']")), "Dealing Assistant (Registration)");
				   
			    Login1().click();*/
			    
			    //For Production
				
					
				  username().sendKeys(ReusableFunction.getValue("uidd"));
					
					password().sendKeys(ReusableFunction.getValue("pwd"));
					
				   	login2().click();
					
					Application().click();
					
					Insurance().click();
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

			         Select_List(driver.findElement(By.xpath(".//*[@id='ddlLocation']")), "RO-Rajendra Place");
			         
			         Thread.sleep(1000);
			         
			         Select_List(driver.findElement(By.xpath(".//*[@id='ddlRole']")), "Dealing Assistant (Registration)");
			         
			         buttonsubmit().click();
				  
			
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
	}

	
	 

}
