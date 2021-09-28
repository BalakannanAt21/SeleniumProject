package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvbBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		 Thread.sleep(2000);
		WebElement userTxt = driver.findElement(By.xpath("//input[@name='vb_login_username']"));
		userTxt.sendKeys("bala");
		WebElement usrTxt = driver.findElement(By.xpath("//input[@name='vb_login_password']"));
		usrTxt.sendKeys("bala");
		WebElement clk = driver.findElement(By.xpath("//input[@id='cb_cookieuser_navbar']"));
		clk.click();
		WebElement clck = driver.findElement(By.xpath("//input[@value='Log in']"));
		clck.click();
	}

}
