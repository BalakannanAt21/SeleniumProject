package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTrip {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.cleartrip.com/trains "); 
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement userTxt = driver.findElement(By.xpath("//input[@id='from_station']"));
	    userTxt.click();
	    userTxt.sendKeys("Chennai Beach(MSB)");
	    WebElement usrTxt = driver.findElement(By.xpath("//input[@id='to_station']"));
	    usrTxt.sendKeys("kanyakumari(CAPE)");
	    WebElement usrTt = driver.findElement(By.xpath("//select[@id='trainClass']"));
	    usrTt.click();
	    usrTt.sendKeys("Sleeper (SL)");
	}
}
