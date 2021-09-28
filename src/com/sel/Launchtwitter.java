package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchtwitter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://twitter.com/LOGIN");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement userTxt = driver.findElement(By.name("session[username_or_email]"));
		userTxt.sendKeys("youtube");
		WebElement  passTxt = driver.findElement(By.name("session[password]"));
		passTxt.sendKeys("pass");
		}

	
}


