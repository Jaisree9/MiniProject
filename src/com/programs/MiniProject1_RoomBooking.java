package com.programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject1_RoomBooking {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\driver\\chromedriver.exe");
		WebDriver project = new ChromeDriver();
		project.get("https://adactinhotelapp.com/index.php");
		project.manage().window().maximize();
		WebElement username = project.findElement(By.id("username"));
        username.sendKeys("JaisreeM");
        WebElement password = project.findElement(By.name("password"));
        password.sendKeys("384G9D");
        WebElement login = project.findElement(By.id("login"));
        login.click();
        WebElement location = project.findElement(By.name("location"));
        location.click();
        Select l1 = new Select(location);
        l1.selectByVisibleText("Los Angeles");
        WebElement hotels = project.findElement(By.id("hotels"));
        hotels.click();
        Select l2 = new Select(hotels);
        l2.selectByIndex(2);
        WebElement roomtype = project.findElement(By.name("room_type"));
        roomtype.click();
        Select l3 = new Select(roomtype);
        l3.selectByIndex(4);
        WebElement roomno = project.findElement(By.name("room_nos"));
        roomno.click();
        Select l4 = new Select(roomno);
        l4.selectByIndex(3);
        WebElement checkindate = project.findElement(By.name("datepick_in"));
        checkindate.clear();
        checkindate.sendKeys("09/05/2022");
        WebElement checkoutdate = project.findElement(By.name("datepick_out"));
        checkoutdate.clear();
        checkoutdate.sendKeys("13/05/2022");
        WebElement adults = project.findElement(By.id("adult_room"));
        adults.click();
        Select l5 = new Select(adults);
        l5.selectByValue("2");
        WebElement children = project.findElement(By.xpath("//select[@name='child_room']"));
        children.click();
        Select l6 = new Select(children);
        l6.selectByIndex(0);
        WebElement search = project.findElement(By.name("Submit"));
        search.click();
        WebElement select = project.findElement(By.name("radiobutton_0"));
        select.click();
        WebElement continuee = project.findElement(By.xpath("//input[@type = 'submit']"));
        continuee.click();
        WebElement firstname = project.findElement(By.id("first_name"));
        firstname.sendKeys("Jaisree");
        WebElement lastname = project.findElement(By.id("last_name"));
        lastname.sendKeys("Keerthikumar");
        WebElement address = project.findElement(By.id("address"));
        address.sendKeys("Chennai");
        WebElement creditcard = project.findElement(By.id("cc_num"));
        creditcard.sendKeys("0123456689253267");
        WebElement cardtype = project.findElement(By.name("cc_type"));
        cardtype.click();
        Select l7 = new Select(cardtype);
        l7.selectByIndex(3);
        WebElement month = project.findElement(By.name("cc_exp_month"));
        month.click();
        Select l8 = new Select(month);
        l8.selectByIndex(10);
        WebElement year = project.findElement(By.name("cc_exp_year"));
        year.click();
        Select l9 = new Select(year);
        l9.selectByVisibleText("2022");
        WebElement cvv = project.findElement(By.name("cc_cvv"));
        cvv.sendKeys("000");
        WebElement booknow = project.findElement(By.name("book_now"));
        booknow.click();
       // TakesScreenshot hotelimg = (TakesScreenshot) project;
       // File sourceFile = hotelimg.getScreenshotAs(OutputType.FILE);
       // File desFile = new File("C:\\Users\\Admin\\eclipse-workspace\\Jaisree_Selenium_Projects\\screenshots\\hotel.png");
       // FileUtils.copyFile(sourceFile, desFile);
        
	}

}
