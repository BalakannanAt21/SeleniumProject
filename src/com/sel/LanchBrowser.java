package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement userTxt = driver.findElement(By.name("q"));
		userTxt.sendKeys("perriyarism");
		
	}
}
