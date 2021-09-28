package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanunchWebPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/"); 
        driver.manage().window().maximize();
        Thread.sleep(2000);
       
      WebElement clck = driver.findElement(By.xpath("(//div[contains(text(),' Green ')])[2]"));
      clck.;
      Thread.sleep(2000);
	}

}