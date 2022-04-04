package com.qa.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserfactory {
	
	public static FirefoxDriver driver;

	public static FirefoxDriver LaunchBrowser() throws IOException {
		
		if (Browserfactory.driver == null) {
		//	WebDriverManager.firefoxdriver().setup();
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver","D:\\");
			driver = new FirefoxDriver();
			
			driver.get(ReusableFunction.getValue("url2"));
			
			driver.manage().window().maximize();
		
			System.out.println("Property:"+ReusableFunction.getValue("url2"));
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;
	}


}
