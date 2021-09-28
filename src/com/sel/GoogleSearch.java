package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement clck = driver.findElement(By.xpath("//input[@title='Search']"));
		clck.click();
		Thread.sleep(2000);
		WebElement userTxt = driver.findElement(By.xpath("//input[@title='Search']"));
		userTxt.sendKeys("wildlife photography");
		 
         
	}

}
