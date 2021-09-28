package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormRegisterdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get(" https://toolsqa.com/automation practice-form");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		 clk.click();
		 Thread.sleep(2000);
		 WebElement clck = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		 clck.click();
	}

}
