package com.programs;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_Program {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	WebElement simple = driver.findElement(By.xpath("//button[@onclick= 'normalAlert()']"));
	simple.click();
	Thread.sleep(2000);
	Alert simplealert = driver.switchTo().alert();
	simplealert.accept();
	WebElement confirm = driver.findElement(By.xpath("//button[@onclick= 'confirmAlert()']"));
	confirm.click();
	Thread.sleep(2000);
	Alert confirmalert = driver.switchTo().alert();
	confirmalert.dismiss();
	WebElement prompt = driver.findElement(By.xpath("//button[@onclick= 'confirmPrompt()']"));
	prompt.click();
	Thread.sleep(2000);
	Alert promptalert = driver.switchTo().alert();
	Thread.sleep(2000);
	promptalert.sendKeys("xxx");
	String text = promptalert.getText();
	System.out.println(text);
	promptalert.accept();
	}
}
