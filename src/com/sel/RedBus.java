package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get(" https://www.redbus.in/"); 
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement clk = driver.findElement(By.id("sign-in-icon-down"));
    clk.click();
   
    WebElement clck = driver.findElement(By.xpath("//class[text()='Sign In/Sign']"));
    clck.click();
    clck.sendKeys("9945613078");
   }
	
}