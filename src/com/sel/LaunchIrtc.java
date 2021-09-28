package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchIrtc {
	public static void main(String[] args) throws InterruptedException {
                   System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
                   WebDriver driver = new ChromeDriver();
                   String url = ("https://www.irctc.co.in/nget/train-search");
                   driver.get(url);
                   WebElement Clk = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
                   Clk.click();
                   Thread.sleep(3000);
                   WebElement clk = driver.findElement(By.xpath("//a[text()=' REGISTER ']"));
                   clk.click(); 
                   Thread.sleep(2000);
                   WebElement userTxt = driver.findElement(By.xpath("//input[@id='userName']"));
                   userTxt.sendKeys("Bala");
                   WebElement passTxt = driver.findElement(By.xpath("//input[@id='usrPwd']"));
                   passTxt.sendKeys("Bala123");
                   WebElement cPass = driver.findElement(By.xpath("//input[@id='usrPwd']"));
                   cPass.sendKeys("Bala123"); 
	}

}
