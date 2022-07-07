package com.programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executer {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.get("https://meesho.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3000);");
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(,-2000);");
			Thread.sleep(3000);
	}

}
