package com.programs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniProject2_Automation {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
		WebDriver project = new ChromeDriver();
		project.get("http://automationpractice.com/index.php");
		project.manage().window().maximize();
		WebElement signin = project.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		//Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) project;
		js.executeScript("window.scrollBy(0, 5000)");
		WebElement email = project.findElement(By.id("email"));
		email.sendKeys("jaisree.16@gmail.com");
		WebElement passwd = project.findElement(By.id("passwd"));
		passwd.sendKeys("jaideepijai");
		WebElement signin1 = project.findElement(By.id("SubmitLogin"));
		signin1.click();
		WebElement dresses = project.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		dresses.click();
		JavascriptExecutor js1 = (JavascriptExecutor) project;
		js1.executeScript("window.scrollBy(0, 1500)");
		WebElement choose = project.findElement(By.xpath("//*[@id='category']/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div/div/a/img"));
		choose.click();
		WebElement green1 = project.findElement(By.name("Green"));
		green1.click();
	    WebElement cart1 = project.findElement(By.xpath("(//span[text()='Add to cart'])"));
	    cart1.click();
	
		/*
		 * TakesScreenshot dress = (TakesScreenshot) project; File src =
		 * dress.getScreenshotAs(OutputType.FILE); File des = new File(
		 * "C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\screenshots\\dress.png"
		 * ); FileUtils.copyFile(src, des);
		 */
	    
	   
	}
}
