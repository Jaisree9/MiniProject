package com.programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Actions {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		
		  WebElement src = driver.findElement(By.id("draggable")); WebElement des =
		  driver.findElement(By.id("droppable"));
		  
		  Actions ac = new Actions(driver); 
		  ac.dragAndDrop(src,des).build().perform();
		  ac.dragAndDropBy(src,10,30).build().perform();
		  ac.clickAndHold(src).moveToElement(des).build().perform();
		
		
		driver.navigate().to("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']")); 
		Robot rt = new Robot();
		ac.contextClick(gmail).build().perform();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
