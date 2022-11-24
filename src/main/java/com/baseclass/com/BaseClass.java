package com.baseclass.com;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;




public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launch(String browser_name) {

		if (browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if (browser_name.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", 
					System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;
	}

	public static void driverClose() {
		driver.close();
	}

	public static void findElement(WebElement element, String action, String value) {
			if (action.equalsIgnoreCase("sendKeys")) {
				element.sendKeys(value);
			}
			else if (action.equalsIgnoreCase("click")) {
				element.click();
			}
			else if (action.equalsIgnoreCase("clear")) {
				element.clear();
				element.sendKeys(value);
			}
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void getCurrentUrl() {
		System.out.println("Current url: "+ driver.getCurrentUrl());
	}

	public static void getTitle() {
		System.out.println("Title: "+ driver.getTitle());
	}

	//	public int hashCode() {
	//		return 1;
	//		
	//	}

	public static void getpagesource() {
		System.out.println("Page Source: "+ driver.getPageSource());
	}

	public static void windowHandle() {
		System.out.println(driver.getWindowHandle());
	}

	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new LinkedList<String>(windowHandles);
		System.out.println(list);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}	

	public static void clear(String path) {
		WebElement findElement = driver.findElement(By.id(path));
		findElement.clear();
	}

	public static void driverQuit() {
		driver.quit();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void implicitWait(int unit, String timeunit) {
		if (timeunit.equalsIgnoreCase("milliseconds")) {
			driver.manage().timeouts().implicitlyWait(unit, TimeUnit.MILLISECONDS);
		}
		else if (timeunit.equalsIgnoreCase("seconds")) {
			driver.manage().timeouts().implicitlyWait(unit, TimeUnit.SECONDS);
		}
		else if (timeunit.equalsIgnoreCase("minutes")) {
			driver.manage().timeouts().implicitlyWait(unit, TimeUnit.MINUTES);
		}
		else if (timeunit.equalsIgnoreCase("hours")) {
			driver.manage().timeouts().implicitlyWait(unit, TimeUnit.HOURS);
		}
		
	}

	public static void switchToFrame(String byMethod, String value) {
		if (byMethod.equalsIgnoreCase("path")) {
			driver.switchTo().frame(value);
		}
		else if (byMethod.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt(value));
		}
	}

	public static void moveToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void comeOutOfAllFrames() {
		driver.switchTo().defaultContent();
	}





	public static void dropdown(WebElement elementName, String method, String value) {
		Select s = new Select(elementName);
		if (method.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
		else if (method.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else {
			s.selectByVisibleText(value);
		}
	}

	public static void popUp() {
		driver.switchTo().alert();
	}


	public static void windowHandle(String By) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new LinkedList<>(windowHandles);
		if (By.equalsIgnoreCase("Asc")) {
			for (int i = 0; i <= list.size()-1; i++) {
				driver.switchTo().window(list.get(i));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				windowMaximize();
				driverClose();
			}
		}
		if (By.equalsIgnoreCase("Desc")) {
			for (int i = list.size()-1; i >= 0; i--) {
				driver.switchTo().window(list.get(i));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				windowMaximize();
				driverClose();
			}
		}

	}
	
	public static void getScreenShot(String scenario_title) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+scenario_title+".png");
		FileUtils.copyFile(sourceFile, destFile);
	}
}




