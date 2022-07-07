package com.programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions ac = new Actions(driver);
		ac.contextClick(Mobiles).build().perform();

		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(electronics).build().perform();

		Robot r11 = new Robot();
		r11.keyPress(KeyEvent.VK_DOWN);
		r11.keyRelease(KeyEvent.VK_DOWN);

		r11.keyPress(KeyEvent.VK_ENTER);
		r11.keyRelease(KeyEvent.VK_ENTER);
		/*
		 * Set<String> window = driver.getWindowHandles(); for (String id : window) {
		 * String title = driver.switchTo().window(id).getTitle();
		 * System.out.println(title); } String mytitle = for (String id : window) {
		 * if(driver.switchTo().window(id).getTitle().equals(mytitle)){ break; }
		 * 
		 * }
		 */
	}

}
