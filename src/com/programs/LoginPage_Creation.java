package com.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_Creation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://auth.uber.com/login/?breeze_local_zone=phx3&next_url=https%3A%2F%2Fm.uber.com%2F&state=JzeXzmdDpQqXFXfP3CiDNRSz95MuSkOZLmersBD8K88%3D");
		driver.manage().window().maximize();

		WebElement number = driver.findElement(By.id("mobile"));
		number.sendKeys("6369776265");
		WebElement next = driver.findElement(By.id("next-button"));
		next.click();
		
		
		
	}

}
