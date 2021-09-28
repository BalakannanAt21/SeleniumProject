package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineDelivery {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.snapdeal.com/login");
		driver.get(url);
		WebElement userTxt = driver.findElement(By.id("userName"));
		userTxt.sendKeys("bala123");
		
		
	}

}
