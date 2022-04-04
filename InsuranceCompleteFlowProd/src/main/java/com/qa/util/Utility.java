package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.model.Test;

public class Utility {
	
	
	public void JSClick(WebElement element, WebDriver driver) {

		try {
			// element = driver.findElement(locator);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception ex) {
			System.out.println(ex);

		}
	}
	
		
	public void JSView(WebElement element, WebDriver driver) {

		try {
			// element = driver.findElement(locator);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView(true);",element);

		} catch (Exception ex) {
			System.out.println(ex);

		}
		
		
		}


		public void JSEnterText(WebElement element, WebDriver driver, String strData) {

			// element = driver.findElement(locator);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].value = '" + strData + "'", element);
		}

		public void ActionClick(WebElement element, WebDriver driver) {

			Actions act = new Actions(driver);

			// act.moveToElement(element).pause(1000).click().build().perform();

			// act.moveToElement(element).click().build().perform();

			act.click(element).perform();

		}

		public void rightClick(WebDriver driver, By locator, WebElement element) {

			element = driver.findElement(locator);

			Actions act = new Actions(driver);

			act.contextClick(element).build().perform();

		}

		public void MoveElement(WebElement element, WebDriver driver) {

			try {
				Actions mov = new Actions(driver);

				// waitForElement(locator, driver);

				mov.moveToElement(element);

				mov.build().perform();

			} catch (Exception e) {
				System.out.println("Not Able to Move");

				// logger("Steps","MoveElement", e);

			}
		}

		public void ChildWindow(WebDriver driver) {
			try {
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles();

				System.out.println(handles.size());

				Iterator<String> iterator = handles.iterator();

				while (iterator.hasNext()) {
					subWindowHandler = iterator.next();
				}
				driver.switchTo().window(subWindowHandler);

				System.out.println(driver.getTitle());
			} catch (Exception e) {
				System.out.println("Winow not handled");

				// logger("Steps","Window", e);

			}
		}

		public void SwitchToChildWindow(WebDriver driver, String windowtitle) {
			try {
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles();

				System.out.println(handles.size());

				Iterator<String> iterator = handles.iterator();

				while (iterator.hasNext()) {
					subWindowHandler = iterator.next();
					driver.switchTo().window(subWindowHandler);
					System.out.println(driver.getTitle());
					if (driver.getTitle().trim().equals(windowtitle)) {
						break;
					}
					;

				}

				System.out.println(driver.getTitle());
			} catch (Exception e) {
				System.out.println("Winow not handled");

				// logger("Steps","Window", e);

			}
		}

		public void Window(WebDriver driver) {
			try {
				((JavascriptExecutor) driver).executeScript("window.showModalDialog =window.open;");

				System.out.println("Modal pop window converted to Normal window");
			} catch (Exception e) {
				System.out.println("Modal pop window not converted to Normal window");
			}
		}

				public void ChildWindow2(WebDriver driver) {
			try {
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles();

				System.out.println(handles.size());

				Iterator<String> iterator = handles.iterator();

				while (iterator.hasNext()) {
					subWindowHandler = iterator.next();
					driver.switchTo().window(subWindowHandler);
				}
				

				System.out.println(driver.getTitle());
			} catch (Exception e) {
				System.out.println("Winow not handled");

				// logger("Steps","Window", e);

			}
		}

		
		public void ChildWindowSwitch(WebDriver driver, By locators) {
			try {
				String subWindowHandler = null;
				String paWindow = driver.getWindowHandle();
				Set<String> handles = driver.getWindowHandles();
				System.out.println(handles.size());

				Iterator<String> iterator = handles.iterator();

				while (iterator.hasNext()) {
					subWindowHandler = iterator.next();
					if(!paWindow.equals(subWindowHandler)) {
					driver.switchTo().window(subWindowHandler);
					System.out.println(driver.getTitle());
					
					int elecount = driver.findElements(locators).size();
					if(elecount==1) {
						break;
					}
					
					else {
						continue;
					}
					
					}

				}

				System.out.println(driver.getTitle());
			} catch (Exception e) {
				System.out.println("Winow not handled");

				// logger("Steps","Window", e);

			}
		}


		public String GetCheckinNumberText(WebElement strElement, WebDriver driver) {
			String strtext = strElement.getText();
			String strtextcheckin[] = strtext.split(" ");

			String Checkinnumber = strtextcheckin[2];

			return Checkinnumber;

		}

		public void selectDropdown(WebElement strElement, WebDriver driver, String strData) {
			try {

				Select dropdownValue = new Select(strElement);

				dropdownValue.selectByVisibleText(strData);

			}

			catch (Exception e) {
				System.out.println("Dropdown hasn't selected");

				// logger("Steps","selectDropdown", e);

			}

		}

		public void selectDropdownValue(List<WebElement> strElement, WebDriver driver, String strData) {
			try {
				/*
				 * //wait ForElement(strElement);
				 * 
				 * //Hashtable ht = new Hashtable(); System.out.println(strElement.getText());
				 * 
				 * Select dropdownValue = new Select(strElement); //
				 * dropdownValue.deselectAll();
				 * 
				 * dropdownValue.selectByValue(strData);
				 * 
				 */
//				/List<WebElement> ls = strElement.size();
				
				int lssize = strElement.size();
				
				for(int i=0;i<lssize;i++) {
					System.out.println(strElement.get(i).getText());
					if(strElement.get(i).getText().equalsIgnoreCase(strData))
					{
						strElement.get(i).click();
						break;
					}
				}
				

			}

			catch (Exception e) {
				System.out.println("Dropdown hasn't selected");

				// logger("Steps","selectDropdown", e);

			}

		}

		/*
		 * public void waitForElement(WebElement strElement) { try { for (int i=0;
		 * i<120; i++) { strElement.isDisplayed(); Thread.sleep(2000); break; } }
		 * 
		 * catch (Exception e) { System.out.println("Not Able to Find Element");
		 * 
		 * //logger("Steps","waitForElement", e);
		 * 
		 * } }
		 */
		
		public void waitForalert(WebDriver driver) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.alertIsPresent());
			}

			catch (Exception e) {
				System.out.println("Not Able to Find Element");


			}
		}


		public void scroolDown(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");
			
		}
		
	
		public String getScreenshot(WebDriver driver, String screenshotName) {
			String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			String destination=System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName + ".png";
			
		       
			File finalDestination=new File(destination);
			try{
			FileUtils.copyFile(source, finalDestination);
			}
			catch(IOException e){
				System.out.println("Capture Failed" +e.getMessage());
			}
			return destination;
			
		}
	

	

	
}