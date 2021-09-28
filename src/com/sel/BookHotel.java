package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		String url = ("https://adactin.com/HotelApp/Register.php") ;
		driver.get(url);
		WebElement userTxt = driver.findElement(By.id("username"));
		userTxt.sendKeys("bala28");
		WebElement passTxt = driver.findElement(By.name("password"));	
		 passTxt.sendKeys("0321456");
	}

}
