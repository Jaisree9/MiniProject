package com.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=iphone&crid=252DCPTM1W43C&sprefix=iph%2Caps%2C1244&ref=nb_sb_ss_ts-doa-p_3_3");
		driver.manage().window().maximize();
		
		WebElement sample1 = driver.findElement(By.xpath("//*[@id='search']/div/div/div/span[3]/div[2]/div[5]/div/div/div/div/div/div/div/div/div/span/a/div/img"));
		sample1.click();
		
		Thread.sleep(3000);
		
	
	}

}
