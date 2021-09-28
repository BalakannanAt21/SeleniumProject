package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement clk =driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		clk.click();
		Thread.sleep(3000);
		WebElement clck =driver.findElement(By.xpath("//a[contains(text(),'Create your ')]"));
		clck.click();
		Thread.sleep(3000);
		WebElement userTxt =driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		userTxt.sendKeys("Bala");
		WebElement usrTxt =driver.findElement(By.xpath("//input[@name='email']"));
		usrTxt.sendKeys("9876543210");
		WebElement uerTxt =driver.findElement(By.xpath("//input[@tabindex='4']"));
		uerTxt.sendKeys("Bala123@gmail.com");
		WebElement usTxt =driver.findElement(By.xpath("//input[@tabindex='5']"));
		usTxt.sendKeys("Bala123@");
	}
}
