package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchInsta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login");
		WebElement userTxt = driver.findElement(By.name("username"));
		userTxt.sendKeys("bala");
		WebElement passTxt = driver.findElement(By.className("_2hvTZ pexuQ zyHYP"));
		passTxt.sendKeys("0321456");
		
	}

}
